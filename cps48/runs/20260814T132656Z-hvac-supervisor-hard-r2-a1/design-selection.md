---
decision_id: HVAC-AIR-SEL-01
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
selected_scope: cabin-air-quality-and-humidity-supervisor
selected_alternative: ALT-AIR-03
status: approved-final
baseline_revision: designer-resolution-1
---

# Approved design selection

## Decision frame and criteria

DSEL-NEED-01: The frozen seed permits six alternative single-system scopes but defines no architecture, finite boundary, priority, ownership, fault behavior, or recovery. The diversity card additionally excludes defrost, thermal-service, energy-allocation, visibility-priority whole-cabin, and renamed variants as the replicate-2 controlled purpose.

DSEL-CRIT-01: Each candidate was assessed for source-vocabulary fidelity, a single clear controlled purpose, a boundary that does not absorb excluded replicate-1 purposes, cohesive nonpadded owners, genuine hard-tier state and decision ownership, finite priority and composition, fault isolation, recovery closure, and bounded analyzability.

DSEL-CRIT-02: Structural counts were treated as constraints rather than benefits. Any candidate needing invented zones, arbitrary copies, identity translations, fabricated timing, or physical thresholds merely to reach `13..16 usages / 22..35 interactions / 21..30 cases / 9..12 scenarios` was rejected.

DSEL-CRIT-03: The diversity card was treated as an architectural constraint. Selection required a different primary controlled purpose and substantive differences from the closest replicate-1 baseline in at least boundary, state ownership, topology, priority, or recovery; surface renaming and feature repartitioning were not eligible.

## Required seed alternatives compared

ALT-AIR-01: **Cabin-temperature supervisor.** Its natural boundary is user target/fan preference plus cabin thermal observation to heat/cool/ventilate outcomes. It is coherent but explicitly excluded for replicate 2 because thermal-service selection is already principal replicate-1 material; enlarging it to hard size would also invite fabricated zones or energy constraints.

ALT-AIR-02: **Defrost supervisor.** Its natural boundary is activation and glazing observation to a clearing request and status. It has a clear purpose but is explicitly excluded by the diversity card and cannot reach hard size without unjustified progress, zoning, or timing inventions.

ALT-AIR-03: **Cabin air-quality and humidity supervisor — selected.** Its boundary is user cabin-air preference, qualitative air and humidity evidence, treatment readiness, and shared-air-path authority to a single cabin-air treatment plan and status. It supports hard complexity through three retained state owners, independent channel recovery, competing but cohesive treatment proposals, and fail-closed composition without controlling thermal, visibility, or energy services.

ALT-AIR-04: **User-facing HVAC command coordinator.** Its natural purpose is preference acceptance rather than environmental actuation and is allowed by the card. It provides a strong fresh-request lifecycle, but most hard-tier behavior would concern parsing, retention, and dispatch; fault propagation and environmental recovery would be shallower or would require pulling observations back across the boundary.

ALT-AIR-05: **Energy- and interface-aware HVAC supervisor.** Its natural boundary maps availability and climate demand to energy-restricted outcomes. It is explicitly excluded because energy and electrical eligibility are principal replicate-1 material, and the seed supplies no numeric energy policy.

ALT-AIR-06: **Whole-cabin HVAC supervisor.** It can naturally express conflicts among defrost, air treatment, humidity, and thermal service, but replicate 1 already accepted visibility-priority whole-cabin control. Removing a few features or changing its name would not meet the diversity constraint.

DSEL-CMP-01: ALT-AIR-03 best satisfies both the seed and the diversity card. Its hard-tier complexity comes from air-evidence trust, humidity-evidence trust, user-preference retention, channel-specific proposals, local priority, and external-authority composition rather than from the excluded defrost, thermal, electrical, or energy policies.

## Responsibility-allocation alternatives within the selected scope

DSEL-ALLOC-01: **Independent channel recovery with convergent treatment proposals — selected.** Air evidence and humidity evidence have independent recovery owners; accepted preference has a third owner; filtration, humidity, and routine-airflow applicability are derived separately and converge at one priority owner before authority-safe composition. This makes channel isolation and concurrent recovery directly reviewable.

