# AP contract semantic repair

## Result

The AP transition defect was repaired in both authoritative SysML sources before
the application proof was continued:

- canonical: `runs/20260817T021406Z-faa-flight-stack-appendices-b-c-d/model/flight_stack.sysml`;
- Rust projection: `rust/model/flight_stack_rust.sysml`.

No generated Rust, data, API, GUMBOX, Cargo, or Microkit file was hand-edited.
The exact GUMBO delta is retained in `rust/proof/ap-contract-repair.diff` and the
pre-repair witnesses are retained in `rust/proof/ap-contract-defect.md`.

## Defect and repair

The old six AP predicates admitted seven concrete contradictory witnesses,
three uncovered typed observations, and two priority inversions. In particular,
fault, explicit-disengage, unsafe-attitude, and CWS guards could overlap with
different required next modes, while `CASE_AP_03` lacked the guidance input
needed to distinguish valid CWS entry.

The repair establishes the priority order required by the accepted policy:

1. initialization and failed-mode recovery;
2. forced disengage or invalid authority;
3. explicit disengage;
4. unsafe-attitude inhibition;
5. CWS hold/release handling;
6. engagement;
7. retention.

`CASE_AP_03` now receives `ApGuidanceAndValidity` and owns only normal On-to-CWS
entry. `CASE_AP_05` owns the complementary On observations. `CASE_AP_01`,
`CASE_AP_02`, `CASE_AP_04`, `CASE_AP_05`, and `CASE_AP_06` use mutually
exclusive priority guards, including CWS force-disengage and guarded failed-mode
recovery.

## Post-repair evidence

- Canonical typecheck: `Well-formed!` in
  `rust/proof/accepted-source-tipe.post-repair.log`.
- Projected typecheck: `Well-formed!` in
  `rust/proof/projected-source-tipe.post-repair.log`.
- Canonical/projected GUMBO blocks: six blocks and 31,248 bytes each, both
  SHA-256 `1a5c8a9fafa5bf91cf623812e7e68a0ae8a6f66972c9f7050e1995d6142457ea`;
  see `rust/proof/gumbo-hashes.post-repair.txt`.
- Bounded logical-observation analysis: passed with 0 gaps, 0 overlaps, 0
  contradictions, 0 case-partition errors, 0 implementation mismatches, and 0
  required-output mismatches. All 576 typed AP observations were enumerated.
- The same analysis exhausts the 51,840,000 two-axis attitude/status product by
  exact Cartesian factoring and composes 2,076,672 retained representative
  observations. Its six invariant counters and all scenario-oracle mismatch
  lists are zero; see `rust/proof/bounded-analysis.post-repair.json`.
- Repaired-model HAMR generation exited 0. The first repaired codegen preserved
  the eight then-current application files byte-for-byte, as shown by
  `application-hashes.before-codegen.txt` and
  `application-hashes.after-repair-codegen.txt`.

The bounded analysis is finite model/oracle evidence, not a solver proof,
timing claim, physical-performance claim, or safety certification. The final
implementation proof evidence is separately recorded in `verification.md` and
the governing `verus.log`.

## Backend proof boundary

HAMR did not lower five datatype invariants into Rust:
`ATTITUDE_RANGE`, `GUIDANCE_RANGE`, `AP_STATUS_RANGE`, `ACTUATOR_RANGE`, and
`PROPOSAL_RANGE`. This known backend limitation is preserved. Those five
invariants are not part of the Verus proof claim, and no application assumption
or precondition was added to simulate them.
