import { access, readFile } from "node:fs/promises";
import type { Server } from "node:http";
import path from "node:path";
import { fileURLToPath } from "node:url";

import express, { type NextFunction, type Request, type Response } from "express";
import { WebSocket, WebSocketServer } from "ws";

import type { DiagramResponse, LayoutTemplate, SysmlVizSession, ViewMutationPreview } from "./session.js";
import { NoActiveProjectError, type SessionManager } from "./manager.js";
import { CAPABILITY_INVENTORY } from "./capabilities.js";
import { searchModel } from "./search.js";
import type { LayoutAlignment, LayoutDistribution } from "./layout.js";
import type {
  ApiFailure,
  ApiSuccess,
  EdgeAttachment,
  EdgeRoute,
  NodeLayout,
  ViewMutationContext,
  ViewMutationClient,
  ViewState,
  ProjectConfiguration,
} from "./types.js";

function success<T>(data: T): ApiSuccess<T> {
  return { ok: true, data };
}

function bodyRecord(request: Request): Record<string, unknown> {
  if (typeof request.body !== "object" || request.body === null || Array.isArray(request.body)) {
    return {};
  }
  return request.body as Record<string, unknown>;
}

function requiredString(value: unknown, label: string): string {
  if (typeof value !== "string" || !value.trim()) {
    throw new Error(`${label} must be a non-empty string`);
  }
  return value;
}

function requiredNumber(value: unknown, label: string): number {
  if (typeof value !== "number" || !Number.isFinite(value)) {
    throw new Error(`${label} must be a finite number`);
  }
  return value;
}

function optionalNumber(value: unknown, label: string, fallback: number): number {
  return value === undefined ? fallback : requiredNumber(value, label);
}

function requiredStrings(value: unknown, label: string): string[] {
  if (!Array.isArray(value) || !value.every((item) => typeof item === "string" && item.trim())) {
    throw new Error(`${label} must be an array of non-empty strings`);
  }
  return value;
}

function projectConfiguration(value: Record<string, unknown>): ProjectConfiguration {
  const optionalStrings = (candidate: unknown, label: string): string[] => {
    if (candidate === undefined) return [];
    return requiredStrings(candidate, label);
  };
  return {
    root: requiredString(value.root, "Project root"),
    libraryRoots: optionalStrings(value.libraryRoots, "Library roots"),
    include: optionalStrings(value.include, "Include patterns"),
    exclude: optionalStrings(value.exclude, "Exclude patterns"),
  };
}

function queryString(value: unknown): string | undefined {
  return typeof value === "string" && value ? value : undefined;
}

function edgeAttachment(value: unknown, label: string): EdgeAttachment {
  if (typeof value !== "object" || value === null || Array.isArray(value)) {
    throw new Error(`${label} must be an object`);
  }
  const record = value as Record<string, unknown>;
  const sides = new Set(["top", "right", "bottom", "left"]);
  if (typeof record.side !== "string" || !sides.has(record.side)) {
    throw new Error(`${label}.side must be one of: top, right, bottom, left`);
  }
  const offset = requiredNumber(record.offset, `${label}.offset`);
  if (offset < 0 || offset > 1) {
    throw new Error(`${label}.offset must be between 0 and 1`);
  }
  return { side: record.side as EdgeAttachment["side"], offset };
}

function mutationContext(value: Record<string, unknown>): ViewMutationContext {
  const actor = value.actor;
  if (actor !== undefined && (typeof actor !== "string" || !actor.trim() || actor.trim().length > 120)) {
    throw new Error("actor must contain between 1 and 120 characters");
  }
  const client = value.client;
  const clients = new Set<ViewMutationClient>(["cli", "web", "api", "system"]);
  if (client !== undefined && (typeof client !== "string" || !clients.has(client as ViewMutationClient))) {
    throw new Error("client must be one of: cli, web, api, system");
  }
  const optionalIdentity = (candidate: unknown, label: string): string | undefined => {
    if (candidate === undefined) return undefined;
    if (typeof candidate !== "string" || !candidate.trim() || candidate.trim().length > 160) {
      throw new Error(`${label} must contain between 1 and 160 characters`);
    }
    return candidate.trim();
  };
  const clientId = optionalIdentity(value.clientId, "clientId");
  const mutationId = optionalIdentity(value.mutationId, "mutationId");
  return {
    ...(typeof actor === "string" ? { actor: actor.trim() } : {}),
    ...(typeof client === "string" ? { client: client as ViewMutationClient } : {}),
    ...(clientId ? { clientId } : {}),
    ...(mutationId ? { mutationId } : {}),
  };
}

function inferredViewOperation(patch: Partial<ViewState>): string {
  const keys = Object.keys(patch).filter((key) => key !== "updatedAt" && key !== "id");
  if (keys.length !== 1) return "view.update";
  const operations: Readonly<Record<string, string>> = {
    aliases: "view.alias",
    annotations: "view.annotate",
    camera: "view.camera",
    edgeRoutes: "edge.route",
    expanded: "view.expand",
    hidden: "view.filter",
    positions: "layout.update",
    rootId: "view.root",
    showEdgeLabels: "view.style",
    showPorts: "view.style",
    showTypes: "view.style",
    constraints: "layout.constraint",
    presentationNodes: "view.presentation",
    presentationEdges: "view.presentation",
  };
  return operations[keys[0] ?? ""] ?? "view.update";
}

function dryRun(value: Record<string, unknown>): boolean {
  // A preview validates the same provenance envelope as a commit, while never
  // persisting a record.
  mutationContext(value);
  if (value.dryRun !== undefined && typeof value.dryRun !== "boolean") {
    throw new Error("dryRun must be a boolean");
  }
  return value.dryRun === true;
}

export function isLoopbackOrigin(origin: string): boolean {
  try {
    const hostname = new URL(origin).hostname;
    return hostname === "127.0.0.1" || hostname === "localhost" || hostname === "[::1]";
  } catch {
    return false;
  }
}

