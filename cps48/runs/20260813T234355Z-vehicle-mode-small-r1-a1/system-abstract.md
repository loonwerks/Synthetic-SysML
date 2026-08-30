---
abstract_id: VEHICLE-TEMP-HEALTH-SA-APPROVED-01
run_id: 20260813T234355Z-vehicle-mode-small-r1-a1
domain_seed: 20260813T233941Z-vehicle-mode-seed-v1
campaign_complexity: small
semantic_usage_bounds: [5, 8]
semantic_interaction_bounds: [7, 14]
nontrivial_contract_case_bounds: [6, 12]
scenario_family_bounds: [4, 6]
selected_semantic_usage_count: 5
selected_semantic_interaction_count: 13
selected_nontrivial_contract_case_count: 11
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

# Vehicle Temperature and Health Supervisor

## Need, purpose, and goals

NEED-01: A vehicle context needs a bounded logical supervisor that converts temperature-relative, maintenance-time, and return-to-normal evidence into one persistent health disposition while preventing power enablement from resuming merely because an active condition or invalid sample disappeared.

PURPOSE-01: The Vehicle Temperature and Health Supervisor shall classify finite temperature and maintenance evidence, qualify a fresh return-to-normal indication, select one health mode, and control a logical electrical-power disposition plus recovery guidance. It shall not sense physical temperature, schedule maintenance, originate return requests, or control drivetrain physics.

GOAL-01: The system shall publish exactly one health mode, one electrical-power disposition, and one recovery-guidance value for every logical evaluation from its finite boundary samples and pre-evaluation state.

GOAL-02: The system shall withhold logical power whenever maintenance is due, temperature is above the selected maximum, any input evidence is invalid, or recovery is awaiting a qualifying fresh request.

GOAL-03: The system shall give invalid or internally malformed evidence strict priority over maintenance, maintenance strict priority over over-temperature, and both active conditions priority over a return-to-normal request.

GOAL-04: The system shall resume the operational disposition only from clear valid evidence combined with a fresh return-to-normal request; clearing a condition alone or reusing a request sampled while a condition remains active shall not recover.

## Evidence and claim boundary

METHOD-01: Handbook-derived method requires an implementation-independent need and boundary before decomposition, explicit assumptions and owners, nominal and off-nominal scenarios, comparison of alternatives, stable traceability, measurable bounds, and separate verification from validation. These are methodology obligations, not vehicle facts.

FACT-SRC-01: The frozen seed grounds a general Vehicle and embedded VehicleController context, a Road boundary, lifecycle and health vocabulary, temperature sensing and over-temperature concepts, maintenance and degraded concepts, return-to-normal vocabulary, electrical power, and vehicle/controller mode disposition.

FACT-SRC-02: The seed does not define the content or completion effect of self-test, parking-brake, or temperature-sensing actions; does not supply a complete state protocol; and does not establish the origin, authority, priority, validity, or recovery meaning of any indication.

FACT-SRC-03: The seed does not ground numeric temperature bounds, physical power effects, timing, drivetrain laws, reliability, road safety, certification, or production readiness.

ABS-PILOT-01: This approved abstract selects the seed's temperature-and-health-supervisor scope and introduces the exact finite samples, status handling, threshold relation, persistent health state, priority, recovery eligibility, output meanings, contract partition, and bounded scenarios as Designer pilot abstractions.

ARCH-SEL-01: The approved architecture separates temperature qualification, maintenance qualification, recovery applicability, principal stateful arbitration, and boundary-outcome derivation. This allocation is a Designer selection justified in `design-selection.md`, not a source fact or handbook prescription.

DEFER-01: Numeric temperature, threshold calibration, temperature units, physical sensing, power switching, achieved power, fuel command, start/on/off lifecycle control, parking-brake control, self-test execution, torque or road dynamics, maintenance scheduling, physical timing, quantitative hazard probability or severity, safety, certification, deployment, code generation, execution, compositional proof, and production readiness are explicitly deferred and shall not be reported as passed.

