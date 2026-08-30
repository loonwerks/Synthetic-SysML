---
abstract_id: SA-MTR-R2-S-01
domain_seed: mining-threat-retreat-20260813T195454Z-v1
status: approved-final
revision: 2
campaign_complexity: small
semantic_usage_bounds: [5, 8]
selected_semantic_usage_count: 5
semantic_interaction_bounds: [7, 14]
selected_semantic_interaction_count: 13
nontrivial_contract_case_bounds: [6, 12]
selected_nontrivial_contract_case_count: 12
scenario_family_bounds: [4, 6]
selected_scenario_family_count: 5
containment_depth_beneath_root: [1, 2]
root_system_usage_count: 1
weakly_connected_semantic_regions: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Frigate threat-response coordination system

## Synopsis

SYN-01: A pilot-operated fictional mining frigate needs bounded coordination of threat evidence, threat reporting, defensive activation, and retreat-oriented navigation while it is away from the station. Mining, cargo handling, docking, offload, resupply, mission-phase selection, and physical threat defeat remain outside this system.

PURPOSE-01: The system will qualify two sources of threat evidence, determine defense and retreat readiness, own one response commitment, command defense or retreat-oriented navigation, and compose an acknowledged threat report. It controls requested responses only; sensors, drones, navigation execution, report transport, hostile behavior, and mission outcomes remain external.

## Evidence and claim classes

EVID-HB-01: Handbook-derived facts govern the engineering method: state purpose and boundary before allocation, expose assumptions and validity, compare alternatives, require bidirectional trace coverage, and separate verification from validation. The handbooks establish no mining-frigate response policy.

EVID-SEED-01: Source-grounded facts establish only the fictional frigate context; pilot, fleet, hostile-ship, drone, and navigation actors; threat detection or classification, reporting, defense activation, destination selection, warp, and docking vocabulary; and the explicit absence of a source retreat rule, validated lifecycle, timing, safety, survivability, or physical-performance claim.

EVID-PILOT-01: The exact finite input and output values, logical snapshots, qualification rules, response priority, response commitment, fresh-request arming, acknowledgment treatment, contract partition, and recovery policy below are selected pilot abstractions. They are assumptions beyond the source and do not purport to recover an upstream rule.

EVID-ARCH-01: The five selected responsibility boundaries and thirteen typed end-to-end interactions are the implementation-independent architecture selected for this run. They prescribe ownership and information meaning, not algorithms, encodings, component technology, scheduling, deployment, or executable behavior.

DEFER-CLAIM-01: Code generation, application execution, physical correctness, timing, hostile neutralization, safe navigation, mission success, safety, survivability, profitability, certification, production readiness, compositional proof, and unbounded formal proof are deferred and shall not be reported as passed.

## Goals and controlled scope

GOAL-01: The system shall determine exactly one defense command, one retreat-navigation command, one response record, and the next values of its two principal state items for every admissible decision snapshot.

GOAL-02: The system shall distinguish clear, suspect, hostile, contradictory, and invalid threat evidence and shall make invalid or contradictory response-support evidence observable without presenting it as a confirmed hostile contact.

GOAL-03: An established retreat commitment shall persist through a blocked route and shall close only on valid retreat-completion evidence; a consumed pilot retreat request shall not start another retreat episode until a valid non-retreat request rearms it.

GOAL-04: Exactly one principal response owner shall select defense versus retreat versus hold, own the response commitment and request-arm state, and select the eight command-policy cases; other usages may derive local facts or reporting priority but shall not select or override the response disposition.

SCOPE-01: Inside the system are threat-evidence interpretation, defense-readiness assessment, retreat-readiness assessment, principal response coordination, and threat-report composition. Mining, ore and cargo policy, capacitor policy, service turnaround, docking and offload control, mission/action governance, target engagement, physical execution, and report transmission are outside the boundary.

DIV-01: The closest diversity-card baseline is the accepted replicate-1 Small combined mining-threat-retreat supervisor. This system is not its extension or rename: its boundary omits cargo, capacitor, mining, service progress, and mission phase; its five usages derive response-local facts instead of qualifying and delivering a five-way mission disposition; and its recovery closes a threat-response commitment using retreat completion and fresh-request rearming rather than docking, offload, resupply, and return-to-idle progression.

