export type SourceOrigin = "project" | "library";

/** One-based line/column positions and zero-based UTF-16 offsets. */
export interface SourcePosition {
  readonly offset: number;
  readonly line: number;
  readonly column: number;
}

export interface SourceSpan {
  readonly file: string;
  readonly start: SourcePosition;
  readonly end: SourcePosition;
}

export type DiagnosticSeverity = "info" | "warning" | "error";

export interface RelatedDiagnostic {
  readonly message: string;
  readonly span?: SourceSpan;
}

export interface Diagnostic {
  readonly code: string;
  readonly severity: DiagnosticSeverity;
  readonly message: string;
  readonly fatal: boolean;
  readonly span?: SourceSpan;
  readonly hint?: string;
  readonly related?: readonly RelatedDiagnostic[];
}

export interface DiscoveredSysmlFile {
  readonly path: string;
  readonly realPath: string;
  readonly relativePath: string;
  readonly root: string;
  readonly origin: SourceOrigin;
  readonly libraryName?: string;
}

export interface DiscoveryOptions {
  /** Mandatory model boundary. Parent and sibling directories are never scanned. */
  readonly root: string;
  /** Explicit, read-only semantic context. Library files are never root candidates. */
  readonly libraryRoots?: readonly string[];
  /** Relative paths, directory names, or simple * / ** glob patterns. */
  readonly exclude?: readonly string[];
  /** Optional project-file allowlist. Library roots remain complete semantic context. */
  readonly include?: readonly string[];
  readonly includeHidden?: boolean;
}

export interface SourceInput {
  readonly path: string;
  readonly content: string;
  readonly relativePath?: string;
  readonly root?: string;
  readonly origin?: SourceOrigin;
  readonly libraryName?: string;
}

export interface SourceFileRecord {
  readonly id: string;
  readonly path: string;
  readonly relativePath: string;
  readonly root: string;
  readonly origin: SourceOrigin;
  readonly libraryName?: string;
  readonly packageIds: readonly string[];
  readonly contentHash: string;
}

export interface ImportModel {
  readonly kind: "import";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly packageId: string;
  readonly visibility: "private" | "public" | "unspecified";
  readonly target: string;
  readonly wildcard: boolean;
  readonly span: SourceSpan;
}

export interface PackageModel {
  readonly kind: "package";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly parentPackageId?: string;
  readonly sourceFileId: string;
  readonly origin: SourceOrigin;
  readonly importIds: readonly string[];
  readonly definitionIds: readonly string[];
  readonly gumboBlockIds: readonly string[];
  readonly span: SourceSpan;
}

export type ComponentCategory =
  | "system"
  | "process"
  | "thread"
  | "device"
  | "processor"
  | "data"
  | "abstract"
  | "memory"
  | "bus"
  | "virtual-processor"
  | "subprogram"
  | "unknown";

export interface ComponentDefinition {
  readonly kind: "part-definition";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly packageId: string;
  readonly sourceFileId: string;
  readonly origin: SourceOrigin;
  readonly baseType?: string;
  readonly baseDefinitionId?: string;
  readonly category: ComponentCategory;
  readonly partIds: readonly string[];
  readonly portIds: readonly string[];
  readonly connectionIds: readonly string[];
  readonly allocationIds: readonly string[];
  readonly gumboBlockIds: readonly string[];
  /** Stable System Abstract identifiers from adjacent `@trace` comments. */
  readonly traceIds: readonly string[];
  readonly span: SourceSpan;
}

export interface PartUsage {
  readonly kind: "part-usage";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly ownerDefinitionId: string;
  readonly typeName: string;
  readonly resolvedDefinitionId?: string;
  readonly category: ComponentCategory;
  /** Stable System Abstract identifiers from adjacent `@trace` comments. */
  readonly traceIds: readonly string[];
  readonly span: SourceSpan;
}

export type PortDirection = "in" | "out" | "inout" | "unknown";

export interface PortModel {
  readonly kind: "port";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly ownerDefinitionId: string;
  readonly portKind: string;
  readonly direction: PortDirection;
  readonly typeName?: string;
  readonly traceIds: readonly string[];
  readonly span: SourceSpan;
}

export interface ConnectionEndpoint {
  readonly raw: string;
  readonly path: readonly string[];
  readonly resolvedElementId?: string;
  readonly resolvedPortId?: string;
  readonly resolution: "resolved" | "unresolved" | "ambiguous";
}

