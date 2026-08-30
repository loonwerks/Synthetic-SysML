---
abstract_id: SA-MTR-THREAT-20260813-HR2-A1
domain_seed: mining-threat-retreat-20260813T195454Z-v1
campaign_complexity: hard
semantic_usage_count: 15
semantic_interaction_count: 32
nontrivial_contract_case_count: 29
scenario_family_count: 12
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
containment_depth_bounds: [1, 2]
root_system_usage_count: 1
weakly_connected_region_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
requires_multiple_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
executable_profile: false
status: approved
---

# Frigate threat evidence and protective-departure coordination

## Synopsis

NEED-01: A pilot-operated mining frigate needs a bounded threat-response function that turns finite contact evidence into a persistent alert, reports that alert, and coordinates defense activation with retreat-oriented departure without taking ownership of mining, cargo, offload, resupply, docking, or general mission selection.

PURPOSE-01: For each coherent evaluation, the system shall publish one response frame containing a threat report, independent defense and departure directives, an observable response stage, and the actual states of the two protective channels.

SCOPE-01: The controlled purpose is threat evidence, reporting, defense activation, and retreat-oriented navigation for one frigate; mining contributes only an external equipment-safe interlock, while cargo amount, offload, resupply, docking turnaround, ore yield, and service selection are outside the boundary.

SCOPE-02: The system shall not choose a mission action from mining, defense, retreat, hold, and service, shall not publish a mission phase, and shall not infer any mining, cargo, or service request from its inputs.

## Evidence and claim classes

BASIS-01: The frozen seed, derived from the pinned Mining Frigate corpus sources, grounds the fictional frigate, threat observation and classification, threat reporting, defense activation, navigation and warp vocabulary, mining context, capacitor-related conditions, outcomes, and acknowledgments; it does not ground the finite policy below.

BASIS-02: The FAA/NASA methodology guidance grounds problem-first definition, explicit boundary and assumptions, responsibility allocation, alternatives, traceability, measurable verification, and separate validation; it is not evidence for mining-frigate behavior or physical correctness.

PILOT-01: The finite types, coherent logical evaluation, consumed-once authority and outcome events, conservative invalid-evidence response, alert retention, independent channel isolation and probation, response-pattern order, and atomic response frame are pilot abstractions selected for this run.

ARCH-01: The selected logical architecture contains five boundary-facing context usages and ten qualification, state, readiness, proposal, coordination, and composition usages; it fixes responsibility and information dependencies without prescribing threads, scheduling, algorithms, encodings, deployment, or SysML constructs.

DEFER-01: Threat defeat, safe-route correctness, survivability, spacecraft physics, exact capacitor sufficiency, real timing, range, probability, severity, certification, human performance, profitability, and production readiness are excluded rather than assumed satisfied.

DEFER-02: Code generation, application implementation, executable scenarios, formal proof, and claims beyond retained typechecking, local contract inspection, bounded finite analysis, trace analysis, visualization evidence, and later Designer fitness review remain `not-run`; this seed declares no executable profile.

## Goals and stakeholders

GOAL-01: Unusable threat evidence shall be reported as unknown and shall isolate both protective channels before either can issue a new directive in the same evaluation.

GOAL-02: A retained alarm shall continue to support protective response through transient clear or caution evidence until an explicit fresh clear acknowledgment de-escalates it in two observable steps.

GOAL-03: Confirmed hostility shall favor departure whenever departure is ready, while permitting defense concurrently rather than forcing defense and departure into a single mutually exclusive mission action.

GOAL-04: A failure in one protective channel shall inhibit that channel, remain visible, and leave the other channel independently usable when its own conditions permit.

GOAL-05: Recovery of each protective channel shall require its own reset, later recovery confirmation, and a still-later fresh enable request; recovery evidence for one channel shall not clear the other.

GOAL-06: Every consumer shall receive a same-evaluation response frame so threat report, directives, response stage, and channel states cannot describe mixed evaluations.

STAKE-01: The pilot or fleet commander depends on a traceable threat report, response stage, and reason for defense or departure behavior.

STAKE-02: The defense executor depends on an activation directive that respects evidence validity, alert state, authorization, readiness, and its independent channel health.

STAKE-03: The navigation executor depends on a departure directive that respects confirmed alarm, route readiness, the mining interlock, authorization, and its independent channel health.

STAKE-04: Ship engineering depends on visible fault propagation and independently reviewable reset, probation, confirmation, and fresh-enable behavior.

## Operational context and exact system boundary

CTX-01: External threat sensing supplies contact class and evidence status; it observes the environment but does not own alert memory or response policy.

CTX-02: The pilot or fleet authority supplies fresh defense and departure authority events plus a fresh alert-clear acknowledgment, and consumes the public response frame.