## Operational context and system boundary

CTX-01: The pilot and fleet-reporting interface supplies an identification report, a response request, and report acknowledgment, and receives the composed threat report. It does not directly set the principal owner's internal commitment.

CTX-02: The frigate contact-sensing environment supplies contact-signature evidence. The abstraction neither specifies sensing technology nor assumes that a valid signature alone proves hostility.

CTX-03: The defense environment supplies defense and drone readiness evidence and receives a defense-activation command. Command receipt does not establish target lock, engagement, neutralization, or success.

CTX-04: The retreat-navigation environment supplies destination and warp-progress evidence and receives a retreat-navigation command. Command receipt and progress evidence do not establish physical safety, correct destination, docking, or return to station.

CTX-05: Mining, cargo, station service, hostile ships, and the wider mission supervisor are external context with no root flow in this abstract. They may change the external evidence providers, but no mining, cargo, or service state is reconstructed inside the boundary.

BOUND-01: The finite root boundary consists of exactly six monitored values, including their stated field statuses, and exactly three controlled values. Every monitored value maps to MON-01 through MON-06, every controlled value maps to CTRL-01 through CTRL-03, and there is no implicit mission-mode, cargo, capacitor, mining, docking, offload, or resupply flow.

MON-01: `contact_evidence`, supplied by CTX-02, contains `signature` exactly `None` or `Contact` and an independent `signature_status` exactly `Valid` or `Invalid`.

MON-02: `identification_evidence`, supplied by CTX-01, contains `identity` exactly `No_Hostile` or `Hostile` and an independent `identity_status` exactly `Valid` or `Invalid`.

MON-03: `defense_evidence`, supplied by CTX-03, contains `defense_available` exactly `Available` or `Unavailable`, `drone_readiness` exactly `Ready` or `Not_Ready`, and an independent `Valid` or `Invalid` status for each field.

MON-04: `retreat_navigation_evidence`, supplied by CTX-04, contains `destination` exactly `Identified` or `Absent`, `warp_progress` exactly `Ready`, `In_Progress`, `Complete`, or `Unavailable`, and an independent `Valid` or `Invalid` status for each field.

MON-05: `response_request`, supplied by CTX-01, is exactly `Observe`, `Defend_If_Hostile`, or `Retreat` and has independent status exactly `Valid` or `Invalid`.

MON-06: `report_acknowledgment`, supplied by CTX-01, is exactly `Not_Acknowledged` or `Acknowledged` and has independent status exactly `Valid` or `Invalid`. Its validity affects reporting priority only and shall not inhibit otherwise valid defense or retreat commands.

CTRL-01: `defense_activation`, delivered to CTX-03, is exactly `Stand_Down` or `Activate` and controls requested defensive activation only.

CTRL-02: `retreat_navigation_command`, delivered to CTX-04, is exactly `Hold` or `Retreat` and controls requested retreat-oriented navigation only.

CTRL-03: `threat_report`, delivered to CTX-01, contains the qualified threat class, selected response disposition, and report priority. Threat class is exactly `Clear`, `Suspect`, `Hostile`, or `Unknown`; disposition is exactly `Observed`, `Defense_Active`, `Retreat_Active`, `Retreat_Blocked`, `Retreat_Complete`, or `Input_Fault`; and priority is exactly `Communication_Fault`, `Closed`, `Urgent`, or `Routine`.

## Selected pilot assumptions and constraints

ASM-01: CTX-01 through CTX-04 are responsible for pairing each supplied field with its status in one stable logical snapshot. This no-tearing assumption permits finite analysis; it is not a physical timing or synchronization claim.

ASM-02: CTX-04 is responsible for asserting `Complete` only after the externally executed retreat movement has completed according to its own criteria. The system consumes that indication but does not validate position or safety.

CONS-01: Evaluation uses successive untimed logical snapshots. Initial `response_commitment` is `Open`, initial `retreat_request_armed` is `true`, and each decision snapshot determines both commands, one response record, and both next-state values.

CONS-02: `qualified_threat` is `Unknown` if either evidence status is invalid or if a valid `None` signature conflicts with a valid `Hostile` identity; otherwise `Contact` plus `Hostile` is `Hostile`, `Contact` plus `No_Hostile` is `Suspect`, and `None` plus `No_Hostile` is `Clear`.