export interface ConnectionModel {
  readonly kind: "connection";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly ownerDefinitionId: string;
  readonly connectionType: string;
  readonly source: ConnectionEndpoint;
  readonly target: ConnectionEndpoint;
  readonly traceIds: readonly string[];
  readonly span: SourceSpan;
}

export interface AllocationModel {
  readonly kind: "allocation";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly ownerDefinitionId: string;
  readonly allocationType: string;
  readonly source: ConnectionEndpoint;
  readonly target: ConnectionEndpoint;
  readonly traceIds: readonly string[];
  readonly span: SourceSpan;
}

export type GumboPhase =
  | "library"
  | "invariants"
  | "state"
  | "functions"
  | "integration"
  | "initialize"
  | "compute"
  | "compute-cases"
  | "composition"
  | "unknown";

export type GumboContractKind =
  | "invariant"
  | "state"
  | "function"
  | "assume"
  | "guarantee"
  | "case";

export interface GumboClause {
  readonly kind: "assume" | "guarantee";
  readonly name?: string;
  readonly description?: string;
  readonly expression: string;
  readonly raw: string;
  readonly referencedPortIds: readonly string[];
  /** Stable System Abstract identifiers from the adjacent `@trace` comment. */
  readonly traceIds: readonly string[];
  readonly span: SourceSpan;
}

export interface GumboContract {
  readonly kind: "gumbo-contract";
  readonly contractKind: GumboContractKind;
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly ownerId: string;
  readonly blockId: string;
  readonly phase: GumboPhase;
  readonly description?: string;
  readonly expression: string;
  readonly raw: string;
  readonly urls: readonly string[];
  readonly referencedPortIds: readonly string[];
  /**
   * Stable System Abstract identifiers attached to this declaration. For a
   * compute case this is the ordered union of case- and clause-level tags.
   */
  readonly traceIds: readonly string[];
  readonly clauses: readonly GumboClause[];
  readonly span: SourceSpan;
}

export interface GumboBlock {
  readonly kind: "gumbo-block";
  readonly id: string;
  readonly name: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly ownerId: string;
  readonly contractIds: readonly string[];
  readonly raw: string;
  readonly body: string;
  readonly span: SourceSpan;
  readonly bodySpan: SourceSpan;
}

export interface RequirementRecord {
  readonly kind: "requirement";
  readonly id: string;
  readonly requirementId: string;
  readonly qualifiedName: string;
  readonly fingerprint: string;
  readonly ownerId: string;
  readonly contractId: string;
  readonly contractKind: GumboContractKind;
  readonly phase: GumboPhase;
  readonly description?: string;
  readonly expression: string;
  readonly urls: readonly string[];
  readonly referencedPortIds: readonly string[];
  readonly traceIds: readonly string[];
  readonly span: SourceSpan;
}

export type NormalizedElement =
  | PackageModel
  | ImportModel
  | ComponentDefinition
  | PartUsage
  | PortModel
  | ConnectionModel
  | AllocationModel
  | GumboBlock
  | GumboContract
  | RequirementRecord;

export interface NormalizedModel {
  readonly version: 1;
  readonly projectRoot: string;
  readonly libraryRoots: readonly string[];
  readonly files: readonly SourceFileRecord[];
  readonly packages: readonly PackageModel[];
  readonly imports: readonly ImportModel[];
  readonly definitions: readonly ComponentDefinition[];
  readonly parts: readonly PartUsage[];
  readonly ports: readonly PortModel[];
  readonly connections: readonly ConnectionModel[];
  readonly allocations: readonly AllocationModel[];
  readonly gumboBlocks: readonly GumboBlock[];
  readonly contracts: readonly GumboContract[];
  readonly requirements: readonly RequirementRecord[];
  /** Definition IDs from project files only, ordered for deterministic launch UI. */
  readonly rootCandidates: readonly string[];
  readonly elements: Readonly<Record<string, NormalizedElement>>;
  readonly generatedAt: string;
}

export interface ParseProjectOptions extends DiscoveryOptions {}

export interface ParseProjectSourcesOptions {
  readonly sources: readonly SourceInput[];
  readonly root?: string;
  readonly libraryRoots?: readonly string[];
}

export interface ParseProjectResult {
  readonly model: NormalizedModel;
  readonly diagnostics: readonly Diagnostic[];
  /** False only for errors which make the current source unsafe to render. */
  readonly renderable: boolean;
}

export interface ContractCounts {
  readonly invariants: number;
  readonly assumptions: number;
  readonly guarantees: number;
  readonly cases: number;
  readonly requirements: number;
}

