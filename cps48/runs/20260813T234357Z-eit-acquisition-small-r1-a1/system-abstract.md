---
abstract_id: EIT-ACQ-SMALL-SA-01
run_id: 20260813T234357Z-eit-acquisition-small-r1-a1
domain_seed: eit-acquisition-seed-20260813t233941z
campaign_complexity: small
semantic_usage_bounds: [5, 8]
semantic_interaction_bounds: [7, 14]
nontrivial_contract_case_bounds: [6, 12]
scenario_family_bounds: [4, 6]
selected_semantic_usage_count: 5
selected_semantic_interaction_count: 12
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

# EIT Monitoring-Start and Impedance-Acquisition Coordinator

## Synopsis, need, purpose, and goals

NEED-01: A Doctor needs a bounded logical service that starts and stops one monitoring session using current calibration evidence, requests impedance acquisition while the session is active, and makes admitted opaque impedance tokens available for later image generation. The need is coordination of monitoring and acquisition, not patient diagnosis or physical electrical control.

PURPOSE-01: The EIT Monitoring-Start and Impedance-Acquisition Coordinator will qualify a monitoring request, calibration evidence, and an impedance-token observation; maintain one logical session and recovery phase; issue one acquisition command; gate token delivery; and report monitoring status to the Doctor.

GOAL-01: The system shall produce exactly one coherent next session state, recovery state, acquisition command, impedance delivery, and Doctor status for every finite input and owner pre-state combination.

GOAL-02: The system shall permit acquisition only while a valid fresh or retained monitoring session is supported by valid current-calibration evidence.

GOAL-03: The system shall inhibit acquisition and token delivery on any invalid input, then require a valid neutral request followed by a later fresh request before monitoring may resume.

GOAL-04: The system shall preserve the distinction between two opaque admitted impedance tokens without assigning either token clinical, physical, or image-quality meaning.

## Evidence and claim classification

METHOD-01: Handbook-derived method requires an implementation-independent need and boundary before internal responsibility allocation, explicit assumptions and ownership, nominal and off-nominal scenarios, comparison of alternatives, stable traceability, measurable bounds, and separate verification from validation. These are method obligations, not EIT domain facts.

FACT-SRC-01: The frozen source grounds actors named Doctor, EngineerTechnician, Patient, and EITSystem; it associates the Doctor with starting monitoring, the EngineerTechnician with calibration, and the EITSystem actor with collecting impedance data and generating EIT images.

FACT-SRC-02: The source also names electrode-belt application and image analysis but supplies no sequence, interface, type, value, validity, readiness, authorization, state, priority, fault, recovery, completion, correctness, or exclusivity semantics. The Patient has no use-case association, and the relationship between the EITSystem actor and EITSystemBoundary is ambiguous.

ABS-PILOT-01: This abstract introduces the exact finite samples, opaque token values, logical evaluation boundary, current-calibration meaning, monitoring state, ordered policy, invalidity priority, fresh-request recovery, output meanings, bounded scenarios, and acceptance checks as pilot abstractions. None is attributed to the source.

ARCH-SEL-01: The selected architecture separates request qualification, joint acquisition-evidence qualification, one stateful monitoring decision owner, token-delivery derivation, and Doctor-status derivation. This is the Designer-selected allocation recorded in `design-selection.md`, not a handbook prescription or source fact.

DEFER-01: Electrode placement, contact quality, stimulation or sensing physics, impedance representation, numeric values and units, sample timing, image reconstruction, image quality, automated analysis, diagnosis, treatment, patient consent or control, achieved acquisition, hardware feedback, electrical safety, medical efficacy, regulatory compliance, certification, deployment, code generation, execution, formal proof, and production readiness are deferred and shall never be reported as passed by this run.

## Operational context and exact system boundary

CTX-01: The Doctor is outside the system, supplies the monitoring-request sample, and receives monitoring status. The source association grounds Doctor participation in monitoring start but does not establish exclusive request authority or the finite request protocol used here.

