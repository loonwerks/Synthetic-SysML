# Initial Design Selection — Ore-Hold Mining Guard Supervisor

## Decision basis and evidence boundary

DS-BASIS-01: The frozen seed offers four alternative single-system scopes and leaves exact purpose, finite boundary, policy, ownership, interaction structure, priority, invalid handling, and recovery to the tier-specific Designer. The diversity card additionally prohibits station cargo-transfer verification and requires a different controlled purpose plus at least two genuine architectural differences from replicate 1.

DS-BOUNDS-01: The declared small campaign requires `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, `4..6` scenario families, exactly one principal decision owner, and explicit nominal, boundary, invalid/fault, and recovery behavior.

DS-FACT-01: Source-grounded evidence is limited to the mining-frigate and pilot context; ore entering an ore hold; nearly-full, asteroid-depletion, mining-laser-overheat, and target-lock-interference vocabulary; mining continuation, pause, or halt; pilot notification; cargo retention; docking and station services; cargo transfer and verification; and capacitor or support-system resupply.

DS-LIMIT-01: The source does not select a numerical threshold, finite encoding, supervisory state, responsibility owner, priority policy, validity treatment, recovery sequence, timing, physical effectiveness, or claim of safety, completion, or production readiness.

DS-METHOD-01: Selection favors one implementation-independent controlled purpose, an exact finite and closed boundary, nonidentity owner-local responsibilities, one unambiguous principal policy owner, a total bounded partition, distinct scenarios, and a low unsupported-claim burden. Count proximity is not a selection benefit.

## Comparison of all seed scope alternatives

DS-SCOPE-01: **Ore-hold supervision before offload is selected.** A pilot request, qualitative hold guard, and source-named mining-support observations can support one coherent controlled question: whether further logical mining may continue, whether a nearly-full guard is active, and when a deliberately fresh resume may recover mining. Cargo transfer remains absent except as an unmodeled possible environmental cause of a later cleared hold observation.

DS-SCOPE-02: **Station cargo-transfer verification is rejected and prohibited.** It is the organizing purpose of all accepted replicate-1 systems and would violate the diversity card even if its request, evidence fields, state names, or owner partition were changed.

DS-SCOPE-03: **Docking and undocking service-access supervision is rejected for this run.** It could provide a different controlled purpose, but the source supplies uneven docking and undocking semantics and no readiness or service-access ordering. A small model would therefore require more invented lifecycle and authority rules than the selected qualitative ore-hold guard.

DS-SCOPE-04: **Capacitor and support-system resupply verification is rejected for this run.** It is diversity-compliant, but the source conflates general ship-status verification with capacitor recharge and supplies no bounded sufficiency or completion semantics. A credible verifier would require an invented correlation protocol whose shape risks returning to replicate-1 evidence reconciliation.

DS-SCOPE-05: The selected scope does not absorb physical extraction, physical cargo retention, cargo transfer, docking, warehouse storage, repair, or resupply. Its sole controlled purpose is pre-offload mining continuation and protection based on a qualitative ore-hold guard and selected mining-support applicability.

## Responsibility-allocation alternatives

DS-ALT-01: **Selected Alternative A — stateful request fact owner, two qualification owners, one principal guard decision owner, and two output derivation owners.** Request freshness and priority, hold qualification, and combined mining-support qualification each derive a distinct upstream fact. One Ore-Hold Decision Owner holds the guard mode and all ordered cases; separate owners derive mining command and status/readiness outputs.

DS-ALT-02: **Alternative B — one consolidated ore-hold governor plus output ports.** A single usage would qualify every input, retain request and guard state, select cases, and emit all outputs. This is compact but naturally provides only one meaningful semantic usage; reaching the small-tier minimum would require pass-through adapters, identity translators, or arbitrary report splitters.

DS-ALT-03: **Alternative C — parallel capacity and mining-condition governors followed by an arbiter.** One stateful governor would decide capacity protection while a peer would decide support protection and request admission. Their arbiter would need to reconcile two proposed modes, duplicate halt and invalid priorities, and either become a second principal decision owner or recompute both policies.

DS-ALT-04: **Alternative D — pilot-request owner also owns recovery and mining mode.** Hold and support owners would send facts directly to the request owner, which would qualify command intent and select protection transitions. This allocation makes environmental protection subordinate to the command channel and couples request-protocol change with ore-hold state policy.

DS-COMP-01: Alternative A satisfies the one-principal-owner requirement without centralizing every derivation: three upstream facts are owned once, the principal owner composes them atomically, and two downstream owners map the complete resolution without inspecting raw inputs. Alternatives B and C create padding or competing policy; Alternative D weakens cohesion between state and protected condition.

DS-COMP-02: Each selected nonprincipal usage earns semantic credit through a nonidentity local fact. Request Freshness and Priority derives temporal edges and conflicts; Hold Guard Qualification collapses invalid raw pairs; Mining Support Qualification reduces sixteen combinations to three classes; command and reporting owners each perform many-to-one mappings from a complete resolution.

## Selected finite policy and tradeoffs

DS-DEC-01: Alternative A is selected at the exact campaign point `6 semantic usages / 11 semantic interactions / 11 nontrivial cases / 5 scenario families`, inside the inclusive small bounds `5..8 / 7..14 / 6..12 / 4..6`.

DS-DEC-02: The selected principal controlled purpose is prevention of further logical mining authorization after a qualitative ore-hold guard or unacceptable mining-support evidence, plus deliberate fresh recovery. The system does not admit, coordinate, cancel, or verify an offload.

DS-POLICY-01: Cross-input case priority is invalid assessment, valid level-sensitive halt, valid nearly-full guard, valid support blockage, then current-mode behavior. The capacity guard outranks a simultaneous valid support block so the advisory later-offload indication remains visible.

DS-POLICY-02: Valid pilot-request priority is halt before fresh resume before fresh start before no fresh request. Resume beating simultaneous start deliberately prevents an idle start from being admitted through an ambiguous two-request edge.

DS-POLICY-03: `ContinueMining` is allowed exactly for next mode `Mining`; `ReadyForLaterOffload` is allowed exactly for next mode `CapacityHold`. The readiness value reports only the nearly-full supervisory condition and is never transfer evidence.

DS-POLICY-04: A protected mode first requires an acceptable clearing or restoration evaluation to enter `RecoveryReady`. Any same-evaluation request is discarded, `FreshStart` is inapplicable there, and only a later `FreshResume` restarts mining. A valid halt instead abandons the episode to `Idle`.

DS-TRADE-01: Storing request levels even while their shared status is invalid trades responsiveness for replay resistance: a high level that becomes valid is not automatically treated as fresh. The pilot must observe low and then high before a new edge exists.

DS-TRADE-02: Combining asteroid, laser, and target observations into one `SupportAssessment` keeps the system small and gives them a common stop/recovery response. It does not claim those conditions have equal physical causes, severity, or operational effect.

DS-TRADE-03: A single qualitative `NearlyFull` boundary avoids inventing capacity units or thresholds. It supports bounded boundary behavior but cannot establish actual remaining capacity or physical offload readiness.

## Diversity decision against replicate 1

DS-DIV-01: The closest baseline is the accepted replicate-1 Small Station Cargo-Transfer Verification Supervisor, whose organizing transaction admits an offload request, tracks transfer phase and rearm state, coordinates ship progress with warehouse receipt evidence, commands offload, and publishes transfer status and a verification finding.

DS-DIV-02: **Boundary differs.** The selected system has pilot mining-control levels, one qualitative hold observation, and three mining-support observations as inputs, with mining command, guard status, and an advisory later-offload readiness indication as outputs. It has no offload request, docking sample, ship progress, warehouse receipt, transfer command, transfer status, or verification finding.

DS-DIV-03: **State ownership differs.** Replicate 1 organizes state around `transferPhase` and `rearmRequired` in a Transfer Decision Owner. This design gives request-edge memory to PART-01 and gives PART-04 only `guardMode = {Idle, Mining, CapacityHold, ConditionHold, RecoveryReady}`; there is no transfer phase, receipt applicability memory, or completion state.

DS-DIV-04: **Interaction topology differs.** Replicate 1 reconciles four independent transfer/docking evidence qualifications at a transfer owner. This design has one stateful request-priority derivation and two environmental qualifications feeding a mining-guard decision; no ship-to-warehouse evidence paths or completion correlation exist.

DS-DIV-05: **Priority policy differs.** Replicate 1 orders invalidity, rearm, active transfer evidence, unexpected evidence, request admission, and phase-sensitive verification. This design orders invalidity, level-sensitive halt, qualitative capacity guard, support blockage, and guard-mode behavior, while request subpriority is halt over resume over start.

DS-DIV-06: **Recovery policy differs.** Replicate 1 neutralizes transaction evidence and later accepts a fresh offload request. This design observes guard clearing or support restoration, enters a distinct `RecoveryReady` mode, discards a same-evaluation request, rejects a start request, and requires a later fresh resume; no transfer evidence is neutralized or replayed.

DS-DIV-07: The selected system is not an extension, expansion, repartition, or rename of replicate 1 because its completion claim has been removed rather than generalized, its controlled object is mining continuation rather than cargo movement, its state describes protection and recovery rather than a transaction, and station/warehouse evidence is outside the modeled boundary. Adding a transfer state machine would violate both PURPOSE-01 and PASS-09 of the System Abstract.

## Count, ownership, and partition audit

DS-COUNT-01: PART-01 through PART-06 are exactly six responsibility-bearing semantic usages. Root, context actors, types, ports, behavior-free containment support, and routing receive no semantic credit.

DS-COUNT-02: INT-01 through INT-11 are exactly eleven typed directed end-to-end semantic interactions: three boundary-input deliveries, five inter-usage flows, and three boundary-output deliveries. Concrete support hops may refine but never increase this inventory.

DS-COUNT-03: CASE-01 through CASE-11 are exactly eleven nontrivial cases owned solely by PART-04. Intake qualification functions, request-edge equations, initialization, output mappings, invariants, and analyzer computations are mandatory but uncounted.

DS-COUNT-04: SCN-01 through SCN-05 are exactly five scenario families covering nominal admission/persistence, nearly-full boundary protection, invalid/support fault behavior, command priority/freshness, and protected recovery.

DS-OWN-01: PART-04 is the only principal decision owner and only guard-mode owner. PART-01 is a subordinate request-fact and request-state owner; PART-02 and PART-03 own separate qualifications; PART-05 and PART-06 own complete output relations.

DS-OWN-02: The final ownership audit found no owner whose credited behavior is copying, preserving, bundling, routing, or one-to-one renaming. No downstream owner may inspect raw inputs to duplicate an upstream derivation, and the bounded analyzer cannot substitute for owner-local contracts.

DS-PART-01: Ordered global cases cover all invalid assessments, valid halt, guard boundary, and support blockage. After those exclusions, the state cases cover every `Idle`, `Mining`, `CapacityHold`, `ConditionHold`, and `RecoveryReady` valuation and every remaining request disposition.

DS-PART-02: Fresh paths are closed explicitly: start admission requires `FreshStart` only in `Idle`; protected clearing/restoration consumes same-evaluation edges; recovery requires later `FreshResume`; held levels and invalid-to-valid high levels are not fresh; halt records competing levels before release.

DS-RECOUNT-01: After completing the priority, freshness, invalid, clearing, restoration, re-protection, and halt-abandonment rules, the full interaction recount remains exactly INT-01 through INT-11. No revision introduced a new producer-consumer meaning.

## Realization constraints and Model-review questions

DS-REAL-01: One explicit root, semantic depth `1..2`, one weak semantic region, exact finite domains, owner-local state, complete post-state outputs, and bidirectional traces are required. Tool-required support is permitted only when behavior-free, narrowly justified, and uncredited.

DS-REAL-02: The retained model shall preserve the exact policy and output equations, all eleven higher-priority exclusions, both independent state owners, the 40,960-snapshot analysis domain, and all five multi-step scenario families. It shall not add transfer, docking, warehouse, completion, physical-capacity, timing, or execution claims.

DS-QUESTION-01: Can PART-01's request-edge state and PART-04's independent guard-mode state be expressed in separate owner-local initialization and compute contracts without PART-04 recomputing freshness?

DS-QUESTION-02: Can CASE-01 through CASE-11 be encoded as effectively exclusive ordered obligations whose resolution constrains next mode and same-evaluation outputs, including the equivalence `ContinueMining` exactly when `nextMode = Mining`?

DS-QUESTION-03: Can one root realize exactly six semantic usages and eleven end-to-end interactions at semantic depth `1..2` while any SysML-AADL-required containment or delegation remains behavior-free and does not duplicate semantic flows?

DS-DISP-01: The initial design passes Designer review. It selects a diversity-compliant purpose, compares all seed scopes and four responsibility allocations, freezes a total finite policy, assigns every state and case owner, meets the small bounds without padding, and leaves three concrete realizability questions for Model review rather than silently changing the abstract around assumed tool constraints.
