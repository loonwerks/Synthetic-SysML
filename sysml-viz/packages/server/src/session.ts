import { randomUUID } from "node:crypto";
import { EventEmitter } from "node:events";
import path from "node:path";

import {
  assessContainerResize,
  computeDiagramHealth,
  defaultContainerResizeConstraints,
  deriveDiagram,
  findRequirements,
  inspectElement,
  ModelQueryError,
  parseProject,
  renderDiagramSvg,
  summarizeModel,
  type DiagramLayout,
  type DiagramModel,
  type DiagramPresentation,
  type DiagramPort,
  type Diagnostic,
  type NormalizedElement,
  type NormalizedModel,
  type ParseProjectResult,
} from "@sysml-viz/core";
import chokidar, { type FSWatcher } from "chokidar";
import sharp from "sharp";

import {
  alignNodes,
  applyLayoutConstraints,
  applyLayeredLayout,
  distributeNodes,
  pinNode,
  resetLayout,
  type LayoutAlignment,
  type LayoutDistribution,
  type LayoutGraph,
} from "./layout.js";
import { migrateViewDocument, type ViewMigrationWarning } from "./migration.js";
import { isExcludedProjectPath, resolveSessionRoots } from "./paths.js";
import {
  FAA_A1_PRESET_ID,
  faaA1PresetDefinitions,
  reconcilePresetView,
} from "./presets.js";
import { defaultSireumExecutable, validateWithSireum } from "./sireum.js";
import { loadSystemAbstract, type SystemAbstractDocument } from "./traceability.js";
import type {
  Checkpoint,
  DiagramFidelityAssessment,
  DiagramHealthResponse,
  NodeLayout,
  SessionOptions,
  ValidationState,
  ViewDocument,
  ViewMutationContext,
  ViewMutationInput,
  ViewState,
} from "./types.js";
import { createDefaultView, ViewStore } from "./view-store.js";

export interface SessionEvent {
  type:
    | "session.ready"
    | "model.updated"
    | "model.stale"
    | "view.updated"
    | "validation.updated"
    | "checkpoint.created"
    | "checkpoint.updated";
  at: string;
  revision: number;
  data?: unknown;
}

export interface DiagramResponse extends DiagramModel {
  revision: number;
  viewRevision: number;
  stale: boolean;
  validation: ValidationState;
  view: ViewState;
  nodes: Array<DiagramModel["nodes"][number] & { position: NodeLayout; pinned: boolean }>;
  breadcrumbs: Array<{ id: string; label: string }>;
}

export interface ViewMutationPreview {
  dryRun: true;
  operation: string;
  baseViewRevision: number;
  viewId: string;
  resolvedIds: string[];
  before: ViewState | null;
  after: ViewState;
}

/** Generated connector sections are tied to a particular node geometry. */
function manualEdgeRoutes(routes: ViewState["edgeRoutes"]): ViewState["edgeRoutes"] {
  return Object.fromEntries(
    Object.entries(routes).filter(([, route]) => route.pinned),
  );
}

function geometryPatchInvalidatesAutomaticRoutes(patch: Partial<ViewState>): boolean {
  return patch.positions !== undefined ||
    patch.expanded !== undefined ||
    patch.hidden !== undefined ||
    patch.rootId !== undefined ||
    patch.showPorts !== undefined ||
    patch.showTypes !== undefined;
}

export interface StartedSession {
  root: string;
  libraryRoots: string[];
}

export interface LayoutTemplate {
  schemaVersion: 1;
  nodes: Array<{
    sourceId: string;
    alias?: string;
    name: string;
    typeName: string;
    category: string;
    position: NodeLayout;
  }>;
  constraints: ViewState["constraints"];
}

function validationInitial(): ValidationState {
  return { status: "not-run", message: "Sireum validation has not been requested" };
}

const FIDELITY_SCOPE = "Fidelity covers the supported AADL-oriented SysML subset, not complete SysML v2.";

function isOmittedOrUnsupportedDiagnostic(diagnostic: Diagnostic): boolean {
  return diagnostic.code === "SYSML_CONNECTION_UNRECOGNIZED" ||
    /\b(?:omitted|unsupported|could not be normalized)\b/iu.test(diagnostic.message);
}

function localFidelitySummary(validation: ValidationState): string {
  switch (validation.status) {
    case "pending":
      return `Rendered locally; Sireum validation is still running. ${FIDELITY_SCOPE}`;
    case "tool-error":
      return `Rendered locally; Sireum validation could not run${validation.message ? `: ${validation.message}` : "."} ${FIDELITY_SCOPE}`;
    case "stale":
      return `Rendered locally; the available Sireum result applies to an earlier model revision. ${FIDELITY_SCOPE}`;
    case "not-run":
      return `Rendered locally; Sireum validation has not been requested. ${FIDELITY_SCOPE}`;
    default:
      return `Rendered locally without a current successful Sireum validation. ${FIDELITY_SCOPE}`;
  }
}

function fidelityAssessment(
  diagram: DiagramResponse,
  health: ReturnType<typeof computeDiagramHealth>,
): DiagramFidelityAssessment {
  if (diagram.stale) {
    return {
      state: "stale",
      label: "Showing last good diagram",
      summary: `The current source is not renderable, so this is the last good diagram. ${FIDELITY_SCOPE}`,
      scope: "aadl-oriented-subset",
    };
  }
  if (diagram.validation.status === "invalid") {
    return {
      state: "invalid",
      label: "Validation found errors",
      summary: `Sireum validation found errors in this model revision. ${FIDELITY_SCOPE}`,
      scope: "aadl-oriented-subset",
    };
  }
  if (
    health.unresolvedEndpointCount > 0 ||
    diagram.diagnostics.some(isOmittedOrUnsupportedDiagnostic)
  ) {
    const reasons = [
      ...(health.unresolvedEndpointCount > 0
        ? [`${health.unresolvedEndpointCount} unresolved connection endpoint${health.unresolvedEndpointCount === 1 ? "" : "s"}`]
        : []),
      ...(diagram.diagnostics.some(isOmittedOrUnsupportedDiagnostic)
        ? ["one or more unsupported or omitted constructs"]
        : []),
    ];
    return {
      state: "partial",
      label: "Partial diagram",
      summary: `The diagram is partial because it has ${reasons.join(" and ")}. ${FIDELITY_SCOPE}`,
      scope: "aadl-oriented-subset",
    };
  }
  if (diagram.validation.status === "valid") {
    return {
      state: "validated",
      label: "Validated by Sireum",
      summary: `Sireum validated this model revision. ${FIDELITY_SCOPE}`,
      scope: "aadl-oriented-subset",
    };
  }
  return {
    state: "local",
    label: "Locally rendered",
    summary: localFidelitySummary(diagram.validation),
    scope: "aadl-oriented-subset",
  };
}

function defaultGeometry(position: NodeLayout | undefined, fallbackHeight = 150): {
  x: number;
  y: number;
  width: number;
  height: number;
} {
  return {
    x: position?.x ?? 0,
    y: position?.y ?? 0,
    width: position?.width ?? 250,
    height: position?.height ?? fallbackHeight,
  };
}

class SessionQueryError extends Error {
  constructor(
    readonly code: string,
    message: string,
    readonly candidates: string[] = [],
  ) {
    super(message);
    this.name = "SessionQueryError";
  }
}

export class SysmlVizSession {
  readonly events = new EventEmitter();
  readonly root: string;
  readonly libraryRoots: string[];
  readonly views: ViewStore;
  readonly options: Readonly<SessionOptions>;

  #result: ParseProjectResult | null = null;
  #latestDiagnostics: ParseProjectResult["diagnostics"] = [];
  #revision = 0;
  #viewRevision = 0;
  #stale = false;
  #validation: ValidationState = validationInitial();
  #watcher: FSWatcher | null = null;
  #reloadTimer: NodeJS.Timeout | null = null;
  #validationTimer: NodeJS.Timeout | null = null;
  #reloadTail: Promise<void> = Promise.resolve();
  #validationPromise: Promise<ValidationState> | null = null;
  #closed = false;

  private constructor(options: SessionOptions, root: string, libraryRoots: string[]) {
    if (
      options.validationDebounceMs !== undefined &&
      (!Number.isFinite(options.validationDebounceMs) || options.validationDebounceMs < 0)
    ) {
      throw new Error("validationDebounceMs must be a non-negative finite number");
    }
    this.options = options;
    this.root = root;
    this.libraryRoots = libraryRoots;
    this.views = new ViewStore(root);
  }

