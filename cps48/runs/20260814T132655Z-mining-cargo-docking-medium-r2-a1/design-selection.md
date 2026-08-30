# Approved final design selection — Docked-Service Access Lifecycle Supervisor

## Decision frame

DS-NEED-01: Select one coherent medium-sized system from the reusable mining-cargo-docking seed while treating source vocabulary as evidence of available purpose, not as a supplied interface, state machine, topology, or policy.

DS-CRIT-01: Selection criteria are distinct controlled purpose, coherent finite boundary, lifecycle and owner clarity, explicit conflict and recovery behavior, finite analyzability, source-claim discipline, and useful medium-tier complexity without forwarding or case padding.

DS-CRIT-02: Campaign compliance requires 8..12 semantic usages, 15..21 semantic interactions, 12..20 nontrivial cases, 6..9 scenario families, at least two cooperating qualification or decision owners, and at least one explicit priority conflict.

DS-DIV-01: The frozen diversity card prohibits another cargo-transfer verifier or ship/warehouse evidence coordinator and requires a different primary controlled purpose plus genuine change in at least two architectural dimensions.

## Comparison of seed scope alternatives

DS-SCOPE-01: Ore-hold supervision would control mining continuation, retention, and later-offload readiness from extraction and hold observations. It satisfies diversity, but its strongest medium policy would center mining/hold thresholds that the seed deliberately leaves especially unconstrained.

DS-SCOPE-02: Station cargo-transfer verification would supervise offload admission and reconcile ship and warehouse evidence. It is rejected because it is the named replicate-1 baseline and violates the replicate-2 diversity constraint regardless of renaming or additional service features.

DS-SCOPE-03: Docking-service supervision can control logical dock/undock permissions and generic service-access exclusion while excluding physical docking. It supports a coherent lifecycle, two cooperating readiness/interlock owners, an operationally meaningful service-versus-undock conflict, and recovery grounded in release context.

DS-SCOPE-04: Capacitor/support-system resupply verification would supervise a resupply request and completion evidence. It satisfies diversity but would make verification adequacy depend on invented resupply evidence semantics and would cover only one docked service interaction.

DS-SCOPE-DEC-01: DS-SCOPE-03 is selected because it offers the clearest distinct controlled purpose and uses repair and resupply only as mutually exclusive consumers of docked access, not as completion claims. DS-SCOPE-01 and DS-SCOPE-04 remain plausible but are less balanced against source limitations at medium scale.

## Responsibility-allocation alternatives

DS-ALT-01: A centralized lifecycle supervisor with thin berth, ship, and service adapters would minimize internal flows but concentrate readiness, exclusion, state, priority, and outputs in one owner; the adapters would risk being uncreditable forwarding or enum-renaming wrappers.

DS-ALT-02: A lifecycle-and-interlock allocation separates fresh-intent qualification, joint berth/ship readiness, dual-service exclusion, lifecycle-relative consistency, priority arbitration, persistent lifecycle state, last-chance control gating, and stakeholder reporting into eight responsibilities connected by 21 typed semantic interactions.

DS-ALT-03: A station-side/ship-side split would place berth and services on one side and pilot, ship condition, and movement permission on the other, with a cross-side coordinator. It suggests physical deployment and authority boundaries absent from the seed and makes logical lifecycle behavior depend on location.

DS-ALLOC-DEC-01: DS-ALT-02 is selected because every usage derives a distinct reviewable fact, PART-06 uniquely owns lifecycle state, PART-02/PART-03/PART-04/PART-05 cooperate without recomputation, and PART-07 independently suppresses stale movement or access proposals.

DS-ALLOC-RAT-01: DS-ALT-01 is rejected under the owner-padding rule, and DS-ALT-03 is rejected because unsupported deployment semantics do not improve the logical service-access purpose.

## Selected finite boundary, state, and policy

DS-BOUND-01: The exact boundary contains five inputs—pilot intent, berth observation, ship condition, repair signal, and resupply signal—and four outputs—movement directive, generic service access, pilot lifecycle report, and station access report.

DS-STATE-01: LifecycleController is the sole persistent owner of seven states spanning outside idle, docking clearance, docked locked access, service grant, service activity, undocking clearance, and recovery.

DS-OWNER-01: Cooperating qualification and decision owners are IntentQualifier, DockReadinessQualifier, ServiceInterlockQualifier, LifecycleConsistencyMonitor, and PriorityArbiter; MovementAndAccessSafetyGate and LifecycleReporter own final controlled interpretations rather than forwarding controller values.

DS-PRIOR-01: The selected order is fault, contradiction, recovery, service completion, active-service undock deferral, active-service continuation, service-grant progress, movement confirmation/hold, new undock, new service demand, new dock, then general hold. The explicit conflict gives active or completing service priority over a simultaneous fresh undock.

DS-REC-01: Recovery is latched, permits no automatic retry, locks service and movement, and clears only on FRESH_RESET with released berth/ship context and both services quiescent; the reset cannot authorize docking, so later re-entry requires another FRESH_DOCK.

## Count, closure, and topology audit

DS-COUNT-01: The selected exact campaign tuple is `8 / 21 / 20 / 7`, within all medium-tier bounds without artificial padding.

DS-COUNT-02: The complete interaction recount is five boundary-input deliveries, twelve owner-to-owner fact flows, and four boundary-output deliveries; the gate-to-reporter fact lets reports expose current suppression of a retained clearance, fan-outs exist only where different consumers derive different facts, and route or delegation hops receive no count credit.

DS-TOPO-01: The eight semantic usages form one weakly connected boundary-relevant region beneath exactly one root with semantic depth 1..2; at most one behavior-free support container may be added without semantic credit.

