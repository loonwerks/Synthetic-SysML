---
abstract_id: HVAC-AIR-01
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
status: approved-final
baseline_revision: designer-resolution-1
campaign_complexity: hard
semantic_usage_count: 14
semantic_interaction_count: 31
nontrivial_contract_case_count: 29
scenario_family_count: 10
semantic_containment_depth: 2
requires_stateful_behavior: true
requires_fault_behavior: true
---

# Cabin Air-Quality and Humidity Supervisor

## Need, purpose, and goals

NEED-01: [Source-grounded need.] A vehicle user needs cabin-air filtration and humidity preferences to be accepted and turned into coherent cabin-air treatment outcomes while the condition observations and shared treatment path may be unavailable.

PURPOSE-01: [Selected pilot purpose.] The system shall supervise cabin air quality and humidity by qualifying finite observations, retaining accepted user preferences, selecting at most one air-treatment purpose, containing observation faults by channel, and issuing one coherent treatment request. It does not regulate temperature, authorize defrost, allocate energy, or control physical treatment equipment.

GOAL-01: The system shall give demanded air filtration precedence over humidity correction and routine air exchange without issuing concurrent conflicting requests.

GOAL-02: The system shall prevent an invalid air-quality observation from authorizing filtration and prevent an invalid humidity observation from authorizing humidity correction while preserving an eligible unaffected channel.

GOAL-03: The system shall retain each observation channel in quarantine until two consecutive valid observations establish recovery, and a recurrence shall restart that channel's recovery sequence.

GOAL-04: The system shall change retained user preference only on a fresh valid request; invalid or held request values shall not overwrite the last accepted preference.

GOAL-05: The system shall compose every selected purpose with current shared-air-path authority and treatment-equipment capability and shall report one deterministic mode and cause.

## Evidence classes and claim boundary

EVID-METHOD-01: [Handbook-derived process fact.] The abstract states need and boundary before architecture, separates assumptions from source facts, assigns responsibility and state ownership, compares alternatives, supplies nominal and off-nominal scenarios, and defines objective evidence. These are methodology obligations, not HVAC-domain facts.

EVID-SEED-01: [Source-grounded seed fact.] The frozen source permits cabin-air filtration, humidity control, user preferences through a vehicle interface, broad electrical/control context, and observations such as filtration efficiency and humidity. It supplies no architecture, sensors, finite values, policy, authority, priority, state, fault response, or recovery rule.

EVID-PILOT-01: [Pilot abstraction.] The finite condition labels, validity values, fresh/held request distinction, shared-air-path authority, equipment-capability values, action priority, state machines, cases, and status causes below are analyzable experiment choices. They are not calibrated physical thresholds or recovered source policies.

EVID-ARCH-01: [Selected architecture.] PART-01 through PART-14 and INT-01 through INT-31 define the retained responsibility allocation and directed topology. They are design decisions rather than corpus facts.

DEFER-01: [Deferred claims.] Pollutant identity or concentration, filter efficiency or life, moisture physics, exact response time, airflow, comfort, usability, acoustics, energy use, reliability probability, automotive safety, regulatory compliance, certification, production readiness, scheduling, deployment, code generation, execution, and formal proof are not claimed and shall not be implied.

DEFER-02: [Deferred capabilities.] Temperature regulation, heating, cooling, defrost authorization, power allocation, engine heat, glazing condition, multiple cabin zones, recirculation mechanics, actuator feedback, and physical treatment success are outside the selected boundary. Other HVAC services may reserve the shared air path only through MON-05; their purpose and policy remain opaque external context.

## Operational context and exact finite boundary

CTX-01: The vehicle user supplies cabin-air preferences through an external interface. The user does not directly command treatment equipment and is responsible only for the request-event semantics in ASM-01.

CTX-02: The cabin-air environment supplies finite air-quality and humidity observations and receives the consequences of accepted treatment requests. Actual pollutant and moisture dynamics remain outside the model.

CTX-03: The air-treatment equipment layer supplies finite readiness and receives the logical treatment plan. Blowers, filters, humidifying/dehumidifying devices, actuation, and outcome feedback are outside the model.

CTX-04: The external cabin air-path coordinator supplies authority to use a shared path. It may reserve that path for an unspecified external HVAC purpose, but no thermal, defrost, or energy policy crosses this boundary.

CTX-05: The dashboard/status recipient receives supervisor mode and cause. Display presentation and subjective usability remain outside scope.

MON-01: `UserAirPreference` from CTX-01 is the product of `validity={Valid,Invalid}`, `arrival={New,Held}`, `enable={On,Off}`, `filterPolicy={Automatic,Continuous}`, `humidityPolicy={Automatic,Disabled}`, and `routineAirflow={Off,Low,High}`. `New` denotes a fresh request for one evaluation; `Held` denotes an unchanged boundary value.

MON-02: `AirQualityObservation` from CTX-02 is the product of `validity={Valid,Invalid}` and `condition={Clean,Loaded}`. `Loaded` is only a finite demand label and does not identify or quantify a pollutant.

