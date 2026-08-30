import { promises as fs } from "node:fs";
import path from "node:path";

import { discoverSysmlFiles } from "./discovery.js";
import { extractGumboContracts } from "./gumbo.js";
import {
  fingerprint,
  normalizeQualifiedName,
  occurrenceId,
  semanticId,
  stableHash,
} from "./identity.js";
import { isTrivia, lex, type Token } from "./lexer.js";
import { SourceMap } from "./source.js";
import type {
  AllocationModel,
  ComponentCategory,
  ComponentDefinition,
  ConnectionEndpoint,
  ConnectionModel,
  Diagnostic,
  GumboBlock,
  ImportModel,
  NormalizedElement,
  NormalizedModel,
  PackageModel,
  ParseProjectOptions,
  ParseProjectResult,
  ParseProjectSourcesOptions,
  PartUsage,
  PortDirection,
  PortModel,
  RequirementRecord,
  SourceFileRecord,
  SourceInput,
  SourceOrigin,
} from "./types.js";

interface PackageDraft {
  kind: "package";
  id: string;
  name: string;
  qualifiedName: string;
  parentPackageId?: string;
  sourceFileId: string;
  origin: SourceOrigin;
  importIds: string[];
  definitionIds: string[];
  gumboBlockIds: string[];
  span: PackageModel["span"];
}

interface DefinitionDraft {
  kind: "part-definition";
  id: string;
  name: string;
  qualifiedName: string;
  packageId: string;
  sourceFileId: string;
  origin: SourceOrigin;
  baseType?: string;
  category: ComponentCategory;
  partIds: string[];
  portIds: string[];
  connectionIds: string[];
  allocationIds: string[];
  gumboBlockIds: string[];
  traceIds: string[];
  span: ComponentDefinition["span"];
}

interface GumboBlockDraft {
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly ownerId: string;
  readonly ownerQualifiedName: string;
  readonly raw: string;
  readonly body: string;
  readonly bodyAbsoluteStart: number;
  readonly sourceMap: SourceMap;
  readonly span: GumboBlock["span"];
  readonly bodySpan: GumboBlock["bodySpan"];
}

interface ParsedDrafts {
  readonly file: SourceFileRecord;
  readonly packages: PackageDraft[];
  readonly imports: ImportModel[];
  readonly definitions: DefinitionDraft[];
  readonly parts: PartUsage[];
  readonly ports: PortModel[];
  readonly connections: ConnectionModel[];
  readonly allocations: AllocationModel[];
  readonly gumboBlocks: GumboBlockDraft[];
  readonly diagnostics: Diagnostic[];
}

class IdentityAllocator {
  readonly #used = new Set<string>();

  public allocate(kind: string, qualifiedName: string, offset: number): string {
    const preferred = semanticId(kind, qualifiedName);
    if (!this.#used.has(preferred)) {
      this.#used.add(preferred);
      return preferred;
    }
    let candidate = occurrenceId(kind, qualifiedName, offset);
    let suffix = 2;
    while (this.#used.has(candidate)) {
      candidate = `${occurrenceId(kind, qualifiedName, offset)}-${suffix}`;
      suffix += 1;
    }
    this.#used.add(candidate);
    return candidate;
  }
}

function tokenText(source: string, tokens: readonly Token[], start: number, end: number): string {
  const first = tokens[start];
  const last = tokens[end];
  if (first === undefined || last === undefined) return "";
  return source.slice(first.start, last.end);
}

function joinedName(tokens: readonly Token[]): string {
  return normalizeQualifiedName(
    tokens
      .filter((token) => !isTrivia(token) && token.kind !== "eof")
      .map((token) => token.value)
      .join(""),
  );
}

function knownCategory(typeName: string | undefined): ComponentCategory {
  if (typeName === undefined) return "unknown";
  const final = typeName.split("::").at(-1)?.replace(/[_\s]/gu, "").toLowerCase() ?? "";
  if (final === "system") return "system";
  if (final === "process") return "process";
  if (final === "thread" || final.endsWith("thread")) return "thread";
  if (final === "device") return "device";
  if (final === "processor") return "processor";
  if (final === "data") return "data";
  if (final === "abstract") return "abstract";
  if (final === "memory") return "memory";
  if (final === "bus") return "bus";
  if (final === "virtualprocessor") return "virtual-processor";
  if (final === "subprogram") return "subprogram";
  return "unknown";
}

class SysmlParser {
  readonly #map: SourceMap;
  readonly #tokens: readonly Token[];
  readonly #diagnostics: Diagnostic[];
  readonly #packages: PackageDraft[] = [];
  readonly #imports: ImportModel[] = [];
  readonly #definitions: DefinitionDraft[] = [];
  readonly #parts: PartUsage[] = [];
  readonly #ports: PortModel[] = [];
  readonly #connections: ConnectionModel[] = [];
  readonly #allocations: AllocationModel[] = [];
  readonly #gumboBlocks: GumboBlockDraft[] = [];
  #index = 0;

  public constructor(
    readonly source: SourceInput,
    readonly file: SourceFileRecord,
    readonly allocator: IdentityAllocator,
  ) {
    this.#map = new SourceMap(source.path, source.content);
    const result = lex(source.content, source.path);
    this.#tokens = result.tokens;
    this.#diagnostics = [...result.diagnostics];
    this.validateBraces();
  }

