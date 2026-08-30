---
abstract_id: HVAC-VIS-01
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
status: approved-final
campaign_complexity: hard
semantic_usage_count: 15
semantic_interaction_count: 33
nontrivial_contract_case_count: 30
scenario_family_count: 10
semantic_containment_depth: 2
requires_stateful_behavior: true
requires_fault_behavior: true
---

# Visibility-Priority Whole-Cabin HVAC Supervisor

## Need, purpose, and goals

NEED-01: [Source-grounded need.] A vehicle user needs one cabin-environment supervisor that accepts finite preferences and coordinates temperature regulation, defrosting, filtration, and humidity outcomes while respecting the available vehicle energy context.

PURPOSE-01: [Selected pilot purpose.] The system shall preserve a usable glazing-clearing response as its primary controlled purpose, then coordinate cabin air-quality, humidity, and thermal services according to an explicit priority policy. This is a logical supervisory purpose, not a claim of physical defrost performance or automotive safety.

GOAL-01: The system shall issue one coherent actuation plan rather than independently commanding conflicting cabin services.

GOAL-02: The system shall give observed urgent glazing clearing precedence over user-off, environmental-conditioning, and thermal-comfort demands whenever the required clearing equipment is available.

GOAL-03: The system shall restrict selected services to the finite electrical and waste-heat eligibility reported at its boundary.

GOAL-04: The system shall propagate critical observation or equipment faults into a latched hold, require an explicit ordered recovery, and reject stale pre-fault requests after recovery.

GOAL-05: The system shall degrade only the affected noncritical service when a thermal, humidity, or air-quality observation is invalid and shall report the resulting status cause.

## Evidence classes and claim boundary

EVID-SEED-01: [Handbook-derived process fact.] The abstract begins with need and boundary, separates facts from choices, identifies responsibility owners, supplies nominal and off-nominal scenarios, compares alternatives, and defines objective evidence. These are methodology obligations, not HVAC-domain facts.

EVID-SEED-02: [Source-grounded seed fact.] The frozen source permits temperature regulation, cooling, heating, windshield/window defrosting, filtration, humidity control, user preferences, electrical power/control context, engine waste heat, and attention to power consumption. It establishes none of the architecture or policy below.

EVID-PILOT-01: [Pilot abstraction.] All monitored values, outputs, validity concepts, priorities, cases, state transitions, and recovery rules below are finite logical abstractions chosen for analyzable synthesis. Their values are not calibrated physical thresholds.

EVID-ARCH-01: [Selected architecture.] PART-01 through PART-15 and INT-01 through INT-33 are the retained responsibility allocation and typed topology. They are design decisions, not recovered facts from the corpus source.

DEFER-01: [Deferred claims.] Physical thermodynamics, exact response duration, real defrost progress, exact power draw, efficiency, subjective comfort or usability, acoustics, service life, reliability probabilities, automotive safety, regulatory compliance, certification, production readiness, scheduling, deployment, code generation, execution, and formal proof are not claimed and shall not be implied by the model or overview.

DEFER-02: [Deferred capabilities.] Rear-window versus windshield zoning, pollutant identity, recirculation, compressor details, engine coolant behavior, multiple user zones, actuator timing, and plant feedback beyond the finite readiness observation are outside this system boundary.

## Operational context and exact boundary

CTX-01: The vehicle user supplies preferences and a recovery acknowledgment; the user does not directly command physical actuators.

CTX-02: The cabin environment supplies a finite cabin thermal observation and receives the consequences of the actuation plan; real thermal dynamics remain outside the model.

CTX-03: The windshield/window environment supplies a finite glazing condition and receives the consequences of a selected clearing service; actual clearing success remains outside the model.

CTX-04: The cabin-air environment supplies finite humidity and air-quality conditions and receives conditioning consequences; pollutant sensing and moisture physics remain outside the model.

CTX-05: The vehicle electrical manager supplies interface and budget availability and receives a requested logical energy tier through the actuation plan.

CTX-06: The engine heat interface supplies only finite waste-heat availability; it is neither modeled as an engine controller nor credited with guaranteed heating efficiency.

CTX-07: The HVAC equipment layer supplies finite readiness for blower, thermal, clearing, and air-treatment paths and receives the atomic actuation plan.

CTX-08: The dashboard/status recipient receives supervisor mode and cause; display layout and subjective intuitiveness are outside scope.

MON-01: `UserClimateRequest` from CTX-01 is the product of `validity={Valid,Invalid}`, `arrival={New,Held}`, `enabled={On,Off}`, `defrost={Requested,NotRequested}`, `target={Cool,Neutral,Warm}`, and `fan={Low,High}`. `New` is a fresh boundary event; `Held` is an unchanged value and cannot reauthorize service after recovery.