MON-03: `HumidityObservation` from CTX-02 is the product of `validity={Valid,Invalid}` and `condition={Dry,Acceptable,Damp}`. The labels are qualitative and have no units, accuracy, or physical threshold claim.

MON-04: `AirTreatmentReadiness` from CTX-03 carries `validity={Valid,Invalid}` and separate `blower`, `filter`, `humidifier`, and `dehumidifier` fields, each in `{Ready,Failed,Unknown}`.

MON-05: `SharedAirPathAuthority` from CTX-04 is the product of `validity={Valid,Invalid}` and `grant={Granted,Reserved}`. `Reserved` is a normal external inhibit; `Invalid` is an untrusted authority value.

CTRL-01: `CabinAirTreatmentPlan` delivered to CTX-03 is one logical value with `action={None,FilterAir,IncreaseHumidity,ReduceHumidity,ExchangeAir}`, `flowClass={Off,Routine,Treatment}`, and `authorityUse={None,SharedAirPath}`.

CTRL-02: `CabinAirSupervisorStatus` delivered to CTX-05 is one logical value with `mode={Idle,Active,Degraded,ObservationHold,Inhibited}` and `cause={None,PreferenceDisabled,PreferenceRejected,AirTreatmentPriority,HumidityTreatmentPriority,AirObservationInvalid,HumidityObservationInvalid,AirRecovering,HumidityRecovering,AuthorityInvalid,AirPathReserved,EquipmentUnavailable,SelectedPathUnavailable}`.

BOUND-01: The modeled system begins at the five MON inputs and ends at the two CTRL outputs. It contains only request qualification and retention, finite observation interpretation, per-channel trust and recovery, readiness/authority qualification, proposal formation, priority, plan composition, and status reconciliation.

## Essential environmental assumptions and selected constraints

ASM-01: CTX-01 is responsible for asserting `arrival=New` only when the user issues a new preference. Rationale: fresh-request acceptance must be distinguishable without prescribing an interface mechanism; a persistent `Held` value is never a new decision.

ASM-02: CTX-02 is responsible for pairing each current observation with its current validity. Rationale: the seed establishes no sensor trust semantics, so invalidity is explicit and is never inferred from a condition label.

ASM-03: CTX-03 is responsible for a simultaneous readiness snapshot. `Unknown` and any field accompanying overall `validity=Invalid` are treated as not ready. Rationale: this closes capability composition conservatively without claiming a physical failure-detection mechanism.

ASM-04: CTX-04 is responsible for a current authority snapshot. The supervisor shall not infer which external HVAC purpose caused `Reserved`. Rationale: shared-path coordination is needed for coherent composition but the external service must not become this system's controlled purpose.

ASM-05: One logical evaluation consumes one simultaneous boundary snapshot and publishes both outputs for that snapshot. Evaluation order is used only to define state transitions and consecutive-valid recovery; it is not a scheduler, sampling-rate, or response-time claim.

ASM-06: `Continuous` filtration, humidify/dehumidify distinctions, and the exact priority order are selected pilot policies grounded only in the seed's optional preference, filtration, and humidity vocabulary. They are not asserted as production HVAC policy.

CONSTR-01: Initialization shall set PART-06 and PART-07 to `Trusted`, PART-08 to an accepted disabled preference, CTRL-01 to `None/Off/None`, and CTRL-02 to `Idle/PreferenceDisabled`. Initialization is required support and is not one of the 29 counted nontrivial cases.

## Selected semantic usages and ownership

PART-01: **Preference Request Qualifier** shall derive `candidateClass={Invalid,Held,FreshDisabled,FreshEnabled}` from all MON-01 control fields and shall expose candidate policies only for a valid fresh request. This is a multi-field event classification, not a rename or record wrapper.

PART-02: **Air-Quality Need Assessor** shall derive `airEvidence={Invalid,Clean,FilterDemand}` from both MON-02 fields. It owns the distinction between invalid evidence and a valid no-demand value.

PART-03: **Humidity Need Assessor** shall derive `humidityEvidence={Invalid,Dry,None,Damp}` from both MON-03 fields. It owns the signed correction need rather than merely forwarding the observed label.

PART-04: **Shared-Path Authority Assessor** shall derive `pathDisposition={Usable,Reserved,Untrusted}` from both MON-05 fields, with invalidity taking precedence over the grant value.

PART-05: **Treatment Capability Assessor** shall derive four field-local capability facts—blower, filter, humidifier, and dehumidifier—each in `CapabilityDisposition={Ready,Failed,Unknown,Untrusted}`. Overall `validity=Invalid` shall make every fact Untrusted regardless of field values; otherwise each fact shall preserve its own Ready, Failed, or Unknown disposition. The assessor shall also derive field provenance so concurrent distinctions remain separate: nonready blower maps to `EquipmentUnavailable`, while a nonready action-specific path maps to `SelectedPathUnavailable` only when that action is demanded.

