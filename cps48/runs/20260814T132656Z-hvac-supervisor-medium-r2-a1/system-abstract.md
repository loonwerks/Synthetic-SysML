---
abstract_id: SA-HVAC-AIR-02
run_id: 20260814T132656Z-hvac-supervisor-medium-r2-a1
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
campaign_complexity: medium
selected_primary_scope: cabin-air-quality-and-excess-humidity-supervisor
semantic_usage_bounds: [8, 12]
selected_semantic_usage_count: 8
semantic_interaction_bounds: [15, 21]
selected_semantic_interaction_count: 21
nontrivial_contract_case_bounds: [12, 20]
selected_nontrivial_contract_case_count: 20
scenario_family_bounds: [6, 9]
selected_scenario_family_count: 7
semantic_containment_depth: [1, 2]
selected_physical_containment_depth_below_root: 2
root_system_usage_count: 1
weakly_connected_semantic_region_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
status: designer-approved
---

# Cabin Air-Care Preference and Condition Supervisor

## Evidence and claim classes

METH-01: **Handbook-derived method fact; informational.** Need, purpose, context, and boundary precede the selected internal allocation. Nominal, invalid, conflict, recovery, and fresh-request behavior have finite partitions, trace identifiers, verification methods, and objective pass criteria. Conformance verification remains distinct from domain-fitness validation.

SRC-01: **Source-grounded seed fact; informational.** The frozen automotive HVAC catalog includes cabin-air filtration, humidity control, a vehicle user selecting HVAC preferences through a dashboard or central-console interface, and selected HVAC outcomes.

SRC-02: **Source-grounded seed limitation; informational.** The catalog supplies neither pollutant observations nor sensor validity, finite value sets, architecture, request lifecycle, command authority, arbitration, priority, fault handling, recovery, or a validated physical policy.

PILOT-01: **Pilot abstraction.** This abstract selects cabin-air-quality and excess-humidity supervision. It qualifies an air-care preference, classifies finite air-quality and humidity observations, assesses air-treatment readiness, selects filtration or drying, and reports the supervisory disposition.

PILOT-02: **Pilot abstraction.** All value domains, validity categories, state machines, command meanings, priorities, and same-evaluation propagation rules below are finite experiment choices. They are not recovered production-vehicle encodings or physical thresholds.

DEFER-01: **Deferred claim boundary.** Pollutant identity or concentration, removal efficiency, humidity percentage, humidification of dry air, physical air exchange, temperature regulation, defrost, thermal or energy allocation, exact response or power, actuator feedback, comfort, usability, acoustics, safety, regulation, certification, reliability, and production readiness are outside this specification and shall not be reported as passed.

DEFER-02: **Deferred pilot evidence.** Code generation, application execution, schedulability, deployment, physical validation, and proof beyond retained type, contract, trace, bounded-analysis, and visualization gates are `not-run` under this run policy.

DIVERSE-01: **Diversity constraint.** The closest accepted baseline is the visibility-priority whole-cabin HVAC supervisor. This system is not its air-treatment subassembly: its root purpose and only plant output concern preference-qualified filtration or drying; it has no visibility, defrost, thermal, electrical-budget, waste-heat, or whole-cabin service-selection input or output.

DIVERSE-02: **Genuine differences.** Boundary differs by admitting only air-care preference, air quality, humidity, and treatment readiness and by controlling only air treatment. Interaction topology differs by converging two treatment proposals directly on one air-care arbiter, with no visibility branch, multi-service priority owner, energy composer, or whole-plan publisher. Priority differs by ordering filtration over excess-humidity drying, never by granting visibility an override. Recovery differs by using no acknowledgment input and by requiring a valid `Off` then a new active preference after unknown treatment readiness.

## Need, purpose, scope, and goals

NEED-01: A vehicle user needs a bounded way to request automatic cabin air care or explicit intensive filtration while invalid observations, unavailable treatment paths, and simultaneous air-quality and humidity demands produce deterministic, explainable results instead of stale or conflicting commands.

PURPOSE-01: The Cabin Air-Care Preference and Condition Supervisor will accept a finite air-care preference, qualify whether it is fresh or held, assess air-quality and excess-humidity needs, assess treatment readiness, arbitrate filtration against drying, issue one air-treatment command, and report the result.

