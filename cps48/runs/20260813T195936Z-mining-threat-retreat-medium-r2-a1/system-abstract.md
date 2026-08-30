---
abstract_id: SA-MTR-THREAT-RESPONSE-MEDIUM-R2-01
run_id: 20260813T195936Z-mining-threat-retreat-medium-r2-a1
domain_seed: mining-threat-retreat-20260813T195454Z-v1
seed_version: 1
campaign_complexity: medium
baseline_status: approved
model_review_disposition: no-concern
revision_used: false
semantic_usage_bounds: [8, 12]
semantic_usage_count: 8
semantic_interaction_bounds: [15, 21]
semantic_interaction_count: 20
nontrivial_contract_case_bounds: [12, 20]
nontrivial_contract_case_count: 20
scenario_family_bounds: [6, 9]
scenario_family_count: 8
root_system_usage_count: 1
generated_support_usage_count: 1
non_root_architecture_node_count: 9
containment_depth_beneath_root: 2
weakly_connected_semantic_region_count: 1
generated_support_route_count: 10
source_port_connection_declaration_count: 30
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
selected_primary_scope: frigate-threat-response
selected_allocation: evidence-and-session-centered
---

# Frigate Threat Evidence and Egress Response Supervisor — Approved System Abstract

## Need, purpose, capabilities, and goals

NEED-01: A fictional mining-frigate pilot and fleet-command recipient need a bounded supervisory function that turns threat evidence and response-resource observations into an explicit threat report, logical defense activation, and retreat-oriented navigation request without governing mining, cargo, offload, resupply, or overall mission phase.

PURPOSE-01: The system shall qualify threat evidence, retain a threat episode until an explicit clear condition is confirmed, qualify defense and egress applicability, resolve defense-versus-egress conflicts, retain an egress response session, and publish the selected response status.

CAP-01: Principal capabilities are threat-evidence qualification, threat-episode tracking, threat reporting, defense-readiness qualification, egress-readiness qualification, response priority selection, defense/egress command control, and response-status assessment.

GOAL-01: The system shall never treat invalid threat evidence as clear evidence or use it to close an already declared threat episode.

GOAL-02: The system shall make the conflict between an eligible fresh egress request and simultaneously ready defense explicit and deterministic.

GOAL-03: The system shall keep threat-episode state and egress-session state under separate, unique owners and shall require a fresh eligible egress request to retry after an egress block.

GOAL-04: The system shall publish one report, defense command, egress command, and response status for every finite one-evaluation input and pre-state combination while making no claim that a hostile is defeated or retreat succeeds.

SEM-01: One logical evaluation observes the six finite boundary inputs and the two committed pre-evaluation states, derives qualifications and one response directive, and commits at most one next value for each state. This is deterministic pilot semantics, not a timing, scheduling, or execution claim.

## Evidence and claim strata

PROV-HBK-01: Handbook-derived methodology requires an implementation-independent need, explicit boundary, cohesive responsibilities, finite nominal and off-nominal behavior, alternatives, assumptions, traceability, objective criteria, and separate verification and validation. These are engineering controls, not mining-frigate facts.

PROV-SEED-01: The frozen seed grounds a fictional pilot-operated frigate, hostile ships, threat information, threat reporting, defense activation, retreat-oriented use of navigation or warp, destination and scan vocabulary, capacitor-related conditions, equipment availability, and reports or acknowledgments.

PROV-SEED-02: The seed does not establish a threat scale, evidence validity protocol, command authority, defense-versus-egress priority, threat-clear protocol, route qualification, response state, timing, successful defense, successful retreat, or quantitative performance. It explicitly leaves exact boundaries, policies, priorities, recovery, and verification claims to downstream selection.

PROV-PILOT-01: This abstract introduces the exact finite domains, simultaneous-evaluation semantics, pilot disposition and egress-request meanings, invalid-evidence containment, explicit conflict priority, confirmed-clear recovery, and blocked-egress retry rule as experiment assumptions.

PROV-ARCH-01: The selected architecture contains exactly eight responsibility-bearing semantic usages and the 20 typed directed semantic interactions enumerated here, plus one behavior-free containment Process and ten boundary delegations that receive generated-support credit only.

PROV-DEFER-01: Mining continuation, ore targeting and extraction, cargo policy, docking, offload, resupply, mission-phase selection, fleet tactics, physical navigation, warp mechanics, equipment actuation, damage, survivability, threat defeat, escape success, physics, timing, reliability, safety, certification, profitability, and production readiness are outside the selected controlled purpose.