PART-06: **Air Evidence Recovery Owner** is a state owner. It shall retain `airTrust={Trusted,Quarantined,Confirming}`, apply CASE-05 through CASE-10, and derive an air gate and transition event. It owns recovery from invalid air evidence and does not retain user preference or equipment state.

PART-07: **Humidity Evidence Recovery Owner** is an independent state owner. It shall retain `humidityTrust={Trusted,Quarantined,Confirming}`, apply CASE-11 through CASE-16, and derive a humidity gate and transition event. Its state changes cannot clear or overwrite PART-06 state.

PART-08: **Preference Session Owner** is a third state and decision owner. It shall retain the last accepted enable, filter, humidity, and routine-airflow preference; apply CASE-01 through CASE-04; and derive exactly one acceptance event. Invalid and Held requests preserve the retained preference.

PART-09: **Filtration Proposal Owner** shall combine PART-06's air gate, PART-08's accepted enable/filter policy, and PART-05's blower/filter facts to derive `filterProposal={None,Environmental,Continuous,Unavailable}` and one proposal-local cause by PROP-FILTER-01. It owns applicability, not final priority.

PART-10: **Humidity Proposal Owner** shall combine PART-07's humidity gate and signed evidence, PART-08's accepted enable/humidity policy, and PART-05's blower plus direction-specific capability facts to derive `humidityProposal={None,Increase,Reduce,Unavailable}` and one proposal-local cause by PROP-HUMID-01.

PART-11: **Routine Airflow Proposal Owner** shall combine accepted enable/routine-airflow preference, shared-path disposition, and blower capability to derive `routineProposal={None,Low,High,Unavailable}` and one proposal-local cause by PROP-ROUTINE-01. This is a three-source applicability decision rather than a copied fan preference.

PART-12: **Cabin-Air Priority Arbiter** is a decision owner. It shall apply CASE-17 through CASE-22 to derive exactly one selected intent and winning policy cause. It owns the action order Disabled over all action, then Filter, humidity correction, routine exchange, and None, and the no-selection cause order in CAUSE-LOCAL-01.

PART-13: **Authority-Safe Plan Composer** is a composition decision owner. It shall apply CASE-23 through CASE-29 to combine the selected intent with current shared-path disposition and treatment capability and derive a coherent CTRL-01 candidate plus one realization cause.

PART-14: **Status and Outcome Reconciler** is a decision owner. It shall derive CTRL-02 mode and exactly one cause from the realized plan, selected intent, both recovery facts, and preference-session event using CAUSE-01 and STATUS-01. It receives no owner credit for copying a plan or constructing an output record.

OWN-AUD-01: Every PART usage derives at least one behaviorally meaningful local classification, state transition, applicability decision, priority result, composition result, or status-consistency fact. PART-06, PART-07, and PART-08 are distinct state owners; PART-08, PART-12, PART-13, and PART-14 have distinct decision ownership.

OWN-AUD-02: The bounded analyzer shall observe each owner's canonical local fact and compare it with end-to-end outputs. Recomputing request qualification, evidence recovery, proposal applicability, priority, or plan composition centrally shall fail ownership even when final outputs match.

## Exact typed directed semantic interaction inventory

INT-01: MON-01 `UserAirPreference` flows from the root boundary to PART-01.

INT-02: MON-02 `AirQualityObservation` flows from the root boundary to PART-02.

INT-03: MON-03 `HumidityObservation` flows from the root boundary to PART-03.

INT-04: MON-05 `SharedAirPathAuthority` flows from the root boundary to PART-04.

INT-05: MON-04 `AirTreatmentReadiness` flows from the root boundary to PART-05.

INT-06: PART-01 sends its qualified preference candidate and candidate fields to PART-08.

INT-07: PART-02 sends `airEvidence` to PART-06.

INT-08: PART-03 sends `humidityEvidence` to PART-07.

INT-09: PART-05 sends separate blower and filter `CapabilityDisposition` facts with field provenance to PART-09.

INT-10: PART-05 sends separate blower, humidifier, and dehumidifier `CapabilityDisposition` facts with field provenance to PART-10.

INT-11: PART-05 sends the blower `CapabilityDisposition` fact and its provenance to PART-11.

INT-12: PART-05 sends the coherent four-field capability set and provenance to PART-13.

INT-13: PART-04 sends path disposition to PART-11 for routine-exchange applicability.

INT-14: PART-04 sends path disposition to PART-13 for final authority composition.

INT-15: PART-06 sends air gate, current trusted evidence, state, and transition event to PART-09.

INT-16: PART-07 sends humidity gate, current trusted evidence, state, and transition event to PART-10.

INT-17: PART-08 sends accepted enable/filter preference and acceptance event to PART-09.

INT-18: PART-08 sends accepted enable/humidity preference and acceptance event to PART-10.

INT-19: PART-08 sends accepted enable/routine-airflow preference and acceptance event to PART-11.

INT-20: PART-08 sends accepted enable and preference-session event to PART-12.

INT-21: PART-09 sends its typed filtration proposal plus exactly one local cause in `{EquipmentUnavailable,SelectedPathUnavailable,None}` to PART-12.

