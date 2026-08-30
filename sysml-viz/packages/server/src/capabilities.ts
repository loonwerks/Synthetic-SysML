export interface WorkflowCapability {
  readonly id: string;
  readonly category: "project" | "inspect" | "view" | "overlay" | "arrange" | "quality" | "artifact" | "live";
  readonly label: string;
  readonly agentEntryPoint: string;
  readonly manualSurface: string;
  readonly testSelector: string;
}

const capability = (
  id: string,
  category: WorkflowCapability["category"],
  label: string,
  agentEntryPoint: string,
  manualSurface: string,
): WorkflowCapability => ({
  id, category, label, agentEntryPoint, manualSurface,
  testSelector: `[data-capability="${id}"]`,
});

/** Auditable inventory of outcome-producing workflows and their structured UI peers. */
export const WORKFLOW_CAPABILITIES: readonly WorkflowCapability[] = [
  capability("project.select", "project", "Select project", "POST /api/session/switch", "Project picker"),
  capability("session.inspect", "inspect", "Inspect session", "GET /api/session", "Tools / Overview"),
  capability("model.inspect", "inspect", "Inspect model summary", "GET /api/model", "Tools / Overview"),
  capability("model.search", "inspect", "Search model", "GET /api/search", "Sidebar search"),
  capability("element.inspect", "inspect", "Inspect element", "GET /api/elements/:id", "Inspector"),
  capability("requirement.inspect", "inspect", "Inspect requirements", "GET /api/requirements", "Sidebar requirements"),
  capability("traceability.inspect", "inspect", "Inspect System Abstract traceability", "GET /api/traceability/system-abstract", "Trace panel"),
  capability("validation.run", "quality", "Run validation", "POST /api/validate", "Tools / Overview"),
  capability("validation.inspect", "quality", "Inspect validation output", "GET /api/session", "Tools / Overview"),
  capability("health.inspect", "quality", "Inspect diagram health", "GET /api/diagram/health", "Tools / Overview"),
  capability("checkpoint.create", "quality", "Create checkpoint", "POST /api/checkpoints", "Checkpoint dialog"),
  capability("checkpoint.list", "quality", "Inspect checkpoint history", "GET /api/checkpoints", "Tools / Overview"),
  capability("view.create", "view", "Create view", "POST /api/views", "Sidebar views"),
  capability("view.activate", "view", "Switch view", "POST /api/views/:id/activate", "Sidebar views"),
  capability("view.rename", "view", "Rename view", "PATCH /api/views/:id", "Tools / View"),
  capability("view.root", "view", "Select view root", "PATCH /api/views/:id", "Tools / View"),
  capability("view.alias", "view", "Edit aliases", "PATCH /api/views/:id", "Tools / View"),
  capability("view.hide", "view", "Hide element", "PATCH /api/views/:id", "Inspector"),
  capability("view.unhide", "view", "Restore one hidden element", "PATCH /api/views/:id", "Tools / View"),
  capability("view.expand", "view", "Expand or collapse element", "PATCH /api/views/:id", "Tools / View"),
  capability("view.camera", "view", "Edit camera", "PATCH /api/views/:id", "Tools / View"),
  capability("view.style", "view", "Edit diagram style", "PATCH /api/views/:id", "Tools / View"),
  capability("annotation.crud", "overlay", "Edit annotations", "PATCH /api/views/:id", "Tools / Overlays"),
  capability("presentation.node.crud", "overlay", "Edit non-semantic cards", "PATCH /api/views/:id", "Tools / Overlays"),
  capability("presentation.edge.crud", "overlay", "Edit presentation edges", "PATCH /api/views/:id", "Tools / Overlays"),
  capability("layout.move", "arrange", "Move element exactly or relatively", "POST /api/views/:id/layout/move", "Tools / Arrange"),
  capability("layout.resize", "arrange", "Resize an expanded system container", "POST /api/views/:id/layout/resize", "Tools / Arrange"),
  capability("layout.pin", "arrange", "Pin or unpin element", "POST /api/views/:id/layout/pin", "Tools / Arrange"),
  capability("layout.apply", "arrange", "Apply automatic layout", "POST /api/views/:id/layout/apply", "Canvas arrange controls"),
  capability("layout.align", "arrange", "Align elements", "POST /api/views/:id/layout/align", "Canvas arrange controls"),
  capability("layout.distribute", "arrange", "Distribute elements", "POST /api/views/:id/layout/distribute", "Canvas arrange controls"),
  capability("layout.reset", "arrange", "Reset layout", "POST /api/views/:id/layout/reset", "Canvas arrange controls"),
  capability("constraint.crud", "arrange", "Edit layout constraints", "POST /api/views/:id/layout/constraint", "Tools / Arrange"),
  capability("template.download", "arrange", "Download layout template", "GET /api/views/:id/layout/template", "Tools / Arrange"),
  capability("template.upload", "arrange", "Apply layout template", "POST /api/views/:id/layout/template", "Tools / Arrange"),
  capability("render.svg", "artifact", "Render SVG", "GET /api/render?format=svg", "Tools / Export"),
  capability("render.png", "artifact", "Render PNG", "GET /api/render?format=png", "Tools / Export"),
  capability("session.reproduce", "artifact", "Inspect reproducibility state", "GET /api/session + /api/diagram/health", "Tools / Export"),
  capability("live.refresh", "live", "Refresh after source or view changes", "GET /api/events", "Header refresh and live status"),
] as const;

export const CAPABILITY_INVENTORY = {
  schemaVersion: 1 as const,
  capabilities: WORKFLOW_CAPABILITIES,
  transportOnlyExceptions: [
    { id: "transport.json-formatting", reason: "Formatting changes transport representation, not a workflow outcome." },
    { id: "transport.server-url", reason: "Alternate URLs select transport routing; the browser is already connected to its serving session." },
    { id: "transport.provenance-labels", reason: "Actor/client labels record provenance and do not change the resulting view." },
    { id: "transport.dry-run", reason: "Dry-run is a transport safeguard; browser forms preserve input and surface validation errors." },
  ],
};