PROV-DEFER-02: Code generation, application implementation, deployed execution, formal or compositional proof, quantitative likelihood or severity, and correctness outside the finite abstract are deferred and shall be reported as `not-run` or deferred, never passed.

## Operational context and system boundary

CTX-01: The Pilot is external, supplies a response disposition and interprets reports and response status. The abstract does not authenticate the pilot or claim real command authority.

CTX-02: The Threat Observation Source is external, supplies one classified evidence band with an independent validity value, and is responsible only for values in the selected finite domain; detection performance is not modeled.

CTX-03: The Fleet-Command Recipient is external and receives the threat report and response status; tactics, acknowledgments beyond the selected pilot disposition, and fleet coordination remain outside.

CTX-04: The Defense Support Context is external, supplies qualitative defense availability and capacitor-support sufficiency, and receives a logical defense-activation command; actuation and defensive outcome remain outside.

CTX-05: The Retreat-Navigation Context is external, supplies route knowledge and observed egress progress and receives a retreat-oriented logical navigation command; it owns destination selection, course control, warp, docking, and physical progress.

CTX-06: Mining, cargo, station service, operations management, ship engineering, drones, asteroid resources, and hostile ships remain external context. Their mission decisions are not reconstructed; only defense-support and retreat-navigation observations cross this boundary.

SCOPE-IN-01: Inside the modeled boundary are evidence qualification, threat-episode state, reporting policy, defense and egress qualifications, threat-response arbitration, egress-session state, logical defense/egress command derivation, and response-status assessment.

SCOPE-OUT-01: No input requests mining, hold, cargo return, offload, docking, resupply, or general mission action, and no output publishes a mission phase, mining command, cargo action, service command, or five-way selected operation.

BOUNDARY-01: The root boundary contains exactly six finite input values and four finite controlled outputs. Persistent threat-episode and egress-session states are internal and may be exposed only in traced diagnostic snapshots, not accepted as environmental state inputs.

## Exact finite boundary inputs

MON-01: `threatObservation : ThreatObservation` is supplied by `CTX-02` and contains `evidenceBand = CLEAR|SUSPICIOUS|HOSTILE` and independent `validity = INVALID|VALID`, for exactly six combinations.

MON-02: `pilotDisposition : PilotDisposition` is supplied by `CTX-01` and has exactly `NO_RESPONSE|ACKNOWLEDGE_ALERT|CONFIRM_CLEAR`; only `CONFIRM_CLEAR` can complete a pending clear, and it has no effect without valid clear evidence.

MON-03: `defenseSupport : DefenseSupportObservation` is supplied by `CTX-04` and contains `defenseAvailability = UNAVAILABLE|AVAILABLE` and `capacitorSupport = INSUFFICIENT|SUFFICIENT`, for exactly four combinations.

MON-04: `egressRoute : EgressRouteObservation` is supplied by `CTX-05` and has exactly `UNKNOWN|BLOCKED|AVAILABLE`; it is a qualitative route observation, not proof that traversal will succeed.

MON-05: `egressProgress : EgressProgress` is supplied by `CTX-05` and has exactly `NOT_STARTED|EN_ROUTE|SAFE_DESTINATION_OBSERVED|FAILED`; the safe-destination literal is an external observation, not a system guarantee.

MON-06: `responseAuthorization : ResponseAuthorization` is supplied by `CTX-01` and has exactly `NO_REQUEST|EGRESS_REQUEST|CANCEL_EGRESS`; `EGRESS_REQUEST` is a fresh request in the current logical evaluation and is not a latched mission intent.

## Exact finite controlled outputs

CTRL-01: `threatReport : ThreatReport` is delivered to `CTX-01` and `CTX-03` and has exactly `NO_REPORT|WATCH_REPORT|HOSTILE_ALERT|EVIDENCE_FAULT|CLEAR_PENDING_REPORT|CLEAR_CONFIRMED_REPORT`.

CTRL-02: `defenseCommand : DefenseCommand` is delivered to `CTX-04` and has exactly `STANDBY|ACTIVATE`; it is logical activation selection, not confirmation of deployment or effectiveness.

CTRL-03: `egressCommand : EgressCommand` is delivered to `CTX-05` and has exactly `NONE|INITIATE|CONTINUE|HOLD|CANCEL`; it neither identifies a physical course nor confirms movement.

