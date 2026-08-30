---
abstract_id: SA-MCD-MED-INITIAL-01
run_id: 20260813T234356Z-mining-cargo-docking-medium-r1-a1
domain_seed: 20260813T233942Z-mining-cargo-docking-seed-v1
campaign_complexity: medium
semantic_usage_count: 9
semantic_interaction_count: 21
nontrivial_contract_case_count: 20
scenario_family_count: 7
containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_executable_profile: false
---

# Station Cargo-Transfer Verification Supervisor

## Synopsis

NEED-01: A pilot and dock service need one bounded supervisory system that admits at most one station offload at a time, commands ship-side offload and warehouse-evidence requests, reconciles independent ship and warehouse observations, reports a verified or inhibited outcome, and latches contradictory or invalid evidence for explicit recovery.

PURPOSE-01: The system will supervise logical authorization and verification of a cargo offload while the frigate is docked; it does not move cargo, perform physical docking, repair the frigate, resupply support systems, or establish that any physical transfer actually occurred.

CAP-01: Principal capabilities are request and service qualification, explicit conflict arbitration, single-session lifecycle control, independent evidence qualification, two-source completion reconciliation, command safety gating, stakeholder-specific reporting, and recovery by a fresh reset followed by a later fresh start.

## Evidence and claim classes

EVID-HDBK-01: The Designer methodology requires an implementation-free need and boundary, explicit assumptions, cohesive responsibility allocation, alternatives, nominal and off-nominal behavior, traceability, objective verification criteria, and a separate later validation judgment; the handbooks do not supply mining-domain behavior or validate this policy.

EVID-SEED-01: Source-grounded seed facts are limited to a pilot-operated mining frigate, a station and warehouse context, cargo transfer and verification vocabulary, docked access to services, and possible ship, station, transfer, and warehouse observations or reports.

ABS-PILOT-01: The exact finite value sets, one-session boundary, freshness representation, evidence-reconciliation rule, priority order, terminal latch, recovery handshake, component allocation, cases, and scenarios below are pilot abstractions selected for this run because the reusable seed deliberately leaves them open.

SEL-ARCH-01: The selected architecture is evidence-and-session centered: qualification owners independently derive request, service, ship-evidence, and warehouse-evidence facts; an arbiter owns admission priority; one controller owns session state; a reconciler owns completion; and separate owners gate commands and compose reports.

CLAIM-01: Contract and bounded-analysis results may establish conformance to this finite abstract only; they shall not be described as proof of physical cargo movement, operational safety, game fidelity, certification, or production readiness.

## Goals

GOAL-01: The supervisor shall issue a begin-offload command only for a fresh start with cargo present, transfer service available, and an idle session.

GOAL-02: The supervisor shall report transfer verification only when an active session has both qualified ship-complete evidence and qualified matching warehouse-receipt evidence.

GOAL-03: The supervisor shall make invalid, failed, conflicting, stale, and priority-preempted conditions observable without treating them as successful transfer evidence.

GOAL-04: The supervisor shall preserve one deterministic priority order when service preemption, cancellation, completion, reset, and start conditions coincide.

GOAL-05: The supervisor shall require an explicit fresh-reset recovery handshake and a later fresh start before a new offload can begin after a terminal or recovery latch.

## Operational context and boundary

CTX-01: Pilot is outside the system, supplies transfer requests, and receives the pilot-oriented transfer report.

CTX-02: FrigateCargo is outside the system, supplies the abstract cargo-availability observation, and remains responsible for actual cargo and ore-hold behavior.

CTX-03: DockService is outside the system, supplies the mutually exclusive dock-service condition, receives the station-oriented report, and applies any physical docking or service policy not modeled here.

CTX-04: ShipTransferInterface is outside the system, supplies ship-side transfer evidence and receives the ship command; the interface does not make its evidence physically true merely by reporting it.

CTX-05: WarehouseInterface is outside the system, supplies receipt evidence and receives the receipt query; storage, warehouse bookkeeping, and cargo custody remain outside the boundary.

MON-01: transferRequest from CTX-01 has exact finite type `TransferRequest = {NONE, FRESH_START, REPEATED_START, FRESH_CANCEL, REPEATED_CANCEL, FRESH_RESET, REPEATED_RESET, INVALID}`; freshness and invalidity are explicit boundary facts rather than inferred timing.

MON-02: cargoState from CTX-02 has exact finite type `CargoState = {PRESENT, EMPTY, INVALID}` and describes only whether the proposed offload has cargo available.

MON-03: serviceCondition from CTX-03 has exact finite type `DockServiceCondition = {TRANSFER_AVAILABLE, UNDOCK_PRIORITY, SERVICE_HOLD, UNDOCKED, INVALID}`.

MON-04: transferEvidence from CTX-04 has exact finite type `ShipTransferEvidence = {IDLE, ACTIVE, COMPLETE, FAILED, INVALID}`.

