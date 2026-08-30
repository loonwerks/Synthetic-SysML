# Agent API

The browser and CLI use the same localhost service. JSON response envelopes
have the form:

```json
{
  "ok": true,
  "data": {}
}
```

Errors include a stable code, human explanation, and, when available, source
locations, ambiguity candidates, and a recovery suggestion. An agent should
always inspect the session first so it confirms the exact root and files before
mutating visual state.

## CLI commands

| Command | Purpose |
| --- | --- |
| `serve [--workspace-root PATH] [--root PATH] [--library PATH] [--include GLOB] [--exclude GLOB] [--validation-debounce-ms N]` | Start a bounded server, optionally with an active project. |
| `session inspect` | Return roots, exact files, revision, and validation state. |
| `model summarize` | Return counts, root candidates, definitions, and requirements. |
| `model validate` | Queue an asynchronous Sireum validation. |
| `model search --query TEXT [--limit N]` | Search semantic names, ports, source files, endpoints, and raw GUMBO text. |
| `element inspect --id ID` | Inspect source, ports, connections, and GUMBO. |
| `requirement find --query TEXT` | Search requirement IDs, prose, expressions, and owners. |
| `view list` / `view show --id ID` | Inspect durable named views. |
| `view activate --id ID` | Make a view active for checkpoints and default rendering. |
| `view create --id ID --name NAME` | Create a view over a semantic root. |
| `view filter --id ID --hide ELEMENT` | Hide/show elements through repeatable semantic IDs. |
| `view expand --id ID --element ELEMENT [--collapse]` | Expand or collapse one hierarchy level using either a semantic usage ID or a currently rendered node ID. |
| `view alias --id ID --element ELEMENT --label TEXT` | Set a presentation-only label. |
| `view annotate --id VIEW --annotation-id ID --text TEXT --x N --y N [...]` | Add a styled annotation with a stable explicit ID and optional node/port arrow. |
| `view annotation update\|remove --view VIEW --annotation-id ID [...]` | Update or remove one annotation by stable ID. |
| `view presentation node add\|update\|remove --view VIEW --presentation-id ID [...]` | Manage compact non-semantic actors or dashed reference cards. |
| `view presentation edge add\|update\|remove --view VIEW --presentation-id ID [...]` | Manage labeled informational/reference routes; repeat `--bend X,Y` for optional bends. |
| `view style --id ID [--ports show\|hide] [--edge-labels show\|hide] [--types show\|hide]` | Change presentation density without changing semantics. |
| `layout move --view ID --id ELEMENT (--x N --y N \| --relative-to ELEMENT [--dx N --dy N])` | Move and normally pin a visible node. The relative form computes one absolute position from current coordinates; it does not persist a relational constraint. |
| `layout pin --view ID --id ELEMENT [--off]` | Change the hard pin invariant. |
| `layout apply --view ID` | Re-layout eligible nodes while retaining pins. |
| `layout align --view ID --id ELEMENT ... --alignment MODE` | Align at least two nodes by an edge or center line. |
| `layout distribute --view ID --id ELEMENT ... --axis horizontal\|vertical` | Distribute at least three nodes with equal gaps. |
| `layout reset --view ID` | Clear pins/routes and recompute a fresh layout while preserving view semantics and styling. |
| `layout constrain ...` / `layout constraint list\|remove ...` | Add, inspect, or remove stable-ID relational constraints. |
| `layout template export\|apply ...` | Transfer layout with explicit `SOURCE=TARGET` mappings and fail closed on ambiguous automatic matches. |
| `diagram health [--view ID] [--root-element ID]` | Report unresolved edges, overlaps, and estimated crossings. |
| `checkpoint create --name NAME` | Record a milestone and request validation. |
| `render export --format svg\|png --out PATH [--view ID] [--root-element ID] [--metadata PATH \| --no-metadata]` | Produce a deterministic artifact and, by default, an agent-readable metadata sidecar. |

Use `--server http://host:port` and `--json` on non-serve commands. When
`--server` is absent, `SYSML_VIZ_SERVER` supplies the session endpoint. Visual
mutation commands accept `--actor NAME` (default `cli`) and `--dry-run`.
A dry-run performs the same identity resolution and validation, but writes no
view state, advances no revision, emits no event, and records no provenance.
It returns the base revision, resolved IDs, and serialized before/after views:

```json
{
  "ok": true,
  "data": {
    "dryRun": true,
    "operation": "layout.move-relative",
    "baseViewRevision": 12,
    "viewId": "faa-a1",
    "resolvedIds": ["node:thermostat", "node:operator-interface"],
    "before": {},
    "after": {}
  }
}
```