INT-22: PART-10 sends its typed humidity proposal plus exactly one local cause in `{EquipmentUnavailable,SelectedPathUnavailable,None}` to PART-12.

INT-23: PART-11 sends its typed routine-airflow proposal plus exactly one local cause in `{AuthorityInvalid,AirPathReserved,EquipmentUnavailable,None}` to PART-12.

INT-24: PART-12 sends selected intent, requested flow class, and winning policy cause to PART-13.

INT-25: PART-13 sends realized plan and realization cause to PART-14.

INT-26: PART-12 sends selected intent and winning policy cause to PART-14 for end-to-end status consistency.

INT-27: PART-06 sends air trust state and transition cause to PART-14.

INT-28: PART-07 sends humidity trust state and transition cause to PART-14.

INT-29: PART-08 sends preference-session state and acceptance event to PART-14.

INT-30: PART-13 sends CTRL-01 `CabinAirTreatmentPlan` to the root boundary.

INT-31: PART-14 sends CTRL-02 `CabinAirSupervisorStatus` to the root boundary.

INT-AUD-01: INT-01 through INT-31 are exactly 31 semantic interactions: five boundary inputs, 24 inter-usage exchanges, and two boundary outputs. Every interaction has a distinct source, destination, typed domain payload, and behavioral consumer; none exists only to reach the tier.

INT-AUD-02: The depth-two realization shall use one behavior-free Process below the root and 14 semantic usages below that Process. Seven boundary interactions each require two raw delegation connections while the 24 inter-usage interactions require one raw connection each, yielding exactly 38 raw connection declarations without changing the 31-interaction semantic count.

## Policy, priority, fault propagation, recovery, and composition

POL-01: A retained disabled preference suppresses every action. Otherwise an applicable filtration proposal has priority over an applicable humidity proposal, which has priority over routine air exchange; a humidity `Reduce` or `Increase` result is determined by current trusted humidity evidence, not by priority order.

POL-02: Air-quality invalidity quarantines only the filtration channel, and humidity invalidity quarantines only the humidity channel. The unaffected channel and routine exchange may remain eligible. Concurrent channel invalidity quarantines both, but it does not erase the retained user preference.

POL-03: `Continuous` filtration creates a filtration proposal while air evidence is valid even when the condition is Clean; `Automatic` creates one only for valid FilterDemand. A disabled humidity policy creates no humidity proposal regardless of trusted evidence.

POL-04: Shared-path `Reserved` and `Untrusted` inhibit every non-None final plan after arbitration. Overall-invalid, Unknown, or nonready blower capability also inhibits every action. An action-specific unavailable path suppresses only a selected action using that path and shall be reported.

POL-05: A fresh valid preference may be accepted during either observation channel's quarantine or confirmation. Recovery never requires a user acknowledgment or a reissued request; after two consecutive valid observations the recovered channel may use the retained preference, while a new invalid observation restarts quarantine.

POL-06: On the second consecutive valid recovery observation, PART-06 or PART-07 shall emit `Recovered`, expose an available gate for that evaluation, and transition to Trusted. The approved flat logical report contains post-state, event, current evidence, and gate for downstream use in that evaluation; this is not an executable scheduling claim.

CAP-REL-01: PART-05 shall apply the total field-local relation in this order: overall invalid maps all four facts to Untrusted; otherwise each MON-04 field maps independently to the identically named Ready, Failed, or Unknown disposition. Concurrent field faults shall never collapse into one aggregate cause before their consumers evaluate demand.

PROP-FILTER-01: PART-09 shall apply this ordered total relation: disabled session, then blocked air gate, then valid Clean evidence under Automatic policy each produce `None/None`; otherwise nonready blower produces `Unavailable/EquipmentUnavailable`; otherwise nonready filter produces `Unavailable/SelectedPathUnavailable`; otherwise valid Automatic FilterDemand produces `Environmental/None`, and Continuous policy with any valid gated air evidence produces `Continuous/None`.

PROP-HUMID-01: PART-10 shall apply this ordered total relation: disabled session or Disabled humidity policy, then blocked humidity gate, then valid no-correction evidence each produce `None/None`; otherwise nonready blower produces `Unavailable/EquipmentUnavailable`; otherwise a nonready capability for the demanded signed direction produces `Unavailable/SelectedPathUnavailable`; otherwise Dry produces `Increase/None` and Damp produces `Reduce/None`.

PROP-ROUTINE-01: PART-11 shall apply this ordered total relation: disabled session, then routine Off each produce `None/None`; otherwise Untrusted authority produces `Unavailable/AuthorityInvalid`; otherwise Reserved authority produces `Unavailable/AirPathReserved`; otherwise nonready blower produces `Unavailable/EquipmentUnavailable`; otherwise Low or High produces the corresponding applicable proposal with cause None.

CAUSE-LOCAL-01: When CASE-22 receives concurrent proposal-local unavailability, PART-12 shall select exactly one cause in descending order `AuthorityInvalid > AirPathReserved > EquipmentUnavailable > SelectedPathUnavailable > None`. Observation invalidity and recovery are not proposal-local causes; PART-14 derives them directly from PART-06 and PART-07 facts under CAUSE-01.