CTRL-04: `responseStatus : ResponseStatus` is delivered to `CTX-01` and `CTX-03` and has exactly `QUIET|WATCHING|THREAT_DECLARED|DEFENDING|EGRESS_ORDERED|EGRESS_MOVING|EGRESS_BLOCKED|ARRIVAL_OBSERVED|EVIDENCE_UNAVAILABLE|CLEAR_PENDING`.

## Exact finite internal concepts

TYPE-01: `EvidenceAssessment` has exactly `UNAVAILABLE|CLEAR|SUSPECT|HOSTILE`; it is derived from both fields of `MON-01` and is not a rename of the evidence band.

TYPE-02: `ThreatEpisodeState` has exactly `QUIET|WATCH|DECLARED|CLEAR_PENDING`. `ThreatEpisodeTracker` is its only owner; `CLEAR_PENDING` records a declared episode with subsequent valid clear evidence awaiting explicit confirmation.

TYPE-03: `EpisodeSnapshot` contains fully assigned `preEpisode`, `nextEpisode`, `assessment`, and `pilotDisposition` fields. It is the sole state-and-evidence fact sent by the tracker; copies of its fields earn no owner credit.

TYPE-04: `DefenseQualification` has exactly `INAPPLICABLE|BLOCKED_AVAILABILITY|BLOCKED_CAPACITOR|READY`.

TYPE-05: `EgressQualification` has exactly `INAPPLICABLE|ROUTE_UNKNOWN|ROUTE_BLOCKED|READY`.

TYPE-06: `ResponseDirective` has exactly `RESET|CONTAIN|CANCEL_EGRESS|START_EGRESS|DEFEND|HOLD_BLOCKED|MONITOR`.

TYPE-07: `EgressSessionState` has exactly `IDLE|ORDERED|MOVING|BLOCKED|ARRIVED`. `ResponseStateController` is its only owner; the state records logical request handling and observed progress, not physical location or mission phase.

TYPE-08: `ResponseSnapshot` contains fully assigned `preEgress`, `nextEgress`, `directive`, `defenseCommand`, and `egressCommand` fields. It is a controller result used by status assessment, not a second command owner.

## Selected semantic usages and distinct responsibilities

PART-01: `ThreatEvidenceQualifier` shall derive `EvidenceAssessment` from the evidence band and independent validity with invalidity precedence; it shall not copy or bijectively rename either raw field.

PART-02: `ThreatEpisodeTracker` shall be the sole owner of initialized `ThreatEpisodeState`, derive each next episode state from pre-state, assessment, and pilot disposition, preserve a declared episode across invalid evidence, and enforce clear-confirmation recovery.

PART-03: `ThreatReportPolicy` shall combine the assessment, pre-state, next-state, and disposition fields of the tracker snapshot to derive one report, distinguishing fresh alert, unavailable evidence, pending clear, confirmed clear, and acknowledged alert behavior.

PART-04: `DefenseReadinessQualifier` shall combine evidence assessment, defense availability, and capacitor support to derive a four-valued qualification with explicit availability-before-capacitor blocking precedence.

PART-05: `EgressReadinessQualifier` shall combine evidence assessment and route knowledge to derive whether egress is inapplicable, unknown, blocked, or ready; it does not own navigation progress or egress state.

PART-06: `ThreatResponseArbiter` shall combine the episode snapshot, defense and egress qualifications, and the fresh authorization to derive one response directive, including the explicit egress-versus-defense conflict.

PART-07: `ResponseStateController` shall be the sole owner of initialized `EgressSessionState`, apply controller priority to the response directive and observed progress, and jointly derive the next egress state plus defense and egress commands.

PART-08: `ResponseStatusAssessor` shall combine the episode snapshot and response snapshot to derive one precedence-selected response status; it shall not merely bundle or republish snapshot fields.

## Decision and state ownership audit

OWNER-01: `ThreatEvidenceQualifier` earns qualification ownership because it collapses six raw combinations into four assessment meanings with validity precedence; `ThreatEpisodeTracker` separately owns the stateful episode interpretation over 48 local combinations.

OWNER-02: `DefenseReadinessQualifier` and `EgressReadinessQualifier` are cooperating qualification owners because each combines threat applicability with a distinct response-resource observation and derives a non-bijective policy fact.

OWNER-03: `ThreatResponseArbiter` owns mutually exclusive response selection but owns no state; `ResponseStateController` separately owns the stateful continuation, cancellation, block, arrival, retry, and command decision.

OWNER-04: `ThreatReportPolicy` owns report classification and `ResponseStatusAssessor` owns cross-state status classification. A direct copy, enum projection, composite bundle, support route, or downstream recomputation receives no semantic-usage or owner credit.