CTX-03: The external defense executor supplies defense availability, a finite capacitor-adequacy assertion, and fresh defense outcome evidence; it consumes the same response frame and alone performs any defense activation.

CTX-04: The external navigation executor supplies navigation availability, route status, and fresh departure outcome evidence; it consumes the same response frame and alone performs retreat-oriented movement.

CTX-05: The excluded mining controller supplies only whether mining equipment is externally confirmed safe for departure; it receives no mining command and exposes no cargo or service policy.

CTX-06: Asteroids, hostile ships, stations, the mining corporation, fleet, Rorqual, drones, market actors, and support services remain environmental context; none is assigned an internal responsibility by this abstract.

MON-01: `ThreatEvidence=(ContactClass,EvidenceStatus)` comes from CTX-01, where `ContactClass={NO_CONTACT,UNCERTAIN,HOSTILE_SIGNATURE}` and `EvidenceStatus={VALID,INVALID}` are finite, unitless pilot categories.

MON-02: `DefenseAuthority={NONE,ENABLE,RESET}`, `EscapeAuthority={NONE,ENABLE,RESET}`, and Boolean `clearAcknowledgment` come from CTX-02; every non-`NONE` authority and true acknowledgment is a fresh consumed-once event.

MON-03: Boolean `defenseAvailable`, Boolean `capacitorAdequate`, and `DefenseOutcome={NONE,COMMAND_SUCCEEDED,COMMAND_FAILED,RECOVERY_CONFIRMED}` come from CTX-03; non-`NONE` outcomes are fresh and consumed once.

MON-04: Boolean `navigationAvailable`, `RouteStatus={UNAVAILABLE,READY}`, and `EscapeOutcome={NONE,DEPARTURE_SUCCEEDED,DEPARTURE_FAILED,RECOVERY_CONFIRMED}` come from CTX-04; non-`NONE` outcomes are fresh and consumed once.

MON-05: `MiningInterlock={CLEAR,BLOCKED}` comes from CTX-05 and states only whether externally owned mining equipment permits departure; it conveys no mining intent, cargo state, or action priority.

CTRL-01: `ResponseFrame=(ThreatReport,DefenseDirective,EscapeDirective,ResponsePattern,ResponseStage,DefenseChannelState,EscapeChannelState)` is the sole controlled boundary value and shall be delivered atomically to CTX-02, CTX-03, and CTX-04.

BOUND-01: Inputs are observations, finite status assertions, or fresh events; they do not promise physical threat truth, defense success, route safety, movement success, or time-bounded completion.

BOUND-02: Outputs request external effects and report internal policy state; the system does not sense contacts, activate hardware, navigate, warp, mine, dock, transfer ore, or resupply.

## Finite semantic vocabulary

TYPE-01: `ThreatBand={CLEAR,CAUTION,HOSTILE}` is a qualified instantaneous interpretation, and `ThreatValidity={USABLE,UNUSABLE}` states whether the current evidence may update normal policy.

TYPE-02: `AlertState={QUIET,WATCH,ALARM}` is persistent response significance owned by alert memory and is not a mission phase.

TYPE-03: `ChannelState={AVAILABLE,ISOLATED,PROBATION}` is independently instantiated for defense and escape; `ChannelGate={OPEN,BLOCKED}` prevents commands during isolation, probation, and the exact evaluation that confirms recovery.

TYPE-04: `DefenseProposal={STANDBY,ACTIVATE}` and `EscapeProposal={STAY,DEPART}` are independently derived protective requests.

TYPE-05: `ResponsePattern={OBSERVE,DEFENSE,DEPARTURE}` is a many-to-one primary protective response derived with departure priority; concurrent defense remains visible in the independent directive rather than creating a general mission action.

TYPE-06: `ThreatReport={UNKNOWN,CLEAR,CAUTION,HOSTILE}`, `DefenseDirective={STANDBY,ACTIVATE}`, and `EscapeDirective={STAY,DEPART}` are public fields.

TYPE-07: `ResponseStage={INITIALIZING,MONITORING,RESPONDING,DEGRADED,EVIDENCE_FAULT}` is an externally visible condition of this threat-response function, not the frigate lifecycle or operational mission phase.

TYPE-08: `DefenseReadinessContext=(defenseAvailable,capacitorAdequate)` is the paired external defense condition supplied on one typed interaction; PART-10 derives readiness rather than receiving it.

## Approved logical usages and responsibilities

PART-01: Threat-evidence context originates `ThreatEvidence` at the modeled boundary and consumes no internal result; it is not an internal receive-and-forward wrapper or a decision owner.

PART-02: Pilot-authority context originates the three fresh authority concepts and consumes the atomic response frame for human or fleet awareness; it does not compute policy.

