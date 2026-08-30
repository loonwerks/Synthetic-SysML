---
abstract_id: SA-HVAC-AIRCARE-SMALL-R2-01
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
campaign_complexity: small
selected_scope: cabin-air-quality-and-humidity-supervisor
campaign_semantic_usage_bounds: [5, 8]
semantic_usage_count: 5
campaign_semantic_interaction_bounds: [7, 14]
semantic_interaction_count: 14
campaign_nontrivial_contract_case_bounds: [6, 12]
nontrivial_contract_case_count: 12
campaign_scenario_family_bounds: [4, 6]
scenario_family_count: 6
semantic_node_count: 5
semantic_edge_count: 14
semantic_responsibility_layer_count: 1
physical_containment_depth_below_root: 2
physical_non_root_aadl_usage_count: 6
generated_support_process_count: 1
raw_port_connection_declaration_count: 22
generated_support_boundary_delegation_count: 16
root_system_usage_count: 1
weakly_connected_region_count: 1
principal_decision_owner_count: 1
state_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Cabin Air-Quality and Humidity Supervisor

## Evidence and claim classes

METH-01: **Handbook-derived method fact; informational.** The need, purpose, operational context, finite monitored and controlled boundary, and objective success criteria precede the selected internal allocation. Architecture is assessed against that problem statement rather than treated as source evidence.

METH-02: **Handbook-derived method fact; informational.** Nominal, boundary, invalid/fault, and recovery behaviors require explicit conditions, observable results, unique trace identifiers, verification methods, and objective pass criteria. Verification of model conformance remains distinct from validation of fitness for this pilot purpose.

SRC-01: **Source-grounded seed fact; informational.** The automotive HVAC catalog includes cabin-air filtration, humidity control, and user preference access through a dashboard or central-console interface among its available purposes and vocabulary.

SRC-02: **Source-grounded seed limitation; informational.** The source supplies neither a pollutant observation nor observation validity, finite humidity bands, command arbitration, state ownership, priority, recovery, actuator feedback, or an architecture. It also establishes no quantitative filtration or humidity performance.

SRC-03: **Source-grounded seed limitation; informational.** The source is a requirement catalog with unresolved placeholders, not an executable control policy or validated physical specification. All exact finite categories, ownership, interactions, policies, and scenario values below are declared pilot choices or assumptions.

PILOT-01: **Pilot abstraction.** This abstract selects a narrow supervisory purpose: decide a downstream cabin air-treatment directive from a level-sensitive air-care preference and finite air-quality and humidity assessments, while requiring a clean confirmation observation after either environmental observation becomes invalid.

PILOT-02: **Pilot abstraction.** `Acceptable`, `Polluted`, `Low`, `Target`, and `High` are externally supplied logical classifications. They are not physical sensor thresholds, concentrations, percentages, comfort claims, or production encodings.

PILOT-03: **Pilot abstraction.** A combined humidity-treatment directive includes filtration as a selected coordination policy. The directive requests a downstream effect; it does not claim that the cabin actually reaches a humidity or air-quality target.

DEFER-01: **Explicitly deferred.** Temperature regulation, heating, cooling, defrost, glazing visibility, vehicle-energy allocation, physical airflow, treatment strength, pollutant species, quantitative humidity, filtration efficiency, response time, and actuator-delivery confirmation are outside this selected scope.

DEFER-02: **Explicitly deferred.** Real thermodynamics, sensor implementation, usability, comfort, acoustics, long-horizon reliability, safety integrity, regulatory compliance, certification, and production readiness are not specified or accepted by this abstract.

DEFER-03: **Explicitly deferred.** Code generation, application execution, schedulability, deployment, physical validation, and formal proof beyond the retained type, contract, trace, bounded-analysis, and visualization gates are `not-run` under this non-executable profile and shall not be reported as passed.

## Need, purpose, and goals

NEED-01: Vehicle occupants need cabin air-quality and humidity supervision that requests no treatment when user preference is unusable or environmental observations are untrusted, yet resumes bounded service only after observation trust has been re-established.

