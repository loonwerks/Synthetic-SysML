---
abstract_id: SA-HVAC-ENERGY-01
run_id: 20260813T234357Z-hvac-supervisor-medium-r1-a1
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
campaign_complexity: medium
semantic_usage_bounds: [8, 12]
selected_semantic_usage_count: 8
semantic_interaction_bounds: [15, 21]
selected_semantic_interaction_count: 21
nontrivial_contract_case_bounds: [12, 20]
selected_nontrivial_contract_case_count: 20
scenario_family_bounds: [6, 9]
selected_scenario_family_count: 8
semantic_containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
status: approved
---

# Energy- and Interface-Aware Cabin Climate Supervisor

## Evidence and claim classes

EVID-HB-01: The handbook-derived rules require an implementation-independent purpose and boundary, cohesive responsibility allocation, explicit assumptions, nominal and off-nominal behavior, alternatives, traceability, and objective verification criteria. They govern this specification process; they are not facts about automotive HVAC behavior.

EVID-SEED-01: The frozen seed establishes an automotive cabin context, user temperature and fan preferences, observed temperature, defrost vocabulary, an electrical interface and power-consumption concern, possible engine waste heat, and selected climate outcomes. It does not establish architecture, finite types, command authority, priority, faults, recovery, timing, or physical performance.

EVID-PILOT-01: The finite value sets, single-step evaluation semantics, validity values, fresh-request event, state machine, priority order, command meanings, and bounded analyzer obligations below are pilot abstractions selected for this run. They are assumptions to be modeled and checked, not source-grounded automotive facts.

EVID-DESIGN-01: PART-01 through PART-08, INT-01 through INT-21, CASE-01 through CASE-20, and SCN-01 through SCN-08 define the selected architecture and behavior. These clauses are the tier-specific specification that the Model Agent shall realize.

EVID-DEFER-01: Physical comfort, actual temperature convergence, glazing clearance, exact response time or energy use, thermodynamics, long-horizon reliability, acoustics, automotive safety, regulatory compliance, certification, production readiness, code generation, execution, and formal proof are explicitly deferred and shall not be reported as passed.

## Need, purpose, scope, and goals

NEED-01: A vehicle climate plant may receive simultaneous comfort and defrost demands while its electrical interface or available energy is limited or unavailable. A bounded supervisor is needed to choose a coherent service request, suppress unsafe replay after loss of service authority, and explain its disposition to the user interface.

PURPOSE-01: The system shall supervise one cabin zone by qualifying comfort, visibility, and energy context; arbitrating defrost against comfort; allocating a qualitative resource grant; issuing one coordinated plant-command tuple; and reporting one supervisory status.

SCOPE-01: The selected primary scope is the seed's energy- and interface-aware HVAC supervisor. Temperature regulation and defrost are included only as supervised service requests. Air-quality, humidity, pollutant filtration, multi-zone coordination, sensing implementations, power conversion, plant actuation, and physical outcome evaluation are outside the system boundary.

GOAL-01: The supervisor shall never request heating and cooling simultaneously and shall emit exactly one complete command tuple on every evaluation.

GOAL-02: The supervisor shall resolve the explicit conflict `qualified defrost demand > qualified comfort demand` whenever service is authorized.

GOAL-03: Invalid or unavailable decision context shall produce a quiescent plant command, and a prior command shall not resume after energy recovery until a fresh user request is observed.

GOAL-04: Full, reduced, denied, inhibited, and invalid dispositions shall be distinguishable in the public supervisory status without claiming that a requested physical outcome occurred.

## Operational context and system boundary

CTX-01: The vehicle user and dashboard or central-console interface are external. They provide the current regulation selection, defrost selection, fan preference, and a fresh-request event and receive the supervisory status.

CTX-02: The cabin and glazing observation service is external. It provides qualitative cabin-temperature relation and glazing condition; this abstract does not prescribe sensors or estimation algorithms.

CTX-03: The vehicle electrical and energy context is external. It provides electrical-interface state, qualitative power envelope, and engine-heat availability; it remains responsible for the truth of those observations.

