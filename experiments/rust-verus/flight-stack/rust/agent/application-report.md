# Rust application implementation report

Status: **passed**. All eight generated behavior-owner crates now contain real
Rust behavior, generated API reads/writes, and Verus postconditions for every
allocated CASE contract. The final post-regeneration proof reports 78 owner
obligations verified and 0 errors.

## Implemented owners

| Owner | Behavior | Persistent state | Verified/errors |
| --- | --- | --- | ---: |
| PART-FCS-01 | Qualifies crew FD/AP/CWS commands and conflicts | none | 9 / 0 |
| PART-FCS-02 | Classifies raw attitude as Invalid, Unsafe, or Safe | none | 8 / 0 |
| PART-FGS-01 | Captures/retains reference and FD display state | `referenceRoll`, `referencePitch`, `referenceValid`, `fdState` | 11 / 0 |
| PART-FGS-02 | Produces paired saturated FD guidance and health | none | 10 / 0 |
| PART-FGS-03 | Produces AP guidance and validity | none | 9 / 0 |
| PART-APS-01 | Executes the repaired prioritized AP mode machine | `apMode` | 13 / 0 |
| PART-APS-02 | Produces three-level actuator-rate proposals | none | 9 / 0 |
| PART-APS-03 | Gates proposals by actuation authority | none | 9 / 0 |

No additional semantic state, modes, inputs, outputs, or interactions were
introduced. Application placeholder files: **0**. Six owners are stateless;
the two stateful owners retain exactly the accepted five fields listed above.

## All 20 CASE mappings

| CASE | Accepted owner | Verified application |
| --- | --- | --- |
| CASE-CMD-01 | PART-FCS-01 Crew Command Qualifier | `crewCommandQualifier_behavior_app.rs` |
| CASE-CMD-02 | PART-FCS-01 Crew Command Qualifier | `crewCommandQualifier_behavior_app.rs` |
| CASE-ATT-01 | PART-FCS-02 Attitude Safety Qualifier | `attitudeSafetyQualifier_behavior_app.rs` |
| CASE-ATT-02 | PART-FCS-02 Attitude Safety Qualifier | `attitudeSafetyQualifier_behavior_app.rs` |
| CASE-REF-01 | PART-FGS-01 Reference Manager | `referenceManager_behavior_app.rs` |
| CASE-REF-02 | PART-FGS-01 Reference Manager | `referenceManager_behavior_app.rs` |
| CASE-REF-03 | PART-FGS-01 Reference Manager | `referenceManager_behavior_app.rs` |
| CASE-FD-01 | PART-FGS-02 FD Guidance/Health Generator | `fdGuidanceHealthGenerator_behavior_app.rs` |
| CASE-FD-02 | PART-FGS-02 FD Guidance/Health Generator | `fdGuidanceHealthGenerator_behavior_app.rs` |
| CASE-APG-01 | PART-FGS-03 AP Guidance Generator | `apGuidanceGenerator_behavior_app.rs` |
| CASE-APG-02 | PART-FGS-03 AP Guidance Generator | `apGuidanceGenerator_behavior_app.rs` |
| CASE-AP-01 | PART-APS-01 AP Engagement Manager | `apEngagementManager_behavior_app.rs` |
| CASE-AP-02 | PART-APS-01 AP Engagement Manager | `apEngagementManager_behavior_app.rs` |
| CASE-AP-03 | PART-APS-01 AP Engagement Manager | `apEngagementManager_behavior_app.rs` |
| CASE-AP-04 | PART-APS-01 AP Engagement Manager | `apEngagementManager_behavior_app.rs` |
| CASE-AP-05 | PART-APS-01 AP Engagement Manager | `apEngagementManager_behavior_app.rs` |
| CASE-AP-06 | PART-APS-01 AP Engagement Manager | `apEngagementManager_behavior_app.rs` |
| CASE-PROP-01 | PART-APS-02 Actuator Rate Proposer | `actuatorRateProposer_behavior_app.rs` |
| CASE-GATE-01 | PART-APS-03 Actuator Safety Gate | `actuatorSafetyGate_behavior_app.rs` |
| CASE-GATE-02 | PART-APS-03 Actuator Safety Gate | `actuatorSafetyGate_behavior_app.rs` |

Each listed file references its corresponding generated `CASE_*_spec`; the
final application audit finds 20 distinct mappings.

## Semantic repair and proof trail

The accepted final model repaired invalid-input determinism, initialization
guards, command-conflict handling, and AP disengagement priority. Its GUMBO
library was copied exactly into the deployment projection; both extracted
blocks hash to
`14e62f277854641ea1e997fadf4e6763a7c3805ad61c3fac40bf2dcf8a5214c2`.
Both sources typecheck. The canonical semantic evidence remains in the accepted
run's `validation/` directory; the Rust proof closes the lowered contracts.

The first all-eight proof passed, then unchanged repaired-model HAMR Microkit
regeneration exited 0 and preserved all eight application files byte-for-byte.
The final all-eight proof passed again. The governing evidence is
`rust/proof/verus-accepted-final-pass2/`; regeneration evidence is in
`rust/proof/regeneration-accepted-final.log` and the matching
`application-hashes.accepted.{before,after}-regeneration.txt` manifests.

There are no application `requires` clauses, assumptions, admits, or semantic
external bodies. Generated API device-I/O bodies and non-semantic logging
wrappers remain external at their intended trust boundary. No generated
FlightStack/data/API/GUMBOX/Cargo/Microkit file was hand-edited.

## Claim boundary and blockers

Blockers: **none** for the 20 lowered CASE contracts and eight owner proofs.

Known backend limitation: five datatype invariants (`ATTITUDE_RANGE`,
`GUIDANCE_RANGE`, `AP_STATUS_RANGE`, `ACTUATOR_RANGE`, `PROPOSAL_RANGE`) remain
in SysML but were not lowered into Rust. They are explicitly excluded from the
Verus claim. No Scala/JVM/Slang application outputs were added, and no
`MANIFEST.json` or `RUN_SUMMARY.md` was created under `rust/`.
