# Approved Design Selection — Docking and Service-Access Supervisor

## Decision scope and evidence

DS-BASIS-01: [Seed-grounded fact] The seed offers four alternative single-system scopes: ore-hold supervision, station cargo-transfer verification, docking-service supervision, and capacitor or support-system resupply verification. It supports their vocabulary but explicitly leaves finite interfaces, readiness, inhibition, ordering, priority, invalid-report behavior, fault interpretation, recovery, and responsibility allocation to this Designer.

DS-METHOD-01: [Handbook-derived control] Selection occurs before implementation and compares both primary controlled purposes and plausible responsibility allocations. Criteria are seed grounding, single-purpose cohesion, finite total behavior, genuine owner-local derivation, observable priority and recovery, hard-tier realizability, assumption burden, and diversity from accepted replicate 1.

DS-BOUND-01: [Campaign constraint] The retained choice must contain 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial cases, and 9..12 scenario families, with multiple state or decision owners and explicit priority, fault propagation, recovery, and composition.

DS-DIV-01: [Frozen diversity constraint] Accepted replicate-1 Small, Medium, and Hard systems center station cargo-transfer verification. Replicate 2 may not retain cargo admission, ship/warehouse evidence reconciliation, cargo completion, or an expanded or renamed offload transaction as its controlled purpose.

## Comparison of seed-required primary scopes

DS-SCOPE-01: [Unselected alternative] Ore-hold supervision would govern ore entry, nearly-full awareness, retention, and readiness for later offload. It is coherent and clearly distinct from transfer verification, but a hard realization would require unsupported capacity bands, extraction admission, reserve thresholds, and mining pause or halt priority; docking and service access would remain external rather than exploiting this seed's station lifecycle vocabulary.

DS-SCOPE-02: [Excluded alternative] Station cargo-transfer verification directly supports offload request, ship transfer status, warehouse evidence, and completion reporting, but it is the organizing purpose of all accepted replicate-1 systems. Selecting it would violate the diversity card even if owners, counts, names, or phases changed.

DS-SCOPE-03: [Selected alternative] Docking-service supervision supports logical docking readiness, docked-service access, and undocking status while excluding physical docking. Vessel lifecycle, berth reports, service quiescence, an access gate, and two alternative recovery anchors form one cohesive controlled purpose with natural hard-tier priority, fault propagation, recovery, and composition obligations.

DS-SCOPE-04: [Unselected alternative] Capacitor and support-system resupply verification is coherent and diversity-compliant, but the seed mixes general ship-status verification with capacitor recharge and supplies no resource sufficiency or completion semantics. A hard design would need more invented quantity, target, multi-resource, and service-provider policy than the selected access supervisor.

DS-SELECT-01: [Decision] The selected primary scope is docking and undocking service-access supervision: admit one bounded authorization, require station/vessel concordance before opening logical access, require service quiescence and access closure before release, propagate faults to immediate revocation, and recover only by rebasing to a verified clear or docked anchor.

## Responsibility-allocation alternatives within the selected scope

DS-ALT-01: [Selected architecture] A distributed lifecycle-and-gate design separates four boundary classifications, request-ledger admission, cross-evidence coherence, lifecycle state, berth state, access-gate state, recovery state, three action-proposal owners, strict arbitration, and atomic result composition. All 15 usages derive a distinct owner-local fact, including `PART-08`'s combination of qualified berth-transition evidence with its prior berth state, and the 35-flow graph exposes every safety, priority, and composition dependency.

DS-ALT-02: [Rejected architecture] A centralized docking manager could own lifecycle, berth interpretation, service access, recovery, actions, and reports in one state machine. It would be compact, but hard-tier size would encourage wrappers and would hide whether access closure, release sequencing, priority, and public composition are locally derived or centrally recomputed.

DS-ALT-03: [Rejected architecture] Symmetric vessel-side and station-side coordinators with a handshake arbiter would make the two external reports appear peer-like. Their responsibilities are not symmetric: the vessel contributes lifecycle evidence, the station contributes berth commitment, and the service aggregator independently constrains access and undocking; symmetry would duplicate policy and obscure the gate owner.

DS-ALT-04: [Rejected architecture] A generic docked-service broker could treat cargo transfer, repair, resupply, and capacitor recharge as interchangeable jobs behind one access queue. That would import multiple candidate scopes, require invented service capacity and cross-service priority, and risk making cargo or resupply completion the organizing transaction.

DS-ALT-05: [Rejected architecture] A retained event ledger could record every pilot, vessel, station, and service event and derive the latest access state from history. It introduces log ordering, replay, persistence, and reconciliation semantics absent from the seed and shifts the purpose from bounded supervision to transaction-record management.

