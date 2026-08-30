---
abstract_id: SA-HVAC-DEFROST-SMALL-01
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
campaign_complexity: small
selected_scope: windshield-defrost-request-supervisor
campaign_semantic_usage_bounds: [5, 8]
semantic_usage_count: 5
campaign_semantic_interaction_bounds: [7, 14]
semantic_interaction_count: 13
campaign_nontrivial_contract_case_bounds: [6, 12]
nontrivial_contract_case_count: 12
campaign_scenario_family_bounds: [4, 6]
scenario_family_count: 5
semantic_node_count: 5
semantic_edge_count: 13
semantic_responsibility_layer_count: 1
physical_containment_depth_below_root: 2
physical_non_root_aadl_usage_count: 6
generated_support_process_count: 1
raw_port_connection_declaration_count: 21
generated_support_boundary_delegation_count: 16
root_system_usage_count: 1
weakly_connected_region_count: 1
principal_decision_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Windshield Defrost Request Supervisor

## Evidence and claim classes

METH-01: **Handbook-derived method fact; informational.** The system need, purpose, context, and monitored and controlled boundary are defined before internal responsibility allocation. Architecture is judged against that problem statement, not treated as the source of it.

METH-02: **Handbook-derived method fact; informational.** Nominal, boundary, invalid/fault, and recovery behavior require explicit conditions, observable results, trace identifiers, verification methods, and objective pass criteria. Verification of the retained model is distinct from validation of fitness for the selected pilot purpose.

SRC-01: **Source-grounded seed fact; informational.** The automotive HVAC requirement catalog includes a vehicle user who can select HVAC preferences through an interface accessible from a dashboard or central console, and includes defrosting of the windshield and windows among the available HVAC purposes.

SRC-02: **Source-grounded seed fact; informational.** The vehicle electrical system can supply power and control signals to HVAC functions. The seed establishes no finite electrical policy, validity semantics, arbitration, ownership, recovery protocol, or actuator feedback.

SRC-03: **Source-grounded seed limitation; informational.** The source provides requirement vocabulary rather than an architecture, executable policy, or validated physical specification. Exact interfaces, state, priorities, contracts, and scenario values below are pilot decisions or assumptions, not recovered source facts.

PILOT-01: **Pilot abstraction.** This abstract selects only supervisory authorization of a windshield-defrost request. It does not regulate cabin temperature, command window defrost channels, estimate physical clearing progress, or manage fan speed, humidity, filtration, heating sources, or cooling sources.

PILOT-02: **Pilot abstraction.** All boundary and internal information is represented by the finite semantic types in this abstract so that partitions can be exhaustive. These categories are logical experiment values, not claims about production signal encodings or physical thresholds.

DEFER-01: **Explicitly deferred.** Physical removal of ice or condensation, clearing time, airflow or heat production, energy quantity, actuator delivery confirmation, redundancy, timing deadlines, acoustics, comfort, safety integrity, regulatory compliance, certification, and production readiness are not specified or accepted by this abstract.

DEFER-02: **Explicitly deferred.** Code generation, application execution, schedulability, deployment, solver proof beyond retained contract checks, and physical validation are `not-run` under this run profile and shall not be reported as passed.

## Need, purpose, and goals

NEED-01: A vehicle user needs a bounded way to request windshield defrost while preventing an asserted defrost enable command when the request signal is invalid, the windshield condition is unknown, or the vehicle electrical context disallows the load.

PURPOSE-01: The Windshield Defrost Request Supervisor will qualify a user request, assess whether the observed windshield condition calls for defrost, respect a finite electrical eligibility decision, issue an enable or off command, and provide a compact driver-facing status.

GOAL-01: The system shall command windshield defrost on when an actionable request, a valid obscured-windshield observation, and electrical eligibility coexist.

GOAL-02: The system shall command windshield defrost off for a released or non-actionable request, a valid clear-windshield observation, an invalid windshield observation, or electrical ineligibility.

GOAL-03: After an invalid request signal, the system shall require a valid released request before a later active request can become fresh and actionable; transient windshield-observation or electrical faults shall recover automatically when their classifications recover while the request remains actionable.

GOAL-04: The system shall report whether it is idle, actively requesting defrost, complete because valid glazing is clear, or requires attention because an input or resource blocks the request.