PURPOSE-01: The Cabin Air-Quality and Humidity Supervisor will interpret an air-care preference, classify air-quality and humidity need, guard recovery from invalid environmental observations, issue one coordinated air-treatment directive, and report the supervisory outcome.

GOAL-01: When automatic air care is validly selected and environmental observations are trusted, the system shall request filtration for polluted air at target humidity and shall request the selected combined humidity-and-filtration treatment for low or high humidity.

GOAL-02: The system shall request standby for a valid `Off` preference, an invalid preference, either invalid environmental observation, the first fully valid confirmation after an observation fault or startup, or an internally inconsistent trusted-assessment combination.

GOAL-03: After either environmental observation is invalid, the system shall require one complete logical observation in which both environmental observations are valid before a following complete valid observation may resume treatment; no user release or fresh preference edge is required.

GOAL-04: The system shall distinguish user-off, standby, filtering, humidifying, dehumidifying, preference-fault, input-fault, and recovery-confirmation outcomes without asserting physical treatment success.

## Operational context and exact system boundary

BOUND-01: **Inside.** Preference interpretation, air-quality assessment, humidity assessment, environmental-confidence recovery state, the single coordinated treatment decision, and supervisory status derivation are inside the modeled system.

BOUND-02: **Outside.** The vehicle user and interface, air-quality observation source, humidity observation source, downstream air-treatment equipment, cabin physics, raw measurement acquisition, category thresholds, actuation, and verification of physical outcomes are outside the modeled system.

CTX-01: **Vehicle user and dashboard/central-console interface.** This entity supplies the air-care preference and its validity and receives the supervisory status. The interface owns presentation and encoding; the modeled system does not assess intuitiveness or interaction count.

CTX-02: **Cabin air-quality observation source.** This entity supplies an acceptable-or-polluted classification and independent validity. It is responsible for the truthfulness and freshness represented by `Valid`; the abstract does not prescribe sensing or pollutant thresholds.

CTX-03: **Cabin humidity observation source.** This entity supplies a low-target-high classification and independent validity. It is responsible for the truthfulness and freshness represented by `Valid`; the abstract does not prescribe a humidity sensor or numeric bands.

CTX-04: **Downstream cabin air-treatment equipment.** This entity receives the finite treatment directive. It owns implementation, resource use, actuation, and physical outcome; no delivery feedback crosses this selected boundary.

MON-01: **AirCarePreference**, supplied by CTX-01, has the exhaustive values `{Off, Auto}` and no unit. It is level-sensitive rather than an event request.

MON-02: **PreferenceValidity**, supplied by CTX-01, has the exhaustive values `{Valid, Invalid}` and independently qualifies MON-01.

MON-03: **CabinAirQuality**, supplied by CTX-02, has the exhaustive values `{Acceptable, Polluted}` and no numeric concentration implication.

MON-04: **AirQualityValidity**, supplied by CTX-02, has the exhaustive values `{Valid, Invalid}` and independently qualifies MON-03.

MON-05: **CabinHumidityBand**, supplied by CTX-03, has the exhaustive values `{Low, Target, High}` and no unit or numeric threshold implication.

MON-06: **HumidityValidity**, supplied by CTX-03, has the exhaustive values `{Valid, Invalid}` and independently qualifies MON-05.

CTRL-01: **AirTreatmentDirective**, received by CTX-04, has the exhaustive values `{Standby, Filter, HumidifyWithFilter, DehumidifyWithFilter}`. It is a supervisory request, not evidence of physical treatment.

CTRL-02: **AirCareStatus**, received by CTX-01, has the exhaustive values `{Off, Standby, Filtering, Humidifying, Dehumidifying, PreferenceFault, InputFault, Recovering}`.

## Selected semantic architecture and ownership

ARCH-01: The selected direction is a two-observation qualification topology with a separate stateful confidence guard and one downstream policy owner. The alternative-scope and responsibility-allocation analysis is retained in `design-selection.initial.md`.

PART-01: **Preference Interpreter.** It derives `AirCareIntent = {Disabled, Enabled, Invalid}` from MON-01 and MON-02 under CC-01 and CC-02. This two-input validity-sensitive classification is not a copy or one-to-one rename of either input.