CONS-03: `defense_condition` is `Unknown` if either defense field status is invalid, `Ready` only when both statuses are valid, defense is `Available`, and drones are `Ready`, and `Unavailable` for all three remaining valid defense-availability and drone-readiness value combinations.

CONS-04: `retreat_condition` is `Unknown` if either navigation field status is invalid; otherwise it is `Complete` when warp progress is `Complete`, `Available` when destination is `Identified` and progress is `Ready` or `In_Progress`, and `Unavailable` for every other valid combination.

CONS-05: `decision_valid` holds exactly when `qualified_threat`, `defense_condition`, and `retreat_condition` are not `Unknown` and `response_request` status is `Valid`. Report-acknowledgment validity is deliberately excluded from this command-safety predicate and is handled only by the report composer.

CONS-06: `response_commitment` is exactly `Open`, `Defense_Committed`, or `Retreat_Committed`. `retreat_request_armed` becomes true after any valid non-`Retreat` request, becomes false when a fresh `Retreat` request is consumed, and otherwise retains its prior value; invalid requests never rearm it.

CONS-07: A `fresh_retreat_trigger` exists when the commitment is not `Retreat_Committed`, retreat condition is not `Complete`, and either an armed valid `Retreat` request is present or a valid `Defend_If_Hostile` request accompanies `Hostile` threat and `Unavailable` defense. Persistent `Retreat` request text after consumption is not fresh; continuing hostile evidence with unavailable defense remains an independent trigger, while a stale `Complete` indication must first leave `Complete` before a new episode can start.

CONS-08: The exact command-policy priority is invalid or contradictory response-support evidence, established retreat commitment, fresh retreat trigger, confirmed hostile defense when requested and ready, then observation. No mining, cargo, capacitor, service, or mission-phase priority participates.

## Semantic usages and responsibility ownership

PART-01: The threat-evidence interpreter shall own and derive `qualified_threat` from both contact and identification evidence using CONS-02. It owns no command, response state, request policy, or report priority.

PART-02: The defense-readiness assessor shall own and derive `defense_condition` from both defense availability and drone readiness using CONS-03. It shall not activate defense or choose retreat.

PART-03: The retreat-readiness assessor shall own and derive `retreat_condition` from destination and warp-progress evidence using CONS-04. It shall not command movement or infer physical safety.

PART-04: The principal response coordinator shall exclusively own `response_commitment`, `retreat_request_armed`, `fresh_retreat_trigger`, the eight cases CASE-01 through CASE-08, both command values, and the response record consumed by PART-05. No other usage may select, veto, or override defense, retreat, or hold.

PART-05: The threat-report composer shall own the four reporting-only cases CASE-09 through CASE-12 and derive report priority from both the response disposition and report acknowledgment. It owns no response commitment, command value, threat qualification, or response-case selection.

OWNER-AUDIT-01: PART-01 through PART-03 each derive a many-field domain fact, PART-04 derives the response disposition and state transition, and PART-05 derives report priority from two independent concepts. No usage receives semantic credit for identity forwarding, copying, renaming, bundling, or routing alone.

STATE-AUDIT-01: PART-04 is the only state owner and owns exactly `response_commitment` and `retreat_request_armed`. PART-01, PART-02, PART-03, and PART-05 are stateless; report acknowledgment is a monitored value, not hidden report state.

CASE-AUDIT-01: PART-04 owns exactly eight mutually exclusive command-policy cases and PART-05 owns exactly four mutually exclusive reporting-only cases. Assessors' total finite derivation relations are local fact obligations, not additional response-policy cases, and no generated-support element may own a case.

## Typed directed semantic interaction inventory

INT-01: CTX-02 provides typed `contact_evidence` to PART-01.

INT-02: CTX-01 provides typed `identification_evidence` to PART-01.

INT-03: CTX-03 provides typed `defense_evidence` to PART-02.

INT-04: CTX-04 provides typed `retreat_navigation_evidence` to PART-03.

INT-05: CTX-01 provides typed `response_request` to PART-04.

INT-06: PART-01 provides derived typed `qualified_threat` to PART-04.

