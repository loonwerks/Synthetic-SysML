---
abstract_id: SA-MTR-FINAL-01
domain_seed: mining-threat-retreat-supervision-20260812-r1-a4
stage: designer-resolution
status: approved
complexity: medium
semantic_usage_bounds: [8, 12]
selected_semantic_usages: 8
semantic_interaction_bounds: [15, 21]
selected_semantic_interactions: 18
nontrivial_contract_case_bounds: [12, 20]
selected_nontrivial_contract_cases: 20
scenario_family_bounds: [6, 9]
selected_scenario_families: 7
containment_depth_bounds: [1, 2]
required_weakly_connected_regions: 1
requires_stateful_behavior: true
requires_fault_behavior: true
---

# Mining Threat-Response and Retreat Supervisor

## Evidence and claim classes

EVID-HB-01: **Handbook-derived method fact.** The abstract defines need, context, boundary, responsibility allocation, nominal and off-nominal behavior, assumptions, alternatives, traceability, and objective evidence before source realization. This is a method constraint, not a mining-domain claim.

EVID-HB-02: **Handbook-derived method fact.** Verification means conformance to this approved abstract and retained tool rules; validation means fitness for the stated pilot purpose and context. Neither result may substitute for the other.

EVID-PA-01: **Pilot abstraction.** All finite bands, validity rules, phases, readiness predicates, ordered reason cases, and the C05 priority are frozen experimental policy supplied by the seed. They are conservative abstractions, not handbook facts or claims about production mining operations.

EVID-SA-01: **Selected architecture.** Signal-centered qualification feeds cooperating mission/recovery and threat/retreat policies; a separate fault assessor applies phase relevance to qualifier-owned invalidity facts; explicit priority/phase arbitration and atomic publication complete the result. This selects responsibilities and semantic dependencies only, not an algorithm, component technology, scheduling scheme, deployment topology, or modeling profile.

EVID-DC-01: **Deferred claim.** Physical validity, mission success, profitability, survivability, safety, readiness, certification, code execution, and formal proof remain outside this approved abstract. No omitted or not-run check is reported as passed.

## Need, purpose, and goals

NEED-01: **Pilot abstraction.** A mining-frigate pilot and commander need deterministic mining, defense, retreat, and recovery supervision when observations may be invalid.

PURPOSE-01: **Pilot abstraction.** The system will resolve one command, current and next phase, reason, fault indication, operational advisories, and next threat-validity streak for each classified tick across nominal, conflict, degraded, and recovery paths.

GOAL-01: **Pilot abstraction.** The system shall produce a total, deterministic result for every combination of the finite current state and tick inputs. Verification: bounded contract analysis shall find exactly one selected reason case for every enumerated combination and no uncovered or multiply selected combination.

GOAL-02: **Pilot abstraction.** The system shall prevent invalid observations from proving threat trust, readiness, arrival, or recovery completion. Verification: contract inspection and bounded analysis shall show that each invalidity rule in ASM-02 through ASM-05 constrains every affected output and state update.

GOAL-03: **Pilot abstraction.** The system shall preserve the frozen phase-local ordering and publish the selected row identifier as the reason, including the explicit C05 conflict outcome. Verification: bounded analysis shall exercise all 20 reason rows and the conflict witnesses named by SCN-04.

GOAL-04: **Pilot abstraction.** The system shall publish command, phase, reason, actuator posture, advisories, fault, and next streak as one coherent tick result. Verification: structural and contract inspection shall find one publication responsibility and shall reject independently updated or contradictory controlled values.

## Operational context and system boundary

STAKE-01 CTX-01: **Pilot abstraction.** The Pilot supplies current intent and receives the supervised command, reason, phase, advisories, and fault indication; the Pilot is outside the modeled system and owns the validity of the stated intent.

CTX-02: **Pilot abstraction.** Fleet Command supplies the commander-level mission and threat-response intent embodied by the frozen policy and receives the same observable supervision result; Fleet Command is outside the system and is responsible for approving changes to policy meaning or priority.

CTX-03: **Pilot abstraction.** Operations/Engineering supplies resource availability and resupply status and acts on recovery and docking outcomes; it is outside the system and owns the declared validity of those observations.

CTX-04: **Pilot abstraction.** The operational environment contains mining, combat, travel, station arrival, docking, offload, and target/resource conditions. It supplies the classified threat, cargo, capacitor, target, and arrival observations; the system observes but does not implement or guarantee those external activities.

CTX-05: **Pilot abstraction, informational.** Allocation reviewers compare responsibility allocations and inspect traces and bounded evidence. They do not participate in an operational scenario and have no modeled control authority.