## Operational context and finite boundary

CTX-01: The Vehicle Temperature Context is outside the system and supplies one temperature-relative sample per logical evaluation. It is responsible for producing the relation to the selected maximum and for its validity status; the supervisor does not measure temperature or own the maximum.

CTX-02: The Vehicle Maintenance Context is outside the system and supplies one maintenance-time sample per logical evaluation. It is responsible for deciding whether maintenance is due and for the validity of that evidence.

CTX-03: The Return-Indication Source is outside the system and supplies fresh return-to-normal indications. The seed does not identify this source as a driver, operator, or command authority, and this abstract makes no such attribution.

CTX-04: The Vehicle Mode Consumer is outside the system and receives the selected health mode as logical supervisory status.

CTX-05: The Electrical Power Manager is outside the system and receives a logical power disposition. Physical switching, delivered power, and confirmation of effect remain its responsibility and outside this boundary.

CTX-06: The Health Status Recipient is outside the system and receives recovery guidance. The seed does not identify a display, operator, or maintenance interface, so the recipient remains abstract.

MON-01: `TemperatureSample` is a finite root input from CTX-01 with fields `relation : TemperatureRelation` and `status : InputStatus`, where `TemperatureRelation` is exactly `{AtOrBelowMaximum, AboveMaximum}` and `InputStatus` is exactly `{Valid, Invalid}`. An invalid status makes the relation payload irrelevant.

MON-02: `MaintenanceSample` is a finite root input from CTX-02 with fields `timing : MaintenanceTiming` and `status : InputStatus`, where `MaintenanceTiming` is exactly `{NotDue, Due}`. An invalid status makes the timing payload irrelevant.

MON-03: `ReturnSample` is a finite root input from CTX-03 with fields `indication : ReturnIndication` and `status : InputStatus`, where `ReturnIndication` is exactly `{NoRequest, FreshRequest}`. An invalid status makes the indication payload irrelevant.

CTRL-01: `VehicleHealthMode` is a finite root output to CTX-04 with exactly `{Operational, TemperatureDegraded, MaintenanceHold, Unavailable}`. These are supervisory dispositions, not claims about achieved physical vehicle states.

CTRL-02: `ElectricalPowerDisposition` is a finite root output to CTX-05 with exactly `{Enable, Withhold}`. `Enable` is logical permission and does not establish that electrical power is available, switched, or delivered.

CTRL-03: `RecoveryGuidance` is a finite root output to CTX-06 with exactly `{None, ClearActiveCondition, SubmitFreshReturnRequest, RepairInputEvidence}`.

BOUND-01: The root boundary consists of exactly MON-01 through MON-03 and CTRL-01 through CTRL-03. Start, on, off, brake-pedal, parking-brake, self-test, fuel, power feedback, torque, speed, and road interfaces are outside this selected small scope.

## Evaluation, state, modes, and assumptions

SEM-01: One logical evaluation consumes current MON-01 through MON-03 and the pre-evaluation value of STATE-01, selects exactly one ordered CASE-01 through CASE-11, atomically commits the next state and `HealthDecision`, and derives all three controlled outputs. This establishes deterministic ordering but no scheduler, period, latency, or physical simultaneity.

STATE-01: `healthState : VehicleHealthMode` is the only persistent domain state and is owned exclusively by PART-04. No other semantic usage may retain, select, override, or recompute this state.

INIT-01: Initial `healthState` and initial CTRL-01 shall be `Unavailable`; initial CTRL-02 shall be `Withhold`; and initial CTRL-03 shall be `SubmitFreshReturnRequest`. Initialization is a safe logical hold and is not a counted nontrivial contract case.

MODE-01: `Operational` observably publishes CTRL-01 as `Operational`, CTRL-02 as `Enable`, and CTRL-03 as `None`.