INT-07: PART-02 provides derived typed `defense_condition` to PART-04.

INT-08: PART-03 provides derived typed `retreat_condition` to PART-04.

INT-09: PART-04 provides typed `defense_activation` to CTX-03.

INT-10: PART-04 provides typed `retreat_navigation_command` to CTX-04.

INT-11: PART-04 provides a typed response record containing qualified threat and selected disposition to PART-05.

INT-12: CTX-01 provides typed `report_acknowledgment` to PART-05.

INT-13: PART-05 provides typed `threat_report` to CTX-01.

INTERACTION-AUDIT-01: The complete inventory is exactly INT-01 through INT-13: nine boundary-crossing interactions and four internal interactions, with no duplicate responsibility or invented traffic. Routing refinements may add concrete connection hops but shall retain these thirteen end-to-end meanings and shall not be counted as new semantic interactions.

## Structural and generated-support bounds

STRUCT-01: The final architecture shall contain exactly one explicit root system usage, exactly five responsibility-bearing semantic usages corresponding to PART-01 through PART-05, containment depth `1..2` beneath the root for those usages, one weakly connected semantic region, exactly thirteen end-to-end semantic interactions, exactly twelve nontrivial cases, and exactly five scenario families.

STRUCT-02: The exact final `5/13/12/5` point is within the declared Small bounds of `5..8`, `7..14`, `6..12`, and `4..6`. Context actors, the root, routing support, value wrappers, and local fact definitions receive no semantic-usage, interaction, case, or scenario credit.

GEN-SUPPORT-01: A behavior-free containment or routing element, routing-only port, connection hop, or typed wrapper is allowed only with a specific trace or `@generated-support` rationale. Generated support shall not derive a domain fact, hold state, select a case, change a command, choose report priority, or create a fourteenth semantic interaction.

GEN-SUPPORT-02: One behavior-free support Process may contain the five semantic usages at depth 2. Its routing may refine the nine boundary interactions into root-to-Process and Process-to-owner hops, permitting up to twenty-two concrete connection declarations while retaining exactly thirteen semantic INT meanings; the Process, its ports, and extra hops receive no semantic credit.

## Local contract obligations

CONTRACT-LOCAL-01: PART-01 shall implement exactly CONS-02's total sixteen-combination value/status relation and expose no other threat class; finite inspection shall find one derived class for every combination and the contradictory valid combination shall yield `Unknown`.

CONTRACT-LOCAL-02: PART-02 shall implement exactly CONS-03's total sixteen-combination value/status relation and expose no other defense condition; `Ready` shall occur only when both statuses are `Valid`, defense is `Available`, and drones are `Ready`, while all three other valid value pairs shall yield `Unavailable` and every invalid-status combination shall yield `Unknown`.

CONTRACT-LOCAL-03: PART-03 shall implement exactly CONS-04's total thirty-two-combination value/status relation and expose no other retreat condition; finite inspection shall show that valid `Complete` takes precedence over destination availability and that all invalid-status combinations yield `Unknown`.

CONTRACT-LOCAL-04: PART-04 shall initialize both state items as specified by CONS-01, select exactly one of CASE-01 through CASE-08 per decision snapshot, assign both commands, one complete response record, and both next-state values in every case, and use explicit mutually exclusive guards rather than textual first-match semantics.

CONTRACT-LOCAL-05: PART-05 shall select exactly one of CASE-09 through CASE-12 for every response-record and acknowledgment combination, preserve the record's qualified threat and disposition in CTRL-03, and derive exactly one report priority. Preservation fields do not earn separate owner or case credit.

## Complete command-policy partition

FAULT-01 / CASE-01: If `decision_valid` is false, PART-04 shall command `Stand_Down` and `Hold`, emit disposition `Input_Fault`, retain `Retreat_Committed` only when that was the prior commitment and otherwise set commitment to `Open`, and update the request arm only under CONS-06. Finite enumeration shall show this case and no other command-policy case for every invalid or contradictory decision snapshot, with both commands and both state values assigned.