CTX-02: The EngineerTechnician is outside the system and supplies calibration evidence. `Current` is a selected logical premise for this coordinator; it is not a source-grounded calibration acceptance criterion.

CTX-03: The External EIT Acquisition Context is outside this selected boundary, receives the logical acquisition command, and supplies an opaque impedance-token observation. It is this abstract's explicit treatment of the source's ambiguous `EITSystem` actor; it is not assumed identical to the selected coordinator or to the source's `EITSystemBoundary`.

CTX-04: The EIT Image-Generation Consumer is outside this selected boundary and receives gated impedance delivery. The source grounds image-generation vocabulary but does not define this interface or assert that delivered tokens are sufficient for an image.

CTX-05: The Patient remains an external declared context actor with no modeled input, output, control, or scenario step because the source provides no Patient association. The electrode belt, clinical reviewer, and image-analysis activity are also outside the selected boundary.

MON-01: `MonitoringRequestSample` is a finite root input from CTX-01 with `request : MonitoringRequest` and `status : InputStatus`, where `MonitoringRequest` is exactly `{NoRequest, StartMonitoring, StopMonitoring}` and `InputStatus` is exactly `{Valid, Invalid}`.

MON-02: `CalibrationSample` is a finite root input from CTX-02 with `calibration : CalibrationState` and `status : InputStatus`, where `CalibrationState` is exactly `{NotCurrent, Current}`. `Current` means only that the external technician context presents calibration as usable for this logical evaluation.

MON-03: `ImpedanceSample` is a finite root input from CTX-03 with `token : ImpedanceToken` and `status : InputStatus`, where `ImpedanceToken` is exactly `{NoToken, TokenOne, TokenTwo}`. `TokenOne` and `TokenTwo` are distinct uninterpreted finite witnesses and carry no numeric, physical, patient, or quality semantics.

CTRL-01: `AcquisitionCommand` is a finite root output to CTX-03 with exactly `{HoldAcquisition, CollectImpedance}`. It is a logical request and does not prove stimulation, sensing, collection, storage, or hardware response.

CTRL-02: `ImpedanceDelivery` is a finite root output to CTX-04 with exactly `{Withheld, NoTokenAvailable, DeliverTokenOne, DeliverTokenTwo}`. A delivered token is an admitted opaque witness, not validated impedance or image input quality.

CTRL-03: `MonitoringStatus` is a finite root output to CTX-01 with exactly `{Stopped, Monitoring, CalibrationRequired, InputFault, RecoveryPending}`.

BOUND-01: The root boundary consists exactly of MON-01 through MON-03 and CTRL-01 through CTRL-03. There is no root interface for belt application, patient state, consent, numeric impedance, image output, clinical analysis, diagnosis, treatment, timing, hardware actuation, or achieved physical acquisition.

## Logical evaluation and owner-state semantics

SEM-01: One logical evaluation consumes current MON-01 through MON-03 and the pre-evaluation owner state, selects exactly one ordered CASE-01 through CASE-12, atomically updates the owner state, and publishes all three controlled outputs from that resolution. This defines deterministic snapshot semantics without claiming a scheduler, period, latency, physical simultaneity, or executable profile.

STATE-01: `sessionMode : SessionMode` and `recoveryPhase : RecoveryPhase` are the only persistent domain state, where `SessionMode` is exactly `{SessionStopped, SessionMonitoring}` and `RecoveryPhase` is exactly `{Normal, AwaitNeutral, AwaitFreshRequest}`. PART-03 exclusively owns both variables.

INIT-01: Initial owner state shall be `sessionMode = SessionStopped` and `recoveryPhase = Normal`; initial CTRL-01 shall be `HoldAcquisition`, initial CTRL-02 shall be `Withheld`, and initial CTRL-03 shall be `Stopped`.

INVAR-01: Every reachable owner state shall satisfy `recoveryPhase != Normal implies sessionMode = SessionStopped`. CASE-01 establishes the invariant, CASE-02 through CASE-04 preserve it, and CASE-05 through CASE-12 return to or remain in `Normal`.

