import { fingerprint, occurrenceId } from "./identity.js";
import { lex, type Token } from "./lexer.js";
import { SourceMap } from "./source.js";
import type {
  Diagnostic,
  GumboClause,
  GumboContract,
  GumboContractKind,
  GumboPhase,
  PortModel,
  RequirementRecord,
  SourceSpan,
} from "./types.js";

interface GumboExtractionOptions {
  readonly body: string;
  readonly bodyAbsoluteStart: number;
  readonly sourceMap: SourceMap;
  readonly blockId: string;
  readonly ownerId: string;
  readonly ownerQualifiedName: string;
  readonly ports: readonly PortModel[];
}

export interface GumboExtraction {
  readonly contracts: readonly GumboContract[];
  readonly requirements: readonly RequirementRecord[];
  readonly diagnostics: readonly Diagnostic[];
}

const SECTION_PHASES: Readonly<Record<string, GumboPhase>> = {
  library: "library",
  invariants: "invariants",
  state: "state",
  functions: "functions",
  integration: "integration",
  initialize: "initialize",
  compute: "compute",
  compute_cases: "compute-cases",
  composition: "composition",
};

interface MutableCase {
  readonly token: Token;
  readonly name: string;
  readonly description?: string;
  readonly start: number;
  end: number;
  readonly clauses: GumboClause[];
  readonly rawHeader: string;
  readonly traceIds: readonly string[];
}

/**
 * Return trace identifiers from only the contiguous `//` comment run directly
 * above a parser-recognized declaration. A blank line, a block comment, or a
 * non-comment token is an authority boundary. The lexer remains responsible
 * for locating declarations and comments; names and prose never infer links.
 */
function leadingTraceIds(
  body: string,
  allTokens: readonly Token[],
  declarationStart: number,
): string[] {
  const declarationIndex = allTokens.findIndex((token) => token.start >= declarationStart);
  let cursor = (declarationIndex < 0 ? allTokens.length - 1 : declarationIndex) - 1;
  const comments: Token[] = [];
  let boundary = declarationStart;
  while (cursor >= 0) {
    const token = allTokens[cursor];
    if (token === undefined || token.kind !== "line-comment") break;
    // Exactly one line break keeps the marker adjacent while permitting
    // indentation. Two line breaks mean the comment is detached prose.
    if (!/^\r?\n[\t ]*$/u.test(body.slice(token.end, boundary))) break;
    comments.unshift(token);
    boundary = token.start;
    cursor -= 1;
  }
  const identifiers = comments.flatMap((comment) => {
    const marker = comment.value.match(/^\s*@trace\b([^\r\n]*)/u)?.[1] ?? "";
    return marker.match(/(?<![A-Z0-9-])[A-Z][A-Z0-9]*(?:-[A-Z][A-Z0-9]*)*-\d+[A-Z]?\b/gu) ?? [];
  });
  return [...new Set(identifiers)];
}

function absoluteSpan(options: GumboExtractionOptions, start: number, end: number): SourceSpan {
  return options.sourceMap.span(
    options.bodyAbsoluteStart + start,
    options.bodyAbsoluteStart + end,
  );
}

function meaningful(tokens: readonly Token[]): Token[] {
  return tokens.filter(
    (token) =>
      token.kind !== "line-comment" && token.kind !== "block-comment" && token.kind !== "eof",
  );
}

function declarationEnd(tokens: readonly Token[], startIndex: number): number {
  let round = 0;
  let square = 0;
  for (let index = startIndex; index < tokens.length; index += 1) {
    const token = tokens[index];
    if (token === undefined) break;
    if (token.text === "(") round += 1;
    else if (token.text === ")") round = Math.max(0, round - 1);
    else if (token.text === "[") square += 1;
    else if (token.text === "]") square = Math.max(0, square - 1);
    else if (token.text === ";" && round === 0 && square === 0) return index;
  }
  return Math.max(startIndex, tokens.length - 1);
}

function colonIndex(tokens: readonly Token[], start: number, end: number): number {
  let round = 0;
  for (let index = start; index <= end; index += 1) {
    const token = tokens[index];
    if (token === undefined) break;
    if (token.text === "(") round += 1;
    else if (token.text === ")") round = Math.max(0, round - 1);
    else if (token.text === ":" && round === 0) return index;
  }
  return -1;
}

function cleanDescription(value: string): string {
  return value
    .split(/\r?\n/u)
    .map((line) => line.trim().replace(/^\|/u, "").trim())
    .filter((line) => line.length > 0)
    .join(" ")
    .trim();
}

function descriptionBetween(
  tokens: readonly Token[],
  start: number,
  end: number,
): string | undefined {
  for (let index = start; index <= end; index += 1) {
    const token = tokens[index];
    if (token?.kind === "string") {
      const cleaned = cleanDescription(token.value);
      return cleaned === "" ? undefined : cleaned;
    }
  }
  return undefined;
}