BEH-01 / CASE-02: If `decision_valid`, prior commitment is `Retreat_Committed`, and retreat condition is `Available`, PART-04 shall command `Stand_Down` and `Retreat`, emit `Retreat_Active`, retain `Retreat_Committed`, and update the request arm under CONS-06. Each matching snapshot shall select only CASE-02 and preserve retreat regardless of current threat, defense readiness, or request value.

FAULT-02 / CASE-03: If `decision_valid`, prior commitment is `Retreat_Committed`, and retreat condition is `Unavailable`, PART-04 shall command `Stand_Down` and `Hold`, emit `Retreat_Blocked`, retain `Retreat_Committed`, and update the request arm under CONS-06. Each matching snapshot shall select only CASE-03 and shall not clear the commitment or claim retreat completion.

BEH-02 / CASE-04: If `decision_valid`, prior commitment is `Retreat_Committed`, and retreat condition is `Complete`, PART-04 shall command `Stand_Down` and `Hold`, emit `Retreat_Complete`, set commitment to `Open`, and update the request arm under CONS-06. Each matching snapshot shall select only CASE-04, and no other condition shall close a retreat commitment.

BEH-03 / CASE-05: If `decision_valid`, prior commitment is not `Retreat_Committed`, `fresh_retreat_trigger` holds, and retreat condition is `Available`, PART-04 shall command `Stand_Down` and `Retreat`, emit `Retreat_Active`, set commitment to `Retreat_Committed`, consume an armed pilot retreat request when present, and otherwise update the arm under CONS-06. Each matching snapshot shall select only CASE-05 and both an armed pilot request and hostile-with-unavailable-defense path shall be exercised.

FAULT-03 / CASE-06: If `decision_valid`, prior commitment is not `Retreat_Committed`, `fresh_retreat_trigger` holds, and retreat condition is `Unavailable`, PART-04 shall command `Stand_Down` and `Hold`, emit `Retreat_Blocked`, set commitment to `Retreat_Committed` for later recovery, consume an armed pilot retreat request when present, and otherwise update the arm under CONS-06. Each matching snapshot shall select only CASE-06 and a later valid `Available` condition shall enter CASE-02 without requiring a second request.

BEH-04 / CASE-07: If `decision_valid`, prior commitment is not `Retreat_Committed`, no fresh retreat trigger holds, threat is `Hostile`, request is `Defend_If_Hostile`, and defense condition is `Ready`, PART-04 shall command `Activate` and `Hold`, emit `Defense_Active`, set commitment to `Defense_Committed`, and update the request arm under CONS-06. Each matching snapshot shall select only CASE-07, and defense shall never activate for suspect, clear, unknown, unavailable-defense, or retreat-priority conditions.

BEH-05 / CASE-08: Every remaining `decision_valid` snapshot with prior commitment not `Retreat_Committed` shall command `Stand_Down` and `Hold`, emit `Observed`, set commitment to `Open`, and update the request arm under CONS-06. Finite enumeration shall show CASE-08 is the exact complement of CASE-02 through CASE-07 within valid snapshots and covers clear, suspect, observe-only, cleared-defense, and nonfresh-retreat-request behavior.

## Complete reporting partition

FAULT-04 / CASE-09: If report-acknowledgment status is `Invalid`, PART-05 shall preserve the response record and set report priority to `Communication_Fault`. All invalid-ack combinations shall select only CASE-09 while CTRL-01 and CTRL-02 remain governed solely by CASE-01 through CASE-08.

BEH-06 / CASE-10: If acknowledgment is valid and `Acknowledged`, PART-05 shall preserve the response record and set report priority to `Closed`. All and only valid acknowledged combinations shall select CASE-10.

FAULT-05 / CASE-11: If acknowledgment is valid and `Not_Acknowledged` and disposition is `Input_Fault` or `Retreat_Blocked`, PART-05 shall preserve the response record and set report priority to `Urgent`. All and only unacknowledged fault or blocked-response records shall select CASE-11.

BEH-07 / CASE-12: If acknowledgment is valid and `Not_Acknowledged` and disposition is `Observed`, `Defense_Active`, `Retreat_Active`, or `Retreat_Complete`, PART-05 shall preserve the response record and set report priority to `Routine`. This case shall be the exact remaining valid unacknowledged reporting partition and shall select no fault priority.

