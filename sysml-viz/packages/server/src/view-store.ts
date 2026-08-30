import { randomUUID } from "node:crypto";
import { lstat, mkdir, readFile, realpath, rename, writeFile } from "node:fs/promises";
import path from "node:path";

import type {
  Checkpoint,
  ValidationStatus,
  ViewDocument,
  ViewMutationInput,
  ViewMutationRecord,
  ViewState,
} from "./types.js";

const SCHEMA_VERSION = 2 as const;
export const MAX_VIEW_MUTATIONS = 200;

function now(): string {
  return new Date().toISOString();
}

export function createDefaultView(rootId: string | null = null): ViewState {
  return {
    id: "architecture",
    name: "Architecture",
    rootId,
    positions: {},
    edgeRoutes: {},
    hidden: [],
    expanded: [],
    aliases: {},
    annotations: [],
    constraints: [],
    presentationNodes: [],
    presentationEdges: [],
    showPorts: true,
    showEdgeLabels: true,
    showTypes: true,
    camera: { x: 0, y: 0, zoom: 1 },
    updatedAt: now(),
  };
}

function createDocument(rootId: string | null = null): ViewDocument {
  return {
    schemaVersion: SCHEMA_VERSION,
    viewRevision: 0,
    activeViewId: "architecture",
    views: [createDefaultView(rootId)],
    mutations: [],
  };
}

function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}

function finite(value: unknown): value is number {
  return typeof value === "number" && Number.isFinite(value);
}

function stringArray(value: unknown): value is string[] {
  return Array.isArray(value) && value.every((item) => typeof item === "string");
}

function malformed(message: string): never {
  throw new Error(`Malformed .sysmlviz/views.json: ${message}`);
}

function validatePoint(value: unknown, label: string): void {
  if (!isRecord(value) || !finite(value.x) || !finite(value.y)) {
    malformed(`${label} must contain finite numeric x/y coordinates`);
  }
}

function validateEdgeAttachment(value: unknown, label: string): void {
  if (
    !isRecord(value) ||
    !["top", "right", "bottom", "left"].includes(String(value.side)) ||
    !finite(value.offset) ||
    value.offset < 0 ||
    value.offset > 1
  ) {
    malformed(`${label} must contain side top/right/bottom/left and an offset between 0 and 1`);
  }
}