CAUSE-01: PART-14 shall choose exactly one reported cause in descending precedence: `AirObservationInvalid`, `HumidityObservationInvalid`, `AirRecovering`, `HumidityRecovering`, PART-13 realization cause, `PreferenceRejected`, PART-12 policy cause, `PreferenceDisabled`, then `None`. The precedence changes attribution only; it shall not change state, proposal applicability, selection, or plan composition.

STATUS-01: PART-14 shall apply this ordered, mutually exclusive, total partition: first `Inhibited` when a non-None selected intent is suppressed by PART-13; otherwise `ObservationHold` when the plan is None and either channel is Quarantined or Confirming; otherwise `Degraded` when a plan is active while a lower-priority channel is Quarantined or Confirming or a fresh preference was rejected; otherwise `Active` for a non-None unsuppressed plan; otherwise `Idle`.

COMP-01: CTRL-01 `action=None` shall imply `flowClass=Off` and `authorityUse=None`; every non-None action shall imply non-Off flow and `authorityUse=SharedAirPath`.

COMP-02: `FilterAir` shall arise only from a Filter selection and ready filter/blower capability; `IncreaseHumidity` only from Increase and ready humidifier/blower capability; `ReduceHumidity` only from Reduce and ready dehumidifier/blower capability; and `ExchangeAir` only from routine exchange and ready blower capability.

COMP-03: PART-13 shall publish the all-off plan for Untrusted or Reserved shared-path authority, invalid/nonready shared blower, None selection, or selected-path unavailability. No losing proposal may remain present in CTRL-01.

COMP-04: Invalid evidence shall propagate in the same logical evaluation through its recovery owner, proposal owner, arbiter, composer, and status reconciler. No plan may use a one-evaluation stale proposal from the invalidated channel.

## Exactly 29 counted nontrivial contract cases

CASE-01: PART-08, first: if the qualified candidate is Invalid, retain every accepted preference field and emit `RejectedInvalid`.

CASE-02: PART-08, otherwise: if the candidate is Held, retain every accepted preference field and emit `NoNewPreference`.

CASE-03: PART-08, otherwise: if a valid fresh candidate is disabled, accept the complete candidate, set the session Disabled, and emit `AcceptedDisabled`.

CASE-04: PART-08, otherwise: accept the complete valid fresh enabled candidate, set the session Enabled, and emit `AcceptedEnabled`.

CASE-05: PART-06 with pre-state Trusted: if air evidence is Invalid, transition to Quarantined, block the air gate, and emit `AirFaultEntered`.

CASE-06: PART-06 with pre-state Trusted: otherwise remain Trusted, expose the valid current air evidence, and emit `AirStable`.

CASE-07: PART-06 with pre-state Quarantined: if air evidence is Invalid, remain Quarantined, block the gate, and emit `AirFaultPersists`.

CASE-08: PART-06 with pre-state Quarantined: otherwise transition to Confirming, block the gate, and emit `AirRecoveryStarted`.

CASE-09: PART-06 with pre-state Confirming: if air evidence is Invalid, transition to Quarantined, block the gate, and emit `AirFaultRecurred`.

CASE-10: PART-06 with pre-state Confirming: otherwise transition to Trusted, expose the second valid air evidence, and emit `AirRecovered`.

CASE-11: PART-07 with pre-state Trusted: if humidity evidence is Invalid, transition to Quarantined, block the humidity gate, and emit `HumidityFaultEntered`.

CASE-12: PART-07 with pre-state Trusted: otherwise remain Trusted, expose the valid current humidity evidence, and emit `HumidityStable`.

CASE-13: PART-07 with pre-state Quarantined: if humidity evidence is Invalid, remain Quarantined, block the gate, and emit `HumidityFaultPersists`.

CASE-14: PART-07 with pre-state Quarantined: otherwise transition to Confirming, block the gate, and emit `HumidityRecoveryStarted`.

CASE-15: PART-07 with pre-state Confirming: if humidity evidence is Invalid, transition to Quarantined, block the gate, and emit `HumidityFaultRecurred`.

CASE-16: PART-07 with pre-state Confirming: otherwise transition to Trusted, expose the second valid humidity evidence, and emit `HumidityRecovered`.

CASE-17: PART-12, first: if the retained session is Disabled, select None with `PreferenceDisabled` regardless of proposals.

CASE-18: PART-12, otherwise: if an applicable Environmental or Continuous filtration proposal exists, select Filter with `AirTreatmentPriority`.

CASE-19: PART-12, otherwise: if an applicable Reduce humidity proposal exists, select Reduce with `HumidityTreatmentPriority`.

CASE-20: PART-12, otherwise: if an applicable Increase humidity proposal exists, select Increase with `HumidityTreatmentPriority`.

CASE-21: PART-12, otherwise: if an applicable Low or High routine-airflow proposal exists, select ExchangeAir with the proposal's requested flow.