function asyncRoute(
  handler: (request: Request, response: Response) => Promise<unknown>,
): (request: Request, response: Response, next: NextFunction) => void {
  return (request, response, next) => {
    handler(request, response).catch(next);
  };
}

function viewPatch(value: Record<string, unknown>): Partial<ViewState> {
  const patch: Partial<ViewState> = {};
  if (typeof value.name === "string") patch.name = value.name;
  if (typeof value.rootId === "string" || value.rootId === null) patch.rootId = value.rootId;
  if (value.showPorts !== undefined) {
    if (typeof value.showPorts !== "boolean") throw new Error("showPorts must be a boolean");
    patch.showPorts = value.showPorts;
  }
  if (value.showEdgeLabels !== undefined) {
    if (typeof value.showEdgeLabels !== "boolean") throw new Error("showEdgeLabels must be a boolean");
    patch.showEdgeLabels = value.showEdgeLabels;
  }
  if (value.showTypes !== undefined) {
    if (typeof value.showTypes !== "boolean") throw new Error("showTypes must be a boolean");
    patch.showTypes = value.showTypes;
  }
  if (Array.isArray(value.hidden)) patch.hidden = value.hidden.filter((item): item is string => typeof item === "string");
  if (Array.isArray(value.expanded)) {
    patch.expanded = value.expanded.filter((item): item is string => typeof item === "string");
  }
  if (typeof value.aliases === "object" && value.aliases !== null) {
    patch.aliases = Object.fromEntries(
      Object.entries(value.aliases).filter((entry): entry is [string, string] => typeof entry[1] === "string"),
    );
  }
  if (typeof value.positions === "object" && value.positions !== null) {
    const positions: Record<string, NodeLayout> = {};
    for (const [id, candidate] of Object.entries(value.positions)) {
      if (typeof candidate !== "object" || candidate === null || Array.isArray(candidate)) {
        throw new Error(`positions.${id} must be an object`);
      }
      const record = candidate as Record<string, unknown>;
      const x = requiredNumber(record.x, `positions.${id}.x`);
      const y = requiredNumber(record.y, `positions.${id}.y`);
      const width = record.width === undefined
        ? undefined
        : requiredNumber(record.width, `positions.${id}.width`);
      const height = record.height === undefined
        ? undefined
        : requiredNumber(record.height, `positions.${id}.height`);
      if (width !== undefined && width <= 0) {
        throw new Error(`positions.${id}.width must be positive`);
      }
      if (height !== undefined && height <= 0) {
        throw new Error(`positions.${id}.height must be positive`);
      }
      positions[id] = {
        x,
        y,
        pinned: record.pinned === true,
        ...(width === undefined ? {} : { width }),
        ...(height === undefined ? {} : { height }),
      };
    }
    patch.positions = positions;
  }
  if (typeof value.edgeRoutes === "object" && value.edgeRoutes !== null && !Array.isArray(value.edgeRoutes)) {
    const routes: Record<string, EdgeRoute> = {};
    for (const [id, candidate] of Object.entries(value.edgeRoutes)) {
      if (typeof candidate !== "object" || candidate === null || Array.isArray(candidate)) {
        throw new Error(`edgeRoutes.${id} must be an object`);
      }
      const record = candidate as Record<string, unknown>;
      if (typeof record.pinned !== "boolean") {
        throw new Error(`edgeRoutes.${id}.pinned must be a boolean`);
      }
      if (!Array.isArray(record.points)) {
        throw new Error(`edgeRoutes.${id}.points must be an array`);
      }
      routes[id] = {
        pinned: record.pinned,
        points: record.points.map((point, index) => {
          if (typeof point !== "object" || point === null || Array.isArray(point)) {
            throw new Error(`edgeRoutes.${id}.points.${index} must be an object`);
          }
          const coordinates = point as Record<string, unknown>;
          return {
            x: requiredNumber(coordinates.x, `edgeRoutes.${id}.points.${index}.x`),
            y: requiredNumber(coordinates.y, `edgeRoutes.${id}.points.${index}.y`),
          };
        }),
        ...(record.sourceAttachment === undefined
          ? {}
          : { sourceAttachment: edgeAttachment(record.sourceAttachment, `edgeRoutes.${id}.sourceAttachment`) }),
        ...(record.targetAttachment === undefined
          ? {}
          : { targetAttachment: edgeAttachment(record.targetAttachment, `edgeRoutes.${id}.targetAttachment`) }),
      };
    }
    patch.edgeRoutes = routes;
  }
  if (typeof value.camera === "object" && value.camera !== null) {
    const camera = value.camera as Record<string, unknown>;
    const x = requiredNumber(camera.x, "camera.x");
    const y = requiredNumber(camera.y, "camera.y");
    const zoom = requiredNumber(camera.zoom, "camera.zoom");
    if (zoom <= 0) {
      throw new Error("camera.zoom must be positive");
    }
    patch.camera = { x, y, zoom };
  }
  if (Array.isArray(value.annotations)) {
    patch.annotations = value.annotations.map((candidate, index) => {
      if (typeof candidate !== "object" || candidate === null || Array.isArray(candidate)) {
        throw new Error(`annotations.${index} must be an object`);
      }
      const record = candidate as Record<string, unknown>;
      const position = record.position;
      if (
        typeof record.id !== "string" ||
        typeof record.text !== "string" ||
        typeof position !== "object" ||
        position === null
      ) {
        throw new Error(`annotations.${index} requires string id/text and a position`);
      }
      if (record.style !== undefined && !["info", "success", "warning", "error"].includes(String(record.style))) {
        throw new Error(`annotations.${record.id}.style is invalid`);
      }
      if (record.arrow !== undefined && (
        typeof record.arrow !== "object" ||
        record.arrow === null ||
        typeof (record.arrow as Record<string, unknown>).targetId !== "string" ||
        !["node", "port"].includes(String((record.arrow as Record<string, unknown>).targetKind))
      )) throw new Error(`annotations.${record.id}.arrow is invalid`);
      const point = position as Record<string, unknown>;
      const x = requiredNumber(point.x, `annotations.${record.id}.position.x`);
      const y = requiredNumber(point.y, `annotations.${record.id}.position.y`);
      return {
          id: record.id,
          text: record.text,
          position: { x, y },
          ...(typeof record.linkedElementId === "string"
            ? { linkedElementId: record.linkedElementId }
            : {}),
          ...(["info", "success", "warning", "error"].includes(String(record.style))
            ? { style: record.style as "info" | "success" | "warning" | "error" }
            : {}),
          ...(typeof record.arrow === "object" && record.arrow !== null &&
            typeof (record.arrow as Record<string, unknown>).targetId === "string" &&
            ["node", "port"].includes(String((record.arrow as Record<string, unknown>).targetKind))
            ? { arrow: record.arrow as { targetId: string; targetKind: "node" | "port" } }
            : {}),
      };
    });
    if (new Set(patch.annotations.map((annotation) => annotation.id)).size !== patch.annotations.length) {
      throw new Error("annotation IDs must be unique");
    }
  }
  if (Array.isArray(value.constraints)) {
    patch.constraints = value.constraints.map((candidate, index) => {
      if (typeof candidate !== "object" || candidate === null || Array.isArray(candidate)) {
        throw new Error(`constraints.${index} must be an object`);
      }
      const record = candidate as Record<string, unknown>;
      const relation = requiredString(record.relation, `constraints.${index}.relation`);
      if (!["above", "below", "left-of", "right-of"].includes(relation)) {
        throw new Error(`constraints.${index}.relation is invalid`);
      }
      return {
        id: requiredString(record.id, `constraints.${index}.id`),
        relation: relation as "above" | "below" | "left-of" | "right-of",
        subjectId: requiredString(record.subjectId, `constraints.${index}.subjectId`),
        objectId: requiredString(record.objectId, `constraints.${index}.objectId`),
        ...(record.gap === undefined ? {} : { gap: requiredNumber(record.gap, `constraints.${index}.gap`) }),
      };
    });
  }
  if (Array.isArray(value.presentationNodes)) {
    patch.presentationNodes = value.presentationNodes.map((candidate, index) => {
      if (typeof candidate !== "object" || candidate === null || Array.isArray(candidate)) {
        throw new Error(`presentationNodes.${index} must be an object`);
      }
      const record = candidate as Record<string, unknown>;
      const kind = requiredString(record.kind, `presentationNodes.${index}.kind`);
      if (!["actor", "reference"].includes(kind)) throw new Error(`presentationNodes.${index}.kind is invalid`);
      const width = record.width === undefined ? undefined : requiredNumber(record.width, `presentationNodes.${index}.width`);
      const height = record.height === undefined ? undefined : requiredNumber(record.height, `presentationNodes.${index}.height`);
      if ((width !== undefined && width <= 0) || (height !== undefined && height <= 0)) {
        throw new Error(`presentationNodes.${index} dimensions must be positive`);
      }
      return {
        id: requiredString(record.id, `presentationNodes.${index}.id`),
        label: requiredString(record.label, `presentationNodes.${index}.label`),
        kind: kind as "actor" | "reference",
        x: requiredNumber(record.x, `presentationNodes.${index}.x`),
        y: requiredNumber(record.y, `presentationNodes.${index}.y`),
        ...(width === undefined ? {} : { width }),
        ...(height === undefined ? {} : { height }),
      };
    });
    if (new Set(patch.presentationNodes.map((node) => node.id)).size !== patch.presentationNodes.length) {
      throw new Error("presentationNodes IDs must be unique");
    }
  }
  if (Array.isArray(value.presentationEdges)) {
    patch.presentationEdges = value.presentationEdges.map((candidate, index) => {
      if (typeof candidate !== "object" || candidate === null || Array.isArray(candidate)) {
        throw new Error(`presentationEdges.${index} must be an object`);
      }
      const record = candidate as Record<string, unknown>;
      const kind = requiredString(record.kind, `presentationEdges.${index}.kind`);
      if (!["reference", "informational"].includes(kind)) throw new Error(`presentationEdges.${index}.kind is invalid`);
      const bendPoints = record.bendPoints === undefined ? undefined : (() => {
        if (!Array.isArray(record.bendPoints)) throw new Error(`presentationEdges.${index}.bendPoints must be an array`);
        return record.bendPoints.map((point, pointIndex) => {
          if (typeof point !== "object" || point === null || Array.isArray(point)) {
            throw new Error(`presentationEdges.${index}.bendPoints.${pointIndex} must be an object`);
          }
          const coordinates = point as Record<string, unknown>;
          return {
            x: requiredNumber(coordinates.x, `presentationEdges.${index}.bendPoints.${pointIndex}.x`),
            y: requiredNumber(coordinates.y, `presentationEdges.${index}.bendPoints.${pointIndex}.y`),
          };
        });
      })();
      return {
        id: requiredString(record.id, `presentationEdges.${index}.id`),
        sourceId: requiredString(record.sourceId, `presentationEdges.${index}.sourceId`),
        targetId: requiredString(record.targetId, `presentationEdges.${index}.targetId`),
        kind: kind as "reference" | "informational",
        ...(typeof record.label === "string" ? { label: record.label } : {}),
        ...(bendPoints === undefined ? {} : { bendPoints }),
      };
    });
    if (new Set(patch.presentationEdges.map((edge) => edge.id)).size !== patch.presentationEdges.length) {
      throw new Error("presentationEdges IDs must be unique");
    }
  }
  return patch;
}

