# Rust/Verus projection contract audit

## Result

The Rust candidate is a well-formed HAMR Microkit projection of the accepted
drone lifecycle model. It retains the five behavior threads, eleven semantic
interactions, contract ownership, state ownership, and all 45 accepted trace
identifiers. HAMR generated five Rust application crates with GUMBO-derived
Verus entrypoint contracts. The only semantic-text adaptation is Boolean
literal spelling; the remaining differences are deployment support.

## Baseline and candidate

- Accepted model:
  `../synthesis/20260813T151848Z-drone-lifecycle-rust-verus-poc/model/Drone_Lifecycle_Governor.sysml`
- Executable candidate: `model/Drone_Lifecycle_Governor.sysml`
- Accepted source SHA-256:
  `5a030ca834e68299b0ae0ce79360160ed0f5656c1283f44869126fccc83bf621`
- Candidate AIR cache: `model/.slang/Drone_Lifecycle_Governor_System_Instance.json`
  (4,148,726 bytes; SHA-256
  `8fef115b931f7b7e9118d2464dcf8c20cdb6ea6182e2b5e42614900deff143f2`)

## Every source-model adaptation

### Rust execution profile

Each behavior definition specializes a candidate-local `Periodic_Rust_Thread`
profile with a 1000 ms period, periodic dispatch, and Rust implementation
language. A `Drone_Lifecycle_Processor` supplies a 1000 ms frame and 1 ms clock.
These are projection settings, not physical timing or safety claims.

### Microkit deployment

Current HAMR Microkit generation rejected the accepted logical wrapper because
a Process may contain only one Thread. The candidate therefore uses five
behavior-free, one-thread Process wrappers, domains 2 through 6, and bindings
to one processor. Delegation around formerly intra-process flows raises raw
`PortConnection` declarations from 17 to 27, while the original eleven typed
semantic interactions `INT-01` through `INT-11` remain unchanged. Wrappers own
no behavior, state, helper, case, or contract.

### GUMBO Boolean compatibility

The initial projection preserved the GUMBO blocks byte-for-byte. Proof then
exposed a backend interoperability defect: `T` and `F` lowered correctly inside
Verus specifications but appeared as unresolved identifiers in generated
runtime GUMBOX code. The repair changes only 38 Boolean spellings within GUMBO:

- 5 occurrences of `T` became `true`.
- 33 occurrences of `F` became `false`.

These are equivalent GUMBO Boolean constants. No operator, guard, case,
priority, helper, state reference, initialization guarantee, output relation,
or contract owner changed. The concatenated GUMBO hashes differ precisely
because of those spellings: accepted
`d49d8f5b8890bfc61ba8641aeb820f1ca6bad424c24710ddc5e65249f7438b7f`,
candidate
`327fa05d0f01c579beba2eca69218f5033718779a5d828dc918e4c65d80b6cde`.

## Generated result

The candidate typecheck exits 0 with `Well-formed!` (plus the existing
non-fatal package-root resolver warning). HAMR Microkit code generation exits
0, writes the candidate-local AIR cache, and generates only
`rust/hamr/microkit`; no Slang/JVM application project is requested or emitted.

The behavior application crates are:

1. `request_qualification_process_request_qualification`
2. `battery_evidence_assessment_process_battery_evidence_assessment`
3. `lifecycle_governor_process_lifecycle_governor`
4. `enablement_derivation_process_enablement_derivation`
5. `pilot_notice_derivation_process_pilot_notice_derivation`

Each has generated Verus contracts on `initialize` and `timeTriggered`. The
governor contract includes its invariant and all eleven `CASE_01` through
`CASE_11` branches. Proof evidence is in
[`../proof/verification.md`](../proof/verification.md).

## Claim boundary

The five-wrapper/27-route deployment is necessary support for the current
Microkit backend; it is not claimed to meet the accepted abstract's one-wrapper
structural metric. This POC does not demonstrate a Microkit image build or
execution, scheduling or timing assurance, physical-drone behavior, safety,
certification, or production readiness.