PART-03: Defense-execution context originates defense availability, capacitor adequacy, and defense outcome and consumes the atomic response frame to perform any activation externally; it does not select activation.

PART-04: Navigation-execution context originates navigation availability, route status, and departure outcome and consumes the atomic response frame to perform any departure externally; it does not select departure.

PART-05: Mining-interlock context originates only the externally decided `MiningInterlock`; it has no mining-control responsibility inside this system.

PART-06: Threat qualification shall derive both `ThreatBand` and the many-to-one `ThreatValidity` from the two-field threat evidence according to CASE-01 through CASE-04.

PART-07: Alert memory is the sole `AlertState` owner and shall derive actual next alert from previous alert, qualified threat, and clear acknowledgment according to CASE-05 through CASE-10, then derive `ThreatReport=UNKNOWN` for unusable evidence or the report corresponding to actual next alert for usable evidence.

PART-08: Defense-channel recovery is the sole defense `ChannelState` and defense `ChannelGate` owner and shall derive both from previous defense state, threat validity, defense authority, and defense outcome according to CASE-11 through CASE-14.

PART-09: Escape-channel recovery is the sole escape `ChannelState` and escape `ChannelGate` owner and shall derive both from previous escape state, threat validity, escape authority, and escape outcome according to CASE-15 through CASE-18.

PART-10: Defense readiness shall derive `defenseReady=(defenseAvailable and capacitorAdequate and defenseGate=OPEN)`; it shall not inspect alert, pilot authority, escape information, or any proposal.

PART-11: Departure readiness shall derive `escapeReady=(navigationAvailable and RouteStatus=READY and MiningInterlock=CLEAR and escapeGate=OPEN)`; it shall not inspect alert, pilot authority, defense information, cargo, docking, offload, or service state.

PART-12: Defense activation decision shall derive the defense proposal from actual next alert, defense readiness, and the fresh defense authority according to CASE-19 and CASE-20.

PART-13: Departure initiation decision shall derive the escape proposal from actual next alert, departure readiness, and the fresh escape authority according to CASE-21 and CASE-22.

PART-14: Response coordination shall derive the many-to-one primary response from the independently owned proposals according to CASE-23 through CASE-25; it shall not recompute qualification, alert, recovery, readiness, or proposal relations.

PART-15: Report and frame composition shall derive `ResponseStage` as its sole credited owner-local fact from the alert owner's report and actual next alert plus both actual next channel states according to CASE-26 through CASE-29. It shall also map both proposals one-to-one to their matching public directives, preserve the alert owner's report, PART-14's primary response pattern, and both owner-derived channel states, then construct and fan out the one response frame; those mapping, preservation, construction, and routing obligations receive no owner-local-fact, case, or additional semantic-usage credit.

## Exact typed directed semantic interaction inventory

INT-01: Threat-evidence context provides `threatEvidence: ThreatEvidence` to threat qualification.

INT-02: Threat qualification provides `qualifiedThreat: (ThreatBand,ThreatValidity)` to alert memory.

INT-03: Pilot-authority context provides `clearAcknowledgment: Boolean` to alert memory.

INT-04: Pilot-authority context provides `defenseAuthority: DefenseAuthority` to defense-channel recovery.

INT-05: Defense-execution context provides `defenseOutcome: DefenseOutcome` to defense-channel recovery.

INT-06: Threat qualification provides `threatValidity: ThreatValidity` to defense-channel recovery.

INT-07: Pilot-authority context provides `escapeAuthority: EscapeAuthority` to escape-channel recovery.

INT-08: Navigation-execution context provides `escapeOutcome: EscapeOutcome` to escape-channel recovery.

INT-09: Threat qualification provides `threatValidity: ThreatValidity` to escape-channel recovery.

INT-10: Defense-execution context provides `defenseReadinessContext: DefenseReadinessContext` to defense readiness.

INT-11: Defense-channel recovery provides `defenseGate: ChannelGate` to defense readiness.

INT-12: Navigation-execution context provides `navigationAvailable: Boolean` to departure readiness.

INT-13: Navigation-execution context provides `routeStatus: RouteStatus` to departure readiness.

INT-14: Mining-interlock context provides `miningInterlock: MiningInterlock` to departure readiness.

INT-15: Escape-channel recovery provides `escapeGate: ChannelGate` to departure readiness.

INT-16: Alert memory provides `alertState: AlertState` to defense activation decision.

INT-17: Defense readiness provides `defenseReady: Boolean` to defense activation decision.

INT-18: Pilot-authority context provides `defenseAuthority: DefenseAuthority` to defense activation decision.

INT-19: Alert memory provides `alertState: AlertState` to departure initiation decision.

INT-20: Departure readiness provides `escapeReady: Boolean` to departure initiation decision.