MON-01: **Pilot abstraction.** The tick boundary presents owned internal `phase=Docked|Mining|Defending|Retreating|Recovery`, initially `Docked`, and owned internal `valid_streak=0|1|2`, initially `0`, together with the current observations. Phase and streak are state inputs to the current tick, not measurements asserted by an external actor.

STATE-01: **Pilot abstraction.** Phase and valid streak are the only retained state items. Exactly one owner shall update each: AS updates phase and TQ updates valid streak, as constrained by STATE-OWN-01; neither state item may be shadowed or recomputed elsewhere.

MON-02: **Pilot abstraction.** Every tick observes `threat=Clear|Caution|Hostile|Severe`, `cargo=Empty|Partial|NearlyFull|Full`, `capacitor=High|Adequate|Low|Critical`, and `target=Available|Depleted`, each with independent `Valid|Invalid` validity supplied by CTX-04.

MON-03: **Pilot abstraction.** Every tick observes `mining_availability`, `defense_availability`, and `retreat_availability` as `Available|Unavailable` under one `availability_validity=Valid|Invalid`, supplied by CTX-03.

MON-04: **Pilot abstraction.** Every tick observes `pilot_intent=Mine|Hold|Return` from CTX-01, `arrival=EnRoute|SafeAtStation` from CTX-04, and `resupply=Incomplete|Complete` from CTX-03, each with independent validity. Arrival validity affects faulting only in `Retreating`; resupply validity affects faulting only in `Docked|Recovery`.

CTRL-01: **Pilot abstraction.** The system controls the published `command=StayDocked|Depart|Mine|HoldAtSite|Defend|Retreat|Recover`, current phase, next phase, and `reason=C01|...|C20` received by CTX-01, CTX-02, and CTX-03. These outputs supervise external action but do not claim that the action succeeds.

CTRL-02: **Pilot abstraction.** The same result controls `laser=Enabled|Disabled`, `drones=Stowed|Mining|Defense`, cargo advisory `Normal|NearlyFull|Full|Unknown`, capacitor advisory `Normal|Low|Critical|Unknown`, retreat advisory `Ready|Unavailable|Unknown`, `fault=Clear|Asserted`, and `next_valid_streak=0|1|2` for the external recipients.

BOUNDARY-01: **Pilot abstraction.** The semantic boundary begins with the current tick values in MON-02 through MON-04 and the owned state in MON-01, and ends with CTRL-01 and CTRL-02. Mining equipment, drones, navigation, docking, resupply, combat, sensing/classification, and human action remain external.

## Essential assumptions and finite qualification rules

ASM-01: **Pilot abstraction.** One tick consumes one coherent classified snapshot; no stale event or hidden provenance exists. CTX-03 and CTX-04 are responsible for supplying observations and validity for the same tick. Rationale: deterministic finite checking would be ambiguous if observations from different ticks could be silently mixed; the model shall not invent freshness, sequence, or provenance evidence.

ASM-02: **Pilot abstraction.** Invalid threat sets the next streak to `0`; valid threat sets it to `min(2, valid_streak+1)`. Threat is `Untrusted` until the next streak is `2`, after which the current valid threat band is used; invalid threat is never `Clear`. CTX-04 is responsible for fresh threat classification and validity. Rationale: two fresh valid ticks are the frozen trust rule, not a physical sensor assertion.

ASM-03: **Pilot abstraction.** `mine_ready` requires valid non-`Full` cargo, `High|Adequate` capacitor, `Available` target, valid availability, and available mining; `defense_ready` requires valid `High|Adequate` capacitor, valid availability, and available defense; `resource_reset` requires valid `Empty` cargo and `High|Adequate` capacitor; `recovery_complete` additionally requires valid `Complete` resupply. CTX-03 and CTX-04 own the underlying observation validity. Rationale: these are logical policy facts only and make no equipment-sufficiency claim.

ASM-04: **Pilot abstraction.** `Clear|Caution` is `acceptable`; `Hostile|Severe|Untrusted` is not. A retreat command may be requested when retreat capability is invalid or unavailable without claiming escape. CTX-02 is responsible for the frozen policy meaning. Rationale: command selection and external success are separate claims.

ASM-05: **Pilot abstraction.** Invalid intent blocks departure and recovery completion and causes retreat from `Mining`; invalid inputs cannot establish readiness; only a fresh valid `SafeAtStation` observation leaves `Retreating`. CTX-01 owns intent validity, CTX-04 owns arrival validity, and CTX-03 owns resupply validity. Rationale: invalid or irrelevant data cannot serve as a transition trigger.

