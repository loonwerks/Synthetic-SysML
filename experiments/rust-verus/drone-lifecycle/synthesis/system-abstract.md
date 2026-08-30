---
abstract_id: DRONE-LIFECYCLE-POC-SA-01
run_id: 20260813T151848Z-drone-lifecycle-rust-verus-poc
domain_seed: drone-logical-domain-20260812t143051z
complexity: small
semantic_usage_count: 5
semantic_interaction_count: 11
nontrivial_contract_case_count: 11
scenario_family_count: 5
root_system_usage_count: 1
generated_support_process_count: 1
raw_port_connection_count: 17
boundary_delegation_connection_count: 12
internal_port_connection_count: 5
physical_containment_depth: 2
semantic_containment_depth: [1, 2]
weakly_connected_semantic_regions: 1
principal_decision_owner_count: 1
persistent_state_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
designer_resolution_status: approved
model_generation_authorized: true
---

# Battery- and Charge-Aware Drone Lifecycle Governor

## Synopsis, need, purpose, and goals

NEED-01: A configurable unmanned drone needs a bounded logical authority that turns lifecycle requests, qualitative battery evidence, and charger-connection evidence into one coherent commanded lifecycle phase, logical enablement command, and pilot-visible notice. The need is command governance, not evidence that a physical drone reaches or sustains a commanded condition.

PURPOSE-01: The Battery- and Charge-Aware Drone Lifecycle Governor will govern the source-named `Off`, `Standby`, `Charging`, `Ready`, and `Flying` lifecycle vocabulary for one logical drone. It will admit only the finite transitions declared here, apply selected battery and charger preconditions, command `Off` after invalid boundary evidence, and require neutral recovery before accepting a later fresh request.

GOAL-01: The system shall select exactly one next commanded phase and a coherent logical enablement command for every finite boundary-input and owner-state combination.

GOAL-02: The system shall distinguish invalid evidence, unavailable charging context, low battery evidence, and other rejected requests in a finite pilot notice without inventing physical thresholds or performance outcomes.

GOAL-03: The system shall prevent a request present during invalid-input recovery from being replayed as an operational transition until one valid neutral sample has cleared recovery and a later nonneutral request arrives.

GOAL-04: The system should remain small enough for exhaustive bounded analysis, responsibility-ownership review, complete trace audit, and one readable system overview.

## Evidence and claim classification

METHOD-01: Handbook-derived method requires an implementation-independent need and boundary before parts, explicit assumptions and responsibility, nominal and off-nominal scenarios, comparison of alternatives, bidirectional traceability, measurable bounds, and separate verification and validation. These are method obligations, not facts about drones.

FACT-SRC-01: The frozen seed grounds a configurable-drone domain; the lifecycle words `Off`, `Standby`, `Charging`, `Ready`, and `Flying`; switching, charging, activation, deactivation, and flight event vocabulary; qualitative battery indication and checking; low-battery notification toward flight control; a pilot monitoring remaining charge; and charger and communication contexts.

FACT-SRC-02: The frozen seed does not name lifecycle-event initiators, assign command authority, define transition policy or priorities, establish physical success criteria, or provide a consistent engine-count premise. The forest-fire-observation label does not establish fire detection, mapping, dispatch, suppression, autonomous mission behavior, landing, or return-to-home behavior.

ABS-PILOT-01: This System Abstract selects the lifecycle-governor candidate scope. The external request source, finite value domains, charger observation, transition guards, priorities, invalid-input response, recovery protocol, contracts, and scenarios are pilot abstractions selected here; none is asserted as a source-grounded drone property.

ARCH-SEL-01: The selected architecture separates request qualification and battery assessment from one exclusive stateful Lifecycle Governor, then separates lifecycle enablement and pilot-notice derivations. This is the selected responsibility allocation, not a handbook prescription or source fact.

DEFER-01: Physical flight dynamics, achieved flight or charging state, battery discharge or charging behavior, real timing, navigation, radio protocol, camera and obstacle sensing, landing gear, engine count, landing, return-to-home, forest-fire mission functions, hazard likelihood or severity, safety, certification, deployment, code generation, executable application behavior, GUMBO execution as an analyzer oracle, unbounded proof, and production readiness are deferred and shall not be reported as passed.