MON-02: `CabinThermalObservation` from CTX-02 is `validity={Valid,Invalid}` and `band={Cool,Neutral,Warm}`. The labels are qualitative pilot bands without degrees or accuracy claims.

MON-03: `GlazingObservation` from CTX-03 is `validity={Valid,Invalid}` and `condition={Clear,Misting,Obscured}`. `Obscured` is the logical urgent-clearing condition; it is not a safety classification.

MON-04: `HumidityObservation` from CTX-04 is `validity={Valid,Invalid}` and `condition={Dry,Acceptable,Damp}`.

MON-05: `AirQualityObservation` from CTX-04 is `validity={Valid,Invalid}` and `condition={Clean,Loaded}`; `Loaded` is an abstract treatment demand and identifies no pollutant.

MON-06: `ElectricalAvailability` from CTX-05 is `validity={Valid,Invalid}`, `interface={Available,Unavailable}`, and `budget={Denied,Limited,Full}`.

MON-07: `WasteHeatAvailability` from CTX-06 is `validity={Valid,Invalid}` and `availability={Available,Unavailable}`.

MON-08: `EquipmentReadiness` from CTX-07 gives each of `blower`, `thermal`, `clearing`, and `airTreatment` the value `{Ready,Failed,Unknown}` and carries an overall `validity={Valid,Invalid}`.

MON-09: `RecoveryAcknowledgment` from CTX-01 is `{Absent,Fresh}`. `Fresh` applies to one evaluation only and cannot be stored by the environment as a continuing authorization.

CTRL-01: `CabinActuationPlan` delivered to CTX-07 is one atomic logical value with `service={None,Ventilate,Heat,Cool,Defrost,Filter,Dry}`, `intensity={Off,Reduced,Normal}`, `heatSource={None,Electrical,WasteHeat}`, and `energyTier={None,Limited,Full}`. Coherence constraints below prohibit meaningless field combinations.

CTRL-02: `SupervisorStatus` delivered to CTX-08 is one atomic value with `mode={Idle,Active,Degraded,FaultHold,AwaitFresh}` and `cause={None,VisibilityPriority,ElectricalUnavailable,ElectricalDenied,EquipmentFault,InvalidVisibility,InvalidThermal,InvalidHumidity,InvalidAirQuality,AwaitingRecovery,AwaitingFreshRequest}`.

BOUND-01: The supervisor starts at the nine MON inputs, ends at the two CTRL outputs, and contains only logical qualification, proposal, arbitration, recovery, composition, and reporting. Sensors, dashboard presentation, energy production, engine control, equipment actuation, and cabin/glazing/air physics remain outside.

## Essential environmental assumptions and selected constraints

ASM-01: CTX-01 is responsible for asserting `arrival=New` only for a newly issued request and for pulsing `RecoveryAcknowledgment=Fresh` for one evaluation. Rationale: the fresh-request and recovery policies require distinguishable events without prescribing an interface mechanism.

ASM-02: CTX-02, CTX-03, and CTX-04 are each responsible for pairing every observation with its current validity. Rationale: the seed defines no sensor trust semantics, so invalidity must be explicit rather than inferred from a value.

ASM-03: CTX-05 is responsible for a self-consistent electrical value: an unavailable interface cannot carry an effective Limited or Full budget. Any inconsistent combination is treated as electrically ineligible. Rationale: this closes the finite electrical partition conservatively.

ASM-04: CTX-06 is responsible only for reporting availability; PART-10 may prefer waste heat for heating but shall not infer efficiency or physical heat delivery. Rationale: the seed mentions waste heat but does not define its interface.

ASM-05: CTX-07 is responsible for current equipment readiness. `Unknown` and invalid feedback are critical because the supervisor cannot establish that its selected visibility-clearing path is available. Rationale: this is a pilot fault policy, not a source fact.

ASM-06: One logical evaluation consumes a simultaneous snapshot of all nine inputs and atomically publishes both outputs. Ordering across evaluations is used only for state and recovery semantics, not as a physical timing guarantee.

CONSTR-01: Initialization shall set PART-14 to `Clear`, PART-09 authorization to `Normal`, CTRL-01 to the all-off plan, and CTRL-02 to `Idle/None`. Initialization is required support and is not one of the 30 counted nontrivial cases.

## Selected semantic usages and ownership

PART-01: **Request Qualifier** shall derive `requestClass={Invalid,Off,Defrost,Comfort}`, freshness, target, and fan intent from MON-01. Its many-field classification is behavioral; it is not credited for copying target or fan values.

