---
abstract_id: DRONE-BATT-CHARGE-SA-FINAL-01
run_id: 20260813T155231Z-drone-governor-small-r2-a1
domain_seed: drone-logical-domain-20260812t143051z
campaign_complexity: small
semantic_usage_bounds: [5, 8]
semantic_interaction_bounds: [7, 14]
nontrivial_contract_case_bounds: [6, 12]
scenario_family_bounds: [4, 6]
selected_semantic_usage_count: 6
selected_semantic_interaction_count: 14
selected_nontrivial_contract_case_count: 12
selected_scenario_family_count: 5
root_system_usage_count: 1
semantic_containment_depth: [1, 2]
weakly_connected_semantic_regions: 1
principal_decision_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
status: designer-approved
---

# Small Drone Battery Charge Qualification Supervisor

## Synopsis, need, purpose, and goals

NEED-01: A configurable unmanned drone needs a bounded logical service that qualifies qualitative battery evidence and the immediate charging context before permitting charge delivery, while exposing battery-related attention and flight-readiness evidence. The need is evidence and charging qualification, not governance of the drone lifecycle.

PURPOSE-01: The Small Drone Battery Charge Qualification Supervisor will accept finite battery, charger-availability, flight-activity, and charge-intent samples; issue a logical charge authorization; report battery attention to the pilot; and provide battery-readiness evidence to a flight-control context. It will inhibit authorization on invalid evidence and require a valid neutral sample followed by a fresh intent before authorization can resume.

GOAL-01: The system shall issue exactly one charge authorization for every finite input and owner-state combination, permitting charge only when a fresh or retained charging intent is supported by valid low-battery evidence, charger availability, and inactive flight context.

GOAL-02: The system shall distinguish valid low-battery evidence from invalid evidence and recovery gating in its pilot-visible attention output.

GOAL-03: The system shall prevent a nonneutral charge intent sampled during invalid-input recovery from being replayed as a later authorization.

GOAL-04: The system shall publish battery-readiness evidence without commanding or deriving any lifecycle phase, flight maneuver, or achieved charging condition.

## Evidence and claim classification

METHOD-01: Handbook-derived method requires an implementation-independent need and boundary before parts, explicit assumptions and owner allocation, nominal and off-nominal scenarios, comparison of alternatives, stable traceability, measurable bounds, and separate verification from validation. These are methodology obligations, not facts about drones.

FACT-SRC-01: The frozen seed grounds the configurable drone domain, battery and charging support, qualitative battery-capacity indication, battery-status checking, low-battery notification toward flight control, a pilot who monitors remaining charge, a charger and charging interface, and source-named begin-charging and end-charging events.

FACT-SRC-02: The seed also grounds lifecycle and other capability vocabulary but does not assign event authority, define charging or readiness policy, provide numeric battery thresholds, establish physical charging behavior, or provide a consistent engine-count premise. Forest-fire observation is a product cue rather than an operational mission definition.

ABS-PILOT-01: This abstract selects the battery-awareness-supervisor scope and introduces the exact finite sample types, external charge-intent source, logical evaluation semantics, charging eligibility rule, priority, persistent authorization/recovery state, output meanings, contract partition, and scenarios as pilot abstractions.

ARCH-SEL-01: The selected architecture separates three evidence-qualification responsibilities from one stateful charge-decision owner and two derived reporting responsibilities. This is a selected architecture described in `design-selection.md`, not a source fact or handbook prescription.

MODEL-REV-01: The Designer accepts the Model review's realizability findings only as implementation-feasibility evidence for the frozen design. The accepted findings do not add domain behavior, alter any owner, case, scenario, boundary quantity, or metric, or convert tool precedent into verification evidence for the generated source.

DEFER-01: Physical charge level, numeric thresholds, charge or discharge rates, endurance, achieved charger connection, achieved charging, power switching, lifecycle transitions, navigation, flight dynamics, radio protocols, sensing, landing, return-to-home behavior, engine counts, real timing, hazard probability or severity, safety, certification, deployment, code generation, execution, compositional proof, and production readiness are explicitly deferred and shall never be reported as passed by this run.

## Operational context and exact system boundary