function sourceLocation(span: {
  file: string;
  start: { line: number; column: number };
  end: { line: number; column: number };
}): Record<string, unknown> {
  return {
    file: span.file,
    line: span.start.line,
    column: span.start.column,
    endLine: span.end.line,
    endColumn: span.end.column,
  };
}

function serializeView(view: ViewState): Record<string, unknown> {
  return {
    ...view,
    rootId: view.rootId ?? "",
    positions: Object.fromEntries(
      Object.entries(view.positions).map(([id, position]) => [
        id,
        {
          x: position.x,
          y: position.y,
          ...(position.width === undefined ? {} : { width: position.width }),
          ...(position.height === undefined ? {} : { height: position.height }),
        },
      ]),
    ),
    pinned: Object.entries(view.positions)
      .filter(([, position]) => position.pinned)
      .map(([id]) => id),
  };
}

/** @internal Exported for HTTP contract tests. */
export function serializePreview(preview: ViewMutationPreview): Record<string, unknown> {
  return {
    ...preview,
    before: preview.before === null ? null : serializeView(preview.before),
    after: serializeView(preview.after),
  };
}

/** @internal Exported for HTTP contract tests. */
export function serializeViews(document: Awaited<ReturnType<SysmlVizSession["viewDocument"]>>): Record<string, unknown> {
  return {
    schemaVersion: document.schemaVersion,
    viewRevision: document.viewRevision,
    activeViewId: document.activeViewId,
    views: document.views.map(serializeView),
    mutations: document.mutations,
  };
}

