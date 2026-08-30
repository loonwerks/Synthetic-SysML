# Approved Design Selection — Navigation and Obstacle-Awareness Use Supervisor

## Decision to be made

SEL-01: Select a coherent medium-tier system purpose and responsibility allocation that is grounded by the frozen seed, satisfies the replicate-2 diversity card, and does not extend or repartition any replicate-1 eligibility or observation-delivery system.

SEL-02: The decision criteria are source and claim discipline, distinct controlled purpose, finite contract completeness, meaningful distributed ownership, explicit conflict and recovery behavior, exact medium-tier structure, model realizability, and usefulness of later bounded analysis.

## Candidate primary scopes from the seed

ALT-SCOPE-01: Battery-status assessment would obtain and classify qualitative battery status for drone-control use. It is strongly grounded by the source's only described action and differs from the replicate-1 primary purposes, but a medium 8–12-owner allocation would risk padding a narrow one-flow assessment or inventing unsupported battery physics and policy.

ALT-SCOPE-02: Navigation and obstacle-awareness supervision uses the named GPS, inertial, barometric, and obstacle-sensor vocabulary to control whether drone control may use those logical evidence classes. It supports several genuine qualification owners, a basis owner, an awareness owner, conflict arbitration, one recovery owner, and a joint outcome owner without claiming navigation or avoidance performance.

ALT-SCOPE-03: Power-and-propulsion availability would combine selected-battery, power-management, and explicit four-engine configuration evidence. It could sustain a medium allocation, but any sufficiency, redundancy, thrust, controllability, or alternating-propeller policy would be a larger inference from structure-only source facts than the selected evidence-use policy.

DEC-SCOPE-01: Select `ALT-SCOPE-02`. It best supports a non-padded medium structure and an explicit, reviewable claim boundary while remaining materially separate from sortie eligibility, camera acquisition, radio delivery, battery assessment, and propulsion availability.

## Responsibility-allocation alternatives within the selected scope

ALT-ARCH-01: A centralized supervisor would read all six boundary inputs, own the recovery phase, choose one directive, and publish all outputs. This minimizes internal interactions but concentrates qualification, conflict policy, state, and output semantics in one owner; it does not satisfy the campaign's required cooperating decision or qualification ownership in a meaningful way.

ALT-ARCH-02: Two independent channel supervisors would publish a navigation-use result and an obstacle-awareness result directly to drone control, leaving priority and recovery conflicts to the external recipient. This preserves channel locality but moves the system's principal controlled decision and fresh-reset recovery policy outside the selected boundary.

ALT-ARCH-03: A staged convergence allocation uses four channel qualifiers; separate navigation-basis and awareness-condition owners; a constraint-proposal owner; an event-priority arbiter; one recovery-latch owner; and one joint outcome owner. Typed facts converge once, state feedback is limited to pre-state arbitration, and no raw evidence reaches a downstream decision owner.

DEC-ARCH-01: Select `ALT-ARCH-03`. It provides ten cohesive semantic responsibilities and 21 necessary interactions, exposes at least four cooperating qualification or decision owners, localizes the only state, supports a complete finite partition, and keeps all boundary outputs consistent under one outcome relation.

## Selected finite policy decisions

DEC-POL-01: Use five-valued navigation evidence and five-valued obstacle evidence, a four-valued motion context, and a four-valued event with an explicit combined force-hold/reset value. These are pilot abstractions chosen to make validity, staleness, degradation, current indication, active context, force-hold, reset, and simultaneous event conflicts independently testable.

DEC-POL-02: Select navigation-basis precedence `FULL`, `RELATIVE`, `LIMITED`, then `UNUSABLE` from three owner-local assessments. The labels classify logical evidence-use combinations only and make no accuracy or estimator claim.

DEC-POL-03: Select proposal-cause precedence `obstacle indication > awareness loss > unusable navigation > restricted navigation > full navigation`, followed by arbitration priority `evidence hold > external force-hold > qualified reset > safe use`. This creates the required explicit conflict without fabricating a physical severity ranking.

DEC-REC-01: Select one recovery latch initialized closed. Recovery after startup or a held reset requires a safe `NONE` evaluation to arm and a later fresh `RESET_ONLY` evaluation to open. Evidence improvement never opens the gate spontaneously, and a combined force-hold/reset value is always a hold.

DEC-BOUND-01: Keep battery, propulsion, camera, radio, sortie lifecycle, observation state, route generation, position estimation, flight actuation, and human mission authority outside the selected system. The only controlled purpose is logical use of navigation and obstacle-awareness evidence by external drone control.

## Medium-tier fit and no-padding check