SCOPE-01: The system supervises one cabin-air treatment request at a time. The observation services, dashboard or console, physical cabin, treatment equipment, plant execution, and all thermal, visibility, and energy decisions remain external.

GOAL-01: The system shall select normal or intensive filtration when an actionable preference and a qualified air-quality demand require it and the filter path is ready.

GOAL-02: The system shall select drying when an actionable automatic preference and qualified excess humidity require it, the drying path is ready, and no actionable filtration proposal has priority.

GOAL-03: The system shall emit exactly one command from `{Off, FilterNormal, FilterIntensive, Dry}` and one mutually consistent status on every logical evaluation; filtration and drying shall never be commanded together.

GOAL-04: Unknown treatment readiness shall force `Off` and enter a recovery hold. A recovered active preference shall remain inhibited until the interface supplies a valid `Off` and then a new valid active preference.

GOAL-05: Invalid requests, invalid observations, unavailable treatment paths, priority conflicts, recovery holds, and no-treatment results shall be distinguishable in the status without asserting that filtration or humidity control physically occurred.

## Operational context and exact system boundary

BOUND-01: **Inside.** Air-care request lifecycle memory, air-quality qualification, excess-humidity qualification, treatment-readiness classification, filtration proposal, drying proposal, readiness-recovery memory, priority arbitration, command selection, and status reasoning are inside.

BOUND-02: **Outside.** User-interface presentation and encoding, all sensing or estimation, the cabin environment, filter and drying equipment, raw pollutants or moisture, command delivery confirmation, and physical outcome evaluation are outside.

BOUND-03: MON-01 through MON-07 are the complete monitored boundary and CTRL-01 through CTRL-02 are the complete controlled boundary. No clock, temperature, glazing state, electrical budget, waste heat, prior plant output, acknowledgment, hidden sensor, or implicit command authority may affect required behavior.

CTX-01: **Vehicle user and dashboard or central-console interface.** This entity supplies the air-care selection and request validity and receives supervisory status. It is responsible for presenting and encoding the finite categories, not for choosing treatment policy.

CTX-02: **Cabin air-quality observation service.** This entity supplies a qualitative air-quality category and independent validity. It is responsible for the asserted truth and freshness of `Valid`; no sensor or pollutant metric is prescribed.

CTX-03: **Cabin humidity observation service.** This entity supplies a qualitative humidity category and independent validity. It is responsible for the asserted truth and freshness of `Valid`; no percentage or comfort threshold is prescribed.

CTX-04: **Air-treatment plant and readiness service.** This entity supplies one readiness record and receives the selected command. It remains responsible for equipment diagnosis, command execution, filtration, moisture removal, and physical effects.

MON-01: `AirCareSelection`, supplied by CTX-01, has the exhaustive values `{Off, Auto, Purge}`. `Purge` is a pilot name for a user preference requesting intensive filtration, not a claim about physical outside-air exchange.

MON-02: `RequestValidity`, supplied by CTX-01, has the exhaustive values `{Valid, Invalid}` and qualifies MON-01 independently of the encoded selection.

MON-03: `CabinAirQuality`, supplied by CTX-02, has the exhaustive values `{Clean, Elevated, Poor}`. These categories contain no pollutant, concentration, or health semantics beyond the pilot mapping in CASE-AIR-01.

MON-04: `AirQualityValidity`, supplied by CTX-02, has the exhaustive values `{Valid, Invalid}` and qualifies MON-03 independently.

MON-05: `CabinHumidity`, supplied by CTX-03, has the exhaustive values `{Dry, Comfortable, Damp}`. Only `Damp` requests the selected drying capability; humidification is outside the boundary.

MON-06: `HumidityValidity`, supplied by CTX-03, has the exhaustive values `{Valid, Invalid}` and qualifies MON-05 independently.

MON-07: `TreatmentEquipmentStatus`, supplied by CTX-04, is one finite record containing `StatusValidity={Valid,Invalid}`, `FilterPath={Ready,Unavailable}`, and `DryingPath={Ready,Unavailable}`. Path fields are not trusted when status validity is `Invalid`.

CTRL-01: `AirTreatmentCommand`, received by CTX-04, has the exhaustive values `{Off, FilterNormal, FilterIntensive, Dry}`. It is a supervisory request and never evidence of plant execution or environmental effect.