function validateView(value: unknown, index: number): asserts value is ViewState {
  if (!isRecord(value)) malformed(`views[${index}] must be an object`);
  const label = `views[${index}]`;
  if (typeof value.id !== "string" || !value.id) malformed(`${label}.id must be a non-empty string`);
  if (typeof value.name !== "string" || !value.name) malformed(`${label}.name must be a non-empty string`);
  if (
    value.preset !== undefined &&
    (!isRecord(value.preset) ||
      typeof value.preset.id !== "string" ||
      !value.preset.id ||
      !finite(value.preset.version) ||
      !Number.isInteger(value.preset.version) ||
      value.preset.version < 1)
  ) {
    malformed(`${label}.preset must contain a non-empty id and positive integer version`);
  }
  if (!(typeof value.rootId === "string" || value.rootId === null)) {
    malformed(`${label}.rootId must be a string or null`);
  }
  if (!isRecord(value.positions)) malformed(`${label}.positions must be an object`);
  for (const [id, position] of Object.entries(value.positions)) {
    if (!isRecord(position) || !finite(position.x) || !finite(position.y) || typeof position.pinned !== "boolean") {
      malformed(`${label}.positions[${JSON.stringify(id)}] must contain finite x/y and boolean pinned`);
    }
    if (position.width !== undefined && (!finite(position.width) || position.width <= 0)) {
      malformed(`${label}.positions[${JSON.stringify(id)}].width must be positive and finite`);
    }
    if (position.height !== undefined && (!finite(position.height) || position.height <= 0)) {
      malformed(`${label}.positions[${JSON.stringify(id)}].height must be positive and finite`);
    }
  }
  if (!isRecord(value.edgeRoutes)) malformed(`${label}.edgeRoutes must be an object`);
  for (const [id, route] of Object.entries(value.edgeRoutes)) {
    if (!isRecord(route) || typeof route.pinned !== "boolean" || !Array.isArray(route.points)) {
      malformed(`${label}.edgeRoutes[${JSON.stringify(id)}] is invalid`);
    }
    route.points.forEach((point, pointIndex) =>
      validatePoint(point, `${label}.edgeRoutes[${JSON.stringify(id)}].points[${pointIndex}]`),
    );
    if (route.sourceAttachment !== undefined) {
      validateEdgeAttachment(
        route.sourceAttachment,
        `${label}.edgeRoutes[${JSON.stringify(id)}].sourceAttachment`,
      );
    }
    if (route.targetAttachment !== undefined) {
      validateEdgeAttachment(
        route.targetAttachment,
        `${label}.edgeRoutes[${JSON.stringify(id)}].targetAttachment`,
      );
    }
  }
  if (!stringArray(value.hidden) || !stringArray(value.expanded)) {
    malformed(`${label}.hidden and .expanded must be string arrays`);
  }
  if (!isRecord(value.aliases) || !Object.values(value.aliases).every((item) => typeof item === "string")) {
    malformed(`${label}.aliases must map IDs to strings`);
  }
  if (!Array.isArray(value.annotations)) malformed(`${label}.annotations must be an array`);
  value.annotations.forEach((annotation, annotationIndex) => {
    if (
      !isRecord(annotation) ||
      typeof annotation.id !== "string" ||
      typeof annotation.text !== "string"
    ) {
      malformed(`${label}.annotations[${annotationIndex}] must have string id/text`);
    }
    validatePoint(annotation.position, `${label}.annotations[${annotationIndex}].position`);
    if (annotation.linkedElementId !== undefined && typeof annotation.linkedElementId !== "string") {
      malformed(`${label}.annotations[${annotationIndex}].linkedElementId must be a string`);
    }
    if (annotation.style !== undefined && !["info", "success", "warning", "error"].includes(String(annotation.style))) {
      malformed(`${label}.annotations[${annotationIndex}].style is invalid`);
    }
    if (annotation.arrow !== undefined && (
      !isRecord(annotation.arrow) ||
      typeof annotation.arrow.targetId !== "string" ||
      !["node", "port"].includes(String(annotation.arrow.targetKind))
    )) malformed(`${label}.annotations[${annotationIndex}].arrow is invalid`);
  });
  if (!Array.isArray(value.constraints)) malformed(`${label}.constraints must be an array`);
  value.constraints.forEach((constraint, constraintIndex) => {
    if (!isRecord(constraint) || typeof constraint.id !== "string" ||
      !["above", "below", "left-of", "right-of"].includes(String(constraint.relation)) ||
      typeof constraint.subjectId !== "string" || typeof constraint.objectId !== "string" ||
      (constraint.gap !== undefined && (!finite(constraint.gap) || constraint.gap < 0))) {
      malformed(`${label}.constraints[${constraintIndex}] is invalid`);
    }
  });
  if (!Array.isArray(value.presentationNodes)) malformed(`${label}.presentationNodes must be an array`);
  value.presentationNodes.forEach((node, nodeIndex) => {
    if (!isRecord(node) || typeof node.id !== "string" || typeof node.label !== "string" ||
      !["actor", "reference"].includes(String(node.kind)) || !finite(node.x) || !finite(node.y)) {
      malformed(`${label}.presentationNodes[${nodeIndex}] is invalid`);
    }
  });
  if (!Array.isArray(value.presentationEdges)) malformed(`${label}.presentationEdges must be an array`);
  value.presentationEdges.forEach((edge, edgeIndex) => {
    if (!isRecord(edge) || typeof edge.id !== "string" ||
      typeof edge.sourceId !== "string" || typeof edge.targetId !== "string" ||
      !["reference", "informational"].includes(String(edge.kind)) ||
      (edge.bendPoints !== undefined && (
        !Array.isArray(edge.bendPoints) ||
        !edge.bendPoints.every((point) => isRecord(point) && finite(point.x) && finite(point.y))
      ))) {
      malformed(`${label}.presentationEdges[${edgeIndex}] is invalid`);
    }
  });
  if (value.showPorts !== undefined && typeof value.showPorts !== "boolean") {
    malformed(`${label}.showPorts must be a boolean`);
  }
  if (value.showEdgeLabels !== undefined && typeof value.showEdgeLabels !== "boolean") {
    malformed(`${label}.showEdgeLabels must be a boolean`);
  }
  if (value.showTypes !== undefined && typeof value.showTypes !== "boolean") {
    malformed(`${label}.showTypes must be a boolean`);
  }
  if (!isRecord(value.camera) || !finite(value.camera.x) || !finite(value.camera.y) || !finite(value.camera.zoom) || value.camera.zoom <= 0) {
    malformed(`${label}.camera must contain finite x/y and positive zoom`);
  }
  if (typeof value.updatedAt !== "string") malformed(`${label}.updatedAt must be a string`);
}