MON-05: receiptEvidence from CTX-05 has exact finite type `WarehouseReceiptEvidence = {NO_RECEIPT, MATCHING_RECEIPT, CONFLICTING_RECEIPT, INVALID}`.

CTRL-01: shipCommand to CTX-04 has exact finite type `ShipCommand = {HOLD, BEGIN_OFFLOAD, STOP_OFFLOAD}` and is a supervisory request, not a claim of actuator response.

CTRL-02: receiptQuery to CTX-05 has exact finite type `WarehouseQuery = {NO_QUERY, REQUEST_RECEIPT}`.

CTRL-03: pilotReport to CTX-01 has exact finite type `PilotTransferReport = {IDLE, STARTED, IN_PROGRESS, VERIFIED, CANCELLED, INHIBITED, RECOVERY_REQUIRED, RESET_COMPLETE}`.

CTRL-04: stationReport to CTX-03 has exact finite type `StationTransferReport = {IDLE, OFFLOAD_ACTIVE, VERIFICATION_PENDING, VERIFIED, STOPPED, RECOVERY_REQUIRED, RESET_COMPLETE}`.

BOUND-01: The finite boundary is exactly MON-01 through MON-05 and CTRL-01 through CTRL-04; no clock, duration, transaction identifier, cargo quantity, physical-dock command, repair input, or resupply input is in scope.

## Pilot assumptions and constraints

ASM-01: CTX-01 is responsible for classifying a request as fresh or repeated and never relabels an unchanged request as fresh; this assumption is necessary because the boundary intentionally has no time or request identifier.

ASM-02: CTX-02 is responsible for making cargoState pertain to the one proposed offload, and CTX-04 and CTX-05 are responsible for making their evidence pertain to the sole logical session; overlapping sessions are excluded.

ASM-03: CTX-03 is responsible for supplying exactly one current DockServiceCondition value per evaluation; `TRANSFER_AVAILABLE` is the only value that permits a begin command.

ASM-04: CTX-04 and CTX-05 may disagree or be invalid, so neither evidence source is trusted alone; disagreement is handled by policy rather than assumed away.

ASM-05: The modeled behavior advances in discrete logical evaluations with one value for each monitored quantity and one pre-state; no wall-clock bound or physical response latency is assumed.

ASM-06: A later fresh request is distinguishable from the fresh reset that cleared a latch; reset and start cannot be collapsed into one boundary event.

CONSTR-01: The system shall supervise at most one logical transfer session and shall not automatically retry a stopped or recovery-latched transfer.

CONSTR-02: Initialization shall set the sole persistent session state to `IDLE` and shall produce `HOLD`, `NO_QUERY`, `IDLE`, and `IDLE`; initialization is required but receives no nontrivial case credit.

## Exact internal finite concepts

TYPE-01: `QualifiedRequest = {NO_NEW_REQUEST, START_CANDIDATE, REJECT_EMPTY, CANCEL_CANDIDATE, RESET_CANDIDATE, INPUT_FAULT}`.

TYPE-02: `ServiceEligibility = {READY, PREEMPT_UNDOCK, INELIGIBLE, SERVICE_FAULT}`; SERVICE_HOLD and UNDOCKED intentionally collapse to the same supervisory ineligibility fact.

TYPE-03: `SessionState = {IDLE, COMMANDING, AWAITING_EVIDENCE, VERIFIED, STOPPED_BY_CANCEL, STOPPED_BY_UNDOCK, STOPPED_BY_SERVICE, RECOVERY_REQUIRED}`.

TYPE-04: `AdmittedDirective = {HOLD, BEGIN, CANCEL, PREEMPT_UNDOCK, PREEMPT_SERVICE, ENTER_RECOVERY, RESET, REJECT_EMPTY, REJECT_INELIGIBLE}`.

TYPE-05: `SessionExpectation = {NONE, ACTIVE_TRANSFER, RECOVERY_CHECK}`.

TYPE-06: `ShipFinding = {NEUTRAL, RECOVERY_NEUTRAL, NOT_COMPLETE, COMPLETE, FAULT}` and `WarehouseFinding = {NEUTRAL, RECOVERY_NEUTRAL, MISSING, MATCH, FAULT}`; the distinct recovery-neutral values let PART-07 recognize a clearable recovery without receiving or recomputing SessionExpectation.

TYPE-07: `VerificationDisposition = {NEUTRAL, AWAITING, VERIFIED, RECOVERY_REQUIRED, RECOVERY_CLEARABLE}`.

TYPE-08: `CommandProposal = {HOLD_NO_QUERY, BEGIN_WITH_QUERY, HOLD_WITH_QUERY, STOP_NO_QUERY}`.

TYPE-09: `SessionSnapshot` is the finite pair of the next SessionState and `SessionResult = {NONE, STARTED, WAITING, VERIFIED, CANCELLED, INHIBITED, RECOVERY_REQUIRED, RESET_COMPLETE}`; not every pair need be reachable.