CTX-01: The Battery Management Context is outside the system and supplies one qualitative battery sample per logical evaluation. It remains responsible for the sample and status; the supervisor does not measure physical charge.

CTX-02: The Charger Interface Context is outside the system and supplies charger availability and receives logical charge authorization. Authorization receipt is observable at the boundary; connection, energization, and physical charging success remain outside scope.

CTX-03: The Flight Activity Reporter is outside the system and states whether flight is logically active for the present evaluation. This contextual observation may correspond to the source lifecycle vocabulary, but the supervisor neither owns nor changes lifecycle state.

CTX-04: The Charge Intent Source is outside the system and supplies begin, end, or neutral intent. The seed does not name this initiator; this abstraction does not assign command authority to the pilot.

CTX-05: The Pilot is outside the system and receives battery-attention status only for monitoring.

CTX-06: The Flight-Control Evidence Consumer is outside the system and receives battery-readiness evidence. It decides neither charge authorization nor lifecycle state inside this boundary.

MON-01: `BatterySample` is a finite root input from CTX-01 with fields `indication : BatteryIndication` and `status : InputStatus`, where `BatteryIndication` is exactly `{Low, Adequate}` and `InputStatus` is exactly `{Valid, Invalid}`. The indication is qualitative and carries no unit or numeric threshold.

MON-02: `ChargerSample` is a finite root input from CTX-02 with fields `availability : ChargerAvailability` and `status : InputStatus`, where `ChargerAvailability` is exactly `{Available, Unavailable}`.

MON-03: `FlightActivitySample` is a finite root input from CTX-03 with fields `activity : FlightActivity` and `status : InputStatus`, where `FlightActivity` is exactly `{Inactive, Active}`. It is contextual evidence, not an owned lifecycle state.

MON-04: `ChargeIntentSample` is a finite root input from CTX-04 with fields `intent : ChargeIntent` and `status : InputStatus`, where `ChargeIntent` is exactly `{NoIntent, BeginCharge, EndCharge}`.

CTRL-01: `ChargeAuthorization` is a finite root output to CTX-02 with exactly `{InhibitCharge, PermitCharge}`. It is permission from this logical supervisor, not evidence that power flowed or a battery charged.

CTRL-02: `BatteryAttention` is a finite root output to CTX-05 with exactly `{None, LowBattery, InputFault, RecoveryPending}`.

CTRL-03: `BatteryReadinessEvidence` is a finite root output to CTX-06 with exactly `{BatteryReady, BatteryNotReady, EvidenceUnavailable}`. It is one input to an external flight-control decision and is not a commanded `Ready` lifecycle phase.

BOUND-01: The root boundary consists of exactly MON-01 through MON-04 and CTRL-01 through CTRL-03. Lifecycle requests and outputs, physical charger control and feedback, numeric charge, mission commands, navigation, camera, obstacle, radio, landing-gear, engine, and forest-fire observation interfaces are outside this selected small scope.

## Logical evaluation and owner-state semantics

SEM-01: One logical evaluation consumes current MON-01 through MON-04 and the pre-evaluation owner state, selects exactly one ordered CASE-01 through CASE-12, atomically updates the owner state, and publishes all three controlled outputs. This evaluation abstraction makes no scheduler, period, latency, or physical simultaneity claim.

STATE-01: `authorizationState : ChargeAuthorization` and `recoveryPhase : RecoveryPhase` are the only persistent domain state, where `RecoveryPhase` is exactly `{Normal, AwaitNeutral, AwaitFreshIntent}`. PART-04 exclusively owns both variables; no other usage may store, override, select, or recompute them.

INIT-01: Initial state shall be `authorizationState = InhibitCharge` and `recoveryPhase = Normal`; initial CTRL-01 shall be `InhibitCharge`, initial CTRL-02 shall be `None`, and initial CTRL-03 shall be `EvidenceUnavailable`.

INVAR-01: Every reachable owner state shall satisfy `recoveryPhase != Normal implies authorizationState = InhibitCharge`. CASE-01 through CASE-04 establish or preserve the invariant, and CASE-05 through CASE-12 return to or remain in `Normal`.