CTX-04: The HVAC plant is external. It receives a coordinated thermal-service, air-path, and blower command tuple; physical actuation and environmental effects remain outside the modeled system.

BOUND-01: The complete monitored boundary is MON-01 through MON-07, and the complete controlled boundary is CTRL-01 through CTRL-02. No unlisted sensor, clock, acknowledgment, plant feedback, prior output, or hidden command authority may influence required behavior.

## Exact finite monitored quantities

MON-01: `ClimateRequest = {Off, Regulate}` is supplied by CTX-01. `Regulate` means the external interface has an active temperature setting; the numeric setting itself is not represented.

MON-02: `ThermalRelation = {Below, Within, Above, Unknown}` is supplied by CTX-02 and classifies observed cabin temperature relative to the active setting. `Unknown` is an explicit invalidity value.

MON-03: `DefrostRequest = {Off, On}` is supplied by CTX-01 and denotes the user's current request, not proof of glazing condition or clearance.

MON-04: `GlazingCondition = {Clear, Obscured, Unknown}` is supplied by CTX-02. `Unknown` is an explicit invalidity value; `Obscured` is only a pilot trigger for a defrost service request, not a safety or physical-performance claim.

MON-05: `EnergyContext` is supplied by CTX-03 and has exactly three fields: `ElectricalState = {Ready, Constrained, Unavailable, Unknown}`, `PowerEnvelope = {Normal, Reduced, None, Unknown}`, and `EngineHeat = {Available, Unavailable, Unknown}`.

MON-06: `FreshRequest = {Absent, Present}` is supplied by CTX-01. `Present` is a one-evaluation event asserting that the current climate and fan values came from a user submission not previously consumed; it is not a level that may remain asserted.

MON-07: `FanPreference = {Auto, Low, High, Unknown}` is supplied by CTX-01. `Unknown` is invalid only when an active command would otherwise be issued; it cannot prevent an already-required quiescent command.

## Exact finite controlled quantities

CTRL-01: `PlantCommand` is delivered to CTX-04 as one atomic tuple with `ThermalService = {Off, Heat, Cool}`, `AirPath = {Off, Cabin, Glazing}`, and `Blower = {Off, Low, High}`. The tuple requests plant behavior; it does not assert physical delivery or effect.

CTRL-02: `SupervisorStatus = {Inactive, Holding, HeatingRequested, CoolingRequested, DefrostRequested, Limited, Inhibited, InputFault}` is delivered to CTX-01. The value reports supervisory intent or limitation and never reports comfort, temperature convergence, or glazing clearance as achieved.

## Essential pilot assumptions

ASM-01: CTX-01, CTX-02, and CTX-03 provide one simultaneous observation snapshot per logical evaluation. The logical ordering is a bounded-analysis convention and makes no physical timing, latency, or scheduling claim.

ASM-02: CTX-02 is responsible for mapping the user setting and cabin observation to MON-02 and for mapping glazing observation to MON-04. The supervisor does not reconstruct either classification.

ASM-03: CTX-03 is responsible for the consistency and freshness of all fields in MON-05. `Unknown` is used whenever a required field cannot be trusted.

ASM-04: CTX-01 is responsible for asserting MON-06 only once per genuine submission and for presenting the associated current climate and fan values in the same snapshot. A fresh event consumed while energy is invalid or unavailable does not remain pending.

ASM-05: CTX-04 accepts the complete CTRL-01 tuple atomically and treats the all-`Off` tuple as quiescent. No assumption is made that a nonquiescent tuple attains a physical temperature or glazing outcome.

ASM-06: The supervisor initializes in `Inhibited`. Initial activation therefore requires usable energy context and MON-06=`Present`; this is a selected stale-command prevention policy, not a source fact.

ASM-07: The qualitative priority and resource rules below are experiment policy. No unsupported severity, likelihood, energy amount, safety classification, or real-world optimality is attached to them.

## Selected semantic usages and responsibility owners

PART-01: **Comfort Demand Qualifier** owns `ComfortDemand = {None, Hold, Heat, Cool, Invalid}` and derives it only from MON-01 and MON-02. Its output is a new domain fact, not a forwarded input.