MODE-02: `TemperatureDegraded` observably publishes CTRL-01 as `TemperatureDegraded`, CTRL-02 as `Withhold`, and CTRL-03 as `ClearActiveCondition` while over-temperature evidence remains active.

MODE-03: `MaintenanceHold` observably publishes CTRL-01 as `MaintenanceHold`, CTRL-02 as `Withhold`, and CTRL-03 as `ClearActiveCondition` while maintenance evidence remains active.

MODE-04: `Unavailable` observably publishes CTRL-01 as `Unavailable` and CTRL-02 as `Withhold`; CTRL-03 distinguishes invalid evidence from valid evidence awaiting a fresh request according to OUT-01.

FRESH-01: A valid `FreshRequest` is a one-evaluation event, not a retained level. A request blocked by invalid evidence, maintenance, or over-temperature is consumed in that evaluation; after the blocking cause clears, recovery requires a later `FreshRequest` preceded by at least one valid `NoRequest` sample.

ASM-01: CTX-01 is responsible for comparing temperature with one stable selected maximum during an evaluation and for treating exact equality as `AtOrBelowMaximum`. This relation and equality rule are Designer-supplied because the seed provides neither a numeric threshold nor its interpretation.

ASM-02: CTX-02 is responsible for the meaning and validity of `Due`; the supervisor treats it only as current finite evidence and makes no calendar, service-interval, or maintenance-completion claim.

ASM-03: CTX-03 is responsible for emitting `FreshRequest` for exactly one evaluation and then at least one valid `NoRequest` before another fresh event. This pulse discipline closes the partition without assigning command authority unsupported by the seed.

ASM-04: CTX-01 through CTX-03 each provide exactly one complete finite sample per logical evaluation. Cross-sample arrival timing, transport, and physical synchronization are outside scope.

ASM-05: CTX-04 through CTX-06 consume the three controlled values as logical supervisory outputs. Physical actuation, display, acknowledgment, and effect are outside scope and provide no feedback to this system.

## Exactly five semantic usages and one principal owner

PART-01: Temperature Evidence Qualification shall derive `TemperatureAssessment` exactly from both fields of MON-01, producing `{InvalidTemperature, NominalTemperature, OverTemperature}`. It owns no state, recovery decision, health decision, or controlled output.

PART-02: Maintenance Evidence Qualification shall derive `MaintenanceAssessment` exactly from both fields of MON-02, producing `{InvalidMaintenance, MaintenanceClear, MaintenanceDue}`. It owns no state, recovery decision, health decision, or controlled output.

PART-03: Recovery Applicability shall combine MON-03, PART-01's assessment, and PART-02's assessment to derive `RecoveryProposal` exactly in `{InvalidRecoveryEvidence, NotRequested, BlockedByMaintenance, BlockedByTemperature, EligibleRecovery}`. It owns no persistent state or health-mode decision.

PART-04: Health Mode Arbitration is the sole principal decision owner. It shall exclusively own STATE-01, CONSIST-01, PRIORITY-01, and CASE-01 through CASE-11 and derive one complete `HealthDecision` with fields `nextMode : VehicleHealthMode` and `reason : DecisionReason`, where `DecisionReason` is exactly `{InvalidEvidence, MaintenanceActive, TemperatureActive, NormalRetained, RecoveryNotRequired, FreshRecoveryRequired, RecoveryAccepted}`.

PART-05: Boundary Outcome Derivation shall consume PART-04's committed `HealthDecision` and PART-03's `RecoveryProposal` and derive CTRL-01 through CTRL-03 using OUT-01. It earns semantic credit through a defensive, prioritized two-input classification and owns no state, proposal, priority, or health decision.

OWNER-01: The ownership audit shall report PART-04 as the sole state, priority, case, and principal decision owner; PART-01 and PART-02 as stateless evidence-qualification owners; PART-03 as the stateless recovery-applicability owner; and PART-05 as the stateless controlled-outcome owner. Root, contexts, types, containment, routing, bundling, and generated support receive no owner or semantic-usage credit.