## Operational context and exact system boundary

CTX-01: The Lifecycle Request Source is outside the system and provides one request/status sample per logical evaluation. The source corpus does not name this entity; introducing it is a pilot abstraction and does not assign request authority to the pilot.

CTX-02: The Battery Management Context is outside the system and provides one qualitative battery/status sample per logical evaluation. The system neither measures charge nor infers endurance.

CTX-03: The Charger Context is outside the system and provides one connection/status sample per logical evaluation. It receives no charger-control command, and a connected indication does not mean that charging physically begins or succeeds.

CTX-04: The Drone Lifecycle Enactor is outside the system and receives one logical enablement command. Delivery is observable at the boundary; physical execution, completion, and feedback are outside scope.

CTX-05: The Pilot is outside the system and receives the commanded phase and current notice for monitoring. The seed supports only this monitoring role; this design does not infer that the pilot originates lifecycle requests.

MON-01: `LifecycleRequestSample` is a finite root input from CTX-01 with `request : LifecycleRequest` and `status : InputStatus`. `LifecycleRequest` is exactly `{NoRequest, SwitchOn, SwitchOff, BeginCharge, EndCharge, Activate, BeginFlight, EndFlight}` and `InputStatus` is exactly `{Valid, Invalid}`. Source-named `Deactivate` is deliberately omitted from this selected small scope; `SwitchOff` supplies its bounded shutdown path.

MON-02: `BatterySample` is a finite root input from CTX-02 with `indication : BatteryIndication` and `status : InputStatus`. `BatteryIndication` is exactly `{Adequate, Low}`; the values are qualitative pilot abstractions with no numeric unit, threshold, accuracy, or endurance claim.

MON-03: `ChargeConnectionSample` is a finite root input from CTX-03 with `connection : ChargeConnection` and `status : InputStatus`. `ChargeConnection` is exactly `{Connected, Disconnected}` and denotes only supplied logical availability evidence.

CTRL-01: `LifecycleEnablement` is a finite root output to CTX-04 with `power : PowerPermission`, `chargingPermitted : Boolean`, and `flightPermitted : Boolean`. `PowerPermission` is exactly `{Disabled, StandbyEnabled, OperationalEnabled}`. These fields are logical commands, not achieved physical states.

CTRL-02: `CommandedPhaseReport` is a finite root output to CTX-05 with exactly the `LifecyclePhase` values `{Off, Standby, Charging, Ready, Flying}` and reports the phase committed by the current logical evaluation.

CTRL-03: `PilotNotice` is a finite root output to CTX-05 with exactly `{None, LowBattery, ChargerUnavailable, RequestRejected, InputFault, RecoveryAwaitingNeutral}`. It is an informational priority result and implies neither a safety classification nor an external response.

BOUND-01: The complete root boundary is exactly MON-01, MON-02, MON-03, CTRL-01, CTRL-02, and CTRL-03. Navigation, sensing, radio, landing gear, engine, charger-control, achieved-state feedback, physical performance, and forest-fire mission interfaces are outside this small scope.

## Logical evaluation and persistent state

SEM-01: One logical evaluation consumes the current values of MON-01 through MON-03 and the owner-local pre-state, selects exactly one ordered CASE-01 through CASE-11, atomically commits the next state, and publishes all three controlled outputs. A logical evaluation is a deterministic experiment abstraction and makes no scheduler, latency, or physical timing claim.

STATE-01: `currentPhase : LifecyclePhase` and `recoveryRequired : Boolean` are the only persistent domain-state variables. PART-03 exclusively owns both; no other usage may store, select, recompute, override, or publish an alternative lifecycle state.

INIT-01: Initial state shall be `currentPhase = Off` and `recoveryRequired = false`. Initial CTRL-02 shall be `Off`, initial CTRL-01 shall be `{Disabled, false, false}`, and initial CTRL-03 shall be `None`.

INVAR-01: Every reachable state shall satisfy `recoveryRequired implies currentPhase = Off`. Invalid-input and blocked-recovery cases establish or preserve the implication, neutral recovery clears it while holding `Off`, and every normal case preserves `recoveryRequired = false`.