QUAL-01: **Pilot abstraction.** Invalid cargo or capacitor maps to `Unknown`; otherwise cargo maps to `Full`, `NearlyFull`, or `Normal`, and capacitor maps to `Critical`, `Low`, or `Normal`. Invalid availability maps retreat advisory to `Unknown`; valid availability maps it to `Ready` or `Unavailable`. Verification: exhaustive mapping analysis shall produce one advisory for every input/value-validity pair and shall never map invalid data to a known favorable advisory.

FAULT-01: **Pilot abstraction.** The system shall assert fault exactly when any MON-02 or MON-03 observation is invalid, pilot intent is invalid, arrival is invalid while current phase is `Retreating`, or resupply is invalid while current phase is `Docked|Recovery`; otherwise it shall clear fault. Verification: bounded analysis shall compare the FA-owned fault against this predicate for every finite state/input combination with zero mismatches.

## Selected responsibilities

PART-01: **Selected architecture — Fault Assessment (FA).** Consumes qualifier-owned threat, resource, and mission invalidity facts plus AS-owned current phase, applies only the phase relevance in FAULT-01, and derives exactly one `Clear|Asserted` fault fact. FA shall not inspect raw observations, requalify a domain value, decide a reason, or own phase.

PART-02: **Selected architecture — Threat Qualification (TQ).** Solely owns `valid_streak`; derives `next_valid_streak`, `Untrusted|Clear|Caution|Hostile|Severe`, threat invalidity, and the threat publication facts from raw threat and prior streak. Owner-local evidence shall implement ASM-02 without another usage or the analyzer recomputing it.

PART-03: **Selected architecture — Resource Qualification (RQ).** Derives mining/recovery readiness facts, defense readiness, resource reset, resource advisories, retreat advisory, and a domain-invalidity fact from raw resource observations. Owner-local evidence shall implement ASM-03 and QUAL-01 rather than rebundle inputs.

PART-04: **Selected architecture — Personnel/Mission Qualification (PQ).** Derives valid-Mine, invalid-or-Return, valid-Hold/Return, valid-SafeAtStation, valid-Complete-resupply, and independent intent/arrival/resupply invalidity facts from raw mission observations. PQ has no phase input and shall not decide whether arrival or resupply invalidity is phase-relevant.

PART-05: **Selected architecture — Mission/Recovery Decision (MR).** Derives at most one proposal from `None|C01|C02|C07|C08|C09|C10|C11|C14|C18|C19|C20` using current phase plus qualified threat, resource, intent, and resupply facts. It owns mission/recovery applicability and shall not reproduce qualification or final arbitration.

PART-06: **Selected architecture — Threat/Retreat Decision (TR).** Derives at most one proposal from `None|C03|C04|C05|C06|C12|C13|C15|C16|C17` using current phase plus qualified threat, defense, and arrival facts. It owns threat-response/retreat applicability and shall not reproduce qualification or final arbitration.

PART-07: **Selected architecture — Priority/Phase Arbitration (AS).** Solely owns current `phase`; resolves the two finite proposals with mutually exclusive effective guards that preserve the frozen phase-local order; derives command, next phase, and reason; consumes FA fault and TQ/RQ publication facts for one atomic result. AS owns the explicit C05-over-C07/C08 conflict and shall not recompute qualifier or policy guards.

PART-08: **Selected architecture — Atomic Publication (AP).** Derives actuator posture from the resolved command and exposes all CTRL-01/CTRL-02 fields together. Owner-local evidence shall implement the command-to-laser/drone mapping; AP shall not choose a different reason, phase, fault, advisory, or next streak.

OWNER-01: **Selected architecture.** Exactly eight usages receive semantic credit: FA, TQ, RQ, PQ, MR, TR, AS, and AP. MR and TR are cooperating proposal owners resolved by AS; TQ, RQ, PQ, and FA also have meaningful owner-local derivations. Credit is denied to any usage whose retained behavior only copies, bundles, renames, or reroutes values.

## Semantic interaction inventory

INT-01: **Selected architecture.** AS supplies `Phase` to MR as `current_phase -> phase_context` so mission/recovery applicability is phase-local without MR owning phase.

INT-02: **Selected architecture.** AS separately supplies `Phase` to TR as `current_phase -> phase_context` so threat/retreat applicability is phase-local without TR owning phase.

INT-03: **Selected architecture.** TQ supplies `QualifiedThreat` to MR as `qualified_threat -> threat_fact` for acceptable/unacceptable recovery and redeployment decisions.