CTRL-02: `AirCareSupervisorStatus`, received by CTX-01, is one finite record containing `StatusMode={Idle,Active,Attention,Recovery}` and `StatusReason={None,NoTreatmentNeeded,Filtering,Drying,AirPriority,RequestInvalid,RearmRequired,AirObservationInvalid,HumidityObservationInvalid,FilterUnavailable,DryerUnavailable,ReadinessInvalid,AwaitFresh}`.

## Selected semantic architecture and ownership

ARCH-01: The selected direction is a distributed qualification-and-convergence topology. Request, air-quality, humidity, and readiness owners derive independent domain facts; two treatment-proposal owners cooperate by qualifying applicability; a separate recovery owner gates a final air-care arbiter. The alternatives and selection rationale are retained in `design-selection.md`.

PART-01: **Air-Care Request Lifecycle Owner.** It owns `RequestMemory={Released,AcceptedActive,RearmRequired}` and derives `RequestIntent={None,FreshAuto,FreshPurge,HeldAuto,HeldPurge,BlockedInvalid,BlockedRearm}` from MON-01, MON-02, and its prior memory. Freshness and re-arm are owner-local facts, not renamed inputs.

PART-02: **Air-Quality Qualification Owner.** It derives `AirAssessment={Unknown,Clear,FilterNormalNeeded,FilterIntensiveNeeded}` from MON-03 and MON-04. Independent validity makes `Unknown` distinct from every air category.

PART-03: **Humidity Qualification Owner.** It derives `HumidityAssessment={Unknown,NoExcessHumidity,DryingNeeded}` from MON-05 and MON-06. It classifies both `Dry` and `Comfortable` as no selected excess-humidity treatment, without claiming those conditions are equivalent physically.

PART-04: **Treatment Readiness Qualification Owner.** It derives `TreatmentReadiness={Unknown,NeitherReady,FilterOnly,DryerOnly,BothReady}` and `ReadinessContext={CriticalUnknown,Clear}` from all three fields of MON-07. The cross-product classification is not a one-to-one copy of either path field.

PART-05: **Filtration Proposal Owner.** It combines RequestIntent, AirAssessment, and TreatmentReadiness to derive `AirProposal={None,InvalidAirObservation,FilterUnavailable,FilterNormal,FilterIntensive}`. It alone decides whether air-quality or explicit Purge intent makes filtration applicable; it does not select the final command.

PART-06: **Humidity Proposal Owner.** It combines RequestIntent, HumidityAssessment, and TreatmentReadiness to derive `HumidityProposal={None,InvalidHumidityObservation,DryerUnavailable,Dry}`. It alone decides whether automatic air care makes drying applicable; `Purge` never creates a humidity proposal.

PART-07: **Readiness Recovery Owner.** It owns `RecoveryMemory={Ready,FaultHeld,AwaitFresh}` and derives the published recovery gate from ReadinessContext and RequestIntent. It cannot select a treatment and cannot clear `AwaitFresh` without a fresh active intent from PART-01.

PART-08: **Air-Care Priority and Result Arbiter.** It is the sole final command owner. It combines RequestIntent, AirProposal, HumidityProposal, and the recovery gate; applies recovery, request, treatment-priority, and reporting precedence; and derives both CTRL-01 and CTRL-02 as one consistent result.

STATE-01: PART-01 solely owns RequestMemory, which initializes to `Released`. `Released` permits a valid active selection to be fresh, `AcceptedActive` identifies a continuously held valid active selection, and `RearmRequired` blocks active selections until a valid `Off` occurs.

STATE-02: PART-07 solely owns RecoveryMemory, which initializes to `Ready`. `FaultHeld` represents current or just-observed unknown readiness; `AwaitFresh` represents recovered readiness that is still unauthorized; `Ready` permits the arbiter to consider treatment proposals.

INIT-01: At initialization PART-01 shall hold `Released`, PART-07 shall hold and publish `Ready`, and PART-08 shall expose `AirTreatmentCommand=Off` with `StatusMode=Idle` and `StatusReason=None` before a boundary evaluation. Initialization support is not one of the twenty counted nontrivial cases.

OWNER-01: **Decision and qualification audit.** PART-05 and PART-06 are cooperating proposal owners with different applicability rules, PART-07 independently owns recovery qualification, and PART-08 solely owns command/status selection. No owner can reproduce another owner's mapping or bypass its published fact.

OWNER-02: **State audit.** Only PART-01 and PART-07 retain state. PART-02 through PART-06 and PART-08 are functions of current inputs and received owner facts and shall introduce no timer, counter, latch, prior-output dependency, or hidden state.

