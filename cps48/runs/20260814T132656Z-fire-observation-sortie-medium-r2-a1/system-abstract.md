---
abstract_id: SA-FOS-NAV-MED-R2-01
domain_seed: 20260813T233942Z-fire-observation-sortie-seed-v1
profile: logical-non-executable
campaign_complexity: medium
selected_primary_scope: navigation-and-obstacle-awareness-supervisor
semantic_usage_bounds: [8, 12]
selected_semantic_usage_count: 10
semantic_interaction_bounds: [15, 21]
selected_semantic_interaction_count: 21
nontrivial_contract_case_bounds: [12, 20]
selected_nontrivial_contract_case_count: 20
scenario_family_bounds: [6, 9]
selected_scenario_family_count: 8
semantic_containment_depth_beneath_root: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_cooperating_decision_or_qualification_owners: true
requires_explicit_priority_conflict: true
---

# Navigation and Obstacle-Awareness Use Supervisor — Approved System Abstract

## Synopsis, need, and controlled purpose

NEED-01: Drone control needs one bounded logical supervisor to determine whether the currently supplied navigation and obstacle-awareness evidence may be used for motion-related control decisions, while making evidence loss, obstacle indication, manual hold, and recovery observably distinct. This need does not assert that the supervisor navigates, avoids obstacles, or makes an observation sortie eligible.

PURPOSE-01: The Navigation and Obstacle-Awareness Use Supervisor shall qualify GPS, inertial, barometric, and obstacle-sensor evidence; derive a navigation basis and an awareness condition; resolve evidence-driven holds, an external force-hold event, and reset requests under one deterministic priority; retain one recovery phase; and control three logical outputs to drone control.

GOAL-01: The system shall allow full or restricted use of navigation evidence only after its selected finite policy is satisfied and the recovery gate has been opened by a fresh reset assertion.

GOAL-02: The system shall inhibit motion-related use when navigation evidence is unusable, obstacle awareness is unavailable in an active or unknown context, a current obstacle indication is present, or an external force-hold is accepted.

GOAL-03: The system shall expose one consistent navigation-use directive, obstacle-awareness notice, and supervision status without claiming physical collision avoidance, navigation accuracy, flight safety, or observation success.

## Evidence classes and claim separation

HBK-01: FAA- and NASA-derived methodology requires an explicit need, boundary, external responsibility, finite and exceptional behavior, cohesive ownership, traceability, alternatives, objective evidence criteria, and separate verification and validation. These are method constraints and do not establish any drone-domain behavior.

HBK-02: The campaign's exact complexity bounds and the project's owner-credit rule are experiment constraints derived for synthesis control; they are neither source-grounded drone facts nor substitutes for later domain validation.

FACT-01: The frozen source names a forest-fire observation drone, drone control, GPS, inertial-measurement, barometric navigation equipment, an obstacle sensor, radio equipment, a camera, landing gear, a selected long-distance battery variant, a power-management module, and four engines.

FACT-02: The source explicitly describes obtaining and analyzing qualitative battery status and making that status available to drone control; it does not define navigation or obstacle data, validity, freshness, decision, fault, priority, state, or recovery semantics.

FACT-03: The names of navigation and obstacle equipment support this system's vocabulary but do not establish equipment accuracy, obstacle-detection performance, independence, availability, or a successful physical outcome.

ABS-01: This pilot selects navigation-evidence use and obstacle-awareness supervision as its primary controlled purpose. All finite enumerations, qualification mappings, motion contexts, priority rules, latch semantics, and output meanings below are Designer-selected abstractions, not handbook or source facts.

ABS-02: One logical evaluation samples all boundary inputs together, reads the committed pre-evaluation recovery phase, derives one accepted action, commits one next recovery phase, and publishes three outputs. “Current,” “stale,” and the evaluation order are logical fixture labels and make no physical timing claim.

ABS-03: `FULL_NAV_USE` and `RESTRICTED_NAV_USE` are permissions for an external drone-control abstraction to use the named evidence classes; `MOTION_INHIBITED` withholds that permission. None is a motor command, trajectory command, sortie authorization, or proof of safe motion.

## Operational context and exact system boundary

CTX-01: `DroneControl` is outside the system. It supplies motion context and one mutually exclusive supervision event, and it receives all controlled outputs. It remains responsible for any physical flight, navigation, propulsion, landing, mission, or observation decision.

CTX-02: `NavigationEquipment` is outside the system. It supplies separate GPS, inertial, and barometric evidence values; the abstract does not model their physical production or assume independence.

CTX-03: `ObstacleSensor` is outside the system. It supplies one obstacle evidence value; the abstract does not model detection geometry, range, classification, or physical obstacle truth.