OWNER-05: The only state writers shall be `ThreatEpisodeTracker` for `ThreatEpisodeState` and `ResponseStateController` for `EgressSessionState`; no root, Process, qualifier, reporter, arbiter, status assessor, analyzer, or generated-support element may initialize or update either state.

## Complete typed directed semantic interaction inventory

INT-01: The root boundary sends `threatObservation : ThreatObservation` to `ThreatEvidenceQualifier`.

INT-02: The root boundary sends `pilotDisposition : PilotDisposition` to `ThreatEpisodeTracker`.

INT-03: The root boundary sends `defenseSupport : DefenseSupportObservation` to `DefenseReadinessQualifier`.

INT-04: The root boundary sends `egressRoute : EgressRouteObservation` to `EgressReadinessQualifier`.

INT-05: The root boundary sends `egressProgress : EgressProgress` to `ResponseStateController`.

INT-06: The root boundary sends `responseAuthorization : ResponseAuthorization` to `ThreatResponseArbiter`.

INT-07: `ThreatEvidenceQualifier` sends `evidenceAssessment : EvidenceAssessment` to `ThreatEpisodeTracker`.

INT-08: `ThreatEpisodeTracker` sends `episodeSnapshot : EpisodeSnapshot` to `ThreatReportPolicy`.

INT-09: `ThreatEvidenceQualifier` independently sends `evidenceAssessment : EvidenceAssessment` to `DefenseReadinessQualifier`.

INT-10: `DefenseReadinessQualifier` sends `defenseQualification : DefenseQualification` to `ThreatResponseArbiter`.

INT-11: `ThreatEvidenceQualifier` independently sends `evidenceAssessment : EvidenceAssessment` to `EgressReadinessQualifier`.

INT-12: `EgressReadinessQualifier` sends `egressQualification : EgressQualification` to `ThreatResponseArbiter`.

INT-13: `ThreatEpisodeTracker` independently sends `episodeSnapshot : EpisodeSnapshot` to `ThreatResponseArbiter`.

INT-14: `ThreatResponseArbiter` sends `responseDirective : ResponseDirective` to `ResponseStateController`.

INT-15: `ResponseStateController` sends `responseSnapshot : ResponseSnapshot` to `ResponseStatusAssessor`.

INT-16: `ThreatEpisodeTracker` independently sends `episodeSnapshot : EpisodeSnapshot` to `ResponseStatusAssessor`.

INT-17: `ThreatReportPolicy` sends `threatReport : ThreatReport` to the root boundary.

INT-18: `ResponseStateController` sends `defenseCommand : DefenseCommand` to the root boundary.

INT-19: `ResponseStateController` independently sends `egressCommand : EgressCommand` to the root boundary.

INT-20: `ResponseStatusAssessor` sends `responseStatus : ResponseStatus` to the root boundary.

## Exact architecture and structural bounds

CONSTR-01: The physical containment shall be exactly one root `System` usage containing exactly one behavior-free generated-support `Process`, which contains exactly eight semantic `Thread` usages corresponding one-for-one to `PART-01` through `PART-08`. There shall be nine non-root architecture nodes, one generated-support usage, and depth exactly two beneath the root.

CONSTR-02: The eight semantic Threads shall form exactly one weakly connected semantic region through exactly 20 typed directed semantic interactions, with no omitted, merged, or extra semantic interaction and no untraced semantic usage.

CONSTR-03: The support Process and exactly ten root-to-Process delegations—one per six distinct inputs and four distinct outputs—shall carry explicit `@generated-support` rationale, own no state or behavior, and receive no `PART-*`, `INT-*`, case, owner, or semantic-count credit.

CONSTR-04: Source shall contain exactly 30 port-connection declarations: 20 semantic interactions inside the Process and ten support delegations. Composite payload declarations and field projections may be generated support but shall not create another interaction or owner.

## Initialization, priority, fresh-request, and recovery policy

INIT-01: `ThreatEpisodeState` shall initialize to `QUIET`, `EgressSessionState` shall initialize to `IDLE`, and the four outputs shall be fully assigned on initialization from the current finite inputs and initialized states. Initialization and type well-formedness do not count among the 20 nontrivial cases.

PRI-01: Arbiter first-match priority shall be: a quiet next episode selects `RESET`; otherwise unavailable assessment selects `CONTAIN`; otherwise `CANCEL_EGRESS` selects cancellation; otherwise a fresh `EGRESS_REQUEST` with egress `READY` selects `START_EGRESS`; otherwise ready defense selects `DEFEND`; otherwise an unsatisfied fresh egress request selects `HOLD_BLOCKED`; otherwise select `MONITOR`.