export interface DiagramPort {
  readonly id: string;
  readonly elementId: string;
  readonly ownerNodeId: string | null;
  readonly name: string;
  readonly label: string;
  readonly direction: PortDirection;
  readonly typeName?: string;
  readonly boundary: boolean;
  readonly traceIds: readonly string[];
  readonly source: SourceSpan;
}

export interface DiagramNode {
  readonly id: string;
  readonly elementId: string;
  readonly instancePath: readonly string[];
  readonly parentNodeId: string | null;
  readonly name: string;
  readonly label: string;
  readonly typeName: string;
  readonly definitionId?: string;
  readonly category: ComponentCategory;
  readonly depth: number;
  /** Whether this usage's resolved definition owns child part usages. */
  readonly canExpand?: boolean;
  readonly expanded: boolean;
  readonly ports: readonly DiagramPort[];
  readonly contracts: ContractCounts;
  /** Union of usage- and resolved-definition-level trace identifiers. */
  readonly traceIds: readonly string[];
  readonly source: SourceSpan;
}

export interface DiagramEdge {
  readonly id: string;
  readonly elementId: string;
  readonly name: string;
  readonly label: string;
  readonly sourceNodeId: string | null;
  readonly sourcePortId: string | null;
  readonly targetNodeId: string | null;
  readonly targetPortId: string | null;
  readonly sourcePath: readonly string[];
  readonly targetPath: readonly string[];
  readonly unresolved: boolean;
  readonly depth: number;
  readonly traceIds: readonly string[];
  readonly source: SourceSpan;
}

export interface DiagramModel {
  readonly version: 1;
  readonly id: string;
  readonly rootDefinitionId: string;
  readonly rootQualifiedName: string;
  readonly title: string;
  readonly nodes: readonly DiagramNode[];
  readonly boundaryPorts: readonly DiagramPort[];
  readonly edges: readonly DiagramEdge[];
  readonly hiddenElementIds: readonly string[];
  readonly diagnostics: readonly Diagnostic[];
}

export interface DeriveDiagramView {
  readonly hiddenElementIds?: readonly string[];
  readonly aliases?: Readonly<Record<string, string>>;
}

export interface DeriveDiagramOptions {
  /** Definition ID or qualified name. */
  readonly rootId: string;
  /** Part-usage IDs or derived diagram node IDs to reveal in place. */
  readonly expanded?: readonly string[];
  readonly maxDepth?: number;
  readonly view?: DeriveDiagramView;
}

export interface DiagramGeometry {
  readonly x: number;
  readonly y: number;
  readonly width: number;
  readonly height: number;
}

export interface DiagramPoint {
  readonly x: number;
  readonly y: number;
}

export interface DiagramLayout {
  readonly nodes?: Readonly<Record<string, DiagramGeometry>>;
  readonly edges?: Readonly<Record<string, readonly DiagramPoint[]>>;
}

export type DiagramAnnotationStyle = "info" | "success" | "warning" | "error";

export interface DiagramAnnotation {
  readonly id: string;
  readonly text: string;
  readonly position: DiagramPoint;
  readonly style?: DiagramAnnotationStyle;
  readonly arrow?: {
    readonly targetId: string;
    readonly targetKind: "node" | "port";
  };
}

export interface DiagramPresentationNode {
  readonly id: string;
  readonly label: string;
  readonly kind: "actor" | "reference";
  readonly x: number;
  readonly y: number;
  readonly width?: number;
  readonly height?: number;
}

export interface DiagramPresentationEdge {
  readonly id: string;
  readonly sourceId: string;
  readonly targetId: string;
  readonly label?: string;
  readonly kind: "reference" | "informational";
  readonly bendPoints?: readonly DiagramPoint[];
}

export interface DiagramPresentation {
  readonly annotations?: readonly DiagramAnnotation[];
  readonly nodes?: readonly DiagramPresentationNode[];
  readonly edges?: readonly DiagramPresentationEdge[];
}

export interface DiagramOverlap {
  readonly firstNodeId: string;
  readonly secondNodeId: string;
  readonly area: number;
  /** False when the contact is expected rendering geometry and needs no repair. */
  readonly actionable?: boolean;
}

export interface DiagramCrossing {
  readonly firstEdgeId: string;
  readonly secondEdgeId: string;
  readonly at: DiagramPoint;
}

export type DiagramCollisionKind = "label-label" | "label-edge" | "label-node";