function validateDocument(value: unknown): ViewDocument {
  if (!isRecord(value) || ![1, SCHEMA_VERSION].includes(Number(value.schemaVersion)) || !Array.isArray(value.views)) {
    throw new Error("Unsupported or malformed .sysmlviz/views.json");
  }
  if (value.schemaVersion === 1) {
    value.schemaVersion = SCHEMA_VERSION;
    for (const candidate of value.views) {
      if (!isRecord(candidate)) continue;
      candidate.constraints ??= [];
      candidate.presentationNodes ??= [];
      candidate.presentationEdges ??= [];
      if (Array.isArray(candidate.annotations)) {
        for (const annotation of candidate.annotations) {
          if (isRecord(annotation)) annotation.style ??= "info";
        }
      }
    }
  }
  // Schema v1 predates the persisted session-wide view revision. Treat an
  // omitted value as revision zero so existing projects upgrade on next save.
  if (value.viewRevision === undefined) value.viewRevision = 0;
  if (!finite(value.viewRevision) || !Number.isInteger(value.viewRevision) || value.viewRevision < 0) {
    malformed("viewRevision must be a non-negative integer");
  }
  // The mutation ledger was added additively to schema v1. Old documents
  // acquire an empty ledger and persist it on their next visual mutation.
  if (value.mutations === undefined) value.mutations = [];
  if (!Array.isArray(value.mutations)) malformed("mutations must be an array");
  const clients = new Set(["cli", "web", "api", "system"]);
  value.mutations.forEach((mutation, index) => {
    const label = `mutations[${index}]`;
    if (
      !isRecord(mutation) ||
      typeof mutation.id !== "string" || !mutation.id ||
      typeof mutation.at !== "string" || !mutation.at ||
      typeof mutation.actor !== "string" || !mutation.actor ||
      typeof mutation.client !== "string" || !clients.has(mutation.client) ||
      typeof mutation.operation !== "string" || !mutation.operation ||
      typeof mutation.viewId !== "string" || !mutation.viewId ||
      !finite(mutation.modelRevision) || !Number.isInteger(mutation.modelRevision) || mutation.modelRevision < 0 ||
      !finite(mutation.viewRevision) || !Number.isInteger(mutation.viewRevision) || mutation.viewRevision < 0 ||
      !stringArray(mutation.targetIds) ||
      !stringArray(mutation.changedFields)
    ) {
      malformed(`${label} is invalid`);
    }
  });
  if (typeof value.activeViewId !== "string") {
    throw new Error("View document is missing activeViewId");
  }
  const ids = new Set<string>();
  value.views.forEach((view, index) => {
    validateView(view, index);
    if (ids.has(view.id)) malformed(`view ID '${view.id}' is duplicated`);
    ids.add(view.id);
  });
  if (!ids.has(value.activeViewId)) malformed(`activeViewId '${value.activeViewId}' does not exist`);
  return value as unknown as ViewDocument;
}

function validateCheckpoints(value: unknown): Checkpoint[] {
  if (!Array.isArray(value)) throw new Error("Malformed .sysmlviz/checkpoints.json: expected an array");
  const parseStatuses = new Set(["valid", "stale"]);
  const validationStatuses = new Set<ValidationStatus>([
    "not-run",
    "pending",
    "valid",
    "invalid",
    "stale",
    "tool-error",
  ]);
  for (const [index, checkpoint] of value.entries()) {
    if (isRecord(checkpoint) && checkpoint.viewRevision === undefined) {
      checkpoint.viewRevision = 0;
    }
    if (
      !isRecord(checkpoint) ||
      typeof checkpoint.id !== "string" || !checkpoint.id ||
      typeof checkpoint.name !== "string" || !checkpoint.name ||
      (checkpoint.message !== undefined && typeof checkpoint.message !== "string") ||
      (checkpoint.author !== undefined && typeof checkpoint.author !== "string") ||
      typeof checkpoint.createdAt !== "string" ||
      !finite(checkpoint.modelRevision) || !Number.isInteger(checkpoint.modelRevision) || checkpoint.modelRevision < 0 ||
      !finite(checkpoint.viewRevision) || !Number.isInteger(checkpoint.viewRevision) || checkpoint.viewRevision < 0 ||
      typeof checkpoint.viewId !== "string" || !checkpoint.viewId ||
      typeof checkpoint.parseStatus !== "string" || !parseStatuses.has(checkpoint.parseStatus) ||
      typeof checkpoint.validationStatus !== "string" ||
      !validationStatuses.has(checkpoint.validationStatus as ValidationStatus)
    ) {
      throw new Error(`Malformed .sysmlviz/checkpoints.json: checkpoint[${index}] is invalid`);
    }
  }
  return value as Checkpoint[];
}

