# Final Design Selection — Station Cargo-Transfer Evidence Coordinator

## Decision scope and evidence

DS-BASIS-01: [Seed-grounded fact] The seed offers four alternative single-system scopes—ore-hold supervision, station cargo-transfer verification, docking-service supervision, and capacitor or support-system resupply verification—and explicitly leaves finite interfaces, readiness, ordering, priority, invalid-report handling, fault interpretation, and recovery to this Designer.

DS-METHOD-01: [Handbook-derived control] The selection compares the seed-required primary scopes and plausible allocations before freezing architecture. Criteria are purpose coherence, source-vocabulary grounding, finite total behavior, owner-local responsibility, observable priority and recovery, hard-tier realizability, and limited unsupported assumption burden.

DS-BOUND-01: [Campaign constraint] The retained choice must contain 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial cases, and 9..12 scenario families, with multiple state or decision owners plus explicit priority, fault propagation, recovery, and composition.

DS-DIV-01: [Campaign fact] The frozen diversity card is empty, so no baseline-distance constraint applies. The design is selected on the seed and hard-tier criteria alone, and no diversity credit is claimed.

## Comparison of seed-required primary scopes

DS-SCOPE-01: [Unselected alternative] Ore-hold supervision has a clear onboard purpose around incoming ore, nearly-full awareness, retention, and later offload readiness. It is credible at smaller scale, but a hard design would need invented capacity bands, extraction admission, cargo reservation, and mining interruption policy while still stopping short of station transfer verification.

DS-SCOPE-02: [Selected alternative] Station cargo-transfer verification directly uses the seed's offload request, ship-side transfer status, station or warehouse evidence, and completion verification vocabulary. Independent ship and warehouse evidence naturally supports correlation, phase ownership, fault propagation, cancellation priority, recovery, and result composition without claiming physical transfer.

DS-SCOPE-03: [Unselected alternative] Docking-service supervision can govern readiness and status for docking, undocking, and docked-service access while excluding the physical mechanism. At hard scale it would either import cargo, repair, and resupply as unrelated service lanes or invent a more complete docking lifecycle than the seed supplies, weakening single-purpose cohesion.

DS-SCOPE-04: [Unselected alternative] Capacitor and support-system resupply verification is coherent and bounded, but the source mixes general ship-status verification with capacitor recharge. A hard realization would require unsupported resource sufficiency, service quantity, completion, and multi-support-system policies with less direct two-party evidence than cargo transfer offers.

DS-SELECT-01: [Decision] The selected primary scope is station cargo-transfer verification: admit one correlated offload attempt, qualify dock readiness, reconcile ship and warehouse evidence, select logical transfer or verification actions, report completion only from phase-valid matching evidence, inhibit on fault, and recover through external reset and later verification.

## Responsibility-allocation alternatives within the selected scope

DS-ALT-01: [Selected architecture] A distributed evidence-coordination design separates four input classifications, request-history admission, cross-channel coherence, transfer-session state, ship-evidence state, warehouse-evidence state, recovery state, three proposal owners, strict arbitration, and atomic public composition. Each of 15 usages derives an owner-local fact, and the revised 35-flow graph exposes the required composition chain while delivering accepted-cancellation facts directly to both evidence-state owners.

DS-ALT-02: [Rejected architecture] A centralized transfer manager could own request history, evidence, recovery, commands, and reports in one state machine. It would be compact, but reaching the hard tier would require wrapper usages, and fault propagation, state ownership, priority proposals, and composition would remain opaque or centrally recomputed.

DS-ALT-03: [Rejected architecture] Symmetric ship-side and warehouse-side coordinators with a negotiation bridge would give each external party a local lifecycle. The apparent symmetry is misleading because ship transfer progress and warehouse receipt evidence have different phases; duplicating admission, recovery, and result policies would pad owners and introduce agreement timing not supplied by the seed.

DS-ALT-04: [Rejected architecture] An event-ledger design could retain every request and report then derive the latest transfer state from history. That introduces storage depth, event ordering, replay, and log-integrity semantics absent from the seed and shifts the purpose from bounded supervision to transaction-record management.

DS-ALT-05: [Rejected architecture] A dock-service gateway could make cargo transfer one service among repair and resupply and arbitrate shared dock access. This imports other candidate scopes, changes the selected primary purpose, and invents cross-service capacity and priority policies contrary to the seed's alternative-boundary instruction.

DS-DEC-01: [Selection rationale] `DS-ALT-01` is retained because five genuine state owners separate request freshness, session phase, ship evidence, warehouse evidence, and recovery; independent proposal owners make cancellation and fault priority observable; and the arbiter and composer can be checked without allowing any single usage or analyzer to reproduce the whole policy.

## Approved final target