## Exactly thirteen typed directed semantic interactions

INT-01: The root boundary shall provide `TemperatureSample` from MON-01 to PART-01.

INT-02: The root boundary shall provide `MaintenanceSample` from MON-02 to PART-02.

INT-03: The root boundary shall provide `ReturnSample` from MON-03 to PART-03.

INT-04: PART-01 shall provide `TemperatureAssessment` to PART-03 for recovery applicability.

INT-05: PART-02 shall provide `MaintenanceAssessment` to PART-03 for recovery applicability.

INT-06: PART-01 shall provide `TemperatureAssessment` to PART-04 for health arbitration independently of INT-04 because PART-04 is a distinct consumer.

INT-07: PART-02 shall provide `MaintenanceAssessment` to PART-04 for health arbitration independently of INT-05 because PART-04 is a distinct consumer.

INT-08: PART-03 shall provide `RecoveryProposal` to PART-04 for health arbitration.

INT-09: PART-03 shall provide `RecoveryProposal` to PART-05 for defensive recovery-guidance and producer-consistency derivation independently of INT-08.

INT-10: PART-04 shall provide the committed `HealthDecision` to PART-05.

INT-11: PART-05 shall provide `VehicleHealthMode` to CTRL-01 at the root boundary.

INT-12: PART-05 shall provide `ElectricalPowerDisposition` to CTRL-02 at the root boundary.

INT-13: PART-05 shall provide `RecoveryGuidance` to CTRL-03 at the root boundary.

INT-AUDIT-01: The complete inventory is exactly thirteen semantic interactions: three boundary-input deliveries, seven inter-usage fact deliveries, and three boundary-output deliveries. Every interaction has a distinct producer-consumer meaning; physical routing hops are reported separately and receive no semantic credit.

## Local-contract expectations

QUAL-TEMP-01: PART-01 shall map all four MON-01 values: both invalid-status values to `InvalidTemperature`, valid `AtOrBelowMaximum` to `NominalTemperature`, and valid `AboveMaximum` to `OverTemperature`. Result-fiber sizes are `2/1/1`, so this is not a one-to-one rename.

QUAL-MAINT-01: PART-02 shall map all four MON-02 values: both invalid-status values to `InvalidMaintenance`, valid `NotDue` to `MaintenanceClear`, and valid `Due` to `MaintenanceDue`. Result-fiber sizes are `2/1/1`, so this is not a one-to-one rename.

QUAL-REC-01: PART-03 shall totally classify all 36 combinations of MON-03, `TemperatureAssessment`, and `MaintenanceAssessment` in strict order: any invalid return status or invalid assessment gives `InvalidRecoveryEvidence`; otherwise `NoRequest` gives `NotRequested`; otherwise maintenance due gives `BlockedByMaintenance`; otherwise over-temperature gives `BlockedByTemperature`; otherwise the fresh request gives `EligibleRecovery`. Result-fiber sizes are `28/4/2/1/1`.

CONSIST-01: PART-04 shall regard a proposal tuple as consistent exactly when `InvalidRecoveryEvidence` may accompany any assessment pair, `NotRequested` accompanies two valid assessments, `BlockedByMaintenance` accompanies valid `MaintenanceDue`, `BlockedByTemperature` accompanies valid `MaintenanceClear` and `OverTemperature`, or `EligibleRecovery` accompanies valid `MaintenanceClear` and `NominalTemperature`. Every other direct-input tuple is malformed and enters CASE-01.

PRIORITY-01: PART-04 shall apply strict descending priority: invalid or malformed evidence; active maintenance; active over-temperature; eligible fresh recovery; then retention. The first matching effective case excludes every lower-priority case in the same evaluation.