  public parse(): ParsedDrafts {
    while (!this.atEnd()) {
      this.skipTrivia();
      if (this.matches("package")) this.parsePackage(undefined, undefined);
      else this.#index += 1;
    }

    if (this.#packages.length === 0 && this.source.origin !== "library") {
      this.#diagnostics.push({
        code: "SYSML_PACKAGE_REQUIRED",
        severity: "error",
        fatal: true,
        message: `Project file ${this.source.relativePath ?? this.source.path} contains no renderable package declaration.`,
        span: this.#map.span(0, this.source.content.length),
        hint: "Keep incomplete files outside the configured project root, or add a package declaration.",
      });
    }

    return {
      file: { ...this.file, packageIds: this.#packages.map((pkg) => pkg.id) },
      packages: this.#packages,
      imports: this.#imports,
      definitions: this.#definitions,
      parts: this.#parts,
      ports: this.#ports,
      connections: this.#connections,
      allocations: this.#allocations,
      gumboBlocks: this.#gumboBlocks,
      diagnostics: this.#diagnostics,
    };
  }

  private current(): Token {
    return this.#tokens[this.#index] ?? this.#tokens.at(-1) ?? {
      kind: "eof",
      text: "",
      value: "",
      start: this.source.content.length,
      end: this.source.content.length,
    };
  }

  private atEnd(): boolean {
    return this.current().kind === "eof";
  }

  private matches(value: string): boolean {
    const current = this.current();
    return current.kind === "identifier" && current.value === value;
  }

  private skipTrivia(): void {
    while (isTrivia(this.current())) this.#index += 1;
  }

  /**
   * Read only the contiguous comment run immediately preceding a declaration.
   * This deliberately does not infer links from names or prose: `@trace`
   * identifiers are the source-of-truth join keys.
   */
  private leadingTraceIds(startOffset: number): string[] {
    const comments: Token[] = [];
    let cursor = this.#tokens.findIndex((token) => token.start >= startOffset);
    if (cursor < 0) cursor = this.#tokens.length - 1;
    cursor -= 1;
    let boundary = startOffset;
    while (cursor >= 0) {
      const token = this.#tokens[cursor];
      if (token === undefined || !isTrivia(token)) break;
      if (this.source.content.slice(token.end, boundary).trim() !== "") break;
      comments.unshift(token);
      boundary = token.start;
      cursor -= 1;
    }
    const identifiers = comments.flatMap((comment) => {
      const marker = comment.value.match(/@trace\b([^\r\n*]*)/u)?.[1] ?? "";
      return marker.match(/(?<![A-Z0-9-])[A-Z][A-Z0-9]*(?:-[A-Z][A-Z0-9]*)*-\d+[A-Z]?\b/gu) ?? [];
    });
    return [...new Set(identifiers)];
  }

  private nextSignificantIndex(from = this.#index + 1): number {
    let index = from;
    while (isTrivia(this.#tokens[index] ?? this.current())) index += 1;
    return index;
  }

  private validateBraces(): void {
    const stack: Token[] = [];
    for (const token of this.#tokens) {
      if (isTrivia(token) || token.kind === "string") continue;
      if (token.text === "{") stack.push(token);
      else if (token.text === "}") {
        const opening = stack.pop();
        if (opening === undefined) {
          this.#diagnostics.push({
            code: "SYSML_UNMATCHED_CLOSING_BRACE",
            severity: "error",
            fatal: true,
            message: "Closing brace has no matching opening brace.",
            span: this.#map.span(token.start, token.end),
            hint: "Remove the extra brace or restore the missing declaration opening.",
          });
        }
      }
    }
    for (const token of stack) {
      this.#diagnostics.push({
        code: "SYSML_UNCLOSED_BRACE",
        severity: "error",
        fatal: true,
        message: "Opening brace is not closed; the current source cannot be rendered safely.",
        span: this.#map.span(token.start, token.end),
        hint: "Add the corresponding closing brace.",
      });
    }
  }

  private skipBalancedBlock(): number {
    const opening = this.current();
    if (opening.text !== "{") return opening.end;
    let depth = 0;
    while (!this.atEnd()) {
      const token = this.current();
      if (!isTrivia(token) && token.text === "{") depth += 1;
      else if (!isTrivia(token) && token.text === "}") {
        depth -= 1;
        this.#index += 1;
        if (depth === 0) return token.end;
        continue;
      }
      this.#index += 1;
    }
    return this.source.content.length;
  }

  private parsePackage(parentId: string | undefined, parentQualifiedName: string | undefined): void {
    const startToken = this.current();
    this.#index += 1;
    this.skipTrivia();
    const nameStart = this.#index;
    while (!this.atEnd() && this.current().text !== "{" && this.current().text !== ";") {
      this.#index += 1;
    }
    const name = joinedName(this.#tokens.slice(nameStart, this.#index));
    if (name === "") {
      this.#diagnostics.push({
        code: "SYSML_PACKAGE_NAME_REQUIRED",
        severity: "error",
        fatal: true,
        message: "Package declaration is missing its name.",
        span: this.#map.span(startToken.start, this.current().end),
        hint: "Use: package Package_Name { ... }",
      });
      return;
    }
    const qualifiedName = parentQualifiedName === undefined ? name : `${parentQualifiedName}::${name}`;
    const id = this.allocator.allocate("package", qualifiedName, startToken.start);
    const draft: PackageDraft = {
      kind: "package",
      id,
      name: name.split("::").at(-1) ?? name,
      qualifiedName,
      ...(parentId === undefined ? {} : { parentPackageId: parentId }),
      sourceFileId: this.file.id,
      origin: this.source.origin ?? "project",
      importIds: [],
      definitionIds: [],
      gumboBlockIds: [],
      span: this.#map.span(startToken.start, this.current().end),
    };
    this.#packages.push(draft);

    if (this.current().text !== "{") {
      this.#diagnostics.push({
        code: "SYSML_PACKAGE_BODY_REQUIRED",
        severity: "error",
        fatal: true,
        message: `Package ${qualifiedName} has no braced body.`,
        span: draft.span,
        hint: `Use: package ${name} { ... }`,
      });
      if (this.current().text === ";") this.#index += 1;
      return;
    }
    this.#index += 1;

    while (!this.atEnd() && this.current().text !== "}") {
      this.skipTrivia();
      if (this.current().text === "}") break;
      if (this.matches("package")) {
        this.parsePackage(id, qualifiedName);
        continue;
      }
      if (this.matches("private") || this.matches("public")) {
        const visibility = this.current().value as "private" | "public";
        const importIndex = this.nextSignificantIndex();
        if (this.#tokens[importIndex]?.value === "import") {
          this.#index = importIndex;
          const imported = this.parseImport(draft, visibility);
          if (imported !== undefined) draft.importIds.push(imported.id);
          continue;
        }
      }
      if (this.matches("import")) {
        const imported = this.parseImport(draft, "unspecified");
        if (imported !== undefined) draft.importIds.push(imported.id);
        continue;
      }
      if (this.matches("part") && this.#tokens[this.nextSignificantIndex()]?.value === "def") {
        const definition = this.parseDefinition(draft);
        if (definition !== undefined) draft.definitionIds.push(definition.id);
        continue;
      }
      if (this.matches("language")) {
        const block = this.parseLanguage(id, qualifiedName);
        if (block !== undefined) draft.gumboBlockIds.push(block.id);
        continue;
      }
      if (this.current().text === "{") {
        this.skipBalancedBlock();
        continue;
      }
      this.#index += 1;
    }
    if (this.current().text === "}") {
      const close = this.current();
      this.#index += 1;
      draft.span = this.#map.span(startToken.start, close.end);
    }
  }

  private parseImport(
    pkg: PackageDraft,
    visibility: ImportModel["visibility"],
  ): ImportModel | undefined {
    const startToken = this.current();
    this.#index += 1;
    const bodyStart = this.#index;
    while (!this.atEnd() && this.current().text !== ";") this.#index += 1;
    const bodyEnd = this.#index - 1;
    const rawTarget = joinedName(this.#tokens.slice(bodyStart, this.#index));
    const wildcard = rawTarget.endsWith("::*") || rawTarget === "*";
    const target = rawTarget.replace(/::\*$/u, "");
    if (target === "") return undefined;
    const endToken = this.current();
    if (endToken.text === ";") this.#index += 1;
    const qualifiedName = `${pkg.qualifiedName}::import::${rawTarget}`;
    const imported: ImportModel = {
      kind: "import",
      id: this.allocator.allocate("import", qualifiedName, startToken.start),
      name: rawTarget,
      qualifiedName,
      fingerprint: fingerprint([visibility, target, wildcard]),
      packageId: pkg.id,
      visibility,
      target,
      wildcard,
      span: this.#map.span(startToken.start, endToken.end),
    };
    this.#imports.push(imported);
    void bodyEnd;
    return imported;
  }

  private parseDefinition(pkg: PackageDraft): DefinitionDraft | undefined {
    const startToken = this.current();
    this.#index = this.nextSignificantIndex(); // def
    this.#index += 1;
    this.skipTrivia();
    const nameToken = this.current();
    if (nameToken.kind !== "identifier") {
      this.#diagnostics.push({
        code: "SYSML_PART_DEFINITION_NAME_REQUIRED",
        severity: "error",
        fatal: true,
        message: "Part definition is missing its name.",
        span: this.#map.span(startToken.start, nameToken.end),
        hint: "Use: part def Name :> System { ... }",
      });
      this.#index += 1;
      return undefined;
    }
    const name = nameToken.value;
    this.#index += 1;
    let baseType: string | undefined;
    while (!this.atEnd() && this.current().text !== "{" && this.current().text !== ";") {
      if (this.current().text === ":>") {
        this.#index += 1;
        const baseStart = this.#index;
        while (!this.atEnd() && this.current().text !== "{" && this.current().text !== ";") {
          this.#index += 1;
        }
        baseType = joinedName(this.#tokens.slice(baseStart, this.#index));
        break;
      }
      this.#index += 1;
    }
    const qualifiedName = `${pkg.qualifiedName}::${name}`;
    const draft: DefinitionDraft = {
      kind: "part-definition",
      id: this.allocator.allocate("def", qualifiedName, startToken.start),
      name,
      qualifiedName,
      packageId: pkg.id,
      sourceFileId: this.file.id,
      origin: this.source.origin ?? "project",
      ...(baseType === undefined || baseType === "" ? {} : { baseType }),
      category: knownCategory(baseType),
      partIds: [],
      portIds: [],
      connectionIds: [],
      allocationIds: [],
      gumboBlockIds: [],
      traceIds: this.leadingTraceIds(startToken.start),
      span: this.#map.span(startToken.start, this.current().end),
    };
    this.#definitions.push(draft);

    if (this.current().text === ";") {
      const end = this.current();
      this.#index += 1;
      draft.span = this.#map.span(startToken.start, end.end);
      return draft;
    }
    if (this.current().text !== "{") {
      this.#diagnostics.push({
        code: "SYSML_PART_DEFINITION_BODY_REQUIRED",
        severity: "error",
        fatal: true,
        message: `Part definition ${qualifiedName} has no body.`,
        span: draft.span,
      });
      return draft;
    }
    this.#index += 1;

    while (!this.atEnd() && this.current().text !== "}") {
      this.skipTrivia();
      if (this.current().text === "}") break;
      if (this.matches("part") && this.#tokens[this.nextSignificantIndex()]?.value !== "def") {
        const part = this.parsePartUsage(draft);
        if (part !== undefined) draft.partIds.push(part.id);
        continue;
      }
      if (this.matches("port")) {
        const port = this.parsePort(draft);
        if (port !== undefined) draft.portIds.push(port.id);
        continue;
      }
      if (this.matches("connection")) {
        const connection = this.parseConnection(draft);
        if (connection !== undefined) draft.connectionIds.push(connection.id);
        continue;
      }
      if (this.matches("allocation")) {
        const allocation = this.parseAllocation(draft);
        if (allocation !== undefined) draft.allocationIds.push(allocation.id);
        continue;
      }
      if (this.matches("language")) {
        const block = this.parseLanguage(draft.id, draft.qualifiedName);
        if (block !== undefined) draft.gumboBlockIds.push(block.id);
        continue;
      }
      if (this.current().text === "{") {
        this.skipBalancedBlock();
        continue;
      }
      this.#index += 1;
    }
    if (this.current().text === "}") {
      const close = this.current();
      this.#index += 1;
      draft.span = this.#map.span(startToken.start, close.end);
    }
    return draft;
  }

  private parsePartUsage(owner: DefinitionDraft): PartUsage | undefined {
    const startToken = this.current();
    this.#index += 1;
    this.skipTrivia();
    const nameToken = this.current();
    if (nameToken.kind !== "identifier") {
      this.#index += 1;
      return undefined;
    }
    const name = nameToken.value;
    this.#index += 1;
    this.skipTrivia();
    if (this.current().text !== ":") {
      while (!this.atEnd() && this.current().text !== ";" && this.current().text !== "}") this.#index += 1;
      return undefined;
    }
    this.#index += 1;
    const typeStart = this.#index;
    while (
      !this.atEnd() &&
      this.current().text !== ";" &&
      this.current().text !== "{" &&
      this.current().text !== "}"
    ) {
      this.#index += 1;
    }
    const typeName = joinedName(this.#tokens.slice(typeStart, this.#index));
    let end = this.current().end;
    if (this.current().text === "{") end = this.skipBalancedBlock();
    else if (this.current().text === ";") {
      end = this.current().end;
      this.#index += 1;
    }
    if (typeName === "") return undefined;
    const qualifiedName = `${owner.qualifiedName}::${name}`;
    const part: PartUsage = {
      kind: "part-usage",
      id: this.allocator.allocate("part", qualifiedName, startToken.start),
      name,
      qualifiedName,
      fingerprint: fingerprint([owner.qualifiedName, typeName]),
      ownerDefinitionId: owner.id,
      typeName,
      category: knownCategory(typeName),
      traceIds: this.leadingTraceIds(startToken.start),
      span: this.#map.span(startToken.start, end),
    };
    this.#parts.push(part);
    return part;
  }

  private parsePort(owner: DefinitionDraft): PortModel | undefined {
    const startToken = this.current();
    this.#index += 1;
    this.skipTrivia();
    const nameToken = this.current();
    if (nameToken.kind !== "identifier") {
      this.#index += 1;
      return undefined;
    }
    const name = nameToken.value;
    this.#index += 1;
    this.skipTrivia();
    if (this.current().text !== ":") return undefined;
    this.#index += 1;
    this.skipTrivia();
    const kindStart = this.#index;
    while (!this.atEnd() && this.current().text !== "{" && this.current().text !== ";") this.#index += 1;
    const portKind = joinedName(this.#tokens.slice(kindStart, this.#index));
    let direction: PortDirection = "unknown";
    let typeName: string | undefined;
    let end = this.current().end;
    if (this.current().text === "{") {
      const openIndex = this.#index;
      let depth = 0;
      let closeIndex = openIndex;
      while (!this.atEnd()) {
        const token = this.current();
        if (!isTrivia(token) && token.text === "{") depth += 1;
        else if (!isTrivia(token) && token.text === "}") {
          depth -= 1;
          if (depth === 0) {
            closeIndex = this.#index;
            this.#index += 1;
            end = token.end;
            break;
          }
        }
        this.#index += 1;
      }
      const body = this.#tokens.slice(openIndex + 1, closeIndex);
      const directionToken = body.find(
        (token) =>
          token.kind === "identifier" &&
          (token.value === "in" || token.value === "out" || token.value === "inout"),
      );
      if (directionToken !== undefined) direction = directionToken.value as PortDirection;
      const typeIndex = body.findIndex(
        (token) => token.kind === "identifier" && token.value === "type",
      );
      if (typeIndex >= 0) {
        let valueStart = typeIndex + 1;
        while (body[valueStart]?.text === ":" || body[valueStart]?.text === ":>>") valueStart += 1;
        let valueEnd = valueStart;
        while (valueEnd < body.length && body[valueEnd]?.text !== ";") valueEnd += 1;
        const parsed = joinedName(body.slice(valueStart, valueEnd));
        if (parsed !== "") typeName = parsed;
      }
    } else if (this.current().text === ";") {
      end = this.current().end;
      this.#index += 1;
    }
    const qualifiedName = `${owner.qualifiedName}::${name}`;
    const port: PortModel = {
      kind: "port",
      id: this.allocator.allocate("port", qualifiedName, startToken.start),
      name,
      qualifiedName,
      fingerprint: fingerprint([owner.qualifiedName, portKind, direction, typeName ?? ""]),
      ownerDefinitionId: owner.id,
      portKind,
      direction,
      ...(typeName === undefined ? {} : { typeName }),
      traceIds: this.leadingTraceIds(startToken.start),
      span: this.#map.span(startToken.start, end),
    };
    this.#ports.push(port);
    return port;
  }

  private statementTokens(): { start: number; end: number; endToken: Token } {
    const start = this.#index;
    while (!this.atEnd() && this.current().text !== ";" && this.current().text !== "}") this.#index += 1;
    const end = Math.max(start, this.#index - 1);
    const endToken = this.current();
    if (endToken.text === ";") this.#index += 1;
    return { start, end, endToken };
  }

  private endpoint(tokens: readonly Token[]): ConnectionEndpoint {
    const raw = joinedName(tokens);
    return {
      raw,
      path: raw.split(".").map((piece) => piece.trim()).filter((piece) => piece !== ""),
      resolution: "unresolved",
    };
  }

  private parseConnection(owner: DefinitionDraft): ConnectionModel | undefined {
    const startToken = this.current();
    const statement = this.statementTokens();
    const body = this.#tokens.slice(statement.start, statement.end + 1).filter((token) => !isTrivia(token));
    const name = body[1]?.value;
    const colon = body.findIndex((token) => token.text === ":");
    const connect = body.findIndex((token) => token.value === "connect");
    const to = body.findIndex((token, index) => index > connect && token.value === "to");
    if (name === undefined || connect < 0 || to < 0) {
      this.#diagnostics.push({
        code: "SYSML_CONNECTION_UNRECOGNIZED",
        severity: "warning",
        fatal: false,
        message: "Connection could not be normalized and was omitted from the diagram.",
        span: this.#map.span(startToken.start, statement.endToken.end),
        hint: "Expected: connection name : PortConnection connect source to target;",
      });
      return undefined;
    }
    const connectionType = colon >= 0 ? joinedName(body.slice(colon + 1, connect)) : "PortConnection";
    const qualifiedName = `${owner.qualifiedName}::${name}`;
    const connection: ConnectionModel = {
      kind: "connection",
      id: this.allocator.allocate("connection", qualifiedName, startToken.start),
      name,
      qualifiedName,
      fingerprint: fingerprint([
        owner.qualifiedName,
        connectionType,
        joinedName(body.slice(connect + 1, to)),
        joinedName(body.slice(to + 1)),
      ]),
      ownerDefinitionId: owner.id,
      connectionType,
      source: this.endpoint(body.slice(connect + 1, to)),
      target: this.endpoint(body.slice(to + 1)),
      traceIds: this.leadingTraceIds(startToken.start),
      span: this.#map.span(startToken.start, statement.endToken.end),
    };
    this.#connections.push(connection);
    return connection;
  }

  private parseAllocation(owner: DefinitionDraft): AllocationModel | undefined {
    const startToken = this.current();
    const statement = this.statementTokens();
    const body = this.#tokens.slice(statement.start, statement.end + 1).filter((token) => !isTrivia(token));
    const name = body[1]?.value;
    const colon = body.findIndex((token) => token.text === ":");
    const allocate = body.findIndex((token) => token.value === "allocate");
    const to = body.findIndex((token, index) => index > allocate && token.value === "to");
    if (name === undefined || allocate < 0 || to < 0) return undefined;
    const allocationType = colon >= 0 ? joinedName(body.slice(colon + 1, allocate)) : "Allocation";
    const qualifiedName = `${owner.qualifiedName}::${name}`;
    const allocation: AllocationModel = {
      kind: "allocation",
      id: this.allocator.allocate("allocation", qualifiedName, startToken.start),
      name,
      qualifiedName,
      fingerprint: fingerprint([
        owner.qualifiedName,
        allocationType,
        joinedName(body.slice(allocate + 1, to)),
        joinedName(body.slice(to + 1)),
      ]),
      ownerDefinitionId: owner.id,
      allocationType,
      source: this.endpoint(body.slice(allocate + 1, to)),
      target: this.endpoint(body.slice(to + 1)),
      traceIds: this.leadingTraceIds(startToken.start),
      span: this.#map.span(startToken.start, statement.endToken.end),
    };
    this.#allocations.push(allocation);
    return allocation;
  }

  private parseLanguage(ownerId: string, ownerQualifiedName: string): GumboBlockDraft | undefined {
    const startToken = this.current();
    this.#index += 1;
    while (this.current().kind === "line-comment") this.#index += 1;
    const language = this.current();
    if (language.kind !== "string" || language.value.toUpperCase() !== "GUMBO") {
      this.#index += 1;
      return undefined;
    }
    this.#index += 1;
    while (this.current().kind === "line-comment") this.#index += 1;
    const comment = this.current();
    if (comment.kind !== "block-comment") {
      this.#diagnostics.push({
        code: "GUMBO_BLOCK_REQUIRED",
        severity: "error",
        fatal: true,
        message: 'language "GUMBO" must be followed by a /*{ ... }*/ language block.',
        span: this.#map.span(startToken.start, comment.end),
        hint: 'Use: language "GUMBO" /*{ ... }*/',
      });
      return undefined;
    }
    this.#index += 1;
    const sequence = this.#gumboBlocks.filter((block) => block.ownerId === ownerId).length + 1;
    const name = `GUMBO_${sequence}`;
    const qualifiedName = `${ownerQualifiedName}::${name}`;
    const bodyAbsoluteStart = comment.start + 2;
    const draft: GumboBlockDraft = {
      id: this.allocator.allocate("gumbo", qualifiedName, startToken.start),
      name,
      qualifiedName,
      ownerId,
      ownerQualifiedName,
      raw: this.source.content.slice(startToken.start, comment.end),
      body: comment.value,
      bodyAbsoluteStart,
      sourceMap: this.#map,
      span: this.#map.span(startToken.start, comment.end),
      bodySpan: this.#map.span(bodyAbsoluteStart, comment.end - 2),
    };
    this.#gumboBlocks.push(draft);
    return draft;
  }
}