OWNER-03: **Anti-padding audit.** Every one of the eight usages derives a comparison, multi-input classification, applicability fact, state transition, or ordered result covered by CASE-RQ-01 through CASE-ARB-04. A router, copier, record constructor, enum renamer, boundary adapter, or behavior-free container receives no semantic-usage credit.

## Complete typed directed semantic interaction inventory

INT-01: CTX-01 provides `AirCareSelection` to PART-01. This is the only route for MON-01.

INT-02: CTX-01 provides `RequestValidity` to PART-01. This is the only route for MON-02 and remains separate so invalidity cannot masquerade as `Off`.

INT-03: CTX-02 provides `CabinAirQuality` to PART-02. This is the only route for MON-03.

INT-04: CTX-02 provides `AirQualityValidity` to PART-02. This is the only route for MON-04.

INT-05: CTX-03 provides `CabinHumidity` to PART-03. This is the only route for MON-05.

INT-06: CTX-03 provides `HumidityValidity` to PART-03. This is the only route for MON-06.

INT-07: CTX-04 provides `TreatmentEquipmentStatus` to PART-04. This is the only route for MON-07 and carries all three finite readiness fields atomically.

INT-08: PART-01 provides RequestIntent to PART-05 for explicit-Purge and automatic filtration applicability.

INT-09: PART-01 provides RequestIntent to PART-06 for automatic drying applicability and Purge exclusion.

INT-10: PART-01 provides RequestIntent to PART-07 for post-recovery fresh-request qualification.

INT-11: PART-01 provides RequestIntent to PART-08 for idle, invalid, re-arm, and active-result distinctions.

INT-12: PART-02 provides AirAssessment to PART-05 for filtration need, severity, and invalid-observation reasoning.

INT-13: PART-03 provides HumidityAssessment to PART-06 for drying need and invalid-observation reasoning.

INT-14: PART-04 provides TreatmentReadiness to PART-05 for filter-path applicability.

INT-15: PART-04 provides TreatmentReadiness to PART-06 for dryer-path applicability.

INT-16: PART-04 provides ReadinessContext to PART-07 for fault entry and recovery qualification.

INT-17: PART-05 provides AirProposal to PART-08 for filtration priority and air-path diagnostic reporting.

INT-18: PART-06 provides HumidityProposal to PART-08 for drying selection and humidity-path diagnostic reporting.

INT-19: PART-07 provides the current-evaluation recovery gate to PART-08 for fault-hold, await-fresh, or ready behavior.

INT-20: PART-08 provides AirTreatmentCommand to CTX-04. This is the only route for CTRL-01.

INT-21: PART-08 provides AirCareSupervisorStatus to CTX-01. This is the only route for CTRL-02.

## Ordered policy and complete contract partitions

POLICY-01: **Applicability order.** Recovery gating is evaluated before request applicability. When recovery is `Ready`, actionable filtration has service priority over actionable drying; this includes the explicit conflict where `Auto`, poor or elevated air, and damp humidity coexist.

POLICY-02: **Reporting order.** Recovery reasons outrank request reasons. For an active filtration command, `AirPriority` outranks a humidity diagnostic, which outranks `Filtering`. For an active drying command, an air diagnostic outranks `Drying`. For `Off`, air invalidity or unavailability outranks humidity invalidity or unavailability, which outranks `NoTreatmentNeeded`.

POLICY-03: **Logical evaluation semantics.** Each owner consumes one coherent current boundary snapshot and its own pre-evaluation state, publishes one derived fact and next state, and downstream owners consume those published current-evaluation facts. This is deterministic specification ordering, not a scheduler or response-time claim.

CASE-RQ-01: If RequestValidity is `Invalid`, PART-01 shall publish `BlockedInvalid` and set next RequestMemory to `RearmRequired`, regardless of selection or prior memory. Verification: local contract inspection and bounded enumeration. Pass: all nine selection/prior-memory combinations produce exactly this result.

CASE-RQ-02: If RequestValidity is `Valid` and selection is `Off`, PART-01 shall publish `None` and set next RequestMemory to `Released`, regardless of prior memory. Verification: local contract inspection and bounded enumeration. Pass: all three prior-memory values re-arm identically.