PART-02: **Air-Quality Assessor.** It derives `AirAssessment = {Acceptable, FilterNeeded, Unknown}` from MON-03 and MON-04 under CC-03. The independent validity input makes `Unknown` distinct from either encoded air-quality class.

PART-03: **Humidity Assessor.** It derives `HumidityAssessment = {AddMoisture, AtTarget, RemoveMoisture, Unknown}` from MON-05 and MON-06 under CC-04. The output combines validity with a three-way condition and is not a bijective rename.

PART-04: **Observation Confidence Guardian; sole state owner.** It consumes PART-02 and PART-03 assessments and its local `ConfidenceMode` and derives `MeasurementConfidence = {Trusted, BlockedInvalid, Confirming}` plus the next confidence mode under CC-05 through CC-07. It alone owns the post-fault clean-confirmation rule and never selects CTRL-01 or CTRL-02.

PART-05: **Air-Care Policy Supervisor; sole principal decision owner.** It consumes `AirCareIntent`, both need assessments, and `MeasurementConfidence`; applies CC-08 through CC-12 in the stated priority; and solely derives CTRL-01 and CTRL-02. No other usage may recompute, override, or propose the treatment directive.

STATE-01: **ConfidenceMode**, owned only by PART-04, has exhaustive values `{Trusted, ConfirmationNeeded}` and initializes to `ConfirmationNeeded`. `ConfirmationNeeded` records that no treatment is allowed until a complete valid observation has been seen; it is not a delayed copy of either validity input.

INIT-01: At initialization, PART-04 shall hold `ConfidenceMode = ConfirmationNeeded`, PART-05 shall expose `AirTreatmentDirective = Standby`, and PART-05 shall expose `AirCareStatus = Recovering` before processing a boundary observation. Initialization is a safe baseline and is excluded from the twelve nontrivial contract cases.

OWNER-01: **Decision audit.** PART-05 is exactly one principal decision owner. PART-01 through PART-03 own only input meaning and PART-04 owns only temporal confidence; none may derive a treatment proposal or controlled output.

OWNER-02: **State audit.** PART-04 is exactly one state owner. PART-01, PART-02, PART-03, and PART-05 shall be functions of current incoming facts and shall introduce no hidden request edge, timer, retry count, treatment latch, or outcome history.

OWNER-03: **Semantic-usage audit.** Each of the five usages derives a behaviorally meaningful owner-local fact covered by canonical cases: PART-01 by CC-01..CC-02, PART-02 by CC-03, PART-03 by CC-04, PART-04 by CC-05..CC-07, and PART-05 by CC-08..CC-12. A forwarding helper, identity mapper, duplicate assessor, or second policy owner receives no semantic-usage credit and is not permitted.

## Complete typed directed interaction inventory

INT-01: CTX-01 provides `AirCarePreference` to PART-01. This is the only route for MON-01.

INT-02: CTX-01 provides `PreferenceValidity` to PART-01. This is the only route for MON-02 and remains separate so invalidity cannot masquerade as `Off`.

INT-03: CTX-02 provides `CabinAirQuality` to PART-02. This is the only route for MON-03.

INT-04: CTX-02 provides `AirQualityValidity` to PART-02. This is the only route for MON-04 and remains separate from the encoded class.

INT-05: CTX-03 provides `CabinHumidityBand` to PART-03. This is the only route for MON-05.

INT-06: CTX-03 provides `HumidityValidity` to PART-03. This is the only route for MON-06 and remains separate from the encoded band.

INT-07: PART-01 provides `AirCareIntent` to PART-05 for preference priority and applicability.

INT-08: PART-02 provides `AirAssessment` to PART-04 so observation confidence can detect invalidity and govern confirmation recovery.

INT-09: PART-02 provides `AirAssessment` to PART-05 so the policy owner can distinguish target-humidity filtration need from acceptable air without inspecting raw observations.

INT-10: PART-03 provides `HumidityAssessment` to PART-04 so observation confidence can detect invalidity and govern confirmation recovery.

