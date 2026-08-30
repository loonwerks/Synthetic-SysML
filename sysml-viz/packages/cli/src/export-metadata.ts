import { createHash } from "node:crypto";
import path from "node:path";

export type ExportFormat = "svg" | "png";

export interface ExportSessionState {
  readonly root: string;
  readonly libraryRoots: readonly string[];
  readonly revision: number;
  readonly parseStatus: string;
  readonly validation: unknown;
}

export interface ExportMetadata {
  readonly schemaVersion: 1;
  readonly artifact: {
    readonly path: string;
    readonly format: ExportFormat;
    readonly bytes: number;
    readonly sha256: string;
  };
  readonly request: {
    readonly view: string | null;
    readonly root: string | null;
  };
  readonly session: ExportSessionState;
  readonly diagramHealth: Readonly<Record<string, unknown>>;
  readonly traceability: ExportTraceabilityState;
}

export interface ExportTraceabilityState {
  readonly available: boolean;
  readonly relativePath: string | null;
  readonly anchorCount: number;
  readonly taggedElementCount: number;
  readonly traceAssociationCount: number;
  readonly referencedTraceIds: readonly string[];
  readonly unresolvedTraceIds: readonly string[];
  readonly duplicateAnchorIds: readonly string[];
}

export interface CreateExportMetadataOptions {
  readonly artifactPath: string;
  readonly format: ExportFormat;
  readonly bytes: Uint8Array;
  readonly requestedView?: string;
  readonly requestedRoot?: string;
  readonly session: ExportSessionState;
  readonly diagramHealth: Readonly<Record<string, unknown>>;
  readonly traceability: ExportTraceabilityState;
}

function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}

function requiredString(record: Readonly<Record<string, unknown>>, name: string): string {
  const value = record[name];
  if (typeof value !== "string") {
    throw new Error(`Session metadata field '${name}' must be a string`);
  }
  return value;
}

function requiredInteger(record: Readonly<Record<string, unknown>>, name: string): number {
  const value = record[name];
  if (typeof value !== "number" || !Number.isInteger(value) || value < 0) {
    throw new Error(`Traceability field '${name}' must be a non-negative integer`);
  }
  return value;
}

/** Validate and retain only the bounded-session fields promised by an export sidecar. */
export function exportSessionState(value: unknown): ExportSessionState {
  if (!isRecord(value)) {
    throw new Error("Session metadata response must be an object");
  }
  if (typeof value.revision !== "number" || !Number.isInteger(value.revision)) {
    throw new Error("Session metadata field 'revision' must be an integer");
  }
  if (!Array.isArray(value.libraryRoots) || !value.libraryRoots.every((root) => typeof root === "string")) {
    throw new Error("Session metadata field 'libraryRoots' must be an array of strings");
  }
  if (value.validation === undefined) {
    throw new Error("Session metadata response is missing 'validation'");
  }
  return {
    root: requiredString(value, "root"),
    libraryRoots: [...value.libraryRoots],
    revision: value.revision,
    parseStatus: requiredString(value, "parseStatus"),
    validation: value.validation,
  };
}

export function diagramHealthState(value: unknown): Readonly<Record<string, unknown>> {
  if (!isRecord(value)) {
    throw new Error("Diagram health response must be an object");
  }
  return value;
}

export function traceabilityState(value: unknown): ExportTraceabilityState {
  if (value === null) {
    return {
      available: false,
      relativePath: null,
      anchorCount: 0,
      taggedElementCount: 0,
      traceAssociationCount: 0,
      referencedTraceIds: [],
      unresolvedTraceIds: [],
      duplicateAnchorIds: [],
    };
  }
  if (!isRecord(value) || !Array.isArray(value.anchors)) {
    throw new Error("Traceability response must be null or a System Abstract object");
  }
  const stringArray = (name: string): string[] => {
    const candidate = value[name];
    if (!Array.isArray(candidate) || !candidate.every((item) => typeof item === "string")) {
      throw new Error(`Traceability field '${name}' must be an array of strings`);
    }
    return [...candidate];
  };
  return {
    available: true,
    relativePath: requiredString(value, "relativePath"),
    anchorCount: value.anchors.length,
    taggedElementCount: requiredInteger(value, "taggedElementCount"),
    traceAssociationCount: requiredInteger(value, "traceAssociationCount"),
    referencedTraceIds: stringArray("referencedTraceIds"),
    unresolvedTraceIds: stringArray("unresolvedTraceIds"),
    duplicateAnchorIds: stringArray("duplicateAnchorIds"),
  };
}

export function defaultMetadataPath(artifactPath: string): string {
  return `${path.resolve(artifactPath)}.json`;
}

export function resolveMetadataPath(
  artifactPath: string,
  requestedMetadataPath: string | undefined,
  suppressed: boolean,
  format: ExportFormat = "svg",
): string | null {
  if (suppressed) return null;
  if (requestedMetadataPath === undefined && format === "png") return null;
  const artifact = path.resolve(artifactPath);
  const metadata = requestedMetadataPath === undefined
    ? defaultMetadataPath(artifact)
    : path.resolve(requestedMetadataPath);
  if (metadata === artifact) {
    throw new Error("--metadata must not overwrite the exported artifact");
  }
  return metadata;
}

export function createExportMetadata(options: CreateExportMetadataOptions): ExportMetadata {
  return {
    schemaVersion: 1,
    artifact: {
      path: path.resolve(options.artifactPath),
      format: options.format,
      bytes: options.bytes.byteLength,
      sha256: createHash("sha256").update(options.bytes).digest("hex"),
    },
    request: {
      view: options.requestedView ?? null,
      root: options.requestedRoot ?? null,
    },
    session: {
      root: options.session.root,
      libraryRoots: [...options.session.libraryRoots],
      revision: options.session.revision,
      parseStatus: options.session.parseStatus,
      validation: options.session.validation,
    },
    diagramHealth: options.diagramHealth,
    traceability: options.traceability,
  };
}

function canonicalize(value: unknown): unknown {
  if (Array.isArray(value)) return value.map(canonicalize);
  if (isRecord(value)) {
    return Object.fromEntries(
      Object.keys(value)
        .sort()
        .filter((key) => value[key] !== undefined)
        .map((key) => [key, canonicalize(value[key])]),
    );
  }
  return value;
}

/** Stable key ordering and a final newline make sidecars diff- and hash-friendly. */
export function serializeExportMetadata(metadata: ExportMetadata): string {
  const stable = {
    schemaVersion: metadata.schemaVersion,
    artifact: metadata.artifact,
    request: metadata.request,
    session: {
      root: metadata.session.root,
      libraryRoots: metadata.session.libraryRoots,
      revision: metadata.session.revision,
      parseStatus: metadata.session.parseStatus,
      validation: canonicalize(metadata.session.validation),
    },
    diagramHealth: canonicalize(metadata.diagramHealth),
    traceability: canonicalize(metadata.traceability),
  };
  return `${JSON.stringify(stable, null, 2)}\n`;
}