CASE-RQ-03: If the request is valid and active (`Auto` or `Purge`) while prior memory is `Released`, PART-01 shall publish the matching `FreshAuto` or `FreshPurge` and set next memory to `AcceptedActive`. Verification: local contract inspection and witnesses. Pass: both selections retain identity while gaining freshness.

CASE-RQ-04: If the request is valid and active while prior memory is `AcceptedActive`, PART-01 shall publish the matching held intent and keep `AcceptedActive`. Verification: local contract inspection and witnesses. Pass: both continuously asserted selections are held, never fresh.

CASE-RQ-05: If the request is valid and active while prior memory is `RearmRequired`, PART-01 shall publish `BlockedRearm` and keep `RearmRequired`. Verification: local contract inspection and witnesses. Pass: neither active selection bypasses a required valid `Off`.

CASE-AIR-01: PART-02 shall map invalid validity to `Unknown`; otherwise it shall map `Clean` to `Clear`, `Elevated` to `FilterNormalNeeded`, and `Poor` to `FilterIntensiveNeeded`. Verification: local contract inspection and exhaustive enumeration. Pass: all six boundary combinations map exactly once and validity dominates category.

CASE-HUM-01: PART-03 shall map invalid validity to `Unknown`; otherwise it shall map `Damp` to `DryingNeeded` and both `Dry` and `Comfortable` to `NoExcessHumidity`. Verification: local contract inspection and exhaustive enumeration. Pass: all six boundary combinations map exactly once and no humidification demand is invented.

CASE-EQP-01: If MON-07 StatusValidity is `Invalid`, PART-04 shall publish `TreatmentReadiness=Unknown` and `ReadinessContext=CriticalUnknown` regardless of both path fields. Verification: local contract inspection and exhaustive enumeration. Pass: all four path combinations fail closed.

CASE-EQP-02: If MON-07 StatusValidity is `Valid`, PART-04 shall publish `Clear` and classify the two path fields as exactly one of `NeitherReady`, `FilterOnly`, `DryerOnly`, or `BothReady`. Verification: local contract inspection and exhaustive enumeration. Pass: the four path combinations are bijective only as a two-input cross-product classification and none is omitted.

CASE-AIR-02: PART-05 shall apply one total proposal partition: a nonactionable request gives `None`; actionable `Purge` proposes `FilterIntensive` when filter-ready and `FilterUnavailable` otherwise; actionable `Auto` maps `Unknown` to `InvalidAirObservation`, `Clear` to `None`, and each filter need to the matching filter proposal when filter-ready or `FilterUnavailable` otherwise. Verification: local contract inspection and exhaustive factorized enumeration. Pass: every RequestIntent, AirAssessment, and readiness class yields exactly one AirProposal and Purge never depends on the air observation.

CASE-HUM-02: PART-06 shall apply one total proposal partition: a nonactionable request or actionable `Purge` gives `None`; actionable `Auto` maps `Unknown` to `InvalidHumidityObservation`, `NoExcessHumidity` to `None`, and `DryingNeeded` to `Dry` when dryer-ready or `DryerUnavailable` otherwise. Verification: local contract inspection and exhaustive factorized enumeration. Pass: every RequestIntent, HumidityAssessment, and readiness class yields exactly one HumidityProposal and Purge never requests drying.

CASE-REC-01: If ReadinessContext is `CriticalUnknown`, PART-07 shall publish and retain `FaultHeld` from every prior RecoveryMemory and for every RequestIntent. Verification: local state-contract inspection and exhaustive enumeration. Pass: current unknown readiness dominates every prior state and request.

CASE-REC-02: If readiness is `Clear` and prior RecoveryMemory is `FaultHeld`, PART-07 shall publish and set `AwaitFresh` regardless of RequestIntent. Verification: local state-contract inspection and exhaustive enumeration. Pass: equipment recovery cannot immediately replay a prior active preference.

CASE-REC-03: If readiness is `Clear`, prior recovery is `AwaitFresh`, and RequestIntent is `FreshAuto` or `FreshPurge`, PART-07 shall publish and set `Ready`. Verification: local state-contract inspection and witnesses. Pass: exactly the two fresh active intents clear the recovery authorization hold.

CASE-REC-04: If readiness is `Clear`, prior recovery is `AwaitFresh`, and RequestIntent is not fresh, PART-07 shall publish and retain `AwaitFresh`. Verification: local state-contract inspection and enumeration. Pass: `None`, held, invalid, and re-arm-blocked intents cannot clear the hold.