DS-COUNT-01: [Selected target] The exact campaign tuple is 15 semantic usages, 35 semantic interactions, 28 nontrivial contract cases, and eleven scenario families. The physical target has one System root, exactly one behavior-free containment usage, one semantic responsibility layer, depth two, one weak region, exactly six uncredited root boundary delegations, and exactly 41 raw connections.

DS-OWNER-01: [Ownership decision] Request history, transfer session, ship evidence, warehouse evidence, and recovery remain separately owned by `PART-05`, `PART-07`, `PART-08`, `PART-09`, and `PART-10`; coherence, proposal relations, strict arbitration, and public composition remain separate decisions.

DS-POLICY-01: [Priority decision] The fixed order is fault or closed recovery, completion, matching cancellation, warehouse verification, ship progress, fresh start, then ordinary hold. Fault/start, fault/cancel, and cancel/progress conflicts require explicit witnesses.

DS-REC-01: [Recovery decision] Any emergency or evidence fault latches recovery and freezes an active attempt. Fresh reset moves latched to recovering; only a later fresh verification returns healthy; both control evaluations inhibit ordinary work, and progress resumes only on a subsequent evaluation.

DS-FRESH-01: [Freshness decision] The request ledger retains the last accepted token. The same token is duplicate, the alternate token is fresh only when idle and dock-ready, an alternate token while busy is deferred, and any request presented during recovery must be resubmitted after recovery opens.

DS-EVID-01: [Evidence decision] Acceptance requires exact structure, typechecking, trace coverage, owner-local contract inspection, exhaustive 4,838,400-snapshot comparison, all case and scenario witnesses, and separate Designer validation. Execution, physical validation, and formal proof remain deferred.

## Model finding disposition and selected revision

DS-REV-01: [Accepted Model finding] The baseline omitted a causal input needed by `PART-08` and `PART-09`: under identical report, control, prior-session, and prior-evidence values, accepted cancellation requires `CLEAR` while no request requires retention. The finding is accepted as a realizability defect, not a domain-policy change.

DS-REV-02: [Narrow correction] Add only `INT-34` and `INT-35`, direct `AdmissionDecision` deliveries from `PART-05` to `PART-08` and `PART-09`. This changes semantic interactions from 33 to 35 and raw connections from 39 to 41; it changes no usage, case, scenario, finite type, owner, behavior, priority, recovery rule, or exclusion.

DS-LOCAL-01: [Local-contract expectation] Each evidence owner combines its own `In(...)` evidence state, its qualified update or freeze input, and direct admission input under precedence `inhibition/fault freeze > accepted cancellation clear > accepted start clear initialization > qualified progress > retention`. Neither coherence nor session may forward or recreate admission.

DS-ANA-01: [Bounded end-to-end obligation] The analyzer shall compare an independent reference relation with all acquisition, assessment, admission, coherence, state-owner, proposal, arbitration, and composition relations over exactly 4,838,400 one-step evaluations, check all 35 interaction values, and execute all eleven ordered scenario families with witnesses for all 28 cases.

DS-SUPPORT-01: [Generated-support allowance] Allowed uncredited support remains finite enum and flat record definitions, safe initialization, one behavior-free container, six root delegations, tuple-consistency clauses, inventories, analyzer fixtures, and visualization-only context; it may add no semantic behavior, owner credit, or connection.

DS-DEFER-01: [Deferred claims] Code generation, application execution, Logika proof, physical cargo or docking validation, timing and performance, game fidelity, probabilistic safety, certification, and production readiness remain `not-run` or unclaimed.

## Resolved Model review questions

DS-QUESTION-01: [Resolved realizability question] The supported subset can expose all prior-state views from `In(owner_state)` and constrain post-state from received directives, producing state-delayed feedback rather than a combinational cycle. No owner centralization is authorized.

DS-QUESTION-02: [Resolved realizability question] The 4,838,400 one-step product remains feasible without reducing any domain. Generation shall use separate visible reference and owner-pipeline evaluators, compare every interaction, state, and result value, and retain bounded per-case witnesses without materializing the Cartesian product.

DS-QUESTION-03: [Resolved realizability question] Exactly 35 semantic interactions can be lowered with the unchanged six uncredited transparent root delegations for exactly 41 raw connections, compatible flat enum or record ports, exact trace coverage, and one weak region. No additional support connection is authorized.

DS-QUESTION-04: [Resolved realizability question] Separate ports and explicitly disjoint owner-local compute cases can express simultaneous snapshots. Every lower-priority guard shall exclude higher-priority fault or recovery conditions, and reset and verification remain separate inhibited evaluations.

DS-AUTH-01: [Final authorization] Model generation is authorized against the approved `15/35/28/11` baseline. It may not silently change owners, finite domains, priority, recovery, the exact six-delegation and 41-raw-connection target, generated-support allowances, or the deferred claim boundary.