## Operational context and exact system boundary

BOUND-01: **Inside.** Request-edge and re-arm memory, request qualification, glazing-condition assessment, electrical-eligibility assessment, the single defrost policy decision, and driver-status derivation are inside the modeled system.

BOUND-02: **Outside.** The dashboard/console interface, windshield observation source, vehicle electrical coordinator, defrost actuation equipment, windshield and cabin physics, the user, and all generation or interpretation of raw physical measurements are outside the modeled system.

CTX-01: **Vehicle user and dashboard/console interface.** This entity supplies the finite defrost selection and its validity and receives the driver-facing status. The interface, not the modeled system, is responsible for presenting and encoding these categories.

CTX-02: **Windshield observation source.** This external entity supplies a clear-or-obscured classification and a separate validity value. It is responsible for the truthfulness and freshness represented by `Valid`; the abstract does not prescribe a sensor or classifier.

CTX-03: **Vehicle electrical coordinator.** This external entity supplies interface availability and whether the windshield-defrost load is currently permitted. It owns those classifications; the supervisor does not calculate power quantity.

CTX-04: **Windshield defrost actuation equipment.** This external entity receives an `Off` or `On` enable command. Physical execution and command-delivery confirmation are outside the boundary.

MON-01: **DefrostSelection**, supplied by CTX-01, has the exhaustive values `{Released, Active}` and no unit.

MON-02: **RequestValidity**, supplied by CTX-01, has the exhaustive values `{Valid, Invalid}` and qualifies MON-01 independently of its encoded selection.

MON-03: **GlazingCondition**, supplied by CTX-02, has the exhaustive values `{Clear, Obscured}` and denotes the external source's current windshield classification, not a measured thickness or clearing percentage.

MON-04: **GlazingValidity**, supplied by CTX-02, has the exhaustive values `{Valid, Invalid}` and qualifies MON-03 independently of its encoded condition.

MON-05: **ElectricalInterfaceStatus**, supplied by CTX-03, has the exhaustive values `{Available, Unavailable}`.

MON-06: **DefrostLoadAllowance**, supplied by CTX-03, has the exhaustive values `{Permitted, Restricted}`.

CTRL-01: **DefrostEnableCommand**, received by CTX-04, has the exhaustive values `{Off, On}`. It is an authorization request only and does not assert physical clearing.

CTRL-02: **DriverDefrostStatus**, received by CTX-01, has the exhaustive values `{Idle, Defrosting, Complete, AttentionRequired}`.

## Selected semantic architecture and ownership

ARCH-01: The selected direction is a qualification-and-policy topology: three cohesive assessors derive independent domain facts, one principal owner applies the complete priority policy, and one reporter derives a deliberately coarser user-facing status. The alternative analysis and selection rationale are retained in `design-selection.md`.

PART-01: **Request Intent Tracker; sole request-state owner.** It derives whether the current request is fresh, held, absent, invalid, or awaiting release from MON-01, MON-02, and its local `RequestMemory`. Its memory is behaviorally necessary for fresh-request and re-arm distinctions and is not a copy of a boundary input.

PART-02: **Glazing Condition Assessor.** It derives `VisibilityAssessment = {Clear, NeedsDefrost, Unknown}` from MON-03 and MON-04. Combining a condition with independent validity makes `Unknown` distinct from either raw condition.

PART-03: **Electrical Eligibility Assessor.** It derives `DefrostEligibility = {Eligible, BlockedUnavailable, BlockedRestricted}` from MON-05 and MON-06. The result distinguishes why a request cannot be authorized and is not a one-to-one rename of either input.

PART-04: **Defrost Policy Supervisor; sole principal decision owner.** It consumes the three derived domain facts, applies the priority partition in CC-08 through CC-11, and solely determines CTRL-01 plus `PolicyDisposition = {Inactive, Defrosting, Complete, ObservationFault, ElectricalBlocked}`. No other usage may recompute or override the enable decision.

PART-05: **Driver Feedback Reporter.** It derives CTRL-02 from `PolicyDisposition` and `RequestIntent`. This is a many-to-one audience-oriented assessment: the supervisor's single `Inactive` result becomes `Idle` for `None` but `AttentionRequired` for either blocked request intent, and observation and electrical block reasons also become `AttentionRequired`. Thus neither reporter input is redundant or a renamed output.