export class ViewStore {
  readonly directory: string;
  readonly viewsPath: string;
  readonly checkpointsPath: string;
  #mutationTail: Promise<void> = Promise.resolve();

  constructor(readonly projectRoot: string) {
    this.directory = path.join(projectRoot, ".sysmlviz");
    this.viewsPath = path.join(this.directory, "views.json");
    this.checkpointsPath = path.join(this.directory, "checkpoints.json");
  }

  async load(rootId: string | null = null): Promise<ViewDocument> {
    await this.#mutationTail;
    return await this.readDocument(rootId);
  }

  private async readDocument(rootId: string | null = null): Promise<ViewDocument> {
    try {
      await this.assertSafePersistencePath(this.viewsPath, false);
      return validateDocument(JSON.parse(await readFile(this.viewsPath, "utf8")) as unknown);
    } catch (error) {
      if ((error as NodeJS.ErrnoException).code !== "ENOENT") {
        throw error;
      }
      return createDocument(rootId);
    }
  }

  async save(document: ViewDocument): Promise<void> {
    await this.mutate(async () => {
      validateDocument(document);
      await this.writeJsonAtomic(this.viewsPath, document);
    });
  }

  async upsert(
    viewId: string,
    patch: Partial<ViewState>,
    rootId: string | null,
    revision: boolean | ViewMutationInput = false,
  ): Promise<ViewDocument> {
    return await this.mutate(async () => {
      const document = await this.readDocument(rootId);
      const index = document.views.findIndex((view) => view.id === viewId);
      if (index < 0) {
        const created: ViewState = {
          ...createDefaultView(rootId),
          ...patch,
          id: viewId,
          name: patch.name ?? viewId,
          updatedAt: now(),
        };
        document.views.push(created);
      } else {
        const current = document.views[index];
        if (!current) {
          throw new Error(`View index disappeared for ${viewId}`);
        }
        document.views[index] = {
          ...current,
          ...patch,
          id: current.id,
          positions: patch.positions ?? current.positions,
          edgeRoutes: patch.edgeRoutes ?? current.edgeRoutes,
          updatedAt: now(),
        };
      }
      if (revision) {
        document.viewRevision += 1;
        this.appendMutation(document, viewId, revision, Object.keys(patch));
      }
      await this.writeJsonAtomic(this.viewsPath, document);
      return document;
    });
  }

  /** Atomically merges only the supplied node geometry into the latest view.
   * Layout gestures use this instead of replacing a whole positions map that
   * may have been read before another gesture committed. */
  async patchPositions(
    viewId: string,
    positions: ViewState["positions"],
    rootId: string | null,
    revision: true | ViewMutationInput,
  ): Promise<ViewDocument> {
    return await this.mutate(async () => {
      const document = await this.readDocument(rootId);
      const index = document.views.findIndex((view) => view.id === viewId);
      const current = document.views[index];
      if (index < 0 || !current) throw new Error(`Unknown view: ${viewId}`);
      document.views[index] = {
        ...current,
        positions: { ...current.positions, ...positions },
        updatedAt: now(),
      };
      document.viewRevision += 1;
      this.appendMutation(document, viewId, revision, ["positions"]);
      await this.writeJsonAtomic(this.viewsPath, document);
      return document;
    });
  }

  async setActive(
    viewId: string,
    rootId: string | null,
    revision: boolean | ViewMutationInput = false,
  ): Promise<ViewDocument> {
    return await this.mutate(async () => {
      const document = await this.readDocument(rootId);
      if (!document.views.some((view) => view.id === viewId)) {
        throw new Error(`Unknown view: ${viewId}`);
      }
      document.activeViewId = viewId;
      if (revision) {
        document.viewRevision += 1;
        this.appendMutation(document, viewId, revision, ["activeViewId"]);
      }
      await this.writeJsonAtomic(this.viewsPath, document);
      return document;
    });
  }

  async listCheckpoints(): Promise<Checkpoint[]> {
    await this.#mutationTail;
    return await this.readCheckpoints();
  }

  private async readCheckpoints(): Promise<Checkpoint[]> {
    try {
      await this.assertSafePersistencePath(this.checkpointsPath, false);
      const value = JSON.parse(await readFile(this.checkpointsPath, "utf8")) as unknown;
      return validateCheckpoints(value);
    } catch (error) {
      if ((error as NodeJS.ErrnoException).code === "ENOENT") {
        return [];
      }
      throw error;
    }
  }