## Selected semantic usages and ownership

PART-01: RequestQualifier owns QualifiedRequest and derives it from transferRequest and cargoState; it distinguishes actionable freshness, empty-cargo rejection, and input fault rather than forwarding either input.

PART-02: ServiceReadinessQualifier owns ServiceEligibility and derives the distinct readiness, preemption, hold, undocked, and service-fault meanings from serviceCondition.

PART-03: PriorityArbiter owns AdmittedDirective and combines QualifiedRequest, ServiceEligibility, and the SessionState pre-state to resolve admission, cancellation, reset eligibility, recovery entry, and service preemption.

PART-04: SessionController is the sole persistent state owner, owns the next SessionState, SessionExpectation, CommandProposal, and SessionSnapshot, and combines the admitted directive with VerificationDisposition under the declared transition priority.

PART-05: ShipEvidenceQualifier owns ShipFinding and qualifies transferEvidence against SessionExpectation so expected progress, completion, neutral recovery evidence, failure, invalidity, and unexpected evidence are not aliases.

PART-06: WarehouseEvidenceQualifier owns WarehouseFinding and qualifies receiptEvidence against SessionExpectation so missing, matching, neutral recovery, conflicting, invalid, and unexpected evidence remain distinct.

PART-07: CompletionReconciler owns VerificationDisposition and combines the two qualified findings; it is the only owner allowed to assert VERIFIED or RECOVERY_CLEARABLE.

PART-08: CommandSafetyGate owns shipCommand and receiptQuery and derives them jointly from CommandProposal plus current ServiceEligibility; it shall suppress a proposed begin or query when service is no longer READY and is not a forwarding wrapper.

PART-09: OutcomeReporter owns both public report types and derives different pilot and station views from the state and result fields of SessionSnapshot; its mappings are many-to-one and shall hide no recovery or stopped condition.

OWN-AUDIT-01: Decision and qualification owners are PART-01, PART-02, PART-03, PART-05, PART-06, PART-07, PART-08, and PART-09; PART-04 is the unique persistent state owner and also derives state-dependent decisions. Every credited usage derives at least one owner-local finite fact from assigned inputs, and no root, context actor, support container, route, payload wrapper, or analyzer receives semantic-usage or owner credit.

## Exact interaction inventory

INT-01: Pilot.transferRequest -> RequestQualifier.transferRequest : TransferRequest

INT-02: FrigateCargo.cargoState -> RequestQualifier.cargoState : CargoState

INT-03: DockService.serviceCondition -> ServiceReadinessQualifier.serviceCondition : DockServiceCondition

INT-04: ShipTransferInterface.transferEvidence -> ShipEvidenceQualifier.transferEvidence : ShipTransferEvidence

INT-05: WarehouseInterface.receiptEvidence -> WarehouseEvidenceQualifier.receiptEvidence : WarehouseReceiptEvidence

INT-06: RequestQualifier.qualifiedRequest -> PriorityArbiter.qualifiedRequest : QualifiedRequest

INT-07: ServiceReadinessQualifier.serviceEligibility -> PriorityArbiter.serviceEligibility : ServiceEligibility

INT-08: SessionController.sessionPrestate -> PriorityArbiter.sessionPrestate : SessionState

INT-09: PriorityArbiter.admittedDirective -> SessionController.admittedDirective : AdmittedDirective

INT-10: SessionController.shipExpectation -> ShipEvidenceQualifier.sessionExpectation : SessionExpectation

INT-11: SessionController.warehouseExpectation -> WarehouseEvidenceQualifier.sessionExpectation : SessionExpectation

INT-12: ShipEvidenceQualifier.shipFinding -> CompletionReconciler.shipFinding : ShipFinding

INT-13: WarehouseEvidenceQualifier.warehouseFinding -> CompletionReconciler.warehouseFinding : WarehouseFinding

INT-14: CompletionReconciler.verificationDisposition -> SessionController.verificationDisposition : VerificationDisposition

INT-15: SessionController.commandProposal -> CommandSafetyGate.commandProposal : CommandProposal

INT-16: ServiceReadinessQualifier.gateEligibility -> CommandSafetyGate.serviceEligibility : ServiceEligibility

INT-17: SessionController.sessionSnapshot -> OutcomeReporter.sessionSnapshot : SessionSnapshot

INT-18: CommandSafetyGate.shipCommand -> ShipTransferInterface.shipCommand : ShipCommand

INT-19: CommandSafetyGate.receiptQuery -> WarehouseInterface.receiptQuery : WarehouseQuery

INT-20: OutcomeReporter.pilotReport -> Pilot.transferReport : PilotTransferReport

INT-21: OutcomeReporter.stationReport -> DockService.transferReport : StationTransferReport

INT-AUDIT-01: The complete post-selection recount is exactly 21 end-to-end semantic interactions: five boundary-input deliveries, twelve owner-to-owner fact flows, and four boundary-output deliveries. The two expectation deliveries and two ServiceEligibility deliveries are intentional fan-outs to owners that derive different local facts; routing refinements do not create new semantic interactions.