INT-04: **Selected architecture.** TQ separately supplies `QualifiedThreat` to TR as `qualified_threat -> threat_fact` for Untrusted, Hostile, and Severe response decisions.

INT-05: **Selected architecture.** RQ supplies `MiningRecoveryFacts` to MR as `mining_recovery_facts -> resource_facts` for mining, reset, and recovery guards.

INT-06: **Selected architecture.** RQ separately supplies `DefenseFacts` to TR as `defense_facts -> defense_facts` for Hostile defense versus retreat.

INT-07: **Selected architecture.** PQ supplies `MissionFacts` to MR as `intent_resupply_facts -> mission_facts` for intent and resupply guards.

INT-08: **Selected architecture.** PQ separately supplies `ArrivalFact` to TR as `arrival_fact -> arrival_fact` for the fresh valid `SafeAtStation` transition.

INT-09: **Selected architecture.** MR supplies `MissionProposal` to AS as `mission_proposal -> mission_candidate`; it identifies one MR-owned reason or `None`, not a final command.

INT-10: **Selected architecture.** TR supplies `ResponseProposal` to AS as `response_proposal -> response_candidate`; it identifies one TR-owned reason or `None`, not a final command.

INT-11: **Selected architecture.** TQ supplies `ThreatPublicationFacts` to AS as `threat_publication -> threat_publication`; it carries the qualified threat and next streak needed in the atomic result without making AS repeat ASM-02.

INT-12: **Selected architecture.** RQ supplies `ResourcePublicationFacts` to AS as `resource_publication -> resource_publication`; it carries cargo, capacitor, and retreat advisories needed in the atomic result without making AS repeat QUAL-01.

INT-13: **Selected architecture.** PQ supplies `MissionInvalidityFacts` to FA as `mission_invalidity -> mission_invalidity`; it preserves independent intent, arrival, and resupply invalidity without applying phase relevance.

INT-14: **Selected architecture.** TQ supplies `ThreatInvalidity` to FA as `threat_invalidity -> threat_invalidity` so FAULT-01 can cover threat invalidity without raw-threat inspection.

INT-15: **Selected architecture.** RQ supplies `ResourceInvalidity` to FA as `resource_invalidity -> resource_invalidity` so FAULT-01 can cover every cargo, capacitor, target, and availability invalidity without raw-resource inspection.

INT-16: **Selected architecture.** AS supplies `Phase` to FA as `current_phase -> phase_context` solely so FA can apply arrival and resupply fault relevance; FA cannot update phase.

INT-17: **Selected architecture.** FA supplies `Fault` to AS as `fault -> fault` for inclusion in the one resolved atomic result; AS shall not re-evaluate the fault predicate.

INT-18: **Selected architecture.** AS supplies one `AtomicSupervisorResult` to AP as `resolved_atomic_result -> atomic_result`; it carries selected command, current/next phase, reason, fault, next streak, and qualified publication facts for coherent controlled outputs.

INTERACTION-COUNT-01: **Selected architecture.** INT-01 through INT-18 are exactly 18 producer-consumer semantic dependencies. Boundary links, containment, fields within a typed fact, and generated-support routing are not counted interactions; splitting or combining a listed dependency solely to change the count is prohibited.

## Modes and observable state

MODE-01: **Pilot abstraction.** `Docked` observes departure readiness and otherwise publishes `StayDocked`; only CASE-01 can leave it for `Mining`.

MODE-02: **Pilot abstraction.** `Mining` can mine, hold, defend, or retreat; CASE-03 through CASE-11 provide all ordered triggers and destinations.

MODE-03: **Pilot abstraction.** `Defending` can continue defense, return to mining, or retreat; CASE-12 through CASE-15 provide all ordered triggers and destinations.

MODE-04: **Pilot abstraction.** `Retreating` continues to request retreat until a fresh valid station-arrival observation; only CASE-16 enters `Recovery`, and CASE-17 remains `Retreating`.

MODE-05: **Pilot abstraction.** `Recovery` continues recovery, redeploys, or settles docked; CASE-18 through CASE-20 provide all ordered triggers and destinations.

STATE-OWN-01: **Selected architecture.** TQ is the only streak-state owner and AS is the only phase-state owner. Verification: ownership audit shall find one retained state declaration/update responsibility for each, no state shadowing or central recomputation, and no forwarding-only owner credit.

## Local contracts and publication behavior

LOCAL-CONTRACT-01: **Selected architecture.** TQ contracts shall close the finite prior-streak, threat-band, and threat-validity domain and derive ASM-02 outputs; RQ contracts shall close all readiness, reset, advisory, and resource-invalidity mappings; PQ contracts shall close the intent, arrival, resupply, and independent-validity mappings without phase relevance.

