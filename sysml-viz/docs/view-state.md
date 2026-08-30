# View-state schema

Shared presentation state is stored as versioned JSON at
`<project-root>/.sysmlviz/views.json`. The directory also contains a
`.gitignore` that excludes `local/` and temporary atomic-write files.

```json
{
  "schemaVersion": 2,
  "viewRevision": 4,
  "activeViewId": "architecture",
  "views": [
    {
      "id": "architecture",
      "name": "Architecture",
      "rootId": "def:Package::System",
      "positions": {
        "node:def:Package::System/controller": {
          "x": 420,
          "y": 180,
          "pinned": true
        }
      },
      "edgeRoutes": {},
      "hidden": [],
      "expanded": [],
      "aliases": {},
      "annotations": [],
      "constraints": [],
      "presentationNodes": [],
      "presentationEdges": [],
      "showPorts": true,
      "showEdgeLabels": true,
      "showTypes": true,
      "camera": { "x": 0, "y": 0, "zoom": 1 },
      "updatedAt": "2026-07-22T00:00:00.000Z"
    }
  ],
  "mutations": [
    {
      "id": "6e65aab4-7808-448d-92ff-588d59a1417c",
      "at": "2026-07-22T00:01:00.000Z",
      "actor": "layout-agent",
      "client": "cli",
      "operation": "layout.move",
      "viewId": "architecture",
      "modelRevision": 2,
      "viewRevision": 4,
      "targetIds": ["node:def:Package::System/controller"],
      "changedFields": ["positions"]
    }
  ]
}
```

- Dragging a node makes its position pinned.
- Automatic and incremental layout never moves pinned nodes.
- Positions use contextual IDs, so one semantic part may have a distinct
  location in different instance paths and views.
- `hidden`, `expanded`, aliases, styled annotations with optional node/port
  arrows, camera state, port visibility,
  edge-label visibility, and type-detail visibility are view-specific.
- `edgeRoutes` stores bend points and optional source/target attachments. Tidy
  layout writes unpinned, obstacle-aware routes; user endpoint edits promote a
  route to pinned presentation state. Each attachment records a node side
  (`top`, `right`, `bottom`, or `left`) and a normalized offset along that side.
  Selecting an edge in the browser exposes draggable endpoint controls;
  double-clicking one restores automatic attachment. Browser bend-point editing
  remains deferred.
- `constraints` persists `above`, `below`, `left-of`, and `right-of`
  relationships. Layout templates transfer positions and constraints using
  explicit mappings first, then unique alias, name, or type matches.
- `presentationNodes` contains visibly non-semantic actors/references and
  `presentationEdges` contains dashed reference/informational links. They are
  rendered in the browser and exports but excluded from semantic counts and
  model validation. Informational labels remain visible when semantic edge
  labels are hidden; `bendPoints` optionally defines their route. Actors use a
  compact glyph and references remain dashed cards.
- Automatic export bounds come from the complete visible render scene:
  semantic geometry, routes, labels and marker overflow, annotations/arrows,
  and presentation objects. Negative scene coordinates are translated into the
  padded viewport. SVG and PNG therefore use identical dimensions.
- `viewRevision` changes only for explicit visual mutations. Passive placement
  of newly discovered nodes does not advance it.
- `mutations` is an atomic, bounded (latest 200) provenance ledger. It records
  actor/client labels and affected identities, not full playback snapshots.
  Labels are descriptive rather than authenticated identities. Schema v1
  documents migrate in memory to v2 and gain empty constraint/presentation
  collections plus the default `info` annotation style on their next save.

The built-in `faa-a1` preset is created only when the selected project contains
the expected Isolette environment definition. It is ordinary view data, not a
special rendering path, and is explicitly annotated as curated. Preset-managed
views carry optional server-owned metadata such as
`"preset": { "id": "faa-a1", "version": 1 }`; migrated schema version 1 documents
without this field remain valid. An unmarked legacy `faa-a1` view is adopted
only when it exactly matches the known curated baseline. Marked older versions
use a three-way upgrade that retains user-modified positions, aliases, and
filters. Unknown or newer versions are left unchanged.