FRESH-01: After invalid input, a request is fresh only if one all-valid evaluation with `QualifiedRequest = NoRequest` has selected CASE-03 and a later evaluation supplies an all-valid non-`NoRequest` request. Restored validity while a nonneutral request remains present shall select CASE-02 and shall not operate the lifecycle.

## Semantic usages, responsibilities, and local-contract expectations

PART-01: Request Qualification shall derive one `QualifiedRequest` from both fields of MON-01. It owns no state or transition decision. Its owner-local result is `InvalidRequest` for any invalid-status sample and otherwise exactly the corresponding one of the eight request values, including `NoRequest`.

PART-02: Battery Evidence Assessment shall derive one `BatteryEvidence` from both fields of MON-02. It owns no state or transition decision. Its owner-local result is exactly one of `{InvalidBattery, AdequateBattery, LowBattery}`.

PART-03: Lifecycle Governor is the sole principal decision owner and exclusive state owner. It shall qualify MON-03 as one of `{InvalidChargeContext, ChargeAvailable, ChargeUnavailable}`, apply PRIORITY-01, select exactly one CASE-01 through CASE-11, update STATE-01, and derive `SelectedPhase` and `DecisionDisposition`. Every counted principal contract case is owner-local to PART-03.

PART-04: Enablement Derivation shall derive CTRL-01 from `SelectedPhase` using ENABLE-01. It owns no state or lifecycle decision and earns semantic credit through a total many-to-one, multi-field command derivation rather than copying or renaming phase.

PART-05: Pilot Notice Derivation shall derive CTRL-03 from `DecisionDisposition` and `BatteryEvidence` using NOTICE-01. It owns no lifecycle state or transition decision and earns semantic credit through a total ordered multi-input priority result rather than forwarding a status.

OWNER-01: The complete ownership audit shall name PART-03 as the sole principal decision owner, sole persistent-state owner, charger-context qualification owner, and owner of all eleven cases; PART-01 and PART-02 as stateless qualification owners; PART-04 as enablement-command owner; and PART-05 as pilot-notice owner. Each usage shall expose an owner-local contract for its declared derivation, and no support or analyzer element may receive semantic or owner credit.

CONTRACT-LOCAL-01: PART-01 and PART-02 shall expose their validity-aware classifications; PART-03 alone shall expose charge qualification, initialization, both persistent variables, pre-state guards, strict case selection, state transition, selected phase, and disposition; PART-04 shall expose the complete three-field ENABLE-01 relation; and PART-05 shall expose NOTICE-01. All record fields inspected by contracts shall be declared as attributes. The root and support Process shall provide typed routing only and shall not restate, centralize, or recompute an owner-local equation.

CONTRACT-LOCAL-02: Generation may realize PART-03 with owner-local `state`, explicit initialization, `In(...)` pre-state references, multi-output guarantees, and mutually exclusive case guards that encode PRIORITY-01. Textual case order shall not be the only representation of priority, and every case shall constrain both post-state variables, `SelectedPhase`, `CommandedPhaseReport`, and every `DecisionDisposition` field in the same evaluation.

OWNER-AUDIT-02: Owner credit requires the following extensional evidence: PART-01 maps 16 request/status samples to nine results; PART-02 maps four indication/status samples to three results; PART-03 combines qualified request, battery evidence, charge qualification, and two pre-state variables; PART-04 derives three independently meaningful command fields whose individual relations classify five phases into three or two results; and PART-05 maps 48 disposition/battery combinations to six notices. A support route, identity wrapper, enum rename, copied bundle, or analyzer relation receives no owner credit.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary shall provide `LifecycleRequestSample` from MON-01 to PART-01.

INT-02: PART-01 shall provide `QualifiedRequest` to PART-03 for lifecycle case selection.

INT-03: The root boundary shall provide `BatterySample` from MON-02 to PART-02.

INT-04: PART-02 shall provide `BatteryEvidence` to PART-03 for invalid-input priority and transition admissibility.

INT-05: PART-02 shall independently provide `BatteryEvidence` to PART-05 for low-battery notice derivation.

INT-06: The root boundary shall provide `ChargeConnectionSample` from MON-03 to PART-03 for owner-local charge-context qualification and lifecycle case selection.

INT-07: PART-03 shall provide `SelectedPhase` to PART-04 for enablement derivation.