FRESH-01: After CASE-01, a request is fresh only if a later all-valid `NoRequest` first selects CASE-03, any number of later all-valid `NoRequest` evaluations select CASE-04, and then a later all-valid `StartMonitoring` or `StopMonitoring` selects CASE-05, CASE-06, or CASE-07. Restored validity while the earlier nonneutral request remains shall select CASE-02 and cannot start monitoring.

## Exact five semantic usages and responsibility ownership

PART-01: Request Qualification shall derive `QualifiedRequest` from both MON-01 fields, producing `InvalidRequest` whenever status is invalid and otherwise exactly `{NoQualifiedRequest, QualifiedStart, QualifiedStop}`. It owns no state, calibration applicability, monitoring decision, or output.

PART-02: Acquisition Evidence Qualification shall jointly derive `AcquisitionEvidence` from MON-02 and MON-03, producing exactly one of `{InvalidAcquisitionEvidence, CalibrationAbsent, ReadyNoToken, ReadyTokenOne, ReadyTokenTwo}` under QUAL-EVID-01. It owns no state, recovery, monitoring permission, or final output.

PART-03: Monitoring Decision Owner is the one and only principal decision owner and the sole state owner. It shall own STATE-01, apply PRIORITY-01, select exactly one CASE-01 through CASE-12, and derive one complete `MonitoringResolution` containing `nextSessionMode`, `nextRecoveryPhase`, `acquisitionCommand`, and `disposition`, where disposition is exactly `{InputFaultDisposition, RecoveryDisposition, StopAccepted, StartAccepted, StartDenied, MonitoringContinued, StoppedDisposition}`.

PART-04: Impedance Delivery Derivation shall derive CTRL-02 from PART-03's committed resolution and PART-02's qualified evidence under DELIVERY-01. It owns no monitoring, calibration, recovery, or token-validity decision and earns semantic credit through state-dependent two-input gating rather than copying a token.

PART-05: Doctor Status Derivation shall derive CTRL-03 from PART-03's committed resolution and PART-02's qualified evidence under STATUS-01. It owns no persistent state or case selection and earns semantic credit through a prioritized two-input classification rather than renaming the resolution.

OWNER-01: The ownership audit shall report PART-03 as the sole principal decision and state owner; PART-01 and PART-02 as stateless qualification owners; PART-04 as the stateless token-delivery owner; and PART-05 as the stateless Doctor-status owner. No root, type, router, analyzer, context actor, or generated-support element receives usage or owner credit.

OWNER-02: Every CASE and both persistent state variables belong only to PART-03. PART-04 and PART-05 shall consume the committed resolution and shall not recompute invalidity priority, calibration readiness, recovery, case applicability, next state, or acquisition permission.

## Complete qualification, priority, and output partitions

QUAL-REQ-01: PART-01's total relation covers all six `MonitoringRequestSample` values: the three invalid-status values collapse to `InvalidRequest`, and the three valid requests map respectively to `NoQualifiedRequest`, `QualifiedStart`, and `QualifiedStop`. This status-dependent collapse is the owner-local nonidentity derivation and is not a counted policy case.

QUAL-EVID-01: PART-02's total relation covers all twenty-four `CalibrationSample` and `ImpedanceSample` pairs. If either status is invalid, the result is `InvalidAcquisitionEvidence`; otherwise `NotCurrent` produces `CalibrationAbsent` for every token; otherwise the current-calibration token maps to `ReadyNoToken`, `ReadyTokenOne`, or `ReadyTokenTwo`.

QUAL-AUDIT-01: QUAL-EVID-01 has result-fiber sizes `18/3/1/1/1`: eighteen raw pairs contain at least one invalid status, three all-valid `NotCurrent` pairs collapse irrespective of token, and the three all-valid `Current` pairs remain token-distinct. This joint classification is neither bijective renaming nor routing.