DS-CASE-01: The twenty first-applicable cases cover fault, contradiction, successful and blocked recovery, service completion with and without simultaneous undock, active-service deferral and hold, service-grant activation/hold/withdrawal, release and dock confirmation, clearance persistence, new undock/service/dock admission, fresh-action inhibition, and the exhaustive stable remainder.

DS-SCN-01: The seven state-carrying families cover the nominal lifecycle, repair/resupply exclusion, freshness and readiness inhibition, explicit service/undock priority, permit gating, contradiction containment, and full recovery plus later fresh re-entry.

DS-PADDING-01: No credit is assigned to initialization, the root, context actors, support containment, typed record construction, routing declarations, analyzers, direct output restatements, or unreachable producer-inconsistent values; each counted usage, interaction, case, and scenario has a distinct responsibility or trace.

## Diversity decision

DS-BASE-01: The closest named baseline is replicate-1's Station Cargo-Transfer Verification Supervisor, whose organizing transaction admits offload, reconciles ship and warehouse evidence, and publishes verified-transfer outcomes.

DS-DIFF-01: The selected boundary differs: it contains no cargo, offload, ship-transfer, or warehouse-evidence quantity and instead contains berth/ship readiness plus independent repair and resupply occupancy signals.

DS-DIFF-02: State ownership and topology differ: PART-06 owns a cyclic dock/access lifecycle, while readiness and two-service facts converge through PART-04 before arbitration; there is no transfer-session state, independent two-source cargo completion reconciler, receipt-query path, or verified terminal state.

DS-DIFF-03: Priority and recovery differ: an active or completing docked service defeats simultaneous undock and consumes that fresh request, while recovery clears only from released/quiescent station context before a later fresh dock; replicate 1 instead preempts transfer for undock/service conditions and clears against neutral transfer evidence before later offload.

DS-DIFF-04: This is not an extension, repartition, or rename because cargo transfer can be removed from or added to the external service context without changing any input, owner-local relation, lifecycle transition, priority case, output, or completion claim in the selected system.

## Assumptions and claim boundary

DS-ASM-01: Freshness labels, same-evaluation berth/ship pairing, independent service status, one lifecycle at a time, and deterministic logical evaluations are explicit pilot assumptions rather than handbook- or seed-derived behavior.

DS-CLAIM-01: A service COMPLETE signal only releases generic access; the design does not verify repair, resupply, cargo transfer, physical docking, or physical undocking and does not claim safety, certification, production readiness, or game fidelity.

DS-DEFER-01: Physical mechanics, timing, retries, transaction identity, multiple vessels or berths, concurrent service execution, service identity continuity, cargo behavior, executable application code, formal proof, and unbounded temporal claims are deferred.

## Realizability questions retained for Model review

DS-QUESTION-01: Can trusted SysML-AADL/GUMBO forms publish PART-06's retained pre-state independently on INT-09 and INT-11 while consuming INT-12 in the same logical evaluation, without an algebraic cycle, copied state, or an additional semantic interaction?

DS-QUESTION-02: Can PART-04 express the total lifecycle-relative assessment over the listed finite inputs with owner-local contracts while PART-05 consumes only the resulting assessment, intent, and pre-state and does not reproduce readiness or service qualification?

DS-QUESTION-03: Can one ControlProposal, one LifecycleSnapshot, and the GatedControl fact on INT-17 preserve genuine local derivation in PART-07 and PART-08, keep exactly 21 end-to-end interactions, and avoid producer-inconsistent record values receiving case credit?

DS-QUESTION-04: Can the dependency-free analyzer enumerate all 72,576 snapshots, prove CASE-01 through CASE-20 gap-free and overlap-free under ordered semantics, demonstrate each credited case reachable, and execute the seven state-carrying traces within the harness watchdog?

## Model finding resolution

DS-MODEL-01: Accepted. The Model's extensional audit confirms that PART-01 through PART-08 each derive a behaviorally meaningful owner-local fact and that no credited owner is a copier, bundle, rerouter, or bijective renamer; generation shall retain the LOCAL-01 through LOCAL-10 allocation and the no-central-recomputation rule.

DS-MODEL-02: Narrowed to realization guidance. One explicit root System, at most one behavior-free uncredited Process, eight semantic owner Threads, 18 boundary refinement connections, and 12 direct owner-to-owner connections may realize the baseline; the 30 raw connection declarations still recount as exactly INT-01 through INT-21 and do not change containment or semantic metrics.

DS-MODEL-03: Narrowed to realization guidance. PART-06 may publish two separately traced prior-state values using an accepted prior-state form while consuming INT-12, provided both values denote the same retained pre-state, no present-value algebraic feedback or copied state is introduced, inspected record members are data attributes, and any necessary bijective port-wire encoding is specifically marked uncredited generated support.

DS-MODEL-04: Accepted. Independent enumeration confirms that the exact 72,576 boundary-input/pre-state snapshots have zero ordered-partition gaps, all CASE-01 through CASE-20 have witnesses, and the bounded obligation is tractable within the retained 180-second watchdog; generation must still retain and execute its own analyzer and seven ordered scenario traces.

DS-MODEL-05: Accepted. The checker limitation is handled by requiring named nonempty owner-local clauses, direct-product analyzer checks, exact metric/analyzer ownership agreement, source-hash binding, and narrow support-only trace rationales; descriptive ownership labels alone are not acceptance evidence.

## Final disposition

DS-DISP-01: Approved for Model generation without an architecture revision. The final baseline remains implementation-independent, uses the exact 8/21/20/7 medium tuple without padding, closes every owner and finite request/recovery path, satisfies the diversity card in all five named dimensions, and treats tool-specific mappings only as uncredited generated support.