/** @internal Exported for HTTP contract tests. */
export function serializeDiagram(diagram: DiagramResponse): Record<string, unknown> {
  const nodes: Array<Record<string, unknown>> = diagram.nodes.map((node) => ({
    id: node.id,
    elementId: node.elementId,
    definitionId: node.definitionId,
    kind: node.expanded ? "container" : "component",
    label: node.label,
    typeName: node.typeName,
    category: node.category,
    canExpand: Boolean(node.canExpand),
    ...(node.parentNodeId ? { parentId: node.parentNodeId } : {}),
    position: { x: node.position.x, y: node.position.y },
    dimensions:
      node.position.width === undefined && node.position.height === undefined
        ? undefined
        : { width: node.position.width ?? 248, height: node.position.height ?? 142 },
    pinned: node.pinned,
    expanded: node.expanded,
    ports: node.ports.map((port) => ({
      id: port.id,
      elementId: port.elementId,
      name: port.name,
      direction: port.direction,
      typeName: port.typeName,
      traceIds: port.traceIds,
    })),
    contractCounts: node.contracts,
    traceIds: node.traceIds,
    source: sourceLocation(node.source),
    qualifiedName: node.instancePath.join("."),
  }));
  const represented = new Set(nodes.map((node) => String(node.id)));
  for (const port of diagram.boundaryPorts) {
    const id = `boundary:${port.id}`;
    const position = diagram.view.positions[id] ?? { x: 0, y: 0, pinned: false };
    nodes.push({
      id,
      kind: "boundary",
      label: port.label,
      typeName: port.typeName,
      category: "boundary",
      position: { x: position.x, y: position.y },
      pinned: position.pinned,
      ports: [
        {
          id: port.id,
          elementId: port.elementId,
          name: port.name,
          direction: port.direction,
          typeName: port.typeName,
          traceIds: port.traceIds,
        },
      ],
      contractCounts: { assumptions: 0, guarantees: 0, cases: 0, invariants: 0 },
      traceIds: port.traceIds,
      source: sourceLocation(port.source),
    });
    represented.add(id);
  }
  for (const node of diagram.view.presentationNodes ?? []) {
    nodes.push({
      id: node.id,
      kind: `presentation-${node.kind}`,
      label: node.label,
      category: "presentation-only",
      position: { x: node.x, y: node.y },
      dimensions: {
        width: Math.max(248, node.width ?? 248),
        height: Math.max(142, node.height ?? 142),
      },
      pinned: true,
      expanded: false,
      ports: [],
      contractCounts: { assumptions: 0, guarantees: 0, cases: 0, invariants: 0, requirements: 0 },
      qualifiedName: "Presentation only",
      presentationOnly: true,
    });
    represented.add(node.id);
  }

  const edges: Array<Record<string, unknown>> = diagram.edges.map((edge) => {
    const source = edge.sourceNodeId ??
      (edge.sourcePortId ? `boundary:${edge.sourcePortId}` : `unresolved-source:${edge.id}`);
    const target = edge.targetNodeId ??
      (edge.targetPortId ? `boundary:${edge.targetPortId}` : `unresolved-target:${edge.id}`);
    if (!represented.has(source)) {
      nodes.push({
        id: source,
        kind: "unresolved",
        label: edge.sourcePath.join("."),
        category: "unresolved",
        position: { x: 0, y: 0 },
        pinned: false,
        ports: [],
        contractCounts: { assumptions: 0, guarantees: 0, cases: 0, invariants: 0 },
        source: sourceLocation(edge.source),
      });
      represented.add(source);
    }
    if (!represented.has(target)) {
      nodes.push({
        id: target,
        kind: "unresolved",
        label: edge.targetPath.join("."),
        category: "unresolved",
        position: { x: 0, y: 0 },
        pinned: false,
        ports: [],
        contractCounts: { assumptions: 0, guarantees: 0, cases: 0, invariants: 0 },
        source: sourceLocation(edge.source),
      });
      represented.add(target);
    }
    return {
      id: edge.id,
      elementId: edge.elementId,
      source,
      ...(edge.sourceNodeId && edge.sourcePortId ? { sourcePort: edge.sourcePortId } : {}),
      target,
      ...(edge.targetNodeId && edge.targetPortId ? { targetPort: edge.targetPortId } : {}),
      label: edge.label,
      unresolved: edge.unresolved,
      traceIds: edge.traceIds,
      sourceLocation: sourceLocation(edge.source),
    };
  });
  for (const edge of diagram.view.presentationEdges ?? []) {
    const resolve = (id: string): { nodeId: string; portId?: string } => {
      const node = diagram.nodes.find((candidate) => candidate.id === id || candidate.elementId === id);
      if (node) return { nodeId: node.id };
      for (const candidate of diagram.nodes) {
        const port = candidate.ports.find((item) => item.id === id || item.elementId === id);
        if (port) return { nodeId: candidate.id, portId: port.id };
      }
      return { nodeId: id };
    };
    const source = resolve(edge.sourceId);
    const target = resolve(edge.targetId);
    if (!represented.has(source.nodeId) || !represented.has(target.nodeId)) continue;
    edges.push({
      id: edge.id,
      source: source.nodeId,
      target: target.nodeId,
      ...(source.portId ? { sourcePort: source.portId } : {}),
      ...(target.portId ? { targetPort: target.portId } : {}),
      label: edge.label ?? edge.kind,
      presentationKind: edge.kind,
      presentationOnly: true,
      ...(edge.bendPoints ? { bendPoints: edge.bendPoints } : {}),
    });
  }
  return {
    revision: diagram.revision,
    viewRevision: diagram.viewRevision,
    rootId: diagram.rootDefinitionId,
    title: diagram.title,
    nodes,
    edges,
    breadcrumbs: diagram.breadcrumbs,
    diagnostics: diagram.diagnostics.map((diagnostic) => ({
      severity: diagnostic.severity,
      message: diagnostic.message,
      code: diagnostic.code,
      suggestion: diagnostic.hint,
      ...(diagnostic.span ? { source: sourceLocation(diagnostic.span) } : {}),
    })),
    validation: diagram.validation,
    stale: diagram.stale,
  };
}