PRI-02: The required explicit conflict occurs when a declared hostile episode, `EGRESS_REQUEST`, egress `READY`, and defense `READY` coincide: `START_EGRESS` shall win over `DEFEND`. This is a selected deterministic policy, not a safety or tactical superiority claim.

PRI-03: Controller first-match priority shall be `RESET`; then safe-destination observation for an ordered or moving session; then `CANCEL_EGRESS`; then failed progress for an ordered or moving session; then continuation of an ordered or moving session; then fresh retry from `BLOCKED`; then ordinary blocked/arrived/idle behavior. Defense may activate in `IDLE` or `BLOCKED` only when the effective directive is `DEFEND`; ordered, moving, and arrived egress command defense to `STANDBY`.

REC-01: Invalid evidence shall move `QUIET` or `WATCH` to `WATCH` and shall move or retain `DECLARED` or `CLEAR_PENDING` as `DECLARED`; invalidity therefore cannot clear a declared episode.

REC-02: Valid `CLEAR` shall move `DECLARED` to `CLEAR_PENDING`; `CLEAR_PENDING` shall return to `QUIET` only when valid clear evidence coincides with `CONFIRM_CLEAR`. Any fresh `HOSTILE` evidence before confirmation returns the episode to `DECLARED`.

REC-03: An egress failure shall move an ordered or moving session to `BLOCKED`. Route recovery alone and `NO_REQUEST` shall hold `BLOCKED`; only a later evaluation producing a fresh eligible `START_EGRESS` shall move `BLOCKED` to `ORDERED` and reissue `INITIATE`.

REC-04: `SAFE_DESTINATION_OBSERVED` while ordered or moving shall move the egress session to `ARRIVED`, but it does not clear the threat episode or prove safety. `ARRIVED` remains until episode reset or cancellation returns the session to `IDLE`.

## Exact owner-local nontrivial contract-case partition

BEH-EVID-01 / CASE-01: If observation validity is `INVALID`, `ThreatEvidenceQualifier` shall output `UNAVAILABLE` for every evidence band, establishing invalidity precedence over all three bands.

BEH-EVID-02 / CASE-02: If validity is `VALID` and the band is `CLEAR`, `ThreatEvidenceQualifier` shall output `CLEAR`.

BEH-EVID-03 / CASE-03: If validity is `VALID` and the band is `SUSPICIOUS` or `HOSTILE`, `ThreatEvidenceQualifier` shall respectively output `SUSPECT` or `HOSTILE`; cases 01–03 shall be disjoint and cover all six local combinations.

FAULT-EPISODE-01 / CASE-04: For assessment `UNAVAILABLE`, `ThreatEpisodeTracker` shall select `WATCH` from pre-state `QUIET|WATCH` and `DECLARED` from pre-state `DECLARED|CLEAR_PENDING`, independent of pilot disposition.

BEH-EPISODE-01 / CASE-05: For assessment `HOSTILE`, the tracker shall select `DECLARED` from every pre-state; for `SUSPECT`, it shall select `WATCH` from `QUIET|WATCH` and `DECLARED` from `DECLARED|CLEAR_PENDING`, independent of pilot disposition.

BEH-EPISODE-02 / CASE-06: For assessment `CLEAR`, the tracker shall select `QUIET` from `QUIET|WATCH`, `CLEAR_PENDING` from `DECLARED`, and from `CLEAR_PENDING` shall select `QUIET` exactly for `CONFIRM_CLEAR`, otherwise `CLEAR_PENDING`; cases 04–06 shall be disjoint and total over all 48 local combinations and fully assign the snapshot.

BEH-DEF-01 / CASE-07: If assessment is not `HOSTILE`, `DefenseReadinessQualifier` shall output `INAPPLICABLE` for every defense-support combination.

FAULT-DEF-01 / CASE-08: If assessment is `HOSTILE` and defense availability is `UNAVAILABLE`, the qualifier shall output `BLOCKED_AVAILABILITY` for either capacitor value.

FAULT-DEF-02 / CASE-09: If assessment is `HOSTILE`, defense is `AVAILABLE`, and capacitor support is `INSUFFICIENT`, the qualifier shall output `BLOCKED_CAPACITOR`.

BEH-DEF-02 / CASE-10: If assessment is `HOSTILE`, defense is `AVAILABLE`, and capacitor support is `SUFFICIENT`, the qualifier shall output `READY`; cases 07–10 shall be disjoint and total over all 16 local combinations.

