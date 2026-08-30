#!/usr/bin/env node
import { readFile, writeFile } from "node:fs/promises";
import { createHash } from "node:crypto";
import path from "node:path";

import { startSysmlVizServer } from "@sysml-viz/server";

import {
  booleanOption,
  nonNegativeIntegerOption,
  parseArguments,
  positiveIntegerOption,
  stringOption,
  stringOptions,
  type ParsedArguments,
} from "./arguments.js";
import { HELP } from "./help.js";
import { ApiClient } from "./http.js";
import { errorEnvelope } from "./errors.js";
import {
  createExportMetadata,
  diagramHealthState,
  exportSessionState,
  traceabilityState,
  resolveMetadataPath,
  serializeExportMetadata,
  type ExportFormat,
} from "./export-metadata.js";

function requireOption(args: ParsedArguments, name: string): string {
  const value = stringOption(args, name);
  if (!value) {
    throw new Error(`Missing required option --${name}`);
  }
  return value;
}

function numberOption(args: ParsedArguments, name: string, fallback?: number): number | undefined {
  const text = stringOption(args, name);
  if (text === undefined) {
    return fallback;
  }
  const value = Number(text);
  if (!Number.isFinite(value)) {
    throw new Error(`--${name} must be a number, received '${text}'`);
  }
  return value;
}

function visibilityOption(args: ParsedArguments, name: string): boolean | undefined {
  const value = stringOption(args, name)?.toLowerCase();
  if (value === undefined) return undefined;
  if (["show", "on", "true"].includes(value)) return true;
  if (["hide", "off", "false"].includes(value)) return false;
  throw new Error(`--${name} must be show or hide, received '${value}'`);
}

function enumOption(args: ParsedArguments, name: string, allowed: readonly string[], fallback?: string): string | undefined {
  const value = stringOption(args, name, fallback);
  if (value !== undefined && !allowed.includes(value)) {
    throw new Error(`--${name} must be one of ${allowed.join(", ")}, received '${value}'`);
  }
  return value;
}

function bendPoints(args: ParsedArguments): Array<{ x: number; y: number }> {
  return stringOptions(args, "bend").map((value) => {
    const [xText, yText, extra] = value.split(",");
    const x = Number(xText);
    const y = Number(yText);
    if (extra !== undefined || !Number.isFinite(x) || !Number.isFinite(y)) {
      throw new Error(`--bend must use X,Y, received '${value}'`);
    }
    return { x, y };
  });
}

function endpoint(args: ParsedArguments): ApiClient {
  return new ApiClient({
    server: stringOption(args, "server", process.env.SYSML_VIZ_SERVER ?? "http://127.0.0.1:4782") as string,
  });
}

function body(value: Record<string, unknown>): RequestInit {
  return { method: "POST", body: JSON.stringify(value) };
}

function mutationContext(args: ParsedArguments): Record<string, unknown> {
  return {
    actor: stringOption(args, "actor", "cli"),
    client: "cli",
    dryRun: booleanOption(args, "dry-run"),
  };
}

function mutationBody(args: ParsedArguments, value: Record<string, unknown> = {}): RequestInit {
  return body({ ...value, ...mutationContext(args) });
}

function unwrap(value: unknown): unknown {
  if (typeof value === "object" && value !== null && "data" in value) {
    return (value as { data: unknown }).data;
  }
  return value;
}

function print(value: unknown, json: boolean, verbose = false): void {
  if (json) {
    process.stdout.write(`${JSON.stringify(value, null, 2)}\n`);
    return;
  }
  const data = unwrap(value);
  if (!verbose && typeof data === "object" && data !== null) {
    const record = data as Record<string, unknown>;
    if (record.dryRun === true && typeof record.operation === "string") {
      process.stdout.write(`${record.operation} (dry run)\nIDs: ${JSON.stringify(record.resolvedIds ?? [])}\nRevision: ${String(record.baseViewRevision ?? "?")}\n`);
      return;
    }
    if (typeof record.operation === "string" && Array.isArray(record.targetIds)) {
      process.stdout.write(
        `${record.operation}\nIDs: ${JSON.stringify(record.targetIds)}\nChanged: ${JSON.stringify(record.changedFields ?? [])}\nRevision: ${String(record.viewRevision ?? "?")}\n`,
      );
      return;
    }
  }
  if (typeof data === "string") {
    process.stdout.write(`${data}\n`);
  } else {
    process.stdout.write(`${JSON.stringify(data, null, 2)}\n`);
  }
}