CASE-REC-05: If readiness is `Clear` and prior RecoveryMemory is `Ready`, PART-07 shall publish and retain `Ready` for every RequestIntent. Verification: local state-contract inspection and enumeration. Pass: request errors do not fabricate an equipment-recovery fault.

CASE-ARB-01: If the published recovery gate is `FaultHeld` or `AwaitFresh`, PART-08 shall emit `Off`; status shall be `Recovery/ReadinessInvalid` for `FaultHeld` and `Recovery/AwaitFresh` for `AwaitFresh`, regardless of request or proposals. Verification: end-to-end contract analysis. Pass: both gates dominate every proposal cross-product and output no active command.

CASE-ARB-02: If recovery is `Ready` and RequestIntent is nonactionable, PART-08 shall emit `Off`; `None` maps to `Idle/None`, `BlockedInvalid` to `Attention/RequestInvalid`, and `BlockedRearm` to `Attention/RearmRequired`. Verification: end-to-end contract analysis. Pass: all nonactionable intents have one distinct consistent result and no proposal can override them.

CASE-ARB-03: If recovery is `Ready`, the request is actionable, and AirProposal is `FilterNormal` or `FilterIntensive`, PART-08 shall emit the matching filter command. Status is `Active/AirPriority` when HumidityProposal is `Dry`; otherwise a humidity invalid or unavailable reason is retained before defaulting to `Active/Filtering`. Verification: end-to-end enumeration and conflict witnesses. Pass: every humidity proposal preserves the filter command, simultaneous `Dry` is explicitly defeated, and exactly one status is emitted.

CASE-ARB-04: If recovery is `Ready`, the request is actionable, and AirProposal is not actionable, PART-08 shall emit `Dry` when HumidityProposal is `Dry` and otherwise `Off`. With `Dry`, an air invalid or unavailable reason precedes `Drying`; with `Off`, reporting precedence is `AirObservationInvalid`, `FilterUnavailable`, `HumidityObservationInvalid`, `DryerUnavailable`, then `NoTreatmentNeeded`. Verification: exhaustive end-to-end enumeration. Pass: every residual AirProposal/HumidityProposal pair yields exactly one command and status, and no invalid or unavailable cause is silently treated as success.

## Required behavior, risks, and fault response

BEH-01: Under a valid actionable automatic request, valid elevated or poor air, and a ready filter path, the system shall command the matching normal or intensive filtration. Verification: trace and contract inspection plus SCN-FIL-01. Pass: both severity variants reach CTRL-01 without central recomputation of AirAssessment or AirProposal.

BEH-02: Under a valid actionable automatic request, valid damp humidity, no actionable filtration proposal, and a ready drying path, the system shall command `Dry`. Verification: trace and contract inspection plus SCN-DRY-01. Pass: CTRL-01 is `Dry` and status explains any higher-priority air diagnostic.

BEH-03: When actionable filtration and drying coexist, the system shall select filtration and report `AirPriority`. Verification: CASE-ARB-03 analysis plus SCN-PRI-01. Pass: neither `Dry` nor a combined command is emitted for any normal/intensive filtration conflict.

BEH-04: A valid actionable request with no qualified treatment need shall emit `Off` and `Active/NoTreatmentNeeded`; a valid `Off` request shall emit `Off` and `Idle/None`. Verification: CASE-ARB-02 and CASE-ARB-04 analysis plus SCN-NOM-01. Pass: active-no-need and user-off remain observably distinct.

RISK-01: If unknown treatment readiness were interpreted using stale path fields, the supervisor could issue a command whose required path is unavailable or untrusted; physical severity and likelihood are unspecified.

FAULT-01: On invalid readiness status the system shall issue `Off`, report `Recovery/ReadinessInvalid`, enter `FaultHeld`, and require the ordered recovery in CASE-REC-02 through CASE-REC-04. Verification: state-contract and multi-evaluation bounded analysis plus SCN-REC-01. Pass: no active command occurs from fault entry through the last nonfresh recovery step.

RISK-02: If an invalid or continuously held active preference were treated as fresh after a request error or readiness recovery, an old user preference could replay without re-arming; physical severity and likelihood are unspecified.