DSEL-ALLOC-02: **Single observation-confidence and recovery owner — rejected.** One state machine would quarantine both air and humidity after either invalid observation. It is structurally simpler but needlessly suppresses the unaffected purpose, hides channel provenance, and weakens the required multiple-state-owner obligation.

DSEL-ALLOC-03: **Feature-silo controllers with direct commands — rejected.** Independent filter, humidity, and ventilation controllers could each own local recovery and directly command equipment. The result would distribute conflict resolution across outputs, permit contradictory actions, and undermine one atomic composition point.

DSEL-ALLOC-04: **Central policy engine with input/output adapters — rejected.** A central engine could own request retention, trust, priority, and outputs, but surrounding adapters would mostly classify once and forward. It would collapse meaningful state/decision ownership and invite owner-count padding.

DSEL-ALLOC-05: **Treatment-progress or filter-life architecture — rejected.** Progress, pollutant concentration, filter life, efficiency thresholds, and physical humidity response are not established by the seed. Adding them would create apparent scale through unsupported plant claims.

## Selected allocation and topology rationale

DSEL-ARCH-01: The selected architecture has 14 semantic usages: five boundary classifiers, two independent evidence-recovery owners, one preference-session owner, three proposal owners, one priority arbiter, one authority-safe plan composer, and one status/outcome reconciler.

DSEL-ARCH-02: PART-02 and PART-03 interpret current evidence, while PART-06 and PART-07 own trust over evaluation sequences. This separation is cohesive because present-condition vocabulary can change independently of the selected recovery protocol, and neither pair is an identity forwarding chain.

DSEL-ARCH-03: PART-08 owns accepted user preference separately from evidence recovery. This allows a fresh valid request to be accepted during quarantine without granting authority to use invalid environmental evidence, and it avoids coupling user intent to sensor recovery.

DSEL-ARCH-04: PART-09 through PART-11 own proposal applicability rather than final priority. They combine distinct evidence, preference, field-local equipment, and authority facts under explicit ordered total relations, while PART-12 alone resolves competition and no-selection cause precedence and PART-13 alone composes the selected intent with common authority and capability.

DSEL-ARCH-05: PART-14 is retained only for its owner-local mode/cause and end-to-end consistency decision. Its approved mode order is Inhibited, otherwise ObservationHold, otherwise Degraded, otherwise Active, otherwise Idle. Copying the plan, constructing a status record, or delivering an output earns no semantic credit.

DSEL-TOPO-01: The topology contains exactly 31 typed directed semantic interactions: five boundary inputs, 24 inter-usage exchanges, and two boundary outputs. It has two independent evidence-state branches and one preference-state branch feeding three proposal branches, which converge through priority and composition before separate plan/status outputs.

DSEL-STATE-01: PART-06 retains air trust, PART-07 retains humidity trust, and PART-08 retains accepted preference. Observation owners each use Trusted, Quarantined, and Confirming; neither can alter the other, and preference state survives either fault.

DSEL-PRIO-01: The retained priority is accepted Disabled, then applicable filtration, signed humidity correction, routine exchange, and None. This priority is about cabin-air treatment purposes only; it contains no visibility, defrost, thermal-comfort, or energy tier.

DSEL-REC-01: Each invalid observation immediately quarantines only its channel. Recovery is automatic after two consecutive valid observations and recurrence restarts confirmation. No acknowledgment or post-recovery fresh request is required; fresh valid preferences accepted during recovery remain available when the channel recovers.

DSEL-COMP-01: PART-13 applies shared-path authority and the four field-local equipment dispositions after one intent is selected. Reserved/untrusted authority, shared-blower loss, or selected-path loss produces one all-off plan and cause without changing accepted preference or evidence-recovery state.

DSEL-LOCAL-01: The accepted local relation preserves Ready, Failed, Unknown, and Untrusted separately for blower, filter, humidifier, and dehumidifier; evaluates disabled/blocked/no-demand before equipment loss in each channel proposer; evaluates Untrusted then Reserved authority before blower loss for routine exchange; and resolves concurrent no-selection causes as `AuthorityInvalid > AirPathReserved > EquipmentUnavailable > SelectedPathUnavailable > None`.