Dry-run is intentionally scoped to presentation mutations. Validation,
checkpoint creation, and render export have distinct side effects and do not
accept it.

## HTTP and WebSocket

| Method and path | Result |
| --- | --- |
| `GET /api/session` | Current bounded-session state, including `active` and the workspace boundary. |
| `GET /api/workspace/directories?path=` | List child directories within the canonical workspace boundary. |
| `POST /api/session/preview` | Validate a project configuration and return exact project/library file counts. |
| `POST /api/session/switch` | Parse and atomically activate a project configuration; failures retain the active session. |
| `GET /api/capabilities` | Stable workflow IDs, agent entry points, manual surfaces, test selectors, and transport-only exceptions. |
| `GET /api/model` | Model summary, roots, definitions, and requirements. |
| `GET /api/traceability/system-abstract` | Workspace-confined Markdown plus stable-ID line/offset ranges, or `null`. |
| `GET /api/diagram?root=&view=` | Derived visible graph with persistent positions. |
| `GET /api/elements/:id` | Source-aware semantic inspection. |
| `GET /api/requirements?query=` | GUMBO requirement search. |
| `GET /api/search?query=&limit=` | Search names, ports, files, endpoints, and GUMBO text. |
| `GET /api/views` | Named view document. |
| `GET /api/views/:id` | One view. |
| `POST /api/views` | Create a view. |
| `PATCH /api/views/:id` | Update layout, filters, expansion, aliases, camera, or edge routes/attachments. |
| `POST /api/views/:id/activate` | Select a view. |
| `POST /api/views/:id/layout/move` | Move a node. |
| `POST /api/views/:id/layout/resize` | Resize an expanded container exactly or fit its contents without moving descendants. |
| `POST /api/views/:id/layout/pin` | Pin or unpin a node. |
| `POST /api/views/:id/layout/apply` | Apply deterministic server layout. |
| `POST /api/views/:id/layout/align` | Align a resolved node selection. |
| `POST /api/views/:id/layout/distribute` | Evenly distribute a resolved node selection. |
| `POST /api/views/:id/layout/reset` | Reset positions, pins, and routes only. |
| `GET /api/diagram/health?view=&root=` | Machine-readable health metrics. |
| `POST /api/validate` | Queue validation and return HTTP 202 with pending state. |
| `GET/POST /api/checkpoints` | List or create milestones. |
| `GET /api/render?format=svg\|png&view=&root=` | Render bytes. |
| `GET\|POST /api/export?format=svg\|png&view=&root=` | Download-compatible render alias. |
| `WS /api/events` | Model, view, checkpoint, and validation events. |

Visual request bodies may include `actor`, `client` (`cli`, `web`, `api`, or
`system`), and `dryRun`. These are provenance labels, not authentication.
Committed mutations append an atomic metadata record to the bounded ledger
returned by `GET /api/views`; the record carries model/view revisions,
operation, target IDs, and changed fields.

## Identity

Layout mutations accept exact contextual node IDs, semantic element IDs, or an
unambiguous visible name. Ambiguous names fail with candidates. Agents should
retain IDs returned by the current session rather than manufacturing them.
Container resize accepts either `{ "id", "width", "height" }` with an optional
paired `x`/`y`, or `{ "id", "fit": true }`. A dry run returns canonical
`resolvedIds` and complete before/after view geometry without changing the
view revision.

Requirement records carry both their owning definition and matching usage IDs.
Diagram ports carry contextual and semantic IDs, allowing contracts to
highlight the visible instances they reference.
Diagram nodes, ports, and edges also carry `traceIds` parsed from adjacent
`@trace` comments. These join directly to the exact System Abstract ranges.

## Export metadata

`render export` writes an SVG plus `<out>.json` by default. PNG has no sidecar
unless `--metadata PATH` is supplied; `--no-metadata` suppresses an SVG
sidecar. Every export response reports the artifact SHA-256 even without a
sidecar. Paths reported by `--json` are absolute:

```json
{
  "ok": true,
  "data": {
    "output": "build/isolette-faa-a1.svg",
    "metadata": "build/isolette-faa-a1.svg.json",
    "format": "svg",
    "bytes": 28431,
    "sha256": "..."
  }
}
```

The versioned sidecar records the artifact path, format, byte count and
SHA-256; the requested view/root; bounded project and library roots; model
revision and parse/validation state; and diagram-health metrics. It contains
no generation timestamp, and its nested keys are serialized deterministically
for clean diffs and repeatable agent checks.