INT-11: PART-03 provides `HumidityAssessment` to PART-05 so the policy owner can select moisture addition, target-band air treatment, or moisture removal without inspecting raw observations.

INT-12: PART-04 provides `MeasurementConfidence` to PART-05 so invalid and confirmation states mask treatment independently of user preference.

INT-13: PART-05 provides `AirTreatmentDirective` to CTX-04. This is the only route for CTRL-01.

INT-14: PART-05 provides `AirCareStatus` to CTX-01. This is the only route for CTRL-02.

COUNT-01: **Interaction recount.** The complete inventory contains exactly 14 typed semantic directed interactions: six boundary inputs (INT-01..INT-06), six inter-owner flows (INT-07..INT-12), and two controlled boundary outputs (INT-13..INT-14). The fan-out of each assessment has two distinct consumers and meanings: recovery confidence at PART-04 and treatment selection at PART-05.

COUNT-02: **Connectivity audit.** All five semantic usages participate in one weakly connected semantic region and every interaction lies on a boundary-relevant derivation path. No interaction exists solely to reach the campaign count.

SUPPORT-01: **Generated-support containment allowance.** The exact physical realization shall be one root AADL System containing exactly one behavior-free generated-support Process, which contains the five semantic Threads corresponding to PART-01..PART-05. This gives one semantic responsibility layer, physical containment depth exactly two below the root, and exactly six physical non-root AADL usages. The Process shall be marked `@generated-support`, own no state or domain behavior, and receive no semantic-usage credit.

SUPPORT-02: **Generated-support connection allowance.** INT-01..INT-14 shall map to exactly 22 raw AADL `PortConnection` declarations: the eight boundary interactions INT-01..INT-06 and INT-13..INT-14 each require one System-to-Process and one Process-to-Thread delegation declaration, while the six internal interactions INT-07..INT-12 each require one inter-Thread declaration. All sixteen boundary delegation declarations are behavior-free generated support and receive no semantic-interaction credit.

## Finite policy and canonical contract partition

POL-01: **Evaluation model.** Each logical observation evaluates PART-01, PART-02, PART-03, PART-04, then PART-05 using current boundary inputs and PART-04's pre-state. PART-04's next `ConfidenceMode` is retained for the following observation. This deterministic dependency order is a modeling assumption, not a physical scheduling or response-time claim.

POL-02: **Principal priority order.** PART-05 shall apply this mutually exclusive order: (1) `Disabled` forces `Standby/Off`; (2) `Invalid` intent forces `Standby/PreferenceFault`; (3) `BlockedInvalid` confidence forces `Standby/InputFault` and `Confirming` forces `Standby/Recovering`; (4) a defensive unknown assessment with purported `Trusted` confidence forces `Standby/InputFault`; otherwise (5) low humidity selects `HumidifyWithFilter/Humidifying`, high humidity selects `DehumidifyWithFilter/Dehumidifying`, target humidity with `FilterNeeded` selects `Filter/Filtering`, and target humidity with acceptable air selects `Standby/Standby`. Higher items mask all lower outcomes.

POL-03: **Observation-fault recovery.** Any `Unknown` air or humidity assessment produces `BlockedInvalid` and next state `ConfirmationNeeded`. When both assessments first become known while the pre-state is `ConfirmationNeeded`, the guardian produces `Confirming` and next state `Trusted`, so treatment remains standby for that observation. Only a following complete known observation produces `Trusted` service.

POL-04: **Preference recovery and freshness closure.** The air-care preference is a continuously sampled level, not a request event. Therefore there is no `Fresh`, `Held`, release-to-rearm, or edge-memory path. An invalid preference becomes actionable on the next observation with `PreferenceValidity = Valid` and `AirCarePreference = Auto`; observation confidence still independently masks treatment when it is not `Trusted`.

POL-05: **State independence from preference.** PART-04 updates confidence on every logical observation even when preference is `Off` or invalid. A validly disabled interval can therefore supply the clean confirmation observation, and later `Auto` uses the then-current confidence without inventing a fresh-request rule.