/** @internal Exported for contract tests; HTTP callers should use PATCH /api/views/:id. */
export async function requestViewPatch(
  session: SysmlVizSession,
  viewId: string,
  value: Record<string, unknown>,
): Promise<Partial<ViewState>> {
  const current = await session.view(viewId).catch(() => undefined);
  const patch = viewPatch(value);
  if (patch.hidden) {
    patch.hidden = await Promise.all(patch.hidden.map(async (id) => await session.resolveViewTarget(viewId, id)));
  }
  if (patch.expanded) {
    patch.expanded = [...new Set(
      await Promise.all(patch.expanded.map(async (id) => await session.resolveViewTarget(viewId, id))),
    )];
  }
  if (patch.aliases) {
    patch.aliases = Object.fromEntries(await Promise.all(
      Object.entries(patch.aliases).map(async ([id, label]) => [
        await session.resolveViewTarget(viewId, id),
        label,
      ] as const),
    ));
  }
  if (patch.annotations) {
    patch.annotations = await Promise.all(patch.annotations.map(async (annotation) => ({
      ...annotation,
      ...(annotation.linkedElementId
        ? { linkedElementId: await session.resolveViewTarget(viewId, annotation.linkedElementId) }
        : {}),
      ...(annotation.arrow
        ? { arrow: { ...annotation.arrow, targetId: await session.resolveViewTarget(viewId, annotation.arrow.targetId) } }
        : {}),
    })));
  }
  if (patch.presentationEdges) {
    const presentationIds = new Set([
      ...(current?.presentationNodes ?? []).map((node) => node.id),
      ...(patch.presentationNodes ?? []).map((node) => node.id),
    ]);
    const resolveEndpoint = async (id: string): Promise<string> =>
      presentationIds.has(id) ? id : await session.resolveViewTarget(viewId, id);
    patch.presentationEdges = await Promise.all(patch.presentationEdges.map(async (edge) => ({
      ...edge,
      sourceId: await resolveEndpoint(edge.sourceId),
      targetId: await resolveEndpoint(edge.targetId),
    })));
  }
  if (patch.positions) {
    const pinnedIds = Array.isArray(value.pinned)
      ? new Set(value.pinned.filter((item): item is string => typeof item === "string"))
      : null;
    patch.positions = Object.fromEntries(
      Object.entries(patch.positions).map(([id, position]) => [
        id,
        {
          ...position,
          pinned: pinnedIds
            ? pinnedIds.has(id)
            : (current?.positions[id]?.pinned ?? position.pinned),
        },
      ]),
    );
  }
  return patch;
}