STATE-01: **RequestMemory**, owned only by PART-01, has the exhaustive values `{Released, AcceptedActive, RearmRequired}` and initializes to `Released`. `Released` permits the next valid active selection to be fresh; `AcceptedActive` records a continuously accepted active selection; `RearmRequired` blocks an active selection until a valid release occurs.

INIT-01: At initialization, PART-01 shall hold `RequestMemory = Released`, PART-04 shall expose `DefrostEnableCommand = Off` and `PolicyDisposition = Inactive`, and PART-05 shall expose `DriverDefrostStatus = Idle` before processing a boundary observation. Initialization is a safe baseline and is excluded from the twelve nontrivial behavioral contract cases.

OWNER-01: **Decision audit.** PART-04 is the exactly one principal decision owner. PART-01 decides only request applicability and re-arm state, PART-02 decides only observation meaning, PART-03 decides only resource eligibility, and PART-05 decides only presentation status; none owns defrost authorization.

OWNER-02: **State audit.** PART-01 is the only state owner. PART-02, PART-03, PART-04, and PART-05 are functions of current inputs for this abstract and shall introduce no hidden history, timer, retry count, or latch.

OWNER-03: **Semantic-usage audit.** Each of the five usages derives an owner-local fact covered by at least one canonical case: PART-01 by CC-01..CC-05, PART-02 by CC-06, PART-03 by CC-07, PART-04 by CC-08..CC-11, and PART-05 by CC-12. A forwarding-only helper, duplicate arbiter, or identity mapper is not permitted as a sixth semantic usage.

## Complete typed directed interaction inventory

INT-01: CTX-01 provides `DefrostSelection` to PART-01. This is the only route for MON-01.

INT-02: CTX-01 provides `RequestValidity` to PART-01. This is the only route for MON-02 and remains separate from selection so invalidity cannot masquerade as release.

INT-03: CTX-02 provides `GlazingCondition` to PART-02. This is the only route for MON-03.

INT-04: CTX-02 provides `GlazingValidity` to PART-02. This is the only route for MON-04 and remains separate from the condition.

INT-05: CTX-03 provides `ElectricalInterfaceStatus` to PART-03. This is the only route for MON-05.

INT-06: CTX-03 provides `DefrostLoadAllowance` to PART-03. This is the only route for MON-06 and allows restriction to be distinguished from interface unavailability.

INT-07: PART-01 provides `RequestIntent = {Fresh, Held, None, BlockedInvalid, BlockedRearm}` to PART-04 for authorization priority.

INT-08: PART-02 provides `VisibilityAssessment` to PART-04 for observation-fault, clear-boundary, and defrost-demand decisions.

INT-09: PART-03 provides `DefrostEligibility` to PART-04 for resource gating and block-reason selection.

INT-10: PART-04 provides `DefrostEnableCommand` to CTX-04. This is the only route for CTRL-01.

INT-11: PART-04 provides `PolicyDisposition` to PART-05 as the technical outcome to be summarized for the user.

INT-12: PART-01 provides `RequestIntent` to PART-05 so PART-05 can distinguish nominal `None/Inactive` from blocked-request `BlockedInvalid/Inactive` and `BlockedRearm/Inactive`; INT-11 alone cannot make that distinction.

INT-13: PART-05 provides `DriverDefrostStatus` to CTX-01. This is the only route for CTRL-02.

COUNT-01: **Interaction recount.** The inventory contains exactly 13 semantic directed interactions: six boundary inputs (INT-01..INT-06), three assessor-to-decision flows (INT-07..INT-09), one controlled actuation output (INT-10), two reporter inputs (INT-11..INT-12), and one controlled status output (INT-13). All five usages participate in one weakly connected region; no interaction exists solely to satisfy the count.

SUPPORT-01: **Generated-support containment allowance.** The exact physical realization shall be one root AADL System containing exactly one behavior-free generated-support Process, which contains the five semantic Threads corresponding to PART-01..PART-05. This gives one semantic responsibility layer and physical containment depth two below the root, with exactly six physical non-root AADL usages. The Process shall be marked `@generated-support`, owns no domain behavior, state, applicability, proposal, decision, or semantic-usage credit, and does not create another semantic responsibility layer.