POL-06: **Humidity priority.** With enabled intent and trusted known assessments, low or high humidity selects its combined humidity-and-filtration directive regardless of the acceptable-or-filter-needed air assessment. Only the `Target` humidity band delegates treatment selection to air quality.

CASE-COUNT-01: The required nontrivial canonical set is exactly CC-01 through CC-12. Initialization, finite type declarations, simple well-formedness assumptions, and output exclusivity implied by enum typing are mandatory but are not counted as nontrivial cases. Every case has one named owner and an objective result.

CC-01: **PART-01 invalid-preference case.** If `PreferenceValidity = Invalid`, then `AirCareIntent = Invalid` for either encoded preference value.

CC-02: **PART-01 valid-preference case.** If `PreferenceValidity = Valid`, then `AirCarePreference = Off` yields `Disabled` and `AirCarePreference = Auto` yields `Enabled`. Together with CC-01 this is exclusive and exhaustive over all four input valuations.

CC-03: **PART-02 complete air-assessment case.** `AirAssessment = Unknown` iff `AirQualityValidity = Invalid`; with valid air quality, `CabinAirQuality = Acceptable` yields `Acceptable` and `Polluted` yields `FilterNeeded`. The three results are exclusive and exhaustive.

CC-04: **PART-03 complete humidity-assessment case.** `HumidityAssessment = Unknown` iff `HumidityValidity = Invalid`; with valid humidity, `Low` yields `AddMoisture`, `Target` yields `AtTarget`, and `High` yields `RemoveMoisture`. The four results are exclusive and exhaustive.

CC-05: **PART-04 invalid-observation priority case.** If either incoming assessment is `Unknown`, then `MeasurementConfidence = BlockedInvalid` and next `ConfidenceMode = ConfirmationNeeded` for either confidence pre-state and every value of the other assessment.

CC-06: **PART-04 confirmation case.** If both incoming assessments are known and pre-state is `ConfirmationNeeded`, then `MeasurementConfidence = Confirming` and next `ConfidenceMode = Trusted`.

CC-07: **PART-04 trusted-retention case.** If both incoming assessments are known and pre-state is `Trusted`, then `MeasurementConfidence = Trusted` and next `ConfidenceMode = Trusted`. CC-05 through CC-07 are exclusive and exhaustive over every guardian input and pre-state valuation.

CC-08: **PART-05 disabled-preference case.** `AirCareIntent = Disabled` yields CTRL-01 `Standby` and CTRL-02 `Off`, regardless of both assessments and confidence.

CC-09: **PART-05 invalid-preference case.** `AirCareIntent = Invalid` yields CTRL-01 `Standby` and CTRL-02 `PreferenceFault`, regardless of both assessments and confidence.

CC-10: **PART-05 confidence-mask case.** With `AirCareIntent = Enabled`, `MeasurementConfidence = BlockedInvalid` yields `Standby/InputFault`, while `Confirming` yields `Standby/Recovering`, regardless of both assessment values.

CC-11: **PART-05 defensive-inconsistency case.** With enabled intent and `MeasurementConfidence = Trusted`, if either assessment is `Unknown`, the result is `Standby/InputFault`. This closes the policy owner's full finite input space even though conforming upstream composition cannot produce that combination.

CC-12: **PART-05 trusted-treatment case.** With enabled intent, trusted confidence, and both assessments known: `AddMoisture` yields `HumidifyWithFilter/Humidifying`; `RemoveMoisture` yields `DehumidifyWithFilter/Dehumidifying`; humidity assessment `AtTarget` with `FilterNeeded` air yields `Filter/Filtering`; and `AtTarget` with acceptable air yields `Standby/Standby`. These four branches are exclusive and exhaustive over all reachable trusted-treatment combinations.

PARTITION-01: **Closure audit.** CC-01..CC-02 cover all 4 PART-01 valuations, CC-03 all 4 PART-02 valuations, CC-04 all 6 PART-03 valuations, CC-05..CC-07 all 24 `AirAssessment × HumidityAssessment × ConfidenceMode` guardian valuations, and CC-08..CC-12 all 108 `AirCareIntent × AirAssessment × HumidityAssessment × MeasurementConfidence` policy-owner valuations in priority order.