READY-01: `calibrationReady` is true exactly for `{ReadyNoToken, ReadyTokenOne, ReadyTokenTwo}` and false for `CalibrationAbsent`; `InvalidAcquisitionEvidence` is consumed only by the higher-priority invalid case. PART-03 owns this applicability predicate as part of its case selection.

PRIORITY-01: PART-03 shall apply strict descending priority: any invalid qualified input; recovery gating; valid stop; valid start with or without calibration readiness; retained monitoring with ready calibration; otherwise stopped. Every generated case guard shall explicitly exclude all earlier priorities so exactly one effective case applies.

COMMAND-01: Every `MonitoringResolution` shall set `acquisitionCommand = CollectImpedance` exactly when `nextSessionMode = SessionMonitoring` and `nextRecoveryPhase = Normal`; all other resolutions shall set `HoldAcquisition`. CTRL-01 shall equal this committed field without a second decision.

DELIVERY-01: PART-04 shall output `Withheld` whenever the committed command is `HoldAcquisition`; with `CollectImpedance`, it shall map `ReadyNoToken` to `NoTokenAvailable`, `ReadyTokenOne` to `DeliverTokenOne`, and `ReadyTokenTwo` to `DeliverTokenTwo`. Any producer-admitted anomalous pairing of `CollectImpedance` with invalid or absent-calibration evidence shall also map to `Withheld`, while end-to-end analysis shall require that pairing to be unreachable.

STATUS-01: PART-05 shall output `InputFault` for `InputFaultDisposition`; otherwise `RecoveryPending` for `RecoveryDisposition`; otherwise `CalibrationRequired` for `StartDenied` or for the conjunction of `StoppedDisposition` and `CalibrationAbsent`; otherwise `Monitoring` when the committed command is `CollectImpedance`; otherwise `Stopped`. The order makes this a total and mutually exclusive local partition while allowing an accepted stop to report `Stopped` even if calibration is absent.

OUTPUT-01: For every selected CASE, post-state shall equal the resolution's two next-state fields, CTRL-01 shall equal COMMAND-01, CTRL-02 shall equal DELIVERY-01, and CTRL-03 shall equal STATUS-01 for that same resolution and evidence. No state field or controlled output may retain an unrelated old value or remain unconstrained.

## Exact twelve typed directed semantic interactions

INT-01: The root MON-01 shall provide `MonitoringRequestSample` to PART-01.

INT-02: The root MON-02 shall provide `CalibrationSample` to PART-02.

INT-03: The root MON-03 shall provide `ImpedanceSample` to PART-02.

INT-04: PART-01 shall provide `QualifiedRequest` to PART-03.

INT-05: PART-02 shall provide `AcquisitionEvidence` to PART-03.

INT-06: PART-03 shall provide `AcquisitionCommand` from its committed resolution to root CTRL-01.

INT-07: PART-03 shall provide `MonitoringResolution` to PART-04 for token-delivery derivation.

INT-08: PART-02 shall independently provide `AcquisitionEvidence` to PART-04 because PART-04 gates the token-bearing result.

INT-09: PART-04 shall provide `ImpedanceDelivery` to root CTRL-02.

INT-10: PART-03 shall independently provide `MonitoringResolution` to PART-05 for Doctor-status derivation.

INT-11: PART-02 shall independently provide `AcquisitionEvidence` to PART-05 because calibration absence affects the Doctor-visible result.

INT-12: PART-05 shall provide `MonitoringStatus` to root CTRL-03.

INT-AUDIT-01: The complete post-selection inventory is exactly INT-01 through INT-12: three boundary inputs, six inter-usage flows, and three boundary outputs. The repeated evidence and resolution flows have different consumers and owner-local derivations; no interaction is credited for routing, duplication, containment, visualization, or count attainment.

## Exactly twelve ordered nontrivial owner-local contract cases

CASE-01: If `QualifiedRequest = InvalidRequest` or `AcquisitionEvidence = InvalidAcquisitionEvidence`, then the resolution shall be `SessionStopped`, `AwaitNeutral`, `HoldAcquisition`, and `InputFaultDisposition`, regardless of all other current values or prior state.