CASE-22: PART-12, otherwise: select None with the highest-precedence proposal-local unavailability cause under `AuthorityInvalid > AirPathReserved > EquipmentUnavailable > SelectedPathUnavailable > None`; select cause `None` when no demand or only blocked observation gates remain.

CASE-23: PART-13, first: if selection is None, derive the all-off plan and preserve the arbiter's cause.

CASE-24: PART-13, otherwise: if path disposition is Untrusted, derive the all-off plan with `AuthorityInvalid`.

CASE-25: PART-13, otherwise: if path disposition is Reserved, derive the all-off plan with `AirPathReserved`.

CASE-26: PART-13, otherwise: if shared blower capability is not ready, derive the all-off plan with `EquipmentUnavailable`.

CASE-27: PART-13, otherwise: for Filter selection, derive `FilterAir/Treatment/SharedAirPath` when the filter path is ready; a contrary local combination shall fail closed with `SelectedPathUnavailable`.

CASE-28: PART-13, otherwise: for Increase or Reduce selection, derive the corresponding humidity action with Treatment flow when its required path is ready; a contrary local combination shall fail closed with `SelectedPathUnavailable`.

CASE-29: PART-13, otherwise: derive `ExchangeAir` with the selected Routine flow class and `SharedAirPath` authority use.

CASE-AUD-01: CASE-01 through CASE-29 are exactly 29 counted nontrivial cases. For each owner, “first” and “otherwise” define an ordered, total, mutually exclusive partition over its finite local inputs and pre-state; each case has a distinct state transition, acceptance result, priority outcome, or composition trace.

CASE-AUD-02: Partition closure includes fresh valid enabled and disabled requests, Held and invalid requests, valid no-demand evidence, initial invalidity, persistent invalidity, first valid recovery evidence, recurrence, second valid recovery, both humidity directions, all priority losers, no demand, authority invalid/reserved/granted, blower loss, action-specific capability, and every plan action.

REL-AUD-01: The mandatory owner-local relations for PART-01 through PART-05, PART-09 through PART-11, and PART-14 shall each be finite, deterministic, total, and mutually exclusive. CAP-REL-01, PROP-FILTER-01, PROP-HUMID-01, PROP-ROUTINE-01, CAUSE-LOCAL-01, CAUSE-01, and STATUS-01 are owner equations or precedence clauses and are not relabeled as counted CASE items. Every local result shall have a bounded witness and an end-to-end consumer.

LOCAL-EXPECT-01: Local-contract acceptance requires every PART owner to expose its canonical derived fact, exactly one effective result for every finite local valuation and pre-state, initialization and stutter where applicable, no writing of another owner's state, and no centralized recomputation. In particular, PART-05 preserves four field-local capability dispositions, PART-09 through PART-11 honor their ordered demand-before-unavailability relations, PART-12 honors both action and no-selection cause precedence, PART-13 fails closed, and PART-14 returns exactly one mode and cause.

## Required behavior, faults, and risks

BEH-01: The system shall implement CASE-01 through CASE-29 and POL-01 through POL-06 with no effective gap or overlap. Verification: bounded local enumeration shall report exactly one effective case for every owner valuation and pre-state and retain at least one witness for every case.

BEH-02: The system shall implement INT-01 through INT-31 with compatible directions and types and preserve every owner-local fact. Verification: architecture inspection plus bounded end-to-end comparison shall report 31 semantic interactions, zero unresolved endpoints, zero unexplained connections, and zero centralized-recomputation mismatches.

BEH-03: PART-06, PART-07, and PART-08 shall initialize safely, stutter when their transition guards do not apply, and update only their assigned state. Verification: contract inspection and bounded sequences shall show no other PART writing air trust, humidity trust, or accepted preference.

FAULT-01: Invalid air evidence shall block filtration in the same evaluation, enter or retain air quarantine, and leave eligible humidity or routine action available; humidity invalidity shall provide the symmetric channel-local behavior. Verification: one-at-a-time and concurrent invalidity variants shall show no stale affected-channel action and no unintended state change in the other owner.

FAULT-02: Each evidence channel shall require two consecutive valid observations after quarantine before it becomes available, and invalid recurrence during Confirming shall return it to Quarantined. Verification: bounded three-evaluation recovery and recurrence traces shall witness CASE-07 through CASE-10 and CASE-13 through CASE-16 without a skipped state.

FAULT-03: Invalid/reserved path authority, invalid/nonready blower capability, or selected-path unavailability shall suppress the final plan in the same evaluation and publish the matching deterministic cause without modifying retained user preference. Verification: every single and simultaneous inhibit combination shall produce CTRL-01 all-off and the CAUSE-01 winner.

RISK-01: If a stale valid condition survives an invalid observation, the supervisor could issue filtration or humidity correction without current trusted evidence. FAULT-01 and COMP-04 mitigate this initiating sequence by channel quarantine and same-evaluation suppression.

RISK-02: If filtration, humidity correction, and routine airflow directly issue commands, simultaneous demands could create a conflicting treatment plan. POL-01 and CASE-17 through CASE-22 mitigate this with one explicit priority owner.