## Owner-local total relations

LOCAL-01: PART-01 shall map INVALID transferRequest or INVALID cargoState to INPUT_FAULT first; otherwise it shall map FRESH_START with PRESENT to START_CANDIDATE, FRESH_START with EMPTY to REJECT_EMPTY, FRESH_CANCEL to CANCEL_CANDIDATE, FRESH_RESET to RESET_CANDIDATE, and NONE or any repeated request to NO_NEW_REQUEST.

LOCAL-02: PART-02 shall map TRANSFER_AVAILABLE to READY, UNDOCK_PRIORITY to PREEMPT_UNDOCK, SERVICE_HOLD or UNDOCKED to INELIGIBLE, and INVALID to SERVICE_FAULT; the deliberate many-to-one qualification derives whether ordinary service is unavailable without pretending the supervisor controls or explains the physical cause.

LOCAL-03: PART-03 shall derive its directive by the policy order in POL-PRIOR-01, shall admit BEGIN only from IDLE with START_CANDIDATE and READY, and shall admit RESET only from a terminal or recovery state with RESET_CANDIDATE and READY.

LOCAL-04: PART-04 shall use the pre-state for INT-08, derive ACTIVE_TRANSFER expectation for either active state, RECOVERY_CHECK for RECOVERY_REQUIRED, and NONE otherwise, then consume INT-09 and INT-14 to derive exactly one next SessionState. It shall propose BEGIN_WITH_QUERY only on IDLE-to-COMMANDING, HOLD_WITH_QUERY while remaining active, STOP_NO_QUERY only when leaving an active state for a stopped or recovery state, and HOLD_NO_QUERY otherwise; its SessionResult is respectively STARTED, WAITING, VERIFIED, CANCELLED, INHIBITED, RECOVERY_REQUIRED, RESET_COMPLETE, or NONE for the corresponding transition, without recomputing upstream qualification.

LOCAL-05: PART-05 shall map ship IDLE to NEUTRAL for NONE and to RECOVERY_NEUTRAL for RECOVERY_CHECK; under ACTIVE_TRANSFER, IDLE or ACTIVE maps to NOT_COMPLETE and COMPLETE maps to COMPLETE; FAILED, INVALID, and any activity or completion outside ACTIVE_TRANSFER map to FAULT.

LOCAL-06: PART-06 shall map NO_RECEIPT to NEUTRAL for NONE, RECOVERY_NEUTRAL for RECOVERY_CHECK, and MISSING for ACTIVE_TRANSFER; MATCHING_RECEIPT maps to MATCH only for ACTIVE_TRANSFER; CONFLICTING_RECEIPT, INVALID, and any receipt outside ACTIVE_TRANSFER map to FAULT.

LOCAL-07: PART-07 shall derive RECOVERY_REQUIRED if either finding is FAULT, RECOVERY_CLEARABLE only from two RECOVERY_NEUTRAL findings, VERIFIED only from COMPLETE plus MATCH, AWAITING for all remaining pairs composed of NOT_COMPLETE or COMPLETE with MISSING or MATCH, and NEUTRAL only from two NEUTRAL findings.

LOCAL-08: PART-08 shall preserve STOP, shall authorize BEGIN_WITH_QUERY only while eligibility is READY, shall authorize HOLD_WITH_QUERY only while READY, and otherwise shall output HOLD with NO_QUERY; any loss of READY suppresses BEGIN and REQUEST_RECEIPT in the same evaluation.

LOCAL-09: PART-09 shall map IDLE/NONE to both IDLE, IDLE/RESET_COMPLETE to both RESET_COMPLETE, IDLE/CANCELLED to pilot CANCELLED and station IDLE, IDLE/INHIBITED to pilot INHIBITED and station IDLE, COMMANDING to pilot STARTED or IN_PROGRESS and station OFFLOAD_ACTIVE, AWAITING_EVIDENCE to pilot IN_PROGRESS and station VERIFICATION_PENDING, VERIFIED to both VERIFIED, STOPPED_BY_CANCEL to pilot CANCELLED and station STOPPED, other stopped state to pilot INHIBITED and station STOPPED, and RECOVERY_REQUIRED to both RECOVERY_REQUIRED.

## Priority, lifecycle, and recovery policy

POL-PRIOR-01: The first applicable result wins in this order: input or service fault and reconciled evidence fault; active-session service preemption or idle fresh-request inhibition; active FRESH_CANCEL; qualified two-source completion; qualified fresh reset; eligible idle FRESH_START; nonterminal progress; otherwise state hold. Thus cancellation beats simultaneous completion, and dock-service preemption beats cancellation, completion, continuation, and a fresh start without rewriting an already latched terminal outcome.