DSEL-LOCAL-02: Local contracts shall be finite, deterministic, total, and mutually exclusive, expose every canonical owner fact to its consumer, and forbid central recomputation. These completions change detailed payload fields and relations only; they add no usage, interaction, state owner, counted case, scenario family, action, or boundary value.

## Frozen diversity-card compliance

DIV-BASE-01: The closest replicate-1 baseline is the accepted **Visibility-Priority Whole-Cabin HVAC Supervisor** from the hard replicate-1 run, because it also included air-quality/humidity proposal material and used multiple owners before one output plan.

DIV-PURPOSE-01: The selected primary controlled purpose differs: this system supervises preference-conditioned cabin air quality and humidity, whereas the baseline's primary controlled purpose was urgent glazing clearing within whole-cabin climate actuation. Defrost, thermal service, and energy eligibility are absent rather than subordinate internal features.

DIV-BOUND-01: The boundary differs: this system has five inputs for cabin-air preference, two environmental observations, treatment readiness, and opaque shared-path authority, plus cabin-air plan/status outputs. It has no glazing, cabin-temperature, electrical-budget, waste-heat, recovery-acknowledgment, or whole-cabin actuation boundary values.

DIV-STATE-01: State ownership differs: two channel-local evidence owners recover independently and a separate preference owner persists user intent. The baseline instead used one global critical-fault recovery latch and one arbitration authorization state that discarded stale post-fault service authorization.

DIV-TOPO-01: Interaction topology differs: independent air and humidity recovery gates feed channel proposal owners, a preference-state branch feeds all proposals, and an opaque external path grant is applied at composition. The baseline converged visibility, cabin-air, thermal, electrical, waste-heat, and equipment branches on a whole-cabin selection spine with global recovery feedback.

DIV-PRIO-01: Priority policy differs: Filter outranks humidity correction, which outranks routine exchange, under an accepted user enable. There is no automatic urgent override of user Off, no defrost precedence, no thermal fallback, and no energy-tier restriction.

DIV-REC-01: Recovery policy differs: each observation channel requires two consecutive valid snapshots and then automatically resumes against retained preference. The baseline required fresh acknowledgment, a Pending step, JustCleared authorization hold, and a later New request, with an urgent-visibility exception.

DIV-NOT-EXT-01: This is not an extension, subset module extracted from, or renamed version of the baseline. Its state variables, recovery trigger, accepted-preference lifetime, arbitration candidates, external authority, and controlled output semantics are different; adding the omitted replicate-1 services would require replacing the local-fault and retained-preference policy with a different global authority model rather than simply attaching more branches.

DIV-AUD-01: The design differs in all five card dimensions: `boundary`, `state_ownership`, `interaction_topology`, `priority_policy`, and `recovery_policy`. The first four differences would remain even if naming were normalized, and the recovery trace is behaviorally incompatible with the closest baseline.

## Assumptions introduced by selection

DSEL-ASM-01: Qualitative Clean/Loaded and Dry/Acceptable/Damp evidence, explicit validity, fresh/held request events, treatment readiness, and shared-path authority are finite pilot abstractions beyond the source.

DSEL-ASM-02: `Continuous` filtration, automatic signed humidity correction, filtration-over-humidity priority, and routine exchange are selected policies grounded only in optional seed vocabulary, not production recommendations.

DSEL-ASM-03: Two consecutive valid logical observations establish recovery for this pilot. This is an analyzable sequence rule, not a physical confidence threshold, elapsed-time requirement, or reliability claim.

DSEL-ASM-04: Channel invalidity is isolated; external authority and shared-blower failures inhibit the final plan without changing preference state. This qualitative fault classification has no automotive safety pedigree.

DSEL-ASM-05: Concurrent cause attribution uses air invalidity before humidity invalidity, then recovery, realization inhibits, preference rejection, and policy causes. Concurrent mode attribution uses the disjoint order Inhibited, ObservationHold, Degraded, Active, then Idle. These deterministic reporting rules do not alter action priority or state transitions.

## Count, closure, and ownership audit

DSEL-AUD-01: The selected allocation has exactly 14 credited semantic usages, within hard `13..16`. Every usage owns a multi-field classification, finite state transition, multi-source applicability, arbitration, fail-closed composition, or status-consistency fact; no usage is credited for copying, renaming, bundling, or routing.