OUT-01: PART-05 shall accept exactly these producer-consistent classes: `Unavailable/InvalidEvidence` with any proposal maps to `Unavailable/Withhold/RepairInputEvidence`; `MaintenanceHold/MaintenanceActive` with `NotRequested` or `BlockedByMaintenance` maps to `MaintenanceHold/Withhold/ClearActiveCondition`; `TemperatureDegraded/TemperatureActive` with `NotRequested` or `BlockedByTemperature` maps to `TemperatureDegraded/Withhold/ClearActiveCondition`; `Operational/NormalRetained` with `NotRequested`, `Operational/RecoveryNotRequired` with `EligibleRecovery`, and `Operational/RecoveryAccepted` with `EligibleRecovery` each map to `Operational/Enable/None`; and each nonoperational mode paired with `FreshRecoveryRequired/NotRequested` maps to that mode with `Withhold/SubmitFreshReturnRequest`. Every other `HealthDecision`/`RecoveryProposal` pair shall map to `Unavailable/Withhold/RepairInputEvidence` and be reported by bounded analysis.

LOCAL-CONTRACT-01: PART-01 through PART-03 and PART-05 shall each retain one exhaustive owner-local derivation for their stated fact. PART-04 shall retain STATE-01, CONSIST-01, PRIORITY-01, and all eleven effective cases in one owner-local contract; no downstream usage or analyzer may act as a production owner that recomputes or overrides health arbitration.

CASE-AUDIT-01: QUAL-TEMP-01, QUAL-MAINT-01, QUAL-REC-01, CONSIST-01, OUT-01, initialization, invariants, type constraints, and scenario witnesses are mandatory but are not additional counted policy cases. The campaign count is exactly the eleven effective decisions below.

## Exactly eleven ordered nontrivial contract cases

CASE-01: If either assessment is invalid, the proposal is `InvalidRecoveryEvidence`, or CONSIST-01 is false, then the next mode shall be `Unavailable` and the reason shall be `InvalidEvidence`, regardless of pre-state or other payloads.

CASE-02: Otherwise, if maintenance is `MaintenanceDue`, then the next mode shall be `MaintenanceHold` and the reason shall be `MaintenanceActive`, regardless of temperature, pre-state, or a blocked/not-requested proposal.

CASE-03: Otherwise, if temperature is `OverTemperature`, then the next mode shall be `TemperatureDegraded` and the reason shall be `TemperatureActive`, regardless of pre-state or a blocked/not-requested proposal.

CASE-04: Otherwise, if pre-state is `Operational` and the proposal is `NotRequested`, then the next mode shall remain `Operational` and the reason shall be `NormalRetained`.

CASE-05: Otherwise, if pre-state is `Operational` and the proposal is `EligibleRecovery`, then the next mode shall remain `Operational` and the reason shall be `RecoveryNotRequired`; the fresh event is consumed without changing state.

CASE-06: Otherwise, if pre-state is `Unavailable` and the proposal is `NotRequested`, then the next mode shall remain `Unavailable` and the reason shall be `FreshRecoveryRequired`.

CASE-07: Otherwise, if pre-state is `Unavailable` and the proposal is `EligibleRecovery`, then the next mode shall be `Operational` and the reason shall be `RecoveryAccepted`.

CASE-08: Otherwise, if pre-state is `MaintenanceHold` and the proposal is `NotRequested`, then the next mode shall remain `MaintenanceHold` and the reason shall be `FreshRecoveryRequired`.

CASE-09: Otherwise, if pre-state is `MaintenanceHold` and the proposal is `EligibleRecovery`, then the next mode shall be `Operational` and the reason shall be `RecoveryAccepted`.

CASE-10: Otherwise, if pre-state is `TemperatureDegraded` and the proposal is `NotRequested`, then the next mode shall remain `TemperatureDegraded` and the reason shall be `FreshRecoveryRequired`.

CASE-11: Otherwise, if pre-state is `TemperatureDegraded` and the proposal is `EligibleRecovery`, then the next mode shall be `Operational` and the reason shall be `RecoveryAccepted`.