CASE-02: Otherwise, if pre-state recovery is `AwaitNeutral` and the valid qualified request is not `NoQualifiedRequest`, then the resolution shall be `SessionStopped`, `AwaitNeutral`, `HoldAcquisition`, and `RecoveryDisposition`. The sampled nonneutral request shall not be replayed or acted upon.

CASE-03: Otherwise, if pre-state recovery is `AwaitNeutral` and the valid qualified request is `NoQualifiedRequest`, then the resolution shall be `SessionStopped`, `AwaitFreshRequest`, `HoldAcquisition`, and `RecoveryDisposition`. This neutral observation advances recovery but starts nothing.

CASE-04: Otherwise, if pre-state recovery is `AwaitFreshRequest` and the valid qualified request is `NoQualifiedRequest`, then the resolution shall remain `SessionStopped`, `AwaitFreshRequest`, `HoldAcquisition`, and `RecoveryDisposition`.

CASE-05: Otherwise, if pre-state recovery is `AwaitFreshRequest` and the valid qualified request is `QualifiedStop`, then the resolution shall be `SessionStopped`, `Normal`, `HoldAcquisition`, and `StopAccepted`. A fresh stop completes recovery without starting acquisition.

CASE-06: Otherwise, if pre-state recovery is `AwaitFreshRequest`, request is `QualifiedStart`, and `calibrationReady` is true, then the resolution shall be `SessionMonitoring`, `Normal`, `CollectImpedance`, and `StartAccepted`.

CASE-07: Otherwise, if pre-state recovery is `AwaitFreshRequest`, request is `QualifiedStart`, and `calibrationReady` is false, then the resolution shall be `SessionStopped`, `Normal`, `HoldAcquisition`, and `StartDenied`. The fresh request is consumed and must be presented again after calibration becomes current.

CASE-08: Otherwise, if pre-state recovery is `Normal` and the valid qualified request is `QualifiedStop`, then the resolution shall be `SessionStopped`, `Normal`, `HoldAcquisition`, and `StopAccepted`, regardless of prior session mode or valid evidence.

CASE-09: Otherwise, if pre-state recovery is `Normal`, request is `QualifiedStart`, and `calibrationReady` is true, then the resolution shall be `SessionMonitoring`, `Normal`, `CollectImpedance`, and `StartAccepted`.

CASE-10: Otherwise, if pre-state recovery is `Normal`, request is `QualifiedStart`, and `calibrationReady` is false, then the resolution shall be `SessionStopped`, `Normal`, `HoldAcquisition`, and `StartDenied`.

CASE-11: Otherwise, if pre-state recovery is `Normal`, request is `NoQualifiedRequest`, pre-state mode is `SessionMonitoring`, and `calibrationReady` is true, then the resolution shall be `SessionMonitoring`, `Normal`, `CollectImpedance`, and `MonitoringContinued`.

CASE-12: Otherwise, every remaining valid, normal-recovery, neutral-request combination shall resolve to `SessionStopped`, `Normal`, `HoldAcquisition`, and `StoppedDisposition`. This includes an already stopped session and automatic inhibition when current calibration is absent during a previously monitoring session.

CASE-AUDIT-01: CASE-01 through CASE-12 are exactly twelve counted nontrivial cases and form an ordered, total, effectively mutually exclusive partition over all qualified inputs and owner pre-states. Qualification relations, readiness, initialization, invariants, output mappings, scenario variants, and analyzer checks are mandatory but shall not be relabeled as extra cases.

## Required behavior, risk, fault response, and recovery

BEH-01: With all inputs valid, normal recovery, a fresh start, and current calibration, CASE-09 shall enter `SessionMonitoring` and command collection; later neutral evaluations with current calibration shall select CASE-11; a valid stop shall select CASE-08 and inhibit collection.