SUPPORT-02: **Generated-support connection allowance.** The 13 semantic interactions INT-01..INT-13 shall map to exactly 21 raw AADL `PortConnection` declarations: the eight boundary interactions INT-01..INT-06, INT-10, and INT-13 each require one declaration across the System/Process boundary and one across the Process/Thread boundary, while the five internal inter-Thread interactions INT-07..INT-09, INT-11, and INT-12 each require one declaration. All sixteen boundary delegation declarations shall be marked or traced as `@generated-support`; they only reroute values and receive no semantic-interaction, owner, or usage credit.

## Finite policy and canonical contract partition

POL-01: **Evaluation model.** Each logical observation evaluates PART-01 through PART-05 in dependency order using current boundary inputs and PART-01's pre-state. The resulting next `RequestMemory` is retained for the next observation. This ordering is a deterministic modeling assumption, not a physical latency or scheduling claim.

POL-02: **Priority order.** PART-04 shall apply the following mutually exclusive order: (1) `None`, `BlockedInvalid`, or `BlockedRearm` request intent forces `Off`; otherwise (2) `Unknown` visibility forces `Off`; otherwise (3) non-`Eligible` electrical eligibility forces `Off`; otherwise (4) `NeedsDefrost` commands `On` and `Clear` commands `Off`. A higher item masks lower outcomes for CTRL-01 and `PolicyDisposition`.

POL-03: **Request recovery.** Any invalid request validity enters `RearmRequired`; a valid active selection cannot leave it. Only a valid released selection returns memory to `Released`, after which a later valid active selection is a new `Fresh` request.

POL-04: **Nonlatching recovery.** `Unknown` visibility and non-`Eligible` electrical eligibility do not change request memory. While request intent remains `Held`, restored valid visibility and eligibility are reconsidered automatically on the next logical observation.

POL-05: **Clear boundary.** A valid `Clear` observation with actionable request and electrical eligibility produces `Off/Complete`. If a later valid observation becomes `Obscured` while the request remains actionable and eligible, the result returns to `On/Defrosting`; completion is not latched.

CASE-COUNT-01: The required nontrivial canonical set is exactly CC-01 through CC-12. Initialization, type well-formedness, and simple range assumptions are not counted as nontrivial cases. Each case has a unique owner and an objective result.

CC-01: **PART-01 fresh-request case.** If `RequestValidity = Valid`, `DefrostSelection = Active`, and pre-state is `Released`, then `RequestIntent = Fresh` and next state is `AcceptedActive`.

CC-02: **PART-01 held-request case.** If `RequestValidity = Valid`, `DefrostSelection = Active`, and pre-state is `AcceptedActive`, then `RequestIntent = Held` and next state remains `AcceptedActive`.

CC-03: **PART-01 release and re-arm case.** If `RequestValidity = Valid` and `DefrostSelection = Released`, for every pre-state, then `RequestIntent = None` and next state is `Released`. This both stops an accepted request and performs the required release step from `RearmRequired`.

CC-04: **PART-01 invalid-request case.** If `RequestValidity = Invalid`, for either encoded selection and every pre-state, then `RequestIntent = BlockedInvalid` and next state is `RearmRequired`.

CC-05: **PART-01 active-before-rearm case.** If `RequestValidity = Valid`, `DefrostSelection = Active`, and pre-state is `RearmRequired`, then `RequestIntent = BlockedRearm` and next state remains `RearmRequired`.

CC-06: **PART-02 complete visibility case.** `VisibilityAssessment = Unknown` iff `GlazingValidity = Invalid`; with valid glazing it is `Clear` iff `GlazingCondition = Clear` and `NeedsDefrost` iff `GlazingCondition = Obscured`. These three results are exclusive and exhaustive.

CC-07: **PART-03 complete eligibility case.** `DefrostEligibility = Eligible` iff the interface is `Available` and allowance is `Permitted`; it is `BlockedUnavailable` whenever the interface is `Unavailable`; otherwise the available-but-`Restricted` combination is `BlockedRestricted`. These results are exclusive and exhaustive, with interface unavailability taking reason precedence when both raw restrictions occur.

