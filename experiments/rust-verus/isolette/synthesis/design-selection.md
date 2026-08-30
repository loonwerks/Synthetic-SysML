# Approved design selection — Isolette Thermostat

DEC-CONTEXT-01 — The source already supplies a plausible two-level functional allocation: Thermostat -> independent Regulate Temperature and Monitor Temperature functions; each path is further allocated to interface management, mode management, output management, and internal-failure detection. The selection decision evaluates whether to retain or consolidate those responsibilities for the medium tier.

## Selection criteria

DEC-CRIT-01 — Source fidelity: retain the distinct regulator and monitor responsibilities, named controlled quantities, stateful heat/alarm behavior, and failed-mode consequences without substituting a generic threshold thermostat.

DEC-CRIT-02 — Independence: no regulator settings, diagnostic state, mode, or decision may qualify the monitor, and no monitor settings, diagnostic state, mode, or decision may qualify the regulator; sharing the external sensor and Operator Interface endpoints is allowed.

DEC-CRIT-03 — Behavioral ownership: every semantic usage must derive a meaningful local fact or own state; copying, bundling, one-to-one enum relabeling, or rerouting cannot justify a usage.

DEC-CRIT-04 — Medium bounds: exactly 8 semantic usages, exactly 20 typed directed semantic interactions, exactly 20 nonduplicative contract obligations, 8 scenario families, at least two decision/state owners, and explicit priority conflicts and recovery behavior. One nonsemantic Process and ten uncredited boundary delegations are permitted only as checker-required generated support.

DEC-CRIT-05 — Formal locality: mode, heat, alarm, interface qualification, and failure-latch obligations should be expressible at their actual owners; root contracts may check composition but may not reproduce local policy.

DEC-CRIT-06 — Reviewability: source ambiguities, selected formalization, timing claim limits, and deferred diagnostic implementation must be visible rather than silently resolved.

## Alternative A — selected: appendix-aligned eight-owner allocation

DEC-ALT-A-01 — Allocate the regulator path to Manage Regulator Interface, Detect Regulator Failure, Manage Regulator Mode, and Manage Heat Source; allocate the monitor path independently to Manage Monitor Interface, Detect Monitor Failure, Manage Monitor Mode, and Manage Alarm.

DEC-ALT-A-02 — Route Current Temperature separately to both interface owners; route only Desired settings to the regulator and only Alarm settings to the monitor; keep supervision, modes, and controlled-output state independent.

DEC-ALT-A-03 — This alternative gives every usage a source-recognizable responsibility and a meaningful local derivation: two multi-input interface qualifications, two resettable failure latches, two health/mode decisions, and two stateful output policies.

DEC-ALT-A-04 — Its main cost is more interfaces and two feedback cycles (`interface facts -> mode -> interface status`) than a monolithic design. The added interactions are justified by visible ownership, not by graph targets.

## Alternative B — rejected: two monolithic independent controllers

DEC-ALT-B-01 — Allocate one Regulator Controller that owns input qualification, diagnostics, mode, feedback, and Heat Control, plus one Monitor Controller that owns corresponding alarm responsibilities.

DEC-ALT-B-02 — This preserves top-level safety independence and minimizes internal connections, but it hides the appendix's selected subfunction responsibilities, co-locates several independently changing policies, and yields only two semantic usages—below the selected medium scope.

DEC-ALT-B-03 — Adding adapters around the two controllers would not cure the issue because identity-forwarding usages would be count padding and would leave all decisions centralized.

## Alternative C — rejected: shared qualification/supervision with output-specific controllers

DEC-ALT-C-01 — Allocate one shared Sensor and Operator Input Qualifier, one shared Health/Mode Supervisor, separate Heat and Alarm policy owners, and an output feedback owner.

DEC-ALT-C-02 — This reduces duplicate connections and qualification logic, but creates common decision state across SR-1 and SR-2, permits a regulator-side defect or Desired-setting defect to affect alarm availability, and contradicts the source's independent regulator/monitor allocation.

DEC-ALT-C-03 — Splitting only the shared owner's name while retaining shared facts would be repartitioning without independence; separate ports and state owners are required.

## Source allocation comparison

