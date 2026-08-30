# System Abstract traceability

SysML Viz can join an interactive diagram to its run's System Abstract without
guessing from component names or prose. The join key is the stable identifier
already shared by the two artifacts:

```sysml
// @trace PART-03 BEH-01 FAULT-01
part ventilation_decision : Ventilation_Decision_i;
```

```markdown
PART-03: Ventilation Decision

Own validation of the monitored input and apply the complete policy.
```

## File and range contract

For a project rooted at `.../run/model`, the server checks
`model/system-abstract.md` and then `run/system-abstract.md`. The resolved real
path must remain inside `--workspace-root`, including through symlinks. No
recursive search or arbitrary browser-provided path is accepted.

An abstract declaration begins with `ID:`, `ID —`, or `ID / OTHER-ID:` at the
start of a line, where each ID is one or more uppercase hyphen-separated prefix
segments followed by a numeric segment and optional refinement letter, such as
`PART-01`, `CTRL-03A`, or `RES-MR-01`. An optional
parenthetical or bracketed qualifier may occur between the ID and colon, such
as `PART-01 (sensor intake):` or `FAULT-01 [case 1]:`. The server
returns its exact text plus one-based line and zero-based UTF-16 offset ranges.
Title-style declarations include their
following descriptive paragraph; explicitly labeled `Rationale:` and
`Verification:` paragraphs are also retained. A full-sentence declaration
does not absorb later unscoped prose.

The focused SysML parser attaches IDs only from the contiguous comment run
immediately before a part definition, part usage, port, connection, or
allocation. A rendered component exposes the ordered union of its usage and
resolved definition IDs. Duplicate IDs are removed without reordering.

GUMBO declarations use the same authoritative convention. The `// @trace`
line must be directly above an invariant, assumption, guarantee, or compute
case; a blank line is an intentional boundary. A compute-case card exposes the
ordered union of its case- and clause-level IDs:

```sysml
// @trace MON-01 SAF-03
guarantee command_is_safe: command == Safe;
```

## Browser behavior

When an abstract is available, the browser opens **System abstract** alongside
the diagram. Hovering a traced semantic component previews its corresponding
ranges and shows a click hint, but never moves the document. Clicking a traced
component or port opens its bottom inspector and the abstract without changing
the diagram viewport, focuses the first matching range, and enables
**Previous**/**Next** controls for all distinct matching ranges.
Selecting a component keeps its ranges highlighted after the pointer leaves.

The component inspector's **GUMBO** tab shows a clearly labeled **System
Abstract** row on every traced contract card. Its trace-ID pills are links:
hovering previews exactly that abstract passage without scrolling, and clicking
opens the abstract at that passage. Previous/next controls then traverse every
abstract passage linked to the selected contract. In the reverse direction,
clicking a traced passage opens its sole contract or a compact chooser when
several contracts share the same abstract identifier.

Closing the abstract collapses it to a slim restore tab attached to the right
edge. The canvas sidebar button hides or restores the model/views sidebar. The
selected element inspector is a keyboard- and pointer-resizable bottom drawer;
its Details tab reports types, boundary-port datatypes, and all `@trace` tags,
while view/layout controls live under Style. These presentation actions do not
change model semantics or saved view state unless a Style action is applied.

The panel deliberately shows source Markdown rather than executing embedded
HTML. This preserves exact review text and avoids turning a project artifact
into active browser content.

## HTTP response

`GET /api/traceability/system-abstract` returns `null` when the conventional
file is absent. Otherwise it returns:

- `relativePath` and the workspace-confined canonical `path`;
- the complete `markdown` source;
- `anchors` with ID, enclosing heading, line/offset range, and exact text;
- `taggedElementCount` and `traceAssociationCount`, which bound the complete
  element-to-abstract review workload;
- the distinct `referencedTraceIds` present on parsed model elements;
- `unresolvedTraceIds` referenced by parsed model elements but not declared in
  the abstract; and
- `duplicateAnchorIds` whose multiple declarations would make navigation
  ambiguous.

Diagram nodes, edges, and ports returned by `GET /api/diagram` carry their own
`traceIds`. Consumers can therefore build the same interaction without
re-parsing SysML comments or Markdown.

## Current boundary

Traceability is syntactic provenance, not evidence that the SysML element
correctly realizes the abstract clause. Comment IDs and Markdown declarations
must be maintained explicitly. The endpoint currently recognizes the
repository's adjacent `@trace` convention and conventional System Abstract
locations; it does not ingest a general requirements database.
