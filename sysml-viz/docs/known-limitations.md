# Known limitations

Warning diagnostics can be dismissed individually or together in the browser.
Dismissal is presentation-only and session-local: it resets when the project
root changes, while a warning whose message or source range genuinely changes
receives a new identity and is shown again. Exact duplicates arriving through
the diagram and validation channels are displayed once. Error diagnostics are
never dismissible.

- The focused parser covers the AADL-oriented SysML constructs observed in
  Simple Sump Pump and INSPECTA Isolette. It is not a complete SysML v2 parser.
- System Abstract linking recognizes explicit, adjacent `@trace` comments and
  `ID:` declarations in `system-abstract.md` at the project root or its parent.
  It does not infer links from names, prose similarity, or arbitrary
  requirements files; the links establish provenance, not correctness.
- Sireum `tipe` has no structured-output option in the installed build. It runs
  asynchronously and takes roughly 12 seconds and several GB of memory for
  Isolette. Jobs are serialized.
- The pinned Sireum resolver emits a non-fatal `Need to handle PartUsage(...)`
  warning for a named package-level root instance such as
  `part greenhouse_ventilation : Greenhouse_Ventilation_Root;`. The declaration
  is handled by a later member/typechecking pass and the Greenhouse model still
  reports `Well-formed!`; SysML Viz's derived diagram is unchanged with or
  without that instance. This does not establish that every downstream Sireum
  code-generation path ignores the warning.
- This Sireum build may exit 0 after semantic errors. SysML Viz accepts a run
  only when diagnostics contain no errors, exit status is 0, and the exact
  `Well-formed!` marker appears.
- The current Simple Sump Pump source is locally renderable, but Sireum rejects
  unnamed direct-compute GUMBO clauses around lines 80–81.
- FAA Figure A-1 aggregates multiple connections into conceptual flows. V1
  supplies curated aliases and grouping; interactive edge-bundle expansion and
  manual bend-point editing remain future work. Individual edge endpoints can
  be repositioned and persist with their view.
- Crossing counts are geometric estimates unless persisted routes exist; the
  browser router can differ slightly.
- Graphical edits affect presentation state only. Semantic SysML/GUMBO changes
  remain source-based.
- Relative moves are one-shot commands against current coordinates. Durable
  relational constraints are deferred because their migration and conflict
  semantics require a separate schema contract.
- Mutation provenance is a bounded metadata ledger, not durable event playback,
  and actor labels are intentionally unauthenticated in the loopback-only V1.
- Durable full-history playback, Logika counterexamples, generated Slang/Rust
  navigation, a VS Code extension, and an MCP wrapper are deferred.