POL-CONFLICT-01: The required explicit priority conflict occurs when a fresh start or an active transfer coincides with UNDOCK_PRIORITY: PART-03 shall inhibit or preempt the transfer, PART-04 shall not enter VERIFIED even if completion evidence coincides, and PART-08 shall issue no begin and shall issue stop when an active command must be withdrawn.

POL-STATE-01: IDLE may enter COMMANDING only after BEGIN; COMMANDING may progress to AWAITING_EVIDENCE; either active state may enter VERIFIED, a specific stopped state, or RECOVERY_REQUIRED; VERIFIED and all stopped states are terminal latches; RECOVERY_REQUIRED is a fault latch; only a qualified fresh reset can return a terminal latch to IDLE.

POL-REC-01: RECOVERY_REQUIRED shall persist for NONE, repeated requests, fresh start, fresh cancel, ineligible reset, or nonneutral evidence; it may clear only when the current request is FRESH_RESET, service is READY, ship evidence is IDLE, warehouse evidence is NO_RECEIPT, and PART-07 derives RECOVERY_CLEARABLE.

POL-FRESH-01: Clearing any terminal or recovery latch produces RESET_COMPLETE and HOLD/NO_QUERY; it shall not also begin offload. A subsequent evaluation containing FRESH_START with cargo PRESENT and service READY is required to re-enter COMMANDING.

## Exact nontrivial contract partition

CASE-01: Owner PART-04; from IDLE with noninvalid request, cargo, and service plus neutral evidence and NONE, any repeated request, or a reset request that is not clearing a latch, the next state is IDLE and outputs are HOLD, NO_QUERY, and idle-equivalent reports.

CASE-02: Owner PART-04 cooperating with PART-01, PART-02, PART-03, and PART-08; from IDLE, FRESH_START plus PRESENT plus TRANSFER_AVAILABLE and neutral evidence yields COMMANDING, BEGIN_OFFLOAD, REQUEST_RECEIPT, STARTED, and OFFLOAD_ACTIVE.

CASE-03: Owner PART-01 cooperating with PART-04; from IDLE, FRESH_START plus EMPTY plus TRANSFER_AVAILABLE with otherwise valid inputs yields REJECT_EMPTY, leaves IDLE, emits no command or query, and reports INHIBITED to the pilot.

CASE-04: Owner PART-03 cooperating with PART-04; from IDLE, a valid FRESH_START or FRESH_CANCEL with noninvalid cargo but SERVICE_HOLD, UNDOCKED, or UNDOCK_PRIORITY yields REJECT_INELIGIBLE or the corresponding preemption directive, leaves IDLE, and emits no begin or query.

CASE-05: Owner PART-01 cooperating with PART-04; INVALID transferRequest or INVALID cargoState, regardless of lower-priority inputs, yields INPUT_FAULT and RECOVERY_REQUIRED with no begin or receipt query.

CASE-06: Owner PART-02 cooperating with PART-04; when request and cargo are not invalid but serviceCondition is INVALID, SERVICE_FAULT yields RECOVERY_REQUIRED with no begin or receipt query.

CASE-07: Owner PART-05 cooperating with PART-07 and PART-04; when preceding fault cases do not apply and an active session observes FAILED or INVALID ship evidence, the result is RECOVERY_REQUIRED.

CASE-08: Owner PART-06 cooperating with PART-07 and PART-04; when preceding fault cases do not apply, ship evidence is nonfault, and an active session observes CONFLICTING_RECEIPT or INVALID receipt evidence, the result is RECOVERY_REQUIRED.

CASE-09: Owner PART-07 cooperating with PART-04; when no earlier fault applies, any ACTIVE or COMPLETE ship evidence or any receipt other than NO_RECEIPT outside an active session is unexpected and yields RECOVERY_REQUIRED.

CASE-10: Owner PART-03 cooperating with PART-04 and PART-08; in an active session with otherwise nonfault inputs, UNDOCK_PRIORITY yields STOPPED_BY_UNDOCK, STOP_OFFLOAD, NO_QUERY, and nonverified stopped reports even if completion evidence also matches.

CASE-11: Owner PART-03 cooperating with PART-04 and PART-08; in an active session with otherwise nonfault inputs, SERVICE_HOLD or UNDOCKED yields STOPPED_BY_SERVICE, STOP_OFFLOAD, NO_QUERY, and stopped reports.

CASE-12: Owner PART-03 cooperating with PART-04 and PART-08; in an active session with service READY and otherwise nonfault inputs, FRESH_CANCEL yields STOPPED_BY_CANCEL and STOP_OFFLOAD even when ship COMPLETE and warehouse MATCHING_RECEIPT occur in the same evaluation.

CASE-13: Owner PART-03 cooperating with PART-04; from IDLE with valid nonpreempting inputs, FRESH_CANCEL leaves IDLE, emits HOLD and NO_QUERY, and emits a pilot CANCELLED result without inventing an active transfer.