CC-08: **PART-04 non-actionable-request case.** For `RequestIntent` in `{None, BlockedInvalid, BlockedRearm}`, the command is `Off` and disposition is `Inactive`, regardless of visibility and eligibility. PART-05, not the principal command decision, distinguishes normal absence from a blocked request for CTRL-02.

CC-09: **PART-04 observation-fault case.** For an actionable intent in `{Fresh, Held}` and `VisibilityAssessment = Unknown`, the command is `Off` and disposition is `ObservationFault`, regardless of electrical eligibility.

CC-10: **PART-04 electrical-block case.** For an actionable intent, a known visibility in `{Clear, NeedsDefrost}`, and eligibility in `{BlockedUnavailable, BlockedRestricted}`, the command is `Off` and disposition is `ElectricalBlocked`.

CC-11: **PART-04 eligible known-visibility case.** For an actionable intent and `DefrostEligibility = Eligible`, `VisibilityAssessment = NeedsDefrost` yields `On/Defrosting`, while `VisibilityAssessment = Clear` yields `Off/Complete`. The two results close the nominal and equality-free clear boundary without a hidden threshold.

CC-12: **PART-05 complete reporting case.** A request intent in `{BlockedInvalid, BlockedRearm}` yields `DriverDefrostStatus = AttentionRequired`; otherwise `PolicyDisposition = Defrosting` with actionable request yields `Defrosting`, `Complete` with actionable request yields `Complete`, and `ObservationFault` or `ElectricalBlocked` with actionable request yields `AttentionRequired`; all remaining combinations yield `Idle`. This priority mapping is exclusive and exhaustive, uses both inputs, and never changes CTRL-01.

PARTITION-01: **Closure audit.** CC-01..CC-05 cover the Cartesian product of both request-validity values, both selection values, and all three request pre-states without overlap after validity and selection precedence. CC-06 and CC-07 are total over their two-input products. CC-08..CC-11 are total over every `RequestIntent × VisibilityAssessment × DefrostEligibility` combination in POL-02 priority order. CC-12 is total over reporter inputs. Fresh, held, release, invalid, active-before-rearm, observation recovery, resource recovery, and clear-to-obscured return paths therefore have defined results.

ANALYSIS-01: **Bounded owner-local and end-to-end obligation.** The retained deterministic analyzer shall enumerate exactly 12 PART-01 valuations, 4 PART-02 valuations, 4 PART-03 valuations, 45 PART-04 valuations, and 25 PART-05 valuations, then enumerate all 192 root snapshots formed by 64 boundary-input valuations times 3 request pre-states and execute SCN-01..SCN-05 as the stated multi-step traces. End-to-end composition shall consume each producing owner's values over INT-07..INT-09 and INT-11..INT-12 rather than reclassifying root inputs centrally. An independent direct oracle may cross-check the composed pipeline, but shall not substitute for owner-local checks or be reported as solver proof.

## Required behavior and objective verification criteria

BEH-01: **Nominal fresh start.** Under CC-01, CC-06 `NeedsDefrost`, and CC-07 `Eligible`, the system shall produce CTRL-01 `On` and CTRL-02 `Defrosting` in that logical observation and shall retain `AcceptedActive` for the next observation. **Verification:** contract analysis plus bounded enumeration. **Pass criterion:** every matching valuation produces exactly those outputs and next state, with no competing principal decision owner.

BEH-02: **Nominal held request.** A subsequent valid active request with valid obscured glazing and eligibility shall satisfy CC-02 and keep `On/Defrosting`. **Verification:** two-step bounded state analysis. **Pass criterion:** the first step is `Fresh`, the second is `Held`, both command `On`, and the second state remains `AcceptedActive`.

BEH-03: **Clear boundary.** An actionable request with valid `Clear` glazing and eligibility shall produce `Off/Complete`; later valid `Obscured` glazing under the same held request shall return to `On/Defrosting`. **Verification:** two-step contract analysis. **Pass criterion:** the output sequence is exactly `Off/Complete`, then `On/Defrosting`, without a release or hidden completion latch.