INT-21: Pilot-authority context provides `escapeAuthority: EscapeAuthority` to departure initiation decision.

INT-22: Defense activation decision provides `defenseProposal: DefenseProposal` to response coordination.

INT-23: Departure initiation decision provides `escapeProposal: EscapeProposal` to response coordination.

INT-24: Response coordination provides `responsePattern: ResponsePattern` to report and frame composition.

INT-25: Defense activation decision provides `defenseProposal: DefenseProposal` to report and frame composition.

INT-26: Departure initiation decision provides `escapeProposal: EscapeProposal` to report and frame composition.

INT-27: Alert memory provides `alertResult: (AlertState,ThreatReport)` to report and frame composition.

INT-28: Defense-channel recovery provides `defenseChannelState: ChannelState` to report and frame composition.

INT-29: Escape-channel recovery provides `escapeChannelState: ChannelState` to report and frame composition.

INT-30: Report and frame composition provides the complete `responseFrame: ResponseFrame` to pilot-authority context.

INT-31: Report and frame composition provides the same complete `responseFrame: ResponseFrame` to defense-execution context.

INT-32: Report and frame composition provides the same complete `responseFrame: ResponseFrame` to navigation-execution context.

## Required behavior and exact nontrivial contract partitions

BEH-01: Threat qualification shall be total and shall derive exactly one band/validity pair for each evidence value.

CASE-01: Any `EvidenceStatus=INVALID` shall derive `(CAUTION,UNUSABLE)` regardless of contact class; the caution band is conservative internal context and the alert owner derives public report `UNKNOWN` for CASE-26.

CASE-02: Valid `NO_CONTACT` shall derive `(CLEAR,USABLE)`.

CASE-03: Valid `UNCERTAIN` shall derive `(CAUTION,USABLE)`.

CASE-04: Valid `HOSTILE_SIGNATURE` shall derive `(HOSTILE,USABLE)`.

VER-BEH-01: Contract inspection and bounded analysis pass only if CASE-01 through CASE-04 are disjoint and total over all six evidence combinations and validity is many-to-one, with `UNUSABLE` exactly for invalid status.

BEH-02: Alert memory shall apply CASE-05 through CASE-10 in first-match order and shall use actual next alert in the same evaluation.

CASE-05: Unusable qualified evidence shall preserve the previous alert state; channel isolation and unknown reporting, not a fabricated threat claim, provide the invalid-evidence response.

CASE-06: Usable hostile evidence shall derive `ALARM` from every previous alert state and shall dominate clear acknowledgment.

CASE-07: Otherwise, previous `ALARM` plus usable clear evidence and a fresh clear acknowledgment shall derive `WATCH`.

CASE-08: Otherwise, previous `ALARM` shall remain `ALARM`.

CASE-09: Otherwise, with previous state not `ALARM`, usable caution evidence or a previous `WATCH` not accompanied by both clear evidence and fresh clear acknowledgment shall derive `WATCH`.

CASE-10: Every remaining usable-evidence combination shall derive `QUIET`.

VER-BEH-02: State-transition and bounded analysis pass only if CASE-05 through CASE-10 are ordered, disjoint after first match, total, initialize alert to `QUIET`, escalate hostile immediately, and require two separate clear acknowledgments to move `ALARM` through `WATCH` to `QUIET`.

FAULT-01: Defense-channel recovery shall apply CASE-11 through CASE-14 in first-match order; unusable evidence and defense-command failure shall dominate reset or recovery confirmation in the same evaluation.

CASE-11: Unusable threat validity or fresh `DefenseOutcome=COMMAND_FAILED` shall derive defense state `ISOLATED` and defense gate `BLOCKED` from every previous defense state.

CASE-12: Without a CASE-11 trigger, previous defense `ISOLATED` plus fresh `DefenseAuthority=RESET` shall derive `PROBATION` and `BLOCKED`.

CASE-13: Without a CASE-11 trigger, previous defense `PROBATION` plus fresh `DefenseOutcome=RECOVERY_CONFIRMED` shall derive `AVAILABLE` but keep the defense gate `BLOCKED` for that evaluation.

CASE-14: Every other defense combination shall preserve the previous defense state and derive gate `OPEN` exactly when that preserved state is `AVAILABLE`, otherwise `BLOCKED`.

VER-FAULT-01: Contract inspection and bounded analysis pass only if CASE-11 through CASE-14 are ordered, disjoint after first match, total, initialize defense state/gate to `AVAILABLE/OPEN`, prevent same-evaluation reset and recovery clearing, and require a later fresh `ENABLE` after CASE-13 before activation.

FAULT-02: Escape-channel recovery shall apply CASE-15 through CASE-18 independently; unusable evidence and departure failure shall dominate reset or recovery confirmation in the same evaluation.