  async addCheckpoint(checkpoint: Checkpoint): Promise<Checkpoint[]> {
    return await this.mutate(async () => {
      const checkpoints = await this.readCheckpoints();
      checkpoints.push(checkpoint);
      await this.writeJsonAtomic(this.checkpointsPath, checkpoints);
      return checkpoints;
    });
  }

  async updateCheckpoint(
    checkpointId: string,
    patch: Readonly<Pick<Checkpoint, "validationStatus">>,
  ): Promise<Checkpoint> {
    return await this.mutate(async () => {
      const checkpoints = await this.readCheckpoints();
      const index = checkpoints.findIndex((checkpoint) => checkpoint.id === checkpointId);
      const current = checkpoints[index];
      if (index < 0 || current === undefined) {
        throw new Error(`Unknown checkpoint: ${checkpointId}`);
      }
      const updated: Checkpoint = { ...current, validationStatus: patch.validationStatus };
      checkpoints[index] = updated;
      await this.writeJsonAtomic(this.checkpointsPath, checkpoints);
      return updated;
    });
  }

  private async writeJsonAtomic(destination: string, value: unknown): Promise<void> {
    // Keep validation at the persistence boundary as well as at read time. In
    // particular, JSON.stringify turns Infinity/NaN into null, so accepting an
    // invalid in-memory patch here would silently poison the next session.
    if (destination === this.viewsPath) {
      validateDocument(value);
    } else if (destination === this.checkpointsPath) {
      validateCheckpoints(value);
    }
    await this.assertSafePersistencePath(destination, true);
    try {
      await writeFile(path.join(this.directory, ".gitignore"), "local/\n*.tmp\n", {
        encoding: "utf8",
        flag: "wx",
      });
    } catch (error) {
      if ((error as NodeJS.ErrnoException).code !== "EEXIST") {
        throw error;
      }
    }
    const temporary = `${destination}.${process.pid}.${randomUUID()}.tmp`;
    await writeFile(temporary, `${JSON.stringify(value, null, 2)}\n`, "utf8");
    await rename(temporary, destination);
  }

  private appendMutation(
    document: ViewDocument,
    viewId: string,
    revision: true | ViewMutationInput,
    fallbackChangedFields: readonly string[],
  ): void {
    const input: ViewMutationInput = revision === true
      ? {
          actor: "system",
          client: "system",
          operation: "view.update",
          modelRevision: 0,
        }
      : revision;
    const record: ViewMutationRecord = {
      id: randomUUID(),
      at: now(),
      actor: input.actor,
      client: input.client,
      operation: input.operation,
      viewId,
      modelRevision: input.modelRevision,
      viewRevision: document.viewRevision,
      targetIds: [...new Set(input.targetIds ?? [])].sort(),
      changedFields: [...new Set(input.changedFields ?? fallbackChangedFields)].sort(),
    };
    document.mutations = [...document.mutations, record].slice(-MAX_VIEW_MUTATIONS);
  }

  private async mutate<T>(operation: () => Promise<T>): Promise<T> {
    const result = this.#mutationTail.then(operation, operation);
    this.#mutationTail = result.then(
      () => undefined,
      () => undefined,
    );
    return await result;
  }

  private async assertSafePersistencePath(destination: string, create: boolean): Promise<void> {
    try {
      const directoryInfo = await lstat(this.directory);
      if (directoryInfo.isSymbolicLink() || !directoryInfo.isDirectory()) {
        throw new Error(`Refusing to use non-directory or symlinked persistence path: ${this.directory}`);
      }
    } catch (error) {
      if ((error as NodeJS.ErrnoException).code !== "ENOENT") throw error;
      if (!create) return;
      await mkdir(this.directory, { recursive: false });
    }
    const directoryInfo = await lstat(this.directory);
    if (directoryInfo.isSymbolicLink() || !directoryInfo.isDirectory()) {
      throw new Error(`Refusing to use non-directory or symlinked persistence path: ${this.directory}`);
    }
    const canonicalDirectory = await realpath(this.directory);
    const relative = path.relative(this.projectRoot, canonicalDirectory);
    if (relative.startsWith("..") || path.isAbsolute(relative)) {
      throw new Error(`Persistence path escapes the configured project root: ${canonicalDirectory}`);
    }
    try {
      const destinationInfo = await lstat(destination);
      if (destinationInfo.isSymbolicLink() || !destinationInfo.isFile()) {
        throw new Error(`Refusing to follow non-file or symlinked persistence target: ${destination}`);
      }
    } catch (error) {
      if ((error as NodeJS.ErrnoException).code !== "ENOENT") throw error;
    }
  }
}