function sourceRecord(source: SourceInput): SourceFileRecord {
  const origin = source.origin ?? "project";
  const root = source.root ?? path.dirname(source.path);
  const relativePath =
    source.relativePath ?? (path.relative(root, source.path) || path.basename(source.path));
  const qualifier = origin === "library" ? `${source.libraryName ?? path.basename(root)}:` : "";
  return {
    id: semanticId("file", `${origin}:${qualifier}${relativePath.split(path.sep).join("/")}`),
    path: path.resolve(source.path),
    relativePath: relativePath.split(path.sep).join("/"),
    root: path.resolve(root),
    origin,
    ...(source.libraryName === undefined ? {} : { libraryName: source.libraryName }),
    packageIds: [],
    contentHash: stableHash(source.content),
  };
}

function packageImports(
  pkg: PackageDraft,
  importsById: ReadonlyMap<string, ImportModel>,
): readonly ImportModel[] {
  return pkg.importIds
    .map((id) => importsById.get(id))
    .filter((value): value is ImportModel => value !== undefined);
}

function makeTypeResolver(
  packages: readonly PackageDraft[],
  imports: readonly ImportModel[],
  definitions: readonly DefinitionDraft[],
): (name: string, packageId: string) => DefinitionDraft | undefined {
  const byQualified = new Map<string, DefinitionDraft[]>();
  const byLocal = new Map<string, DefinitionDraft[]>();
  for (const definition of definitions) {
    const qualified = byQualified.get(definition.qualifiedName) ?? [];
    qualified.push(definition);
    byQualified.set(definition.qualifiedName, qualified);
    const local = byLocal.get(definition.name) ?? [];
    local.push(definition);
    byLocal.set(definition.name, local);
  }
  const packageById = new Map(packages.map((pkg) => [pkg.id, pkg]));
  const importById = new Map(imports.map((item) => [item.id, item]));
  return (rawName, packageId) => {
    const name = normalizeQualifiedName(rawName);
    const direct = byQualified.get(name);
    if (direct?.length === 1) return direct[0];
    const pkg = packageById.get(packageId);
    if (pkg !== undefined) {
      const samePackage = byQualified.get(`${pkg.qualifiedName}::${name}`);
      if (samePackage?.length === 1) return samePackage[0];
      for (const imported of packageImports(pkg, importById)) {
        const candidate = byQualified.get(`${imported.target}::${name}`);
        if (candidate?.length === 1) return candidate[0];
      }
    }
    const local = byLocal.get(name);
    return local?.length === 1 ? local[0] : undefined;
  };
}