function urls(...values: readonly (string | undefined)[]): string[] {
  const found = new Set<string>();
  for (const value of values) {
    if (value === undefined) continue;
    for (const match of value.matchAll(/https?:\/\/[^\s"<>]+/gu)) {
      const candidate = (match[0] ?? "").replace(/[),.;]+$/u, "");
      if (candidate !== "") found.add(candidate);
    }
  }
  return [...found].sort();
}

function referencedPorts(expression: string, ports: readonly PortModel[]): string[] {
  const identifiers = new Set(
    [...expression.matchAll(/[\p{L}_$][\p{L}\p{N}_$-]*/gu)].map((match) => match[0]),
  );
  return ports
    .filter((port) => identifiers.has(port.name))
    .map((port) => port.id)
    .sort();
}

function shiftedDiagnostic(
  diagnostic: Diagnostic,
  options: GumboExtractionOptions,
): Diagnostic {
  if (diagnostic.span === undefined) return diagnostic;
  return {
    ...diagnostic,
    code: diagnostic.code.replace(/^SYSML_/u, "GUMBO_"),
    message: diagnostic.message.replace(/^String literal/u, "GUMBO string literal"),
    span: absoluteSpan(
      options,
      diagnostic.span.start.offset,
      diagnostic.span.end.offset,
    ),
  };
}

export function extractGumboContracts(options: GumboExtractionOptions): GumboExtraction {
  const lexed = lex(options.body, options.sourceMap.file);
  const allTokens = lexed.tokens;
  const tokens = meaningful(allTokens);
  const diagnostics = lexed.diagnostics.map((diagnostic) => shiftedDiagnostic(diagnostic, options));
  const gumboBraceStack: Token[] = [];
  for (const token of tokens) {
    if (token.text === "{") gumboBraceStack.push(token);
    else if (token.text === "}") {
      const opening = gumboBraceStack.pop();
      if (opening === undefined) {
        diagnostics.push({
          code: "GUMBO_UNMATCHED_CLOSING_BRACE",
          severity: "error",
          fatal: true,
          message: "GUMBO language block contains an unmatched closing brace.",
          span: absoluteSpan(options, token.start, token.end),
          hint: "Remove the extra brace or restore its matching opening brace.",
        });
      }
    }
  }
  for (const token of gumboBraceStack) {
    diagnostics.push({
      code: "GUMBO_UNCLOSED_BRACE",
      severity: "error",
      fatal: true,
      message: "GUMBO language block contains an unclosed brace.",
      span: absoluteSpan(options, token.start, token.end),
      hint: "Close the GUMBO block before the */ language delimiter.",
    });
  }
  const contracts: GumboContract[] = [];
  const requirements: RequirementRecord[] = [];
  let phase: GumboPhase = "unknown";
  let braceDepth = 0;
  let activeCase: MutableCase | undefined;

  const makeContract = (
    contractKind: GumboContractKind,
    name: string,
    contractPhase: GumboPhase,
    description: string | undefined,
    expression: string,
    raw: string,
    start: number,
    end: number,
    clauses: readonly GumboClause[] = [],
    declarationTraceIds: readonly string[] = [],
  ): GumboContract => {
    const qualifiedName = `${options.ownerQualifiedName}::gumbo::${name}`;
    const id = occurrenceId("contract", qualifiedName, options.bodyAbsoluteStart + start);
    const references = new Set(referencedPorts(expression, options.ports));
    for (const clause of clauses) {
      for (const portId of clause.referencedPortIds) references.add(portId);
    }
    const traceIds = [...new Set([
      ...declarationTraceIds,
      ...clauses.flatMap((clause) => clause.traceIds),
    ])];
    return {
      kind: "gumbo-contract",
      contractKind,
      id,
      name,
      qualifiedName,
      fingerprint: fingerprint([
        contractKind,
        contractPhase,
        name,
        expression.replace(/\s+/gu, " ").trim(),
      ]),
      ownerId: options.ownerId,
      blockId: options.blockId,
      phase: contractPhase,
      ...(description === undefined ? {} : { description }),
      expression: expression.trim(),
      raw,
      urls: urls(description, raw),
      referencedPortIds: [...references].sort(),
      traceIds,
      clauses,
      span: absoluteSpan(options, start, end),
    };
  };

  const addContract = (contract: GumboContract): void => {
    contracts.push(contract);
    if (!/^REQ_/u.test(contract.name)) return;
    const id = occurrenceId(
      "requirement",
      `${options.ownerQualifiedName}::${contract.name}`,
      contract.span.start.offset,
    );
    requirements.push({
      kind: "requirement",
      id,
      requirementId: contract.name,
      qualifiedName: `${options.ownerQualifiedName}::requirement::${contract.name}`,
      fingerprint: fingerprint([
        contract.name,
        contract.description ?? "",
        contract.expression.replace(/\s+/gu, " ").trim(),
      ]),
      ownerId: options.ownerId,
      contractId: contract.id,
      contractKind: contract.contractKind,
      phase: contract.phase,
      ...(contract.description === undefined ? {} : { description: contract.description }),
      expression: contract.expression,
      urls: contract.urls,
      referencedPortIds: contract.referencedPortIds,
      traceIds: contract.traceIds,
      span: contract.span,
    });
  };

  const finishCase = (): void => {
    if (activeCase === undefined) return;
    const expression = activeCase.clauses
      .map((clause) => `${clause.kind} ${clause.expression}`)
      .join("\n");
    const raw = options.body.slice(activeCase.start, activeCase.end);
    addContract(
      makeContract(
        "case",
        activeCase.name,
        "compute-cases",
        activeCase.description,
        expression,
        raw,
        activeCase.start,
        activeCase.end,
        activeCase.clauses,
        activeCase.traceIds,
      ),
    );
    activeCase = undefined;
  };

  for (let index = 0; index < tokens.length; index += 1) {
    const token = tokens[index];
    if (token === undefined) break;
    if (token.text === "{") {
      braceDepth += 1;
      continue;
    }
    if (token.text === "}") {
      braceDepth = Math.max(0, braceDepth - 1);
      continue;
    }
    // The wrapper { ... } is depth 1. Nested composition/property grammars are retained raw only.
    if (braceDepth > 1 || token.kind !== "identifier") continue;

    const section = SECTION_PHASES[token.value];
    if (section !== undefined) {
      finishCase();
      phase = section;
      continue;
    }

    if (token.value === "case" && phase === "compute-cases") {
      finishCase();
      const headerEnd = colonIndex(tokens, index + 1, tokens.length - 1);
      if (headerEnd < 0) {
        diagnostics.push({
          code: "GUMBO_CASE_MISSING_COLON",
          severity: "warning",
          fatal: false,
          message: "A GUMBO compute case has no ':' header delimiter and was retained as raw text.",
          span: absoluteSpan(options, token.start, token.end),
          hint: "Use: case REQ_Name \"description\": assume ...; guarantee ...;",
        });
        continue;
      }
      const nameToken = tokens[index + 1];
      const name = nameToken?.kind === "identifier" ? nameToken.value : `case_${token.start}`;
      const description = descriptionBetween(tokens, index + 2, headerEnd - 1);
      const colon = tokens[headerEnd];
      activeCase = {
        token,
        name,
        ...(description === undefined ? {} : { description }),
        start: token.start,
        end: colon?.end ?? token.end,
        clauses: [],
        rawHeader: options.body.slice(token.start, colon?.end ?? token.end),
        traceIds: leadingTraceIds(options.body, allTokens, token.start),
      };
      index = headerEnd;
      continue;
    }

    const isClause = token.value === "assume" || token.value === "guarantee";
    const isInvariant = token.value === "inv" && phase === "invariants";
    const isFunction = token.value === "def" && phase === "functions";
    const isState = phase === "state" && token.kind === "identifier";
    if (!isClause && !isInvariant && !isFunction && !isState) continue;

    const endIndex = declarationEnd(tokens, index + 1);
    const endToken = tokens[endIndex] ?? token;
    const delimiter = colonIndex(tokens, index + 1, endIndex);
    const candidateName = tokens[index + 1];
    const hasNamedPrefix =
      isState ||
      (delimiter >= 0 && candidateName?.kind === "identifier" && candidateName.value !== "true");
    const generatedKind = isInvariant
      ? "invariant"
      : isFunction
        ? "function"
        : isState
          ? "state"
          : token.value;
    const name = isState
      ? token.value
      : hasNamedPrefix && candidateName !== undefined
        ? candidateName.value
        : `${generatedKind}_${token.start}`;
    const description = hasNamedPrefix
      ? descriptionBetween(tokens, index + 2, delimiter - 1)
      : undefined;
    const expressionStart = delimiter >= 0
      ? (tokens[delimiter]?.end ?? token.end)
      : (tokens[index + 1]?.start ?? token.end);
    const expressionEnd = endToken.text === ";" ? endToken.start : endToken.end;
    const expression = options.body.slice(expressionStart, expressionEnd).trim();
    const raw = options.body.slice(token.start, endToken.end);
    const contractKind: GumboContractKind = isInvariant
      ? "invariant"
      : isFunction
        ? "function"
        : isState
          ? "state"
          : token.value === "assume"
            ? "assume"
            : "guarantee";

    if (isClause && activeCase !== undefined) {
      const clause: GumboClause = {
        kind: token.value === "assume" ? "assume" : "guarantee",
        ...(hasNamedPrefix ? { name } : {}),
        ...(description === undefined ? {} : { description }),
        expression,
        raw,
        referencedPortIds: referencedPorts(expression, options.ports),
        traceIds: leadingTraceIds(options.body, allTokens, token.start),
        span: absoluteSpan(options, token.start, endToken.end),
      };
      activeCase.clauses.push(clause);
      activeCase.end = endToken.end;
    } else {
      addContract(
        makeContract(
          contractKind,
          name,
          phase,
          description,
          expression,
          raw,
          token.start,
          endToken.end,
          [],
          leadingTraceIds(options.body, allTokens, token.start),
        ),
      );
    }
    index = endIndex;
  }
  finishCase();

  contracts.sort((left, right) => left.span.start.offset - right.span.start.offset);
  requirements.sort((left, right) => left.span.start.offset - right.span.start.offset);
  return { contracts, requirements, diagnostics };
}