async function execute(args: ParsedArguments): Promise<void> {
  const command = args.command.join(" ");
  const json = booleanOption(args, "json");
  if (!command || command === "help" || booleanOption(args, "help")) {
    process.stdout.write(HELP);
    return;
  }

  if (command === "serve") {
    const root = stringOption(args, "root");
    const validationDebounceMs = nonNegativeIntegerOption(args, "validation-debounce-ms");
    const server = await startSysmlVizServer({
      ...(root ? { root } : {}),
      workspaceRoot: stringOption(args, "workspace-root", process.cwd()) as string,
      libraryRoots: stringOptions(args, "library"),
      include: stringOptions(args, "include"),
      exclude: stringOptions(args, "exclude"),
      host: stringOption(args, "host", "127.0.0.1") as string,
      port: numberOption(args, "port", 4782) as number,
      ...(stringOption(args, "sireum") === undefined
        ? {}
        : { sireum: stringOption(args, "sireum") as string }),
      validateOnStart: booleanOption(args, "validate-on-start"),
      ...(validationDebounceMs === undefined ? {} : { validationDebounceMs }),
    });
    process.stdout.write(
      `${server.root ? `SysML Viz is serving ${server.root}` : "SysML Viz is ready for project selection"}\nWorkspace boundary: ${server.workspaceRoot}\nUI: ${server.url}\nSession API: ${server.url}/api/session\n`,
    );
    await server.closed;
    return;
  }

  const client = endpoint(args);
  const mutateCollection = async (
    viewId: string,
    key: "annotations" | "presentationNodes" | "presentationEdges" | "constraints",
    itemId: string,
    mode: "add" | "update" | "remove",
    item?: Record<string, unknown>,
  ): Promise<unknown> => {
    const current = unwrap(await client.json(`/api/views/${encodeURIComponent(viewId)}`)) as Record<string, unknown>;
    const collection = Array.isArray(current[key]) ? [...current[key] as Array<Record<string, unknown>>] : [];
    const index = collection.findIndex((candidate) => candidate.id === itemId);
    if (mode === "add" && index >= 0) throw new Error(`${key} ID '${itemId}' already exists`);
    if (mode !== "add" && index < 0) throw new Error(`${key} ID '${itemId}' does not exist`);
    if (mode === "add") collection.push({ id: itemId, ...item });
    if (mode === "update") collection[index] = { ...collection[index], ...item, id: itemId };
    if (mode === "remove") collection.splice(index, 1);
    return await client.json(`/api/views/${encodeURIComponent(viewId)}`, {
      method: "PATCH",
      body: JSON.stringify({ [key]: collection, targetIds: [itemId], ...mutationContext(args) }),
    });
  };
  let response: unknown;
  switch (command) {
    case "session inspect":
      response = await client.json("/api/session");
      break;
    case "model summarize":
      response = await client.json("/api/model");
      break;
    case "model validate":
      response = await client.json("/api/validate", body({}));
      break;
    case "model search": {
      const query = new URLSearchParams({ query: requireOption(args, "query") });
      const limit = positiveIntegerOption(args, "limit");
      if (limit !== undefined) query.set("limit", String(limit));
      response = await client.json(`/api/search?${query.toString()}`);
      break;
    }
    case "element inspect":
      response = await client.json(`/api/elements/${encodeURIComponent(requireOption(args, "id"))}`);
      break;
    case "requirement find":
      response = await client.json(
        `/api/requirements?query=${encodeURIComponent(requireOption(args, "query"))}`,
      );
      break;
    case "view list":
      response = await client.json("/api/views");
      break;
    case "view show":
      response = await client.json(`/api/views/${encodeURIComponent(requireOption(args, "id"))}`);
      if (booleanOption(args, "activate")) {
        response = await client.json(
          `/api/views/${encodeURIComponent(requireOption(args, "id"))}/activate`,
          mutationBody(args),
        );
      }
      break;
    case "view activate":
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "id"))}/activate`,
        mutationBody(args),
      );
      break;
    case "view create": {
      const id = requireOption(args, "id");
      response = await client.json(
        `/api/views/${encodeURIComponent(id)}`,
        mutationBody(args, {
          name: requireOption(args, "name"),
          rootId: stringOption(args, "root-element") ?? null,
        }),
      );
      if (!booleanOption(args, "dry-run")) {
        await client.json(
          `/api/views/${encodeURIComponent(id)}/activate`,
          mutationBody(args),
        );
      }
      break;
    }
    case "view filter": {
      const id = requireOption(args, "id");
      const current = unwrap(await client.json(`/api/views/${encodeURIComponent(id)}`)) as {
        hidden?: string[];
      };
      const hidden = new Set(booleanOption(args, "show-all") ? [] : (current.hidden ?? []));
      for (const element of stringOptions(args, "hide")) hidden.add(element);
      for (const element of stringOptions(args, "show")) hidden.delete(element);
      response = await client.json(`/api/views/${encodeURIComponent(id)}`, {
        method: "PATCH",
        body: JSON.stringify({ hidden: [...hidden], ...mutationContext(args) }),
      });
      break;
    }
    case "view expand": {
      const id = requireOption(args, "id");
      const element = requireOption(args, "element");
      const current = unwrap(await client.json(`/api/views/${encodeURIComponent(id)}`)) as {
        expanded?: string[];
      };
      const diagram = unwrap(
        await client.json(`/api/diagram?view=${encodeURIComponent(id)}`),
      ) as {
        nodes?: Array<{
          id?: string;
          elementId?: string;
          definitionId?: string;
          label?: string;
        }>;
      };
      const matches = (diagram.nodes ?? []).filter((node) =>
        node.id === element ||
        node.elementId === element ||
        node.definitionId === element ||
        node.label === element
      );
      const canonicalElement = matches.length === 1
        ? matches[0]?.elementId ?? element
        : element;
      const expanded = new Set(current.expanded ?? []);
      if (booleanOption(args, "collapse")) {
        expanded.delete(element);
        expanded.delete(canonicalElement);
      } else {
        expanded.add(canonicalElement);
      }
      response = await client.json(`/api/views/${encodeURIComponent(id)}`, {
        method: "PATCH",
        body: JSON.stringify({ expanded: [...expanded], ...mutationContext(args) }),
      });
      break;
    }
    case "view alias": {
      const id = requireOption(args, "id");
      const element = requireOption(args, "element");
      const current = unwrap(await client.json(`/api/views/${encodeURIComponent(id)}`)) as {
        aliases?: Record<string, string>;
      };
      response = await client.json(`/api/views/${encodeURIComponent(id)}`, {
        method: "PATCH",
        body: JSON.stringify({
          aliases: { ...(current.aliases ?? {}), [element]: requireOption(args, "label") },
          ...mutationContext(args),
        }),
      });
      break;
    }
    case "view annotate": {
      const id = requireOption(args, "id");
      const current = unwrap(await client.json(`/api/views/${encodeURIComponent(id)}`)) as {
        annotations?: Array<Record<string, unknown>>;
      };
      const annotation = {
        id: requireOption(args, "annotation-id"),
        text: requireOption(args, "text"),
        position: { x: numberOption(args, "x", 0), y: numberOption(args, "y", 0) },
        ...(stringOption(args, "element") ? { linkedElementId: stringOption(args, "element") } : {}),
        style: enumOption(args, "style", ["info", "success", "warning", "error"], "info"),
        ...(stringOption(args, "arrow-to")
          ? {
              arrow: {
                targetId: stringOption(args, "arrow-to"),
                targetKind: enumOption(args, "arrow-kind", ["node", "port"], "node"),
              },
            }
          : {}),
      };
      response = await client.json(`/api/views/${encodeURIComponent(id)}`, {
        method: "PATCH",
        body: JSON.stringify({
          annotations: [...(current.annotations ?? []), annotation],
          ...mutationContext(args),
        }),
      });
      break;
    }
    case "view annotation update": {
      const item: Record<string, unknown> = {};
      if (stringOption(args, "text") !== undefined) item.text = stringOption(args, "text");
      const x = numberOption(args, "x");
      const y = numberOption(args, "y");
      if ((x === undefined) !== (y === undefined)) throw new Error("annotation update requires both --x and --y");
      if (x !== undefined && y !== undefined) item.position = { x, y };
      if (stringOption(args, "style") !== undefined) item.style = enumOption(args, "style", ["info", "success", "warning", "error"]);
      if (stringOption(args, "arrow-to") !== undefined) item.arrow = {
        targetId: stringOption(args, "arrow-to"),
        targetKind: enumOption(args, "arrow-kind", ["node", "port"], "node"),
      };
      if (Object.keys(item).length === 0) throw new Error("annotation update requires at least one changed field");
      response = await mutateCollection(requireOption(args, "view"), "annotations", requireOption(args, "annotation-id"), "update", item);
      break;
    }
    case "view annotation remove":
      response = await mutateCollection(requireOption(args, "view"), "annotations", requireOption(args, "annotation-id"), "remove");
      break;
    case "view presentation node add":
    case "view presentation node update": {
      const mode = command.endsWith("add") ? "add" : "update";
      const item: Record<string, unknown> = {};
      const label = stringOption(args, "label");
      const kind = stringOption(args, "kind");
      const x = numberOption(args, "x");
      const y = numberOption(args, "y");
      const width = numberOption(args, "width");
      const height = numberOption(args, "height");
      if (mode === "add" && (label === undefined || kind === undefined || x === undefined || y === undefined)) {
        throw new Error("presentation node add requires --label, --kind, --x, and --y");
      }
      if (label !== undefined) item.label = label;
      if (kind !== undefined) item.kind = enumOption(args, "kind", ["actor", "reference"]);
      if (x !== undefined) item.x = x;
      if (y !== undefined) item.y = y;
      if (width !== undefined) item.width = width;
      if (height !== undefined) item.height = height;
      if (mode === "update" && Object.keys(item).length === 0) {
        throw new Error("presentation node update requires at least one changed field");
      }
      response = await mutateCollection(requireOption(args, "view"), "presentationNodes", requireOption(args, "presentation-id"), mode, item);
      break;
    }
    case "view presentation node remove":
      response = await mutateCollection(requireOption(args, "view"), "presentationNodes", requireOption(args, "presentation-id"), "remove");
      break;
    case "view presentation edge add":
    case "view presentation edge update": {
      const mode = command.endsWith("add") ? "add" : "update";
      const item: Record<string, unknown> = {};
      const source = stringOption(args, "source");
      const target = stringOption(args, "target");
      const kind = stringOption(args, "kind");
      if (mode === "add" && (source === undefined || target === undefined || kind === undefined)) {
        throw new Error("presentation edge add requires --source, --target, and --kind");
      }
      if (source !== undefined) item.sourceId = source;
      if (target !== undefined) item.targetId = target;
      if (kind !== undefined) item.kind = enumOption(args, "kind", ["reference", "informational"]);
      if (stringOption(args, "label") !== undefined) item.label = stringOption(args, "label");
      if (args.options.bend !== undefined) item.bendPoints = bendPoints(args);
      if (mode === "update" && Object.keys(item).length === 0) {
        throw new Error("presentation edge update requires at least one changed field");
      }
      response = await mutateCollection(requireOption(args, "view"), "presentationEdges", requireOption(args, "presentation-id"), mode, item);
      break;
    }
    case "view presentation edge remove":
      response = await mutateCollection(requireOption(args, "view"), "presentationEdges", requireOption(args, "presentation-id"), "remove");
      break;
    case "view style": {
      const id = requireOption(args, "id");
      const showPorts = visibilityOption(args, "ports");
      const showEdgeLabels = visibilityOption(args, "edge-labels");
      const showTypes = visibilityOption(args, "types");
      if (showPorts === undefined && showEdgeLabels === undefined && showTypes === undefined) {
        throw new Error("view style requires --ports, --edge-labels, or --types with show|hide");
      }
      response = await client.json(`/api/views/${encodeURIComponent(id)}`, {
        method: "PATCH",
        body: JSON.stringify({
          ...(showPorts === undefined ? {} : { showPorts }),
          ...(showEdgeLabels === undefined ? {} : { showEdgeLabels }),
          ...(showTypes === undefined ? {} : { showTypes }),
          ...mutationContext(args),
        }),
      });
      break;
    }
    case "layout move": {
      const relativeTo = stringOption(args, "relative-to");
      const x = numberOption(args, "x");
      const y = numberOption(args, "y");
      if (relativeTo) {
        if (x !== undefined || y !== undefined) {
          throw new Error("layout move accepts either --x/--y or --relative-to with --dx/--dy, not both");
        }
      } else if (x === undefined || y === undefined) {
        throw new Error("layout move requires both --x and --y, or --relative-to with optional --dx/--dy");
      }
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/move`,
        mutationBody(args, {
          id: requireOption(args, "id"),
          ...(relativeTo
            ? {
                relativeTo,
                dx: numberOption(args, "dx", 0),
                dy: numberOption(args, "dy", 0),
              }
            : { x, y }),
          ...(!booleanOption(args, "pin") ? {} : { pinned: true }),
        }),
      );
      break;
    }
    case "layout resize": {
      const fit = booleanOption(args, "fit");
      const width = numberOption(args, "width");
      const height = numberOption(args, "height");
      const x = numberOption(args, "x");
      const y = numberOption(args, "y");
      if ((x === undefined) !== (y === undefined)) throw new Error("layout resize requires --x and --y together");
      if (fit && (width !== undefined || height !== undefined || x !== undefined || y !== undefined)) {
        throw new Error("layout resize accepts either --fit or --width and --height");
      }
      if (!fit && (width === undefined || height === undefined)) {
        throw new Error("layout resize requires --width and --height, or --fit");
      }
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/resize`,
        mutationBody(args, {
          id: requireOption(args, "id"),
          ...(fit ? { fit: true } : { width, height, ...(x === undefined ? {} : { x, y }) }),
        }),
      );
      break;
    }
    case "layout pin":
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/pin`,
        mutationBody(args, { id: requireOption(args, "id"), pinned: !booleanOption(args, "off") }),
      );
      break;
    case "layout apply":
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/apply`,
        mutationBody(args),
      );
      break;
    case "layout align":
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/align`,
        mutationBody(args, {
          ids: stringOptions(args, "id"),
          alignment: requireOption(args, "alignment"),
          pinned: !booleanOption(args, "no-pin"),
        }),
      );
      break;
    case "layout distribute":
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/distribute`,
        mutationBody(args, {
          ids: stringOptions(args, "id"),
          axis: requireOption(args, "axis"),
          pinned: !booleanOption(args, "no-pin"),
        }),
      );
      break;
    case "layout reset":
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/reset`,
        mutationBody(args),
      );
      break;
    case "layout constrain":
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/constraint`,
        mutationBody(args, {
          subjectId: requireOption(args, "id"),
          relation: requireOption(args, "relation"),
          objectId: requireOption(args, "relative-to"),
          gap: numberOption(args, "gap", 40),
        }),
      );
      break;
    case "layout constraint list": {
      const view = unwrap(await client.json(`/api/views/${encodeURIComponent(requireOption(args, "view"))}`)) as { constraints?: unknown[] };
      response = { ok: true, data: view.constraints ?? [] };
      break;
    }
    case "layout constraint remove":
      response = await mutateCollection(requireOption(args, "view"), "constraints", requireOption(args, "constraint-id"), "remove");
      break;
    case "layout template export": {
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/template`,
      );
      const output = path.resolve(requireOption(args, "out"));
      await writeFile(output, `${JSON.stringify(unwrap(response), null, 2)}\n`, "utf8");
      response = { output, operation: "layout.template.export", targetIds: [], changedFields: [], viewRevision: "unchanged" };
      break;
    }
    case "layout template apply": {
      const template = JSON.parse(await readFile(path.resolve(requireOption(args, "in")), "utf8")) as unknown;
      const mapping = Object.fromEntries(stringOptions(args, "map").map((entry) => {
        const separator = entry.indexOf("=");
        if (separator < 1 || separator === entry.length - 1) {
          throw new Error("--map must use SOURCE=TARGET");
        }
        return [entry.slice(0, separator), entry.slice(separator + 1)];
      }));
      response = await client.json(
        `/api/views/${encodeURIComponent(requireOption(args, "view"))}/layout/template`,
        mutationBody(args, { template, mapping }),
      );
      break;
    }
    case "diagram health": {
      const view = stringOption(args, "view");
      const root = stringOption(args, "root-element");
      const query = new URLSearchParams();
      if (view) query.set("view", view);
      if (root) query.set("root", root);
      response = await client.json(`/api/diagram/health${query.size ? `?${query.toString()}` : ""}`);
      break;
    }
    case "checkpoint create":
      response = await client.json(
        "/api/checkpoints",
        body({
          name: requireOption(args, "name"),
          message: stringOption(args, "message"),
          author: stringOption(args, "author"),
        }),
      );
      break;
    case "render export": {
      const requestedFormat = stringOption(args, "format", "svg");
      if (requestedFormat !== "svg" && requestedFormat !== "png") {
        throw new Error("--format must be svg or png");
      }
      const format: ExportFormat = requestedFormat;
      const output = path.resolve(requireOption(args, "out"));
      const view = stringOption(args, "view");
      const query = new URLSearchParams({ format });
      if (view) {
        query.set("view", view);
      }
      const root = stringOption(args, "root-element");
      if (root) {
        query.set("root", root);
      }
      const metadataOutput = resolveMetadataPath(
        output,
        stringOption(args, "metadata"),
        booleanOption(args, "no-metadata"),
        format,
      );
      const rendered = await client.binary(`/api/render?${query.toString()}`);
      const sha256 = createHash("sha256").update(rendered.bytes).digest("hex");
      let serializedMetadata: string | undefined;
      if (metadataOutput !== null) {
        const healthQuery = new URLSearchParams();
        if (view) healthQuery.set("view", view);
        if (root) healthQuery.set("root", root);
        const [sessionResponse, healthResponse, traceabilityResponse] = await Promise.all([
          client.json("/api/session"),
          client.json(
            `/api/diagram/health${healthQuery.size > 0 ? `?${healthQuery.toString()}` : ""}`,
          ),
          client.json("/api/traceability/system-abstract"),
        ]);
        const metadata = createExportMetadata({
          artifactPath: output,
          format,
          bytes: rendered.bytes,
          ...(view === undefined ? {} : { requestedView: view }),
          ...(root === undefined ? {} : { requestedRoot: root }),
          session: exportSessionState(unwrap(sessionResponse)),
          diagramHealth: diagramHealthState(unwrap(healthResponse)),
          traceability: traceabilityState(unwrap(traceabilityResponse)),
        });
        serializedMetadata = serializeExportMetadata(metadata);
      }
      await writeFile(output, rendered.bytes);
      if (metadataOutput !== null && serializedMetadata !== undefined) {
        await writeFile(metadataOutput, serializedMetadata, "utf8");
      }
      response = {
        ok: true,
        data: {
          output,
          metadata: metadataOutput,
          format,
          bytes: rendered.bytes.byteLength,
          sha256,
        },
      };
      break;
    }
    default:
      throw new Error(`Unknown command '${command}'. Run with --help for the supported commands.`);
  }
  const mutationCommands = /^(view (activate|create|filter|expand|alias|annotate|annotation|presentation|style)|layout )/u;
  if (
    !json &&
    !booleanOption(args, "verbose") &&
    command !== "layout template export" &&
    command !== "layout constraint list" &&
    mutationCommands.test(command) &&
    !booleanOption(args, "dry-run")
  ) {
    const document = unwrap(await client.json("/api/views")) as { mutations?: unknown[] };
    const latest = document.mutations?.at(-1);
    print(latest ?? response, false);
  } else {
    print(response, json, booleanOption(args, "verbose"));
  }
}

const parsedArguments = parseArguments(process.argv.slice(2));
execute(parsedArguments).catch((error: unknown) => {
  if (booleanOption(parsedArguments, "json")) {
    process.stderr.write(`${JSON.stringify(errorEnvelope(error), null, 2)}\n`);
  } else {
    process.stderr.write(`sysml-viz: ${(error as Error).message}\n`);
  }
  process.exitCode = 1;
});