FRESH-01: After CASE-01, a charge intent is fresh only if a valid `NoIntent` evaluation first selects CASE-03, any number of later valid `NoIntent` evaluations select CASE-04, and then a later valid `BeginCharge` or `EndCharge` selects CASE-05, CASE-06, or CASE-07. Restoring validity while the earlier nonneutral intent remains selects CASE-02 and cannot authorize charge.

## Semantic usages and ownership

PART-01: Battery Evidence Qualification shall derive `BatteryEvidence` exactly from both MON-01 fields. Its output is `InvalidBattery` for invalid status and otherwise `LowBatteryEvidence` or `AdequateBatteryEvidence`; it owns no persistent state or charge decision.

PART-02: Charge Context Qualification shall derive `ChargeContext` jointly from MON-02 and MON-03. It shall produce `InvalidChargeContext` if either status is invalid, otherwise `FlightActiveContext` when flight is active, otherwise `AvailableInactiveContext` or `UnavailableInactiveContext` from charger availability. This combined fact is a non-bijective charging-context classification, not forwarding.

PART-03: Charge Intent Qualification shall derive `QualifiedChargeIntent` from both MON-04 fields. It shall produce `InvalidChargeIntent` for invalid status and otherwise exactly `NoIntent`, `BeginCharge`, or `EndCharge`; it owns no persistent state or final decision.

PART-04: Charge Qualification Owner is the one and only principal decision owner. It shall exclusively own STATE-01, apply PRIORITY-01, select exactly one CASE-01 through CASE-12, and derive `ChargeDecision` containing `authorization : ChargeAuthorization` and `disposition : ChargeDisposition`, where `ChargeDisposition` is exactly `{InputFault, RecoveryPending, BeginAccepted, BeginDenied, Continued, Inactive}`.

PART-05: Pilot Attention Derivation shall derive CTRL-02 from `ChargeDecision` and `BatteryEvidence` using ADVISORY-01. It owns no state or charge decision and earns semantic credit through a prioritized two-input classification rather than renaming either input.

PART-06: Readiness Evidence Derivation shall derive CTRL-03 from `ChargeDecision` and `BatteryEvidence` using READINESS-01. It owns no state or charge decision and distinguishes invalid or recovery-blocked evidence from valid adequate and valid low evidence.

OWNER-01: The ownership audit shall report PART-04 as the sole principal decision and state owner; PART-01, PART-02, and PART-03 as stateless qualification owners; and PART-05 and PART-06 as stateless result-derivation owners. Each usage shall have an owner-local contract for its stated meaningful derived fact, with no owner credit for root, context, routing, bundling, or generated support.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary shall provide `BatterySample` from MON-01 to PART-01.

INT-02: The root boundary shall provide `ChargerSample` from MON-02 to PART-02.

INT-03: The root boundary shall provide `FlightActivitySample` from MON-03 to PART-02.

INT-04: The root boundary shall provide `ChargeIntentSample` from MON-04 to PART-03.

INT-05: PART-01 shall provide `BatteryEvidence` to PART-04.

INT-06: PART-02 shall provide `ChargeContext` to PART-04.

INT-07: PART-03 shall provide `QualifiedChargeIntent` to PART-04.

INT-08: PART-04 shall provide `ChargeAuthorization` from the authorization field of its committed `ChargeDecision` to CTRL-01 at the root boundary.

INT-09: PART-04 shall provide `ChargeDecision` to PART-05.

INT-10: PART-01 shall provide `BatteryEvidence` to PART-05 independently of INT-05 because pilot attention consumes that evidence for a distinct result.

INT-11: PART-05 shall provide `BatteryAttention` to CTRL-02 at the root boundary.

INT-12: PART-04 shall provide `ChargeDecision` to PART-06.

INT-13: PART-01 shall provide `BatteryEvidence` to PART-06 independently of INT-05 and INT-10 because flight-readiness evidence has a distinct consumer responsibility.

INT-14: PART-06 shall provide `BatteryReadinessEvidence` to CTRL-03 at the root boundary.

INT-AUDIT-01: The complete post-selection inventory is exactly fourteen semantic interactions, INT-01 through INT-14: four boundary inputs, seven inter-usage flows, and three boundary outputs. The three-way fan-out of `BatteryEvidence` is intentional because charge qualification, pilot attention, and flight-readiness evidence each consume the fact for a different owned derivation.