export interface DiagramCollision {
  readonly kind: DiagramCollisionKind;
  readonly firstId: string;
  readonly secondId: string;
  readonly at: DiagramPoint;
  readonly area?: number;
  readonly labelBounds?: DiagramGeometry;
  readonly routeSegment?: {
    readonly start: DiagramPoint;
    readonly end: DiagramPoint;
  };
  readonly intersection?: DiagramPoint;
  readonly distance?: number;
  /** False when the contact is expected rendering geometry and needs no repair. */
  readonly actionable?: boolean;
}

export interface DiagramRouteObjectCollision {
  readonly routeId: string;
  readonly objectId: string;
  readonly at: DiagramPoint;
  readonly actionable: boolean;
}

export type DiagramHealthSeverity = "attention" | "blocked";
export type DiagramHealthStatus = "clear" | DiagramHealthSeverity;

/** Stable, user-facing summary of one class of diagram-health problem. */
export interface DiagramHealthFinding {
  readonly code:
    | "unresolved-endpoint"
    | "object-overlap"
    | "dangling-presentation-link"
    | "route-object-collision"
    | "out-of-bounds"
    | "truncated-text"
    | "label-collision"
    | "edge-crossing";
  readonly severity: DiagramHealthSeverity;
  readonly message: string;
  readonly count: number;
  readonly elementIds: readonly string[];
  readonly repairable: boolean;
}

export interface DiagramTextIssue {
  readonly id: string;
  readonly text: string;
  readonly availableWidth: number;
  readonly estimatedWidth: number;
}

export interface DiagramBoundsIssue {
  readonly id: string;
  readonly bounds: DiagramGeometry;
}

export interface DiagramHealth {
  readonly nodeCount: number;
  readonly edgeCount: number;
  readonly unresolvedEndpointCount: number;
  readonly overlapCount: number;
  readonly crossingCount: number;
  readonly hiddenElementCount: number;
  readonly unresolvedEdgeIds: readonly string[];
  readonly overlaps: readonly DiagramOverlap[];
  readonly crossings: readonly DiagramCrossing[];
  readonly labelCollisionCount: number;
  readonly truncatedTextCount: number;
  readonly outOfBoundsCount: number;
  readonly labelCollisions: readonly DiagramCollision[];
  readonly truncatedTexts: readonly DiagramTextIssue[];
  readonly outOfBounds: readonly DiagramBoundsIssue[];
  /** Additive plain-language assessment; legacy counters above remain authoritative. */
  readonly status: DiagramHealthStatus;
  readonly findings: readonly DiagramHealthFinding[];
  readonly danglingPresentationLinkCount: number;
  readonly danglingPresentationLinkIds: readonly string[];
  readonly routeObjectCollisionCount: number;
  readonly routeObjectCollisions: readonly DiagramRouteObjectCollision[];
}

export interface RootCandidateSummary {
  readonly id: string;
  readonly qualifiedName: string;
  readonly category: ComponentCategory;
  readonly partCount: number;
  readonly portCount: number;
  readonly contractCount: number;
  readonly source: SourceSpan;
}

export interface ModelSummary {
  readonly projectRoot: string;
  readonly projectFileCount: number;
  readonly libraryFileCount: number;
  readonly packageCount: number;
  readonly definitionCount: number;
  readonly partCount: number;
  readonly portCount: number;
  readonly connectionCount: number;
  readonly allocationCount: number;
  readonly contractCount: number;
  readonly requirementCount: number;
  readonly rootCandidates: readonly RootCandidateSummary[];
}

export interface ElementInspection {
  readonly element: NormalizedElement;
  readonly owner?: NormalizedElement;
  readonly children: readonly NormalizedElement[];
  readonly related: readonly NormalizedElement[];
}

export interface SvgTheme {
  readonly background: string;
  readonly nodeFill: string;
  readonly nodeStroke: string;
  readonly text: string;
  readonly mutedText: string;
  readonly edge: string;
  readonly inputPort: string;
  readonly outputPort: string;
  readonly unresolved: string;
}

export interface RenderSvgOptions {
  readonly layout?: DiagramLayout;
  readonly presentation?: DiagramPresentation;
  readonly width?: number;
  readonly height?: number;
  readonly padding?: number;
  readonly transparent?: boolean;
  readonly showPorts?: boolean;
  readonly showEdgeLabels?: boolean;
  readonly showTypes?: boolean;
  readonly theme?: Partial<SvgTheme>;
}