PARTITION-AUDIT-01: CASE-01 through CASE-08 are pairwise disjoint and exhaustive over all decision snapshots because invalidity, prior retreat commitment with three finite retreat conditions, fresh trigger with available versus unavailable retreat, confirmed ready defense, and residual observation including noncommitted `Complete` form a closed ordered partition with explicit exclusions.

PARTITION-AUDIT-02: CASE-09 through CASE-12 are pairwise disjoint and exhaustive over both acknowledgment values, both statuses, and all six dispositions. Together the twelve cases include nominal, boundary, invalid/fault, blocked recovery, completed recovery, and fresh-request behavior without relying on unstated defaults.

## Risks, state, and transitions

RISK-01: Invalid or contradictory evidence could otherwise be presented as confirmed hostility and trigger an unsupported command. FAULT-01 inhibits both commands and exposes `Input_Fault`; no probability or physical severity is claimed.

RISK-02: Clearing a retreat commitment when navigation is merely unavailable could suppress later progress after the route recovers. FAULT-02 and FAULT-03 retain `Retreat_Committed` until BEH-02 receives valid completion evidence.

RISK-03: A report-acknowledgment fault could otherwise suppress a valid response or be confused with decision-input invalidity. FAULT-04 confines that fault to report priority while leaving command policy unchanged.

MODE-01: The system has no published mission phase or operational mode. `response_commitment` is internal decision memory whose observable consequence is limited to command persistence and response disposition; it does not describe mining, docking, service, or whole-frigate lifecycle state.

TRANS-01: CASE-05 or CASE-06 enters `Retreat_Committed`; CASE-02 or CASE-03 retains it; CASE-01 retains it only across invalid evidence; and only CASE-04 exits it after valid completion.

TRANS-02: CASE-07 enters or retains `Defense_Committed`; CASE-08 clears it when its exact hostile-defense guard no longer holds; CASE-01 also clears it under invalid decision evidence.

TRANS-03: A valid non-retreat request rearms a consumed retreat request in any case, while CASE-05 or CASE-06 consumes an armed retreat request. Persistent `Retreat` after CASE-04 therefore reaches CASE-08 until rearming occurs, unless the independent hostile-with-unavailable-defense trigger holds.

## Required scenario families

SCN-01: The nominal threat-observation and defense family shall cover clear observation, suspect observation, confirmed hostile defense activation, continued confirmed defense, and threat clearance. Retained evidence shall exercise CASE-07, CASE-08, CASE-10, and CASE-12 and match both commands, response disposition, next commitment, request-arm value, and report priority at each step.

SCN-02: The evidence-boundary and priority family shall cover all four qualified-threat outcomes, both defense conditions plus `Unknown`, all three retreat conditions plus `Unknown`, and competing hostile-defense and retreat triggers. Exact boundary combinations shall match CONS-02 through CONS-04 and retreat cases shall exclude defense whenever both appear applicable.

SCN-03: The invalid and reporting-fault family shall invalidate each status field alone, exercise selected multi-invalid combinations, and exercise the valid contradictory threat pair and an invalid acknowledgment. Every decision-input defect shall select CASE-01 with both commands inhibited, while acknowledgment invalidity shall select CASE-09 without changing otherwise valid commands.

SCN-04: The blocked-retreat and completion-recovery family shall consume a fresh retreat request with an unavailable route, retain the retreat commitment, recover to available and command retreat, then accept valid completion and close the commitment. The trace shall follow CASE-06, CASE-02, and CASE-04 without clearing early, activating defense, or claiming station service.

SCN-05: The fresh-request and report-acknowledgment family shall keep `Retreat` asserted after completion, demonstrate no new request-triggered retreat, apply a valid non-retreat request to rearm, issue a new retreat request, and vary unacknowledged urgent, unacknowledged routine, acknowledged, and invalid-ack reporting. All four report cases and the consume/rearm rule shall be observed with no stale request retrigger.

## Bounded end-to-end analysis obligations

ANALYSIS-01: The deterministic analyzer shall independently enumerate the raw finite boundary product of `4 * 4 * 16 * 32 * 6 * 4 = 196,608` value/status combinations, all `3 * 2 = 6` principal pre-state combinations, and therefore exactly `1,179,648` decision-and-report snapshots. No environmental combination may be removed as inadmissible.