function endpointResolved(
  endpoint: ConnectionEndpoint,
  owner: DefinitionDraft,
  partsByOwner: ReadonlyMap<string, readonly PartUsage[]>,
  portsByOwner: ReadonlyMap<string, readonly PortModel[]>,
  definitionById: ReadonlyMap<string, DefinitionDraft>,
): ConnectionEndpoint {
  const pathPieces = endpoint.path;
  if (pathPieces.length === 0) return endpoint;
  const directPort = (portsByOwner.get(owner.id) ?? []).find((port) => port.name === pathPieces[0]);
  if (pathPieces.length === 1 && directPort !== undefined) {
    return {
      ...endpoint,
      resolvedElementId: owner.id,
      resolvedPortId: directPort.id,
      resolution: "resolved",
    };
  }
  let definition = owner;
  let resolvedPart: PartUsage | undefined;
  for (let index = 0; index < pathPieces.length - 1; index += 1) {
    const segment = pathPieces[index];
    const candidates = (partsByOwner.get(definition.id) ?? []).filter((part) => part.name === segment);
    if (candidates.length !== 1) return endpoint;
    resolvedPart = candidates[0];
    if (resolvedPart?.resolvedDefinitionId === undefined) return endpoint;
    const next = definitionById.get(resolvedPart.resolvedDefinitionId);
    if (next === undefined) return endpoint;
    definition = next;
  }
  const finalName = pathPieces.at(-1);
  const finalPort = (portsByOwner.get(definition.id) ?? []).find((port) => port.name === finalName);
  if (finalPort !== undefined && resolvedPart !== undefined) {
    return {
      ...endpoint,
      resolvedElementId: resolvedPart.id,
      resolvedPortId: finalPort.id,
      resolution: "resolved",
    };
  }
  if (pathPieces.length === 1) {
    const candidates = (partsByOwner.get(owner.id) ?? []).filter((part) => part.name === finalName);
    if (candidates.length === 1 && candidates[0] !== undefined) {
      return {
        ...endpoint,
        resolvedElementId: candidates[0].id,
        resolution: "resolved",
      };
    }
    if (candidates.length > 1) return { ...endpoint, resolution: "ambiguous" };
  }
  return endpoint;
}