INT-08: PART-03 shall provide `DecisionDisposition` to PART-05 for notice priority. `DecisionDisposition` is exactly `inputFaultDetected : Boolean`, `recoveryPending : Boolean`, and `rejectionReason : RejectionReason`, where `RejectionReason` is exactly `{NoRejection, Inapplicable, BatteryInsufficient, ChargerUnavailable}`.

INT-09: PART-04 shall provide `LifecycleEnablement` to CTRL-01 at the root boundary.

INT-10: PART-03 shall provide `CommandedPhaseReport` to CTRL-02 at the root boundary from the same committed `SelectedPhase` supplied on INT-07.

INT-11: PART-05 shall provide `PilotNotice` to CTRL-03 at the root boundary.

INT-AUDIT-01: The complete post-selection inventory is exactly eleven typed directed semantic interactions, INT-01 through INT-11: three boundary-input flows, five inter-usage flows, and three boundary-output flows. INT-05 is a purposeful fan-out to a distinct consumer derivation; no interaction exists only to reach a tier bound.

RAW-MAP-01: Generation shall realize INT-01 through INT-11 with raw `PortConnection` declaration counts `{INT-01: 2, INT-02: 1, INT-03: 2, INT-04: 1, INT-05: 1, INT-06: 2, INT-07: 1, INT-08: 1, INT-09: 2, INT-10: 2, INT-11: 2}`. The total is exactly 17: twelve boundary-delegation declarations for the six boundary interactions and five internal declarations for the five inter-usage interactions. This physical mapping does not add or split a semantic interaction.

## Qualification, priority, and output partitions

QUAL-REQ-01: PART-01 shall produce `InvalidRequest` for all eight request values paired with `InputStatus.Invalid`; with `InputStatus.Valid`, it shall preserve the request's domain meaning as one qualified request. This total two-field qualification is not a principal lifecycle case.

QUAL-BATT-01: PART-02 shall produce `InvalidBattery` for either indication paired with `InputStatus.Invalid`; with `InputStatus.Valid`, it shall produce `AdequateBattery` or `LowBattery` according to the indication. This total two-field qualification is not a principal lifecycle case.

QUAL-CHARGE-01: PART-03 shall derive `InvalidChargeContext` for either connection paired with `InputStatus.Invalid`; with `InputStatus.Valid`, it shall derive `ChargeAvailable` for `Connected` and `ChargeUnavailable` for `Disconnected`. This owner-local input fact participates in the principal decision but is not counted as an additional lifecycle case.

PRIORITY-01: PART-03 shall apply strict descending priority: any invalid qualified input; recovery gating; valid `SwitchOff`; one specifically enabled lifecycle transition; otherwise hold. A higher-priority true condition excludes all lower-priority cases in the same evaluation.

ENABLE-01: PART-04 shall map `Off` to `{Disabled, false, false}`, `Standby` to `{StandbyEnabled, false, false}`, `Charging` to `{OperationalEnabled, true, false}`, `Ready` to `{OperationalEnabled, false, false}`, and `Flying` to `{OperationalEnabled, false, true}`. This total multi-field equation is mandatory but is not an additional principal case.

NOTICE-01: PART-05 shall output `InputFault` if `inputFaultDetected`; otherwise `RecoveryAwaitingNeutral` if `recoveryPending`; otherwise `ChargerUnavailable` if `rejectionReason = ChargerUnavailable`; otherwise `LowBattery` if `BatteryEvidence = LowBattery`; otherwise `RequestRejected` if `rejectionReason != NoRejection`; otherwise `None`. This ordered total equation is mandatory but is not an additional principal case.

OUTPUT-01: For every selected case, CTRL-02 shall equal the committed `nextPhase`, CTRL-01 shall equal ENABLE-01 applied to that same `nextPhase`, and CTRL-03 shall equal NOTICE-01 over the current owner-local facts. No controlled output may retain an older value or remain unconstrained.

## Exactly eleven ordered nontrivial principal contract cases

CASE-01: If `QualifiedRequest = InvalidRequest`, `BatteryEvidence = InvalidBattery`, or charge context is `InvalidChargeContext`, then `nextPhase = Off`, `nextRecoveryRequired = true`, and `DecisionDisposition = {true, true, NoRejection}` regardless of all other inputs or pre-state.