ANALYSIS-02: For every snapshot, the analyzer shall execute PART-01 through PART-03 owner-local relations, consume their derived values through INT-06 through INT-08, execute exactly one CASE-01 through CASE-08 relation in PART-04, pass the PART-04 response record through INT-11, execute exactly one CASE-09 through CASE-12 relation in PART-05, and account for INT-01 through INT-13. Central recomputation of assessor facts from root inputs does not satisfy this obligation.

ANALYSIS-03: The analyzer shall retain counts and a first witness for zero or multiple cases, unassigned outputs or state, assessor mismatch, unresolved interaction endpoint, command override outside PART-04, report-priority mismatch, owner-local relation mismatch, and any metric/evidence disagreement.

ANALYSIS-04: The analyzer shall separately retain bounded multi-step traces for all five scenario families, including invalid restoration, blocked-route recovery, completion closure, persistent consumed request, non-retreat rearming, a second fresh request, defense clearance, and acknowledgment changes. Enumeration is finite conformance evidence, not physical validation or unbounded proof.

## Traceability and objective pass criteria

TRACE-01: Every actionable abstract identifier shall trace to one or more model elements or be explicitly informational or deferred; every significant generated usage, port, connection, state item, contract clause, and analyzer relation shall trace to this abstract or carry a specific generated-support rationale.

TRACE-02: Trace coverage is many-to-many and bidirectional. A missing abstract item, unexplained significant element, second response-disposition owner, hidden mission phase, cargo/mining/service policy, silent case weakening, or owner credited only for forwarding blocks acceptance.

PASS-01: Structural analysis shall report exactly one root, five semantic usages, thirteen semantic interactions, containment depth within `1..2`, one weakly connected semantic region, twelve nontrivial cases, five scenario families, and no padded usage or interaction.

PASS-02: Boundary inspection shall account for exactly MON-01 through MON-06 and CTRL-01 through CTRL-03 with compatible finite types, directions, independent statuses, and no unresolved endpoint or excluded-scope input.

PASS-03: Ownership inspection shall identify PART-04 as the sole owner of response disposition, both commands, response commitment, request arming, fresh-retreat triggering, and CASE-01 through CASE-08; PART-05 shall own reporting priority only, and every assessor shall derive its stated local fact.

PASS-04: Contract inspection and bounded analysis shall report exactly one command-policy case and one reporting case for each of 1,179,648 snapshots, complete assignment of all controlled and state values, and exact conformance to CONS-02 through CONS-08, including all four valid PART-02 value pairs.

PASS-05: Scenario evidence shall cover all five families and explicitly show nominal, boundary, invalid/fault, blocked recovery, completion recovery, command/report fault separation, and fresh-request rearming behavior.

PASS-06: Architecture-stage and final Sireum/HAMR typechecking plus the independent harness gate shall pass. These results verify retained source conformance only and do not validate physical or domain fitness.

PASS-07: Bidirectional trace analysis shall report no missing required identifier and no unexplained significant model element; any routing refinement shall preserve the relevant end-to-end INT identifier.

PASS-08: Designer validation shall separately find the result faithful to the narrow threat-response purpose, exact boundary, ownership, priority, partition, recovery, diversity constraints, and exclusions; tool success alone is insufficient.

PASS-09: The reviewed `system-overview` shall bind to this revision-2 accepted baseline and visibly distinguish five semantic usages, the sole principal response owner, thirteen end-to-end flows, and external actors without presenting generated support as a semantic usage.

PASS-10: Reports shall mark execution, physical performance, safety, hostile defeat, safe retreat, mission outcome, service turnaround, profitability, certification, solver proof, and production claims `not-run`, `deferred`, or `out-of-scope`, never `passed`.

## Deferred checks and claims

DEFER-CHECK-01: The seed declares no executable profile, so application code, code generation, runtime execution, scheduling, deployment, and real-time behavior are not required and shall remain `not-run`.

DEFER-CHECK-02: Mining and cargo control, docking/offload/resupply control, whole-mission arbitration, physical retreat completion, hostile neutralization, compositional proof, solver certification, unbounded correctness, safety, survivability, certification, and production readiness remain `deferred` or `out-of-scope`.