PARTITION-01: CASE-01 through CASE-11 are total and mutually exclusive after PRIORITY-01 over all `3 × 3 × 5 × 4 = 180` direct PART-04 input/pre-state combinations. CASE-01 closes every invalid and malformed tuple; the remaining cases partition all consistent valid tuples and all four pre-states.

STATE-AUDIT-01: Every CASE constrains both `HealthDecision` fields and the committed next STATE-01 value. The next state equals `HealthDecision.nextMode`; no case leaves state, reason, or a controlled output unconstrained, and no transition exists outside CASE-01 through CASE-11.

## Required behavior, fault response, and recovery

BEH-01: With valid nominal temperature, valid maintenance-clear evidence, pre-state `Operational`, and no request, the system shall remain `Operational`, publish `Enable`, and publish no recovery guidance. Bounded contract analysis passes only when CASE-04 and OUT-01 produce exactly that tuple.

BEH-02: Valid `AtOrBelowMaximum` shall be nominal, while valid `AboveMaximum` shall select `TemperatureDegraded` and `Withhold`. Source and bounded-partition inspection pass only with equality-boundary and CASE-03 witnesses and no overlap.

BEH-03: Simultaneous valid maintenance-due and over-temperature evidence shall select `MaintenanceHold`, while any invalid evidence shall instead select `Unavailable`. Ordered-case analysis passes only with distinct CASE-01 and CASE-02 conflict witnesses.

BEH-04: Every effective case shall determine CTRL-01 through CTRL-03 from the same committed decision without stale retention. Analysis passes only with zero output mismatches for all 180 direct PART-04 tuples, all 140 direct PART-05 pairs, and all 256 reachable raw-boundary/pre-state evaluations.

RISK-01: Ignoring invalid evidence or an active maintenance/temperature condition could logically enable power contrary to the selected policy. The claimed consequence is only unsupported logical enablement; no physical safety severity or likelihood is asserted.

FAULT-01: Any invalid boundary sample shall cause `Unavailable`, `Withhold`, and `RepairInputEvidence` in the same logical evaluation through CASE-01, regardless of other values or prior state. Exhaustive raw-boundary analysis passes only when all individual and combined invalid-status valuations produce that tuple.

FAULT-02: Any malformed internal assessment/proposal combination shall fail closed through CASE-01 rather than leave the decision unconstrained. Exhaustive direct-owner analysis passes only when every CONSIST-01-negative tuple selects CASE-01.

FAULT-03: Any producer-inconsistent direct PART-05 `HealthDecision`/`RecoveryProposal` pair shall fail closed to `Unavailable/Withhold/RepairInputEvidence`. Exhaustive direct-output analysis passes only with correct classification of all 140 pairs.

RECOVERY-01: Restoring valid statuses and clearing active conditions shall not itself recover a nonoperational pre-state; `NotRequested` shall retain the corresponding state and `Withhold` until a later eligible fresh event recovers. Ordered multi-step analysis passes only with all three retain/recover pairs.

RECOVERY-02: A fresh request arriving while maintenance or over-temperature remains active shall be classified as blocked and consumed by CASE-02 or CASE-03; a later clear sample without a new request shall remain nonoperational. Scenario replay passes only when the blocked request is never replayed as `EligibleRecovery`.

## Exactly five scenario families

SCN-01: Nominal commissioning and retention starts at INIT-01 with valid clear evidence and `NoRequest`, selects CASE-06, then uses a later clear `FreshRequest` to select CASE-07 and `Operational/Enable/None`; a following `NoRequest` selects CASE-04, and a later spurious fresh event selects CASE-05 without changing outputs.

SCN-02: Temperature boundary behavior begins operational with valid `AtOrBelowMaximum`, then changes only the relation to valid `AboveMaximum` and selects CASE-03 with `TemperatureDegraded/Withhold/ClearActiveCondition`.