export function createApi(session: SysmlVizSession, manager?: SessionManager): express.Express {
  const app = express();
  app.disable("x-powered-by");
  app.use(express.json({ limit: "2mb" }));
  app.use((request, response, next) => {
    const origin = request.header("origin");
    if (origin && !isLoopbackOrigin(origin)) {
      response.status(403).json({
        ok: false,
        error: {
          code: "UNTRUSTED_ORIGIN",
          message: `The local SysML Viz service rejected Origin '${origin}'`,
          suggestion: "Use the localhost UI or a terminal client that does not forge a browser Origin header.",
        },
      });
      return;
    }
    if (origin) {
      response.header("access-control-allow-origin", origin);
      response.header("access-control-allow-headers", "content-type");
      response.header("access-control-allow-methods", "GET,POST,PATCH,OPTIONS");
    }
    if (request.method === "OPTIONS") {
      response.sendStatus(204);
      return;
    }
    next();
  });

  app.get(
    "/api/session",
    asyncRoute(async (_request, response) =>
      response.json(success(manager ? await manager.sessionState() : await session.snapshot()))),
  );
  app.get("/api/capabilities", (_request, response) => response.json(success(CAPABILITY_INVENTORY)));
  if (manager) {
    app.get(
      "/api/workspace/directories",
      asyncRoute(async (request, response) =>
        response.json(success(await manager.listDirectory(queryString(request.query.path))))),
    );
    app.post(
      "/api/session/preview",
      asyncRoute(async (request, response) => {
        response.json(success(await manager.preview(projectConfiguration(bodyRecord(request)))));
      }),
    );
    app.post(
      "/api/session/switch",
      asyncRoute(async (request, response) => {
        response.json(success(await manager.switchProject(projectConfiguration(bodyRecord(request)))));
      }),
    );
  }
  app.get("/api/model", (_request, response) => response.json(success(session.modelSummary())));
  app.get(
    "/api/traceability/system-abstract",
    asyncRoute(async (_request, response) => response.json(success(await session.systemAbstract()))),
  );
  app.get(
    "/api/diagram",
    asyncRoute(async (request, response) => {
      response.json(
        success(
          serializeDiagram(
            await session.diagram(queryString(request.query.view), queryString(request.query.root)),
          ),
        ),
      );
    }),
  );
  app.get(
    "/api/diagram/health",
    asyncRoute(async (request, response) => {
      response.json(
        success(
          await session.health(
            queryString(request.query.view),
            queryString(request.query.root),
          ),
        ),
      );
    }),
  );
  app.get(
    "/api/elements/:id",
    asyncRoute(async (request, response) => {
      response.json(success(await session.inspect(requiredString(request.params.id, "Element ID"))));
    }),
  );
  app.get("/api/requirements", (request, response) => {
    response.json(success(session.requirements(queryString(request.query.query) ?? "")));
  });
  app.get("/api/search", (request, response) => {
    const query = queryString(request.query.query) ?? "";
    const requestedLimit = Number(queryString(request.query.limit) ?? "75");
    const limit = Number.isFinite(requestedLimit) ? requestedLimit : 75;
    response.json(success(searchModel(session.model, query, limit)));
  });

  app.get(
    "/api/views",
    asyncRoute(async (_request, response) =>
      response.json(success(serializeViews(await session.viewDocument()))),
    ),
  );
  app.get(
    "/api/views/:id",
    asyncRoute(async (request, response) =>
      response.json(success(serializeView(await session.view(requiredString(request.params.id, "View ID"))))),
    ),
  );
  const updateView = asyncRoute(async (request, response) => {
    const id = requiredString(request.params.id, "View ID");
    const body = bodyRecord(request);
    const existed = await session.view(id).then(
      () => true,
      () => false,
    );
    const patch = await requestViewPatch(session, id, body);
    const operation = existed ? inferredViewOperation(patch) : "view.create";
    const explicitTargetIds = Array.isArray(body.targetIds)
      ? body.targetIds.filter((item): item is string => typeof item === "string")
      : [];
    const targetIds = explicitTargetIds.length > 0
      ? explicitTargetIds
      : patch.positions
      ? Object.keys(patch.positions)
      : patch.expanded
        ? patch.expanded
        : patch.hidden
          ? patch.hidden
      : patch.presentationNodes
        ? patch.presentationNodes.map((node) => node.id)
        : patch.presentationEdges
          ? patch.presentationEdges.map((edge) => edge.id)
          : patch.annotations
            ? patch.annotations.map((annotation) => annotation.id)
            : patch.constraints
              ? patch.constraints.map((constraint) => constraint.id)
              : [];
    if (dryRun(body)) {
      response.json(
        success(
          serializePreview(await session.previewViewUpdate(id, patch, operation, targetIds)),
        ),
      );
      return;
    }
    await session.updateView(
      id,
      patch,
      mutationContext(body),
      operation,
      targetIds,
    );
    response.json(success(serializeView(await session.view(id))));
  });
  app.post(
    "/api/views",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const name = requiredString(body.name, "View name");
      const requestedId = typeof body.id === "string" ? body.id.trim() : "";
      const baseId =
        requestedId ||
        name
          .toLowerCase()
          .replace(/[^a-z0-9]+/g, "-")
          .replace(/^-|-$/g, "") ||
        "view";
      const existing = await session.viewDocument();
      let id = baseId;
      for (let suffix = 2; existing.views.some((view) => view.id === id); suffix += 1) {
        id = `${baseId}-${suffix}`;
      }
      const patch = await requestViewPatch(session, id, body);
      if (dryRun(body)) {
        response.json(
          success(serializePreview(await session.previewViewUpdate(id, patch, "view.create", [id]))),
        );
        return;
      }
      await session.updateView(
        id,
        patch,
        mutationContext(body),
        "view.create",
        [id],
      );
      await session.setActiveView(id, mutationContext(body));
      response.status(201).json(success(serializeView(await session.view(id))));
    }),
  );
  app.post("/api/views/:id", updateView);
  app.patch("/api/views/:id", updateView);
  app.post(
    "/api/views/:id/activate",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const viewId = requiredString(request.params.id, "View ID");
      if (dryRun(body)) {
        await session.view(viewId);
        const document = await session.viewDocument();
        response.json(
          success({
            dryRun: true,
            operation: "view.activate",
            baseViewRevision: document.viewRevision,
            viewId,
            resolvedIds: [viewId],
            before: { activeViewId: document.activeViewId },
            after: { activeViewId: viewId },
          }),
        );
        return;
      }
      response.json(
        success(
          await session.setActiveView(
            viewId,
            mutationContext(body),
          ),
        ),
      );
    }),
  );
  app.post(
    "/api/views/:id/layout/move",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const relativeTo = typeof body.relativeTo === "string" && body.relativeTo.trim()
        ? body.relativeTo
        : undefined;
      if (relativeTo !== undefined && (body.x !== undefined || body.y !== undefined)) {
        throw new Error("A layout move accepts either absolute x/y or relativeTo with dx/dy, not both");
      }
      const viewId = requiredString(request.params.id, "View ID");
      const elementId = requiredString(body.id, "Element ID");
      const pinned = body.pinned !== false;
      if (dryRun(body)) {
        const preview = relativeTo === undefined
          ? await session.previewMove(
              viewId,
              elementId,
              { x: requiredNumber(body.x, "x"), y: requiredNumber(body.y, "y") },
              pinned,
            )
          : await session.previewMove(
              viewId,
              elementId,
              {
                relativeTo,
                dx: optionalNumber(body.dx, "dx", 0),
                dy: optionalNumber(body.dy, "dy", 0),
              },
              pinned,
            );
        response.json(success(serializePreview(preview)));
        return;
      }
      response.json(
        success(
          relativeTo === undefined
            ? await session.move(
                viewId,
                elementId,
                requiredNumber(body.x, "x"),
                requiredNumber(body.y, "y"),
                pinned,
                mutationContext(body),
              )
            : await session.moveRelative(
                viewId,
                elementId,
                relativeTo,
                optionalNumber(body.dx, "dx", 0),
                optionalNumber(body.dy, "dy", 0),
                pinned,
                mutationContext(body),
              ),
        ),
      );
    }),
  );
  app.post(
    "/api/views/:id/layout/resize",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const viewId = requiredString(request.params.id, "View ID");
      const elementId = requiredString(body.id, "Element ID");
      const fit = body.fit === true;
      const hasWidth = body.width !== undefined;
      const hasHeight = body.height !== undefined;
      const hasX = body.x !== undefined;
      const hasY = body.y !== undefined;
      if (fit && (hasWidth || hasHeight || hasX || hasY)) {
        throw new Error("A layout resize accepts either fit: true or width and height, not both.");
      }
      if (!fit && (!hasWidth || !hasHeight)) {
        throw new Error("A layout resize requires both width and height, or fit: true.");
      }
      if (hasX !== hasY) {
        throw new Error("A layout resize requires x and y together.");
      }
      const input = fit
        ? { fit: true as const }
        : {
            width: requiredNumber(body.width, "width"),
            height: requiredNumber(body.height, "height"),
            ...(hasX ? { x: requiredNumber(body.x, "x"), y: requiredNumber(body.y, "y") } : {}),
          };
      if (dryRun(body)) {
        response.json(success(serializePreview(await session.previewResize(viewId, elementId, input))));
        return;
      }
      response.json(success(await session.resize(viewId, elementId, input, mutationContext(body))));
    }),
  );
  app.post(
    "/api/views/:id/layout/pin",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const viewId = requiredString(request.params.id, "View ID");
      const elementId = requiredString(body.id, "Element ID");
      const pinned = body.pinned !== false;
      if (dryRun(body)) {
        response.json(success(serializePreview(await session.previewPin(viewId, elementId, pinned))));
        return;
      }
      response.json(
        success(
          await session.pin(
            viewId,
            elementId,
            pinned,
            mutationContext(body),
          ),
        ),
      );
    }),
  );
  app.post(
    "/api/views/:id/layout/apply",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const viewId = requiredString(request.params.id, "View ID");
      response.json(
        success(
          dryRun(body)
            ? serializePreview(await session.previewApplyLayout(viewId))
            : await session.applyLayout(viewId, mutationContext(body)),
        ),
      );
    }),
  );
  app.post(
    "/api/views/:id/layout/align",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const viewId = requiredString(request.params.id, "View ID");
      const ids = requiredStrings(body.ids, "ids");
      const alignment = requiredString(body.alignment, "alignment") as LayoutAlignment;
      const pinned = body.pinned !== false;
      if (dryRun(body)) {
        response.json(
          success(serializePreview(await session.previewAlign(viewId, ids, alignment, pinned))),
        );
        return;
      }
      response.json(
        success(
          await session.align(
            viewId,
            ids,
            alignment,
            pinned,
            mutationContext(body),
          ),
        ),
      );
    }),
  );
  app.post(
    "/api/views/:id/layout/distribute",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const viewId = requiredString(request.params.id, "View ID");
      const ids = requiredStrings(body.ids, "ids");
      const axis = requiredString(body.axis, "axis") as LayoutDistribution;
      const pinned = body.pinned !== false;
      if (dryRun(body)) {
        response.json(
          success(serializePreview(await session.previewDistribute(viewId, ids, axis, pinned))),
        );
        return;
      }
      response.json(
        success(
          await session.distribute(
            viewId,
            ids,
            axis,
            pinned,
            mutationContext(body),
          ),
        ),
      );
    }),
  );
  app.post(
    "/api/views/:id/layout/reset",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const viewId = requiredString(request.params.id, "View ID");
      response.json(
        success(
          dryRun(body)
            ? serializePreview(await session.previewResetViewLayout(viewId))
            : await session.resetViewLayout(viewId, mutationContext(body)),
        ),
      );
    }),
  );
  app.post(
    "/api/views/:id/layout/constraint",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      const relation = requiredString(body.relation, "relation");
      if (!["above", "below", "left-of", "right-of"].includes(relation)) {
        throw new Error("relation must be above, below, left-of, or right-of");
      }
      const viewId = requiredString(request.params.id, "View ID");
      const subjectId = requiredString(body.subjectId, "subjectId");
      const objectId = requiredString(body.objectId, "objectId");
      const typedRelation = relation as "above" | "below" | "left-of" | "right-of";
      const gap = optionalNumber(body.gap, "gap", 40);
      response.json(success(
        dryRun(body)
          ? serializePreview(await session.previewConstraint(viewId, subjectId, typedRelation, objectId, gap))
          : await session.addConstraint(viewId, subjectId, typedRelation, objectId, gap, mutationContext(body)),
      ));
    }),
  );
  app.get(
    "/api/views/:id/layout/template",
    asyncRoute(async (request, response) =>
      response.json(success(await session.exportLayoutTemplate(requiredString(request.params.id, "View ID")))),
    ),
  );
  app.post(
    "/api/views/:id/layout/template",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      if (typeof body.template !== "object" || body.template === null || Array.isArray(body.template)) {
        throw new Error("template must be an object");
      }
      const mapping = typeof body.mapping === "object" && body.mapping !== null && !Array.isArray(body.mapping)
        ? Object.fromEntries(Object.entries(body.mapping).filter((entry): entry is [string, string] => typeof entry[1] === "string"))
        : {};
      response.json(success(await session.applyLayoutTemplate(
        requiredString(request.params.id, "View ID"),
        body.template as unknown as LayoutTemplate,
        mapping,
        mutationContext(body),
      )));
    }),
  );

  app.post(
    "/api/validate",
    (_request, response) => {
      void session.validate();
      response.status(202).json(success(session.validation));
    },
  );
  app.get(
    "/api/checkpoints",
    asyncRoute(async (_request, response) => response.json(success(await session.checkpoints()))),
  );
  app.post(
    "/api/checkpoints",
    asyncRoute(async (request, response) => {
      const body = bodyRecord(request);
      response.status(201).json(
        success(
          await session.checkpoint({
            name: requiredString(body.name, "Checkpoint name"),
            ...(typeof body.message === "string" ? { message: body.message } : {}),
            ...(typeof body.author === "string" ? { author: body.author } : {}),
          }),
        ),
      );
    }),
  );
  app.get(
    "/api/render",
    asyncRoute(async (request, response) => {
      const requested = queryString(request.query.format) ?? "svg";
      if (requested !== "svg" && requested !== "png") {
        throw new Error("Render format must be 'svg' or 'png'");
      }
      const bytes = await session.render(
        requested,
        queryString(request.query.view),
        queryString(request.query.root),
      );
      response
        .type(requested === "svg" ? "image/svg+xml" : "image/png")
        .setHeader("content-disposition", `inline; filename=diagram.${requested}`)
        .send(bytes);
    }),
  );
  const exportRoute = asyncRoute(async (request, response) => {
    const requested = queryString(request.query.format) ?? "svg";
    if (requested !== "svg" && requested !== "png") {
      throw new Error("Export format must be 'svg' or 'png'");
    }
    const bytes = await session.render(
      requested,
      queryString(request.query.view),
      queryString(request.query.root),
    );
    response
      .type(requested === "svg" ? "image/svg+xml" : "image/png")
      .setHeader("content-disposition", `attachment; filename=sysml-diagram.${requested}`)
      .send(bytes);
  });
  app.get("/api/export", exportRoute);
  app.post("/api/export", exportRoute);

  app.use("/api", (request, response: Response<ApiFailure>) => {
    response.status(404).json({
      ok: false,
      error: {
        code: "API_ENDPOINT_NOT_FOUND",
        message: `No SysML Viz API endpoint matches ${request.method} ${request.originalUrl}`,
        suggestion: "Inspect docs/agent-api.md for the supported method and endpoint combinations.",
      },
    });
  });

  const webDirectory = fileURLToPath(new URL("../../web/dist/", import.meta.url));
  app.use(express.static(webDirectory, { index: false, maxAge: "1h" }));
  app.get(
    /^(?!\/api\/).*/,
    asyncRoute(async (_request, response) => {
      const indexPath = path.join(webDirectory, "index.html");
      try {
        await access(indexPath);
        response.type("html").send(await readFile(indexPath, "utf8"));
      } catch {
        response
          .status(503)
          .type("text")
          .send("SysML Viz UI has not been built. Run 'npm run build' or use the Vite development server.");
      }
    }),
  );

  app.use((error: unknown, _request: Request, response: Response<ApiFailure>, _next: NextFunction) => {
    if (error instanceof NoActiveProjectError) {
      response.status(409).json({
        ok: false,
        error: {
          code: error.code,
          message: error.message,
          suggestion: "Open a project with POST /api/session/switch or use the project picker.",
        },
      });
      return;
    }
    const message = error instanceof Error ? error.message : String(error);
    const structured =
      typeof error === "object" && error !== null
        ? (error as { code?: unknown; candidates?: unknown })
        : undefined;
    const structuredCode = typeof structured?.code === "string" ? structured.code : undefined;
    const candidates = Array.isArray(structured?.candidates)
      ? structured.candidates.filter((item): item is string => typeof item === "string")
      : [];
    const lowered = message.toLowerCase();
    const status = structuredCode?.includes("AMBIGUOUS")
      ? 409
      : structuredCode?.includes("NOT_FOUND") || lowered.includes("unknown") || lowered.includes("no model element")
        ? 404
        : 400;
    response.status(status).json({
      ok: false,
      error: {
        code: structuredCode ?? (status === 404 ? "NOT_FOUND" : "INVALID_REQUEST"),
        message,
        ...(candidates.length ? { details: { candidates } } : {}),
        suggestion:
          status === 409
            ? "Retry with one of the qualified semantic IDs in error.details.candidates."
            : status === 404
            ? "Inspect the session/model and use a returned stable identity."
            : "Check the command arguments or request body, then inspect /api/session for current state.",
      },
    });
  });
  return app;
}