FIT-01: The selected tuple is exactly 10 semantic usages, 21 semantic interactions, 20 nontrivial contract cases, and 8 scenario families, within the declared `8..12`, `15..21`, `12..20`, and `6..9` bounds.

FIT-02: Each qualifier performs a many-to-one evidence classification; the navigation and awareness owners combine independent facts; the proposal owner resolves cross-domain causes; the arbiter resolves event and recovery conflicts; the latch owns the only state transition; and the outcome owner derives a consistent three-output relation. No usage exists only to copy, rename, bundle, or route.

FIT-03: The 21 interactions comprise six distinct boundary inputs, twelve distinct owner dependencies, and three distinct controlled outputs. Removing any one would deprive an owner of a required input or remove a controlled result; adding another is neither required nor permitted by the retained design.

## Diversity-card comparison

DIV-01: The closest replicate-1 baseline is the Medium `Observation Acquisition and Radio-Delivery Coordinator`, because it is the same campaign tier and also has a stateful qualification/arbitration structure. Its principal outcome is observation acquisition and radio delivery across an observation-session lifecycle.

DIV-02: The selected system is not an extension, rename, or repartition of that baseline. It has no battery, sortie-context, camera, capture-result, radio, delivery-result, or observation-intent boundary; no acquisition or delivery command; no observation-session phase; and no completion, cancellation, or retry outcome.

DIV-03: Boundary genuinely differs: this system instead admits GPS, inertial, barometric, obstacle, motion-context, and reset/hold inputs and controls navigation-use, awareness-notice, and supervision-status outputs.

DIV-04: State ownership genuinely differs: the only retained state is a recovery latch with release-and-fresh-reset semantics, not an observation-session controller progressing through acquisition, queueing, sending, suspension, and completion.

DIV-05: Interaction topology genuinely differs: four channel qualifiers converge through separate navigation-basis and awareness-condition branches, then a proposal/arbiter/latch feedback path controls one outcome owner. It is not a camera-to-radio phase chain or delivery recovery loop.

DIV-06: Priority and recovery genuinely differ: evidence holds outrank external force-hold and reset, whereas the baseline prioritizes cancellation, recovery, automatic progress, and fresh start. Recovery requires reset release and a fresh reset edge; it has no session suspension, fresh observation start, or radio retry.

## Rejected claims and uncertainty

LIMIT-01: The selection does not claim physical navigation, obstacle avoidance, flight safety, landing control, sensor performance, equipment independence, propulsion availability, endurance, fire observation success, or certification. The seed supplies names, not these behaviors.

LIMIT-02: Model review established a localized direct mapping for distinct pre-state and post-state publications by the sole recovery owner and found every owner-local relation contractible without changing the semantic architecture. This is syntax and type realizability evidence only; scheduler behavior, execution, and physical timing remain unclaimed.

MODEL-DISP-01: Accept the Model finding that `PART-09` can publish committed pre-state on `INT-14`, transition its sole local state from `INT-15`, and publish post-state on `INT-17`; the additional publication port is uncredited support, not a new responsibility or interaction.

MODEL-DISP-02: Accept the Model owner audit: all ten usages derive many-to-one, multi-input, state-dependent, priority-selected, or cross-output facts. Shared qualifier definitions are allowed, but the three navigation usages retain separate inputs, local contracts, trace, and owner evidence; routing, bundling, projection, and representation conversion remain uncredited.

MODEL-DISP-03: Accept, with the no-credit limitation, one root System, one behavior-free support Process, ten semantic Threads, 11 non-root usages, depth two, 21 semantic connections, nine support delegations, and 30 raw connections. These exact physical counts do not alter the exact semantic tuple `10 / 21 / 20 / 8`.

MODEL-DISP-04: Accept the tractable bounded-analysis finding. The analyzer shall independently cover the specified owner-local products, 27 of 32 reachable recovery pairs, 24 of 128 reachable outcome triples, all 40,000 end-to-end valuations, and all eight scenario families, with unreachable sets reported separately and with source-hash binding.

MODEL-DISP-05: Accept the source-hash and independent-oracle plan only as a generation obligation. It does not pre-approve contracts, traces, source, typechecking, analyzer results, Designer validation, or any physical/executable claim.

DECISION-01: Approve `ALT-SCOPE-02` with allocation `ALT-ARCH-03` for generation in this retained run. The final architecture is exactly ten semantic usages, 21 semantic interactions, 20 nontrivial contract cases, and eight scenario families, with multiple cooperating qualification and decision owners and the explicit evidence/force-hold/reset priority conflict. This clarification revision authorizes Model generation but does not report verification, validation, execution, unbounded proof, or any deferred physical claim as passed.