CASE-14: Owner PART-07 cooperating with PART-04; in COMMANDING or AWAITING_EVIDENCE with no higher-priority case, ship ACTIVE plus NO_RECEIPT yields AWAITING, next state AWAITING_EVIDENCE, HOLD, REQUEST_RECEIPT, and in-progress reports.

CASE-15: Owner PART-07 cooperating with PART-04; every nonfault, nonverified active evidence pair not already in CASE-14, including COMPLETE plus NO_RECEIPT or noncomplete ship evidence plus MATCH, yields AWAITING and never VERIFIED.

CASE-16: Owner PART-07 cooperating with PART-04 and PART-09; with an active session, service READY, no higher-priority request, ship COMPLETE, and warehouse MATCHING_RECEIPT, VERIFIED yields state VERIFIED, HOLD, NO_QUERY, and VERIFIED in both reports.

CASE-17: Owner PART-04; a terminal or RECOVERY_REQUIRED pre-state with no admissible FRESH_RESET, including NONE, any repeated request, FRESH_START, or FRESH_CANCEL, remains latched and cannot issue BEGIN_OFFLOAD.

CASE-18: Owner PART-04 cooperating with PART-03 and PART-07; after preceding invalid or unexpected-evidence cases are excluded, RECOVERY_REQUIRED plus FRESH_RESET and neutral recovery evidence remains RECOVERY_REQUIRED when service is not READY.

CASE-19: Owner PART-04 cooperating with PART-03 and PART-07; RECOVERY_REQUIRED plus FRESH_RESET, READY service, ship IDLE, and NO_RECEIPT yields RECOVERY_CLEARABLE, returns IDLE, emits RESET_COMPLETE reports, and emits HOLD with NO_QUERY.

CASE-20: Owner PART-04; VERIFIED or any stopped state plus FRESH_RESET, READY service, and neutral ship/warehouse evidence returns IDLE with RESET_COMPLETE and HOLD/NO_QUERY, while POL-FRESH-01 requires a later FRESH_START before CASE-02 can recur.

CASE-ORDER-01: The bounded classifier shall use first-match order `05, 06, 07, 08, 09, 10, 11, 12, 14, 16, 15, 02, 03, 04, 13, 01, 19, 18, 20, 17`; state-domain guards make inapplicable active, idle, recovery, and terminal cases fall through, and no implicit default exists beyond CASE-17 or CASE-01 in their stated domains.

PARTITION-AUDIT-01: CASE-01 through CASE-20 are evaluated with the precedence in POL-PRIOR-01 and the explicit exclusions stated in later cases, making them mutually exclusive and exhaustive over all 19,200 combinations of five boundary inputs and the eight SessionState pre-states; initialization and direct finite mappings receive no case credit.

PARTITION-AUDIT-02: The Designer cross-product audit produced nonzero populations for every ordered case—`[40, 1, 1, 12, 8000, 2240, 896, 672, 6384, 168, 336, 24, 2, 24, 96, 24, 264, 6, 2, 8]` for CASE-01 through CASE-20, totaling 19,200—and the Model analyzer shall independently reproduce this vector rather than trust it as proof.

CASE-AUDIT-01: The 20 credited cases have distinct behavioral traces and named primary owners: PART-01 owns CASE-03 and CASE-05, PART-02 owns CASE-06, PART-03 owns CASE-04 and CASE-10 through CASE-13, PART-05 owns CASE-07, PART-06 owns CASE-08, PART-07 owns CASE-09 and CASE-14 through CASE-16, and PART-04 owns CASE-01, CASE-02, and CASE-17 through CASE-20; PART-08 and PART-09 retain nontrivial local output contracts but do not receive padded case credit.

## Required behavior and fault response

BEH-01: On the CASE-02 condition the system shall begin exactly one logical transfer, request receipt evidence, and enter COMMANDING; no other case shall produce BEGIN_OFFLOAD.

VER-BEH-01: Source inspection plus bounded contract analysis passes only if CASE-02 alone produces BEGIN_OFFLOAD and every remaining snapshot produces HOLD or STOP_OFFLOAD.

BEH-02: During an active nonfault session the system shall remain unverified until both qualified evidence owners support completion, then CASE-16 shall produce the sole VERIFIED transition and reports.

VER-BEH-02: Exhaustive bounded analysis passes only if VERIFIED is equivalent to an active pre-state with COMPLETE plus MATCH, READY service, and absence of every higher-priority case.

BEH-03: A terminal or recovery latch shall persist until the exact fresh-reset condition applies, and the clearing evaluation shall not also begin a transfer.

VER-BEH-03: Sequence analysis passes only if repeated reset and fresh start cannot clear a latch, CASE-19 and CASE-20 clear to IDLE with HOLD, and a later distinct CASE-02 evaluation is needed to begin again.

RISK-01: If a begin or verified outcome were derived from stale, invalid, single-source, or service-preempted evidence, the supervisor could report an offload that its selected logical evidence does not justify.