function finalizedModel(
  drafts: readonly ParsedDrafts[],
  projectRoot: string,
  libraryRoots: readonly string[],
): ParseProjectResult {
  const diagnostics = drafts.flatMap((draft) => draft.diagnostics);
  const packages = drafts.flatMap((draft) => draft.packages);
  const imports = drafts.flatMap((draft) => draft.imports);
  const definitionDrafts = drafts.flatMap((draft) => draft.definitions);
  const initialParts = drafts.flatMap((draft) => draft.parts);
  const ports = drafts.flatMap((draft) => draft.ports);
  const initialConnections = drafts.flatMap((draft) => draft.connections);
  const initialAllocations = drafts.flatMap((draft) => draft.allocations);
  const blockDrafts = drafts.flatMap((draft) => draft.gumboBlocks);
  const resolveType = makeTypeResolver(packages, imports, definitionDrafts);
  const definitionDraftById = new Map(definitionDrafts.map((definition) => [definition.id, definition]));

  const resolveCategory = (definition: DefinitionDraft, seen = new Set<string>()): ComponentCategory => {
    if (definition.category !== "unknown") return definition.category;
    if (seen.has(definition.id) || definition.baseType === undefined) return "unknown";
    seen.add(definition.id);
    const base = resolveType(definition.baseType, definition.packageId);
    return base === undefined ? knownCategory(definition.baseType) : resolveCategory(base, seen);
  };
  for (const definition of definitionDrafts) definition.category = resolveCategory(definition);

  const parts: PartUsage[] = initialParts.map((part) => {
    const owner = definitionDraftById.get(part.ownerDefinitionId);
    const resolved = owner === undefined ? undefined : resolveType(part.typeName, owner.packageId);
    return {
      ...part,
      ...(resolved === undefined ? {} : { resolvedDefinitionId: resolved.id }),
      category: resolved?.category ?? part.category,
    };
  });
  const partsByOwner = new Map<string, PartUsage[]>();
  for (const part of parts) {
    const values = partsByOwner.get(part.ownerDefinitionId) ?? [];
    values.push(part);
    partsByOwner.set(part.ownerDefinitionId, values);
  }
  const portsByOwner = new Map<string, PortModel[]>();
  for (const port of ports) {
    const values = portsByOwner.get(port.ownerDefinitionId) ?? [];
    values.push(port);
    portsByOwner.set(port.ownerDefinitionId, values);
  }

  const connections: ConnectionModel[] = initialConnections.map((connection) => {
    const owner = definitionDraftById.get(connection.ownerDefinitionId);
    if (owner === undefined) return connection;
    const source = endpointResolved(connection.source, owner, partsByOwner, portsByOwner, definitionDraftById);
    const target = endpointResolved(connection.target, owner, partsByOwner, portsByOwner, definitionDraftById);
    for (const [role, endpoint] of [["source", source], ["target", target]] as const) {
      if (endpoint.resolution !== "resolved") {
        diagnostics.push({
          code: "SYSML_UNRESOLVED_CONNECTION_ENDPOINT",
          severity: "warning",
          fatal: false,
          message: `Could not resolve ${role} endpoint '${endpoint.raw}' on ${connection.qualifiedName}.`,
          span: connection.span,
          hint: "Check the part/port spelling and ensure the referenced type is inside the project or an explicit library root.",
        });
      }
    }
    return { ...connection, source, target };
  });
  const allocations: AllocationModel[] = initialAllocations.map((allocation) => {
    const owner = definitionDraftById.get(allocation.ownerDefinitionId);
    if (owner === undefined) return allocation;
    return {
      ...allocation,
      source: endpointResolved(allocation.source, owner, partsByOwner, portsByOwner, definitionDraftById),
      target: endpointResolved(allocation.target, owner, partsByOwner, portsByOwner, definitionDraftById),
    };
  });

  const definitions: ComponentDefinition[] = definitionDrafts.map((definition) => {
    const base = definition.baseType === undefined
      ? undefined
      : resolveType(definition.baseType, definition.packageId);
    return {
      ...definition,
      fingerprint: fingerprint([
        definition.baseType ?? "",
        (partsByOwner.get(definition.id) ?? []).map((part) => [part.typeName, part.name]).sort(),
        (portsByOwner.get(definition.id) ?? [])
          .map((port) => [port.direction, port.typeName ?? "", port.name])
          .sort(),
      ]),
      ...(base === undefined ? {} : { baseDefinitionId: base.id }),
    };
  });

  const contracts = [] as ReturnType<typeof extractGumboContracts>["contracts"][number][];
  const requirements: RequirementRecord[] = [];
  const gumboBlocks: GumboBlock[] = [];
  for (const block of blockDrafts) {
    const ownerPorts = portsByOwner.get(block.ownerId) ?? [];
    const extracted = extractGumboContracts({
      body: block.body,
      bodyAbsoluteStart: block.bodyAbsoluteStart,
      sourceMap: block.sourceMap,
      blockId: block.id,
      ownerId: block.ownerId,
      ownerQualifiedName: block.ownerQualifiedName,
      ports: ownerPorts,
    });
    diagnostics.push(...extracted.diagnostics);
    contracts.push(...extracted.contracts);
    requirements.push(...extracted.requirements);
    gumboBlocks.push({
      kind: "gumbo-block",
      id: block.id,
      name: block.name,
      qualifiedName: block.qualifiedName,
      fingerprint: fingerprint([block.body.replace(/\s+/gu, " ").trim()]),
      ownerId: block.ownerId,
      contractIds: extracted.contracts.map((contract) => contract.id),
      raw: block.raw,
      body: block.body,
      span: block.span,
      bodySpan: block.bodySpan,
    });
  }

  const packageModels: PackageModel[] = packages.map((pkg) => ({
    ...pkg,
    fingerprint: fingerprint([
      pkg.qualifiedName,
      pkg.importIds.map((id) => imports.find((item) => item.id === id)?.target ?? "").sort(),
      pkg.definitionIds.length,
    ]),
  }));
  const files = drafts.map((draft) => draft.file);
  const categoryRank: Readonly<Record<ComponentCategory, number>> = {
    system: 0,
    process: 1,
    thread: 2,
    device: 3,
    processor: 4,
    abstract: 5,
    memory: 6,
    bus: 7,
    "virtual-processor": 8,
    subprogram: 9,
    unknown: 10,
    data: 11,
  };
  const rootCandidates = definitions
    .filter((definition) => definition.origin === "project" && definition.category !== "data")
    .sort(
      (left, right) =>
        categoryRank[left.category] - categoryRank[right.category] ||
        left.qualifiedName.localeCompare(right.qualifiedName),
    )
    .map((definition) => definition.id);

  if (rootCandidates.length === 0) {
    diagnostics.push({
      code: "SYSML_NO_RENDERABLE_DEFINITIONS",
      severity: "error",
      fatal: true,
      message: "The project root contains no renderable AADL-oriented part definitions.",
      hint: "Choose a root containing a 'part def ... :> System/Process/Thread/Device' declaration.",
    });
  }

  const elements: Record<string, NormalizedElement> = {};
  for (const element of [
    ...packageModels,
    ...imports,
    ...definitions,
    ...parts,
    ...ports,
    ...connections,
    ...allocations,
    ...gumboBlocks,
    ...contracts,
    ...requirements,
  ]) {
    elements[element.id] = element;
  }

  const model: NormalizedModel = {
    version: 1,
    projectRoot,
    libraryRoots,
    files,
    packages: packageModels,
    imports,
    definitions,
    parts,
    ports,
    connections,
    allocations,
    gumboBlocks,
    contracts,
    requirements,
    rootCandidates,
    elements,
    generatedAt: new Date().toISOString(),
  };
  return {
    model,
    diagnostics,
    renderable: !diagnostics.some((diagnostic) => diagnostic.fatal),
  };
}