SCN-03: Maintenance and conflict priority begins operational with maintenance due and over-temperature together and selects CASE-02, then includes a clear/nominal `NoRequest` step selecting CASE-08 and a later fresh step selecting CASE-09. A variant that clears maintenance while temperature remains above maximum selects CASE-03 before recovery.

SCN-04: Invalid/fault coverage injects invalid temperature, maintenance, and return statuses individually and in combination; each selects CASE-01 immediately. After evidence becomes valid and clear, `NoRequest` selects CASE-06 and a later fresh request selects CASE-07.

SCN-05: Blocked and fresh recovery enters `TemperatureDegraded`, submits a fresh request while temperature remains above maximum and stays degraded through CASE-03, clears temperature with `NoRequest` and selects CASE-10, then supplies a later fresh request and selects CASE-11. A maintenance-hold variant shows that blocked events are not replayed.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five families: nominal commissioning/retention, threshold boundary, maintenance/priority, invalid/fault, and blocked/fresh recovery. Together they provide witnesses for all eleven cases; variants do not increase the count.

## Structure, generated support, and bounded analysis

STRUCT-01: The realization shall contain exactly one explicit root system usage, exactly five reachable responsibility-bearing semantic usages realizing PART-01 through PART-05, semantic containment depth `1..2` beneath the root, exactly one weakly connected semantic region, exactly thirteen semantic interactions, exactly eleven nontrivial cases, and exactly five scenario families.

STRUCT-02: Root, external contexts, data and enum definitions, visualization-only actors, behavior-free containment support, and tool-required routing do not count as semantic usages. Routing may refine an INT into multiple physical hops only when each hop preserves endpoints, direction, type, and meaning and is separately reported as generated support.

STRUCT-03: Every PART usage shall retain its owner-local nonidentity derivation. A wrapper that only copies, renames, bundles, routes, or bijectively translates input earns no semantic credit and fails the five-usage bound rather than being replaced with padding.

SUPPORT-01: Generated realization may use exactly one behavior-free support `Process` beneath the sole `System` root and place the five responsibility-bearing `Thread` usages beneath that process. This support process, containment, declarations, types, and routing are `@generated-support` and receive no semantic or owner credit.

SUPPORT-02: The six boundary semantic interactions may each use two raw delegation declarations, and the seven inter-usage interactions may be direct, yielding exactly nineteen raw connection declarations: twelve generated-support boundary delegations plus seven direct internal connections. Only INT-01 through INT-13 receive semantic-interaction credit.

SUPPORT-03: Every field inspected by GUMBO in `TemperatureSample`, `MaintenanceSample`, `ReturnSample`, and `HealthDecision` shall be declared as an `attribute`. Finite enum comparisons, owner-local helper functions, `In(healthState)` pre-state guards, initialization, and multi-field guarantees are allowed; GUMBO shall not be credited with proving case totality or exclusivity.

ANALYSIS-01: A deterministic bounded analyzer shall exhaustively enumerate three spaces: all `4 × 4 × 4 × 4 = 256` raw-boundary/pre-state evaluations; all `3 × 3 × 5 × 4 = 180` direct PART-04 assessment/proposal/pre-state tuples; and all `28 × 5 = 140` direct PART-05 `HealthDecision`/`RecoveryProposal` pairs, because `HealthDecision` has `4 × 7 = 28` finite values.

ANALYSIS-02: Analyzer acceptance requires, in each applicable space, zero uncovered mappings, zero multiple mappings after priority, and zero state/decision/output mismatches. It additionally requires at least one witness for every CASE-01 through CASE-11 and each of the seven distinct OUT-01 output tuples; correct fail-closed output for every producer-inconsistent PART-05 pair; coverage of all single and combined invalid statuses and all five scenario families; and the blocked-request nonreplay property.

ANALYSIS-03: The analyzer shall independently derive expected owner facts only as conformance evidence; it is not a generated system component, a production decision owner, or a formal/compositional proof, and it may not justify moving or duplicating arbitration outside PART-04.

