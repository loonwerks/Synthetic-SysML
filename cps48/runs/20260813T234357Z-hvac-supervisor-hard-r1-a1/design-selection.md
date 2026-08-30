---
decision_id: HVAC-SEL-01
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
selected_alternative: ALT-02
status: approved-final
---

# Approved final design selection

## Decision frame

SEL-NEED-01: The frozen seed permits several single-system scopes but defines no architecture, command authority, finite policy, priority, fault behavior, or recovery. The design decision therefore selects one coherent hard-tier boundary while retaining all beyond-seed choices as pilot assumptions.

SEL-CRIT-01: The alternatives were compared for fidelity to the seed vocabulary, clarity of primary controlled purpose, cohesive and nonpadded responsibility ownership, ability to support 13..16 meaningful semantic usages, explicit multiple state/decision owners, analyzable priority and composition, diagnosable fault propagation, and closed recovery/fresh-request behavior.

SEL-CRIT-02: Structural size was a constraint rather than a score. An alternative could not win merely by reaching the hard counts, and any responsibility that only forwarded, renamed, bundled, or bijectively translated a value was excluded from semantic credit.

## Required seed alternatives compared

ALT-01: **Cabin-temperature supervisor.** Boundary: user target/fan preference and cabin thermal observation to heat/cool/ventilate command and status. Strengths: narrow purpose and straightforward thermal comparison. Weaknesses: a credible hard design would need invented zones, redundant sensors, or artificial policy partitions; defrost, air quality, humidity, and energy vocabulary would be excluded, leaving priority and composition comparatively weak.

ALT-02: **Visibility-priority whole-cabin HVAC supervisor — selected.** Boundary: nine finite requests/observations spanning user, cabin, glazing, cabin air, electrical, waste heat, equipment, and acknowledgment to one atomic actuation plan and status. Strengths: one primary purpose, naturally competing services, meaningful energy composition, critical versus noncritical fault propagation, and a genuine two-owner recovery/authorization protocol. Risk: broader pilot policy goes beyond the source and must remain explicitly labeled rather than presented as automotive truth.

ALT-03: **Cabin air-quality and humidity supervisor.** Boundary: air-quality/humidity observations and user enablement to filter/dry/ventilate outcomes. Strengths: cohesive environmental-conditioning purpose and useful local priority. Weaknesses: the seed supplies no pollutant observation semantics; reaching hard scale would encourage fabricated pollutant classes, filter-life state, or physical moisture policy with weak source grounding.

ALT-04: **User-facing HVAC command coordinator.** Boundary: dashboard/console preferences to selected HVAC requests and status. Strengths: clear user authority and fresh-command lifecycle. Weaknesses: actual cabin, glazing, and energy outcomes would sit outside, making fault propagation and controlled-environment validation shallow; hard-scale ownership could collapse into command parsing and routing.

ALT-05: **Energy- and interface-aware HVAC supervisor.** Boundary: electrical availability, waste heat, selected climate demands, and equipment readiness to energy-restricted actuation. Strengths: strong eligibility and composition semantics. Weaknesses: energy minimization has no numeric source bound, and without owning the climate-demand decision the system becomes an implementation-facing allocator rather than a complete cabin supervisor.

ALT-06: **Defrost-only supervisor.** Boundary: activation, glazing observation, equipment/electrical readiness, and acknowledgment to clearing command/status. Strengths: the clearest visibility purpose and recovery rationale. Weaknesses: hard-tier scale would require unjustified glazing zones, progress stages, or timing claims expressly absent from the seed; competing priority and whole-plan composition would be limited.

SEL-CMP-01: ALT-02 is not a mandatory combination of every seed capability. It deliberately includes only finite temperature, defrost, filtration, humidity, user, electrical, waste-heat, and equipment-readiness concepts needed for one actuation decision; it excludes physical progress, exact energy, usability, reliability, and timing claims.

## Selected allocation and rationale

SEL-ARCH-01: ALT-02 is retained with 15 semantic usages: five need/request assessors, three resource/equipment eligibility assessors, three service proposers, one priority/authorization state owner, one independent critical recovery state owner, one energy-safe plan composer, and one atomic result publisher.

SEL-ARCH-02: Need qualification is separated from service proposal because “what condition exists” changes independently from “is equipment/resource support available for a service.” This gives PART-02 through PART-05 distinct local observations and PART-10 through PART-12 distinct applicability decisions without identity wrappers.