## Qualification, priority, and output partitions

QUAL-BATT-01: PART-01 shall implement the total mapping stated by PART-01 for all four `BatterySample` values. The three result fibers shall have sizes `2/1/1`: both invalid-status samples collapse to `InvalidBattery`, and the two valid indications remain distinct. Owner credit rests on the complete status-dependent collapse, not on valid-label renaming. This owner-local qualification equation is mandatory but is not an additional counted policy case.

QUAL-CTX-01: PART-02 shall implement the total ordered mapping stated by PART-02 for all sixteen `ChargerSample` and `FlightActivitySample` combinations, with invalidity taking precedence over the valid activity and availability classifications. The four result fibers shall have sizes `12/2/1/1`: twelve pairs collapse to `InvalidChargeContext`, two all-valid active-flight pairs collapse to `FlightActiveContext`, and the two remaining valid inactive pairs distinguish available from unavailable. This equation is mandatory but is not an additional counted policy case.

QUAL-INTENT-01: PART-03 shall implement the total mapping stated by PART-03 for all six `ChargeIntentSample` values. The four result fibers shall have sizes `3/1/1/1`: all invalid-status values collapse to `InvalidChargeIntent`, and the three valid intents remain distinct. Owner credit rests on the invalidity collapse rather than the valid enum correspondence. This equation is mandatory but is not an additional counted policy case.

ELIG-01: `chargingEligible` is true exactly when `BatteryEvidence = LowBatteryEvidence` and `ChargeContext = AvailableInactiveContext`; it is false for every other qualified pair. Eligibility is an owner-local predicate of PART-04 and shall not be implemented as a competing decision owner.

PRIORITY-01: PART-04 shall apply strict descending priority: any invalid qualified input; recovery gating; valid `EndCharge`; valid `BeginCharge` qualification; retained authorization under valid `NoIntent`; otherwise inactive inhibition. A higher-priority matching CASE shall exclude all lower cases in the same evaluation.

ADVISORY-01: PART-05 shall output `InputFault` when `ChargeDecision.disposition = InputFault`; otherwise `RecoveryPending` when disposition is `RecoveryPending`; otherwise `LowBattery` when `BatteryEvidence = LowBatteryEvidence`; otherwise `None`. This total exclusive expression is not a counted charge-policy case.

READINESS-01: PART-06 shall output `EvidenceUnavailable` when the decision disposition is `InputFault` or `RecoveryPending`; otherwise `BatteryNotReady` for `LowBatteryEvidence`; otherwise `BatteryReady` for `AdequateBatteryEvidence`. Invalid battery evidence cannot reach the last two branches because CASE-01 has priority.

LOCAL-CONTRACT-01: PART-04 shall keep `authorizationState`, `recoveryPhase`, ELIG-01, PRIORITY-01, and CASE-01 through CASE-12 in one owner-local contract; each effective case shall constrain both post-state variables, the complete `ChargeDecision`, and the separate authorization output. PART-05 and PART-06 shall consume the committed decision and battery evidence but shall not recompute authorization, eligibility, recovery, or state.

LOCAL-CONTRACT-02: PART-02, PART-05, and PART-06 shall use exhaustive mutually exclusive owner-local derivations over their admitted inputs. The end-to-end analyzer shall establish that `InvalidBattery` paired with a nonfault, nonrecovery decision is unreachable before the PART-06 producer-admissible partition is accepted; an omitted locally possible but globally unreachable combination shall not be silently counted as covered.

OUTPUT-01: For every selected CASE, CTRL-01 shall equal the committed next `authorizationState`, CTRL-02 shall equal ADVISORY-01 for the same evaluation, and CTRL-03 shall equal READINESS-01 for the same evaluation. No output may retain an older value or remain unconstrained after an evaluation.

## Exactly twelve ordered nontrivial contract cases