VER-BEH-01: Verify BEH-01 by contract inspection plus bounded scenario replay. Pass requires the exact state sequence `Stopped -> Monitoring -> Monitoring -> Stopped`, commands `Collect -> Collect -> Hold`, and no recovery state.

BEH-02: While monitoring with current calibration, `NoToken`, `TokenOne`, and `TokenTwo` shall all retain monitoring through CASE-11 but shall produce respectively `NoTokenAvailable`, `DeliverTokenOne`, and `DeliverTokenTwo`; thus data availability changes delivery without changing monitoring authorization.

VER-BEH-02: Verify BEH-02 by enumerating the three valid current-calibration token inputs against a monitoring pre-state. Pass requires identical owner next state and command for all three, three distinct DELIVERY-01 outputs, and zero token reinterpretation.

BEH-03: A fresh start with valid `NotCurrent` calibration shall select CASE-10 or CASE-07 according to recovery phase, remain stopped, hold acquisition, withhold delivery, and report `CalibrationRequired`; loss of current calibration during retained monitoring shall select CASE-12 with the same controlled outcomes.

VER-BEH-03: Verify BEH-03 by case and output analysis. Pass requires no `CollectImpedance` or delivered token in any all-valid `NotCurrent` combination and witnesses for CASE-07, CASE-10, and the monitoring-to-stopped branch of CASE-12.

RISK-01: If an invalid request, calibration sample, or impedance sample were trusted, or if a pre-fault start request were replayed after validity returned, the coordinator could command an acquisition session without admitted evidence. The bounded consequence is an incoherent logical acquisition decision; no physical harm, likelihood, severity, or safety classification is asserted.

FAULT-01: If any one, any pair, or all three root input statuses are invalid, CASE-01 shall apply in the same evaluation, set both state fields to the safe recovery configuration, output `HoldAcquisition`, output `Withheld`, and report `InputFault`.

VER-FAULT-01: Verify FAULT-01 by enumerating every raw input combination containing at least one invalid status from every owner pre-state. Pass requires CASE-01 exclusively, post-state `{SessionStopped, AwaitNeutral}`, and exact outputs `{HoldAcquisition, Withheld, InputFault}` for every witness.

RECOVERY-01: After FAULT-01, a restored-valid retained `StartMonitoring` or `StopMonitoring` shall remain blocked by CASE-02; a valid neutral request shall advance through CASE-03; repeated neutral requests shall wait through CASE-04; only a later fresh request may complete recovery through CASE-05, CASE-06, or CASE-07.

VER-RECOVERY-01: Verify RECOVERY-01 by bounded trace replay. Pass requires no collection command or token delivery before the fresh-request step, no replay of the retained nonneutral request, and exact final state/output for fresh stop, calibrated fresh start, and uncalibrated fresh start.

## Exactly five distinct scenario families

SCN-01: Nominal monitoring and collection shall start from INIT-01 with a valid current-calibration `StartMonitoring` and `NoToken` to witness CASE-09, use neutral `TokenOne` and `TokenTwo` evaluations to witness CASE-11 and distinct deliveries, then use `StopMonitoring` to witness CASE-08. Pass requires acquisition only between start and stop.

SCN-02: Calibration and data boundaries shall deny a valid start with `NotCurrent` through CASE-10, accept a later fresh valid start with `Current` through CASE-09, exercise all three token-delivery results while calibration remains current, then remove calibration under a neutral request to witness the inhibiting branch of CASE-12. Pass requires no token delivery when stopped or uncalibrated.

SCN-03: Invalid-input behavior shall independently invalidate request, calibration, and impedance status; then exercise each invalid-status pair and all three invalid together from stopped and monitoring pre-states. Pass requires FAULT-01 and VER-FAULT-01 for every variant.

SCN-04: Qualifying recovery shall enter CASE-01, retain `StartMonitoring` to witness CASE-02, supply `NoRequest` to witness CASE-03 and again to witness CASE-04, then supply a fresh current-calibration `StartMonitoring` to witness CASE-06. Pass requires `CollectImpedance` only on the final step.