FAULT-01: **Invalid request and fail-off re-arm.** Invalid request validity shall produce `Off/AttentionRequired` and enter `RearmRequired`; a valid active selection while re-arm is required shall remain `Off/AttentionRequired`. **Verification:** two-step state analysis over both encoded selections. **Pass criterion:** no invalid or blocked-rearm step can command `On`, and both steps retain `RearmRequired` after the initial fault.

FAULT-02: **Invalid glazing observation.** With an actionable request, `GlazingValidity = Invalid` shall produce `Off/AttentionRequired`, even if the encoded condition is `Obscured` and resources are eligible. **Verification:** priority-partition enumeration. **Pass criterion:** both encoded glazing conditions produce `ObservationFault`, CTRL-01 `Off`, and no request-memory change.

FAULT-03: **Electrical block.** With an actionable request and known glazing, either unavailable interface or restricted allowance shall produce `Off/AttentionRequired`. **Verification:** enumerate all four electrical combinations. **Pass criterion:** only `Available × Permitted` is eligible; every other combination commands `Off` when reached by priority.

REC-01: **Request-fault recovery.** From `RearmRequired`, a valid release shall produce `Off/Idle` and `Released`; a following valid active selection under obscured valid glazing and eligibility shall be `Fresh` and produce `On/Defrosting`. **Verification:** three-step bounded state analysis including the preceding fault. **Pass criterion:** the exact state sequence is `RearmRequired → Released → AcceptedActive`, and no earlier active step bypasses release.

REC-02: **Observation and resource recovery.** With request memory `AcceptedActive`, restoration from invalid visibility or electrical ineligibility to valid `Obscured` and `Eligible` shall resume `On/Defrosting` without requiring a fresh request. **Verification:** two-step analysis for each fault class. **Pass criterion:** the blocked step is `Off/AttentionRequired`, the restored step is `On/Defrosting`, and both retain `AcceptedActive`.

## Bounded scenario families

SCN-01: **Nominal activation and hold family.** Start from initialization. Observe `(Active, Valid, Obscured, Valid, Available, Permitted)` twice. The first observation shall be `Fresh` and the second `Held`; both externally yield `(On, Defrosting)`. This family uniquely demonstrates fresh-to-held state progression.

SCN-02: **Clear-condition boundary family.** From initialization, present `(Active, Valid, Clear, Valid, Available, Permitted)`, then change only glazing to `Obscured`. Outputs shall be `(Off, Complete)` then `(On, Defrosting)`. This family uniquely demonstrates the selected nonlatched clear boundary.

SCN-03: **Invalid-observation priority family.** With pre-state `AcceptedActive`, present `(Active, Valid, Obscured, Invalid, Unavailable, Permitted)`. The result shall be `(Off, AttentionRequired)` with `RequestIntent = Held`, `VisibilityAssessment = Unknown`, `DefrostEligibility = BlockedUnavailable`, and `PolicyDisposition = ObservationFault`, demonstrating that observation fault precedes resource blocking.

SCN-04: **Electrical denial and automatic recovery family.** With pre-state `AcceptedActive`, hold request and glazing inputs at `(Active, Valid, Obscured, Valid)`, present electrical pairs `(Available, Restricted)` and then `(Available, Permitted)`. Outputs shall be `(Off, AttentionRequired)` then `(On, Defrosting)` without a new request edge. This family uniquely demonstrates nonlatching resource recovery.

SCN-05: **Invalid-request re-arm family.** From active operation, present the request pairs `(Active, Invalid)`, `(Active, Valid)`, `(Released, Valid)`, and `(Active, Valid)` in that order while glazing remains `(Obscured, Valid)` and electrical context remains `(Available, Permitted)`. Outputs shall be `Off`, `Off`, `Off`, `On`; request intents shall be `BlockedInvalid`, `BlockedRearm`, `None`, `Fresh`; and request memory shall end `AcceptedActive`. This family uniquely demonstrates mandatory release-before-restart recovery.

SCENARIO-COUNT-01: The scenario inventory is exactly five families: nominal state progression, clear boundary, invalid-observation priority, resource recovery, and invalid-request re-arm recovery. Each has a distinct behavioral trace and collectively covers nominal, boundary, invalid/fault, priority, and both recovery policies.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for supplying exactly one value of MON-01 and MON-02 per logical observation and for using `Invalid` whenever it cannot stand behind the selection. **Rationale:** separate validity is necessary to distinguish release from an unusable request signal.