RISK-03: If a selected purpose bypasses shared-path authority or equipment capability, the supervisor could request an unavailable path. FAULT-03 and CASE-23 through CASE-29 mitigate this through fail-closed composition.

RISK-04: If an invalid or held request overwrites retained preference, user intent could change without a fresh valid interaction. CASE-01 through CASE-04 mitigate this by one preference-session owner and preserved state.

## Exactly 10 bounded scenario families

SCN-01: **Fresh preference acceptance.** Variants start from an accepted enabled preference and apply Held, fresh Invalid, fresh Disabled, and fresh Enabled candidates. Pass: Held/Invalid preserve every retained field, fresh candidates replace the complete preference, and exactly one acceptance event and status cause result.

SCN-02: **Nominal automatic filtration.** With an enabled Automatic preference, trusted Loaded air, granted authority, and ready equipment, filtration is selected. Pass: CTRL-01 is `FilterAir/Treatment/SharedAirPath`, status is Active/AirTreatmentPriority, and no humidity or routine action leaks into the plan.

SCN-03: **Nominal damp-air correction.** With no filtration demand, trusted Damp humidity, Automatic humidity policy, and ready equipment, Reduce wins. Pass: CTRL-01 is `ReduceHumidity/Treatment/SharedAirPath` and the status cause is HumidityTreatmentPriority.

SCN-04: **Nominal dry-air correction.** The SCN-03 boundary is varied to trusted Dry humidity. Pass: Increase is selected and composed only when humidifier and blower are ready; no Reduce or Filter action appears.

SCN-05: **Concurrent treatment priority.** Loaded air is combined separately with Damp and Dry humidity and with Low/High routine airflow. Pass: Filter wins every applicable variant; when filtration becomes inapplicable, the signed humidity action wins before routine exchange.

SCN-06: **Routine exchange, no demand, and disabled preference.** Clean/Acceptable observations are combined with routine Off, Low, and High and then with a fresh Disabled request. Pass: Low/High produce only ExchangeAir, routine Off produces None, and Disabled suppresses all proposals.

SCN-07: **Shared-path authority composition.** A selected Filter, humidity, or ExchangeAir intent is evaluated with Granted, Reserved, and Invalid authority and then returns to Granted. Pass: Reserved and Invalid are all-off with distinct causes, Granted composes the selected action immediately, and retained preference/recovery state does not change.

SCN-08: **Equipment fault propagation and isolation.** Overall invalidity, Unknown/Failed blower, failed filter, failed humidifier, and failed dehumidifier are varied one at a time and concurrently. Pass: shared blower loss inhibits every action, action-specific loss disables only its proposal, final composition fails closed, and exactly one deterministic cause is reported.

SCN-09: **Air-evidence quarantine and recovery.** From active filtration, air evidence becomes Invalid, persists, supplies one valid recovery observation, recurs in one variant, and supplies a second consecutive valid observation in another; fresh valid and invalid preference requests are also applied during quarantine. Pass: filtration stops immediately, humidity/routine service can continue, recovery never skips Confirming, fresh valid preference is retained, and Filter can resume on AirRecovered without a reissued request.

SCN-10: **Humidity and concurrent-channel recovery.** From active humidity correction, humidity invalidity follows the full quarantine/confirm/recurrence sequence; variants invalidate both channels and recover them in opposite orders. Pass: the unaffected air channel remains eligible, independently recovered states never clear one another, both-invalid produces no observation-derived action, and exactly one CAUSE-01 status is published for every combined state.

SCN-AUD-01: SCN-01 through SCN-10 are exactly ten distinct families: preference lifecycle, automatic filtration, damp correction, dry correction, concurrent priority, routine/no-demand control, external authority composition, equipment fault propagation, air recovery, and humidity/concurrent recovery. Variants provide case coverage without adding family credit.

## Structural bounds, analyzer obligations, and objective pass criteria

STRUCT-01: The realization shall contain exactly one explicit root system usage and exactly 15 reachable non-root usages: PART-01 through PART-14 beneath one behavior-free support Process. Every semantic usage shall be at containment depth 2, and all reachable usages shall form one weakly connected region.

STRUCT-02: The realization shall contain exactly 31 semantic interactions INT-01 through INT-31 and exactly 38 raw directed connections under the approved depth-two delegation mapping. No generated delegation or support container receives semantic-interaction credit.

STRUCT-03: The realization shall contain exactly 29 counted contract cases CASE-01 through CASE-29 and exactly ten scenario families SCN-01 through SCN-10. Types, initialization, invariants, owner equations, coherence clauses, precedence clauses, delegations, and analyzer witness plumbing shall not inflate these counts.

ANALYSIS-01: A deterministic bounded analyzer shall exhaust each finite owner partition, report zero gaps and zero effective overlaps, retain a local witness for every CASE, and compare local derived facts with independently calculated end-to-end CTRL results.