PARTITION-02: **Path audit.** Initialization, valid `Off`, valid `Auto`, invalid preference, acceptable/polluted air, low/target/high humidity, either or both invalid observations, confirmation, repeated invalidity during confirmation, trusted retention, immediate preference-validity recovery, and post-confirmation service resumption all have defined outputs and next state. No fresh-request path exists because POL-04 explicitly selects level semantics.

ANALYSIS-01: **Bounded owner-local and end-to-end obligation.** The retained deterministic analyzer shall enumerate the owner-local valuation counts in PARTITION-01, then all 192 root/pre-state combinations formed by 96 boundary snapshots times two confidence pre-states, and execute SCN-01..SCN-06 as multi-step traces. End-to-end composition shall consume owner outputs over INT-07..INT-12 rather than centrally reclassifying raw inputs.

ANALYSIS-02: **Independent-oracle limit.** An independent direct oracle may compare the composed pipeline with POL-02 through POL-06, but shall not replace owner-local contract checks, earn owner credit, or be reported as solver proof, application execution, or physical validation.

## Required behavior and objective verification criteria

BEH-01: **Nominal filtration.** From trusted pre-state, valid `Auto`, valid polluted air, and valid target humidity shall produce CTRL-01 `Filter`, CTRL-02 `Filtering`, and next confidence state `Trusted` in that logical observation. **Verification:** owner-local contract analysis plus bounded end-to-end enumeration. **Pass criterion:** every matching valuation has exactly those outputs and next state, with PART-05 as the only principal decision owner.

BEH-02: **Humidity-treatment behavior.** From trusted pre-state with valid `Auto` and known assessments, low humidity shall produce `HumidifyWithFilter/Humidifying` and high humidity shall produce `DehumidifyWithFilter/Dehumidifying`, regardless of air assessment. **Verification:** enumerate all four air-by-low/high combinations. **Pass criterion:** all low cases select only humidification, all high cases select only dehumidification, and no target-humidity branch is used.

BEH-03: **Target-band boundary.** From trusted pre-state with valid `Auto` and valid target humidity, acceptable air shall produce `Standby/Standby`, while polluted air shall produce `Filter/Filtering`. **Verification:** two-valuation contract analysis. **Pass criterion:** changing only the air class changes exactly between those two outcome pairs without a hidden numeric threshold.

BEH-04: **Preference applicability.** A valid `Off` preference shall produce `Standby/Off`; an invalid preference shall produce `Standby/PreferenceFault`, regardless of environmental need. **Verification:** priority enumeration over all environment and confidence values. **Pass criterion:** no disabled or invalid-preference valuation produces a treatment directive other than `Standby`.

RISK-01: If treatment were requested from an encoded air-quality or humidity class whose validity is invalid, downstream equipment could act on untrusted supervisory evidence; repeated alternation between invalid and valid evidence could also cause immediate restart without demonstrated clean continuity. FAULT-01 provides the fail-standby mitigation and REC-01 through REC-02 provide the continuity-preserving recovery mitigation.

FAULT-01: **Invalid environmental observation.** Either invalid environmental validity shall force `Standby/InputFault` when air care is enabled, set next confidence state to `ConfirmationNeeded`, and mask the encoded air-quality and humidity classes. **Verification:** enumerate both encoded values of the invalid air observation, all three encoded values of the invalid humidity observation, both confidence pre-states, and both single- and dual-invalid combinations. **Pass criterion:** every reached enabled case has `BlockedInvalid`, `Standby/InputFault`, and next state `ConfirmationNeeded`.

FAULT-02: **Defensive inconsistent-derived-fact response.** If PART-05 receives `Trusted` together with any `Unknown` assessment, it shall request `Standby/InputFault`. **Verification:** local exhaustive analysis of CC-11. **Pass criterion:** all six enabled trusted combinations containing at least one unknown assessment fail closed and none selects treatment.