PART-02: **Visibility Demand Qualifier** owns `VisibilityDemand = {None, Required, Invalid}` and derives it only from MON-03 and MON-04. It combines user intent and observed glazing condition.

PART-03: **Energy Capability Qualifier** owns `EnergyCapability = {Full, ReducedHeat, ReducedElectric, None, Invalid}` and derives it from all three MON-05 fields.

PART-04: **Recovery Authority** is the sole persistent-state owner. It owns `RecoveryState = {Armed, Inhibited}` and derives `RecoveryDecision = {Permit, BlockEnergyInvalid, BlockEnergyUnavailable, BlockAwaitFresh, PermitRecovered}` from previous state, PART-03 capability, and MON-06.

PART-05: **Service Priority Arbiter** owns `ServiceSelection`, comprising `Service = {Off, Heat, Cool, Defrost}` and a selection reason. It combines the two qualified demands with PART-04 authority and is the principal functional decision owner.

PART-06: **Resource Allocation Decision** owns `ResourceGrant = {Off, FullThermal, EconomyHeat, VentOnly, Denied}` and combines PART-05 selection with PART-03 capability. It is a cooperating decision owner that may downgrade or deny a selected service without changing priority ownership.

PART-07: **Actuation Command Coordinator** owns CTRL-01 and `ActuationDisposition = {Quiescent, Active, LimitedActive, Denied, InputFault, Inconsistent}`. It combines PART-05 selection, PART-06 grant, and MON-07 and prevents contradictory command fields.

PART-08: **Supervisory Status Composer** owns CTRL-02 and derives it from PART-04 recovery decision, PART-05 selection, PART-06 grant, and PART-07 disposition. It does not receive raw boundary inputs and cannot recompute an upstream decision.

## Owner-local qualification and composition rules

QUAL-01: PART-01 shall derive `None` when MON-01=`Off`; otherwise it shall derive `Invalid`, `Heat`, `Hold`, or `Cool` when MON-02 is respectively `Unknown`, `Below`, `Within`, or `Above`. This relation is total and mutually exclusive over its finite inputs.

QUAL-02: PART-02 shall derive `Invalid` when MON-04=`Unknown`; otherwise it shall derive `Required` when MON-03=`On` or MON-04=`Obscured`, and `None` only when MON-03=`Off` and MON-04=`Clear`. This relation is total and mutually exclusive.

QUAL-03: PART-03 shall derive `Invalid` if any MON-05 field is `Unknown`; else `None` if electrical state is `Unavailable` or power envelope is `None`; else `Full` if electrical state is `Ready` and power envelope is `Normal`; otherwise `ReducedHeat` when engine heat is `Available` and `ReducedElectric` when it is `Unavailable`. This ordered relation is total over all 48 energy-context values.

STAT-01: PART-08 shall apply this total status precedence: PART-07 `InputFault` or `Inconsistent`, PART-05 invalid-demand reason, or PART-04 `BlockEnergyInvalid` yields `InputFault`; any other PART-04 block yields `Inhibited`; PART-05 user-off yields `Inactive`; hold yields `Holding`; a denied or reduced grant yields `Limited`; otherwise active Heat, Cool, or Defrost yields `HeatingRequested`, `CoolingRequested`, or `DefrostRequested` respectively.

OWN-RULE-01: QUAL-01 through QUAL-03 and STAT-01 are mandatory owner-local derivations but are not counted again as CASE items. No downstream owner may receive the raw inputs needed to duplicate them, and forwarding, type renaming, initialization, and invariants receive no semantic-usage or contract-case credit.

## Exact typed directed semantic interaction inventory

INT-01: CTX-01 provides MON-01 `ClimateRequest` to PART-01.

INT-02: CTX-02 provides MON-02 `ThermalRelation` to PART-01.

INT-03: CTX-01 provides MON-03 `DefrostRequest` to PART-02.

INT-04: CTX-02 provides MON-04 `GlazingCondition` to PART-02.

INT-05: CTX-03 provides the composite MON-05 `EnergyContext` to PART-03 as one stable domain interaction; its three fields do not count as separate semantic interactions.