SEL-ARCH-03: PART-09 owns priority plus post-recovery authorization state, while PART-14 owns fault latch and ordered recovery state. The split prevents the arbitration owner from clearing its own fault evidence and makes fault recovery versus fresh service authorization a compositional obligation.

SEL-ARCH-04: PART-13 owns resource-constrained plan composition after PART-09 selects a single intent. This separates “which purpose wins” from “what the current energy tier permits” and permits independent checks that priority and energy restrictions both survive end to end.

SEL-ARCH-05: PART-15 is retained because reconciling selected intent/status summary, candidate plan/cause, and recovery into mutually consistent actuation/status is a domain decision. It receives no credit for merely constructing records or delivering boundary values; its credited fact is atomic mode/cause/plan consistency and suppression under recovery holds.

SEL-TOPO-01: The exact topology is 33 typed directed semantic interactions: nine boundary inputs, 22 inter-usage exchanges, and two boundary outputs. It has one weakly connected semantic region and one linear decision spine with three converging proposal branches and a separate recovery branch.

SEL-STATE-01: PART-14 retains `Clear/Latched/Pending`; PART-09 independently retains `Normal/AwaitFresh`. Recovery needs four logical evaluations for faulted-to-reauthorized nonurgent service: Fresh acknowledgment, distinct healthy Pending step, JustCleared hold, and later New enabling request.

SEL-PRIO-01: The retained policy orders critical hold, recovery, urgent observed visibility, explicit defrost, user Off, Filter, Dry, thermal service, and residual ventilation/None. This is selected pilot policy; the seed itself provides no priority or automatic defrost authority.

SEL-REC-01: Urgent observed visibility is the sole exception to user Off and AwaitFresh. The exception makes the primary purpose operationally distinct while status and fault rules prevent pretending an unavailable clearing path can be commanded.

## Rejected allocation directions

REJ-01: A single central supervisor owning qualification, priority, recovery, energy, and outputs was rejected because all behavior would be recomputed in one usage, leaving peripheral usages as sensors/actuator wrappers and violating the required multiple owner and anti-padding rules.

REJ-02: A feature-silo allocation in which independent thermal, defrost, filtration, and humidity controllers directly emitted actuator commands was rejected because priority conflicts and electrical restriction would be distributed across competing outputs, weakening atomic composition and producing ambiguous fault authority.

REJ-03: A pipeline of input adapter, policy engine, and output adapter was rejected because the adapters would primarily rename or bundle values; the resulting three-owner appearance would not meet the hard semantic-usage intent.

REJ-04: A timing/progress-based defrost architecture was rejected because the source supplies only placeholder response/duration vocabulary and no validated progress observation, timing policy, or physical model.

## Assumptions introduced by selection

SEL-ASM-01: The qualitative finite bands, explicit validity, request-event freshness, equipment readiness, automatic Urgent visibility authority, electrical tiers, fault criticality, state machines, and all priority/recovery cases are pilot abstractions beyond the seed.

SEL-ASM-02: One atomic logical evaluation and same-evaluation propagation are specification semantics, not physical scheduler or latency claims.

SEL-ASM-03: Waste heat is merely an eligible preferred source label for Heat; availability does not establish efficiency, usable temperature, or delivered heat.

SEL-ASM-04: Equipment Unknown/invalid, blower failure, clearing failure, invalid visibility, and invalid/unavailable electrical interface are treated as critical; thermal and cabin-air observation invalidity is local degradation. This qualitative classification has no claimed automotive hazard pedigree.

SEL-ASM-05: Concurrent critical status attribution uses `InvalidVisibility > EquipmentFault > ElectricalUnavailable`; concurrent noncritical attribution uses `InvalidAirQuality > InvalidHumidity > InvalidThermal > None`. Publication then prefers critical/recovery, AwaitFresh, ElectricalDenied, VisibilityPriority, noncritical degradation, and None in that order. These are deterministic reporting choices, not changes to service priority or fault response.

## Count and coverage audit

SEL-AUD-01: The selected allocation contains exactly 15 credited usages, within hard `13..16`. Every usage derives a multi-input classification, comparison, applicability, transition, priority, composition, or consistency fact; no usage is credited for routing or record construction alone.

SEL-AUD-02: The selected topology contains exactly 33 semantic interactions, within hard `22..35`. Each has a unique typed responsibility and behavioral path; the required behavior-free Process and 11 boundary delegations remain uncredited generated support.