LOCAL-CONTRACT-02: **Selected architecture.** MR and TR contracts shall each yield exactly one value in their declared proposal domain for every local input combination. AS contracts shall use mutually exclusive effective guards over current phase and proposal enums, preserve CASE-01 through CASE-20 order, and never rely on first-match execution semantics.

LOCAL-CONTRACT-03: **Selected architecture.** FA contracts shall implement FAULT-01 exactly from TQ/RQ/PQ invalidity facts and AS current phase. AP contracts shall implement the command-to-actuator map and coherent exposure of the resolved atomic result. Qualification partitions and initialization support the 20 reason cases but are not additional counted nontrivial contract cases.

OWNERSHIP-AUDIT-01: **Verification constraint.** Harness ownership claims shall use only accepted roles `applicability`, `proposal`, and `decision`; qualification/state detail belongs in evidence fields and the trace report. MR, TR, and AS shall be audited at minimum, and retained evidence shall also identify the owner-local derivation of every semantically credited usage.

BEH-01: **Pilot abstraction.** TQ shall apply ASM-02 on every tick and make the newly qualified threat and next streak available to both policies and the atomic result. Verification: source/contract inspection plus bounded analysis shall cover invalid threat and every prior streak and show that trust occurs exactly when computed next streak is `2`.

BEH-02: **Pilot abstraction.** RQ and PQ shall derive ASM-03, ASM-05, QUAL-01, and their independent status facts locally; FA alone shall add phase relevance for FAULT-01. Verification: ownership audit and bounded analysis shall agree on readiness, advisories, mission facts, and fault with no analyzer-only or AS-local reimplementation.

BEH-03: **Pilot abstraction.** MR and TR shall derive only proposals in their assigned finite domains, and AS shall resolve the first applicable phase-local row among CASE-01 through CASE-20 through mutually exclusive effective guards. Verification: contract inspection shall establish proposal-domain closure and bounded analysis shall find exactly one selected row for every state/input combination.

BEH-04: **Pilot abstraction.** If selected command is `Mine`, AP shall publish laser `Enabled` and drones `Mining`; if `Defend`, AP shall publish laser `Disabled` and drones `Defense`; otherwise AP shall publish laser `Disabled` and drones `Stowed`. Verification: exhaustive command/output mapping shall have zero unmapped commands and zero contradictory actuator combinations.

BEH-05: **Pilot abstraction.** Current phase, next phase, selected reason, command, fault, advisories, actuator posture, and next streak shall be published as one same-tick result. Verification: structural inspection shall find exactly one INT-18 publication dependency, and contract analysis shall show all fields derive from the same resolved row and snapshot.

BEH-06: **Pilot abstraction.** C01 is a fresh Docked departure, C16 alone enters Recovery, C18 holds for fresh trust/intent/reset/resupply, C19 redeploys on readiness and valid Mine intent, and C20 deliberately settles completed Hold/Return; no phase exit is triggerless. Verification: transition analysis shall find no phase-changing result outside the identified cases and shall match every destination below.

## Twenty ordered nontrivial contract cases

CASE-01: **Reason C01.** In `Docked`, acceptable threat, `mine_ready`, `recovery_complete`, and valid `Mine` shall command `Depart` and set next phase `Mining`; bounded analysis shall select C01 exactly for this first Docked guard.

CASE-02: **Reason C02.** In `Docked`, every combination not selected by C01 shall command `StayDocked` and keep next phase `Docked`; bounded analysis shall show C02 closes the Docked domain without effective overlap.

CASE-03: **Reason C03.** In `Mining`, `Untrusted` threat shall command `Retreat` and set next phase `Retreating`; bounded analysis shall show C03 precedes every other Mining guard.

CASE-04: **Reason C04.** In `Mining`, after C03 is excluded, `Severe` threat shall command `Retreat` and set next phase `Retreating`; bounded analysis shall show C04 precedes Hostile and mission/resource guards.

CASE-05: **Reason C05.** In `Mining`, after C03/C04 are excluded, `Hostile` with `defense_ready` shall command `Defend` and set next phase `Defending`; conflict witnesses with simultaneous valid `Return`, `Full` cargo, or another C07/C08 trigger shall still select C05.

CASE-06: **Reason C06.** In `Mining`, after C03/C04 are excluded, `Hostile` without `defense_ready` shall command `Retreat` and set next phase `Retreating`; failed or unproved defense readiness shall select C06.