INT-06: CTX-01 provides MON-06 `FreshRequest` to PART-04.

INT-07: CTX-01 provides MON-07 `FanPreference` to PART-07.

INT-08: PART-01 provides `ComfortDemand` to PART-05.

INT-09: PART-02 provides `VisibilityDemand` to PART-05.

INT-10: PART-03 provides `EnergyCapability` to PART-04.

INT-11: PART-04 provides `RecoveryDecision` to PART-05.

INT-12: PART-05 provides `ServiceSelection` to PART-06.

INT-13: PART-03 provides `EnergyCapability` to PART-06.

INT-14: PART-06 provides `ResourceGrant` to PART-07.

INT-15: PART-05 provides `ServiceSelection` to PART-07.

INT-16: PART-07 provides `ActuationDisposition` to PART-08.

INT-17: PART-05 provides `ServiceSelection` to PART-08.

INT-18: PART-06 provides `ResourceGrant` to PART-08.

INT-19: PART-04 provides `RecoveryDecision` to PART-08.

INT-20: PART-07 provides CTRL-01 `PlantCommand` to CTX-04.

INT-21: PART-08 provides CTRL-02 `SupervisorStatus` to CTX-01.

INT-AUD-01: The complete inventory is exactly 21 interactions: seven boundary-input deliveries, twelve inter-usage exchanges, and two boundary-output deliveries. Repeated facts have distinct decision or reporting consumers; routing hops, container delegation, fields, local state feedback, and visualization context edges do not add semantic interactions.

## State, priority, and recovery policy

STATE-01: PART-04 shall initialize `RecoveryState=Inhibited`. It shall enter or remain `Inhibited` whenever capability is `Invalid` or `None`, remain `Inhibited` after capability becomes usable while MON-06=`Absent`, enter `Armed` only when usable capability and MON-06=`Present` coincide, and remain `Armed` while capability stays usable.

PRIORITY-01: PART-05 shall apply the explicit order `recovery block > invalid qualified demand > Required defrost > Heat or Cool comfort > Hold or None`. Thus simultaneous Required defrost and Heat or Cool comfort is resolved in favor of Defrost, while an energy/recovery block overrides both.

RECOVERY-01: A fresh event observed during `Invalid` or `None` energy capability is consumed without arming. After capability becomes usable, a later MON-06=`Present` is required; neither the last pre-fault selection nor an earlier fresh event may be replayed.

COMMAND-01: The canonical quiescent command is `(Off, Off, Off)`. A `FullThermal` Heat or Cool grant requests that thermal service, `Cabin`, and a known requested blower, with `Auto` mapped to `Low`; `EconomyHeat` requests Heat with `Cabin` and `Low`. Defrost with `FullThermal` requests Heat and `Glazing`, with blower `High` for Auto, `Low` for Low, and `High` for High; `EconomyHeat` requests `(Heat, Glazing, Low)`; and `VentOnly` requests `(Off, Glazing, Low)`. No other tuple is permitted.

## Exactly twenty nontrivial contract cases

CASE-01: **Recovery invalid.** For either previous state, `EnergyCapability=Invalid` yields next `Inhibited` and `BlockEnergyInvalid`; MON-06 cannot override it.

CASE-02: **Recovery unavailable.** For either previous state, `EnergyCapability=None` yields next `Inhibited` and `BlockEnergyUnavailable`; MON-06 cannot override it.

CASE-03: **Usable but stale.** Previous `Inhibited`, usable capability, and MON-06=`Absent` yield next `Inhibited` and `BlockAwaitFresh`.

CASE-04: **Fresh recovery.** Previous `Inhibited`, usable capability, and MON-06=`Present` yield next `Armed` and `PermitRecovered` for the current qualified request.

CASE-05: **Remain armed.** Previous `Armed` and usable capability yield next `Armed` and `Permit`; MON-06 does not change the decision.

CASE-06: **Authority block.** Any PART-04 blocking decision yields `Service=Off` with the matching recovery reason, irrespective of qualified demand.