BEH-EGRESS-01 / CASE-11: If assessment is not `HOSTILE`, `EgressReadinessQualifier` shall output `INAPPLICABLE` for every route observation.

FAULT-EGRESS-01 / CASE-12: If assessment is `HOSTILE` and route knowledge is `UNKNOWN`, the qualifier shall output `ROUTE_UNKNOWN`.

FAULT-EGRESS-02 / CASE-13: If assessment is `HOSTILE` and route knowledge is `BLOCKED`, the qualifier shall output `ROUTE_BLOCKED`.

BEH-EGRESS-02 / CASE-14: If assessment is `HOSTILE` and route knowledge is `AVAILABLE`, the qualifier shall output `READY`; cases 11–14 shall be disjoint and total over all 12 local combinations.

BEH-REPORT-01 / CASE-15: `ThreatReportPolicy` shall select exactly one report by precedence: `EVIDENCE_FAULT` for unavailable assessment; `HOSTILE_ALERT` for hostile assessment unless the current disposition is `ACKNOWLEDGE_ALERT`, which selects `NO_REPORT`; `CLEAR_CONFIRMED_REPORT` when pre-state is `CLEAR_PENDING` and next-state is `QUIET`; `CLEAR_PENDING_REPORT` when next-state is `CLEAR_PENDING`; `WATCH_REPORT` for suspect assessment; otherwise `NO_REPORT`. The clause shall be total over all 192 structurally valid `EpisodeSnapshot` field combinations and separately report producer-reachable combinations.

FAULT-ARB-01 / CASE-16: If next episode is `QUIET`, or otherwise assessment is `UNAVAILABLE`, or otherwise authorization is `CANCEL_EGRESS`, `ThreatResponseArbiter` shall respectively output `RESET`, `CONTAIN`, or `CANCEL_EGRESS`, applying that order and ignoring lower-priority readiness proposals.

BEH-ARB-01 / CASE-17: Outside case 16, if authorization is `EGRESS_REQUEST`, the arbiter shall output `START_EGRESS` when egress is `READY`; otherwise it shall output `DEFEND` when defense is `READY`; otherwise it shall output `HOLD_BLOCKED`. The first branch establishes `PRI-02` even when defense is simultaneously `READY`.

BEH-ARB-02 / CASE-18: Outside cases 16–17, the arbiter shall output `DEFEND` when defense is `READY`, otherwise `MONITOR`; cases 16–18 shall be priority-ordered, disjoint, total, and single-valued over every structurally valid local combination.

BEH-CONTROL-01 / CASE-19: `ResponseStateController` shall implement `PRI-03` over every combination of five pre-egress states, seven directives, and four progress values: reset selects `IDLE/NONE/STANDBY`; safe observation from ordered or moving selects `ARRIVED/HOLD/STANDBY`; cancellation selects `IDLE/CANCEL/STANDBY`; failure from ordered or moving selects `BLOCKED/HOLD` and activates defense only for directive `DEFEND`; pre-state `ORDERED` with `NOT_STARTED` remains `ORDERED` and emits `INITIATE`, while `ORDERED` with `EN_ROUTE` or `MOVING` with `NOT_STARTED|EN_ROUTE` selects `MOVING/CONTINUE/STANDBY`; `BLOCKED` retries only for `START_EGRESS`, otherwise holds; `ARRIVED` holds; and `IDLE` starts for `START_EGRESS`, activates defense for `DEFEND`, otherwise remains idle. The clause shall be total over all 140 combinations and assign every response-snapshot field and both commands.

BEH-STATUS-01 / CASE-20: `ResponseStatusAssessor` shall select exactly one status by precedence: `EVIDENCE_UNAVAILABLE` for unavailable episode assessment; then `ARRIVAL_OBSERVED`, `EGRESS_MOVING`, `EGRESS_ORDERED`, or `EGRESS_BLOCKED` for the corresponding next egress state; then `DEFENDING` for active defense; then `CLEAR_PENDING`, `WATCHING`, or `QUIET` for the corresponding next episode state; otherwise `THREAT_DECLARED`. It shall be total over all structurally valid snapshots, separately identify producer-reachable combinations, and derive rather than copy the result.

## Nominal and off-nominal scenario families

SCN-01: Suspicious-evidence watch family — valid suspicious evidence from `QUIET` produces assessment `SUSPECT`, episode `WATCH`, a watch report, no defense activation, no egress request, and status `WATCHING`.