PART-02: **Thermal Need Assessor** shall derive `thermalNeed={Unavailable,Heat,None,Cool}` by comparing PART-01's valid target with MON-02 and shall separately derive whether MON-02 itself is invalid. The comparison and observation-validity distinction are owner-local facts; an unavailable target alone shall not be mislabeled `InvalidThermal`.

PART-03: **Visibility Need Assessor** shall derive `visibilityNeed={Unavailable,None,Preventive,Urgent}` from MON-03, where Misting is Preventive and Obscured is Urgent.

PART-04: **Humidity Need Assessor** shall derive `humidityNeed={Unavailable,None,Dry}` from MON-04; Dry and Acceptable produce None, while Damp produces Dry.

PART-05: **Air-Quality Need Assessor** shall derive `airNeed={Unavailable,None,Filter}` from MON-05.

PART-06: **Electrical Eligibility Owner** shall derive `electricalTier={Ineligible,Denied,Limited,Full}` from all MON-06 fields and shall identify interface-invalid versus budget-denied causes.

PART-07: **Waste-Heat Eligibility Owner** shall derive `wasteHeatEligible` only when MON-07 is valid and Available; this is a two-field eligibility fact, not a renamed availability value.

PART-08: **Equipment Fault Assessor** shall derive an affected-service readiness set and `criticalEquipmentFault` from all MON-08 fields. Invalid overall feedback, Unknown equipment, failed blower, or failed clearing path is critical; a failed thermal or air-treatment path disables only its affected proposal.

PART-09: **Priority and Authorization Arbiter** is a principal decision and state owner. It shall retain `authorization={Normal,AwaitFresh}`, apply CASE-16 through CASE-25 in order, derive one `SelectedService` with its winning cause, and derive one `noncriticalCause={None,InvalidThermal,InvalidHumidity,InvalidAirQuality}` summary from proposal-local invalidity facts using CAUSE-02.

PART-10: **Thermal Service Proposer** shall combine PART-02, PART-07, and PART-08 blower-and-thermal-path readiness to derive an available Heat, Cool, Ventilate, or None proposal, a preferred heating source, and `thermalDegradation={None,InvalidThermal}`. It owns proposal applicability, including whether the blower permits Ventilate, not final selection.

PART-11: **Visibility Service Proposer** shall combine PART-03 and PART-08 to derive a `DefrostProposal` with separate `availability={Ready,Unavailable}` and `urgency={None,Preventive,Urgent}` facts and shall make clearing-path unavailability explicit. Ready/None still permits an explicit user Defrost request; it does not create an automatic clearing demand.

PART-12: **Cabin-Air Service Proposer** shall combine PART-04, PART-05, and PART-08 to derive mutually exclusive Filter, Dry, or None candidates, with Filter locally preferred when both needs apply, and shall expose separate `InvalidHumidity` and `InvalidAirQuality` degradation facts. It owns this local environmental conflict only.

PART-13: **Energy-Safe Plan Composer** is a decision owner. It shall combine PART-09's selected service with PART-06's eligibility under CASE-26 through CASE-30 and derive a coherent candidate actuation plan.

PART-14: **Critical Fault and Recovery Owner** is an independent state owner. It shall retain `recovery={Clear,Latched,Pending}`, consume electrical, equipment, and visibility-critical facts plus MON-09, apply CASE-10 through CASE-15, and publish state, transition event, and exactly one critical cause selected by CAUSE-01.

PART-15: **Atomic Result Publisher** shall reconcile the selected intent/status summary, energy-safe candidate plan/cause, and recovery status into CTRL-01 and CTRL-02. It derives output mode/cause consistency using CAUSE-03 and suppresses any non-None plan during FaultHold or AwaitFresh; record construction and fan-out alone receive no owner credit.

OWN-AUD-01: Every PART usage derives at least one behaviorally meaningful owner-local fact. PART-09 and PART-14 own distinct state; PART-09, PART-12, PART-13, and PART-15 own distinct decision or composition facts. No root, support container, context actor, data definition, router, copier, renamer, or bundler counts as a semantic usage.

OWN-AUD-02: The bounded analyzer shall expose each PART's canonical derived fact at its local contract boundary and compare it with the end-to-end result. Recomputing qualifier, proposal, priority, recovery, or composition logic centrally fails ownership even if CTRL outputs happen to match.

## Exact typed directed semantic interaction inventory

INT-01: MON-01 `UserClimateRequest` flows from the root boundary to PART-01.

INT-02: MON-02 `CabinThermalObservation` flows from the root boundary to PART-02.

INT-03: MON-03 `GlazingObservation` flows from the root boundary to PART-03.

INT-04: MON-04 `HumidityObservation` flows from the root boundary to PART-04.

INT-05: MON-05 `AirQualityObservation` flows from the root boundary to PART-05.

