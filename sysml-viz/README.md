# SysML Viz

SysML Viz is a local, agent-friendly architecture viewer for the AADL-oriented
SysML v2 and GUMBO workflow used in this repository. A long-running server can
open and switch projects in the browser, while never searching parent or
sibling directories for model or library copies.

Its first acceptance target is the INSPECTA Isolette model and FAA Figure A-1.

## Five-minute start

```bash
cd sysml-viz
npm install
npm run build

npm run sysml-viz -- serve \
  --workspace-root .. \
  --library ../external/sysml-aadl-libraries \
  --validation-debounce-ms 1500 \
  --sireum sireum
```

Open <http://127.0.0.1:4782>. Select **FAA Figure A-1** from the Views panel for
the curated context view, or use **Architecture** for the ordinary semantic
root. Dragging a component pins it. A later source update lays out new elements
without moving pinned ones. **Tidy layout** minimizes overlaps and crossings,
shortens connectors, and retains pinned elements. Unpinned connections choose
the nearest facing node sides automatically. Select a connection to expose its
source and target dots, then drag either dot around the node perimeter to choose
exactly where the edge attaches. Double-click a dot to restore automatic
attachment.

Select a system card to choose between **Expand here**, which preserves the
surrounding architecture and reveals child systems inside a faded container,
and **Open**, which makes that system the current canvas. Expanded containers
can be nested and collapsed from either the card header or inspector; the
choice is saved in the active named view. Double-clicking a card remains the
shortcut for **Open**.

When the project root is a run's `model/` directory and a sibling
`system-abstract.md` exists, the System Abstract opens beside the diagram.
Hover previews a component's adjacent `@trace` links without moving the reader;
an ordinary click opens the bottom Details drawer and navigates the abstract
without resetting the diagram camera. Closing the abstract leaves a restore tab
on the right edge. The join uses stable IDs and server-provided line/offset
ranges, not component-name matching. See
[System Abstract traceability](docs/traceability.md).

Use **View Tools** in the header for the browser equivalent of agent workflows:
session/model/validation/health inspection, checkpoint and mutation history,
view roots and aliases, individual restore, overlays, exact/relative moves,
constraints, layout-template transfer, and reproducible exports. Invalid form
input remains in place alongside an actionable server error for correction.

To start at the project picker and keep one server running across projects:

```bash
npm run sysml-viz -- serve --workspace-root ..
```

The workspace root is a canonical security boundary. Browsing, typed project
paths, and library paths must resolve beneath it, including through symlinks.
An invalid switch leaves the current parser, watcher, validation state, and
project-specific `.sysmlviz` view store untouched.

In a second terminal, an agent can inspect and control the same session:

```bash
cd sysml-viz
npm run sysml-viz -- session inspect --json
npm run sysml-viz -- model summarize --json
npm run sysml-viz -- model search --query "monitor mode" --limit 20 --json
npm run sysml-viz -- requirement find --query REQ_MMI_1 --json
npm run sysml-viz -- view list --json
npm run sysml-viz -- diagram health --view faa-a1 --json
npm run sysml-viz -- checkpoint create \
  --name "monitor contracts added" --author codex --json
npm run sysml-viz -- render export \
  --view faa-a1 --format svg --out build/isolette-faa-a1.svg --json
```

Every non-serve command accepts `--server URL`. `--json` emits a stable
response envelope suitable for agents. The export command above also writes
`build/isolette-faa-a1.svg.json`, containing the artifact SHA-256, requested
view/root, session revision and validation state, bounded roots, and diagram
health. Use `--metadata PATH` to choose another sidecar or `--no-metadata` to
suppress it.

## Live agent workflow

1. Start a bounded server and open a project from the browser or `--root`.
2. Ask the agent to make a small, syntactically coherent source change and
   save it.
3. The focused local parser updates the canvas; Sireum does not block redraws.
4. Create a named checkpoint after a meaningful increment. Checkpoints request
   a serialized background Sireum validation.
5. Query diagram health, requirements, or elements through the CLI.
6. Export a deterministic artifact for review or regression testing.

If an edit is not renderable, the last renderable graph stays on screen and is
marked stale with source-located diagnostics.

## Development

```bash
# Repository-local Isolette convenience command:
npm run dev

# Or run the processes with another root:
npm run build --workspace @sysml-viz/core
npm run dev --workspace @sysml-viz/server -- \
  --root /absolute/path/to/model --library /absolute/path/to/library
npm run dev --workspace @sysml-viz/web
```

The Vite UI uses <http://127.0.0.1:5173> and proxies API/WebSocket traffic to
the local service on port 4782. A production build is served directly by the
local service at port 4782.

Source discovery remains explicit. `--root` is optional; without it,
model-dependent APIs return `NO_ACTIVE_PROJECT` until a project is opened.
Repeatable `--library` roots provide read-only semantic context. For a root containing
unrelated model trees, repeatable `--include GLOB` and `--exclude GLOB`
arguments bound both parsing and file watching to the same project-file set.
Patterns use `/`-normalized relative paths: basename-only patterns match at
any depth, `*` and `?` stay within one path segment, and `**` crosses directory
boundaries. Includes apply to project files only so an explicitly selected
library remains complete; excludes apply to both project and library roots.
The browser picker can preview exact loaded project/library counts and stores
recent configurations in browser-local storage. “Loaded” means part of the
semantic model; the diagram still displays only its selected semantic root and
view filters. An omitted validation debounce
disables validation-on-save; `0` queues it immediately after a successful live
reload.

## Checks

```bash
npm run typecheck
npm test
npm run build
node packages/cli/dist/index.js --help
```

See [architecture](docs/architecture.md), [agent API](docs/agent-api.md),
[view-state schema](docs/view-state.md), and
[known limitations](docs/known-limitations.md). The trace join contract is in
[System Abstract traceability](docs/traceability.md).