SEL-AUD-03: The selected contract plan contains exactly 30 counted nontrivial cases, within hard `21..30`: four request cases, five electrical cases, six recovery cases, ten priority/authorization cases, and five energy-composition cases. All five owner partitions are ordered, finite, total, and mutually exclusive.

SEL-AUD-04: The selected validation plan contains exactly ten scenario families, within hard `9..12`, covering thermal, automatic urgent visibility, requested defrost conflict, cabin-air conflict, electrical restriction, waste-heat choice, noncritical degradation, critical propagation, ordered recovery, and fresh-request authorization.

SEL-AUD-05: The required hard obligations are structural rather than nominal: PART-09 and PART-14 are independent state owners; PART-09, PART-12, PART-13, and PART-15 have distinct decision ownership; priority, same-evaluation fault propagation, ordered recovery, fresh-request rejection, and end-to-end composition all have explicit cases and objective pass criteria.

## Selection disposition

SEL-RES-01: The Model finding on PART-10 readiness is accepted exactly: INT-20 remains one interaction and now carries blower-and-thermal-path readiness, closing Ventilate applicability without changing ownership or topology.

SEL-RES-02: The Model finding on electrical denial provenance is accepted exactly: CTRL-02 includes `ElectricalDenied`, INT-29 remains one interaction carrying candidate plan plus cause, and PART-15 publishes a denied all-off result as `Degraded/ElectricalDenied`.

SEL-RES-03: The Model finding on concurrent cause ambiguity is accepted and completed with the deterministic precedences in SEL-ASM-05. Existing INT-12, INT-25, and INT-27 payloads expose proposal-local observation-invalid facts so PART-09 does not confuse an unavailable request with `InvalidThermal`; INT-30 carries the resulting summary. SCN-07/08 and bounded composition analysis enumerate every simultaneous family combination and require exactly one published cause; control outcomes remain unchanged.

SEL-RES-04: The Model's no-concern ownership audit is accepted with its stated narrowing: PART-15 receives credit only for owner-local mode/cause consistency and suppression, while copied plan fields, record construction, and fan-out receive none.

SEL-RES-05: The localized depth-two mapping is accepted as a generated-support allowance: one root System, one behavior-free Process, 15 sibling Threads, attribute-declared inspected record fields, two-hop boundary delegation, and direct typed internal fan-out. New/Fresh values remain current-snapshot data semantics, with no scheduling or executable-event claim.

SEL-RES-06: The factorized bounded-analysis feasibility finding is accepted. Local finite owner relations, all 30 CASE witnesses, all ten SCN-family witnesses, every concurrent cause combination, and at least four evaluations of recovery shall be checked under the harness; this remains finite conformance evidence rather than execution or unbounded proof.

SEL-PASS-01: ALT-02 is approved as the final design because it best uses the seed's allowed breadth while maintaining a single visibility-priority purpose and creates hard complexity through genuine conflicting responsibilities. The exact approved tuple is `15 semantic usages / 33 semantic interactions / 30 nontrivial cases / 10 scenario families / depth 2 / one root / one weak semantic region / 44 raw connections`.

SEL-PASS-02: Local contracts shall expose each credited owner fact, implement ordered total and mutually exclusive CASE partitions, preserve sole ownership of PART-09 authorization and PART-14 recovery, and select deterministic candidate/output causes. End-to-end analysis shall independently reconstruct owner facts and CTRL results, test fault propagation, priority, recovery, energy composition, stale-request rejection, and concurrent-cause precedence, and retain concrete witnesses.

SEL-PASS-03: Generated support is limited to the behavior-free Process, delegation, data/type declarations, flat atomic records with inspected fields declared as attributes, initialization, equations/invariants, witness plumbing, and typed fan-out, all uncredited. Physical performance, timing, energy, safety, reliability, certification, scheduling, deployment, code generation, execution, and formal proof remain deferred and must not be implied.

SEL-Q-01: Model review resolved same-evaluation recovery-event composition as supported logical contract composition between the two state owners; it authorizes no implicit scheduler or latency claim and no owner merge.

SEL-Q-02: Model review resolved the exact depth-two mapping, flat atomic finite records, 44 raw connections, and factorized four-step analyzer as feasible in the trusted tool subset. Generation must still produce mechanical and bounded evidence before acceptance.