INT-06: MON-06 `ElectricalAvailability` flows from the root boundary to PART-06.

INT-07: MON-07 `WasteHeatAvailability` flows from the root boundary to PART-07.

INT-08: MON-08 `EquipmentReadiness` flows from the root boundary to PART-08.

INT-09: MON-09 `RecoveryAcknowledgment` flows from the root boundary to PART-14.

INT-10: PART-01 sends qualified target and request availability to PART-02.

INT-11: PART-01 sends request class, freshness, and fan intent to PART-09.

INT-12: PART-02 sends `thermalNeed` and its separate thermal-observation-invalid fact to PART-10.

INT-13: PART-03 sends `visibilityNeed` to PART-11.

INT-14: PART-04 sends `humidityNeed` to PART-12.

INT-15: PART-05 sends `airNeed` to PART-12.

INT-16: PART-06 sends `electricalTier` and cause to PART-13.

INT-17: PART-06 sends critical electrical readiness to PART-14.

INT-18: PART-07 sends `wasteHeatEligible` to PART-10.

INT-19: PART-08 sends `criticalEquipmentFault` and affected paths to PART-14.

INT-20: PART-08 sends one blower-and-thermal-path readiness payload to PART-10.

INT-21: PART-08 sends blower/clearing readiness to PART-11.

INT-22: PART-08 sends air-treatment readiness to PART-12.

INT-23: PART-03 sends critical invalid-visibility status to PART-14.

INT-24: PART-14 sends recovery state and transition event to PART-09.

INT-25: PART-10 sends its typed thermal proposal, preferred source, and thermal-degradation fact to PART-09.

INT-26: PART-11 sends its typed visibility proposal to PART-09.

INT-27: PART-12 sends its typed cabin-air proposal and separate humidity/air-quality degradation facts to PART-09.

INT-28: PART-09 sends selected service, its selected proposal parameters including preferred heating source, fan intent, and winning cause to PART-13.

INT-29: PART-13 sends one record containing the energy-safe candidate actuation plan and its candidate-plan cause to PART-15.

INT-30: PART-09 sends selected intent, authorization status, and its deterministic noncritical-degradation cause summary to PART-15.

INT-31: PART-14 sends recovery state, event, and critical cause to PART-15.

INT-32: PART-15 sends CTRL-01 `CabinActuationPlan` to the root boundary.

INT-33: PART-15 sends CTRL-02 `SupervisorStatus` to the root boundary.

INT-AUD-01: INT-01 through INT-33 are exactly 33 counted end-to-end semantic interactions: nine boundary inputs, 22 inter-usage exchanges, and two boundary outputs. Every interaction has a distinct source, destination, type, and behavioral role; no connection exists merely to hit the tier.

INT-AUD-02: The approved depth-two realization shall use one behavior-free Process beneath the root and the 15 semantic usages beneath it. Each of the 11 boundary interactions requires two raw delegation connections while each of the 22 inter-usage interactions remains one raw connection, yielding exactly 44 raw connection declarations. Delegation is generated support and does not change the 33-interaction semantic inventory.

## Policy, priority, and composition obligations

POL-01: Critical fault and recovery override every service. Within an authorized noncritical evaluation the descending priority is observed Urgent visibility, explicit user Defrost, user Off, Filter, Dry, Heat, Cool, then Ventilate/None.

POL-02: An observed Urgent visibility proposal may override user Off and the post-recovery fresh-request hold; this deliberate pilot rule supports PURPOSE-01 but makes no safety claim. Preventive visibility service requires an explicit Defrost request or an enabled fresh/authorized request.

POL-03: Filter locally overrides Dry when both cabin-air needs apply. Visibility overrides both; both override thermal comfort. No lower-priority proposal may remain energized in the final atomic plan.

POL-04: Invalid thermal, humidity, or air-quality observations make only their associated proposal unavailable and produce Degraded status if another service proceeds. Invalid visibility is critical. Invalid/inconsistent electrical input, unavailable electrical interface, invalid equipment feedback, Unknown equipment, failed blower, or failed clearing path is critical.

POL-05: A Denied electrical budget produces an all-off plan without pretending the interface failed. Limited permits only Reduced intensity; Full permits Normal intensity. Defrost, Cool, Filter, Dry, and Ventilate use Electrical heatSource=None; Heat uses WasteHeat when eligible and otherwise Electrical.

POL-06: PART-14 requires a Fresh acknowledgment followed by a distinct subsequent all-healthy evaluation. Recovery clearing never resumes an old Held request. A simultaneous fresh request on the clearing evaluation loses to the `JustCleared` transition and must be reissued, except that Urgent visibility retains POL-02 authority.