  static async create(options: SessionOptions): Promise<SysmlVizSession> {
    if (!options.root) {
      throw new Error("Project root is required when creating a session");
    }
    const roots = await resolveSessionRoots(options.root, options.libraryRoots);
    const session = new SysmlVizSession(options, roots.root, roots.libraryRoots);
    await session.reload("startup");
    await session.ensureDefaultView();
    session.#viewRevision = (await session.viewDocument()).viewRevision;
    await session.startWatching();
    session.emit({ type: "session.ready", at: new Date().toISOString(), revision: session.#revision });
    if (options.validateOnStart) {
      void session.validate();
    }
    return session;
  }

  get revision(): number {
    return this.#revision;
  }

  get viewRevision(): number {
    return this.#viewRevision;
  }

  get stale(): boolean {
    return this.#stale;
  }

  get validation(): ValidationState {
    if (this.#stale) {
      return {
        ...this.#validation,
        status: "stale",
        message: "The current source is not renderable; this result applies only to the last renderable revision",
      };
    }
    if (this.#validation.revision !== undefined && this.#validation.revision !== this.#revision) {
      return { ...this.#validation, status: "stale" };
    }
    return this.#validation;
  }

  get model(): NormalizedModel {
    if (!this.#result) {
      throw new Error("No renderable SysML model is available for this session");
    }
    return this.#result.model;
  }

  async systemAbstract(): Promise<SystemAbstractDocument | null> {
    const tracedElements = Object.values(this.model.elements).flatMap((element) => {
      if (!("traceIds" in element) || !Array.isArray(element.traceIds)) return [];
      const traceIds = [...new Set(element.traceIds)];
      return traceIds.length > 0 ? [{ traceIds }] : [];
    });
    const traceIds = tracedElements.flatMap(({ traceIds }) => traceIds);
    return await loadSystemAbstract(
      this.root,
      this.options.workspaceRoot ?? path.dirname(this.root),
      traceIds,
      {
        taggedElementCount: tracedElements.length,
        traceAssociationCount: tracedElements.reduce(
          (total, { traceIds: elementTraceIds }) => total + elementTraceIds.length,
          0,
        ),
      },
    );
  }

  async close(): Promise<void> {
    this.#closed = true;
    if (this.#reloadTimer) {
      clearTimeout(this.#reloadTimer);
      this.#reloadTimer = null;
    }
    if (this.#validationTimer) {
      clearTimeout(this.#validationTimer);
      this.#validationTimer = null;
    }
    await this.#watcher?.close();
    this.#watcher = null;
    await this.#reloadTail.catch(() => undefined);
  }

  async refresh(reason = "manual refresh"): Promise<Record<string, unknown>> {
    await this.reload(reason);
    return await this.snapshot();
  }

  async snapshot(): Promise<Record<string, unknown>> {
    const document = await this.views.load(this.preferredRootId());
    this.#viewRevision = Math.max(this.#viewRevision, document.viewRevision);
    return {
      root: this.root,
      libraryRoots: this.libraryRoots,
      include: [...(this.options.include ?? [])],
      exclude: [...(this.options.exclude ?? [])],
      validationDebounceMs: this.options.validationDebounceMs ?? null,
      files: this.model.files
        .filter((file) => file.origin === "project")
        .map((file) => file.relativePath),
      fileRecords: this.model.files.map((file) => ({
        path: file.path,
        relativePath: file.relativePath,
        origin: file.origin,
      })),
      revision: this.#revision,
      viewRevision: this.#viewRevision,
      parseStatus: this.#stale ? "stale" : "valid",
      stale: this.#stale,
      diagnostics: this.#latestDiagnostics.map((diagnostic) => this.apiDiagnostic(diagnostic)),
      validation: this.validation,
      activeRootId: this.activeView(document).rootId ?? this.preferredRootId(),
      activeViewId: document.activeViewId,
    };
  }

  modelSummary(): Record<string, unknown> {
    const rootIds = new Set(this.model.rootCandidates);
    const projectDefinitions = this.model.definitions.filter(
      (definition) => definition.origin === "project" && definition.category !== "data",
    );
    const definitionsById = new Map(this.model.definitions.map((definition) => [definition.id, definition]));
    const partsByOwner = new Map<string, typeof this.model.parts[number][]>();
    const portsByOwner = new Map<string, typeof this.model.ports[number][]>();
    for (const part of this.model.parts) {
      const siblings = partsByOwner.get(part.ownerDefinitionId) ?? [];
      siblings.push(part);
      partsByOwner.set(part.ownerDefinitionId, siblings);
    }
    for (const port of this.model.ports) {
      const siblings = portsByOwner.get(port.ownerDefinitionId) ?? [];
      siblings.push(port);
      portsByOwner.set(port.ownerDefinitionId, siblings);
    }

    // The explorer is an occurrence hierarchy, not a declaration hierarchy.
    // A definition becomes a top-level architecture only when no part usage
    // instantiates it. Reused definitions are deliberately expanded once per
    // occurrence so the tree mirrors the model a reader sees on the canvas.
    const instantiatedDefinitionIds = new Set(
      this.model.parts.flatMap((part) => part.resolvedDefinitionId ? [part.resolvedDefinitionId] : []),
    );
    const hierarchyRootDefinitions = projectDefinitions.filter(
      (definition) => !instantiatedDefinitionIds.has(definition.id),
    );

    const representedDefinitions = new Set<string>();
    const buildOccurrence = (
      definitionId: string,
      pathId: string,
      occurrence?: typeof this.model.parts[number],
      ancestors: ReadonlySet<string> = new Set(),
    ): Record<string, unknown> => {
      const definition = definitionsById.get(definitionId);
      if (!definition) {
        return {
          id: pathId,
          elementId: occurrence?.id ?? definitionId,
          kind: "component",
          name: occurrence?.name ?? "Unresolved component",
          typeName: occurrence?.typeName,
          unresolved: true,
          children: [],
        };
      }
      representedDefinitions.add(definition.id);
      const recursive = ancestors.has(definition.id);
      const nextAncestors = new Set(ancestors).add(definition.id);
      const childPorts = recursive ? [] : (portsByOwner.get(definition.id) ?? []).map((port) => ({
        id: `${pathId}/port:${port.id}`,
        elementId: port.id,
        kind: "port",
        name: port.name,
        typeName: port.typeName,
        direction: port.direction,
        ownerDefinitionId: definition.id,
        source: this.sourceLocation(port.span),
        children: [],
      }));
      const childParts = recursive ? [] : (partsByOwner.get(definition.id) ?? []).map((part) => {
        const childPath = `${pathId}/part:${part.id}`;
        if (!part.resolvedDefinitionId) {
          return {
            id: childPath,
            elementId: part.id,
            kind: "component",
            name: part.name,
            typeName: part.typeName,
            category: part.category,
            ownerDefinitionId: definition.id,
            unresolved: true,
            source: this.sourceLocation(part.span),
            children: [],
          };
        }
        return buildOccurrence(part.resolvedDefinitionId, childPath, part, nextAncestors);
      });
      return {
        id: pathId,
        elementId: occurrence?.id ?? definition.id,
        definitionId: definition.id,
        ownerDefinitionId: occurrence?.ownerDefinitionId,
        kind: "component",
        name: occurrence?.name ?? definition.name,
        qualifiedName: occurrence?.qualifiedName ?? definition.qualifiedName,
        typeName: occurrence?.typeName ?? definition.name,
        category: definition.category,
        root: occurrence === undefined,
        recursive,
        source: this.sourceLocation(occurrence?.span ?? definition.span),
        // Keep structural children first so a long port list cannot obscure the
        // architecture. Ports remain direct children of their actual owner.
        children: [...childParts, ...childPorts],
      };
    };
    const hierarchy: Array<Record<string, unknown>> = [];
    const appendUnrepresented = (definitions: typeof this.model.definitions): void => {
      for (const definition of [...definitions].sort((left, right) => left.qualifiedName.localeCompare(right.qualifiedName))) {
        if (representedDefinitions.has(definition.id)) continue;
        hierarchy.push(buildOccurrence(definition.id, `hierarchy:${definition.id}`));
      }
    };
    appendUnrepresented(hierarchyRootDefinitions);
    // A recursive-only definition graph has no zero-indegree root. Include one
    // bounded expansion for each otherwise disconnected project graph instead
    // of silently dropping it from the explorer.
    appendUnrepresented(projectDefinitions);

    return {
      ...summarizeModel(this.model),
      definitions: this.model.definitions
        .filter((definition) => definition.origin === "project")
        .map((definition) => ({
          id: definition.id,
          name: definition.name,
          qualifiedName: definition.qualifiedName,
          typeName: definition.baseType,
          category: definition.category,
          kind: definition.kind,
          childIds: definition.partIds,
          source: this.sourceLocation(definition.span),
        })),
      rootCandidates: this.model.definitions
        .filter((definition) => rootIds.has(definition.id))
        .map((definition) => ({
          id: definition.id,
          name: definition.name,
          qualifiedName: definition.qualifiedName,
          typeName: definition.baseType,
          category: definition.category,
          kind: definition.kind,
          childIds: definition.partIds,
          source: this.sourceLocation(definition.span),
      })),
      hierarchy,
      contracts: this.model.contracts.map((contract) => {
        const owner = this.model.elements[contract.ownerId];
        const requirement = this.model.requirements.find((item) => item.contractId === contract.id);
        return {
          id: contract.id,
          name: contract.name,
          kind: contract.contractKind,
          text: contract.raw,
          description: contract.description,
          requirementId: requirement?.requirementId,
          references: contract.referencedPortIds,
          traceIds: contract.traceIds,
          source: this.sourceLocation(contract.span),
          inferred: false,
          ownerId: contract.ownerId,
          ownerName: owner
            ? owner.kind === "requirement"
              ? owner.requirementId
              : owner.name
            : contract.ownerId,
          ownerUsageIds: this.model.parts
            .filter((part) => part.resolvedDefinitionId === contract.ownerId)
            .map((part) => part.id),
        };
      }),
      requirements: this.requirements(""),
      diagnostics: this.#latestDiagnostics.map((diagnostic) => this.apiDiagnostic(diagnostic)),
    };
  }

  async inspect(id: string): Promise<Record<string, unknown>> {
    let semanticId = id;
    let inspection: ReturnType<typeof inspectElement> | undefined;
    try {
      inspection = inspectElement(this.model, semanticId);
    } catch (error) {
      if (error instanceof ModelQueryError && error.code.includes("NOT_FOUND")) {
        inspection = undefined;
      } else {
        throw error;
      }
    }
    if (!inspection) {
      const diagram = await this.diagram();
      const node = diagram.nodes.find(
        (candidate) => candidate.id === id || candidate.name === id || candidate.label === id,
      );
      if (node) {
        semanticId = node.elementId;
        try {
          inspection = inspectElement(this.model, semanticId);
        } catch (error) {
          if (error instanceof ModelQueryError && error.code.includes("NOT_FOUND")) {
            inspection = undefined;
          } else {
            throw error;
          }
        }
      }
    }
    if (!inspection) {
      throw new Error(`No model element matches '${id}'`);
    }
    const element = inspection.element;
    const elementLabel = (candidate: NormalizedElement): string =>
      candidate.kind === "requirement"
        ? candidate.requirementId
        : candidate.name;
    const elementSummary = (candidate: NormalizedElement): Record<string, unknown> => ({
      id: candidate.id,
      label: elementLabel(candidate),
      qualifiedName: candidate.qualifiedName,
      kind: candidate.kind,
      source: this.sourceLocation(candidate.span),
    });
    const definitionId =
      element.kind === "part-definition"
        ? element.id
        : element.kind === "part-usage"
          ? element.resolvedDefinitionId
          : element.kind === "port"
            ? element.ownerDefinitionId
            : undefined;
    const focusedPortIds = new Set<string>();
    if (element.kind === "port") focusedPortIds.add(element.id);
    if (element.kind === "connection") {
      if (element.source.resolvedPortId) focusedPortIds.add(element.source.resolvedPortId);
      if (element.target.resolvedPortId) focusedPortIds.add(element.target.resolvedPortId);
    }
    const ports = element.kind === "port"
      ? [element]
      : element.kind === "connection"
        ? this.model.ports.filter((port) => focusedPortIds.has(port.id))
        : definitionId
          ? this.model.ports.filter((port) => port.ownerDefinitionId === definitionId)
          : [];
    const contracts = focusedPortIds.size > 0
      ? this.model.contracts.filter((contract) =>
          contract.referencedPortIds.some((portId) => focusedPortIds.has(portId))
        )
      : definitionId
        ? this.model.contracts.filter((contract) => contract.ownerId === definitionId)
        : [];
    const portIds = new Set(ports.map((port) => port.id));
    const connections = element.kind === "connection"
      ? [element]
      : this.model.connections.filter(
          (connection) =>
            connection.ownerDefinitionId === definitionId ||
            (connection.source.resolvedPortId && portIds.has(connection.source.resolvedPortId)) ||
            (connection.target.resolvedPortId && portIds.has(connection.target.resolvedPortId)),
        );
    return {
      id,
      semanticId,
      label: elementLabel(element),
      qualifiedName: element.qualifiedName,
      kind: element.kind,
      ...("traceIds" in element && Array.isArray(element.traceIds) ? { traceIds: element.traceIds } : {}),
      ...(inspection.owner ? { owner: elementSummary(inspection.owner) } : {}),
      related: inspection.related.map(elementSummary),
      ...(element.kind === "requirement"
        ? {
            requirementId: element.requirementId,
            ownerId: element.ownerId,
            contractId: element.contractId,
            contractKind: element.contractKind,
            phase: element.phase,
            description: element.description,
            text: element.expression,
            references: element.referencedPortIds,
            traceIds: element.traceIds,
            urls: element.urls,
          }
        : {}),
      ...(element.kind === "gumbo-contract"
        ? {
            ownerId: element.ownerId,
            contractKind: element.contractKind,
            phase: element.phase,
            description: element.description,
            expression: element.expression,
            text: element.raw,
            references: element.referencedPortIds,
            traceIds: element.traceIds,
            clauses: element.clauses,
            urls: element.urls,
          }
        : {}),
      ...(element.kind === "gumbo-block"
        ? { ownerId: element.ownerId, text: element.raw, contractIds: element.contractIds }
        : {}),
      ...(element.kind === "part-usage" ? { typeName: element.typeName, category: element.category } : {}),
      ...(element.kind === "port" ? { typeName: element.typeName, category: element.portKind } : {}),
      ...(element.kind === "part-definition"
        ? { typeName: element.baseType, category: element.category }
        : {}),
      source: this.sourceLocation(element.span),
      ports: ports.map((port) => ({
        id: port.id,
        name: port.name,
        direction: port.direction,
        typeName: port.typeName,
        traceIds: port.traceIds,
      })),
      contracts: contracts.map((contract) => {
        const requirement = this.model.requirements.find((item) => item.contractId === contract.id);
        return {
          id: contract.id,
          name: contract.name,
          kind: contract.contractKind,
          text: contract.raw,
          description: contract.description,
          requirementId: requirement?.requirementId,
          references: contract.referencedPortIds,
          traceIds: contract.traceIds,
          source: this.sourceLocation(contract.span),
          inferred: false,
        };
      }),
      connections: connections.map((connection) => ({
        id: connection.id,
        label: connection.name,
        source: connection.source.raw,
        target: connection.target.raw,
      })),
      children: inspection.children.map((child) => child.id),
    };
  }

  requirements(query = ""): Array<Record<string, unknown>> {
    return findRequirements(this.model, query).map((requirement) => {
      const owner = this.model.elements[requirement.ownerId];
      const ownerName = owner
        ? owner.kind === "requirement"
          ? owner.requirementId
          : owner.name
        : requirement.ownerId;
      return {
        id: requirement.id,
        name: requirement.requirementId,
        requirementId: requirement.requirementId,
        contractId: requirement.contractId,
        ownerId: requirement.ownerId,
        ownerName,
        ownerUsageIds: this.model.parts
          .filter((part) => part.resolvedDefinitionId === requirement.ownerId)
          .map((part) => part.id),
        kind: requirement.contractKind,
        description: requirement.description,
        text: requirement.expression,
        references: requirement.referencedPortIds,
        traceIds: requirement.traceIds,
        source: this.sourceLocation(requirement.span),
        inferred: false,
        urls: requirement.urls,
      };
    });
  }

  async viewDocument(): Promise<ViewDocument> {
    return await this.views.load(this.preferredRootId());
  }

  async view(viewId?: string): Promise<ViewState> {
    const document = await this.viewDocument();
    const id = viewId ?? document.activeViewId;
    const view = document.views.find((candidate) => candidate.id === id);
    if (!view) {
      throw new Error(`Unknown view '${id}'. Available views: ${document.views.map((item) => item.id).join(", ")}`);
    }
    return view;
  }

  /**
   * Resolve presentation commands through one identity policy. Contextual
   * diagram IDs, semantic IDs, qualified names, aliases, instance paths, and
   * unique short names are accepted; ambiguous short forms fail closed.
   */
  async resolveViewTarget(viewId: string, query: string): Promise<string> {
    const diagram = await this.diagram(viewId, undefined, false);
    const normalized = query.trim();
    const modelMatches = Object.values(this.model.elements).filter((element) =>
      element.id === normalized ||
      element.qualifiedName === normalized ||
      (element.kind === "requirement" ? element.requirementId : element.name) === normalized,
    );
    const diagramMatches = [
      ...diagram.nodes.filter((node) =>
        node.id === normalized ||
        node.elementId === normalized ||
        node.name === normalized ||
        node.label === normalized ||
        node.instancePath.join(".") === normalized ||
        node.instancePath.join("::") === normalized,
      ).map((node) => ({ canonical: node.elementId, suggestion: node.id })),
      ...diagram.nodes.flatMap((node) => node.ports.filter((port) =>
        port.id === normalized ||
        port.elementId === normalized ||
        port.name === normalized ||
        `${node.name}.${port.name}` === normalized ||
        `${node.instancePath.join(".")}.${port.name}` === normalized
      ).map((port) => ({ canonical: port.elementId, suggestion: port.id }))),
      ...diagram.boundaryPorts.filter((port) =>
        port.id === normalized ||
        `boundary:${port.id}` === normalized ||
        port.elementId === normalized ||
        port.name === normalized ||
        port.label === normalized
      ).map((port) => ({ canonical: port.elementId, suggestion: `boundary:${port.id}` })),
    ];
    const matches = new Map<string, string>();
    for (const element of modelMatches) matches.set(element.id, element.qualifiedName);
    for (const item of diagramMatches) matches.set(item.canonical, item.suggestion);
    if (matches.size === 1) return [...matches.keys()][0]!;
    if (matches.size > 1) {
      const candidates = [...matches.entries()].map(([id, label]) => `${label} (${id})`).sort();
      throw new SessionQueryError(
        "VIEW_TARGET_AMBIGUOUS",
        `Target '${query}' is ambiguous. Use one of: ${candidates.join(", ")}`,
        [...matches.keys()].sort(),
      );
    }
    const suggestions = [
      ...diagram.nodes.filter((node) =>
        node.name.toLowerCase().includes(normalized.toLowerCase()) ||
        node.label.toLowerCase().includes(normalized.toLowerCase())
      ).map((node) => node.id),
      ...Object.values(this.model.elements).filter((element) =>
        element.qualifiedName.toLowerCase().includes(normalized.toLowerCase())
      ).slice(0, 8).map((element) => element.id),
    ];
    throw new SessionQueryError(
      "VIEW_TARGET_NOT_FOUND",
      `No view or model element matches '${query}'.${suggestions.length ? ` Suggestions: ${suggestions.join(", ")}` : ""}`,
      suggestions,
    );
  }

  async addConstraint(
    viewId: string,
    subjectQuery: string,
    relation: "above" | "below" | "left-of" | "right-of",
    objectQuery: string,
    gap = 40,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    if (!Number.isFinite(gap) || gap < 0) throw new Error("Constraint gap must be non-negative");
    const diagram = await this.diagram(viewId);
    const [subjectId, objectId] = this.resolveDiagramNodesIn(diagram, [subjectQuery, objectQuery]);
    if (!subjectId || !objectId || subjectId === objectId) {
      throw new Error("A layout constraint requires two distinct visible nodes");
    }
    const view = await this.view(viewId);
    const constraint = {
      id: `constraint:${relation}:${subjectId}:${objectId}`,
      relation,
      subjectId,
      objectId,
      gap,
    };
    const constraints = [
      ...(view.constraints ?? []).filter((item) => item.id !== constraint.id),
      constraint,
    ];
    const constrained = applyLayoutConstraints({ ...view, constraints });
    return await this.updateView(
      viewId,
      { constraints, positions: constrained.positions },
      context,
      `layout.constraint.${relation}`,
      [subjectId, objectId],
    );
  }

  async previewConstraint(
    viewId: string,
    subjectQuery: string,
    relation: "above" | "below" | "left-of" | "right-of",
    objectQuery: string,
    gap = 40,
  ): Promise<ViewMutationPreview> {
    if (!Number.isFinite(gap) || gap < 0) throw new Error("Constraint gap must be non-negative");
    const diagram = await this.diagram(viewId);
    const [subjectId, objectId] = this.resolveDiagramNodesIn(diagram, [subjectQuery, objectQuery]);
    if (!subjectId || !objectId || subjectId === objectId) {
      throw new Error("A layout constraint requires two distinct visible nodes");
    }
    const before = await this.view(viewId);
    const constraint = {
      id: `constraint:${relation}:${subjectId}:${objectId}`,
      relation,
      subjectId,
      objectId,
      gap,
    };
    const constraints = [...(before.constraints ?? []).filter((item) => item.id !== constraint.id), constraint];
    const after = applyLayoutConstraints({ ...before, constraints });
    return await this.viewPreview(
      viewId,
      `layout.constraint.${relation}`,
      before,
      { ...after, constraints },
      [subjectId, objectId],
    );
  }

  async exportLayoutTemplate(viewId: string): Promise<LayoutTemplate> {
    const diagram = await this.diagram(viewId);
    const semanticByNode = new Map(diagram.nodes.map((node) => [node.id, node.elementId]));
    return {
      schemaVersion: 1,
      nodes: diagram.nodes.map((node) => ({
        sourceId: node.elementId,
        ...(diagram.view.aliases[node.elementId] ? { alias: diagram.view.aliases[node.elementId] } : {}),
        name: node.name,
        typeName: node.typeName,
        category: node.category,
        position: { ...node.position },
      })),
      constraints: (diagram.view.constraints ?? []).map((constraint) => ({
        ...constraint,
        subjectId: semanticByNode.get(constraint.subjectId) ?? constraint.subjectId,
        objectId: semanticByNode.get(constraint.objectId) ?? constraint.objectId,
      })),
    };
  }

  async applyLayoutTemplate(
    viewId: string,
    template: LayoutTemplate,
    explicitMapping: Readonly<Record<string, string>> = {},
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    if (template.schemaVersion !== 1 || !Array.isArray(template.nodes)) {
      throw new Error("Unsupported or malformed layout template");
    }
    const diagram = await this.diagram(viewId);
    const positions = { ...diagram.view.positions };
    const mapped = new Map<string, string>();
    for (const source of template.nodes) {
      let candidates: typeof diagram.nodes = [];
      const explicit = explicitMapping[source.sourceId];
      if (explicit) {
        const nodeId = this.resolveDiagramNodesIn(diagram, [explicit])[0];
        candidates = diagram.nodes.filter((node) => node.id === nodeId);
      } else {
        const aliasMatches = source.alias === undefined ? [] : diagram.nodes.filter(
          (node) => diagram.view.aliases[node.elementId] === source.alias,
        );
        const nameMatches = diagram.nodes.filter((node) => node.name === source.name);
        const typeMatches = diagram.nodes.filter(
          (node) => node.typeName === source.typeName && node.category === source.category,
        );
        candidates = aliasMatches.length > 0
          ? aliasMatches
          : nameMatches.length > 0
            ? nameMatches
            : typeMatches;
      }
      if (candidates.length !== 1 || !candidates[0]) {
        throw new SessionQueryError(
          candidates.length ? "LAYOUT_TEMPLATE_AMBIGUOUS" : "LAYOUT_TEMPLATE_UNMATCHED",
          `Template node '${source.alias ?? source.name}' ${candidates.length ? `is ambiguous: ${candidates.map((node) => node.id).join(", ")}` : "has no unique target"}. Supply an explicit mapping.`,
          candidates.map((node) => node.id),
        );
      }
      mapped.set(source.sourceId, candidates[0].id);
      positions[candidates[0].id] = { ...source.position };
    }
    const constraints = (template.constraints ?? []).map((constraint) => ({
      ...constraint,
      subjectId: mapped.get(constraint.subjectId) ?? constraint.subjectId,
      objectId: mapped.get(constraint.objectId) ?? constraint.objectId,
    }));
    const applied = applyLayoutConstraints({ ...diagram.view, positions, constraints });
    return await this.updateView(
      viewId,
      { positions: applied.positions, constraints },
      context,
      "layout.template.apply",
      [...mapped.values()],
    );
  }

  async previewViewUpdate(
    viewId: string,
    patch: Partial<ViewState>,
    operation = "view.update",
    targetIds: readonly string[] = [],
  ): Promise<ViewMutationPreview> {
    if (patch.id !== undefined && patch.id !== viewId) {
      throw new Error("A view ID cannot be changed through an update");
    }
    const document = await this.viewDocument();
    const before = document.views.find((view) => view.id === viewId) ?? null;
    const merged = this.mergeViewPatch(before ?? undefined, patch);
    const after: ViewState = before
      ? { ...before, ...merged, id: before.id, updatedAt: new Date().toISOString() }
      : {
          ...createDefaultView(this.preferredRootId()),
          ...merged,
          id: viewId,
          name: patch.name ?? viewId,
          updatedAt: new Date().toISOString(),
        };
    return {
      dryRun: true,
      operation,
      baseViewRevision: document.viewRevision,
      viewId,
      resolvedIds: [...targetIds],
      before,
      after,
    };
  }

  async updateView(
    viewId: string,
    patch: Partial<ViewState>,
    context: ViewMutationContext = {},
    operation = "view.update",
    targetIds: readonly string[] = [],
  ): Promise<ViewDocument> {
    if (patch.id !== undefined && patch.id !== viewId) {
      throw new Error("A view ID cannot be changed through an update");
    }
    const existing = await this.view(viewId).catch(() => undefined);
    const mergedPatch = this.mergeViewPatch(existing, patch);
    const document = await this.views.upsert(
      viewId,
      mergedPatch,
      this.preferredRootId(),
      this.mutationInput(operation, context, targetIds),
    );
    this.#viewRevision = document.viewRevision;
    this.emit({
      type: "view.updated",
      at: new Date().toISOString(),
      revision: this.#revision,
      data: {
        viewId,
        viewRevision: this.#viewRevision,
        actor: context.actor ?? context.client ?? "api",
        operation,
        ...(context.clientId ? { clientId: context.clientId } : {}),
        ...(context.mutationId ? { mutationId: context.mutationId } : {}),
      },
    });
    return document;
  }

  private async updatePositions(
    viewId: string,
    positions: Record<string, NodeLayout>,
    context: ViewMutationContext,
    operation: string,
    targetIds: readonly string[],
  ): Promise<ViewDocument> {
    const document = await this.views.patchPositions(
      viewId,
      positions,
      this.preferredRootId(),
      this.mutationInput(operation, context, targetIds),
    );
    this.#viewRevision = document.viewRevision;
    this.emit({
      type: "view.updated",
      at: new Date().toISOString(),
      revision: this.#revision,
      data: {
        viewId,
        viewRevision: this.#viewRevision,
        actor: context.actor ?? context.client ?? "api",
        operation,
        targetIds: [...targetIds],
        ...(context.clientId ? { clientId: context.clientId } : {}),
        ...(context.mutationId ? { mutationId: context.mutationId } : {}),
      },
    });
    return document;
  }

  async setActiveView(
    viewId: string,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    const document = await this.views.setActive(
      viewId,
      this.preferredRootId(),
      this.mutationInput("view.activate", context, [viewId]),
    );
    this.#viewRevision = document.viewRevision;
    this.emit({
      type: "view.updated",
      at: new Date().toISOString(),
      revision: this.#revision,
      data: {
        viewId,
        active: true,
        viewRevision: this.#viewRevision,
        actor: context.actor ?? context.client ?? "api",
        operation: "view.activate",
        ...(context.clientId ? { clientId: context.clientId } : {}),
        ...(context.mutationId ? { mutationId: context.mutationId } : {}),
      },
    });
    return document;
  }

  async previewMove(
    viewId: string,
    id: string,
    position:
      | { x: number; y: number }
      | { relativeTo: string; dx: number; dy: number },
    pinned = true,
  ): Promise<ViewMutationPreview> {
    const before = await this.view(viewId);
    const diagram = await this.diagram(viewId, undefined, false);
    const requestedIds = "relativeTo" in position ? [id, position.relativeTo] : [id];
    const resolvedIds = this.resolveDiagramNodesIn(diagram, requestedIds);
    const nodeId = resolvedIds[0];
    if (!nodeId) throw new Error(`No visible diagram node matches '${id}'.`);
    let x: number;
    let y: number;
    let operation = "layout.move";
    if ("relativeTo" in position) {
      operation = "layout.move-relative";
      const referenceId = resolvedIds[1];
      const reference = referenceId ? diagram.view.positions[referenceId] : undefined;
      if (!referenceId || !reference) {
        throw new Error(
          `Cannot move '${id}' relative to '${position.relativeTo}' before both nodes have layout positions`,
        );
      }
      x = reference.x + position.dx;
      y = reference.y + position.dy;
    } else {
      x = position.x;
      y = position.y;
    }
    const moved = this.moveNodeAndDescendants(diagram, nodeId, x, y, pinned);
    this.assertNodeWithinParent(diagram, moved, nodeId);
    const movedIds = Object.keys(moved.positions).filter((targetId) =>
      moved.positions[targetId] !== diagram.view.positions[targetId]
    );
    return await this.viewPreview(
      viewId,
      operation,
      before,
      moved,
      [...new Set([...resolvedIds, ...movedIds])],
    );
  }

  /** Preview an expanded-system boundary mutation without moving descendants. */
  async previewResize(
    viewId: string,
    id: string,
    input: { width: number; height: number; x?: number; y?: number } | { fit: true },
  ): Promise<ViewMutationPreview> {
    const before = await this.view(viewId);
    const diagram = await this.diagram(viewId, undefined, false);
    const nodeId = this.resolveDiagramNodesIn(diagram, [id])[0];
    if (!nodeId) throw new Error(`No visible diagram node matches '${id}'.`);
    const after = this.resizeContainer(diagram, nodeId, input);
    return await this.viewPreview(viewId, "layout.resize", before, after, [nodeId]);
  }

  async previewPin(
    viewId: string,
    id: string,
    pinned: boolean,
  ): Promise<ViewMutationPreview> {
    const before = await this.view(viewId);
    const diagram = await this.diagram(viewId, undefined, false);
    const resolvedIds = this.resolveDiagramNodesIn(diagram, [id]);
    const nodeId = resolvedIds[0];
    if (!nodeId) throw new Error(`No visible diagram node matches '${id}'.`);
    return await this.viewPreview(
      viewId,
      pinned ? "layout.pin" : "layout.unpin",
      before,
      pinNode(diagram.view, nodeId, pinned),
      resolvedIds,
    );
  }

  async previewApplyLayout(viewId: string): Promise<ViewMutationPreview> {
    const before = await this.view(viewId);
    const diagram = await this.diagram(viewId, undefined, false);
    const resolvedIds = diagram.nodes.map((node) => node.id);
    return await this.viewPreview(
      viewId,
      "layout.apply",
      before,
      applyLayeredLayout(diagram.view, this.layoutGraph(diagram)),
      resolvedIds,
    );
  }

  async previewAlign(
    viewId: string,
    ids: readonly string[],
    alignment: LayoutAlignment,
    pinned = true,
  ): Promise<ViewMutationPreview> {
    const before = await this.view(viewId);
    const diagram = await this.diagram(viewId, undefined, false);
    const resolvedIds = this.resolveDiagramNodesIn(diagram, ids);
    return await this.viewPreview(
      viewId,
      `layout.align.${alignment}`,
      before,
      alignNodes(diagram.view, resolvedIds, alignment, pinned),
      resolvedIds,
    );
  }

  async previewDistribute(
    viewId: string,
    ids: readonly string[],
    direction: LayoutDistribution,
    pinned = true,
  ): Promise<ViewMutationPreview> {
    const before = await this.view(viewId);
    const diagram = await this.diagram(viewId, undefined, false);
    const resolvedIds = this.resolveDiagramNodesIn(diagram, ids);
    return await this.viewPreview(
      viewId,
      `layout.distribute.${direction}`,
      before,
      distributeNodes(diagram.view, resolvedIds, direction, pinned),
      resolvedIds,
    );
  }

  async previewResetViewLayout(viewId: string): Promise<ViewMutationPreview> {
    const before = await this.view(viewId);
    const diagram = await this.diagram(viewId, undefined, false);
    const resolvedIds = diagram.nodes.map((node) => node.id);
    const after = applyLayeredLayout(resetLayout(diagram.view), this.layoutGraph(diagram));
    return await this.viewPreview(viewId, "layout.reset", before, after, resolvedIds);
  }

  async diagram(
    viewId?: string,
    rootId?: string,
    persistPassiveLayout = true,
  ): Promise<DiagramResponse> {
    let view = await this.view(viewId);
    const authoritativePositionIds = new Set(Object.keys(view.positions));
    const requestedRoot = rootId ?? view.rootId ?? this.preferredRootId();
    if (!requestedRoot) {
      throw new Error("The project has no renderable root component definitions");
    }
    const selectedRoot = this.resolveDefinitionRoot(requestedRoot, view);
    const diagram = deriveDiagram(this.model, {
      rootId: selectedRoot,
      expanded: view.expanded,
      view: { hiddenElementIds: view.hidden, aliases: view.aliases },
    });
    view = applyLayeredLayout(
      view,
      this.layoutGraph({ ...diagram, view }),
      { onlyNew: true },
    );
    view = this.stabilizeExpandedContainerLayout(
      { ...diagram, view },
      authoritativePositionIds,
    );
    // Generated ELK routes are a cache, not durable geometry.  Clearing them
    // while reading lets old saved views heal without ever deleting a pinned
    // manual path.
    view = { ...view, edgeRoutes: manualEdgeRoutes(view.edgeRoutes) };
    const stored = await this.view(view.id);
    if (persistPassiveLayout && (
      JSON.stringify(stored.positions) !== JSON.stringify(view.positions) ||
      JSON.stringify(stored.edgeRoutes) !== JSON.stringify(view.edgeRoutes)
    )) {
      const document = await this.views.upsert(
        view.id,
        { positions: view.positions, edgeRoutes: view.edgeRoutes },
        this.preferredRootId(),
      );
      this.#viewRevision = Math.max(this.#viewRevision, document.viewRevision);
      this.emit({
        type: "view.updated",
        at: new Date().toISOString(),
        revision: this.#revision,
        data: { viewId: view.id, passive: true, viewRevision: this.#viewRevision },
      });
    }
    return {
      ...diagram,
      diagnostics: [...diagram.diagnostics, ...this.#latestDiagnostics],
      nodes: diagram.nodes.map((node) => {
        const position = view.positions[node.id] ?? { x: 0, y: 0, pinned: false };
        return { ...node, position, pinned: position.pinned };
      }),
      revision: this.#revision,
      viewRevision: this.#viewRevision,
      stale: this.#stale,
      validation: this.validation,
      view,
      breadcrumbs: [{ id: selectedRoot, label: diagram.title }],
    };
  }

  async move(
    viewId: string,
    id: string,
    x: number,
    y: number,
    pinned = true,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    const view = await this.view(viewId);
    const nodeId = await this.resolveDiagramNode(view, id);
    const diagram = await this.diagram(viewId, undefined, false);
    const moved = this.moveNodeAndDescendants(diagram, nodeId, x, y, pinned);
    this.assertNodeWithinParent(diagram, moved, nodeId);
    const targetIds = Object.keys(moved.positions).filter((targetId) =>
      moved.positions[targetId] !== diagram.view.positions[targetId]
    );
    return await this.updatePositions(
      viewId,
      Object.fromEntries(targetIds.map((targetId) => [targetId, moved.positions[targetId]!])),
      context,
      "layout.move",
      targetIds,
    );
  }

  async moveRelative(
    viewId: string,
    id: string,
    relativeTo: string,
    dx = 0,
    dy = 0,
    pinned = true,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    let view = await this.view(viewId);
    const [nodeId, referenceId] = await this.resolveDiagramNodes(view, [id, relativeTo]);
    view = await this.view(viewId);
    const reference = referenceId === undefined ? undefined : view.positions[referenceId];
    if (!nodeId || !referenceId || !reference) {
      throw new Error(`Cannot move '${id}' relative to '${relativeTo}' before both nodes have layout positions`);
    }
    const diagram = await this.diagram(viewId, undefined, false);
    const moved = this.moveNodeAndDescendants(diagram, nodeId, reference.x + dx, reference.y + dy, pinned);
    this.assertNodeWithinParent(diagram, moved, nodeId);
    const targetIds = Object.keys(moved.positions).filter((targetId) =>
      moved.positions[targetId] !== diagram.view.positions[targetId]
    );
    return await this.updatePositions(
      viewId,
      Object.fromEntries(targetIds.map((targetId) => [targetId, moved.positions[targetId]!])),
      context,
      "layout.move-relative",
      targetIds,
    );
  }

  /** Resize a rendered expanded container.  Coordinates are canvas-absolute,
   * so changing its left/top edge deliberately leaves every child untouched. */
  async resize(
    viewId: string,
    id: string,
    input: { width: number; height: number; x?: number; y?: number } | { fit: true },
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    const diagram = await this.diagram(viewId, undefined, false);
    const nodeId = this.resolveDiagramNodesIn(diagram, [id])[0];
    if (!nodeId) throw new Error(`No visible diagram node matches '${id}'.`);
    const resized = this.resizeContainer(diagram, nodeId, input);
    return await this.updatePositions(
      viewId,
      { [nodeId]: resized.positions[nodeId]! },
      context,
      "layout.resize",
      [nodeId],
    );
  }

  async pin(
    viewId: string,
    id: string,
    pinned: boolean,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    let view = await this.view(viewId);
    const nodeId = await this.resolveDiagramNode(view, id);
    view = await this.view(viewId);
    const updated = pinNode(view, nodeId, pinned);
    return await this.updateView(
      viewId,
      { positions: updated.positions },
      context,
      pinned ? "layout.pin" : "layout.unpin",
      [nodeId],
    );
  }

  async applyLayout(
    viewId: string,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    const view = await this.view(viewId);
    const diagram = await this.diagram(viewId);
    const laidOut = applyLayeredLayout(view, this.layoutGraph(diagram));
    return await this.updateView(
      viewId,
      { positions: laidOut.positions },
      context,
      "layout.apply",
      diagram.nodes.map((node) => node.id),
    );
  }

  async align(
    viewId: string,
    ids: readonly string[],
    alignment: LayoutAlignment,
    pinned = true,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    let view = await this.view(viewId);
    const nodeIds = await this.resolveDiagramNodes(view, ids);
    view = await this.view(viewId);
    return await this.updateView(
      viewId,
      { positions: alignNodes(view, nodeIds, alignment, pinned).positions },
      context,
      `layout.align.${alignment}`,
      nodeIds,
    );
  }

  async distribute(
    viewId: string,
    ids: readonly string[],
    direction: LayoutDistribution,
    pinned = true,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    let view = await this.view(viewId);
    const nodeIds = await this.resolveDiagramNodes(view, ids);
    view = await this.view(viewId);
    return await this.updateView(
      viewId,
      { positions: distributeNodes(view, nodeIds, direction, pinned).positions },
      context,
      `layout.distribute.${direction}`,
      nodeIds,
    );
  }

  async resetViewLayout(
    viewId: string,
    context: ViewMutationContext = {},
  ): Promise<ViewDocument> {
    const view = await this.view(viewId);
    const diagram = await this.diagram(viewId);
    const laidOut = applyLayeredLayout(resetLayout(view), this.layoutGraph(diagram));
    const document = await this.views.upsert(
      viewId,
      { positions: laidOut.positions, edgeRoutes: {} },
      this.preferredRootId(),
      this.mutationInput(
        "layout.reset",
        context,
        diagram.nodes.map((node) => node.id),
        ["positions", "edgeRoutes"],
      ),
    );
    this.#viewRevision = document.viewRevision;
    this.emit({
      type: "view.updated",
      at: new Date().toISOString(),
      revision: this.#revision,
      data: {
        viewId,
        resetLayout: true,
        viewRevision: this.#viewRevision,
        ...(context.clientId ? { clientId: context.clientId } : {}),
        ...(context.mutationId ? { mutationId: context.mutationId } : {}),
      },
    });
    return document;
  }

  async health(viewId?: string, rootId?: string): Promise<DiagramHealthResponse> {
    const diagram = await this.diagram(viewId, rootId);
    const health = computeDiagramHealth(diagram, this.toCoreLayout(diagram.view, diagram), {
      presentation: this.toCorePresentation(diagram.view, diagram),
      showEdgeLabels: diagram.view.showEdgeLabels ?? true,
      showPorts: diagram.view.showPorts ?? true,
      showTypes: diagram.view.showTypes ?? true,
    });
    return { ...health, fidelity: fidelityAssessment(diagram, health) };
  }

  async render(format: "svg" | "png", viewId?: string, rootId?: string): Promise<Buffer> {
    const diagram = await this.diagram(viewId, rootId);
    const svg = renderDiagramSvg(diagram, {
      layout: this.toCoreLayout(diagram.view, diagram),
      presentation: this.toCorePresentation(diagram.view, diagram),
      showPorts: diagram.view.showPorts ?? true,
      showEdgeLabels: diagram.view.showEdgeLabels ?? true,
      showTypes: diagram.view.showTypes ?? true,
    });
    if (format === "svg") {
      return Buffer.from(svg, "utf8");
    }
    return await sharp(Buffer.from(svg, "utf8")).png().toBuffer();
  }

  async checkpoint(input: { name: string; message?: string; author?: string }): Promise<Checkpoint> {
    if (!input.name.trim()) {
      throw new Error("Checkpoint name must not be empty");
    }
    const document = await this.viewDocument();
    this.#viewRevision = Math.max(this.#viewRevision, document.viewRevision);
    const requestsValidation = !this.#stale;
    const checkpoint: Checkpoint = {
      id: randomUUID(),
      name: input.name.trim(),
      ...(input.message === undefined ? {} : { message: input.message }),
      ...(input.author === undefined ? {} : { author: input.author }),
      createdAt: new Date().toISOString(),
      modelRevision: this.#revision,
      viewRevision: this.#viewRevision,
      viewId: document.activeViewId,
      parseStatus: this.#stale ? "stale" : "valid",
      validationStatus: requestsValidation ? "pending" : this.validation.status,
    };
    await this.views.addCheckpoint(checkpoint);
    this.emit({
      type: "checkpoint.created",
      at: new Date().toISOString(),
      revision: this.#revision,
      data: checkpoint,
    });
    if (requestsValidation) {
      void this.completeCheckpointValidation(checkpoint);
    }
    return checkpoint;
  }

  async checkpoints(): Promise<Checkpoint[]> {
    return await this.views.listCheckpoints();
  }

  async validate(): Promise<ValidationState> {
    if (this.#validationPromise) {
      const running = await this.#validationPromise;
      if (!this.#stale && running.revision !== this.#revision) {
        return await this.validate();
      }
      return running;
    }
    const revision = this.#revision;
    this.#validation = {
      status: "pending",
      startedAt: new Date().toISOString(),
      revision,
      message: "Sireum validation is running in the background",
    };
    this.emit({
      type: "validation.updated",
      at: new Date().toISOString(),
      revision,
      data: this.#validation,
    });
    this.#validationPromise = validateWithSireum({
      executable: defaultSireumExecutable(this.options.sireum),
      projectRoot: this.root,
      libraryRoots: this.libraryRoots,
      files: this.model.files.filter((file) => file.origin === "project").map((file) => file.path),
      revision,
    }).then(
      (result) => {
        this.#validation = result;
        this.#validationPromise = null;
        this.emit({
          type: "validation.updated",
          at: new Date().toISOString(),
          revision: this.#revision,
          data: this.validation,
        });
        return result;
      },
      (error: unknown) => {
        this.#validationPromise = null;
        throw error;
      },
    );
    return await this.#validationPromise;
  }

  private async completeCheckpointValidation(checkpoint: Checkpoint): Promise<void> {
    let validationStatus: Checkpoint["validationStatus"];
    try {
      const result = await this.validate();
      validationStatus = result.revision === checkpoint.modelRevision ? result.status : "stale";
    } catch {
      validationStatus = "tool-error";
    }
    try {
      const updated = await this.views.updateCheckpoint(checkpoint.id, { validationStatus });
      this.emit({
        type: "checkpoint.updated",
        at: new Date().toISOString(),
        revision: this.#revision,
        data: updated,
      });
    } catch (error) {
      this.emit({
        type: "checkpoint.updated",
        at: new Date().toISOString(),
        revision: this.#revision,
        data: {
          checkpointId: checkpoint.id,
          error: error instanceof Error ? error.message : String(error),
        },
      });
    }
  }

  private async reload(reason: string): Promise<void> {
    const operation = this.#reloadTail.then(
      async () => await this.performReload(reason),
      async () => await this.performReload(reason),
    );
    this.#reloadTail = operation.catch(() => undefined);
    return await operation;
  }

  private async performReload(reason: string): Promise<void> {
    if (this.#validationTimer) {
      clearTimeout(this.#validationTimer);
      this.#validationTimer = null;
    }
    const isLiveReload = this.#result !== null;
    try {
      const result = await parseProject({
        root: this.root,
        libraryRoots: this.libraryRoots,
        ...(this.options.include === undefined ? {} : { include: this.options.include }),
        ...(this.options.exclude === undefined ? {} : { exclude: this.options.exclude }),
      });
      this.#latestDiagnostics = result.diagnostics;
      if (result.renderable) {
        const migrationWarnings: ViewMigrationWarning[] = [];
        if (this.#result) {
          try {
            const currentDocument = await this.views.load(this.preferredRootId());
            const migration = migrateViewDocument(
              this.#result.model,
              result.model,
              currentDocument,
            );
            migrationWarnings.push(...migration.warnings);
            if (JSON.stringify(migration.document) !== JSON.stringify(currentDocument)) {
              await this.views.save(migration.document);
            }
          } catch (error) {
            migrationWarnings.push({
              code: "VIEW_MIGRATION_FAILED",
              message: `The model updated, but persisted view state could not be migrated: ${(error as Error).message}`,
              oldIds: [],
              candidates: [],
            });
          }
        }
        this.#latestDiagnostics = [
          ...result.diagnostics,
          ...migrationWarnings.map((warning): Diagnostic => ({
            code: warning.code,
            severity: "warning",
            fatal: false,
            message: warning.message,
            hint:
              warning.candidates.length > 0
                ? `Review the possible replacements: ${warning.candidates.join(", ")}`
                : "Review the affected view and reposition any unmatched elements.",
          })),
        ];
        this.#result = result;
        this.#revision += 1;
        this.#stale = false;
        this.emit({
          type: "model.updated",
          at: new Date().toISOString(),
          revision: this.#revision,
          data: {
            reason,
            diagnostics: this.#latestDiagnostics,
            migrationWarnings,
          },
        });
        if (isLiveReload) {
          this.scheduleValidation();
        }
      } else {
        this.#stale = true;
        this.emit({
          type: "model.stale",
          at: new Date().toISOString(),
          revision: this.#revision,
          data: { reason, diagnostics: result.diagnostics },
        });
      }
    } catch (error) {
      this.#stale = true;
      this.#latestDiagnostics = [
        {
          code: "SESSION_PARSE_FAILURE",
          severity: "error",
          fatal: true,
          message: (error as Error).message,
          hint: "The last renderable model remains visible. Correct the source and save again.",
        },
      ];
      if (!this.#result) {
        throw error;
      }
      this.emit({
        type: "model.stale",
        at: new Date().toISOString(),
        revision: this.#revision,
        data: { reason, diagnostics: this.#latestDiagnostics },
      });
    }
  }

  private scheduleValidation(): void {
    const debounceMs = this.options.validationDebounceMs;
    if (debounceMs === undefined || this.#closed || this.#stale) {
      return;
    }
    if (this.#validationTimer) {
      clearTimeout(this.#validationTimer);
    }
    this.#validationTimer = setTimeout(() => {
      this.#validationTimer = null;
      if (!this.#closed && !this.#stale) {
        void this.validate().catch(() => undefined);
      }
    }, debounceMs);
  }

  private async startWatching(): Promise<void> {
    this.#watcher = chokidar.watch(this.root, {
      persistent: true,
      ignoreInitial: true,
      ignored: (candidate) =>
        isExcludedProjectPath(this.root, candidate, this.libraryRoots, {
          ...(this.options.include === undefined ? {} : { include: this.options.include }),
          ...(this.options.exclude === undefined ? {} : { exclude: this.options.exclude }),
        }),
      followSymlinks: false,
      awaitWriteFinish: { stabilityThreshold: 180, pollInterval: 40 },
    });
    const schedule = (changedPath: string): void => {
      if (this.#closed || path.extname(changedPath).toLowerCase() !== ".sysml") {
        return;
      }
      if (this.#reloadTimer) {
        clearTimeout(this.#reloadTimer);
      }
      this.#reloadTimer = setTimeout(() => {
        this.#reloadTimer = null;
        if (!this.#closed) {
          void this.reload(`file changed: ${changedPath}`);
        }
      }, 250);
    };
    this.#watcher.on("add", schedule).on("change", schedule).on("unlink", schedule);
  }

  private preferredRootId(): string | null {
    if (!this.#result) {
      return null;
    }
    const candidates = this.model.definitions.filter((definition) =>
      definition.origin === "project" &&
      this.model.rootCandidates.includes(definition.id),
    );
    // Retain the curated Isolette launch contract while using general scoring
    // for every other project.
    const curated = candidates.find(
      (definition) => definition.qualifiedName === "Isolette::Isolette_Single_Sensor",
    );
    if (curated) return curated.id;
    const definitions = new Map(this.model.definitions.map((definition) => [definition.id, definition]));
    const coverage = (id: string, visited = new Set<string>()): number => {
      if (visited.has(id)) return 0;
      visited.add(id);
      const definition = definitions.get(id);
      if (!definition) return 0;
      return definition.partIds.length + definition.connectionIds.length +
        definition.partIds.reduce((total, partId) => {
          const part = this.model.parts.find((candidate) => candidate.id === partId);
          return total + (part?.resolvedDefinitionId ? coverage(part.resolvedDefinitionId, visited) : 0);
        }, 0);
    };
    const nameScore = (name: string): number => {
      const normalized = name.toLowerCase();
      if (/(^|_)(complete|context)(_|$)/u.test(normalized)) return 120;
      if (/(^|_)(system|architecture)(_|$)/u.test(normalized)) return 70;
      return 0;
    };
    return candidates
      .map((definition) => ({
        definition,
        score:
          (definition.category === "system" ? 200 : 0) +
          nameScore(definition.name) +
          coverage(definition.id) * 10 +
          definition.connectionIds.length * 4 +
          definition.partIds.length * 3,
      }))
      .sort((left, right) =>
        right.score - left.score ||
        left.definition.qualifiedName.localeCompare(right.definition.qualifiedName),
      )[0]?.definition.id ?? null;
  }

  private resolveDefinitionRoot(requested: string, view: ViewState): string {
    const definitions = this.model.definitions.filter(
      (definition) =>
        definition.id === requested ||
        definition.qualifiedName === requested ||
        definition.name === requested ||
        view.aliases[definition.id] === requested,
    );
    if (definitions.length === 1 && definitions[0]) {
      return definitions[0].id;
    }
    if (definitions.length > 1) {
      const candidates = definitions.map((definition) => definition.id).sort();
      throw new SessionQueryError(
        "SYSML_AMBIGUOUS_ROOT",
        `Root '${requested}' is ambiguous. Use a qualified name or one of: ${candidates.join(", ")}`,
        candidates,
      );
    }
    const usages = this.model.parts.filter(
      (part) =>
        part.id === requested ||
        part.qualifiedName === requested ||
        part.name === requested ||
        view.aliases[part.id] === requested,
    );
    const resolvedUsages = usages.filter((usage) => usage.resolvedDefinitionId);
    if (resolvedUsages.length === 1 && resolvedUsages[0]?.resolvedDefinitionId) {
      return resolvedUsages[0].resolvedDefinitionId;
    }
    if (resolvedUsages.length > 1) {
      const candidates = resolvedUsages.map((usage) => usage.id).sort();
      throw new SessionQueryError(
        "SYSML_AMBIGUOUS_ROOT",
        `Root usage '${requested}' is ambiguous. Use a qualified name or one of: ${candidates.join(", ")}`,
        candidates,
      );
    }
    const slash = requested.startsWith("node:") ? requested.indexOf("/") : -1;
    const embeddedRoot = slash > "node:".length ? requested.slice("node:".length, slash) : null;
    const contextualRoots = [
      embeddedRoot,
      view.rootId,
      this.preferredRootId(),
      ...this.model.rootCandidates,
    ].filter((candidate, index, all): candidate is string =>
      Boolean(candidate) &&
      candidate !== requested &&
      all.indexOf(candidate) === index &&
      this.model.definitions.some((definition) => definition.id === candidate),
    );
    for (const contextualRoot of contextualRoots) {
      const contextual = deriveDiagram(this.model, {
        rootId: contextualRoot,
        expanded: view.expanded,
        // Root recovery must not depend on whether the instance happened to
        // be hidden in the current presentation state.
        view: { hiddenElementIds: [], aliases: view.aliases },
      }).nodes.find((node) => node.id === requested || node.elementId === requested);
      if (contextual?.definitionId) {
        return contextual.definitionId;
      }
    }
    throw new Error(
      `No component definition matches '${requested}'. Inspect /api/model for valid root candidate IDs.`,
    );
  }

  private mutationInput(
    operation: string,
    context: ViewMutationContext,
    targetIds: readonly string[],
    changedFields?: readonly string[],
  ): ViewMutationInput {
    const actor = (context.actor ?? context.client ?? "api").trim();
    if (!actor || actor.length > 120) {
      throw new Error("Visual mutation actor must contain between 1 and 120 characters");
    }
    if (!operation.trim() || operation.length > 120) {
      throw new Error("Visual mutation operation must contain between 1 and 120 characters");
    }
    return {
      actor,
      client: context.client ?? "api",
      operation,
      modelRevision: this.#revision,
      targetIds: [...targetIds],
      ...(changedFields === undefined ? {} : { changedFields: [...changedFields] }),
    };
  }

  private mergeViewPatch(
    existing: ViewState | undefined,
    patch: Partial<ViewState>,
  ): Partial<ViewState> {
    const merged = {
      ...patch,
      ...(patch.positions && existing
        ? { positions: { ...existing.positions, ...patch.positions } }
        : {}),
      ...(patch.edgeRoutes && existing
        ? { edgeRoutes: { ...existing.edgeRoutes, ...patch.edgeRoutes } }
        : {}),
      ...(patch.aliases && existing
        ? { aliases: { ...existing.aliases, ...patch.aliases } }
        : {}),
    };
    if (!geometryPatchInvalidatesAutomaticRoutes(patch)) return merged;
    const routes = merged.edgeRoutes ?? existing?.edgeRoutes ?? {};
    if (Object.values(routes).every((route) => route.pinned)) return merged;
    return { ...merged, edgeRoutes: manualEdgeRoutes(routes) };
  }

  private activeView(document: ViewDocument): ViewState {
    return (
      document.views.find((view) => view.id === document.activeViewId) ??
      document.views[0] ??
      (() => {
        throw new Error("View document contains no views");
      })()
    );
  }

  private async ensureDefaultView(): Promise<void> {
    let document = await this.views.load(this.preferredRootId());
    for (const view of document.views) {
      if (!view.rootId) continue;
      let resolvedRoot: string;
      try {
        resolvedRoot = this.resolveDefinitionRoot(view.rootId, view);
      } catch {
        resolvedRoot = this.preferredRootId() ?? view.rootId;
      }
      if (resolvedRoot === view.rootId) continue;
      document = await this.views.upsert(
        view.id,
        { rootId: resolvedRoot },
        this.preferredRootId(),
        this.mutationInput(
          "view.root.recovered",
          { client: "system" },
          [view.id, view.rootId, resolvedRoot],
          ["rootId"],
        ),
      );
    }
    const active = this.activeView(document);
    if (!active.rootId && this.preferredRootId()) {
      await this.views.upsert(active.id, { rootId: this.preferredRootId() }, this.preferredRootId());
    }
    await this.ensureFaaA1View();
  }

  private async ensureFaaA1View(): Promise<void> {
    const definitions = faaA1PresetDefinitions(this.model);
    const latest = definitions.at(-1);
    if (!latest) return;
    const document = await this.views.load(this.preferredRootId());
    const existing = document.views.find((view) => view.id === FAA_A1_PRESET_ID);
    if (!existing) {
      await this.views.upsert(FAA_A1_PRESET_ID, latest, latest.rootId);
      return;
    }
    const reconciliation = reconcilePresetView(existing, definitions);
    if (reconciliation.action === "adopted" || reconciliation.action === "upgraded") {
      const migrated = await this.views.upsert(
        FAA_A1_PRESET_ID,
        reconciliation.view,
        latest.rootId,
        this.mutationInput(
          `preset.${reconciliation.action}`,
          { client: "system" },
          [FAA_A1_PRESET_ID],
          ["preset"],
        ),
      );
      this.#viewRevision = Math.max(this.#viewRevision, migrated.viewRevision);
    }
  }

  private async resolveDiagramNode(view: ViewState, id: string): Promise<string> {
    const [resolved] = await this.resolveDiagramNodes(view, [id]);
    if (!resolved) {
      throw new Error(`No visible diagram node matches '${id}'.`);
    }
    return resolved;
  }

  private async resolveDiagramNodes(view: ViewState, ids: readonly string[]): Promise<string[]> {
    const diagram = await this.diagram(view.id);
    return this.resolveDiagramNodesIn(diagram, ids);
  }

  private resolveDiagramNodesIn(diagram: DiagramResponse, ids: readonly string[]): string[] {
    return ids.map((id) => {
      const exact = diagram.nodes.filter(
        (node) =>
          node.id === id ||
          node.elementId === id ||
          node.name === id ||
          node.label === id ||
          node.instancePath.join(".") === id ||
          node.instancePath.join("::") === id ||
          this.model.elements[node.elementId]?.qualifiedName === id,
      );
      const boundary = diagram.boundaryPorts.find(
        (port) =>
          `boundary:${port.id}` === id ||
          port.id === id ||
          port.elementId === id ||
          port.name === id ||
          port.label === id ||
          this.model.elements[port.elementId]?.qualifiedName === id,
      );
      if (boundary) return `boundary:${boundary.id}`;
      if (exact.length === 1 && exact[0]) return exact[0].id;
      if (exact.length > 1) {
        const candidates = exact.map((node) => node.id);
        throw new SessionQueryError(
          "DIAGRAM_NODE_AMBIGUOUS",
          `Diagram node name '${id}' is ambiguous. Candidates: ${candidates.join(", ")}`,
          candidates,
        );
      }
      const matches = diagram.nodes.filter((node) =>
        node.name.toLowerCase().includes(id.toLowerCase()),
      );
      const suffix = matches.length
        ? ` Similar visible nodes: ${matches.map((node) => `${node.name} (${node.id})`).join(", ")}`
        : "";
      throw new SessionQueryError(
        "DIAGRAM_NODE_NOT_FOUND",
        `No visible diagram node matches '${id}'.${suffix}`,
        matches.map((node) => node.id),
      );
    });
  }

  private async viewPreview(
    viewId: string,
    operation: string,
    before: ViewState,
    after: ViewState,
    resolvedIds: readonly string[],
  ): Promise<ViewMutationPreview> {
    const document = await this.viewDocument();
    return {
      dryRun: true,
      operation,
      baseViewRevision: document.viewRevision,
      viewId,
      resolvedIds: [...resolvedIds],
      before,
      after,
    };
  }

  private nodeSize(
    diagram: { nodes: ReadonlyArray<{ id: string; parentNodeId?: string | null }> },
    view: ViewState,
    nodeId: string,
  ): { width: number; height: number } {
    const saved = view.positions[nodeId];
    const expanded = diagram.nodes.some((node) => node.parentNodeId === nodeId);
    return {
      width: saved?.width ?? (expanded ? 640 : 248),
      height: saved?.height ?? (expanded ? 380 : 142),
    };
  }

  /**
   * Convert only newly discovered or invalid unpinned children to container
   * coordinates. Existing in-bounds positions (including overlaps) are user
   * layout and remain authoritative. Pinned legacy children instead expand or
   * move the boundary while retaining their absolute canvas coordinates.
   */
  private stabilizeExpandedContainerLayout(
    diagram: {
      nodes: ReadonlyArray<{ id: string; parentNodeId?: string | null }>;
      view: ViewState;
    },
    authoritativePositionIds: ReadonlySet<string>,
  ): ViewState {
    const positions = { ...diagram.view.positions };
    const nodesById = new Map(diagram.nodes.map((node) => [node.id, node]));
    const childrenByParent = new Map<string, Array<(typeof diagram.nodes)[number]>>();
    for (const node of diagram.nodes) {
      if (!node.parentNodeId) continue;
      const children = childrenByParent.get(node.parentNodeId) ?? [];
      children.push(node);
      childrenByParent.set(node.parentNodeId, children);
    }
    const depth = (id: string): number => {
      let result = 0;
      let parentId = nodesById.get(id)?.parentNodeId;
      const visited = new Set<string>();
      while (parentId && !visited.has(parentId)) {
        visited.add(parentId);
        result += 1;
        parentId = nodesById.get(parentId)?.parentNodeId;
      }
      return result;
    };
    const containers = [...childrenByParent.keys()].sort((left, right) => depth(right) - depth(left));

    for (const containerId of containers) {
      const current = positions[containerId];
      if (!current) continue;
      const children = childrenByParent.get(containerId) ?? [];
      const originalX = current.x;
      const originalY = current.y;
      let x = current.x;
      let y = current.y;
      let width = Math.max(640, current.width ?? 640);
      let height = Math.max(380, current.height ?? 380);

      for (const child of children) {
        const childPosition = positions[child.id];
        if (!childPosition || !authoritativePositionIds.has(child.id) || !childPosition.pinned) continue;
        x = Math.min(x, childPosition.x - 28);
        y = Math.min(y, childPosition.y - 72);
      }
      width += originalX - x;
      height += originalY - y;

      const sizeOf = (id: string) => this.nodeSize(diagram, { ...diagram.view, positions }, id);
      const inBounds = (childId: string): boolean => {
        const childPosition = positions[childId];
        if (!childPosition) return false;
        const size = sizeOf(childId);
        return childPosition.x >= x + 28 &&
          childPosition.y >= y + 72 &&
          childPosition.x + size.width <= x + width - 28 &&
          childPosition.y + size.height <= y + height - 28;
      };

      const retained = children.filter((child) => {
        const childPosition = positions[child.id];
        return Boolean(
          childPosition &&
          authoritativePositionIds.has(child.id) &&
          (inBounds(child.id) || childPosition.pinned),
        );
      });
      for (const child of retained) {
        const childPosition = positions[child.id]!;
        const size = sizeOf(child.id);
        width = Math.max(width, childPosition.x + size.width + 28 - x);
        height = Math.max(height, childPosition.y + size.height + 28 - y);
      }

      const occupied: Array<{ x: number; y: number; width: number; height: number }> = retained.map((child) => {
        const position = positions[child.id]!;
        return { ...position, ...sizeOf(child.id) };
      });
      for (const child of children) {
        if (retained.some((candidate) => candidate.id === child.id)) continue;
        const existing = positions[child.id];
        if (!existing) continue;
        const size = sizeOf(child.id);
        let candidateX = x + 28;
        let candidateY = y + 72;
        while (true) {
          const collisions = occupied.filter((box) =>
            candidateX < box.x + box.width + 28 &&
            candidateX + size.width + 28 > box.x &&
            candidateY < box.y + box.height + 28 &&
            candidateY + size.height + 28 > box.y
          );
          if (collisions.length === 0) break;
          candidateY = Math.max(...collisions.map((box) => box.y + box.height + 28));
        }
        positions[child.id] = { ...existing, x: candidateX, y: candidateY };
        occupied.push({ x: candidateX, y: candidateY, ...size });
        width = Math.max(width, candidateX + size.width + 28 - x);
        height = Math.max(height, candidateY + size.height + 28 - y);
      }
      positions[containerId] = { ...current, x, y, width, height };
    }
    return { ...diagram.view, positions, updatedAt: new Date().toISOString() };
  }

  private assertNodeWithinParent(
    diagram: { nodes: ReadonlyArray<{ id: string; parentNodeId?: string | null }> },
    view: ViewState,
    nodeId: string,
  ): void {
    const node = diagram.nodes.find((candidate) => candidate.id === nodeId);
    if (!node?.parentNodeId) return;
    const parent = view.positions[node.parentNodeId];
    const position = view.positions[nodeId];
    if (!parent || !position) return;
    const size = this.nodeSize(diagram, view, nodeId);
    const parentSize = this.nodeSize(diagram, view, node.parentNodeId);
    const bounds = {
      minX: parent.x + 28,
      minY: parent.y + 72,
      maxX: parent.x + parentSize.width - 28 - size.width,
      maxY: parent.y + parentSize.height - 28 - size.height,
    };
    if (position.x < bounds.minX || position.x > bounds.maxX || position.y < bounds.minY || position.y > bounds.maxY) {
      throw new Error(
        `Cannot move nested node '${nodeId}' outside parent '${node.parentNodeId}' usable interior; ` +
        `allowable bounds are x ${bounds.minX}..${bounds.maxX}, y ${bounds.minY}..${bounds.maxY}.`,
      );
    }
  }

  /** React Flow presents nested nodes as a group when their expanded parent is
   * dragged. Persist that same visual contract by translating the complete
   * descendant subtree in canvas-absolute coordinates. */
  private moveNodeAndDescendants(
    diagram: DiagramResponse,
    nodeId: string,
    x: number,
    y: number,
    pinned: boolean,
  ): ViewState {
    const current = diagram.view.positions[nodeId];
    if (!current) throw new Error(`Cannot move '${nodeId}' before it has a layout position`);
    const dx = x - current.x;
    const dy = y - current.y;
    const descendants = new Set<string>();
    let frontier = [nodeId];
    while (frontier.length > 0) {
      const parents = new Set(frontier);
      frontier = diagram.nodes
        .filter((node) => node.parentNodeId && parents.has(node.parentNodeId) && !descendants.has(node.id))
        .map((node) => node.id);
      frontier.forEach((id) => descendants.add(id));
    }
    const positions = { ...diagram.view.positions };
    positions[nodeId] = { ...current, x, y, pinned };
    for (const descendantId of descendants) {
      const descendant = positions[descendantId];
      if (descendant) positions[descendantId] = { ...descendant, x: descendant.x + dx, y: descendant.y + dy };
    }
    return { ...diagram.view, positions, updatedAt: new Date().toISOString() };
  }

  private resizeContainer(
    diagram: DiagramResponse,
    nodeId: string,
    input: { width: number; height: number; x?: number; y?: number } | { fit: true },
  ): ViewState {
    const container = diagram.nodes.find((node) => node.id === nodeId);
    const children = diagram.nodes.filter((node) => node.parentNodeId === nodeId);
    if (!container || children.length === 0) {
      throw new Error(`Cannot resize '${nodeId}': only expanded system containers can be resized.`);
    }
    const current = diagram.view.positions[nodeId];
    if (!current) throw new Error(`Cannot resize '${nodeId}' before it has a layout position.`);
    const childBoxes = children.map((child) => {
      const position = diagram.view.positions[child.id];
      if (!position) throw new Error(`Cannot resize '${nodeId}' before child '${child.id}' has a layout position.`);
      const size = this.nodeSize(diagram, diagram.view, child.id);
      return { id: child.id, x: position.x, y: position.y, ...size };
    });
    let x = current.x;
    let y = current.y;
    let width: number;
    let height: number;
    if ("fit" in input) {
      width = Math.max(640, ...childBoxes.map((box) => box.x + box.width + 28 - x));
      height = Math.max(380, ...childBoxes.map((box) => box.y + box.height + 28 - y));
    } else {
      x = input.x ?? x;
      y = input.y ?? y;
      width = input.width;
      height = input.height;
    }
    if (!Number.isFinite(x) || !Number.isFinite(y) || !Number.isFinite(width) || !Number.isFinite(height) || width <= 0 || height <= 0) {
      throw new Error("Container resize requires finite, positive position and dimensions.");
    }
    const parent = container.parentNodeId
      ? diagram.view.positions[container.parentNodeId]
      : undefined;
    const parentSize = container.parentNodeId
      ? this.nodeSize(diagram, diagram.view, container.parentNodeId)
      : undefined;
    const assessment = assessContainerResize(
      { id: nodeId, x, y, width, height },
      defaultContainerResizeConstraints(
        childBoxes,
        parent && parentSize ? {
          x: parent.x + 28,
          y: parent.y + 72,
          width: parentSize.width - 56,
          height: parentSize.height - 100,
        } : undefined,
      ),
    );
    if (!assessment.valid) {
      if (assessment.escapingChildId) {
        throw new Error(`Resize does not contain child '${assessment.escapingChildId}' in the usable interior.`);
      }
      if (assessment.outsideParent) throw new Error("Resize would leave the containing system interior.");
      throw new Error("Expanded containers have a minimum size of 640 × 380.");
    }
    const positions = {
      ...diagram.view.positions,
      [nodeId]: { x, y, width, height, pinned: true },
    };
    const resized = { ...diagram.view, positions, updatedAt: new Date().toISOString() };
    this.assertNodeWithinParent(diagram, resized, nodeId);
    return resized;
  }

  private layoutGraph(
    diagram: Pick<DiagramModel, "nodes" | "boundaryPorts" | "edges"> & { view: ViewState },
  ): LayoutGraph {
    const showPorts = diagram.view.showPorts ?? true;
    const showTypes = diagram.view.showTypes ?? true;
    const ordinaryHeight = (portCount: number) =>
      showPorts
        ? Math.max(showTypes ? 68 : 58, 58 + portCount * 20)
        : showTypes ? 68 : 58;
    const childCounts = new Map<string, number>();
    for (const node of diagram.nodes) {
      if (node.parentNodeId) {
        childCounts.set(node.parentNodeId, (childCounts.get(node.parentNodeId) ?? 0) + 1);
      }
    }
    const dimensions = (ports: readonly DiagramPort[]) => {
      const inputs = ports.filter((port) => port.direction === "in" || port.direction === "inout").length;
      const outputs = ports.filter((port) => port.direction === "out" || port.direction === "inout").length;
      return { width: 248, height: ordinaryHeight(Math.max(inputs, outputs)) };
    };
    return {
      nodes: [
        ...diagram.nodes.map((node) => ({
          id: node.id,
          ...(node.parentNodeId ? { parentId: node.parentNodeId } : {}),
          ...(childCounts.has(node.id) ? { width: 640, height: 380 } : dimensions(node.ports)),
        })),
        ...diagram.boundaryPorts.map((port) => ({
          id: `boundary:${port.id}`,
          kind: "boundary",
          ...dimensions([port]),
        })),
      ],
      edges: diagram.edges.flatMap((edge) => {
        const source = edge.sourceNodeId ?? (edge.sourcePortId ? `boundary:${edge.sourcePortId}` : null);
        const target = edge.targetNodeId ?? (edge.targetPortId ? `boundary:${edge.targetPortId}` : null);
        return source && target ? [{ source, target }] : [];
      }),
    };
  }

  private toCoreLayout(
    view: ViewState,
    diagram: Pick<DiagramModel, "nodes" | "edges">,
  ): DiagramLayout {
    const visibleNodes = new Set(diagram.nodes.map((node) => node.id));
    const visibleEdges = new Set(diagram.edges.map((edge) => edge.id));
    return {
      nodes: {
        ...Object.fromEntries(
          Object.entries(view.positions)
            .filter(([id]) => visibleNodes.has(id))
            .map(([id, position]) => {
              const node = diagram.nodes.find((candidate) => candidate.id === id);
              const rows = node
                ? Math.max(
                    node.ports.filter((port) => port.direction !== "out").length,
                    node.ports.filter((port) => port.direction === "out").length,
                  )
                : 0;
              const fallbackHeight = view.showPorts === false
                ? view.showTypes === false ? 58 : 68
                : Math.max(view.showTypes === false ? 58 : 68, 58 + rows * 20);
              return [id, defaultGeometry(position, fallbackHeight)];
            }),
        ),
      },
      edges: Object.fromEntries(
        Object.entries(view.edgeRoutes)
          .filter(([id]) => visibleEdges.has(id))
          .map(([id, route]) => [id, route.points]),
      ),
    };
  }

  private toCorePresentation(view: ViewState, diagram: Pick<DiagramModel, "nodes">): DiagramPresentation {
    const resolve = (id: string): string => {
      const node = diagram.nodes.find((candidate) => candidate.id === id || candidate.elementId === id);
      if (node) return node.id;
      for (const candidate of diagram.nodes) {
        const port = candidate.ports.find((item) => item.id === id || item.elementId === id);
        if (port) return port.id;
      }
      return id;
    };
    return {
      annotations: view.annotations.map((annotation) => ({
        id: annotation.id,
        text: annotation.text,
        position: annotation.position,
        ...(annotation.style ? { style: annotation.style } : {}),
        ...(annotation.arrow ? { arrow: { ...annotation.arrow, targetId: resolve(annotation.arrow.targetId) } } : {}),
      })),
      nodes: view.presentationNodes ?? [],
      edges: (view.presentationEdges ?? []).map((edge) => ({
        ...edge,
        sourceId: resolve(edge.sourceId),
        targetId: resolve(edge.targetId),
      })),
    };
  }

  private sourceLocation(span: { file: string; start: { line: number; column: number }; end: { line: number; column: number } }): Record<string, unknown> {
    return {
      file: span.file,
      line: span.start.line,
      column: span.start.column,
      endLine: span.end.line,
      endColumn: span.end.column,
    };
  }

  private apiDiagnostic(diagnostic: ParseProjectResult["diagnostics"][number]): Record<string, unknown> {
    return {
      severity: diagnostic.severity,
      message: diagnostic.message,
      code: diagnostic.code,
      suggestion: diagnostic.hint,
      ...(diagnostic.span ? { source: this.sourceLocation(diagnostic.span) } : {}),
    };
  }

  private emit(event: SessionEvent): void {
    this.events.emit("event", event);
  }
}