CASE-01: If `BatteryEvidence = InvalidBattery`, `ChargeContext = InvalidChargeContext`, or `QualifiedChargeIntent = InvalidChargeIntent`, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = AwaitNeutral`, and disposition is `InputFault`, regardless of all other current values or prior state.

CASE-02: Otherwise, if `recoveryPhase = AwaitNeutral` and the valid qualified intent is not `NoIntent`, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = AwaitNeutral`, and disposition is `RecoveryPending`. The sampled intent shall not be replayed or acted upon.

CASE-03: Otherwise, if `recoveryPhase = AwaitNeutral` and the valid qualified intent is `NoIntent`, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = AwaitFreshIntent`, and disposition is `RecoveryPending`. This neutral observation advances recovery but authorizes nothing.

CASE-04: Otherwise, if `recoveryPhase = AwaitFreshIntent` and the valid qualified intent is `NoIntent`, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = AwaitFreshIntent`, and disposition is `RecoveryPending`.

CASE-05: Otherwise, if `recoveryPhase = AwaitFreshIntent` and the valid qualified intent is `EndCharge`, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = Normal`, and disposition is `Inactive`. A fresh safe-ending intent completes recovery without authorizing charge.

CASE-06: Otherwise, if `recoveryPhase = AwaitFreshIntent`, the valid qualified intent is `BeginCharge`, and `chargingEligible` is true, then `nextAuthorization = PermitCharge`, `nextRecoveryPhase = Normal`, and disposition is `BeginAccepted`.

CASE-07: Otherwise, if `recoveryPhase = AwaitFreshIntent`, the valid qualified intent is `BeginCharge`, and `chargingEligible` is false, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = Normal`, and disposition is `BeginDenied`. The fresh intent is consumed but denied by current evidence.