CASE-07: **Qualified-input fault.** With authority permitted, `ComfortDemand=Invalid` or `VisibilityDemand=Invalid` yields `Service=Off` with invalid-demand reason.

CASE-08: **Explicit priority conflict.** With authority permitted and both demands valid, `VisibilityDemand=Required` yields `Service=Defrost` even when comfort simultaneously requests Heat or Cool.

CASE-09: **Comfort heating.** With authority permitted, valid `VisibilityDemand=None`, and `ComfortDemand=Heat`, the selection is Heat.

CASE-10: **Comfort cooling.** With authority permitted, valid `VisibilityDemand=None`, and `ComfortDemand=Cool`, the selection is Cool.

CASE-11: **Temperature hold.** With authority permitted, `VisibilityDemand=None`, and `ComfortDemand=Hold`, the selection is Off with hold reason.

CASE-12: **User regulation off.** With authority permitted, `VisibilityDemand=None`, and `ComfortDemand=None`, the selection is Off with user-off reason.

CASE-13: **Quiescent allocation.** `Service=Off` yields `ResourceGrant=Off` for every capability value.

CASE-14: **Defrost allocation.** Defrost maps capability `Full`, `ReducedHeat`, and `ReducedElectric` to `FullThermal`, `EconomyHeat`, and `VentOnly`; capability `None` or `Invalid` maps to `Off` as a fail-closed inconsistent upstream combination.

CASE-15: **Heating allocation.** Heat maps `Full` to `FullThermal`, `ReducedHeat` to `EconomyHeat`, `ReducedElectric` to `Denied`, and `None` or `Invalid` to `Off`.

CASE-16: **Cooling allocation.** Cool maps `Full` to `FullThermal`, either reduced capability to `Denied`, and `None` or `Invalid` to `Off`.

CASE-17: **Quiescent, denied, or inconsistent actuation.** Off selection, `Off` or `Denied` grant, or a service/grant combination not allowed by CASE-13 through CASE-16 yields CTRL-01=`(Off, Off, Off)` and the corresponding quiescent, denied, or inconsistent disposition.

CASE-18: **Active fan-input fault.** A non-Off service with a compatible active grant and MON-07=`Unknown` yields CTRL-01=`(Off, Off, Off)` and `ActuationDisposition=InputFault`.

CASE-19: **Active cabin thermal command.** Heat or Cool with a compatible active grant and known fan preference yields the unique cabin command prescribed by COMMAND-01 and an `Active` or `LimitedActive` disposition.

CASE-20: **Active defrost command.** Defrost with a compatible active grant and known fan preference yields the unique glazing command prescribed by COMMAND-01 and an `Active` or `LimitedActive` disposition.

CASE-AUD-01: CASE-01 through CASE-05 are a total, mutually exclusive recovery-state partition; CASE-06 through CASE-12 are a total, mutually exclusive priority partition; CASE-13 through CASE-16 are a total allocation partition; and CASE-17 through CASE-20 are a total command partition. They are exactly twenty counted nontrivial cases. Qualification equations, status composition, initialization, type invariants, and scenario witnesses are required but do not add counted cases.

## Required nominal and off-nominal behavior

BEH-01: With usable full capability, an armed or freshly recovered state, no defrost demand, valid inputs, and comfort Heat or Cool, the supervisor shall issue the corresponding noncontradictory cabin command and requested status. Verification: bounded contract analysis shall find no counterexample across all matching snapshots.

BEH-02: With service permitted and simultaneous Required defrost and Heat or Cool comfort, the supervisor shall select Defrost. Verification: enumeration shall cover all conflict combinations and report zero comfort-over-defrost results.

BEH-03: Reduced capability shall preserve only the grants in CASE-14 through CASE-16; it shall never be silently treated as Full. Verification: owner-local contract inspection and enumeration shall find an exact match to the allocation relation.

BEH-04: Every evaluation shall produce exactly one CTRL-01 tuple and one CTRL-02 value, with never both Heat and Cool and with all denied, blocked, invalid, or inconsistent paths quiescent. Verification: complete finite enumeration shall report zero missing, multiple, contradictory, or nonquiescent blocked outputs.