CAUSE-01: When critical facts are concurrent, PART-14 shall select exactly one critical cause in descending precedence `InvalidVisibility > EquipmentFault > ElectricalUnavailable`; this changes only status attribution and shall not change latching, transition, suppression, or all-off behavior.

CAUSE-02: When noncritical invalidity facts are concurrent, PART-09 shall select exactly one noncritical cause in descending service-policy precedence `InvalidAirQuality > InvalidHumidity > InvalidThermal > None`; this changes only status attribution and shall not change proposal availability, priority, or selected service.

CAUSE-03: PART-15 shall select exactly one CTRL-02 cause in descending publication precedence: PART-14 critical/recovery cause, `AwaitingFreshRequest`, candidate-plan `ElectricalDenied`, selected `VisibilityPriority`, PART-09 noncritical cause, then `None`. Thus a Denied budget publishes `mode=Degraded/cause=ElectricalDenied` with CTRL-01 all-off, and simultaneous lower-precedence causes remain analyzable but are not published.

COMP-01: `service=None` shall imply `intensity=Off`, `heatSource=None`, and `energyTier=None`; every non-None service shall imply non-Off intensity and non-None energyTier.

COMP-02: `service=Heat` alone may use heatSource Electrical or WasteHeat; every other service shall use heatSource=None. WasteHeat may be selected only when PART-07 reports eligible and electrical eligibility still permits blower/control operation.

COMP-03: PART-15 shall publish CTRL-01 all-off whenever CTRL-02 mode is FaultHold or AwaitFresh. Active requires a non-None service; Idle requires None; Degraded may accompany either a restricted active service or None with a noncritical cause.

COMP-04: Same-evaluation propagation is required from invalid visibility, critical equipment, or critical electrical facts through PART-14 and PART-09 to the all-off CTRL outputs. No one-cycle stale selected service is permitted.

## Exactly 30 counted nontrivial contract cases

CASE-01: PART-01, first: if MON-01 validity is Invalid, derive requestClass=Invalid regardless of other fields.

CASE-02: PART-01, otherwise: if defrost=Requested, derive requestClass=Defrost and preserve whether arrival is New.

CASE-03: PART-01, otherwise: if enabled=Off, derive requestClass=Off.

CASE-04: PART-01, otherwise: derive requestClass=Comfort with the valid target and fan intent.

CASE-05: PART-06, first: if MON-06 validity is Invalid or its fields are inconsistent, derive Ineligible with an invalid-interface cause.

CASE-06: PART-06, otherwise: if interface=Unavailable, derive Ineligible with ElectricalUnavailable.

CASE-07: PART-06, otherwise: if budget=Denied, derive Denied with `ElectricalDenied` cause.

CASE-08: PART-06, otherwise: if budget=Limited, derive Limited.

CASE-09: PART-06, otherwise: derive Full.

CASE-10: PART-14, recovery=Clear: if any critical fact is present, transition to Latched, emit `FaultEntered`, and select its single critical cause by CAUSE-01.

CASE-11: PART-14, recovery=Clear: if no critical fact is present, remain Clear and emit `NoRecoveryEvent`.

CASE-12: PART-14, recovery=Latched: if a critical fact persists or acknowledgment is not Fresh, remain Latched and emit `AwaitingRecovery`.

CASE-13: PART-14, recovery=Latched: if all critical facts are absent and acknowledgment is Fresh, transition to Pending and emit `RecoveryStarted`.

CASE-14: PART-14, recovery=Pending: if any critical fact returns, transition to Latched and emit `FaultRecurred`.

CASE-15: PART-14, recovery=Pending: if all critical facts remain absent on this distinct next evaluation, transition to Clear and emit `JustCleared`.

CASE-16: PART-09, first: if recovery is Latched or Pending, select FaultHold, set authorization=AwaitFresh, and suppress all proposals.

CASE-17: PART-09, otherwise: if event=JustCleared, select AwaitFresh and set authorization=AwaitFresh even if a fresh request is simultaneous.

CASE-18: PART-09, otherwise: if authorization=AwaitFresh, no Urgent visibility proposal exists, and there is no New valid request, select AwaitFresh and retain that state. A New valid Off request is a fresh authorization decision even though it commands no service.

CASE-19: PART-09, otherwise: if an available Urgent visibility proposal exists, select Defrost with VisibilityPriority and set authorization=Normal.

CASE-20: PART-09, otherwise: if requestClass=Defrost and the visibility proposal reports availability=Ready, select Defrost and set authorization=Normal regardless of its current urgency.

CASE-21: PART-09, otherwise: if requestClass is Off or Invalid, select None; a New valid Off request shall set authorization=Normal without energizing service, while authorization otherwise remains Normal in this reachable branch.