REC-01: **Observation-confidence recovery.** From any invalid observation, a first complete known observation shall produce `Confirming`, `Standby/Recovering`, and next state `Trusted`; only a following complete known observation may produce a trusted treatment result. **Verification:** three-step bounded state analysis including invalid, confirmation, and service steps. **Pass criterion:** the state sequence is `ConfirmationNeeded → Trusted → Trusted`, the first two directives are `Standby`, and the third exactly matches CC-12.

REC-02: **Interrupted confirmation.** If either observation is invalid again during or immediately after the clean confirmation step, the guardian shall return or remain at `ConfirmationNeeded` and treatment shall stay `Standby`. **Verification:** multi-step analysis with valid-invalid and invalid-valid-invalid sequences. **Pass criterion:** no sequence containing an invalid current observation yields `Trusted` confidence or a treatment directive.

## Bounded scenario families

SCN-01: **Nominal polluted-air filtration family.** With pre-state `Trusted`, present `(Auto, Valid, Polluted, Valid, Target, Valid)`. The derived facts shall be `Enabled`, `FilterNeeded`, `AtTarget`, and `Trusted`, and the boundary result shall be `(Filter, Filtering)`. This family uniquely demonstrates pollutant-driven treatment at target humidity.

SCN-02: **Low-humidity priority family.** With pre-state `Trusted`, valid `Auto`, acceptable valid air, and low valid humidity, the result shall be `(HumidifyWithFilter, Humidifying)`. Repeating with polluted air shall keep the same result. This family uniquely demonstrates low-humidity priority over air assessment.

SCN-03: **High-humidity priority family.** With pre-state `Trusted`, valid `Auto`, polluted valid air, and high valid humidity, the result shall be `(DehumidifyWithFilter, Dehumidifying)`. Repeating with acceptable air shall keep the same result. This family uniquely demonstrates high-humidity priority and the combined directive.

SCN-04: **Target-band and preference boundary family.** With pre-state `Trusted`, valid acceptable air, and valid target humidity, present valid preferences `Auto` then `Off`. Outputs shall be `(Standby, Standby)` then `(Standby, Off)`. Present encoded `Auto` with invalid preference next; output shall be `(Standby, PreferenceFault)`. This family uniquely distinguishes target-band no-treatment, user disablement, and unusable preference.

SCN-05: **Invalid-observation masking family.** With pre-state `Trusted` and valid `Auto`, present polluted air with invalid air validity and high humidity with invalid humidity validity. The result shall be `(Standby, InputFault)`, confidence shall be `BlockedInvalid`, and next state shall be `ConfirmationNeeded`; neither encoded need may leak into a treatment decision.

SCN-06: **Confirmation recovery and interruption family.** Starting after SCN-05, present two consecutive fully valid snapshots `(Auto, Valid, Polluted, Valid, Target, Valid)`. Results shall be `(Standby, Recovering)` then `(Filter, Filtering)`. In the interruption variant, make either validity invalid on the second snapshot; the second result shall instead be `(Standby, InputFault)` and next state `ConfirmationNeeded`. This family uniquely demonstrates the selected two-observation recovery protocol.

SCENARIO-COUNT-01: The scenario inventory is exactly six distinct families: nominal filtration, low-humidity priority, high-humidity priority, target/preference boundary, invalid-observation masking, and confirmation recovery with interruption. Collectively they cover nominal, finite boundary, invalid/fault, priority, startup-equivalent confirmation, and recovery behavior without count padding.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for supplying exactly one MON-01 and MON-02 value per logical observation and using `Invalid` whenever it cannot stand behind the encoded preference. **Rationale:** separate validity prevents an unusable interface value from being interpreted as either `Off` or `Auto`.

ASM-02: CTX-02 is responsible for supplying exactly one MON-03 and MON-04 value per logical observation and using `Invalid` whenever its acceptable-or-polluted classification is untrustworthy or stale. **Rationale:** the source provides no pollutant observation or validity semantics; this finite classification is a pilot assumption required for exhaustive supervision.

ASM-03: CTX-03 is responsible for supplying exactly one MON-05 and MON-06 value per logical observation and using `Invalid` whenever its low-target-high classification is untrustworthy or stale. **Rationale:** the source supplies humidity vocabulary but no numeric thresholds or validity semantics.