DS-DEC-01: [Selection rationale] `DS-ALT-01` is retained because five genuine state owners separate request freshness, supervisory lifecycle, berth commitment, logical access, and recovery; `PART-06` qualifies berth evidence without selecting a desired next berth state, while `PART-08` owns the prior-state-dependent berth transition; three proposal owners make docking, access, and undocking eligibility inspectable; and the arbiter and composer can be checked without authorizing any owner or analyzer to reproduce the whole policy.

## Selected finite policy

DS-COUNT-01: [Selected target] The exact hard-tier tuple is 15 semantic usages, 35 typed directed semantic interactions, 29 nontrivial contract cases, and eleven scenario families. The target has one root, one weak semantic region, and either a flat 15-node/35-edge/depth-one realization or one uncredited support container with 16 total nodes/41 raw edges/depth two.

DS-BOUNDARY-01: [Selected boundary] Five root inputs are `AccessRequest`, `VesselStatus`, `StationReport`, `ServiceActivity`, and `ControlEvent`; the sole root output is `DockingAccessResult`. Cargo requests, ship-transfer reports, warehouse reports, transfer outcomes, physical motion, and service-specific completion remain outside.

DS-OWNER-01: [Ownership decision] Request ledger, docking lifecycle, berth commitment, service gate, and recovery remain separately owned by `PART-05`, `PART-07`, `PART-08`, `PART-09`, and `PART-10`; classifications, coherence, three proposal relations, strict arbitration, and public composition remain distinct decisions. `PART-08` earns ownership credit only by mapping qualified fault, recovery-anchor, station-progress, departure-completion, or no-event evidence together with `In(berthState)` under the retained precedence; copied prior-state views and carried qualification fields are uncredited.

DS-POLICY-01: [Priority decision] The fixed order is fault or closed-recovery revocation, departure completion, access closure, departure authorization, release request, approach authorization, access opening, fresh dock clearance, then hold. An active service blocks undock admission; gate closure and a later release request are separate evaluations.

DS-REC-01: [Recovery decision] Any emergency or evidence fault abandons the active authorization token, quarantines lifecycle, marks berth unknown, closes access, and latches recovery. Fresh reset enters reconciling; only a later concordant clear or docked verification establishes a new healthy anchor, and ordinary work requires later request resubmission.

DS-FRESH-01: [Freshness decision] The ledger retains the last accepted authorization-start token. Same-token dock is duplicate, alternate dock while busy is deferred, matching access and undock continue an ordinary authorization, and fresh alternate-token access after docked recovery creates a new authorization rather than restoring the abandoned token.

DS-EVID-01: [Evidence decision] Vessel-docked and station-secured evidence may arrive in either order but must be token- and phase-concordant before access opens. `PART-06` owns that qualification and sends `PART-08` a `BerthTransitionEvidence` event class rather than `nextBerthState` or a one-to-one surrogate. Service quiescence is independently required before access and undock admission; station release and vessel departure remain distinct progress observations.

## Assumptions selected beyond the source

DS-ASM-01: [Pilot abstraction] The two-token request scheme, one authorization and berth bound, finite enums, logical snapshot evaluation, event freshness, desired-level command interpretation, and exact request resubmission rules are experiment assumptions rather than seed facts.

DS-ASM-02: [Pilot abstraction] The station docking authority, vessel lifecycle authority, service aggregator, and recovery authority are treated as distinct external responsibilities. Their truthfulness, physical effectiveness, timing, and independence are not established by the seed or this abstract.

DS-ASM-03: [Pilot abstraction] Access opening requires both docked-vessel and secured-berth evidence, undock requires quiescent service and ordered gate closure, and recovery offers clear and docked anchor variants. These policies are selected for finite supervisory coherence and are not source requirements.

## Diversity disposition

DS-CLOSE-01: [Closest baseline] The closest accepted baseline is replicate-1 Hard `Station Cargo-Transfer Evidence Coordinator`, which admits an offload, reconciles ship and warehouse evidence, owns transfer-session and evidence lifecycles, arbitrates cancellation and progress, and freezes an active transfer through reset-then-verification recovery.

DS-DIFF-01: [Boundary difference] The selected system replaces cargo request, dock context, ship-transfer report, warehouse report, and transfer result with access request, vessel lifecycle, station berth report, docked-service activity, recovery control, and a docking-access result. It has no cargo completion claim.

DS-DIFF-02: [State-ownership difference] The selected state owners are request freshness, docking lifecycle, berth commitment, logical access gate, and recovery. There are no ship-transfer-evidence or warehouse-evidence owners, and access gating is an independent retained responsibility absent from the baseline.

DS-DIFF-03: [Interaction-topology difference] The baseline joins parallel ship and warehouse transaction evidence into transfer progress. The selected graph instead qualifies vessel/berth evidence around a lifecycle, feeds independent service quiescence into admission and coherence, and separates docking, access, and undocking proposals around a stateful gate.