CASE-22: PART-09, otherwise: if an available Filter proposal exists, select Filter and set authorization=Normal.

CASE-23: PART-09, otherwise: if an available Dry proposal exists, select Dry and set authorization=Normal.

CASE-24: PART-09, otherwise: if an available Heat or Cool proposal exists, select that thermal service and set authorization=Normal.

CASE-25: PART-09, otherwise: select Ventilate when enabled fan intent is present and equipment permits it, else select None; set authorization=Normal.

CASE-26: PART-13, first: if electricalTier=Ineligible, derive the all-off plan and ElectricalUnavailable cause regardless of selection.

CASE-27: PART-13, otherwise: if electricalTier=Denied, derive the all-off plan with candidate-plan cause `ElectricalDenied`; if selection is None/FaultHold/AwaitFresh, derive the all-off plan with the corresponding winning cause.

CASE-28: PART-13, otherwise: for selected Defrost, derive Defrost at Reduced under Limited or Normal under Full, with no heatSource.

CASE-29: PART-13, otherwise: for selected Heat or Cool, derive the matching service and electrical tier; Heat uses eligible WasteHeat preferentially and otherwise Electrical, while Cool uses no heatSource field.

CASE-30: PART-13, otherwise: for selected Filter, Dry, or Ventilate, derive the matching service at Reduced under Limited or Normal under Full with heatSource=None.

CASE-AUD-01: CASE-01 through CASE-30 are exactly 30 counted cases. Each owner's listed cases are ordered, total, and mutually exclusive over that owner's finite inputs and pre-state; later cases mean “otherwise” within that owner partition. Qualification equations for PART-02 through PART-05, PART-07, PART-08, and PART-10 through PART-12; initialization; invariants; tuple coherence; state/output projection; and scenario witnesses remain mandatory but are not relabeled as extra counted cases.

CASE-AUD-02: Partition closure specifically includes Invalid and Off requests, Held versus New requests, Denied/Limited/Full/ineligible energy, no-fault entry, persistent and recurrent faults, Fresh and absent acknowledgments, a distinct Pending recovery step, JustCleared with a simultaneous new request, AwaitFresh with stale/no/off/invalid and enabling requests, every proposal priority branch, and all-off versus every selected service composition family.

## Required behavior and evidence

BEH-01: The system shall implement CASE-01 through CASE-30 and POL-01 through POL-06 without effective overlap or gap. Verification: bounded enumeration of every owner's finite input/pre-state domain shall report exactly one effective case per valuation and at least one witness per case.

BEH-02: The system shall implement INT-01 through INT-33 with source/destination/type compatibility and preserve all owner-local facts. Verification: architecture inspection plus analyzer comparison shall report all 33 semantic interactions, zero missing endpoints, zero unexplained connections, and zero centralized recomputation mismatches.

BEH-03: The two state owners shall initialize safely, stutter when their transition guards do not apply, and update only their assigned state. Verification: contract inspection and bounded two-step traces shall show no PART other than PART-09 writing authorization and no PART other than PART-14 writing recovery.

FAULT-01: Invalid visibility, critical equipment, and critical electrical facts shall force same-evaluation FaultHold/all-off and latch recovery. Verification: every single and simultaneous combination of the three critical cause families shall produce recovery=Latched, CTRL-01 all-off, and exactly one CTRL-02 FaultHold cause matching CAUSE-01.

FAULT-02: A noncritical invalid thermal, humidity, or air-quality observation shall disable only the affected proposal and shall not independently latch recovery. Verification: one-at-a-time and every simultaneous combination of these three invalidity families shall preserve each unaffected eligible service, leave recovery Clear, and publish exactly one Degraded cause matching CAUSE-02 when no higher CAUSE-03 condition applies.

FAULT-03: Recovery shall require Fresh acknowledgment, one separate Pending healthy evaluation, a JustCleared hold, and then a qualifying fresh request before nonurgent service resumes. Verification: bounded sequence analysis shall reject persistent acknowledgments, stale Held requests, and a new request simultaneous with JustCleared; it shall accept a later New enabling request.

RISK-01: If a stale comfort or air-treatment request reactivates immediately after a critical fault clears, equipment may resume without renewed user authorization. FAULT-03 mitigates this scenario with AwaitFresh and event priority.

RISK-02: If invalid visibility or unavailable clearing equipment is treated only as a local degraded condition, an apparent clearing command could be published without established clearing-path availability. FAULT-01 mitigates this by latching and forcing all-off/status reporting.

RISK-03: If independent proposals directly command equipment, simultaneous defrost, filtration, humidity, and comfort demands can produce an incoherent plan. GOAL-01, POL-01, and COMP-01 through COMP-04 mitigate this through single-winner arbitration and atomic composition.