CASE-02: Otherwise, if `recoveryRequired = true` and `QualifiedRequest != NoRequest`, then `nextPhase = Off`, `nextRecoveryRequired = true`, and `DecisionDisposition = {false, true, Inapplicable}`. The present request shall not be replayed or acted upon.

CASE-03: Otherwise, if `recoveryRequired = true` and `QualifiedRequest = NoRequest`, then `nextPhase = Off`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}`. Neutral observation clears recovery without an operational transition.

CASE-04: Otherwise, if `QualifiedRequest = SwitchOff`, then `nextPhase = Off`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}` from every current phase and for either valid battery or charger value.

CASE-05: Otherwise, if `currentPhase = Off` and `QualifiedRequest = SwitchOn`, then `nextPhase = Standby`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}`.

CASE-06: Otherwise, if `currentPhase = Standby`, `QualifiedRequest = BeginCharge`, `BatteryEvidence = LowBattery`, and charge context is `ChargeAvailable`, then `nextPhase = Charging`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}`.

CASE-07: Otherwise, if `currentPhase = Charging` and `QualifiedRequest = EndCharge`, then `nextPhase = Standby`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}`. This command transition makes no claim that physical charging completed.

CASE-08: Otherwise, if `currentPhase = Standby`, `QualifiedRequest = Activate`, and `BatteryEvidence = AdequateBattery`, then `nextPhase = Ready`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}`.