CASE-07: **Reason C07.** In `Mining`, after C03 through C06 are excluded, invalid intent or valid `Return` shall command `Retreat` and set next phase `Retreating`; both guard causes shall be covered without defeating earlier Hostile-defense priority.

CASE-08: **Reason C08.** In `Mining`, after C03 through C07 are excluded, invalid or `Full` cargo, or invalid, `Low`, or `Critical` capacitor shall command `Retreat` and set next phase `Retreating`; each resource boundary/invalidity cause shall be covered.

CASE-09: **Reason C09.** In `Mining`, after C03 through C08 are excluded, invalid or `Depleted` target, or invalid/unavailable mining capability shall command `HoldAtSite` and keep next phase `Mining`; each target and mining-availability cause shall be covered.

CASE-10: **Reason C10.** In `Mining`, after C03 through C09 are excluded, valid `Hold` shall command `HoldAtSite` and keep next phase `Mining`; this case shall not preempt an earlier degraded case.

CASE-11: **Reason C11.** In `Mining`, every remaining combination shall command `Mine` and keep next phase `Mining`; the otherwise row shall be reachable and close the Mining domain.

CASE-12: **Reason C12.** In `Defending`, `Untrusted|Severe` threat or failure to prove `defense_ready` shall command `Retreat` and set next phase `Retreating`; each cause shall be covered before C13 through C15.

CASE-13: **Reason C13.** In `Defending`, after C12 is excluded, `Hostile` shall command `Defend` and keep next phase `Defending`; C13 shall be reachable only with defense readiness established.

CASE-14: **Reason C14.** In `Defending`, after C12/C13 are excluded, acceptable threat with `mine_ready` and valid `Mine` shall command `Mine` and set next phase `Mining`; every conjunct shall be required.

CASE-15: **Reason C15.** In `Defending`, every remaining combination shall command `Retreat` and set next phase `Retreating`; C15 shall close Defending after ordered resolution.

CASE-16: **Reason C16.** In `Retreating`, fresh valid `SafeAtStation` shall command `Recover` and set next phase `Recovery`; only this row shall leave Retreating and invalid arrival shall never satisfy it.

CASE-17: **Reason C17.** In `Retreating`, every other arrival condition shall command `Retreat` and keep next phase `Retreating`; EnRoute and invalid-arrival witnesses shall close the domain.

CASE-18: **Reason C18.** In `Recovery`, unacceptable threat, invalid intent, or failure to prove `recovery_complete` shall command `Recover` and keep next phase `Recovery`; reset/resupply invalidity or incompleteness shall be covered before later rows.

CASE-19: **Reason C19.** In `Recovery`, after C18 is excluded, acceptable threat with `recovery_complete`, `mine_ready`, and valid `Mine` shall command `Depart` and set next phase `Mining`; C19 shall be the only Recovery redeployment row.

CASE-20: **Reason C20.** In `Recovery`, every remaining valid `Hold|Return` combination shall command `StayDocked` and set next phase `Docked`; C20 shall be reachable, deliberate, and close Recovery after C18/C19.

CASE-COUNT-01: **Pilot abstraction.** CASE-01 through CASE-20 are exactly 20 counted nontrivial contract cases. Their guards, order, commands, destinations, and published reasons are frozen; qualification mappings, fault mapping, ownership assertions, initialization, and atomicity obligations shall not be relabeled or duplicated as additional counted cases.

## Priority conflict and risk scenarios

PRIORITY-01: **Pilot abstraction.** In `Mining`, C03/C04 lead and C05 precedes C07/C08; failed defense readiness yields C06. Ready defense under `Hostile` therefore wins over simultaneous valid `Return`, `Full` cargo, or another resource-retreat trigger. This invented ordering is observable policy, not a safety claim.

RISK-01: **Pilot abstraction.** If invalid threat were interpreted as `Clear`, supervision could continue mining or recovery without re-establishing trust. The consequence is violation of frozen invalid-data policy, not an asserted physical loss. Mitigation trace: FAULT-02.

FAULT-02: **Pilot abstraction.** ASM-02 together with C03, C12, and C18 shall prevent invalid threat from proving acceptable operation. Verification: an invalid-threat witness from each relevant phase shall reset streak and select the conservative row; two subsequent valid ticks shall restore trust.

RISK-02: **Pilot abstraction.** If proposal arbitration obscured the C05 conflict, simultaneous Hostile threat and Return/Full/resource retreat could select a later mission case and publish the wrong reason. The consequence is loss of deterministic policy fidelity. Mitigation trace: FAULT-03.