CASE-15: Unusable threat validity or fresh `EscapeOutcome=DEPARTURE_FAILED` shall derive escape state `ISOLATED` and escape gate `BLOCKED` from every previous escape state.

CASE-16: Without a CASE-15 trigger, previous escape `ISOLATED` plus fresh `EscapeAuthority=RESET` shall derive `PROBATION` and `BLOCKED`.

CASE-17: Without a CASE-15 trigger, previous escape `PROBATION` plus fresh `EscapeOutcome=RECOVERY_CONFIRMED` shall derive `AVAILABLE` but keep the escape gate `BLOCKED` for that evaluation.

CASE-18: Every other escape combination shall preserve the previous escape state and derive gate `OPEN` exactly when that preserved state is `AVAILABLE`, otherwise `BLOCKED`.

VER-FAULT-02: Contract inspection and bounded analysis pass only if CASE-15 through CASE-18 are ordered, disjoint after first match, total, initialize escape state/gate to `AVAILABLE/OPEN`, prevent same-evaluation reset and recovery clearing, and require a later fresh `ENABLE` after CASE-17 before departure.

BEH-03: Defense readiness and defense activation decision shall preserve separate ownership: readiness derives only physical/contextual operability, while activation adds alert significance and fresh authority.

CASE-19: Defense activation shall derive `ACTIVATE` exactly when actual next alert is `WATCH` or `ALARM`, `defenseReady` is true, and fresh `DefenseAuthority=ENABLE`.

CASE-20: Every other defense-decision combination shall derive `STANDBY`.

VER-BEH-03: Local contract and bounded analysis pass only if the PART-10 readiness equation is exact, CASE-19 and CASE-20 are complements, and neither usage consults or reconstructs escape or coordination results.

BEH-04: Departure readiness and departure initiation decision shall preserve separate ownership: readiness derives only route, navigation, mining-interlock, and channel operability, while initiation adds alarm significance and fresh authority.

CASE-21: Departure initiation shall derive `DEPART` exactly when actual next alert is `ALARM`, `escapeReady` is true, and fresh `EscapeAuthority=ENABLE`.

CASE-22: Every other departure-decision combination shall derive `STAY`.

VER-BEH-04: Local contract and bounded analysis pass only if the PART-11 readiness equation is exact, CASE-21 and CASE-22 are complements, and neither usage consults or reconstructs defense or coordination results.

PRIO-01: Priority is distributed but exact: unusable evidence or an own-channel failure dominates that channel's reset and recovery confirmation; usable hostile evidence dominates clear acknowledgment in alert memory; and a departure proposal is never suppressed by defense, remaining the primary response while defense may be concurrently active.

BEH-05: Response coordination shall apply the two-proposal composition order exactly and shall never substitute a mining, service, docking, cargo, or general mission choice.

CASE-23: Any `DEPART` proposal shall derive primary response `DEPARTURE`; the separate defense proposal remains available to composition, so defense is concurrent when it is `ACTIVATE`.

CASE-24: Otherwise, `ACTIVATE` shall derive primary response `DEFENSE`.

CASE-25: Otherwise, response coordination shall derive `OBSERVE`.

VER-BEH-05: Priority and bounded analysis pass only if CASE-23 through CASE-25 are ordered, disjoint after first match, and total over all four proposal pairs; both `DEPART/ACTIVATE` and `DEPART/STANDBY` must collapse to the same primary departure fact while composition preserves the independent defense directive.

BEH-06: Report and frame composition shall apply CASE-26 through CASE-29 in first-match order to derive only the four-way post-evaluation `ResponseStage` as its substantive owner-local fact. It shall separately map each proposal one-to-one to its matching public directive, preserve PART-14's primary response, PART-07's already-derived report, and both owner-derived channel states, and construct the atomic frame without receiving additional owner or case credit for those coherence obligations.

CASE-26: `ThreatReport=UNKNOWN` shall derive stage `EVIDENCE_FAULT`. The exact `STANDBY/STAY`, `OBSERVE`, and both-`ISOLATED` frame follows by preservation and one-to-one mapping of upstream owner results and is checked end to end rather than re-derived by PART-15.

CASE-27: With a non-unknown report and either actual next channel state not `AVAILABLE`, composition shall derive stage `DEGRADED`; directives and channel states remain preserved or one-to-one-mapped upstream owner results.

CASE-28: With report `CLEAR`, both channel states `AVAILABLE`, and actual next alert `QUIET`, composition shall derive stage `MONITORING`; directives remain one-to-one mappings of the two proposals.

CASE-29: With report `CAUTION` or `HOSTILE`, both channel states `AVAILABLE`, and matching actual next alert `WATCH` or `ALARM`, composition shall derive stage `RESPONDING`; directives remain one-to-one mappings of the two proposals.

