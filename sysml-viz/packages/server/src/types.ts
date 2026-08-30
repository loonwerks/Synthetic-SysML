import type { DiagramHealth } from "@sysml-viz/core";

export interface Point {
  x: number;
  y: number;
}

export interface CameraState extends Point {
  zoom: number;
}

export interface NodeLayout extends Point {
  pinned: boolean;
  width?: number;
  height?: number;
}

export interface EdgeRoute {
  pinned: boolean;
  points: Point[];
  sourceAttachment?: EdgeAttachment;
  targetAttachment?: EdgeAttachment;
}

export type EdgeAttachmentSide = "top" | "right" | "bottom" | "left";

export interface EdgeAttachment {
  side: EdgeAttachmentSide;
  /** Normalized position along the selected side, clamped to [0, 1]. */
  offset: number;
}

export interface ViewPresetMarker {
  id: string;
  version: number;
}

export type AnnotationStyle = "info" | "success" | "warning" | "error";
export type AnnotationArrowTarget = "node" | "port";
export type LayoutRelation = "above" | "below" | "left-of" | "right-of";

export interface LayoutConstraint {
  id: string;
  relation: LayoutRelation;
  subjectId: string;
  objectId: string;
  gap?: number;
}

export interface PresentationNode extends Point {
  id: string;
  label: string;
  kind: "actor" | "reference";
  width?: number;
  height?: number;
}

export interface PresentationEdge {
  id: string;
  sourceId: string;
  targetId: string;
  label?: string;
  kind: "reference" | "informational";
  bendPoints?: Point[];
}

export type ViewMutationClient = "cli" | "web" | "api" | "system";

export interface ViewMutationRecord {
  id: string;
  at: string;
  actor: string;
  client: ViewMutationClient;
  operation: string;
  viewId: string;
  modelRevision: number;
  viewRevision: number;
  targetIds: string[];
  changedFields: string[];
}

export interface ViewMutationInput {
  actor: string;
  client: ViewMutationClient;
  operation: string;
  modelRevision: number;
  targetIds?: string[];
  changedFields?: string[];
}

export interface ViewMutationContext {
  actor?: string;
  client?: ViewMutationClient;
  /** Stable browser/process identity used to suppress its own WebSocket echo. */
  clientId?: string;
  /** Identity of one optimistic mutation/acknowledgement pair. */
  mutationId?: string;
}

export interface ViewState {
  id: string;
  name: string;
  preset?: ViewPresetMarker;
  rootId: string | null;
  positions: Record<string, NodeLayout>;
  edgeRoutes: Record<string, EdgeRoute>;
  hidden: string[];
  expanded: string[];
  aliases: Record<string, string>;
  annotations: Array<{
    id: string;
    text: string;
    position: Point;
    linkedElementId?: string;
    style?: AnnotationStyle;
    arrow?: {
      targetId: string;
      targetKind: AnnotationArrowTarget;
    };
  }>;
  constraints?: LayoutConstraint[];
  presentationNodes?: PresentationNode[];
  presentationEdges?: PresentationEdge[];
  showPorts?: boolean;
  showEdgeLabels?: boolean;
  showTypes?: boolean;
  camera: CameraState;
  updatedAt: string;
}

export interface ViewDocument {
  /** Schema 1 is accepted as migration input; persisted documents are upgraded to 2. */
  schemaVersion: 1 | 2;
  viewRevision: number;
  activeViewId: string;
  views: ViewState[];
  mutations: ViewMutationRecord[];
}

export interface Checkpoint {
  id: string;
  name: string;
  message?: string;
  author?: string;
  createdAt: string;
  modelRevision: number;
  viewRevision: number;
  viewId: string;
  parseStatus: "valid" | "stale";
  validationStatus: ValidationStatus;
}

export type ValidationStatus =
  | "not-run"
  | "pending"
  | "valid"
  | "invalid"
  | "stale"
  | "tool-error";

export interface ValidationState {
  status: ValidationStatus;
  startedAt?: string;
  completedAt?: string;
  durationMs?: number;
  command?: string[];
  exitCode?: number | null;
  stdout?: string;
  stderr?: string;
  revision?: number;
  message?: string;
  diagnostics?: SireumDiagnostic[];
}

export type DiagramFidelityState = "validated" | "local" | "partial" | "stale" | "invalid";

/** Plain-language interpretation layered additively over raw geometry health. */
export interface DiagramFidelityAssessment {
  state: DiagramFidelityState;
  label: string;
  summary: string;
  scope: "aadl-oriented-subset";
}

/** Health API response. Existing DiagramHealth fields remain unchanged. */
export interface DiagramHealthResponse extends DiagramHealth {
  fidelity: DiagramFidelityAssessment;
}

export interface SireumDiagnostic {
  severity: "info" | "warning" | "error";
  message: string;
  source?: {
    file: string;
    line: number;
    column: number;
    endLine: number;
    endColumn: number;
  };
}

export interface SessionOptions {
  root?: string;
  workspaceRoot?: string;
  libraryRoots?: string[];
  include?: string[];
  exclude?: string[];
  host?: string;
  port?: number;
  sireum?: string;
  validateOnStart?: boolean;
  validationDebounceMs?: number;
}

export interface ProjectConfiguration {
  root: string;
  libraryRoots?: string[];
  include?: string[];
  exclude?: string[];
}

export interface ApiSuccess<T> {
  ok: true;
  data: T;
}

export interface ApiFailure {
  ok: false;
  error: {
    code: string;
    message: string;
    suggestion?: string;
    details?: unknown;
  };
}