FAULT-03: **Pilot abstraction.** AS shall make the C05-over-C07/C08 order explicit and preserve C05 as the published reason. Verification: SCN-04 conflict witnesses shall select C05 when defense is ready and C06 when readiness fails.

RISK-03: **Pilot abstraction.** If stale or invalid station arrival triggered Recovery, supervision could stop requesting retreat without a fresh valid station observation. The consequence is an unsupported phase transition, not a claim about physical location. Mitigation trace: FAULT-04.

FAULT-04: **Pilot abstraction.** C16 alone shall leave Retreating and shall require fresh valid `SafeAtStation`; C17 shall retain every other Retreating input. Verification: exhaustive Retreating analysis shall find no other destination transition.

## Scenario families

SCN-01: **Docked qualification and departure.** Vary first/second valid threat ticks, resupply completion/validity, Mine/Hold/Return intent, and mining availability to reach C01/C02 and initial streak behavior; C01 shall occur only with every readiness fact established.

SCN-02: **Mining production and hold.** Vary Mine/Hold, NearlyFull cargo, target depletion/invalidity, and mining availability to reach C09/C10/C11 without a higher-priority guard; each reason shall have a distinct trigger and correct actuator output.

SCN-03: **Resource boundary and reset.** Vary cargo/capacitor boundaries and validity across Mining and Recovery to reach C08, advisory mappings, `resource_reset`, and recovery blocking; invalid values shall never prove readiness.

SCN-04: **Explicit Hostile priority.** Combine Hostile with Return, Full cargo, defense availability, and adequate versus low/invalid capacitor across Mining and Defending to reach C05/C06/C13; ready defense shall select C05 despite C07/C08 applicability.

SCN-05: **Untrusted/severe retreat request.** Vary Severe/Untrusted threat with retreat availability unavailable or invalid to reach C03/C04/C12 and retreat advisories; required commands remain Retreat while no escape or success is inferred.

SCN-06: **Arrival and recovery.** Vary EnRoute/invalid/SafeAtStation arrival, resupply, reset, threat acceptability, and Mine/Hold/Return to reach C16 through C20; only fresh valid SafeAtStation enters Recovery and all Recovery outcomes are reached.

SCN-07: **Temporal threat trust.** Invalidate threat to reset streak, then apply two valid ticks carrying Clear/Caution or Hostile while in Mining, Defending, and Recovery; the first remains Untrusted and the second uses the current valid band.

SCENARIO-COUNT-01: **Pilot abstraction.** SCN-01 through SCN-07 are exactly seven counted scenario families. Each has a distinct behavioral trace and objective outcome; witnesses inside a family are not additional families.

## Generated-support allowances

GENERATED-SUPPORT-01: **Allowed uncounted support.** Root boundary input ports and exactly three direct boundary-to-qualifier routes may deliver raw threat to TQ, raw resources to RQ, and raw mission observations to PQ. They shall trace to ASM-01 and BOUNDARY-01, carry no policy behavior, and receive no semantic-usage or semantic-interaction credit.

GENERATED-SUPPORT-02: **Allowed uncounted support.** Root output binding from AP, typed data declarations, enum literals, payload fields, and connection/containment declarations needed to realize the approved interfaces may carry a specific `@generated-support` justification. Fields within one approved payload and boundary links are not extra semantic interactions.

GENERATED-SUPPORT-03: **Allowed uncounted support.** One behavior-free Process or container at containment depth 1 may organize the eight semantic usages beneath the single root. It shall not claim an owner role, introduce state or decisions, serve as a routing-only credited usage, create another weakly connected semantic region, or alter any metric.

## Bounded end-to-end analysis obligations

ANALYSIS-END-01: **Required bounded evidence.** The deterministic analyzer shall stream all `47,185,920` combinations in the exact finite product: five phases, three streak values, every MON-02/03/04 value, and every independent validity. It shall retain counters and diagnostic witnesses rather than the full Cartesian set and shall complete within the harness allowance of 180 seconds.

ANALYSIS-END-02: **Required bounded evidence.** For each tuple the analyzer shall compose named owner-local relations and approved dependencies for TQ, RQ, PQ, MR, TR, FA, AS, and AP. It shall not centrally select C01 through C20 from root inputs, reproduce ASM-02/readiness/fault logic outside the named owner, or replace a usage with analyzer-only behavior.

ANALYSIS-END-03: **Required bounded evidence.** The retained analysis report shall bind to the analyzed source hash, report successful status, zero case gaps, zero effective overlaps, zero result mismatches, true required boolean checks, reachability witnesses for all 20 cases and seven scenario families, explicit C05 conflict witnesses, and agreement with the ownership audit.

