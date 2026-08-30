# Approved design selection after Model review

## Decision scope

SEL-SCOPE-01 — The decision concerns responsibility allocation for the appendix B FCS boundary while preserving appendix C FGS and appendix D AP subsystem obligations. It does not select SysML syntax, software threads, scheduling, control-law implementation, deployment, hardware redundancy, or executable code.

SEL-CRIT-01 — The alternatives were compared for source-allocation fidelity, owner-local behavioral meaning, complete invalid/conflict/recovery partitions, stable domain interactions, contract locality, medium-tier bounds, trace clarity, and avoidance of forwarding-only usages.

## Plausible allocations considered

ALT-COARSE-01 — Coarse two-subsystem allocation: one FGS usage owns command/attitude qualification, Reference Attitude, both guidance products, FD state, and FCS Failed; one AP usage owns engagement, CWS, AP Status, AP Guidance Request, actuator generation, and actuator gating. This most closely resembles the high-level appendix B split and minimizes connections.

ALT-COARSE-02 — The coarse allocation was not selected because its two usages cannot meet the medium tier’s eight-to-twelve meaningful-usage boundary without later padding. More importantly, it centralizes unrelated validity, state, guidance, engagement, and final-authority decisions, making owner-local contracts and recovery evidence difficult to inspect.

ALT-FED-01 — Federated-subsystem allocation: FGS and AP each receive raw FCI and AHS flows and each locally qualifies duplicated crew/attitude inputs; FGS owns reference/guidance/health, while AP owns engagement/proposal/gating. This gives each subcontractor a self-contained boundary similar to appendices C and D.

ALT-FED-02 — The federated allocation was not selected because duplicated qualification creates two potentially inconsistent definitions of Safe, Invalid, and command priority. It also increases raw boundary fan-out and composition obligations without a source requirement for independent channels or redundant qualification.

ALT-SEL-01 — Selected qualification-and-control allocation: one Crew Command Qualifier and one Attitude Safety Qualifier establish shared FCS boundary facts; three FGS owners separately retain Reference/FD state, derive FD guidance/FCS Failed, and derive AP guidance; three AP owners separately decide engagement, propose rates, and gate final CSA authority. All eight usages are flat under one root while FGS/AP allocation is retained by names, contracts, and trace groups. Model review narrowed two redundant edges without changing this responsibility allocation.

ALT-SEL-02 — The approved allocation has exactly eight semantic usages, 15 owner-to-owner semantic interactions, and 21 total directed connections after including six root boundary routes. Qualification is centralized only for boundary meaning; state and controlled decisions remain with their source-allocated FGS/AP owners. The sole reverse owner direction is from the AP Engagement Manager to the Reference Manager, carried by two independently decision-relevant facts: AP Guidance Request and AP-active clear inhibition. There is no constant actuator-range feedback.

## Selection rationale

SEL-RAT-01 — Source fidelity: PART-FGS-01 through PART-FGS-03 collectively preserve every appendix B FG and appendix C FGS normative statement; PART-APS-01 through PART-APS-03 collectively preserve every appendix B AP and appendix D AP normative statement. Cross-cutting qualifiers do not absorb Reference, guidance, AP mode, status, or actuation ownership.

SEL-RAT-02 — Cohesion: Reference/FD state changes together, FD guidance and its failure/unsafe indication change together, AP guidance has a separate multi-input applicability relation, AP engagement/CWS/recovery changes together, rate proposal is distinct from authority, and the final gate independently selects publish versus inhibit. These are stable domain responsibilities, not tool artifacts.

SEL-RAT-03 — Priority and recovery: command conflict is resolved once before subsystem decisions, while AP state retains the safety-sensitive priority and recovery policy. Invalid authority, attitude, or guidance input; explicit disengagement; Unsafe attitude; CWS; fresh engagement; synchronization; display; and prior-state retention have one total ordering. Unsafe and Invalid remain distinct through the direct Qualified Attitude edge into the AP owner.

SEL-RAT-04 — Contract locality: every semantic usage derives an owner-local fact and has named contract cases. No selected usage only forwards, renames, bundles, or bijectively translates an input. The Actuator Rate Proposer cannot authorize output, and the Safety Gate cannot recompute the proposal.

SEL-RAT-05 — Bounded scope: the final metrics are exactly eight semantic usages, 15 normalized owner-to-owner semantic interactions, 21 total directed connections including six root routes, 20 nontrivial owner-local cases, eight scenario families, and containment depth one. They arise from source behavior plus necessary composition/failure/recovery closure. No wrapper, duplicate qualifier, left/right display adapter, constant fault feedback, or monitoring-only relay is credited.

## Allocation comparison and retained consequences