/** Fast, deterministic parsing path for already-loaded editor buffers and tests. */
export function parseProjectSources(options: ParseProjectSourcesOptions): ParseProjectResult {
  const allocator = new IdentityAllocator();
  const sources = [...options.sources].sort((left, right) => {
    const leftOrigin = left.origin ?? "project";
    const rightOrigin = right.origin ?? "project";
    if (leftOrigin !== rightOrigin) return leftOrigin === "project" ? -1 : 1;
    return left.path.localeCompare(right.path);
  });
  const drafts = sources.map((source) => {
    const record = sourceRecord(source);
    return new SysmlParser({ ...source, origin: source.origin ?? "project" }, record, allocator).parse();
  });
  const inferredRoot = path.resolve(
    options.root ?? sources.find((source) => (source.origin ?? "project") === "project")?.root ?? ".",
  );
  return finalizedModel(
    drafts,
    inferredRoot,
    (options.libraryRoots ?? []).map((root) => path.resolve(root)).sort(),
  );
}

/** Discover, read, and parse an explicitly bounded SysML project. */
export async function parseProject(options: ParseProjectOptions): Promise<ParseProjectResult> {
  const discovered = await discoverSysmlFiles(options);
  const sources: SourceInput[] = [];
  for (const file of discovered) {
    sources.push({
      path: file.path,
      content: await fs.readFile(file.path, "utf8"),
      relativePath: file.relativePath,
      root: file.root,
      origin: file.origin,
      ...(file.libraryName === undefined ? {} : { libraryName: file.libraryName }),
    });
  }
  const projectFile = discovered.find((file) => file.origin === "project");
  const projectRoot = projectFile?.root ?? path.resolve(options.root);
  const libraryRoots = [
    ...new Set(discovered.filter((file) => file.origin === "library").map((file) => file.root)),
  ].sort();
  return parseProjectSources({ sources, root: projectRoot, libraryRoots });
}