DSEL-AUD-02: The selected topology has exactly 31 semantic interactions, within hard `22..35`: five boundary inputs, 24 distinct inter-owner exchanges, and two boundary outputs. With one behavior-free Process and two-hop boundary delegation, the realization has exactly 38 raw connections.

DSEL-AUD-03: The contract plan has exactly 29 nontrivial cases, within hard `21..30`: four preference-session cases, six air-recovery cases, six humidity-recovery cases, six priority cases, and seven composition cases. Each owner partition is ordered, finite, total, and mutually exclusive.

DSEL-AUD-04: The validation plan has exactly ten scenario families, within hard `9..12`: preference lifecycle, automatic filtration, two signed humidity directions, concurrent priority, routine/no-demand behavior, external authority, equipment faults, air recovery, and humidity/concurrent recovery.

DSEL-AUD-05: Fresh-request closure is owned by CASE-01 through CASE-04 and SCN-01/09; recovery closure is owned by CASE-05 through CASE-16 and SCN-09/10. The cross-product includes Held, invalid, fresh Disabled, fresh Enabled, fault persistence, first valid, recurrence, second valid, and fresh changes during recovery.

DSEL-AUD-06: Required hard obligations are substantive: PART-06, PART-07, and PART-08 own independent state; PART-08, PART-12, PART-13, and PART-14 own distinct decisions; CASE-17 through CASE-22 define priority; FAULT-01 through FAULT-03 define propagation; CASE-05 through CASE-16 define recovery; and CASE-23 through CASE-29 define composition.

## Final disposition and Model-review resolution

DSEL-PASS-01: ALT-AIR-03 is approved as the final Designer selection because it is source-permitted, diversity-compliant, finite, hard-sized without padding, explicit about every beyond-seed assumption, and—after the accepted local-relation revisions—closed over request, fault, recovery, priority, authority, equipment, cause, mode, and output partitions.

DSEL-PASS-02: The exact retained tuple is `14 semantic usages / 31 semantic interactions / 29 nontrivial cases / 10 scenario families / depth 2 / one root / one support Process / one weak semantic region / 38 raw connections`.

DSEL-PASS-03: Model generation is authorized to preserve local ownership, implement the exact finite partitions, expose all state transitions, field-local capability facts, and proposal causes, and independently analyze end-to-end priority, channel isolation, same-evaluation invalidity propagation, recovery, concurrent unavailability, authority composition, no-selection cause precedence, and disjoint status precedence.

DSEL-DEFER-01: Pollutant or moisture physics, filter performance or life, physical effectiveness, comfort, usability, acoustics, real timing, airflow, energy, reliability probability, automotive safety, regulatory compliance, certification, production readiness, scheduling, deployment, code generation, application execution, and unbounded formal proof remain deferred. A passing static model or bounded analyzer shall not imply any of them.

DSEL-SUPPORT-01: Generated support is limited to one behavior-free Process; two-hop boundary delegation; finite data and type declarations; flat atomic attribute records; initialization; owner-local equations and invariants; typed fan-out; and source-bound analyzer witness plumbing. Support receives no semantic-usage, interaction, owner, case, or scenario credit; anything else requires an explicit `@generated-support` rationale traced to SUPPORT-01 in the System Abstract.

DSEL-RES-01: The Model's same-evaluation logical report mapping is accepted with the limitation that it makes no executable scheduling, ordering, or latency claim and leaves PART-06 and PART-07 as sole state writers.

DSEL-RES-02: The Model's depth-two mapping is accepted as seven two-hop boundary interactions plus 24 sibling interactions, exactly 38 raw connections for 31 semantic interactions, using flat attribute records for contract-inspected fields.

DSEL-RES-03: The Model's factorized analysis strategy is accepted as feasibility evidence only. Generated evidence must exhaust all owner-local partitions and 29 cases, cover all nine combined recovery pre-states and required three-evaluation sequences, retain witnesses for all ten scenarios, compare canonical payloads end to end, and report zero gaps, overlaps, mismatches, stale outputs, and ownership violations.