CASE-08: Otherwise, if `recoveryPhase = Normal` and the valid qualified intent is `EndCharge`, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = Normal`, and disposition is `Inactive`, regardless of prior authorization or eligible evidence.

CASE-09: Otherwise, if `recoveryPhase = Normal`, the valid qualified intent is `BeginCharge`, and `chargingEligible` is true, then `nextAuthorization = PermitCharge`, `nextRecoveryPhase = Normal`, and disposition is `BeginAccepted`.

CASE-10: Otherwise, if `recoveryPhase = Normal`, the valid qualified intent is `BeginCharge`, and `chargingEligible` is false, then `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = Normal`, and disposition is `BeginDenied`.

CASE-11: Otherwise, if `recoveryPhase = Normal`, the valid qualified intent is `NoIntent`, prior `authorizationState = PermitCharge`, and `chargingEligible` is true, then `nextAuthorization = PermitCharge`, `nextRecoveryPhase = Normal`, and disposition is `Continued`.

CASE-12: Otherwise, for every remaining all-valid `Normal` and `NoIntent` combination, `nextAuthorization = InhibitCharge`, `nextRecoveryPhase = Normal`, and disposition is `Inactive`. This includes prior inhibition and automatic revocation after battery becomes adequate, charger becomes unavailable, or flight becomes active.

CASE-AUDIT-01: CASE-01 through CASE-12 are ordered, total, mutually exclusive, and owner-local to PART-04 over every finite combination of qualified inputs and STATE-01. They are exactly twelve counted nontrivial contract cases; qualification equations, eligibility, initialization, invariants, output derivations, type constraints, and scenario witnesses are mandatory but shall not be counted as additional cases.

## Nominal, boundary, fault, and recovery behavior

BEH-01: Under all-valid low-battery evidence, available charger context, inactive flight context, and `Normal` recovery, a valid `BeginCharge` shall select CASE-09; a following `NoIntent` with unchanged qualifying evidence shall select CASE-11; and `EndCharge` shall select CASE-08. Verification shall inspect owner-local contracts and bounded traces; pass requires `PermitCharge`, retained `PermitCharge`, and `InhibitCharge` in that order with exact attention and readiness outputs.

BEH-02: Under `Normal`, a valid `BeginCharge` with adequate battery, unavailable charger, or active flight shall select CASE-10, and any of those evidence changes during a retained permission with `NoIntent` shall select CASE-12 and revoke permission. Verification shall enumerate each single and combined unmet prerequisite; pass requires no `PermitCharge` result when ELIG-01 is false.

BEH-03: Valid `EndCharge` shall take priority over valid eligibility and prior permission through CASE-08, while any invalid input shall take priority over `EndCharge` through CASE-01. Verification shall include simultaneous boundary witnesses; pass requires CASE-01 for invalid-plus-`EndCharge` and CASE-08 for every all-valid `EndCharge` snapshot in `Normal`.

RISK-01: If invalid battery, charger, flight-activity, or charge-intent evidence were treated as trustworthy, the supervisor could issue an unjustified logical charging permission or readiness indication. The modeled consequence is an incoherent boundary decision, not an asserted physical accident, likelihood, or severity.

FAULT-01: On any single or combined invalid status, the system shall select CASE-01 in the same evaluation, output `InhibitCharge`, `InputFault`, and `EvidenceUnavailable`, and set `recoveryPhase = AwaitNeutral`. Verification shall enumerate every invalid-status combination; pass requires the stated same-evaluation state and outputs for all combinations.

RECOVERY-01: Following FAULT-01, restored valid inputs with a retained nonneutral intent shall select CASE-02; a valid `NoIntent` shall select CASE-03; later valid `NoIntent` shall select CASE-04; and only a later fresh valid `BeginCharge` or `EndCharge` may select CASE-05 through CASE-07 and return to `Normal`. Verification shall execute each ordered path; pass requires no permission before a qualifying fresh `BeginCharge` and no replay of the pre-neutral intent.

MODE-01: No external lifecycle or operational modes are declared. `recoveryPhase` is private decision state whose effect is already observable through CTRL-01 through CTRL-03; it shall not be modeled or counted as a drone lifecycle phase.

## Exactly five required scenario families

SCN-01: The nominal charging family shall start from INIT-01 with all-valid low-battery, available-charger, inactive-flight evidence; apply `BeginCharge`, `NoIntent`, and `EndCharge`; and witness CASE-09, CASE-11, and CASE-08 in order. Pass requires exact outputs on every step and no lifecycle output.

SCN-02: The eligibility-boundary family shall deny separate valid `BeginCharge` evaluations for adequate battery, unavailable charger, and active flight through CASE-10, then shall begin from permission and change each prerequisite separately under `NoIntent` to revoke through CASE-12. Pass requires each unmet prerequisite to block or revoke permission while maintaining valid nonfault attention semantics.

SCN-03: The invalid-input family shall inject invalid status independently for battery, charger, flight activity, and intent and then in all nonempty combinations. Pass requires CASE-01, same-evaluation inhibition, `InputFault`, `EvidenceUnavailable`, and `AwaitNeutral` for every witness.

SCN-04: The qualifying-recovery family shall enter CASE-01, retain the original `BeginCharge` to witness CASE-02, supply `NoIntent` to witness CASE-03 and again to witness CASE-04, then supply a fresh eligible `BeginCharge` to witness CASE-06. Pass requires no authorization before the final step and `Normal` plus `PermitCharge` only at the final step.

SCN-05: The nonauthorizing-recovery family shall separately reach `AwaitFreshIntent` and use fresh `EndCharge` to witness CASE-05, then reach it again and use an ineligible fresh `BeginCharge` to witness CASE-07; it shall also show a normal inhibited `NoIntent` witness for CASE-12. Pass requires recovery completion without charge permission in all three traces.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five scenario families with distinct traces: nominal start/retain/end, eligibility boundaries and revocation, invalid/fault coverage, qualifying fresh recovery, and nonauthorizing recovery. Together they witness all CASE-01 through CASE-12 and the required nominal, boundary, invalid/fault, and recovery categories.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing one `BatterySample` value and explicit validity status per logical evaluation. The selected `Low/Adequate` partition is a pilot abstraction needed for finite review and is not a source-grounded numeric threshold.

ASM-02: CTX-02 is responsible for the truth of charger availability and its status at the boundary. `Available` means only logically available for qualification and does not guarantee connection or energy transfer.

ASM-03: CTX-03 is responsible for flight-activity evidence and status. `Inactive` is a selected prerequisite for charging permission; this is pilot policy, not a claim derived from flight physics or the source lifecycle transition rules.

ASM-04: CTX-04 is responsible for presenting `NoIntent` between a previously sampled nonneutral intent and a fresh post-fault intent. The source supplies charging-event vocabulary but neither this external entity nor freshness semantics.

ASM-05: All external contexts are responsible for keeping their finite values stable for one logical evaluation. This assumption supports deterministic snapshot semantics and makes no real-time duration claim.

CONSTR-01: The model shall contain exactly one explicit root system usage, exactly six responsibility-bearing semantic usages, exactly fourteen typed directed semantic interactions, exactly twelve owner-local nontrivial contract cases, exactly five scenario families, semantic containment depth from one through two beneath the root, and exactly one weakly connected semantic region.

CONSTR-02: Structural counts shall exclude context actors, the root, types, ports, generated-support containers and routes, initialization, equations, invariants, analyzers, and scenario witnesses. No excluded element may receive semantic, interaction, case, or owner credit.

CONSTR-03: Canonical source shall use the repository SysML-AADL library and the trusted SysML/GUMBO subset, contain exactly one principal decision owner, and preserve all boundary types and owner-local responsibilities without introducing lifecycle state or output.

SUPPORT-01: Generated source may add exactly one behavior-free `Process` usage at semantic depth 1 under the sole root `System`, with PART-01 through PART-06 realized as six sibling contract-bearing `Thread` usages at semantic depth 2. The Process, its boundary ports, library-mandated declarations, and routing artifacts are generated support and shall receive no semantic-usage, owner, case, scenario, or interaction credit.

SUPPORT-02: INT-01 through INT-04, INT-08, INT-11, and INT-14 may each use two delegation hops, one between System and Process and one between Process and Thread, for fourteen generated-support `PortConnection` declarations. INT-05 through INT-07, INT-09, INT-10, INT-12, and INT-13 shall each use one direct sibling-Thread connection, for seven declarations. The exact allowed raw connection count is therefore twenty-one while the semantic-interaction count remains exactly fourteen; every delegation declaration shall carry its corresponding INT trace and a generated-support justification.

## Required evidence, objective pass criteria, and resolved Model constraints

ANALYSIS-01: The Model Agent shall retain a deterministic bounded analyzer over exactly 288 qualified-input and owner-state snapshots, calculated as `3 BatteryEvidence × 4 ChargeContext × 4 QualifiedChargeIntent × 2 authorizationState × 3 recoveryPhase`. It shall apply the ordered cases and independently check both next-state fields, the complete `ChargeDecision`, all three root outputs, initialization, INVAR-01, FRESH-01, and scenario sequences against the retained source revision.

ANALYSIS-02: Analyzer acceptance requires zero uncovered effective selections, zero multiple effective selections after ordered priority, zero next-state mismatches, zero decision or root-output mismatches, and at least one reachable witness for every CASE-01 through CASE-12. It shall report raw guard overlaps separately from effective ordered selection, calculate reachable owner states, exercise the PART-01 and PART-03 invalid-status collapses, enumerate all invalid-status combinations at the raw boundary, and replay SCN-01 through SCN-05. The analyzer is conformance evidence, not a second production decision owner, temporal proof, compositional proof, or formal proof.

TRACE-01: Every actionable abstract identifier shall trace to at least one generated model element or explicit informational/deferred disposition, and every significant generated element shall trace back or carry a specific `@generated-support` justification. Pass requires zero missing abstract IDs and zero unexplained generated elements.

PASS-01: Structural acceptance passes only when the retained evidence reports the exact `6/14/12/5` semantic tuple, one root, semantic depth `1..2`, one weak semantic region, one principal owner, and no padded or untraced usage or interaction.

PASS-02: Behavioral acceptance passes only when CASE-01 through CASE-12 are complete, exclusive after priority, reachable by witnesses, local to PART-04, and constrain both next state variables plus all controlled outputs through OUTPUT-01.

PASS-03: Fault and recovery acceptance passes only when every single and combined invalid-status snapshot immediately inhibits charge with `InputFault` and unavailable readiness evidence, and SCN-04 and SCN-05 prove that a pre-neutral intent cannot authorize charge.

PASS-04: Ownership acceptance passes only when PART-04 is the sole principal decision and state owner; PART-01 through PART-03 and PART-05 through PART-06 each derive the stated meaningful local fact; and no central recomputation, competing eligibility owner, or identity-wrapper credit is found.

PASS-05: Mechanical verification requires architecture-stage, final, and independent harness `hamr sysml tipe` success; resolved compatible endpoints; complete trace coverage; exact metric results; and successful bounded analysis. Any check not run shall be reported `not-run`, never passed.

PASS-06: Designer validation separately passes only if the model remains faithful to NEED-01, the exact battery/charging boundary, all five scenarios, the source limitations, and DEFER-01, while demonstrably avoiding owned or emitted lifecycle state.

PASS-07: Visualization acceptance requires exactly one native-resolution `system-overview` bound to the accepted source revision, showing the root, all six semantic usages, seven boundary quantities, PART-04 as sole principal owner, and all fourteen directed semantic flows without counting context or generated support as semantic structure.

QUESTION-01: Resolved as realizable but not yet verified: the generated source shall express PART-04's two finite owner-local state variables, explicit initialization, pre-state guards, and same-evaluation post-state, decision, and authorization constraints for all twelve cases without duplicating the decision in another usage.

QUESTION-02: Resolved by the exact SUPPORT-01 and SUPPORT-02 allowance: one behavior-free Process, six sibling Threads, and twenty-one raw connections shall realize INT-01 through INT-14 at semantic depth `1..2` while preserving exactly fourteen semantic interactions.

QUESTION-03: Resolved as realizable but not yet verified: owner-local contracts shall express PART-02's joint invalidity/activity/availability classification and the PART-05 and PART-06 two-input derivations without an unsupported construct, central recomputation, or second policy owner.

## Diversity and final design audit

DIVERSITY-01: The selected primary controlled purpose is battery awareness and charge qualification. Unlike the closest replicate-1 lifecycle-governor baseline, this system consumes no lifecycle request, owns no `Off/Standby/Charging/Ready/Flying` state, emits no lifecycle or enablement state, and organizes its contract partition around charge intent, charging eligibility, authorization retention, and evidence recovery.

DIVERSITY-02: The boundary differs by monitoring charger availability and flight activity specifically as charge-eligibility evidence and by controlling charge authorization plus battery-readiness evidence rather than phase and lifecycle permissions. State ownership differs because PART-04 owns only `authorizationState` and `recoveryPhase`. Interaction topology differs because three qualification paths converge on a charge owner and then branch to pilot-attention and readiness-evidence derivations. Priority differs because invalid evidence and recovery precede end/begin/no-intent charging policy rather than phase-transition or `SwitchOff` arbitration.

DIVERSITY-03: This is not an extension, subset partition, or rename of the lifecycle baseline: adding it to that baseline would require a new cross-boundary allocation decision about which authority consumes charge authorization, whereas this abstract deliberately ends at a battery/charging evidence boundary and cannot reconstruct any lifecycle phase from its state or outputs.

AUDIT-FINAL-01: The Designer-approved final architecture contains exactly six semantic usages, fourteen typed directed semantic interactions, twelve nontrivial contract cases, five scenario families, one explicit root, semantic depth `1..2`, one weak semantic region, and one principal decision owner. Its allowed realization contains one uncounted behavior-free Process and exactly twenty-one raw connections: fourteen boundary-delegation hops plus seven direct semantic sibling connections. Every counted item has a distinct responsibility or trace.

AUDIT-FINAL-02: PART-04 owns both persistent state variables, strict priority, and all twelve cases; every state, decision, case, finite input partition, controlled output, and scenario has exactly one stated owner or responsible context. The ordered partition includes nominal start/retain/end, all eligibility boundaries, individual and combined invalidity, retained nonneutral recovery, neutral recovery, awaiting-fresh recovery, qualifying fresh intent, nonqualifying fresh intent, and safe-ending fresh intent.

AUTH-FINAL-01: Model generation is authorized only from this Designer-approved baseline and `design-selection.md`. Generation shall preserve the exact architecture metrics, owner-local contracts, bounded end-to-end obligations, generated-support limits, and DEFER-01 claim boundary; any incompatibility shall return a diagnostic to this retained run rather than weaken the policy or substitute a new seed.