ASM-02: CTX-02 is responsible for supplying exactly one value of MON-03 and MON-04 per logical observation and for using `Invalid` whenever the clear-or-obscured classification is not trustworthy. **Rationale:** no quantitative progress metric or sensor behavior is source-grounded.

ASM-03: CTX-03 is responsible for supplying one value of MON-05 and MON-06 per logical observation. `Permitted` is meaningful only as its authorization classification; the model does not infer watts, voltage, or energy. **Rationale:** the seed mentions electrical context but defines no bound.

ASM-04: CTX-04 is responsible for interpreting CTRL-01 as an enable request. No assumption that an `On` command physically clears the windshield is needed for model acceptance. **Rationale:** actuator behavior and feedback are outside the selected boundary.

ASM-05: The logical observation order in POL-01 is deterministic and sufficiently coherent for state and contract analysis. **Rationale:** it enables an exhaustive pilot model while making no claim about real-time latency or scheduling.

CONSTR-01: The retained model shall contain exactly one root System usage, exactly five reachable semantic Thread usages corresponding to PART-01..PART-05 in one semantic responsibility layer, exactly one behavior-free generated-support Process between the System and those Threads, physical containment depth exactly two below the root, exactly six physical non-root AADL usages, exactly 13 resolved directed semantic interactions corresponding to INT-01..INT-13, exactly 21 raw `PortConnection` declarations under SUPPORT-02, and exactly one weakly connected region.

CONSTR-02: The retained model shall implement exactly the one state variable in STATE-01 and exactly the one principal decision owner in OWNER-01. Tool-required initialization support may be present but shall not introduce another semantic owner, hidden state, or independent policy.

CONSTR-03: The retained behavioral contracts shall expose the twelve owner-local cases CC-01..CC-12. A single centralized restatement of assessor logic, pass-through contracts, type renaming, or analyzer-only reproduction does not satisfy owner or case coverage.

CONSTR-04: Every actionable identifier in this abstract shall trace to one or more retained model elements or contract clauses; every significant model element shall trace back or carry an explicit generated-support justification. METH-01..METH-02 and SRC-01..SRC-03 are informational, and DEFER-01..DEFER-02 are explicitly deferred.

## Objective acceptance criteria

PASS-01: **Structural pass.** Independent model summary and bounded analysis report exactly five semantic usages and semantic nodes, thirteen semantic interactions and semantic edges, one semantic responsibility layer, one root System, one behavior-free generated-support Process, six physical non-root AADL usages, physical depth two below root, twenty-one raw `PortConnection` declarations including sixteen generated-support boundary delegations, one weakly connected region, one state owner, and one principal decision owner, with no support element or forwarding-only usage credited semantically.

PASS-02: **Partition pass.** Bounded enumeration satisfies ANALYSIS-01 and reports CC-01..CC-12 mutually consistent and collectively total over their declared finite input and pre-state domains, with no unconstrained CTRL-01, CTRL-02, next `RequestMemory`, `RequestIntent`, assessment, eligibility, or disposition result.

PASS-03: **Behavior pass.** Contract or bounded trace evidence satisfies BEH-01..BEH-03, FAULT-01..FAULT-03, and REC-01..REC-02, including the exact fresh-request and release-before-restart sequence.

PASS-04: **Scenario pass.** Each SCN-01..SCN-05 has a model-derived trace whose boundary outputs and named internal classifications match the stated finite sequence. Because this is not an executable profile, these traces are contract/analyzer evidence rather than application-execution evidence.

PASS-05: **Trace pass.** Bidirectional trace analysis covers every actionable abstract identifier, identifies informational and deferred identifiers as such, and reports no unexplained significant model element or silent target change.

PASS-06: **Mechanical pass.** Required architecture and final Sireum type gates, the retained deterministic bounded analyzer, source-binding checks, and the policy-required visualization health/export gates all pass for the same retained revision.

PASS-07: **Validation pass.** Designer review finds the model fit for the narrow supervisory purpose in PURPOSE-01 and does not claim any DEFER-01 or DEFER-02 item. Mechanical conformance alone cannot satisfy this criterion.