export function attachWebSocket(server: Server, session: SysmlVizSession): WebSocketServer {
  const sockets = new WebSocketServer({ noServer: true });
  server.on("upgrade", (request, socket, head) => {
    const pathname = new URL(request.url ?? "/", "http://127.0.0.1").pathname;
    if (pathname !== "/api/events") {
      socket.destroy();
      return;
    }
    const origin = request.headers.origin;
    if (origin && !isLoopbackOrigin(origin)) {
      socket.write("HTTP/1.1 403 Forbidden\r\nConnection: close\r\n\r\n");
      socket.destroy();
      return;
    }
    sockets.handleUpgrade(request, socket, head, (webSocket) => {
      sockets.emit("connection", webSocket, request);
    });
  });
  const listener = (event: unknown): void => {
    const serialized = JSON.stringify(event);
    for (const client of sockets.clients) {
      if (client.readyState === WebSocket.OPEN) {
        client.send(serialized);
      }
    }
  };
  session.events.on("event", listener);
  sockets.on("close", () => session.events.off("event", listener));
  sockets.on("connection", (socket) => {
    let revision = 0;
    let viewRevision = 0;
    try {
      revision = session.revision;
      viewRevision = session.viewRevision;
    } catch (error) {
      if (!(error instanceof NoActiveProjectError)) throw error;
    }
    socket.send(
      JSON.stringify({
        type: "connection.ready",
        at: new Date().toISOString(),
        revision,
        viewRevision,
      }),
    );
  });
  return sockets;
}