SCN-02: Hostile-defense family — valid hostile evidence with ready defense, no egress request, and idle egress declares the episode, issues a hostile alert, selects defense activation, and reports `DEFENDING`.

SCN-03: Egress-over-defense conflict family — valid hostile evidence with both qualifications ready and a fresh `EGRESS_REQUEST` selects `START_EGRESS`, enters `ORDERED`, emits `INITIATE`, and keeps defense at standby, proving `PRI-02`.

SCN-04: Egress-continuation-and-arrival family — an ordered session with `EN_ROUTE` becomes `MOVING` and emits `CONTINUE`; later `SAFE_DESTINATION_OBSERVED` produces `ARRIVED` and `ARRIVAL_OBSERVED` without clearing the threat episode or claiming escape success.

SCN-05: Route-block-and-fresh-retry family — a hostile fresh request with a blocked or unknown route and unavailable defense yields `HOLD_BLOCKED`; a failed active session reaches `BLOCKED`; restored route plus `NO_REQUEST` still holds; only a later eligible `EGRESS_REQUEST` restarts at `ORDERED`.

SCN-06: Invalid-evidence containment family — invalid evidence from quiet enters watch and reports an evidence fault; invalid evidence during a declared episode retains declaration, selects containment ahead of cancellation or readiness, and cannot confirm clear.

SCN-07: Threat-clear recovery family — valid clear after declaration enters `CLEAR_PENDING`; repeated clear with no response holds; valid clear with `CONFIRM_CLEAR` returns the episode to `QUIET`, reports clear confirmation, and resets the egress session.

SCN-08: Cancellation-priority family — during an ordered or moving session without a simultaneous safe-destination observation, `CANCEL_EGRESS` returns the session to `IDLE` and emits `CANCEL`; a simultaneous safe-destination observation wins by `PRI-03` and records arrival instead.

## Risks and logical mitigations

RISK-01: Invalid evidence treated as clear could close a declared threat episode and suppress reporting; cases 01, 04, 15, and 16 preserve uncertainty and report the evidence fault without asserting physical safety.

RISK-02: Simultaneous defense and egress eligibility could produce contradictory commands; cases 17 and 19 select one directive and coordinate both outputs under the declared priority.

RISK-03: Treating route recovery as an implicit new command could restart retreat-oriented movement without fresh authorization; `REC-03`, case 17, and case 19 require a new eligible request.

RISK-04: Treating an external safe-destination observation as threat clearance could erase unresolved evidence; separate episode and egress states plus `REC-02` and `REC-04` prevent that state collapse.

## Essential assumptions and constraints

ASM-01: `CTX-02` is responsible for supplying domain-valid observation fields. No accuracy, independence, latency, range, probability, or hostile-classification performance is assumed; validity is a selected logical status only.

ASM-02: `CTX-01` supplies exactly one disposition and one authorization literal per logical evaluation. `ACKNOWLEDGE_ALERT`, `CONFIRM_CLEAR`, request, and cancellation meanings are pilot abstractions and do not establish real authority or human-performance adequacy.

ASM-03: `CTX-04` supplies both defense-support fields independently. Availability and capacitor sufficiency are qualitative and unitless; they do not prove that defense can deploy, operate, or defeat a threat.

ASM-04: `CTX-05` supplies route and progress values independently and owns their physical interpretation. `SAFE_DESTINATION_OBSERVED` and `FAILED` are logical reports without timing, location, causality, or success guarantees.

ASM-05: Both state owners evaluate from their committed pre-state and commit only the computed next state after outputs are derived. No concurrency ordering between the two owners is claimed beyond the explicit directed fact flow in the same logical evaluation.

CONSTR-05: The model shall contain at least the cooperating owners in `OWNER-01` through `OWNER-03`, exactly the two state writers in `OWNER-05`, and no mission-phase state, mining decision, cargo decision, service decision, identity-wrapper owner, or central recomputation of owner-local facts.

CONSTR-06: Owner-local contracts shall realize exactly 20 nontrivial cases one-for-one with `CASE-01` through `CASE-20`; helper invariants, initialization, type constraints, field projections, and support-routing guarantees do not change the counted case total.

CONSTR-07: End-to-end bounded analysis shall enumerate all 51,840 one-evaluation combinations of the six raw inputs and two pre-states (`6 * 3 * 4 * 3 * 4 * 3 * 4 * 5`) and compare every local fact, next state, snapshot field, directive, and controlled output with a separately expressed abstract reference relation.