## Exactly 10 bounded scenario families

SCN-01: **Nominal thermal regulation.** With healthy equipment and Full electrical availability, variants cover CASE-24 selecting Heat and Cool and CASE-25 selecting Ventilate/None as target and cabin bands change. Pass: plan service, source, intensity, and status match the selected thermal proposal without unrelated service activation.

SCN-02: **Observed urgent visibility override.** From user Off or Comfort, Obscured glazing produces Urgent and CASE-19 Defrost. Pass: visibility wins over Off, Filter, Dry, Heat, and Cool variants and CTRL-02 reports VisibilityPriority.

SCN-03: **Explicit preventive defrost conflict.** With Misting glazing and a Defrost request simultaneous with Filter, Dry, and thermal needs, CASE-20 wins. Pass: one Defrost plan is published and losing proposals remain observable but uncommanded.

SCN-04: **Cabin-air local and global priority.** Loaded air plus Damp humidity exercises PART-12's Filter-over-Dry choice, while variants with no Filter exercise CASE-23 Dry and variants with thermal conflict exercise CASE-22 Filter. Pass: distinct local and global priorities agree.

SCN-05: **Electrical eligibility and plan restriction.** Invalid, unavailable, Denied, Limited, and Full variants witness CASE-05 through CASE-09 and CASE-26 through CASE-30. Pass: ineligible/Denied are all-off, Limited is Reduced, Full is Normal, and no plan exceeds its tier.

SCN-06: **Waste-heat preference and fallback.** A Heat selection is run with valid Available, valid Unavailable, and invalid MON-07. Pass: only the first uses WasteHeat; the others use Electrical when electrically allowed and never claim heating efficiency.

SCN-07: **Noncritical observation degradation.** Thermal, humidity, and air-quality observations are invalidated one at a time and in all pairwise and triple combinations. Pass: only affected proposals become unavailable, recovery remains Clear, unaffected eligible service proceeds, and exactly one status cause follows CAUSE-02/03.

SCN-08: **Critical same-evaluation fault propagation.** Each invalid visibility, invalid/inconsistent electrical input, unavailable interface, invalid equipment feedback, Unknown equipment, failed blower, and failed clearing path initiates CASE-10/CASE-16; variants include every pairwise and triple combination of the critical cause families. Pass: the same evaluation publishes all-off/FaultHold with exactly one CAUSE-01 cause, and the next healthy evaluation without Fresh acknowledgment remains latched.

SCN-09: **Ordered recovery and recurrence.** From Latched, variants cover no acknowledgment, premature Fresh while a fault persists, valid Fresh into Pending, fault recurrence in Pending, and a separate healthy Pending-to-Clear evaluation. Pass: CASE-12 through CASE-15 all have witnesses and no path skips Pending.

SCN-10: **Fresh-request boundary after recovery.** A Held pre-fault request, a New request simultaneous with JustCleared, no request, New Off, New Comfort, New Defrost, and Urgent visibility variants exercise CASE-17 through CASE-21. Pass: stale and simultaneous requests do not resume nonurgent service, a later New enabling request does, New Off clears authorization without activation, and Urgent retains its explicit override.

SCN-AUD-01: SCN-01 through SCN-10 are exactly ten scenario families with distinct traces: thermal regulation, automatic visibility override, explicit defrost conflict, cabin-air conflict, electrical restriction, heat-source selection, noncritical degradation, critical propagation, recovery sequencing, and fresh authorization. Variants within a family provide case coverage but do not add family credit.

## Structural bounds, analyzer obligations, and objective pass criteria

STRUCT-01: The realization shall contain exactly one explicit root system usage and exactly 16 reachable non-root usages: 15 responsibility-bearing semantic usages PART-01 through PART-15 beneath exactly one behavior-free support Process. Semantic containment depth shall be exactly 2 for every PART usage, and all raw usages shall form exactly one weakly connected region.

STRUCT-02: The realization shall contain exactly 33 semantic interactions INT-01 through INT-33. Under the approved depth-two mapping it shall report exactly 44 raw connections: 22 boundary-delegation hops realizing 11 boundary interactions and 22 direct inter-usage connections.

STRUCT-03: The realization shall contain exactly 30 nontrivial contract cases CASE-01 through CASE-30 and exactly ten scenario families SCN-01 through SCN-10. It shall not count support equations, types, initialization, invariants, witnesses, delegations, or duplicated end-to-end assertions toward these totals.