FAULT-02: Invalid request validity shall force `BlockedInvalid` and `RearmRequired`; only a valid `Off` followed by a valid active selection shall create a new fresh intent. Verification: request-state enumeration and SCN-REC-01. Pass: held or re-arm-blocked active inputs never clear `AwaitFresh` or cause an active command.

## Bounded scenario families

SCN-NOM-01: **No treatment needed.** From initialized state, apply valid `Auto`, valid `Clean`, valid `Comfortable`, and valid `BothReady`. The first evaluation is fresh and shall produce `Off` with `Active/NoTreatmentNeeded`; holding the same inputs shall preserve that output with a held request. Pass: command and status remain stable and no state other than request freshness changes.

SCN-FIL-01: **Automatic filtration severity.** With valid `Auto`, valid equipment with a ready filter, and no humidity demand, exercise `Elevated` then `Poor` air as separate members. Pass: commands are respectively `FilterNormal` and `FilterIntensive`, with `Active/Filtering`.

SCN-PUR-01: **Explicit intensive-filtration preference.** With valid `Purge`, valid `Clean` air, and a ready filter, exercise both fresh and held request evaluations. Pass: both command `FilterIntensive`; the scenario proves that Purge applicability is owned by PART-05 rather than fabricated as an air observation.

SCN-DRY-01: **Humidity-only treatment.** With valid `Auto`, valid `Clean` air, valid `Damp` humidity, and a ready dryer, exercise filter ready and unavailable as members. Pass: both command `Dry`; unavailable unused filtration does not prevent the applicable treatment.

SCN-PRI-01: **Explicit service-priority conflict.** With valid actionable `Auto`, valid `Damp` humidity, both paths ready, and air respectively `Elevated` and `Poor`, exercise both conflict members. Pass: commands are respectively `FilterNormal` and `FilterIntensive`, and status is `Active/AirPriority` for both.

SCN-DEG-01: **Independent degradation and diagnostic continuity.** Under valid actionable `Auto` and valid equipment status, exercise: invalid air with damp humidity; poor air with invalid humidity; filter unavailable with damp humidity; and dryer unavailable with poor air. Pass: the still-applicable other treatment continues, while status reports the invalid or unavailable defeated branch according to POLICY-02.

SCN-REC-01: **Fault, release, and fresh-request recovery.** Start with an active filtering command; make readiness validity invalid; restore valid readiness while the selection remains active; hold active again; apply valid `Off`; then apply valid `Auto` with elevated air. Pass: outputs progress to command `Off` with status `Recovery/ReadinessInvalid`, remain command `Off` with status `Recovery/AwaitFresh` through restored-held and valid-Off steps, and return to command `FilterNormal` with status `Active/Filtering` only on the final fresh Auto evaluation.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for supplying one coherent selection/validity pair per logical evaluation. The selected valid `Off` then active sequence is a pilot re-arm protocol, not a source-grounded interface requirement. Rationale: it makes stale-request rejection finite and observable without adding a clock or acknowledgment input.

ASM-02: CTX-02 and CTX-03 are responsible for the asserted validity and freshness of their classifications. Rationale: the system has no raw measurements, redundant observations, or age value with which to verify them.

ASM-03: CTX-04 is responsible for the atomic consistency of MON-07 and for not claiming `Valid` when either path field is stale or unknown. Rationale: `StatusValidity=Invalid` is the only critical readiness fault modeled.

ASM-04: `Clean`, `Elevated`, `Poor`, `Dry`, `Comfortable`, and `Damp` are ordered labels only where CASE-AIR-01 and CASE-HUM-01 say so. They have no units, numerical thresholds, medical meaning, comfort guarantee, or universal automotive interpretation.

ASM-05: Filtration outranks drying when both proposals are actionable, while observation invalidity and a single path unavailability remain local degradation unless MON-07 validity is invalid. Rationale: this is the selected finite policy needed to resolve one explicit conflict; the seed provides no priority or fault classification.

ASM-06: One logical evaluation sees a coherent snapshot and same-evaluation derived facts in the order of POLICY-03. Rationale: this closes contract semantics while deliberately making no period, latency, scheduling, or execution claim.

CONSTR-01: The Model Agent shall represent exactly one root System usage and one behavior-free generated-support Process containing exactly eight credited semantic Thread usages corresponding to PART-01 through PART-08. The selected physical containment depth below the root is exactly two; the Process receives no semantic credit.