ANALYSIS-END-04: **Evidence limitation.** The harness checks the report fields and ownership agreement but does not independently infer source semantics. Therefore source-local contracts, trace evidence, typechecking, and Designer validation remain necessary; exhaustive finite enumeration is bounded checking, not formal proof or physical validation.

## Structural, trace, and acceptance constraints

BOUND-01: **Selected architecture.** The approved realization requires exactly eight responsibility-bearing semantic usages—PART-01 through PART-08—within the inclusive medium bound `8..12`. All eight shall be reachable and own distinct meaningful local behavior; wrappers and routing receive no credit.

BOUND-02: **Selected architecture.** The approved realization requires exactly 18 typed semantic interactions—INT-01 through INT-18—within the inclusive medium bound `15..21`. Every dependency shall occur once with compatible endpoints and types; containment, fields, boundary links, and support routing are excluded.

BOUND-03: **Pilot abstraction.** The approved contracts require exactly 20 nontrivial reason cases—CASE-01 through CASE-20—within the inclusive medium bound `12..20`. Every case shall be reachable and the ordered set shall be total and deterministic.

BOUND-04: **Pilot abstraction.** The approved validation plan requires exactly seven scenario families—SCN-01 through SCN-07—within the inclusive medium bound `6..9`. Every family shall have a bounded witness and no family exists only to raise the count.

BOUND-05: **Selected architecture.** The eight usages and 18 interactions shall form exactly one weakly connected semantic region at containment depth `1..2` beneath exactly one root system usage; no duty may be orphaned.

BOUND-06: **Selected architecture.** The realization shall retain at least two cooperating decision or qualification owners and one explicit priority conflict. MR and TR shall derive independent meaningful proposals, AS shall resolve them, and a bounded witness shall prove PRIORITY-01.

METRIC-FINAL-01: **Approved exact metrics.** Semantic usages: `8`; semantic interactions: `18`; counted nontrivial contract cases: `20`; scenario families: `7`; weakly connected semantic regions: `1`; containment depth: `1..2`; cooperating proposal owners: MR and TR with AS resolution; explicit priority conflict: C05 over simultaneous C07/C08 applicability.

TRACE-01: **Handbook-derived method constraint.** Every actionable identifier shall map to retained model elements or be explicitly deferred/informational; every significant model element shall map back to an abstract identifier or carry a specific generated-support justification. Pass criterion: zero missing actionable identifiers, zero unexplained significant elements, and zero missing parents.

TRACE-02: **Selected architecture.** Model evidence shall tie every claimed applicability, proposal, decision, and state owner to an owner-local behavioral fact and deterministic analyzer relation. Pass criterion: contracts, trace report, ownership audit, and analyzer agree, with no central recomputation or forwarding-only credit.

PASS-01: **Verification criterion.** Architecture/final-source gates, independent harness typechecking, compatible interactions, BOUND-01 through BOUND-06, complete traces, required contracts, ownership audit, and deterministic analyzer execution shall pass on the same retained revision. A not-run gate remains not-run and cannot be claimed as passed.

PASS-02: **Validation criterion.** Designer review shall separately confirm realization of NEED-01, PURPOSE-01, GOAL-01 through GOAL-04, all seven scenario families, invalid-data conservatism, reason preservation, the C05 conflict, and the external boundary without unsupported mining-domain additions.

## Exclusions and deferred claims

DEFER-01 EXCL-01: **Deferred claim.** Profit, markets, yield, fleet scale, and scheduling are excluded; no controlled output or acceptance result may imply their optimization.

DEFER-02 EXCL-02: **Deferred claim.** Physics, navigation, real timing/range/rates, human performance, docking execution, successful defense or retreat, and survivability are excluded; commands are requests, not evidence of external success.

DEFER-03 EXCL-03: **Deferred claim.** Equipment sufficiency, a production allocation, code, reliability, a safety argument, readiness, and certification are excluded and shall not be inferred from model conformance.

DEFER-04 EXCL-04: **Deferred claim.** The run may support allocation comparison, visualization, finite scenarios, and bounded checking only; it claims no proof, physical validity, mission success, profitability, survivability, safety, readiness, or certification.

DEFER-05: **Deferred design choice.** Algorithms, implementation components, port/source encodings, execution order, deployment, scheduling, and modeling profile remain for Model realization; no silent tool-driven assumption may revise the frozen policy or approved ownership.

DEFER-06: **Deferred evidence.** Code generation, application execution, formal proof, physical validation, and certification evidence are not required by this seed and are not-run. The required deterministic analyzer is checking evidence, not formal proof or physical validation.