ASM-04: CTX-04 is responsible for interpreting exactly one CTRL-01 value as a supervisory request. No assumption that it executes the request or achieves a physical outcome is needed for model acceptance. **Rationale:** execution and cabin physics are outside the boundary.

ASM-05: Successive logical observations are coherent enough that one complete known observation can serve as confirmation, while no duration or physical sampling-rate claim is made. **Rationale:** this is the selected bounded recovery abstraction, not a production timing requirement.

ASM-06: `HumidifyWithFilter` and `DehumidifyWithFilter` are available abstract downstream request categories. **Rationale:** combining humidity treatment with filtration is a pilot coordination choice grounded only by the seed's separate air-filtration and humidity-control capabilities.

CONSTR-01: The retained model shall contain exactly one root System usage; exactly five reachable semantic Thread usages corresponding to PART-01..PART-05 in one semantic responsibility layer; exactly one behavior-free generated-support Process between the System and those Threads; physical containment depth exactly two below the root; exactly six physical non-root AADL usages; exactly 14 resolved directed semantic interactions corresponding to INT-01..INT-14; exactly 22 raw `PortConnection` declarations under SUPPORT-02; and exactly one weakly connected region.

CONSTR-02: The retained model shall implement exactly the one state variable in STATE-01, exactly one state owner in OWNER-02, and exactly one principal decision owner in OWNER-01. Tool-required initialization support may not introduce another semantic owner, hidden state, or independent treatment policy.

CONSTR-03: The retained behavioral contracts shall expose exactly the twelve owner-local cases CC-01..CC-12. A centralized restatement of assessor or confidence logic, pass-through contracts, type renaming, or analyzer-only reproduction does not satisfy owner or case coverage.

CONSTR-04: Every actionable identifier in this abstract shall trace to one or more retained model elements or contract clauses; every significant model element shall trace back or carry a specific `@generated-support` justification. METH-01..METH-02 and SRC-01..SRC-03 are informational, while DEFER-01..DEFER-03 are explicitly deferred.

## Objective acceptance criteria

PASS-01: **Structural pass.** Independent model summary and bounded analysis report exactly five semantic usages/nodes, fourteen semantic interactions/edges, one semantic responsibility layer, one root System, one behavior-free generated-support Process, six physical non-root AADL usages, physical depth two below root, twenty-two raw port connections including sixteen generated-support boundary delegations, one weakly connected region, one state owner, and one principal decision owner, with no support or forwarding-only element credited semantically.

PASS-02: **Partition pass.** Bounded enumeration satisfies PARTITION-01 and ANALYSIS-01 and reports CC-01..CC-12 mutually consistent and collectively total over their declared finite owner-local domains, with no unconstrained intent, assessment, confidence, next state, CTRL-01, or CTRL-02 result.

PASS-03: **Behavior pass.** Contract and bounded-trace evidence satisfies BEH-01..BEH-04, FAULT-01..FAULT-02, and REC-01..REC-02, including invalidity priority, the clean-confirmation hold, interrupted recovery, level-sensitive preference recovery, and humidity-over-air priority.

PASS-04: **Scenario pass.** Each SCN-01..SCN-06 has a model-derived trace whose boundary outputs, named internal facts, and next confidence state match the stated sequence. Because this is not an executable profile, these are contract/analyzer traces rather than application-execution evidence.

PASS-05: **Trace pass.** Bidirectional trace analysis covers every actionable abstract identifier, classifies informational and deferred identifiers correctly, and reports no unexplained significant model element, duplicate decision, or silent change of purpose, priority, recovery, boundary, or count.

PASS-06: **Mechanical pass.** Required architecture and final Sireum type gates, retained deterministic bounded analyzer, independent harness execution, source-binding checks, and run-policy visualization health/export gates all pass for the same retained revision.

PASS-07: **Validation pass.** Designer review finds the retained model fit for the narrow cabin air-quality and humidity supervisory purpose in PURPOSE-01 and makes none of the deferred physical, safety, usability, energy, thermal, defrost, or production claims. Mechanical conformance alone cannot satisfy this criterion.