FAULT-01: The system shall mitigate RISK-01 by mapping invalid request, cargo, service, ship, or warehouse evidence and unexpected inactive evidence to RECOVERY_REQUIRED with begin and query suppressed.

VER-FAULT-01: Bounded case analysis passes only if CASE-05 through CASE-09 enter or preserve RECOVERY_REQUIRED and neither public report is VERIFIED.

FAULT-02: The system shall mitigate simultaneous service and transfer demands by applying CASE-10 through CASE-12 priority, producing a stopped rather than verified result.

VER-FAULT-02: Scenario and contract analysis passes only if UNDOCK_PRIORITY outranks cancel and completion, and cancel outranks completion, for every active pre-state.

FAULT-03: The system shall mitigate partial evidence by holding AWAITING_EVIDENCE with continued receipt query rather than inventing success or automatically retrying the offload.

VER-FAULT-03: Bounded analysis passes only if every nonfault active evidence pair except COMPLETE plus MATCH maps to AWAITING and never to VERIFIED.

## Observable modes and transitions

MODE-01: Idle mode corresponds to SessionState IDLE and observably permits a qualified fresh start while producing idle outputs otherwise.

MODE-02: Active mode corresponds to COMMANDING or AWAITING_EVIDENCE and observably permits receipt queries, progress, completion, cancellation, or preemption.

MODE-03: Terminal mode corresponds to VERIFIED or any stopped state and observably blocks new starts until a qualified fresh reset.

MODE-04: Recovery mode corresponds to RECOVERY_REQUIRED and observably suppresses begin/query and requires the stricter recovery-clear evidence in POL-REC-01.

TRANS-01: IDLE transitions to COMMANDING only on CASE-02.

TRANS-02: COMMANDING transitions to AWAITING_EVIDENCE on CASE-14 or CASE-15.

TRANS-03: Either active state transitions to VERIFIED only on CASE-16, to a stopped state on CASE-10 through CASE-12, or to RECOVERY_REQUIRED on CASE-05 through CASE-08.

TRANS-04: Any inactive state transitions to RECOVERY_REQUIRED on CASE-05, CASE-06, or CASE-09.

TRANS-05: RECOVERY_REQUIRED transitions to IDLE only on CASE-19, and a terminal state transitions to IDLE only on CASE-20.

## Required scenario families

SCN-01: Nominal offload traces IDLE, a qualified FRESH_START, COMMANDING, ship ACTIVE with no receipt, AWAITING_EVIDENCE, ship COMPLETE plus MATCHING_RECEIPT, and VERIFIED.

SCN-02: Freshness and cargo boundary traces an empty-cargo fresh start to inhibition, a repeated start to no new command, and a later cargo-present FRESH_START to admission.

SCN-03: Dock-service priority traces both an IDLE fresh-start conflict and an active-transfer conflict with UNDOCK_PRIORITY, including coincident complete/matching evidence, and requires inhibition or STOPPED_BY_UNDOCK rather than VERIFIED.

SCN-04: Cancellation priority traces an active session with FRESH_CANCEL and simultaneous complete/matching evidence to STOPPED_BY_CANCEL, then demonstrates that a repeated cancel cannot restart or clear it.

SCN-05: Partial-evidence qualification traces COMPLETE plus NO_RECEIPT and noncomplete plus MATCHING_RECEIPT as AWAITING_EVIDENCE with no VERIFIED report.

SCN-06: Fault containment traces invalid ship evidence, conflicting warehouse evidence, and unexpected completion while inactive into the same recovery latch without issuing begin, query, or verified reports.

SCN-07: Recovery and fresh re-entry traces a repeated reset that fails to clear, a fresh reset with nonneutral evidence that fails to clear, a fresh reset with READY/IDLE/NO_RECEIPT that clears to IDLE, and a later distinct FRESH_START that begins a new session.

SCN-AUDIT-01: The exact seven scenario families cover nominal, boundary freshness, explicit service priority, cancel-versus-completion priority, partial evidence, invalid/unexpected evidence, and complete recovery/re-entry; no family is a renamed instance of another.

## Structural and realization bounds

STRUCT-01: The accepted semantic architecture shall have exactly one explicit root system usage, exactly nine reachable responsibility-bearing usages realizing PART-01 through PART-09, exactly 21 end-to-end semantic interactions realizing INT-01 through INT-21, semantic containment depth within 1..2 beneath the root, and one weakly connected semantic region.

STRUCT-02: A Model realization may introduce at most one behavior-free support container and the minimum delegation routes needed by trusted SysML-AADL containment; such support shall be traced as generated support and shall not receive semantic usage, owner, interaction, or case credit.

STRUCT-03: All nine semantic usages shall participate in a boundary-relevant path, no interaction may be merged merely because two values share a type, and any concrete routing hops shall refine exactly one listed INT identifier rather than increase the semantic interaction count.