TRACE-01: Every actionable abstract identifier shall trace to at least one generated model element or explicit informational/deferred disposition, and every significant generated component, boundary feature, connection, state, initialization, contract clause, and analyzer rule shall trace back or carry a specific `@generated-support` justification. Acceptance requires zero missing abstract IDs and zero unexplained generated elements.

## Acceptance and authorization

PASS-01: Structural acceptance requires the exact campaign tuple `5 semantic usages / 13 typed directed semantic interactions / 11 nontrivial contract cases / 5 scenario families`, one root, semantic depth `1..2`, one weak semantic region, one principal owner, and no padded or untraced usage or interaction.

PASS-02: Behavioral acceptance requires QUAL-TEMP-01, QUAL-MAINT-01, QUAL-REC-01, CONSIST-01, CASE-01 through CASE-11, and OUT-01 to be total, exclusive where applicable, owner-local, and fully constraining over all 256 raw evaluations, 180 direct PART-04 tuples, and 140 direct PART-05 pairs.

PASS-03: Fault and recovery acceptance requires invalid or malformed evidence to select CASE-01 immediately; producer-inconsistent PART-05 pairs to fail closed; condition clearing alone to retain a nonoperational state; active-condition requests to be consumed; and a later fresh clear request to recover each nonoperational mode.

PASS-04: Ownership acceptance requires PART-04 to remain the sole principal decision and state owner; PART-01, PART-02, PART-03, and PART-05 each to derive their meaningful local fact; and no central recomputation, competing state, identity-wrapper credit, or analyzer ownership.

PASS-05: Mechanical verification requires architecture-stage, final, and independent-harness Sireum typechecking success; resolved compatible endpoints; exact metric results; complete bidirectional trace coverage; and successful bounded analysis. Any check not run shall be recorded `not-run`, never passed.

PASS-06: Designer validation separately requires fidelity to NEED-01, the exact selected boundary, all five scenario families, the frozen seed limitations, and DEFER-01; mechanical conformance alone is insufficient.

PASS-07: Visualization acceptance requires exactly one native-resolution `system-overview` bound to the accepted source revision, showing the root, all five semantic usages, six boundary quantities, PART-04 as sole principal owner, and all thirteen directed semantic interactions without presenting contexts or generated support as semantic usages.

MODEL-RES-01: Model finding 1 is accepted: direct enumeration of all 140 PART-05 pairs is now mandatory in ANALYSIS-01, ANALYSIS-02, BEH-04, FAULT-03, and PASS-02, with no architecture, policy, metric, or claim-boundary change.

MODEL-RES-02: Model finding 2 is accepted as confirming evidence: the extensional fiber audit establishes that PART-01, PART-02, PART-03, and PART-05 are meaningful nonidentity owners, while PART-04 remains the sole principal owner.

MODEL-RES-03: Model finding 3 is accepted and narrowed to a generated-support allowance, not a semantic requirement: the one-Process/five-Thread topology and nineteen raw connections are permitted exactly as SUPPORT-01 through SUPPORT-03 specify and earn no added semantic credit.

MODEL-RES-04: Model finding 4 is accepted: the non-executable finite profile is realizable in the reviewed subset, while totality and exclusivity remain analyzer obligations and all deferred execution, proof, and production claims remain deferred.

AUDIT-FINAL-01: The approved final architecture contains exactly five semantic usages, thirteen typed directed semantic interactions, eleven nontrivial contract cases, five scenario families, one explicit root, semantic depth `1..2`, one weak semantic region, and one principal decision owner. It retains nominal, equality-boundary, invalid/fault, priority, latching, blocked-request, and recovery behavior.

AUTH-FINAL-01: Model generation is authorized only against this approved `system-abstract.md` and `design-selection.md` in the retained immutable run. Generation shall not weaken the frozen domain policy, alter the `5 / 13 / 11 / 5` tuple, omit any of the three bounded-analysis spaces, grant generated support semantic credit, or report a deferred claim as passed.