COMP-01 — Compared with ALT-COARSE-01, the selected allocation adds explicit ownership boundaries for qualification, reference state, FD-guidance/health generation, AP-guidance generation, engagement, proposal, and final authority. This increases inspectable contracts and interactions while retaining the same external FCS boundary and the same normative FGS/AP allocation.

COMP-02 — Compared with ALT-FED-01, the selected allocation uses one qualified crew disposition and one qualified attitude fact. It removes duplicated raw-input policies but retains separate FGS and AP decisions downstream; a change to the numeric Safe envelope is therefore localized to PART-FCS-02, while engagement and guidance reactions remain separately reviewable.

COMP-03 — The principal trade is coupling through shared qualified facts. A qualifier defect could affect both FGS and AP, and the flat model is not a subcontractor deployment specification. That risk is accepted for this bounded functional model and is exposed through owner-local contracts and exhaustive finite classification. Physical independence, deployment, timing, executable realization, aircraft response, comfort, certification, and cost claims remain deferred.

COMP-04 — The source’s left/right PFD obligations are represented as paired output records rather than two semantic display-delivery usages. Separate adapters would only duplicate or route data and would violate the no-padding rule; equality of the two boundary copies is instead a controlled-output contract.

## Frozen selected inventory

FREEZE-PART-01 — The selected semantic usages are exactly PART-FCS-01, PART-FCS-02, PART-FGS-01, PART-FGS-02, PART-FGS-03, PART-APS-01, PART-APS-02, and PART-APS-03 from the System Abstract.

FREEZE-INT-01 — The selected inventory is exactly INT-BND-01 through INT-BND-06; INT-FCS-01 through INT-FCS-03; INT-FGS-01 through INT-FGS-05; INT-CROSS-01, INT-CROSS-02A, INT-CROSS-02B, and INT-CROSS-03; and INT-APS-01 through INT-APS-03 from the approved System Abstract, for 21 total directed connections and 15 normalized semantic interactions after excluding the six root routes.

FREEZE-CASE-01 — The selected contract cases are exactly the 20 clauses enumerated by CASE-AUD-01 in the System Abstract. Contract syntax may consolidate expressions only if metrics still identify all 20 distinct nontrivial owner-local obligations; pass-through guarantees receive no credit.

FREEZE-SCN-01 — The selected scenario families are exactly SCN-FD-01, SCN-FD-02, SCN-AP-01, SCN-CWS-01, SCN-OFF-01, SCN-SAFE-01, SCN-INV-01, and SCN-FAIL-01, for a recounted total of eight.

## Model-review findings resolved

RESOLVE-MODEL-01 — Accept and narrow the redundant-FD-product finding. FdProductQualification, FdProductUnavailable, and INT-FGS-06 are removed because reference validity, direct attitude class, and FD state already determine the same partition. A direct Qualified Attitude edge from PART-FCS-02 to PART-APS-01 replaces it so the AP owner distinguishes Unsafe inhibition from Invalid failure while consuming AP-guidance validity separately.

RESOLVE-MODEL-02 — Accept and narrow the constant-range-feedback finding. FORM-ACT-01 and CASE-PROP-01 produce only `-50`, `0`, or `+50`, all within `-200..200`; therefore RangeFault and INT-APS-04 are removed. PART-APS-03 retains complementary publish/inhibit ownership in CASE-GATE-01 and CASE-GATE-02, while bounds remain payload and invariant checks.

RESOLVE-MODEL-03 — Accept the interaction split. Former bundled INT-CROSS-02 becomes INT-CROSS-02A AP Guidance Request and INT-CROSS-02B AP-active clear inhibition because they affect different Reference Manager decisions. Along with the direct attitude replacement and removed feedback, this preserves exactly 15 internal interactions and 21 total connections without adding an owner.

RESOLVE-MODEL-04 — Accept the realizability constraints without changing the domain boundary: generation requires explicit repository-library imports, attribute-backed cohesive record fields, local left/right equality, and no shadow state. Generated support is limited by GEN-SUP-01 and GEN-SUP-02. The bounded analyzer must satisfy ANALYSIS-01 and ANALYSIS-02, including exact raw-domain, Safe/Unsafe, saturation, and deadband breakpoint coverage; three coarse attitude labels alone are insufficient.

## Decision

DEC-SEL-01 — Approve ALT-SEL-01 as revised in System Abstract SA-FAA-FLIGHT-STACK-0002 and authorize Model regeneration in this retained immutable run. The six root records, eight owners, source allocations, state ownership, AP modes, priorities, root-reachable behaviors, 20 local cases, eight scenarios, and deferred claims are preserved. Any further change to boundary fields, state ownership, interaction endpoints/count, priority, recovery, cases, generated-support boundary, analysis obligations, or structural bounds requires another explicit Designer resolution in this same run.