SCN-05: Nonauthorizing recovery shall separately reach `AwaitFreshRequest`, use fresh `StopMonitoring` to witness CASE-05, then reach it again and use an uncalibrated fresh `StartMonitoring` to witness CASE-07; it shall also show a valid stopped neutral witness for CASE-12. Pass requires recovery completion without collection in every trace.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five scenario families with distinct behavioral traces: nominal session and delivery, calibration/data boundaries, invalid/fault coverage, qualifying fresh recovery, and nonauthorizing recovery. Together they witness CASE-01 through CASE-12 and the required nominal, boundary, invalid/fault, and recovery categories.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing exactly one finite request value and explicit status per logical evaluation and for presenting `NoRequest` before a post-fault request can be considered fresh. The three-value protocol and freshness rule are pilot assumptions, not source-defined Doctor authority or workflow.

ASM-02: CTX-02 is responsible for the calibration value and status. `Current` is treated as sufficient logical calibration evidence for monitoring authorization only within this abstract; no method, tolerance, duration, or physical correctness is implied.

ASM-03: CTX-03 is responsible for accepting CTRL-01 only as a logical request and for supplying one token/status pair per evaluation. A valid token does not prove that a commanded physical acquisition occurred, and an invalid token status triggers the conservative pilot fault policy.

ASM-04: CTX-04 is responsible only for receiving CTRL-02. It shall not infer image availability, reconstructability, quality, or clinical meaning from `NoTokenAvailable`, `DeliverTokenOne`, or `DeliverTokenTwo`.

ASM-05: All supplying contexts are responsible for holding their finite sample values stable for one logical evaluation. This assumption supports deterministic snapshot semantics and makes no real-time duration or synchronization claim.

CONSTR-01: All modeled behavioral domains shall remain finite and exactly match MON-01 through MON-03, CTRL-01 through CTRL-03, STATE-01, the qualified facts, and the resolution fields. Numeric impedance, timestamps, patient identifiers, image values, and physical units shall not be introduced as behavioral premises.

CONSTR-02: The model shall contain exactly one explicit root system usage, exactly five reachable responsibility-bearing semantic usages, exactly twelve typed directed semantic interactions, exactly twelve nontrivial owner-local contract cases, exactly five scenario families, semantic containment depth from one through two beneath the root, exactly one weakly connected semantic region, and exactly one principal decision owner.

CONSTR-03: Root, context actors, types, ports, containment, routing, library-mandated declarations, initialization, equations, invariants, analyzers, and scenario witnesses are excluded from semantic usage, interaction, case, scenario, and owner counts. No excluded artifact may receive count credit.

SUPPORT-01: Generated source may introduce only behavior-free containment and boundary-delegation support required by the trusted SysML-AADL mapping. Every such element shall be separately reported as uncounted `@generated-support`, shall preserve the exact INT endpoints and types, and shall not derive, store, select, or alter any domain fact.

## Trace, bounded analysis, and objective acceptance

TRACE-01: Every actionable identifier in this abstract shall trace to at least one retained model element, owner-local contract, bounded-analyzer check, or scenario witness; every significant generated element shall trace back to an abstract identifier or carry a specific `@generated-support <reason>` justification. Pass requires zero missing actionable IDs and zero unexplained generated elements.

TRACE-DISP-01: METHOD-01, FACT-SRC-01, FACT-SRC-02, CTX-05, and DEFER-01 are informational or deferred claim-boundary records; they require explicit retained disposition but no invented behavioral element. All other clauses are actionable design or acceptance obligations unless their text explicitly says they are uncounted evidence.

ANALYSIS-01: A deterministic bounded analyzer shall enumerate all `6 * 4 * 6 * 2 * 3 = 864` raw snapshots formed by request value/status, calibration value/status, impedance token/status, session mode, and recovery phase. It shall independently qualify the raw inputs, apply ordered priority, compute both next-state fields and all controlled outputs, and compare them with the retained owner-local contracts.