BEH-05: User Off with valid visibility None shall remain quiescent regardless of MON-02 and MON-07. Verification: enumeration shall show CASE-12 and CASE-17 for all such values without treating irrelevant thermal or fan values as an active-command fault.

## Risks, fault behavior, and recovery

RISK-01: Loss of usable energy authority after an active request could otherwise allow a prior heating, cooling, or defrost command to resume automatically when energy returns, producing an unrequested plant action. No likelihood or safety severity is asserted.

FAULT-01: On `EnergyCapability=None` or `Invalid`, the supervisor shall command quiescence, enter `Inhibited`, and require a later usable snapshot with a new MON-06=`Present` before any active service. Verification: multi-step analysis shall show immediate quiescence, no stale replay, and activation only on the later fresh event.

RISK-02: Invalid comfort, glazing, energy, or active fan context could otherwise lead inconsistent owners to issue contradictory or unjustified commands. No likelihood or safety severity is asserted.

FAULT-02: Invalid decision context or an inconsistent owner combination shall produce CTRL-01=`(Off, Off, Off)` and `SupervisorStatus=InputFault`; an invalid fan preference is ignored only when the command is already quiescent. Verification: finite analysis shall exercise every invalid source and find no nonquiescent output.

## Exactly eight scenario families

SCN-01: **Initial activation.** From initialized `Inhibited`, usable Full energy with MON-06=`Absent` remains blocked; a subsequent fresh Regulate request with Below relation and no defrost arms the system and requests heating.

SCN-02: **Nominal thermal cycle.** While armed and Full, Below, Within, and Above relations successively produce HeatingRequested, Holding with quiescence, and CoolingRequested without a new recovery event.

SCN-03: **Defrost priority and release.** While comfort requests Cool, an Obscured glazing condition selects Defrost; when glazing becomes Clear and defrost request is Off, comfort cooling resumes without changing the priority order.

SCN-04: **Reduced allocation.** Under reduced context, Defrost receives EconomyHeat when engine heat is Available and VentOnly when it is Unavailable, Heat is denied without engine heat, and Cool is denied in either reduced class.

SCN-05: **Energy-loss inhibition.** An active service followed by Unavailable electrical state or None power becomes quiescent and `Inhibited`; restoration with no fresh event remains quiescent and does not replay the prior service.

SCN-06: **Fresh-request recovery.** After SCN-05's restoration, one later fresh valid request produces `PermitRecovered`, re-evaluates the current demands, and may activate; a fresh event consumed during the outage does not satisfy this step.

SCN-07: **Invalid-input suppression.** Separate variants inject Unknown thermal relation during Regulate, Unknown glazing, an Unknown energy field, and Unknown fan preference during an otherwise active service; each reaches the responsible owner and produces quiescence and InputFault.

SCN-08: **User-off and fan boundary.** With visibility None, switching to ClimateRequest Off yields Inactive and quiescence for every thermal relation and fan value; on a later valid active request, Low and High are distinguished while Auto follows COMMAND-01.

SCN-AUD-01: SCN-01 through SCN-08 are exactly eight distinct families: initial activation, nominal cycling, priority conflict/release, reduced allocation, fault entry/stale suppression, fresh recovery, invalidity propagation, and user/fan boundaries. Variants within a family do not add scenario-family credit.

## Structural, ownership, and bounded-analysis obligations

STRUCT-01: The final architecture shall contain exactly one explicit root system usage and exactly eight reachable responsibility-bearing semantic usages realizing PART-01 through PART-08, at semantic containment depth `1..2` beneath the root, in exactly one weakly connected semantic region.

STRUCT-02: The final semantic tuple is exactly `8 usages / 21 interactions / 20 nontrivial cases / 8 scenario families`, within the declared medium bounds `8..12 / 15..21 / 12..20 / 6..9`. No item exists only to reach a bound.

SUPPORT-01: A behavior-free support container, root delegation, routing hops, finite type declarations, local state feedback, context actors, analyzer fixtures, and visualization nodes may be generated only when needed and marked as generated support. They receive no semantic usage, interaction, owner, case, or scenario credit and may not alter an INT endpoint, direction, type, or meaning.