VER-BEH-06: Composition inspection and bounded analysis pass only if CASE-26 through CASE-29 provide an ordered, disjoint-after-first-match, total four-way stage classification over reachable owner results; PART-15 preserves PART-14's many-to-one pattern, reproduces each proposal as its matching directive, preserves both owner states and PART-07's report, exposes only complete frames, and delivers identical same-evaluation frames on INT-30 through INT-32. Only the stage classification receives owner-local-fact and case credit.

FAULT-03: Invalid evidence shall propagate through qualification to alert reporting, both actual next channel states and gates, both readiness facts, both proposals, response coordination, and CASE-26 in the same evaluation; no stale enable event may escape this chain.

FAULT-04: A defense failure shall isolate only defense and a departure failure shall isolate only escape; the unaffected channel shall remain eligible for its own proposal, and either fault shall be visible through the channel states and `DEGRADED` stage.

VER-FAULT-03: End-to-end bounded analysis passes only if every invalid-evidence valuation produces the exact CASE-26 frame, every single-channel failure blocks its affected proposal, and toggling one channel's reset, confirmation, availability, or outcome cannot change the other channel's state or gate.

## Risks, state, stages, assumptions, and constraints

RISK-01: Unusable evidence could otherwise activate defense or departure on an unsupported threat claim; FAULT-01, FAULT-02, FAULT-03, and CASE-26 mitigate this by preserving alert memory, isolating both channels, withholding directives, and reporting unknown evidence.

RISK-02: A transient clear sample could otherwise erase a retained alarm and suppress protection; CASE-07 through CASE-10 mitigate this with explicit two-step acknowledged de-escalation.

RISK-03: A failure in one protective channel could otherwise disable all threat response; FAULT-04 mitigates this with separate state owners, gates, readiness, proposals, and partial-degradation behavior.

RISK-04: Reset, stale success, or same-evaluation recovery confirmation could otherwise immediately reissue a command; CASE-12 through CASE-18 and the blocked confirmation evaluation require a later fresh enable.

RISK-05: Separately emitted report and command fields could otherwise describe different policy evaluations; BEH-06 mitigates this with one complete response frame fanned out unchanged.

STATE-01: Alert state initializes to `QUIET`, is owned only by PART-07, and changes only by CASE-05 through CASE-10.

STATE-02: Defense channel state initializes to `AVAILABLE/OPEN`, is owned only by PART-08, and changes only by CASE-11 through CASE-14.

STATE-03: Escape channel state initializes to `AVAILABLE/OPEN`, is owned only by PART-09, and changes only by CASE-15 through CASE-18.

MODE-01: Before the first coherent evaluation the response frame may expose `INITIALIZING`; after evaluation, `MONITORING`, `RESPONDING`, `DEGRADED`, and `EVIDENCE_FAULT` differ observably in report, channel health, or command permission as defined by CASE-26 through CASE-29.

TRANS-01: Receipt of one coherent finite input set triggers one logical evaluation and one atomic frame update; this transition claims no period, deadline, scheduling policy, or physical simultaneity.

TRANS-02: Alert transitions follow actual qualified evidence and fresh acknowledgment, while each channel transition follows only its own previous state, current validity, own authority, and own outcome; response stage is derived and owns no state.

ASM-01: CTX-01 is responsible for marking unusable evidence `INVALID`; contact categories are pilot abstractions and are not calibrated physical measurements.

ASM-02: CTX-02 is responsible for presenting each `ENABLE`, `RESET`, and true clear acknowledgment once; a later action after recovery requires a new `ENABLE`, and replayed authority is outside the contract.

ASM-03: CTX-03 is responsible for capacitor adequacy and defense availability as command-acceptance assertions and for fresh, correctly tagged defense outcomes; none guarantees physical success.

ASM-04: CTX-04 is responsible for route and navigation availability as command-acceptance assertions and for fresh, correctly tagged departure outcomes; `READY` does not prove route safety.

ASM-05: CTX-05 is responsible for asserting `CLEAR` only after the excluded mining controller has made equipment safe for departure; this system neither commands nor verifies mining shutdown.

CONSTR-01: All input and output domains are the finite sets declared here; no hidden numeric threshold, timing value, priority, or environmental quantity may be introduced as required behavior.

CONSTR-02: Each logical evaluation shall produce exactly one response frame, and consumers shall receive identical values; delivery mechanism and physical atomicity are implementation choices, while same-evaluation value coherence is required.

CONSTR-03: Actual next alert and actual next channel states shall feed same-evaluation decisions and composition; using only previous state on downstream paths fails the policy.

CONSTR-04: Before the first coherent evaluation, the initialized response frame shall be `(UNKNOWN,STANDBY,STAY,OBSERVE,INITIALIZING,AVAILABLE,AVAILABLE)`; initialization receives no nontrivial-case credit.