ANALYSIS-02: The same evidence shall report the induced `4 * 5 * 2 * 3 = 120` qualified owner-input/state snapshots, zero effective case gaps, zero effective overlaps after priority exclusion, zero qualification mismatches, zero next-state mismatches, zero command, delivery, or status mismatches, and at least one reachable witness for every CASE-01 through CASE-12.

ANALYSIS-03: The analyzer shall replay SCN-01 through SCN-05; check INIT-01, INVAR-01, FRESH-01, READY-01, PRIORITY-01, COMMAND-01, DELIVERY-01, STATUS-01, OUTPUT-01, and OWNER-01; enumerate all individual and combined invalid statuses; and report reachable owner states. It is revision-bound conformance evidence, not an architectural owner, executable system run, formal proof, safety proof, or clinical validation.

PASS-01: Structural acceptance requires the exact semantic tuple `5/12/12/5`, one root, semantic depth `1..2`, one weak semantic region, one principal owner, and separate reporting of all generated support, with no padded, identity-only, or untraced usage or interaction.

PASS-02: Behavioral acceptance requires CASE-01 through CASE-12 to remain owner-local to PART-03, total and effectively exclusive under PRIORITY-01, reachable by scenario or analyzer witness, and constraining complete resolution, post-state, and all three controlled outputs through OUTPUT-01.

PASS-03: Fault and recovery acceptance requires every individual and combined invalid-status snapshot to select CASE-01; restored stale nonneutral requests to remain blocked by CASE-02; neutral progression to require CASE-03 and permit CASE-04; and no resumed collection before a later fresh request selects CASE-06.

PASS-04: Ownership acceptance requires PART-03 as sole decision and state owner, each other PART to retain its specified nonidentity local derivation, no competing case or state owner, and no support element or analyzer to manufacture owner credit through forwarding or central recomputation.

PASS-05: Verification acceptance requires architecture-stage and final `hamr sysml tipe` success, directionally and type-compatible endpoints, complete trace coverage, exact counts, and successful bounded analysis. Code generation, execution, proof, safety assessment, and other deferred checks shall be reported `not-run`, never passed.

PASS-06: Designer validation separately requires fidelity to NEED-01, the exact finite boundary, the selected monitoring-and-acquisition purpose, all five scenarios, source limitations, pilot assumptions, and DEFER-01. Mechanical source conformance alone is insufficient.

PASS-07: Visualization acceptance requires exactly one `system-overview` bound to the accepted source revision and showing the root, five semantic usages, six boundary quantities, sole principal owner, and twelve directed semantic interactions without presenting context or generated support as semantic usages or implying physical acquisition or clinical success.

PASS-08: Campaign acceptance fails outside usages `5..8`, interactions `7..14`, cases `6..12`, or scenarios `4..6`; numeric compliance never compensates for a missing owner, finite branch, fresh-request recovery, trace, boundary responsibility, or meaningful behavioral path.

AUDIT-FINAL-01: The approved final design has exactly five semantic usages, twelve semantic interactions, twelve nontrivial contract cases, five scenario families, one root, semantic depth `1..2`, one weak semantic region, and one principal decision owner; every selected value lies within the frozen `small` bounds without padding.

AUDIT-FINAL-02: PART-03 owns both state variables, READY-01, PRIORITY-01, COMMAND-01, and all twelve cases; PART-01 and PART-02 own their complete qualification relations; PART-04 owns delivery gating; and PART-05 owns Doctor-status derivation. No state, decision, case, controlled output, or semantic interaction lacks an owner or has a competing owner.

AUDIT-FINAL-03: The approved complete partition covers invalidity, retained nonneutral recovery, neutral recovery entry and waiting, fresh stop, calibrated fresh start, uncalibrated fresh start, normal stop, calibrated normal start, uncalibrated normal start, active continuation with every token, stopped neutral behavior, and calibration-loss inhibition. INT-01 through INT-12 remain the complete post-revision interaction inventory.