CONSTR-02: All eight semantic usages and all 21 semantic interactions shall lie in one weakly connected semantic region. Attribute/type declarations, root and Process boundary ports, and boundary delegations are generated support, not extra semantic usages or interactions.

CONSTR-03: With seven root inputs and two root outputs mapped through root-to-Process and Process-to-Thread delegation, plus twelve internal Thread-to-Thread exchanges, the expected raw directed port-connection declaration count is exactly 30. The 18 boundary delegation declarations receive no semantic-interaction credit; INT-01 through INT-21 remain the complete semantic inventory.

CONSTR-04: Canonical local contracts shall expose RequestIntent, AirAssessment, HumidityAssessment, TreatmentReadiness and ReadinessContext, AirProposal, HumidityProposal, and the recovery gate at their owning usages. A central analyzer may check but shall not replace or centrally recompute ownership in the retained architecture.

## Count, partition, trace, and acceptance audit

COUNT-01: **Semantic usages.** Exactly eight usages are credited, within `8..12`: two state/qualification owners, two observation qualification owners, one readiness qualification owner, two cooperating proposal owners, and one final arbiter. Each has an owner-local fact and case witness; none exists to pad the tier.

COUNT-02: **Semantic interactions.** Exactly 21 typed directed interactions are listed, within `15..21`: seven boundary inputs, twelve inter-usage exchanges, and two boundary outputs. Recount after the retained policy revision found no duplicate, implicit, or unused interaction.

COUNT-03: **Nontrivial contract cases.** Exactly 20 cases are listed, within `12..20`: five request-lifecycle cases, one air mapping, one humidity mapping, two readiness mappings, one complete filtration proposal partition, one complete humidity proposal partition, five recovery cases, and four final-arbitration cases.

COUNT-04: **Scenario families.** Exactly seven families are listed, within `6..9`: no-need nominal, filtration severity, explicit Purge, humidity-only treatment, service conflict, independent degradation, and ordered fault/fresh-request recovery. Parameterized members share a behavioral trace and are not counted as extra families.

AUDIT-01: **Finite closure.** CASE-RQ-01 through CASE-RQ-05 partition every RequestValidity/selection/prior-memory combination; CASE-AIR-01, CASE-HUM-01, CASE-EQP-01 through CASE-EQP-02, CASE-AIR-02, and CASE-HUM-02 are total over their owner inputs; CASE-REC-01 through CASE-REC-05 partition every readiness/prior-recovery/request combination; CASE-ARB-01 through CASE-ARB-04 partition every recovery/request/proposal combination.

AUDIT-02: **Priority and recovery closure.** The conflict winner, diagnostic precedence, current fault entry, recovered-but-held state, valid release, fresh active reauthorization, invalid request, held request, and no-treatment residual are all explicit. No previous command survives by default and no `else` branch carries an unconstrained output.

AUDIT-03: **Trace acceptance.** Pass only if every abstract identifier is covered by one or more source elements, explicitly informational, or explicitly deferred; every significant source element traces back or has an allowed `@generated-support` reason; and no PART, INT, CASE, state, command, or scenario is missing from the reports.

AUDIT-04: **Mechanical acceptance.** Pass only if architecture-stage and final Sireum typechecking succeed; every endpoint resolves with compatible direction/type; the bounded analyzer covers all twenty cases and seven scenario families with retained witnesses; exact usage, interaction, raw-connection, root, depth, and connected-region counts hold; and exactly one `system-overview` view passes the run-policy visualization gates.

AUDIT-05: **Validation acceptance.** Mechanical success is insufficient. Final Designer review must separately find that the model remains an air-care preference and condition supervisor, preserves the boundary and two independent treatment proposals, enforces filtration-over-drying and fresh-request recovery, and makes no deferred physical, safety, energy, thermal, defrost, or production claim.

QUESTION-01: **Resolved by Model review.** The approved generation basis permits MON-07 and CTRL-02 as finite flat records with inspectable attribute-declared fields while retaining exactly 30 raw directed connections and all eight local ownership boundaries. Final evidence shall still independently typecheck and inspect the generated declarations.

QUESTION-02: **Resolved by Model review.** Local GUMBO state, initialization, compute-case, and pre-state forms may express the two owner-local state relations, while the deterministic bounded analyzer shall exercise the complete six-step SCN-REC-01 witness compositionally. This authorization neither merges PART-01 with PART-07 nor creates an executable scheduling claim.