CASE-09: Otherwise, if `currentPhase = Ready`, `QualifiedRequest = BeginFlight`, and `BatteryEvidence = AdequateBattery`, then `nextPhase = Flying`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}`. `BeginFlight` means only entry to commanded `Flying`.

CASE-10: Otherwise, if `currentPhase = Flying` and `QualifiedRequest = EndFlight`, then `nextPhase = Ready`, `nextRecoveryRequired = false`, and `DecisionDisposition = {false, false, NoRejection}`. `EndFlight` means only departure from commanded `Flying` and does not assert landing.

CASE-11: Otherwise, for every remaining all-valid, nonrecovery combination, `nextPhase = currentPhase` and `nextRecoveryRequired = false`. `rejectionReason` shall be `NoRejection` for `NoRequest`; otherwise `ChargerUnavailable` for `BeginCharge` with unavailable charge context; otherwise `BatteryInsufficient` for `Activate` or `BeginFlight` with `LowBattery`; otherwise `Inapplicable`. Both disposition booleans shall be false.

CASE-AUDIT-01: CASE-01 through CASE-11 are ordered, total, and mutually exclusive over every finite owner input and pre-state. They are exactly eleven counted nontrivial cases. Qualification equations, initialization, invariants, enablement and notice equations, type well-formedness, scenario witnesses, and analyzer assertions are mandatory obligations but shall not be duplicated or relabeled as counted cases.

CASE-AUDIT-02: Exhaustive static recount over the 2,560 snapshots yields expected effective witness counts `{CASE-01: 2240, CASE-02: 140, CASE-03: 20, CASE-04: 20, CASE-05: 4, CASE-06: 1, CASE-07: 4, CASE-08: 2, CASE-09: 2, CASE-10: 4, CASE-11: 123}`. These counts sum to 2,560 and make every case nonempty; the retained analyzer shall independently reproduce them rather than consume them as its decision oracle.

## Required behavior, risk, fault response, and recovery

BEH-01: Under all-valid inputs with recovery clear, the system shall select CASE-04 through CASE-10 exactly when their guards hold and otherwise shall select CASE-11. Verification is contract and bounded-analysis inspection; pass requires one selected case, the specified next state and disposition, and all outputs constrained for every all-valid snapshot.

BEH-02: A valid `SwitchOff` shall command `Off` from every phase ahead of all transition eligibility conditions. Verification is exhaustive analysis; pass requires every all-valid, nonrecovery `SwitchOff` snapshot to select CASE-04 and publish disabled enablement.

BEH-03: Requests that are wrong for the current phase or fail a declared battery or charger precondition shall hold the phase and produce CASE-11's exact rejection reason. Verification is exhaustive analysis; pass requires zero unintended transitions and correct notices for all such boundary snapshots.

RISK-01: If an invalid request, battery indication, or charge-context sample were treated as trustworthy, the governor could publish an unintended lifecycle and enablement command; the consequence within this logical boundary would be an unsupported operational command. No likelihood, severity, or physical safety claim is assigned.

FAULT-01: On any individual or combined invalid input status, the system shall select CASE-01 in that same logical evaluation, commit `Off`, set recovery, publish disabled enablement, and publish `InputFault`. Verification is exhaustive contract analysis; pass requires this exact result for every snapshot containing at least one invalid status.

RECOVERY-01: While recovery is set, an all-valid nonneutral request shall select CASE-02 and remain blocked; an all-valid `NoRequest` shall select CASE-03 and clear recovery while remaining `Off`; only a later all-valid nonneutral request may select a normal case. Verification is bounded sequence analysis; pass requires SCN-05 and all analyzer-generated recovery variants to prevent replay and allow later fresh operation.

## Externally distinguishable modes and transitions

MODE-01: The externally distinguishable modes are exactly the five commanded lifecycle phases because CTRL-02 and CTRL-01 differ observably among them. `recoveryRequired` is internal protocol state, reported through CTRL-03, and is not a sixth lifecycle phase.

TRANS-01: The allowed phase-changing transitions are exactly `Off -> Standby` by CASE-05, `Standby -> Charging` by CASE-06, `Charging -> Standby` by CASE-07, `Standby -> Ready` by CASE-08, `Ready -> Flying` by CASE-09, `Flying -> Ready` by CASE-10, and `any phase -> Off` by CASE-01 or CASE-04. CASE-02, CASE-03, and CASE-11 hold phase except that CASE-02 and CASE-03 already operate from the recovery invariant's `Off` state.

## Bounded public scenario families

SCN-BASE-01: Unless a step says otherwise, each scenario supplies all statuses as `Valid`, battery as `Adequate`, charger as `Disconnected`, and request as `NoRequest`. Each step denotes one boundary evaluation and states boundary outcomes, not internal calls.

SCN-01: The nominal flight-lifecycle family shall start at INIT-01 and apply `SwitchOn`, `Activate`, `BeginFlight`, `EndFlight`, then `SwitchOff`. The reported phases shall be `Standby`, `Ready`, `Flying`, `Ready`, then `Off`; enablement shall match ENABLE-01 at every step; notices shall be `None`.

SCN-02: The charging-boundary family shall enter `Standby`, apply `BeginCharge` with `Low` and `Connected` to reach `Charging`, apply `EndCharge` to return to `Standby`, then apply `BeginCharge` with `Low` and `Disconnected`. The last step shall hold `Standby`, disallow charging, and publish `ChargerUnavailable`.

SCN-03: The battery-admissibility and shutdown family shall enter `Standby`, reject `Activate` with `Low` while publishing `LowBattery`, accept a later `Activate` with `Adequate`, reject `BeginFlight` with `Low` while holding `Ready` and publishing `LowBattery`, and then accept `SwitchOff` with `Low` by commanding `Off` with disabled enablement.

SCN-04: The invalid-input family shall include request-invalid, battery-invalid, charge-context-invalid, and all-three-invalid variants from at least one non-`Off` phase. Every variant shall command `Off`, disabled enablement, `InputFault`, and recovery in the same evaluation, independent of request values.

SCN-05: The recovery and fresh-request family shall trigger CASE-01 with an invalid `SwitchOn`, then supply an all-valid `SwitchOn`, an all-valid `NoRequest`, and a later all-valid `SwitchOn`. The reported phases shall be `Off`, `Off`, `Off`, then `Standby`; the first valid `SwitchOn` shall remain blocked, the neutral step shall clear recovery without operating, and only the later request shall enter `Standby`.

SCN-AUDIT-01: The five scenario families have distinct behavioral traces: nominal flight lifecycle, charger-availability boundary, battery eligibility plus shutdown priority, invalid/fault entry, and neutral-then-fresh recovery. No family exists only to meet a count.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for supplying exactly one request and explicit validity status per logical evaluation. The system assumes neither request authorization nor physical event completion; the assumption is required to make request qualification total.

ASM-02: CTX-02 is responsible for pairing every qualitative battery indication with an explicit validity status. `Adequate` and `Low` are mutually exclusive supplied labels; the design does not define, calibrate, or validate their physical meaning.

ASM-03: CTX-03 is responsible for pairing every charger-connection indication with an explicit validity status. `Connected` means only logical charge availability for CASE-06; it establishes neither electrical compatibility nor current flow.

ASM-04: CTX-04 is responsible only for accepting CTRL-01 as a logical command interface. Because the governor receives no achievement feedback, a commanded phase shall never be described as achieved flight, completed charge, landing, or physical power state.

ASM-05: CTX-05 is responsible only for receiving CTRL-02 and CTRL-03. Pilot monitoring does not imply command authorship or any required external action on a notice.

CONSTRAINT-01: The model shall use finite domains exactly matching MON-01 through MON-03, CTRL-01 through CTRL-03, `QualifiedRequest`, `BatteryEvidence`, the owner-local charge-context fact, and `DecisionDisposition`. Numeric battery, timing, physical performance, safety classification, and engine-count properties shall not become requirement premises.

CONSTRAINT-02: `BeginFlight` and `EndFlight` mean only requests to enter and leave commanded `Flying`; `BeginCharge` and `EndCharge` mean only requests to enter and leave commanded `Charging`. These meanings and the omission of `Deactivate` are declared small-scope abstractions, not recovered source policy.

## Final architecture, generated-support, trace, and analysis obligations

STRUCT-01: The final architecture shall contain exactly one explicit root System, exactly five reachable responsibility-bearing semantic Thread usages realizing PART-01 through PART-05, exactly eleven typed directed semantic interactions realizing INT-01 through INT-11, exactly eleven nontrivial principal cases, exactly five scenario families, semantic containment depth within `1..2`, exactly one weakly connected semantic region, exactly one principal decision owner, and exactly one persistent-state owner.

STRUCT-02: The five semantic Threads shall be physically contained in exactly one behavior-free generated-support Process beneath the sole root, giving physical containment depth exactly two. The root, support Process, context actors, type definitions, visualization-only nodes, routing, and analysis fixtures do not count as semantic usages.

SUPPORT-01: The generated-support allowance is exactly one behavior-free Process and the twelve boundary-delegation `PortConnection` declarations in RAW-MAP-01. Every delegation shall carry `@generated-support` with its realizing INT identifier. Support may provide containment and typed routing only; it shall not own state, contracts, cases, decisions, semantic usage credit, interaction credit, or analyzer credit, and it shall not change an interaction's semantic endpoints, direction, type, or meaning.

STRUCT-03: Every PART usage shall own the distinct local derivation stated in its clause and participate in at least one inventoried interaction. A wrapper that only copies, bundles, renames, bijectively translates, or reroutes a value shall fail semantic-usage and owner credit rather than satisfy the tier count.

TRACE-01: Every actionable abstract identifier shall trace to one or more retained model elements, contracts, analyzer checks, or scenario witnesses. Every significant component, port, connection, state variable, and contract clause shall trace to an abstract identifier or carry a specific `@generated-support <reason>` justification. Missing abstract coverage, unexplained additions, or identifier reuse shall fail acceptance.

ANALYSIS-01: A deterministic bounded analyzer shall enumerate all `5 * 2 * 8 * 2 * 2 * 2 * 2 * 2 = 2560` combinations of current phase, recovery flag, request value, request status, battery indication, battery status, charger connection, and charger status.

ANALYSIS-02: For every snapshot, the analyzer shall independently evaluate an abstract reference relation and a composition of the PART-01 through PART-05 owner-local relations, then compare selected case, next phase, next recovery state, disposition, commanded phase report, enablement, and notice. Neither relation may call, import, or copy the generated architectural decision predicate as its oracle.

ANALYSIS-03: Analyzer evidence shall report zero case gaps, zero effective overlaps after ordered priority, zero next-state mismatches, zero disposition mismatches, zero output mismatches, and the independent case-witness counts required by CASE-AUDIT-02. It shall separately execute SCN-01 through SCN-05 as ordered traces and check INIT-01, INVAR-01 over reachable traces, FRESH-01, PRIORITY-01, and OWNER-01.

ANALYSIS-04: Retained evidence shall bind the analyzer to the exact retained source revision by source hash, record a passed analyzer status only after all required checks are true, and agree with `metrics.json` on the five owner usages and their assigned inputs, local facts, contract cases or equations, and analyzer checks. The analyzer shall remain outside the semantic architecture and shall not be cited as GUMBO execution, executable application behavior, model checking, or unbounded formal proof.

PASS-01: Structural acceptance passes only when the exact `5/11/11/5` semantic tuple, one explicit root, one support Process, physical depth `2`, permitted semantic depth `1..2`, one weak semantic region, seventeen raw connections with the exact 11-to-17 mapping, and no padded or untraced usage, interaction, case, or scenario are reported.

PASS-02: Behavioral acceptance passes only when CASE-01 through CASE-11 are total, mutually exclusive after priority, witnessed, owner-local to PART-03, and constrain next state and disposition while OUTPUT-01 constrains every controlled output.

PASS-03: Fault and recovery acceptance passes only when every single and combined invalid-status snapshot enters `Off` with disabled permissions, `InputFault`, and recovery set in the same evaluation, and SCN-05 cannot operate before a neutral valid sample followed by a later fresh request.

PASS-04: Ownership acceptance passes only when PART-03 is the sole principal decision and state owner; PART-01, PART-02, PART-04, and PART-05 each derive their declared meaningful owner-local fact; all eleven cases have PART-03 ownership; and no central recomputation, forwarding owner, or identity-wrapper credit is found.

PASS-05: Verification acceptance requires architecture-stage and final Sireum typechecking success, resolved compatible endpoints, exact semantic and raw-inventory reporting, complete trace coverage, and successful bounded analysis. Any tool, contract, analyzer, code-generation, execution, or proof check not run shall be reported `not-run`, never passed.

PASS-06: Designer validation separately passes only if the retained model remains faithful to NEED-01, the exact finite boundary, the selected lifecycle scope, all five scenario families, source limitations, assumptions, and DEFER-01. Mechanical conformance alone is insufficient.

PASS-07: Visualization acceptance requires exactly one named `system-overview` bound to the retained source revision and showing the root, all five semantic usages, six boundary quantities, the sole principal owner, and eleven directed semantic flows without presenting context, the support Process, or delegation routes as semantic usages or interactions.

## Resolved Model questions

Q-MODEL-01: Resolved affirmatively. The permitted owner-local state, initialization, pre-state, explicit guard, attribute, and multi-output constructs can realize PART-03 without duplicating or weakening the principal decision; CONTRACT-LOCAL-01 and CONTRACT-LOCAL-02 are the generation constraints.

Q-MODEL-02: Resolved affirmatively with the localized physical mapping in RAW-MAP-01 and SUPPORT-01. The exact semantic inventory remains INT-01 through INT-11 while the required raw connection count is seventeen.

Q-MODEL-03: Resolved affirmatively. The five usages retain the separate meaningful local contracts and extensional owner evidence in PART-01 through PART-05 and OWNER-AUDIT-02; central recomputation is prohibited.

Q-MODEL-04: Resolved affirmatively within the bounded-evidence limit. ANALYSIS-01 through ANALYSIS-04 require complete enumeration and five ordered scenario traces while DEFER-01 prohibits interpreting that evidence as GUMBO execution or proof.

## Final Designer authorization audit

AUDIT-FINAL-01: The approved baseline contains exactly five semantic usages, eleven typed directed semantic interactions, eleven nontrivial principal contract cases, five scenario families, one explicit root, one behavior-free generated-support Process, seventeen raw connections, physical containment depth two, semantic depth permitted within `1..2`, one weak semantic region, one principal decision owner, and one persistent-state owner.

AUDIT-FINAL-02: PART-03 owns both persistent state variables, charge-context qualification, strict priority, and every CASE; PART-01, PART-02, PART-04, and PART-05 retain the separate owner-local contracts stated above. No state, decision, case, output derivation, or owner credit is unowned or multiply owned.

AUDIT-FINAL-03: Model generation is authorized only for this final baseline, its exact semantic-to-raw mapping, its bounded end-to-end obligations, and its complete deferred-claim boundary. Representation support may not weaken domain policy, alter any PART or INT meaning, reduce any case or scenario, or promote a deferred claim to passed evidence.