STRUCT-04: The Model shall retain PART-04 as the only persistent state owner; pre-state feedback on INT-08 shall not be implemented as a same-evaluation algebraic cycle or replicated state in PART-03.

## Analysis and trace obligations

ANALYSIS-01: A deterministic dependency-free bounded analyzer shall enumerate exactly `8 * 3 * 5 * 5 * 4 * 8 = 19,200` boundary-input/pre-state snapshots and independently check the owner-local relations, priority, next state, four outputs, exclusivity, exhaustiveness, and all 20 cases.

ANALYSIS-02: The analyzer shall also retain ordered traces for all seven scenario families, including terminal persistence, the stricter recovery-clear condition, and the later-fresh-start requirement; this evidence is bounded conformance analysis, not unbounded temporal proof.

TRACE-01: Every actionable identifier in this abstract shall trace to one or more model elements or be explicitly deferred, and every significant model component, port, connection, state, and contract clause shall trace back or carry a specific generated-support justification.

TRACE-02: GUMBO clauses shall preserve owner locality: PART-01 through PART-09 may consume only their inventoried inputs and owned pre-state, and the analyzer shall not hide central recomputation of another owner's derivation.

## Objective pass criteria

PASS-01: Structural inspection shall report exactly one root, nine credited semantic usages, 21 semantic interactions, containment depth 1..2, one weak semantic region, no padded owner, and no unexplained usage or interaction.

PASS-02: Boundary/type inspection shall find exactly the five finite inputs and four finite outputs in BOUND-01 with the value domains stated in MON-01 through CTRL-04 and no additional operational boundary quantity.

PASS-03: Interaction inspection shall match INT-01 through INT-21 one-for-one end to end; the recount shall remain five boundary inputs, twelve inter-usage flows, and four boundary outputs after all routing refinements.

PASS-04: Ownership inspection shall find one reviewable local derivation for every PART usage, a single persistent state owner, no forwarding-only credited usage, and no owner recomputation outside LOCAL-01 through LOCAL-09.

PASS-05: Contract analysis shall show exactly 20 credited nontrivial cases, mutual exclusivity under POL-PRIOR-01, exhaustive coverage of all 19,200 snapshots, output completeness, and no unreachable case used as count padding.

PASS-06: Scenario evidence shall contain all seven distinct SCN families with every required step and expected state/output, including fresh-request, simultaneous-conflict, partial-evidence, recovery, and re-entry traces.

PASS-07: Architecture-stage and final independent-harness Sireum typechecking shall pass with resolved, direction-compatible, type-compatible connection endpoints and well-typed owner-local contracts.

PASS-08: Bidirectional trace analysis shall report no missing abstract identifier and no unexplained significant model element; generated support shall have specific justifications and receive no semantic credit.

PASS-09: The retained analyzer shall complete the exact snapshot enumeration and scenario traces deterministically within the harness watchdog with zero relation, partition, priority, state, or output mismatch.

PASS-10: The sole `system-overview` shall bind to the accepted source revision and visibly preserve the boundary, nine responsibilities, sole state owner, cooperating decision owners, principal evidence/recovery paths, and priority conflict without presenting context or routing support as semantic usages.

PASS-11: Final Designer validation shall separately confirm fitness to NEED-01, the selected station-transfer-verification scope, all seven scenario families, source limitations, pilot assumptions, and deferred claims; mechanical conformance alone is insufficient.

AUDIT-FINAL-01: The retained initial campaign tuple is exactly `9 semantic usages / 21 semantic interactions / 20 nontrivial contract cases / 7 scenario families`, within the medium bounds `8..12 / 15..21 / 12..20 / 6..9` and supported by distinct responsibilities or traces.

AUDIT-FINAL-02: Owners are closed: PART-01, PART-02, PART-03, PART-05, PART-06, PART-07, PART-08, and PART-09 own local qualifications or decisions; PART-04 uniquely owns state; every case has a primary result owner; and no root, container, route, data wrapper, or analyzer is credited.

AUDIT-FINAL-03: The finite partition includes initialization, no/repeated request, fresh start, empty cargo, ineligible service, fresh cancel, simultaneous completion conflicts, partial completion, invalid and unexpected evidence, terminal persistence, repeated and blocked reset, successful recovery, and later fresh re-entry; INT-01 through INT-21 remain the complete recounted inventory.

## Deferred and excluded claims

DEFER-01: Physical docking and undocking mechanisms, docking duration, travel, asteroid mining, ore economics, extraction performance, cargo quantity or identity, repair, resupply, capacitor behavior, combat, and multi-session scheduling are outside this system boundary.

DEFER-02: Timeouts, automated retries, redundant evidence sources, cryptographic or transactional correlation, probability, severity classification, physical effectiveness, safety, certification, game fidelity, code generation, application execution, and formal proof are not run requirements and shall remain explicitly not claimed.

DEFER-03: The campaign may later investigate transaction identifiers or executable profiles, but neither is silently approximated by the finite freshness and one-session assumptions in this initial abstract.