DEC-CMP-01 — The selected design retains the source's Regulate/Monitor division exactly at the responsibility level and retains all eight named subfunction purposes. It does not claim that those logical parts imply threads, processes, deployment units, algorithms, or hardware partitions.

DEC-CMP-02 — Compared with the source diagrams, the selected design adds explicit typed directed connections, finite data domains, reset/timeout supervision records, owner-local failure latches, evaluation order, complete fresh-input/recovery rules, and a checker-required System-to-Process-to-Thread hosting map. These are declared architecture/formalization or generated-support choices, not handbook facts or execution evidence.

DEC-CMP-03 — Compared with the source, the selected design corrects the apparent REQ-MMI-6 contradiction by binding Alarm Range to Alarm Temperature Settings and interprets “Manage Monitor Interface mode” as Monitor Mode. Both resolutions are explicit and reviewable.

DEC-CMP-04 — Compared with the source, quantitative physical failure probabilities, plant-rate guarantees, diagnostic coverage, and real-time compliance are retained as context or deferred claims; the logical model cannot re-establish them.

## Selected architecture and rationale

DEC-SELECT-01 — Alternative A is selected because it best satisfies source fidelity, independent failure containment, owner-local contract analysis, and the medium structural boundary without padding.

DEC-SELECT-02 — Exactly eight semantic Thread usages are authorized, one for each selected part; each carries the distinct fact/state recorded in its corresponding ownership clause. They are direct children of exactly one behavior-free generated-support Process under the root System, yielding containment depth exactly 2.

DEC-SELECT-03 — Exactly 20 semantic end-to-end interactions are authorized and are realized by exactly 30 resolved port connections: ten owner-to-owner interactions use one connection each, and ten root-boundary interactions use two type- and direction-preserving connections each across the Process boundary. The ten added delegation connections receive no semantic-interaction credit.

DEC-SELECT-04 — Regulator and monitor share only Current Temperature as two independent boundary connections and the Operator Interface as an external endpoint. They share no internal qualified value, mode, diagnostic state, or control proposal.

DEC-SELECT-05 — The regulator priority conflict is failed/init safe-off versus a low-temperature heat-on demand. The monitor priority conflict is failed alarm-on versus a safe-temperature alarm-off demand. These are separate policy owners and separate scenario oracles.

DEC-SELECT-06 — Recovery is deliberately latched: fresh valid settings or temperature may update a healthy `NORMAL` path but cannot recover a `FAILED` path; a power-epoch change is the sole recovery trigger and returns only the affected state machine to `INIT`.

## Ownership audit before handoff

DEC-AUDIT-01 — Manage Regulator Interface passes: its credited facts combine two status inputs into Interface Failure and round a tenths-degree value into Display Temperature; Desired Range copying and mode-to-status relabeling are required but not independently credited.

DEC-AUDIT-02 — Detect Regulator Failure passes: prior latch plus reset and fault events derive next latch and independent deadline classification; it is not an input-forwarder.

DEC-AUDIT-03 — Manage Regulator Mode passes: interface failure, internal failure, Current Temperature validity, prior mode, reset, and deadline jointly derive health and next mode.

DEC-AUDIT-04 — Manage Heat Source passes: mode, qualified current/range, and prior heat jointly derive forced, selected, or retained Heat Control.

DEC-AUDIT-05 — Manage Monitor Interface passes: its credited fact combines two Alarm-setting statuses into Interface Failure; Monitor Status relabeling and Alarm Range availability are required but not separately credited.

DEC-AUDIT-06 — Detect Monitor Failure passes independently for the same stateful reason as its regulator counterpart; it consumes no regulator supervision.

DEC-AUDIT-07 — Manage Monitor Mode passes: monitor interface failure, monitor internal failure, Current Temperature validity, prior mode, reset, and deadline jointly derive health and next mode.

DEC-AUDIT-08 — Manage Alarm passes: mode, qualified current/range, and prior alarm jointly derive forced, selected, or retained Alarm Control across five numeric regions.

DEC-AUDIT-09 — No output aggregator, display-only identity wrapper, setting pass-through adapter, boundary-delivery usage, or shared arbiter is authorized or counted.

## Partition and inventory audit