OWNER-AUD-01: PART-01 through PART-08 each own exactly the derived fact or controlled result stated in their clause. PART-04 is the sole persistent-state owner; PART-05 owns service priority; PART-06 owns resource allocation; PART-07 owns command coordination; PART-08 owns public composition. Raw inputs shall not bypass their named qualifier, and no downstream owner or analyzer shall substitute for an owner-local contract.

PARTITION-AUD-01: The complete finite input-plus-prior-state space contains exactly `2 * 4 * 2 * 3 * 48 * 2 * 4 * 2 = 36,864` snapshots. A deterministic dependency-free analyzer shall enumerate all snapshots, independently compute expected owner facts and results, and retain counts and first witnesses for gaps, overlaps, relation mismatches, stale-replay violations, priority violations, nonquiescent faults, and contradictory commands.

TRACE-AUD-01: Every actionable identifier in this abstract shall map to one or more retained model, contract, analyzer, scenario, or review elements; every significant generated element shall trace back or carry a specific generated-support justification. Missing coverage, unexplained additions, or reused trace identifiers fail acceptance.

## Objective pass criteria

PASS-01: Structural conformance passes only with one root, exactly eight credited semantic usages, exactly 21 credited typed directed semantic interactions, semantic depth `1..2`, one weak semantic region, exactly twenty counted cases, exactly eight scenario families, and zero padded items.

PASS-02: Ownership conformance passes only when every PART owner has a canonical local contract for its stated derivation, no owner is a forwarding or renaming wrapper, no downstream owner recomputes an upstream fact, and the analyzer checks rather than replaces those contracts.

PASS-03: Behavioral conformance passes only when all 36,864 snapshots have exactly one matching case in each applicable local partition, all controlled fields are assigned, every CASE has at least one retained witness, and all BEH and FAULT criteria have zero violations.

PASS-04: Recovery conformance passes only when initialization, fault entry, unusable-energy fresh-event consumption, usable-but-stale blocking, fresh rearming, and subsequent armed operation all match STATE-01 and RECOVERY-01 in both one-step enumeration and ordered SCN-01, SCN-05, and SCN-06 traces.

PASS-05: Mechanical verification passes only when architecture-stage and final Sireum/HAMR typechecking, endpoint/type/direction checks, bounded analyzer execution, trace coverage, and retained campaign metric checks all pass on the same source revision. This does not constitute physical validation or formal semantic proof.

PASS-06: Scenario validation passes only when all eight families retain the stated ordered boundary inputs, owner decisions, state transitions, command, and status outcomes with no missing family or substituted trace.

PASS-07: Designer validation separately passes only if the retained model remains faithful to NEED-01, the exact boundary, the selected energy-aware purpose, the explicit priority and recovery policy, source limitations, assumptions, and deferred claims; mechanical success alone is insufficient.

PASS-08: Visualization passes only when exactly one source-bound `system-overview` shows the root boundary, all eight semantic responsibilities, both cooperating principal decision owners, the sole state owner, the explicit defrost-versus-comfort priority, and principal directed flows without crediting support or context as semantic usages.

PASS-09: Claim control passes only when unrun code generation, execution, formal proof, timing, energy, physical HVAC outcome, safety, certification, and production-readiness checks remain explicitly `not-run` or deferred rather than described as passed.

## Final approved-design audit

AUDIT-FINAL-01: The approved final baseline has exactly eight semantic usages, 21 typed directed semantic interactions, twenty nontrivial contract cases, and eight scenario families. It has four qualification/decision stages that cooperate without raw-input bypass, one persistent-state owner, one explicit priority conflict, a fail-closed invalid/unavailable path, and a fresh-request recovery path.

AUDIT-FINAL-02: MON-01 through MON-07 and CTRL-01 through CTRL-02 close the finite boundary; QUAL-01 through QUAL-03, CASE-01 through CASE-20, STAT-01, and COMMAND-01 close every owner-local relation; INT-AUD-01 recounts the approved inventory; and no handbook rule, pilot abstraction, selected design claim, or deferred claim is presented as belonging to another evidence class.