DS-DIFF-04: [Priority-policy difference] The baseline prioritizes fault, completion, cancellation, warehouse verification, ship progress, and fresh transfer. The selected policy prioritizes revocation, gate closure, release ordering, and departure progression; service activity defers undocking rather than competing as transfer evidence.

DS-DIFF-05: [Recovery-policy difference] The baseline retains and resumes a frozen active transfer after reset and later verification. The selected system destroys the active authorization token, enters quarantine, and chooses either a clear or docked evidence anchor; all later work starts from a resubmitted alternate token.

DS-NOT-EXT-01: [Diversity conclusion] The selection is not an extension, repartition, or rename of the baseline because no finite input, state, proposal, action, output, case, or scenario can initiate, reconcile, verify, or complete cargo transfer. Cargo may occur only as unobserved external context while access is open, and it cannot advance the supervisor.

## Evidence target and resolved Model review

DS-VERIFY-01: [Verification target] Acceptance requires source conformance; the exact `15/35/29/11` semantic tuple; one root; one weak semantic region; either `15 nodes/35 raw edges/depth 1` or `16 nodes/41 raw edges/depth 2`; total, mutually exclusive owner-local contracts; bidirectional trace coverage; an independent-reference comparison across the declared 8,400 input snapshots and 1,530 prior-state tuples, exactly 12,852,000 one-step evaluations, or a proven partition-preserving equivalent; witnesses for every case and scenario; and architecture-stage plus final Sireum typechecking.

DS-VALID-01: [Validation target] Later Designer review shall separately judge whether the realized model preserves docking-access purpose, boundary, evidence ordering, service gating, priority, token-abandoning recovery, diversity, and deferred claims. Mechanical passage alone is not validation.

DS-QUESTION-01: [Resolved realizability finding] The supported SysML-AADL/GUMBO subset can expose the four prior views without a combinational cycle when `INT-13` through `INT-16` publish from each owner's `In(localState)` and each owner separately constrains post-state. Model generation shall use this pattern, shall declare contract-inspected flat-record members as attributes, and shall not substitute post-state for prior evidence.

DS-QUESTION-02: [Resolved realizability finding] Exactly 35 semantic interactions remain sufficient after the local `INT-20` payload refinement. The retained flows provide four prior views, independent state-owner effects, admission fan-out, three proposals, one priority directive, and composition inputs without a router, mirror state, implicit sibling read, or extra support flow.

DS-QUESTION-03: [Resolved feasibility finding] The exact 12,852,000-tuple bounded comparison is feasible within the retained mechanical watchdog based on the Model's host evidence, but that evidence is not a pass result. Generation shall still provide a source-hash-bound analyzer with an independent reference relation, separate owner evaluators, zero gaps, overlaps, mismatches, interaction errors, priority errors, and composition errors, plus witnesses for all 29 cases and all eleven scenario families.

DS-QUESTION-04: [Resolved realizability finding] Owner-local finite cases over received frames and `In(localState)` can express both recovery anchors, permanent token abandonment, both docking-evidence orders, and access closure followed by a later release evaluation without weakening totality or priority exclusivity. The next evaluation may consume the retained post-state as its new `In(...)` value; no timing, scheduling, or execution claim is authorized.

DS-LOCAL-01: [Final local-contract expectation] Every `PART-01` through `PART-15` shall expose one total and mutually exclusive relation over only assigned inputs and, for state owners, only its own prior state; all output fields and retained post-state shall be constrained. `PART-08` shall locally select `UNKNOWN`, `AVAILABLE`, `RESERVED`, `SECURED`, `RELEASED`, or retention from qualified evidence and `In(berthState)` exactly as specified by `CASE-25`, without duplicating `PART-06` coherence.

DS-SUPPORT-01: [Generated-support allowance] The only uncredited support permitted is finite enum and flat attribute-record definitions, safe initialization, at most one behavior-free container, at most six transparent root delegations, tuple-consistency clauses, static inventories, analyzer fixtures, and visualization-only context. Support may not add semantic usages or interactions, alter endpoint meaning, receive owner credit, or carry hidden or mirror state.

DS-DEFER-01: [Deferred claims] Code generation, application execution, Logika proof, physical docking and service validation, timing and performance, game fidelity, probabilistic safety, certification, and production readiness remain `not-run` or unclaimed.

DS-AUTH-01: [Final authorization] The Model's berth-ownership finding is accepted and resolved by the revised `PART-06`/`INT-20`/`PART-08` boundary. Model generation is authorized against the approved `15/35/29/11` baseline and may not silently change the boundary, owners, finite domains, priority, fault propagation, recovery, composition, diversity dimensions, counts, support allowance, or deferred claim boundary.