DEC-PARTITION-01 — Desired-status qualification covers exactly four status pairs through valid-both versus any-invalid; Alarm-status qualification has the same complete partition independently.

DEC-PARTITION-02 — Each mode relation covers reset, healthy startup, unhealthy pre-timeout waiting, timeout failure, normal health retention, normal health loss, and failed-mode latch.

DEC-PARTITION-03 — Heat policy covers non-NORMAL, below desired, above desired, and inclusive in-range retain behavior; Alarm policy covers INIT, FAILED, low-outside, low-band, central-inner, high-band, and high-outside behavior.

DEC-PARTITION-04 — Fresh valid settings in NORMAL, fresh valid settings after FAILED, fresh valid temperature after FAILED, and power-cycle recovery are all explicitly distinguished; none is left to tool initialization behavior.

DEC-PARTITION-05 — Final recount: 1 root System, 1 nonsemantic generated-support Process, 8 semantic Thread usages, containment depth 2, 20 semantic directed end-to-end interactions, 30 resolved port connections, 20 named contract obligations, 6 owned state variables, 6 externally distinguishable path modes, 2 priority conflicts, 2 independently boundary-anchored weak semantic regions after excluding boundary/delegation edges, and 8 scenario families.

## Model-review resolutions

DEC-RESOLVE-01 — Accepted Model finding 1: current checker evidence establishes that stateful GUMBO owners must be Threads and Threads require a Process beneath a System. The selected architecture therefore adds exactly one behavior-free Process and changes containment depth from 1 to 2 without changing any semantic owner or interaction.

DEC-RESOLVE-02 — Accepted Model finding 2 (`no-concern`): all eight ownership claims survive the extensional audit. Copies, bundles, carried status/timeout facts, boundary delivery, and one-to-one mode/status renames remain explicitly uncredited.

DEC-RESOLVE-03 — Accepted and narrowed Model finding 3: attribute-based finite records, integer-tenths arithmetic, typed 0.5-, 1.0-, 5-, and 6-second properties, owner-local Thread state, `In(state)` retention, and NORMAL-only Display Temperature guarantees are authorized mappings. A type-valid Display Temperature initialization and the Process/Thread hosting categories are generated support, never source behavior or evidence of execution or timing compliance.

DEC-RESOLVE-04 — Accepted Model finding 4 (`no-concern`): the two regulator/monitor semantic regions, boundary inventory, threshold inclusivity, hysteresis, priorities, recovery, and claim boundary remain unchanged. The bounded analyzer shall traverse the 20 semantic end-to-end interactions and shall not credit or assign behavior to the Process or delegation routes.

## Final contract, analysis, support, and claim boundary

DEC-CONTRACT-01 — `CASE-01` through `CASE-19` require canonical owner-local GUMBO on the responsible Thread, including local state and prior-state references where specified; `CASE-20` requires a composed noninterference check. The Process and root may route or observe facts but may not duplicate or recompute any owner-local policy.

DEC-ANALYSIS-01 — Bounded end-to-end analysis shall exhaust all finite guard partitions, report zero gaps, overlaps, output mismatches, and next-state mismatches, and execute all 8 scenario families and their mandatory variants through `INT-01` through `INT-20`, including both priority conflicts, both fresh-valid non-recoveries, both power-epoch recoveries, both unilateral failures, both timeouts, and cross-failure noninterference.

DEC-SUPPORT-01 — Generated support is limited to one behavior-free Process, ten type- and direction-preserving boundary-delegation connections, Thread hosting categories, and one type-valid Display Temperature initialization that does not constrain non-`NORMAL` behavior. None receives semantic count, ownership credit, or behavioral trace credit.

DEC-DEFER-01 — Physical plant rates, sensor accuracy, human response, physical timing compliance, failure probabilities, diagnostic algorithms and coverage, manufacturing cost, code generation, Rust/Verus realization, application execution, scheduling, deployment, simulation, proof, production suitability, and safety certification remain deferred or unclaimed.

## Decision disposition

DEC-DISPOSITION-01 — Approved after localized revision. Model regeneration is authorized in this retained run against the approved System Abstract and design selection; generation shall preserve all frozen domain semantics and exact final metrics and shall use only the generated-support allowances stated above.