## Bounded public scenario families

SCN-01: From quiet alert and available channels, valid no-contact evidence with no enable events shall publish clear monitoring with standby/stay and both states available.

SCN-02: From quiet or watch alert, valid uncertain evidence with fresh defense enable and ready defense shall publish caution responding with defense active and departure staying.

SCN-03: From any alert, valid hostile evidence with both fresh enables and both readiness facts true shall publish hostile responding with primary response `DEPARTURE` and both directives active.

SCN-04: With a retained alarm, fresh escape enable, ready departure, and defense unavailable or not enabled, the system shall publish departure without defense.

SCN-05: With a retained alarm, fresh enables, ready defense, and departure blocked specifically by `MiningInterlock=BLOCKED`, the system shall publish defense without departure and shall not infer a mining action.

SCN-06: With a retained alarm but neither proposal applicable, the system shall continue to report hostile while publishing observe/standby/stay rather than inventing a third action.

SCN-07: Any invalid-evidence evaluation shall preserve previous alert, isolate both channels, close both gates, deny both proposals, and publish the exact evidence-fault frame in CASE-26.

SCN-08: A fresh defense command failure during an alarm shall isolate defense and publish degraded status while still permitting an independently ready and freshly enabled departure.

SCN-09: A fresh departure failure during an alarm shall isolate escape and publish degraded status while still permitting independently ready and freshly enabled defense.

SCN-10: Defense recovery shall trace `ISOLATED -> PROBATION -> AVAILABLE` using a fresh defense reset and later defense recovery confirmation, remain blocked through the confirmation evaluation, and require a still-later fresh defense enable; escape state shall remain unchanged.

SCN-11: Escape recovery shall trace `ISOLATED -> PROBATION -> AVAILABLE` using a fresh escape reset and later escape recovery confirmation, remain blocked through the confirmation evaluation, and require a still-later fresh escape enable; defense state shall remain unchanged.

SCN-12: Alert de-escalation shall trace `ALARM -> WATCH -> QUIET` only through two separate evaluations containing usable clear evidence and fresh clear acknowledgment; missing acknowledgment, caution, hostility, or invalid evidence shall not complete that trace.

## Local-contract and end-to-end analysis obligations

LOCAL-01: PART-06 through PART-15 shall each expose a canonical owner-local relation for its assigned derivation; external-context usages PART-01 through PART-05 receive no assessment, state, proposal, coordination, or composition-owner credit.

LOCAL-02: PART-10 and PART-11 shall be checked extensionally against their exact readiness equations; PART-12 and PART-13 shall consume those facts and shall not receive readiness-owner credit by recomputing raw context.

LOCAL-03: PART-08 and PART-09 shall own distinct state variables and gates; a shared global recovery variable, cross-channel clearing, or a central analyzer that reproduces absent local contracts fails ownership.

LOCAL-04: PART-14 shall consume only the two proposals, and PART-15 shall consume only the declared owner outputs; neither may consult raw evidence, raw availability, authority, interlock, or outcome inputs to recompute upstream decisions.

ANALYSIS-01: The retained deterministic analyzer shall exhaust all `6*3*3*2*2*2*4*2*2*4*2*3*3*3 = 1,492,992` combinations of current finite inputs and previous alert, defense, and escape states.

ANALYSIS-02: For every valuation the analyzer shall compare qualified threat, actual next alert and report, both actual next channel states and gates, both readiness facts, both proposals, response pattern, directives, stage, and complete response frame against CASE-01 through CASE-29.

ANALYSIS-03: Bounded analysis passes only with zero partition gaps, first-match overlaps, owner mismatches, cross-channel interference, readiness mismatches, proposal mismatches, response-pattern mismatches, stale-request recoveries, composition mismatches, and scenario failures.

ANALYSIS-04: The independent harness shall rerun the retained Sireum source gate and analyzer under the run-policy watchdog, bind results to the canonical source revision, and require exact count and ownership-audit evidence; a self-reported summary is insufficient.

## Structural, trace, generated-support, and objective pass criteria

STR-01: The realization shall contain exactly 15 reachable semantic usages corresponding to PART-01 through PART-15, within the hard bound 13..16; none may exist only to copy, rename, route, bundle, decorate, or reach the count.

STR-02: The realization shall contain exactly the 32 typed directed semantic interactions INT-01 through INT-32, within the hard bound 22..35; each fan-out is a distinct consumer dependency and no routing-only flow receives credit.

STR-03: The realization shall contain exactly one explicit root system usage, one weakly connected semantic region, and containment depth 1 or 2 beneath the root.