ANALYSIS-02: Sequence analysis shall cover at least three consecutive evaluations after fault entry for each evidence channel and all nine combined `airTrust × humidityTrust` pre-state pairs. It shall test persistence, first-valid confirmation, recurrence, second-valid recovery, state stutter, fresh valid/invalid/Held requests during recovery, and automatic reuse of retained preference.

ANALYSIS-03: Composition analysis shall enumerate every selected-intent, authority, and four-field capability combination, including concurrent authority/blower/action-path losses; prove COMP-01 through COMP-04, CAUSE-LOCAL-01, CAUSE-01, and the ordered STATUS-01 partition; show exactly one action, mode, and cause; and show that every losing proposal and invalidated-channel proposal is absent from CTRL-01. This is finite conformance evidence, not execution or unbounded proof.

ANALYSIS-04: Bounded end-to-end comparison shall compose canonical owner payloads rather than recompute owner logic; cover all 29 CASE witnesses, all ten SCN families, all nine combined recovery pre-state pairs, and at least three evaluations after each fault entry; and report zero gaps, overlaps, payload mismatches, ownership violations, or stale-channel outputs. Factorization is permitted, but source-bound results and witness retention are mandatory.

PASS-01: Structural conformance passes only with `14 semantic usages / 31 semantic interactions / 29 cases / 10 scenario families / depth 2 / one root / one support Process / one weak semantic region / 38 raw connections`, with no padded responsibility, owner, case, scenario, or edge.

PASS-02: Ownership conformance passes only if every PART derives its stated local fact, PART-06 alone writes air trust, PART-07 alone writes humidity trust, PART-08 alone writes accepted preference, and no central usage recomputes another owner's classification or transition.

PASS-03: Contract conformance passes only if all 29 cases have witnesses, are total and mutually exclusive within their owner partition, and produce their stated result; all fresh/Held/invalid request and recovery/recurrence branches shall be exercised.

PASS-04: Fault conformance passes only if channel invalidity suppresses the affected proposal in the same evaluation, preserves the unaffected channel, requires two consecutive valid recovery observations, relapses on recurrence, and every authority/equipment inhibit composes all-off.

PASS-05: Priority and composition conformance passes only if Filter outranks humidity correction, humidity outranks routine exchange, Disabled outranks every action, every CTRL-01 tuple satisfies COMP-01 and COMP-02, and CTRL-02 follows CAUSE-01 and STATUS-01.

PASS-06: Trace conformance passes only if every actionable abstract ID maps to source or is explicitly informational/deferred, every significant source element maps back to one or two abstract IDs or an explicit generated-support rationale, and unexplained additions are zero.

PASS-07: Mechanical verification requires architecture-stage and final Sireum/HAMR typechecking to pass, every endpoint/type/direction to resolve, the source-bound bounded analyzer to pass, and the exact structural counts to match. Code generation, execution, and formal semantic proof remain not-run.

PASS-08: Designer validation separately passes only if the model retains PURPOSE-01, the exact five-input/two-output boundary, independent channel recovery, preference persistence, selected priority, all ten scenario families, and every source limitation without implying temperature, defrost, energy, physical-performance, or safety control.

PASS-09: Visualization passes only if exactly one native-resolution `system-overview` bound to the retained source revision shows the root, all 14 semantic usages, the principal 31 flows without invented edges, all three state owners, proposal convergence, plan composition, boundary contexts, and no unresolved endpoint, overlap, clipping, truncation, or out-of-bounds object.

SUPPORT-01: Generated support is limited to one behavior-free Process, root-to-Process and Process-to-PART boundary delegation, finite data/type declarations, flat atomic records, initialization, owner-local equations and invariants, witness plumbing, and typed fan-out. These receive no semantic-usage, interaction, owner, case, or scenario credit; any other support requires an explicit `@generated-support` rationale traced to this clause.

AUDIT-FINAL-01: The approved final specification is exactly 14 semantic usages, 31 semantic interactions, 29 nontrivial cases, ten scenario families, semantic depth 2, one root, one behavior-free support Process, one weak semantic region, and 38 raw connections. Every state, acceptance, proposal, priority, composition, case, action, mode, and cause has one named owner; the revised capability, local proposal-cause, no-selection cause, and status-mode relations close all finite request, no-demand, invalidity, persistence, first-valid, recurrence, second-valid, concurrent-state, authority, readiness, action, and output paths.

## Model-review resolution and generation constraints

RES-MODEL-01: The logical mapping is accepted: each recovery owner may expose one flat report containing post-state, event, current evidence, and gate to a downstream proposer while remaining the sole writer of its state. Generated source shall make no execution-order, scheduling, or response-time claim.

RES-MODEL-02: The depth-two mapping is accepted only as exactly seven two-hop boundary interactions plus 24 sibling interactions, yielding 31 semantic interactions and 38 raw typed connections. Every contract-inspected record member shall be a flat attribute supported by the trusted typechecker.

RES-MODEL-03: Factorized bounded analysis is accepted as a generation strategy, not advance verification. The generated analyzer must be source-bound and must independently satisfy ANALYSIS-01 through ANALYSIS-04 before mechanical acceptance.