CONSTR-08: Owner-local analysis shall cover evidence qualification 6, episode tracking 48, defense qualification 16, egress qualification 12, reporting 192, arbitration 9,216, controller 140, and status assessment 336,000 structurally valid combinations. The report and arbiter counts use 192 possible snapshot field products; status uses those 192 episode snapshots times 1,750 response-snapshot field products. Analysis shall separately report producer-reachable and structurally valid but unreachable combinations for both composite snapshot types.

CONSTR-09: Sequence analysis shall produce distinct witnesses for all eight scenario families, including fresh hostile declaration, the egress-over-defense conflict, blocked no-request hold, fresh retry, invalid-evidence persistence, clear confirmation, arrival without threat clearance, and cancellation-versus-arrival priority.

## Trace, verification, validation, and objective pass criteria

TRACE-01: Every significant model package, type, component definition and usage, port, semantic connection, state variable, initialization clause, integration clause, and contract clause shall cite one or more identifiers from this abstract or carry an explicit `@generated-support <reason>` annotation.

TRACE-02: Every canonical identifier in this abstract shall be classified by the trace report as realized, informational, or explicitly deferred. Missing actionable coverage, missing parents, unexplained children, and unsupported additions fail verification.

PASS-01: Structural conformance requires exactly one root System usage, one uncredited support Process, eight credited semantic Threads, nine non-root nodes, containment depth two, one weak semantic region, exactly 20 semantic interactions, ten support routes, exactly 30 source connection declarations, and no padded owner or usage.

PASS-02: Ownership conformance requires behaviorally meaningful local derivation by all eight parts, only `ThreatEpisodeTracker` writing threat-episode state, only `ResponseStateController` writing egress-session state, no downstream owner recomputation, and no credit for copying, projection, bundling, routing, or one-to-one renaming.

PASS-03: Behavioral conformance requires exactly 20 nontrivial cases with complete, disjoint, priority-ordered finite partitions; full initialization and assignment of all state, snapshot, and output fields; explicit egress-over-defense and cancellation-versus-arrival priorities; confirmed-clear recovery; and fresh-request-only retry after block.

PASS-04: Mechanical verification requires architecture-stage and final Sireum/HAMR typechecking success, compatible resolved endpoints, independent harness success, complete 51,840-valuation analysis with zero gaps, overlaps, mismatches, or false checks, owner-local products, eight scenario witnesses, and binding of analyzer evidence to the canonical source hash.

PASS-05: Trace conformance requires complete bidirectional coverage, generated-support accounting separate from semantic metrics, no extra semantic interaction, and no significant unexplained model element.

PASS-06: Validation requires Designer review that the source, summary, trace report, bounded evidence, and overview realize threat evidence, reporting, defense activation, and retreat-oriented navigation only; parser, typechecker, analyzer, and renderer success alone are insufficient.

PASS-07: Evidence shall report mining/cargo/service governance, mission-phase control, physical response, threat defeat, retreat success, timing, reliability, safety, certification, code generation, execution, and formal proof as excluded, deferred, or `not-run`, never passed.

## Diversity obligation and Model authorization

DIV-01: The closest baseline is the diversity card's accepted replicate-1 Small, Medium, and Hard combined mining-threat-retreat supervisors, which arbitrate mining, defense, retreat, hold, and service and publish a mission phase or selected action/reason.

DIV-02: This system instead accepts only threat, defense-support, route/progress, and response-disposition inputs and controls only threat reports, defense activation, retreat-oriented navigation requests, and threat-response status; mining, cargo, docking, offload, resupply, and mission-phase inputs and outputs are absent.

DIV-03: State ownership differs because independent threat-episode and egress-session owners replace the baseline's operational mission-phase/recovery topology; interaction topology differs because parallel evidence, defense, and egress qualifications converge on a narrow threat arbiter while reporting remains a separate consumer.

DIV-04: Priority and recovery also differ: a fresh eligible egress request outranks ready defense, arrival does not clear threat, declared threat survives invalid evidence, clear confirmation closes the episode, and blocked egress requires a fresh retry. None of these policies resumes mining or selects among the replicate-1 five mission actions.

DIV-05: The design is not an extension or rename of the baseline: removing every mining/cargo/service concept leaves this complete threat-evidence and egress-response purpose unchanged, while adding those decisions would introduce a materially different combined mission governor forbidden by the diversity card.

AUTH-01: Model review found the exact `8/20/20/8` semantic tuple, six-input/four-output boundary, two unique state owners, 51,840-valuation policy, support accounting, finite partitions, and deferred-claim boundary realizable without semantic revision; Model generation is authorized against this approved baseline.