STR-04: The contract realization shall retain exactly 29 nontrivial partitions CASE-01 through CASE-29, within the hard bound 21..30; initialization, typing, record construction, readiness equations, report/directive mappings, helper predicates, and forwarding shall not add case credit.

STR-05: Validation shall retain exactly 12 distinct scenario families SCN-01 through SCN-12, within the hard bound 9..12; examples within a family do not add family credit.

OWN-01: Ownership audit passes only if PART-06 derives the many-to-one validity fact; PART-07 through PART-09 own and derive their assigned state; PART-10 and PART-11 derive readiness; PART-12 and PART-13 derive proposals; PART-14 derives pattern; and PART-15 derives only the four-way response-stage classification as its credited owner-local fact. PART-15's copied report, preserved pattern and channel states, one-to-one directive mappings, record construction, and fan-out remain required but uncredited coherence obligations.

OWN-02: PART-01 through PART-05 are credited only as boundary-facing context usages with distinct originating or consuming responsibilities; realizing any as an internal receive-and-forward wrapper loses that usage credit and fails the exact architecture.

SUPPORT-01: `@generated-support` may justify one behavior-free containment element if required, finite type declarations, record constructors, helper predicates, initialization support, and the root boundary exposure of the complete response frame; none receives semantic usage, interaction, owner, or case credit.

SUPPORT-02: Generated support shall not add partial public outputs, duplicate boundary inputs, route semantic flows through extra usages, own state, choose a proposal or pattern, reconstruct an owner relation, or alter any finite domain.

TRACE-01: Trace analysis passes only if every actionable canonical ID maps to one or more model elements or is explicitly informational/deferred, every significant model element maps back to an ID or justified generated support, and there are no missing parents or unexplained children.

PASS-01: Architecture verification passes only if retained and independent-harness Sireum gates succeed, all interaction endpoints and types are compatible, STR-01 through STR-03 hold exactly, and no responsibility is decorative.

PASS-02: Behavioral verification passes only if all 29 cases, readiness equations, canonical owner-local relations, and initialization obligations exist and the exhaustive analysis satisfies BEH-01 through BEH-06 and FAULT-01 through FAULT-04.

PASS-03: Priority verification passes only if every proposal pair maps exactly by CASE-23 through CASE-25, every proposed departure remains the primary response, and an independent simultaneous defense directive remains active rather than suppressing escape.

PASS-04: Fault-propagation verification passes only if invalid evidence reaches alert reporting, both channel owners, readiness owners, proposals, pattern, and exact CASE-26 frame in one evaluation and each single-channel failure affects only its own state/gate while remaining visible.

PASS-05: Recovery verification passes only if both independent reset-probation-confirmation-later-enable traces pass, triggers dominate recovery evidence, wrong or stale events do not clear a channel, and no cross-channel reset or clearing occurs.

PASS-06: Composition verification passes only if PART-15 uses PART-14's pattern, PART-12/PART-13's proposals, PART-07's report and actual next alert, and PART-08/PART-09's actual next states without consulting PART-06 validity or recomputing any upstream relation, and INT-30 through INT-32 carry identical complete frames.

PASS-07: Scenario validation passes only if every SCN-01 through SCN-12 has at least one bounded trace with exact current inputs, previous states where relevant, intermediate owner results, and public response frame, with zero failed family.

PASS-08: Final Designer validation passes only if the model is faithful to the narrower threat-response purpose and exclusions, does not reconstruct combined mission arbitration, and makes no claim deferred by DEFER-01 or DEFER-02; verification and domain fitness shall be reviewed separately.

PASS-09: Visualization acceptance passes only if exactly one named `system-overview` covers the accepted root and all 15 semantic usages, distinguishes five boundary-facing contexts from internal owners, faithfully shows the two independent recovery/proposal branches and final composition, has no unresolved endpoint, overlap, clipping, truncation, or out-of-bounds object, and matches the accepted source revision.

## Model review questions

Q-MODEL-01: Can the trusted source subset realize PART-08 and PART-09 as genuinely independent state owners that expose actual next state plus a confirmation-evaluation blocked gate, without a central usage or analyzer-only semantics recomputing either transition relation?

Q-MODEL-02: Can one complete response-frame value be fanned out identically to the three boundary-facing consumers while preserving exactly INT-30 through INT-32 and avoiding partial public outputs or a routing-only semantic usage?

Q-MODEL-03: Can the retained deterministic analyzer exhaust 1,492,992 valuations within the run-policy watchdog while checking intermediate ownership, cross-channel noninterference, fresh-event recovery, all 29 cases, and all 12 scenario families; if not, what semantics-preserving deterministic factorization is required?

Q-MODEL-04: Does the trusted GUMBO/SysML-AADL subset support canonical local contracts for actual-next-state downstream use in the same logical evaluation, or is a reviewable source-level staging construct needed without changing the abstract policy?