ANALYSIS-01: A deterministic bounded analyzer shall enumerate all finite local owner partitions, including every simultaneous critical and noncritical cause combination, show zero gaps and zero effective overlaps, retain at least one reachable witness for every CASE and every SCN family, and independently calculate expected owner facts, candidate-plan causes, and CTRL results.

ANALYSIS-02: Sequence analysis shall cover at least four consecutive evaluations so Latched-to-Pending-to-JustCleared-to-fresh-authorization behavior is observable. It shall separately check state stutter, recurrence, same-evaluation propagation, stale-request rejection, and the Urgent override.

ANALYSIS-03: Composition analysis shall prove by bounded enumeration that COMP-01 through COMP-04 and CAUSE-01 through CAUSE-03 hold, exactly one service and exactly one CTRL-02 cause are published, priority losers are suppressed, Limited never yields Normal intensity, Denied publishes all-off/Degraded/ElectricalDenied, and all fault/recovery holds are all-off. This is finite conformance evidence, not unbounded proof or execution.

PASS-01: Structural conformance passes only with `15 semantic usages / 33 semantic interactions / 30 cases / 10 scenario families / depth 2 / one root / one weak semantic region`, all within the frozen hard bounds and with no padded responsibility or edge.

PASS-02: Ownership conformance passes only if every PART derives its stated local fact, PART-09 and PART-14 alone own their states, the analyzer observes local derivations, and no central usage reproduces another owner's classification or transition logic.

PASS-03: Behavioral conformance passes only with all 30 cases reachable, total, mutually exclusive within their owner partition, and result-correct; all required fresh-request and recovery branches shall have witnesses.

PASS-04: Fault conformance passes only if all critical initiators propagate in the same evaluation, all three noncritical invalidity families remain isolated, recurrence relatches, and no stale or simultaneous-on-clear request reactivates nonurgent service.

PASS-05: Composition conformance passes only if every CTRL-01 tuple satisfies COMP-01 and COMP-02, every CTRL-02 tuple satisfies COMP-03, and the selected priority and energy tier agree end to end.

PASS-06: Trace conformance passes only if every actionable abstract ID maps to source or is explicitly deferred/informational, every significant source element maps back to one or two abstract IDs or an explicit generated-support rationale, and unexplained additions are zero.

PASS-07: Mechanical verification requires architecture-stage and final Sireum/HAMR typechecking to pass, every endpoint/type/direction to resolve, and the source-bound deterministic analyzer to pass. Code generation, application execution, and formal semantic proof remain not-run.

PASS-08: Designer validation separately passes only if the model retains PURPOSE-01, the exact finite boundary, the selected priority and recovery policies, all ten scenario families, and the source limitations without implying physical performance or safety.

PASS-09: Visualization passes only if exactly one native-resolution `system-overview` bound to the accepted source revision shows the root, all 15 semantic usages, the principal 33 semantic flows without invented edges, the two state owners, priority/composition path, and boundary contexts with no unresolved endpoint, overlap, clipping, truncation, or out-of-bounds object.

SUPPORT-01: Generated support is limited to one behavior-free Process, root-to-Process and Process-to-PART boundary delegation, data/type declarations, flat atomic CTRL records, attribute members for every GUMBO-inspected record field, initialization, local equations/invariants, witness plumbing, and direct typed fan-out. These elements receive no semantic-usage, semantic-interaction, owner, case, or scenario credit; any other support addition requires an explicit `@generated-support` rationale traceable to this clause.

AUDIT-FINAL-01: The approved final architecture is exactly 15 semantic usages, 33 semantic interactions, 30 nontrivial contract cases, ten scenario families, semantic depth 2, one explicit root, one behavior-free support Process, one weak semantic region, and 44 raw connections. Every decision, case, state, and status-cause relation has a named owner; every finite partition includes invalid, no-demand, fresh/stale, fault persistence, concurrent causes, recurrence, acknowledgment, clearing, and post-clear reauthorization paths; no item is credited solely for forwarding, renaming, bundling, or metric padding.

## Resolved Model questions

Q-MODEL-01: Resolved yes for specification composition: local GUMBO state and actual-next transition outputs can represent the two independent state owners and same-evaluation logical consumption. This is not an executable scheduling assertion.

Q-MODEL-02: Resolved yes: the approved depth-two mapping realizes 33 semantic interactions with 44 raw typed connections and flat atomic CTRL-01/CTRL-02 records whose inspected members are attributes.

Q-MODEL-03: Resolved yes at design feasibility: deterministic local exhaustion plus factorized end-to-end composition can retain all 30 CASE and ten SCN-family witnesses, including four-step recovery traces, under the harness watchdog. Passing evidence remains required after generation.

Q-MODEL-04: Resolved yes as finite current-snapshot DataPort values under ASM-01; no executable event or persistence semantics are claimed.