BOUND-01: Inside the system are exactly the ten semantic responsibilities `PART-01` through `PART-10`, their owner-local derived facts, the single recovery phase owned by `PART-09`, and the 21 typed directed interactions `INT-01` through `INT-21`.

BOUND-02: Outside the system are all sensors and equipment, drone control, physical vehicle motion, battery and propulsion behavior, route generation, position estimation, actuator control, observation acquisition, radio delivery, human authority, the forest environment, and all physical validation.

MON-01: `gpsEvidence : NavigationEvidence = {NOMINAL_CURRENT, DEGRADED_CURRENT, UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied by `CTX-02` once per logical evaluation.

MON-02: `inertialEvidence : NavigationEvidence = {NOMINAL_CURRENT, DEGRADED_CURRENT, UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied independently in the logical fixture by `CTX-02` once per evaluation.

MON-03: `barometricEvidence : NavigationEvidence = {NOMINAL_CURRENT, DEGRADED_CURRENT, UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied independently in the logical fixture by `CTX-02` once per evaluation.

MON-04: `obstacleEvidence : ObstacleEvidence = {NO_INDICATION_CURRENT, INDICATION_CURRENT, UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied by `CTX-03` once per evaluation. `NO_INDICATION_CURRENT` means only that the fixture supplied no indication; it is not proof that the environment is clear.

MON-05: `motionContext : MotionContext = {STATIONARY, TRANSLATING, LANDING_CONTEXT, UNKNOWN}` is supplied by `CTX-01`. It is context for logical awareness policy, not measured motion or a landing-control mode.

MON-06: `supervisionEvent : SupervisionEvent = {NONE, RESET_ONLY, FORCE_HOLD_ONLY, FORCE_HOLD_WITH_RESET}` is supplied by `CTX-01`. The atomic combined value makes the force-hold/reset conflict observable; a fresh reset is a `NONE` evaluation followed by a later `RESET_ONLY` evaluation while recovery is armed.

CTRL-01: `navigationUseDirective : NavigationUseDirective = {MOTION_INHIBITED, RESTRICTED_NAV_USE, FULL_NAV_USE}` is controlled by the system and received by `CTX-01`.

CTRL-02: `obstacleAwarenessNotice : ObstacleAwarenessNotice = {NO_CURRENT_INDICATION, CURRENT_INDICATION, AWARENESS_UNAVAILABLE}` is controlled by the system and received by `CTX-01`; it reports only the selected abstraction of the sampled evidence.

CTRL-03: `supervisionStatus : SupervisionStatus = {STARTUP_HOLD, FULL_USE, RESTRICTED_USE, HELD_NAV_EVIDENCE, HELD_OBSTACLE_INDICATION, HELD_AWARENESS_LOSS, HELD_EXTERNAL, RESET_RELEASE_REQUIRED, RESET_REQUIRED}` is controlled by the system and received by `CTX-01`.

## Selected architecture: parts and owner-local responsibilities

PART-01: `GpsEvidenceQualifier` shall derive `GpsAssessment : EvidenceAssessment = {READY, LIMITED, REJECTED}` from `MON-01`. Its many-to-one validity and quality classification is owner-local and is not a rename or forward.

PART-02: `InertialEvidenceQualifier` shall independently derive `InertialAssessment : EvidenceAssessment` from `MON-02`; it shall not read or reconstruct any other channel.

PART-03: `BarometricEvidenceQualifier` shall independently derive `BarometricAssessment : EvidenceAssessment` from `MON-03`; it shall not read or reconstruct any other channel.

PART-04: `ObstacleEvidenceQualifier` shall derive `ObstacleAssessment = {NO_INDICATION, INDICATED, UNAVAILABLE}` from `MON-04`, with stale, invalid, and unavailable input sharing the conservative unavailable result.

PART-05: `NavigationBasisOwner` shall combine the three navigation assessments and exclusively derive `NavigationBasis = {FULL_BASIS, RELATIVE_BASIS, LIMITED_BASIS, UNUSABLE_BASIS}` under cases 05–08. It shall not estimate position or copy a single input.

PART-06: `AwarenessConditionOwner` shall combine obstacle assessment and motion context and exclusively derive `AwarenessCondition = {AWARENESS_CLEAR, ACTIVE_OBSTACLE_CONFLICT, STATIONARY_OBSTACLE_PRESENT, ACTIVE_AWARENESS_LOSS, STATIONARY_AWARENESS_UNAVAILABLE}` under cases 09–13.

PART-07: `ConstraintProposalOwner` shall combine navigation basis and awareness condition and exclusively derive one `ConstraintProposal = {HOLD_OBSTACLE, HOLD_AWARENESS, HOLD_NAVIGATION, RESTRICT_NAVIGATION, ALLOW_FULL}` using the cause precedence in `PRI-01`. This is the first cooperating decision owner.

PART-08: `EventPriorityArbiter` shall combine the constraint proposal, the external supervision event, and the committed pre-evaluation recovery phase to derive exactly one `AcceptedAction = {APPLY_OBSTACLE_HOLD, APPLY_AWARENESS_HOLD, APPLY_NAV_HOLD, APPLY_EXTERNAL_HOLD, APPLY_RESTRICTED, APPLY_FULL, ACCEPT_RESET, IGNORE_RESET}` under `PRI-02`. It owns no state and is the second cooperating decision owner.

PART-09: `RecoveryLatchOwner` shall be the sole owner of initialized `RecoveryPhase = {WAIT_RELEASE, ARMED, OPEN, LATCHED}`. It shall consume the accepted action, commit the next phase under cases 18–19, and publish the post-evaluation phase; no other usage may reconstruct or write this state.

PART-10: `SupervisionOutcomeOwner` shall combine the accepted action, post-evaluation recovery phase, and navigation basis to jointly derive all three controlled outputs under case 20. Its cross-output consistency and reason refinement are owner-local; copying any field alone earns no owner credit.

OWNER-01: The ten credited usages each derive at least one owner-local, behaviorally meaningful fact from assigned inputs. Routing, storage representation, record projection, enum conversion, initialization scaffolding, or support containment shall not receive semantic-usage credit.

OWNER-02: Decision cooperation is explicit: `PART-05` and `PART-06` supply independently derived qualifications to `PART-07`; `PART-07` selects the evidence proposal; `PART-08` resolves event conflicts using recovery pre-state; `PART-09` alone commits recovery; and `PART-10` derives consistent boundary outcomes without recomputing upstream relations.

## Complete typed directed semantic interaction inventory

INT-01: Root boundary `MON-01 -> PART-01`, type `NavigationEvidence`, delivers GPS evidence only to its qualifier.

INT-02: Root boundary `MON-02 -> PART-02`, type `NavigationEvidence`, delivers inertial evidence only to its qualifier.

INT-03: Root boundary `MON-03 -> PART-03`, type `NavigationEvidence`, delivers barometric evidence only to its qualifier.

INT-04: Root boundary `MON-04 -> PART-04`, type `ObstacleEvidence`, delivers obstacle evidence only to its qualifier.

INT-05: Root boundary `MON-05 -> PART-06`, type `MotionContext`, supplies the second input needed for awareness-condition derivation.

INT-06: Root boundary `MON-06 -> PART-08`, type `SupervisionEvent`, supplies the external conflict candidate and reset edge.

INT-07: `PART-01 -> PART-05`, type `EvidenceAssessment`, supplies the GPS qualification to the sole navigation-basis owner.

INT-08: `PART-02 -> PART-05`, type `EvidenceAssessment`, supplies the inertial qualification to the sole navigation-basis owner.

INT-09: `PART-03 -> PART-05`, type `EvidenceAssessment`, supplies the barometric qualification to the sole navigation-basis owner.

INT-10: `PART-04 -> PART-06`, type `ObstacleAssessment`, supplies the qualified obstacle fact to the sole awareness-condition owner.

INT-11: `PART-05 -> PART-07`, type `NavigationBasis`, supplies the navigation branch of proposal selection.

INT-12: `PART-06 -> PART-07`, type `AwarenessCondition`, supplies the awareness branch of proposal selection.

INT-13: `PART-07 -> PART-08`, type `ConstraintProposal`, supplies the already precedence-selected evidence proposal to event arbitration.

INT-14: `PART-09 -> PART-08`, type `RecoveryPhase`, publishes the committed pre-evaluation phase for fresh-reset qualification. It shall have retained-state semantics and shall not denote the concurrently computed next phase.

INT-15: `PART-08 -> PART-09`, type `AcceptedAction`, supplies the single accepted action used for the recovery transition.

INT-16: `PART-08 -> PART-10`, type `AcceptedAction`, supplies the selected cause or use action without requiring output-policy recomputation.

INT-17: `PART-09 -> PART-10`, type `RecoveryPhase`, publishes the post-evaluation phase used to close or open all three outputs consistently.

INT-18: `PART-05 -> PART-10`, type `NavigationBasis`, permits `PART-10` to distinguish full from restricted use only when recovery is open.

INT-19: `PART-10 -> CTRL-01` at the root boundary, type `NavigationUseDirective`, is the sole semantic delivery of the navigation-use control.

INT-20: `PART-10 -> CTRL-02` at the root boundary, type `ObstacleAwarenessNotice`, is the sole semantic delivery of the awareness notice.

INT-21: `PART-10 -> CTRL-03` at the root boundary, type `SupervisionStatus`, is the sole semantic delivery of supervision status.

INT-AUD-01: The interaction recount is exactly 21: six boundary-input deliveries, twelve usage-to-usage deliveries, and three boundary-output deliveries. All ten semantic usages form one weakly connected region; every interaction changes which owner can derive a required fact or delivers a distinct controlled output.

## Policy, priority, state, and recovery partitions

POL-01: For each navigation channel, `NOMINAL_CURRENT` maps to `READY`, `DEGRADED_CURRENT` maps to `LIMITED`, and `UNAVAILABLE_CURRENT`, `STALE`, or `INVALID` maps to `REJECTED`. The mapping classifies the fixture value only and does not diagnose a physical cause.

POL-02: Define an assessment as usable exactly when it is `READY` or `LIMITED`. `FULL_BASIS` requires all three assessments `READY`; `RELATIVE_BASIS` requires GPS `REJECTED` and both inertial and barometric usable; `LIMITED_BASIS` requires GPS usable, at least one of inertial or barometric usable, and not all three `READY`; every remaining combination is `UNUSABLE_BASIS`.

PRI-01: Proposal cause priority shall be `ACTIVE_OBSTACLE_CONFLICT or STATIONARY_OBSTACLE_PRESENT > ACTIVE_AWARENESS_LOSS or STATIONARY_AWARENESS_UNAVAILABLE > UNUSABLE_BASIS > RELATIVE_BASIS or LIMITED_BASIS > FULL_BASIS`. The first applicable class selects exactly one proposal; this is a deterministic logical reporting policy, not a physical severity ranking.

PRI-02: Event arbitration priority shall be `evidence-driven hold proposal > FORCE_HOLD_ONLY or FORCE_HOLD_WITH_RESET > qualified RESET_ONLY > safe use proposal`. Thus a reset simultaneous with any evidence hold is ignored in favor of that hold, an evidence hold simultaneous with force-hold reports the evidence cause, `FORCE_HOLD_WITH_RESET` selects external hold rather than reset when evidence is safe, and reset is accepted only for safe evidence while pre-state is `ARMED`.

STATE-01: Initialization shall set recovery to `WAIT_RELEASE`, `CTRL-01` to `MOTION_INHIBITED`, `CTRL-02` to `AWARENESS_UNAVAILABLE`, and `CTRL-03` to `STARTUP_HOLD`. Enum declaration order shall not be used as initialization evidence.

REC-01: Any accepted evidence or external hold action shall commit `LATCHED` and inhibit navigation use in the same logical evaluation. Improved evidence alone shall never open recovery.

REC-02: From `LATCHED`, a safe proposal with `NONE` arms recovery; `RESET_ONLY` held across cause clearing is ignored and moves or retains the phase at `WAIT_RELEASE`. From `WAIT_RELEASE`, only a safe proposal with `NONE` moves to `ARMED`; continued reset remains closed. These rules require observation of reset release after startup or a reset held across a fault.

REC-03: From `ARMED`, a later safe `RESET_ONLY` is accepted and opens recovery. From `OPEN`, safe full or restricted proposals retain `OPEN`; repeated reset while open has no reopening effect. A new evidence or external hold at any time returns to `LATCHED`.

FRESH-01: The complete fresh-reset path is `WAIT_RELEASE --safe/NONE--> ARMED --safe/RESET_ONLY--> OPEN`. `RESET_ONLY` at startup, during a fault, while latched, or before a release observation cannot open the gate, and continuous reset cannot become fresh merely because evidence improves. Either force-hold event is a hold, never a qualifying reset.

## Exact owner-local nontrivial contract-case partition

BEH-GPS-01 / CASE-01: For all five values of `MON-01`, `PART-01` shall implement the total three-branch mapping in `POL-01`; it shall output exactly one assessment and no other input may affect it.

BEH-IMU-01 / CASE-02: For all five values of `MON-02`, `PART-02` shall independently implement the total three-branch mapping in `POL-01`.

BEH-BAR-01 / CASE-03: For all five values of `MON-03`, `PART-03` shall independently implement the total three-branch mapping in `POL-01`.

BEH-OBS-01 / CASE-04: `PART-04` shall map `NO_INDICATION_CURRENT` to `NO_INDICATION`, `INDICATION_CURRENT` to `INDICATED`, and `UNAVAILABLE_CURRENT`, `STALE`, or `INVALID` to `UNAVAILABLE`; the branches are disjoint and total over all five values.

BEH-BAS-01 / CASE-05: If all three navigation assessments are `READY`, `PART-05` shall output `FULL_BASIS`.

BEH-BAS-02 / CASE-06: Otherwise, if GPS is `REJECTED` and both inertial and barometric assessments are usable, `PART-05` shall output `RELATIVE_BASIS`.

BEH-BAS-03 / CASE-07: Otherwise, if GPS is usable and at least one of inertial or barometric assessment is usable, `PART-05` shall output `LIMITED_BASIS`.

FAULT-BAS-01 / CASE-08: Every remaining navigation-assessment combination shall produce `UNUSABLE_BASIS`; cases 05–08 are priority-ordered, disjoint, single-valued, and total over all 27 combinations.

BEH-AWR-01 / CASE-09: With known motion context and `ObstacleAssessment = NO_INDICATION`, `PART-06` shall output `AWARENESS_CLEAR`; `UNKNOWN` is excluded from this case.

FAULT-AWR-01 / CASE-10: With `ObstacleAssessment = INDICATED` and motion context `TRANSLATING` or `LANDING_CONTEXT`, `PART-06` shall output `ACTIVE_OBSTACLE_CONFLICT`.

BEH-AWR-02 / CASE-11: With `ObstacleAssessment = INDICATED` and `STATIONARY`, `PART-06` shall output `STATIONARY_OBSTACLE_PRESENT` so a new motion-use permission is withheld.

FAULT-AWR-02 / CASE-12: If motion context is `UNKNOWN`, or obstacle assessment is `UNAVAILABLE` while context is `TRANSLATING` or `LANDING_CONTEXT`, `PART-06` shall output `ACTIVE_AWARENESS_LOSS`.

FAULT-AWR-03 / CASE-13: With obstacle assessment `UNAVAILABLE` and motion context `STATIONARY`, `PART-06` shall output `STATIONARY_AWARENESS_UNAVAILABLE`; cases 09–13 are priority-ordered, disjoint, and total over all 12 local combinations.

BEH-PROP-01 / CASE-14: For all 20 navigation-basis/awareness-condition combinations, `PART-07` shall apply `PRI-01` to output exactly one proposal: either obstacle condition yields `HOLD_OBSTACLE`; either awareness-loss condition yields `HOLD_AWARENESS`; otherwise unusable basis yields `HOLD_NAVIGATION`; otherwise relative or limited basis yields `RESTRICT_NAVIGATION`; otherwise full basis and clear awareness yields `ALLOW_FULL`.

FAULT-ARB-01 / CASE-15: For every pre-state and event, `PART-08` shall map `HOLD_OBSTACLE`, `HOLD_AWARENESS`, and `HOLD_NAVIGATION` respectively to their three accepted hold actions; this highest-priority partition defeats simultaneous force-hold or reset.

BEH-ARB-01 / CASE-16: With a safe use proposal, `FORCE_HOLD_ONLY` or `FORCE_HOLD_WITH_RESET` shall yield `APPLY_EXTERNAL_HOLD`; with a safe proposal and `RESET_ONLY`, pre-state `ARMED` yields `ACCEPT_RESET`, pre-state `OPEN` reapplies the corresponding safe use action, and pre-state `WAIT_RELEASE` or `LATCHED` yields `IGNORE_RESET`.

BEH-ARB-02 / CASE-17: With a safe proposal and `NONE`, `PART-08` shall output `APPLY_FULL` or `APPLY_RESTRICTED` corresponding to the proposal. Cases 15–17 are priority-ordered, disjoint, single-valued, and total over all 80 proposal/event/pre-state combinations.

FAULT-REC-01 / CASE-18: `PART-09` shall commit `LATCHED` for any accepted hold action; for `IGNORE_RESET` it shall commit or retain `WAIT_RELEASE`; for a safe apply action from `LATCHED` or `WAIT_RELEASE` it shall commit `ARMED`. These branches keep recovery closed and cover fault entry, cause clearing, reset held across clearing, and reset release.

BEH-REC-01 / CASE-19: `PART-09` shall commit `OPEN` for `ACCEPT_RESET`; safe apply actions from `OPEN` retain `OPEN` and from `ARMED` retain `ARMED`. Together cases 18–19 are disjoint and total over every producer-reachable pre-state/accepted-action pair; structurally valid but producer-unreachable pairs shall be reported, not silently assigned semantic credit.

BEH-OUT-01 / CASE-20: `PART-10` shall assign all outputs for every producer-reachable accepted-action/post-state/basis combination. If post-state is not `OPEN`, directive is `MOTION_INHIBITED`; accepted obstacle, awareness, navigation, or external hold selects its matching held status, `WAIT_RELEASE` selects `RESET_RELEASE_REQUIRED` except initialization selects `STARTUP_HOLD`, and `ARMED` selects `RESET_REQUIRED`. If post-state is `OPEN`, `FULL_BASIS` with `APPLY_FULL` or `ACCEPT_RESET` yields `FULL_NAV_USE/FULL_USE`; `RELATIVE_BASIS` or `LIMITED_BASIS` with `APPLY_RESTRICTED` or `ACCEPT_RESET` yields `RESTRICTED_NAV_USE/RESTRICTED_USE`. Awareness notice is `CURRENT_INDICATION` exactly for an accepted obstacle hold, `AWARENESS_UNAVAILABLE` for an accepted awareness hold or initialization, and `NO_CURRENT_INDICATION` otherwise. Impossible contradictory triples shall be identified by reachability analysis and shall never be used to weaken the reachable relation.

CASE-AUD-01: The nontrivial contract count is exactly 20, `CASE-01` through `CASE-20`: four channel qualification cases, four navigation-basis cases, five awareness-condition cases, one proposal case, three arbitration cases, two recovery cases, and one joint outcome case. Initialization, type well-formedness, routing, support containment, and projections are required where applicable but add no case credit.

## Nominal and off-nominal scenario families

SCN-01: Startup and nominal full-use family — from initialized `WAIT_RELEASE`, nominal current navigation evidence, no obstacle indication, known stationary context, and `NONE` arm recovery; a later fresh `RESET_ONLY` opens recovery and produces `FULL_NAV_USE`, `NO_CURRENT_INDICATION`, and `FULL_USE`.

SCN-02: Restricted navigation family — with GPS rejected, usable inertial and barometric assessments, clear awareness, and an open gate, `RELATIVE_BASIS` produces `RESTRICTED_NAV_USE` and `RESTRICTED_USE` without claiming position accuracy.

SCN-03: Active obstacle conflict family — from `OPEN`, a current obstacle indication while translating or in landing context defeats safe navigation and any simultaneous reset, produces `CURRENT_INDICATION`, inhibits use, reports `HELD_OBSTACLE_INDICATION`, and latches recovery.

SCN-04: Explicit three-way priority-conflict family — an unusable navigation basis simultaneous with `FORCE_HOLD_WITH_RESET` still selects `APPLY_NAV_HOLD`; with safe evidence, that same combined event selects `APPLY_EXTERNAL_HOLD`, never `ACCEPT_RESET`. The family checks both ordered conflicts in `PRI-02`.

SCN-05: Navigation-evidence loss and recovery family — loss making the basis unusable closes an open gate; later improved evidence with `NONE` only arms recovery, and a subsequent fresh reset is required before restricted or full use resumes.

SCN-06: Awareness-loss family — stale, invalid, or unavailable obstacle evidence while translating, landing, or in unknown motion context produces `ACTIVE_AWARENESS_LOSS`, inhibits use, reports awareness unavailable, and latches recovery even when navigation basis is full.

SCN-07: Held-reset release family — reset asserted during a hold is ignored; if evidence improves while reset remains asserted, recovery stays `WAIT_RELEASE`; a later `NONE` evaluation arms it, and only a still later reset assertion opens it.

SCN-08: Stationary indication and no-spontaneous-start family — a current obstacle indication or unavailable awareness while stationary still withholds a new navigation-use permission and latches recovery; clearing the input does not open the gate without the release-and-fresh-reset sequence.

SCN-AUD-01: The scenario-family count is exactly eight. Families 01–02 cover nominal full and degraded use; families 03–04 cover distinct conflicts; families 05–08 cover navigation loss, awareness loss, held-reset recovery, stationary withholding, cause clearing, release observation, and fresh reset.

## Risks and required logical mitigations

RISK-01: Accepting invalid, stale, or unavailable navigation evidence could cause drone control to receive a use permission contrary to the selected policy; cases 01–08, 14, and 20 conservatively restrict or inhibit it without asserting a physical safety consequence.

RISK-02: Treating no obstacle indication as environmental clearance, or accepting unavailable awareness during motion, could overstate the fixture evidence; `MON-04`, cases 04 and 09–14, and `CTRL-02` preserve the limited logical meaning and withhold use on awareness loss.

RISK-03: Simultaneous evidence hold, external hold, and reset could produce contradictory cause and recovery behavior; the single proposal owner, arbiter, priority `PRI-02`, and state owner select one action and one transition.

RISK-04: A reset held during a fault could reopen the gate automatically when evidence improves; `FRESH-01`, cases 16 and 18–19, and scenario 07 require observed release and a later fresh assertion.

## Essential assumptions, constraints, and deferred claims

ASM-01: `CTX-02` is responsible only for supplying one domain-valid value on each of `MON-01` through `MON-03` per logical evaluation. The selected values do not imply physical accuracy, timing, independence, or fault diagnosis.

ASM-02: `CTX-03` is responsible only for supplying a domain-valid `MON-04`; no sensor coverage, detection probability, range, obstacle truth, or environmental guarantee is assumed.

ASM-03: `CTX-01` is responsible for supplying one domain-valid motion context and one mutually exclusive event per evaluation, and for interpreting controlled outputs only within `ABS-03`. Authentication, authority, and physical actuation remain outside the system.

ASM-04: `INT-14` denotes the committed pre-evaluation recovery phase and `INT-17` denotes the post-evaluation phase. `PART-09` initializes, reads, and writes the only retained state; the logical ordering is a pilot assumption, not a physical scheduler or latency claim.

CONSTR-01: The retained model shall realize exactly ten credited semantic usages within the declared 8–12 bound, exactly 21 credited semantic interactions within the 15–21 bound, exactly 20 nontrivial cases within the 12–20 bound, and exactly eight scenario families within the 6–9 bound. No element may be added solely to meet a count.

CONSTR-02: The semantic architecture shall have exactly one root system, one weakly connected semantic region, and credited semantic containment depth one or two beneath the root. Any language-required containment adapter, routing, or initialization support shall be explicit `@generated-support`, remain uncredited, and shall not change the exact semantic tuple.

CONSTR-03: There shall be exactly one recovery-state writer, at least the cooperating qualification and decision owners in `OWNER-02`, and the explicit conflicts in `PRI-02`. Raw evidence shall not bypass its qualifier, and downstream usages shall not reproduce an upstream owner-local relation.

CONSTR-04: Bounded owner-local analysis shall exhaust GPS 5, inertial 5, barometric 5, obstacle 5, navigation basis 27, awareness condition 12, proposal 20, arbiter 80, all producer-reachable recovery transitions, and all producer-reachable outcome triples. It shall report gaps, overlaps, unreachable structural valuations, and producer-reachable subsets separately.

CONSTR-05: Bounded end-to-end analysis shall enumerate all 40,000 one-evaluation combinations of four five-valued evidence inputs, four motion contexts, four events, and four committed recovery phases (`5 * 5 * 5 * 5 * 4 * 4 * 4`). It shall compose the ten owner-local relations through all 21 interactions and compare every derived assessment, basis, condition, proposal, accepted action, next phase, and boundary output with a separately stated abstract reference relation.

CONSTR-06: Bounded sequence analysis shall exercise all eight scenario families and explicitly include initialization, safe reset release, fresh reset assertion, reset held through a fault, cause clearing, open-gate fault entry, new-fault relatching, full use, and restricted use. This is logical bounded evidence, not application execution or unbounded temporal proof.

DEF-01: Flight dynamics, position or altitude estimation, navigation accuracy, obstacle-detection performance, collision avoidance, landing control, propulsion sufficiency, endurance, battery physics, observation quality, radio performance, fire detection or response, human authority, real-time guarantees, physical safety, certification, and production readiness are deferred and shall never be reported as passed.

DEF-02: HAMR/GumboX code generation, executable application behavior, concrete scenario execution, physical validation, solver proof beyond actually retained checks, and unbounded temporal verification are `not-run` under this run's logical non-executable scope.

## Trace, verification, and objective pass criteria

TRACE-01: Every significant generated package, type, semantic component definition and usage, port, semantic connection, state variable, initialization clause, integration clause, and contract clause shall cite one or more identifiers from this abstract or carry explicit `@generated-support <reason>` rationale.

TRACE-02: Every canonical identifier here shall be classified as realized, informational, or explicitly deferred. Missing actionable coverage, unexplained significant additions, and trace links that credit forwarding or recomputation shall fail the stage.

PASS-01: Structural conformance passes only with exactly one root, exactly ten credited semantic usages, exactly 21 credited interactions in one weak semantic region, semantic containment depth one or two, and no padding. Raw implementation connections and uncredited support elements shall be reported separately from semantic counts.

PASS-02: Ownership conformance passes only when all ten owner-local relations are inspectable, `PART-09` is the only state writer, every credited owner derives a non-bijective or multi-input fact, and neither generated source nor analyzer centralizes or duplicates upstream policy.

PASS-03: Behavioral conformance passes only with exactly 20 nontrivial contract cases, complete disjoint priority partitions for all finite owner-local domains, safe explicit initialization, total reachable state/output assignment, the reset-release/fresh-reset recovery path, and all eight scenario families matching this abstract.

PASS-04: Mechanical verification passes only after architecture-stage and final `hamr sysml tipe` success, resolved directionally and type-compatible endpoints, independent harness success, and a retained source-hash-bound analyzer reporting zero gaps, overlaps, or reference mismatches for `CONSTR-04` through `CONSTR-06`.

PASS-05: Trace conformance passes only with complete bidirectional coverage, generated-support accounting separate from semantic metrics, no omitted or extra semantic interaction, and no significant unexplained model element.

PASS-06: Validation passes only if later Designer review finds the retained model faithful and fit for this bounded navigation-evidence-use purpose. Parsing, typechecking, bounded enumeration, and visualization are necessary evidence but do not establish domain fitness or any deferred claim.

## Resolved Model findings, exact realization allowances, and authorization

MODEL-RES-01: Accept the direct recovery snapshot mapping. `PART-09` shall retain one local `committedRecoveryPhase` initialized to `WAIT_RELEASE`; its `INT-14` publication shall denote `In(committedRecoveryPhase)` and depend only on pre-evaluation state, its transition shall use that pre-state with `INT-15`, and its separate `INT-17` publication shall denote the resulting post-evaluation state. Two state-publication ports may realize the distinction, but the duplicate publication earns no semantic-usage, owner, interaction, or case credit and establishes no scheduling or execution claim.

MODEL-RES-02: Accept the complete owner audit. The three navigation qualifiers and obstacle qualifier each have result-fiber cardinalities `1/1/3`; `PART-05` maps 27 tuples to `FULL/RELATIVE/LIMITED/UNUSABLE` fibers `1/4/15/7`; `PART-06` maps 12 tuples to condition fibers `3/2/1/5/1`; and `PART-07` maps 20 tuples to proposal fibers `8/8/1/2/1`. `PART-08` shall resolve all 80 proposal/event/pre-state tuples, `PART-09` shall own the sole state-dependent transition, and `PART-10` shall derive its joint output relation from producer-reachable triples. Repeated qualifier definitions may share syntax, but each of the three usages shall retain its usage-specific inputs, contracts, trace, and ownership evidence.

MODEL-RES-03: Accept one explicit root `System` containing one behavior-free `@generated-support` `Process` that contains exactly the ten semantic owner Threads. Final physical accounting shall be one root usage, one support Process, ten semantic Threads, 11 non-root usages, containment depth two, 21 Process-local semantic connections, nine transparent root/Process delegations for the six inputs and three outputs, and 30 raw `PortConnection` declarations. The Process, nine delegations, representation helpers, initialization scaffolding, duplicate port publication, enum helpers, and projections are permitted only when traceable and behavior-free; none may receive `PART-*`, owner, semantic-usage, `INT-*`, or `CASE-*` credit.

ANALYSIS-RES-01: Owner-local analysis shall keep generated-relation functions separate from independently authored extensional oracle tables or branches and compare every intermediate result. It shall enumerate the four five-value channel domains, 27 basis tuples, 12 awareness tuples, 20 proposal tuples, and 80 arbiter tuples, prove disjoint and total guards, and retain at least one witness for every `CASE-01` through `CASE-20`.

ANALYSIS-RES-02: Recovery analysis shall derive reachability from arbiter composition and report 27 producer-reachable and five producer-unreachable members of the 32 structurally typed pre-state/action pairs separately. The five unreachable pairs are `ARMED/IGNORE_RESET`, `LATCHED/ACCEPT_RESET`, `OPEN/ACCEPT_RESET`, `OPEN/IGNORE_RESET`, and `WAIT_RELEASE/ACCEPT_RESET`. Outcome analysis shall likewise report 24 producer-reachable and 104 producer-unreachable members of the 128 structurally typed accepted-action/post-phase/basis triples as explicit sets or a lossless grouped matrix; `CASE-20` applies to the 24 reachable triples, while contradiction checks cover all 128.

ANALYSIS-RES-03: End-to-end analysis shall enumerate exactly 40,000 one-evaluation root-input/pre-state valuations through all 21 semantic interactions and compare every assessment, basis, condition, proposal, accepted action, next phase, and output triple with the independent oracle. It shall separately execute all eight stateful scenario families, embed the canonical generated-source SHA-256 in its result, and allow an independent harness to reject a source-hash mismatch. Gaps, overlaps, mismatches, invariants, case witnesses, reachable sets, unreachable structural valuations, and scenario results shall remain distinct result fields.

AUTH-01: Designer disposition is approved with the clarification-only revisions in `MODEL-RES-01` through `ANALYSIS-RES-03`. Generation is authorized for exactly the `10 semantic usages / 21 semantic interactions / 20 nontrivial cases / 8 scenario families` architecture and the frozen policy above. Generation shall not weaken a requirement, change a boundary value or outcome, centralize an owner relation, add semantic credit, or report any `DEF-01` or `DEF-02` claim as passed; any incompatibility shall return a localized repair request in this same retained run.
