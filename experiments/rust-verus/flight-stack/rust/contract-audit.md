# Final contract and artifact audit

## Source and projection

- Canonical source: `runs/20260817T021406Z-faa-flight-stack-appendices-b-c-d/model/flight_stack.sysml`
- Canonical SHA-256: `21424fafbfd58b33998929b314423608434264eee9b94f2327f51b06074ba657`
- Projected source: `rust/model/flight_stack_rust.sysml`
- Projected SHA-256: `2e5a607eb917bd9345eff9417ab09b6486ca7a6e532e89ae7923711b2c872923`
- Canonical and projected post-repair typechecks: exit 0, `Well-formed!`
- Post-repair GUMBO blocks: identical SHA-256
  `14e62f277854641ea1e997fadf4e6763a7c3805ad61c3fac40bf2dcf8a5214c2`
- Accepted semantic evidence is retained under the run's `validation/` tree.
- Final Microkit generation and unchanged-model regeneration: exit 0.

The projection retains the six root ports, eight semantic behavior owners, 21
semantic connections, and FCS/FGS/AP responsibility allocation. Deployment-only
additions are one process/domain per owner, thread classifications, processor
bindings, and periodic Microkit scheduling metadata. These values are generator
scaffolding, not new physical-performance claims.

## Contracts and applications

- Generated CASE specifications: 20.
- Application crates/files: 8/8.
- Application placeholders: 0.
- Stateful application files: 2; stateless: 6.
- Persistent state: Reference Manager's four accepted reference/display fields
  and AP Engagement Manager's accepted AP-mode field only.
- Application `requires` clauses: 0.
- Application `assume`/`admit` statements: 0.
- Generated GUMBOX/API/data files manually edited: 0.
- Regeneration: 8 application files compared, 0 byte differences.
- Final Verus: 8/8 crates, 78 owner obligations verified, 0 errors.

The applications implement the accepted repaired command, reference, and AP
priorities without changing the canonical source. Five source datatype invariants
are not lowered by the current HAMR Microkit backend and are excluded from the
Verus claim; no assumptions were introduced to claim them.

## Handoff hygiene

The final forbidden-artifact scan is retained as `rust/proof/final-artifact-audit.txt`.
The handoff contains no `MANIFEST.json`, `RUN_SUMMARY.md`, Scala source/class/JAR,
Slang/JVM application tree, internal AIR JSON, `target` tree, `node_modules`, or
Python bytecode cache. Generated Microkit C glue, Rust crates, schedules,
attestation, source models, proof logs, and agent evidence are retained.
