# Approved Design Selection — Cabin Air-Quality and Humidity Supervisor

## Selection basis

DS-BASIS-01: The frozen seed offers several single-system scopes but leaves finite boundary, ownership, interaction topology, policy, priority, state, recovery, contracts, and scenarios to the Designer. The replicate-2 diversity card additionally excludes defrost, thermal-service, energy-allocation, and visibility-priority whole-cabin control as the primary controlled purpose.

DS-CRIT-01: A candidate must define one coherent narrow purpose, keep source facts separate from pilot assumptions, remain implementation-independent, fit the small bounds, have exactly one principal decision owner, close all finite partitions and recovery paths, and give every credited usage and interaction a distinct behavioral role.

DS-CRIT-02: Selection favors owner-local facts that can be contracted independently, one weak semantic region, an explicit invalidity and recovery policy, and no identity adapters, duplicate policy, or count padding. Numeric proximity to a campaign bound is not a selection benefit.

## Comparison of seed candidate scopes

DS-SCOPE-01: A cabin-temperature supervisor is coherent in the seed but rejected because replicate 1 already covers thermal-service selection and heating/cooling policy; selecting it would violate the diversity constraint and add no new controlled purpose.

DS-SCOPE-02: A defrost supervisor is coherent in the seed but prohibited for replicate 2 because windshield-defrost authorization is already an accepted replicate-1 baseline.

DS-SCOPE-03: A cabin air-quality supervisor is selected and narrowed to air-quality plus humidity supervision. Its boundary uses only air-care preference, air-quality classification, humidity band, independent validity, a treatment directive, and status; thermal, defrost, glazing, and vehicle-energy decisions are excluded.

DS-SCOPE-04: A user-facing HVAC command coordinator would satisfy the card if its principal outcomes concerned preference acceptance. It was not selected because this run instead exercises environmental observation qualification and recovery while leaving interface presentation and physical HVAC actuation outside the boundary.

DS-SCOPE-05: An energy- and interface-aware HVAC supervisor is rejected because replicate 1 already covers electrical eligibility and energy restriction as principal policy material, and this selected air-care purpose does not need energy arbitration.

DS-SCOPE-06: A whole-cabin HVAC supervisor is rejected because it would combine unrelated temperature, defrost, air quality, access, and energy policies at small scale and risks extending the visibility-priority whole-cabin replicate-1 baseline.

## Responsibility-allocation alternatives

DS-ALT-01: **Alternative A — centralized supervisor.** One stateful usage would interpret all six inputs, retain recovery state, and derive both outputs, with four surrounding boundary adapters. It minimizes internal flows but the adapters would be forwarding-only, fail semantic-usage credit, and obscure owner-local evidence.

DS-ALT-02: **Alternative B — assessment, confidence, and policy chain.** Separate preference, air-quality, and humidity owners derive three finite facts; a stateful guardian derives observation confidence; one policy owner consumes all four facts and derives both controlled outputs. It has five genuine usages and fourteen typed interactions.

DS-ALT-03: **Alternative C — peer air and humidity controllers with arbitration.** Two stateful controllers would independently propose treatment, and an arbiter would choose between them. This creates proposal and conflict machinery unsupported by the seed, duplicates invalidity/recovery state, and makes combined treatment coherence harder to audit.

DS-COMP-01: Alternative A is compact structurally but semantically centralized and would require padding to meet the tier. Alternative C distributes behavior but invents two proposal authorities and redundant recovery. Alternative B assigns each boundary meaning once, gives temporal confidence one state owner, and preserves exactly one principal treatment decision.

## Selected direction and rationale

DS-DEC-01: Alternative B is selected at exactly `5 semantic usages / 14 semantic interactions / 12 nontrivial contract cases / 6 scenario families`, within the inclusive small bounds `5..8 / 7..14 / 6..12 / 4..6`.

DS-DEC-02: The principal controlled purpose is cabin air-quality and humidity supervision. The system controls only an abstract air-treatment directive and status; it does not control cabin temperature, defrost, electrical allocation, physical airflow, or verified environmental outcomes.

DS-DEC-03: Preference Interpreter, Air-Quality Assessor, and Humidity Assessor each own one validity-sensitive classification; Observation Confidence Guardian alone owns the clean-confirmation state; Air-Care Policy Supervisor alone owns the treatment and status decision. Each semantic usage derives a nonidentity fact.

DS-DEC-04: The ordered policy is valid `Off`, invalid preference, observation-confidence block, defensive derived-fact inconsistency, then trusted environmental treatment. Within trusted treatment, low or high humidity selects its corresponding combined humidity-and-filtration directive; air quality selects filtration only at target humidity.

DS-DEC-05: Recovery is observation-centered rather than request-centered. Any invalid environmental observation enters `ConfirmationNeeded`; one complete valid observation is held as `Confirming`; a following valid observation may resume service. Preference uses level semantics and needs neither release nor a fresh edge.

## Diversity determination

DS-DIV-01: The closest accepted replicate-1 baseline is **visibility-priority whole-cabin HVAC control**, because it is the only baseline broad enough to overlap cabin environmental supervision. The selected system is not an extension or repartitioning of it: temperature, glazing, defrost, heating/cooling, electrical eligibility, energy restriction, and whole-cabin service arbitration are absent from this boundary and policy.

DS-DIV-02: **Boundary differs.** This system monitors only air-care preference, air quality, humidity, and their validity and controls one air-treatment directive plus air-care status. It has no visibility, temperature, thermal-demand, power, or defrost interface.

DS-DIV-03: **State ownership differs.** The only state belongs to an Observation Confidence Guardian and records whether a clean environmental confirmation is required. It does not retain user-request freshness, service mode, defrost progress, thermal demand, or climate priority.

DS-DIV-04: **Interaction topology differs.** Air and humidity assessments fan out to a stateful confidence guardian and a single downstream policy owner, while preference bypasses the guardian. This assessment-confidence-policy topology is not a whole-cabin multi-service or visibility arbitration graph.

DS-DIV-05: **Priority policy differs.** Environmental validity and one-frame confirmation mask treatment, then humidity need outranks air-quality filtration at the treatment decision. Visibility, defrost, energy, and electrical eligibility have no priority role.

DS-DIV-06: **Recovery policy differs.** Recovery requires a complete clean environmental confirmation followed by another valid observation; it never requires user release, a fresh request, restored electrical eligibility, or a thermal-service retry.

## Count and ownership audit

DS-COUNT-01: PART-01 through PART-05 are exactly five responsibility-bearing semantic usages. The root, context actors, data types, ports, behavior-free Process, delegation hops, and analyzer receive no semantic credit.

DS-COUNT-02: INT-01 through INT-14 are exactly fourteen typed directed semantic interactions: six boundary inputs, six inter-owner facts, and two boundary outputs. The two assessment fan-outs have distinct confidence and policy consumers; no edge exists only to satisfy the count.

DS-COUNT-03: CC-01 through CC-12 are exactly twelve nontrivial canonical cases: two preference cases, one complete air assessment, one complete humidity assessment, three confidence-state cases, and five principal-policy cases. Initialization, types, and enum exclusivity are mandatory but uncounted.

DS-COUNT-04: SCN-01 through SCN-06 are exactly six distinct scenario families covering nominal filtration, low-humidity priority, high-humidity priority, target/preference boundaries, invalid-observation masking, and clean-confirmation recovery with interruption.

DS-OWN-01: PART-05 is exactly one principal decision owner; PART-04 is exactly one state owner. PART-01 through PART-03 are stateless assessment owners. No downstream owner may inspect raw inputs to reproduce an upstream classification.

DS-OWN-02: The final audit found no usage whose credited behavior is copying, bundling, rerouting, or one-to-one renaming. The bounded analyzer must check owner-local derivations and compose their outputs, not substitute a centralized policy for them.

## Realization constraints and resolved Model review

DS-REAL-01: One explicit root, five semantic Threads, one behavior-free generated-support Process, semantic responsibility depth one, physical depth two, six physical non-root AADL usages, fourteen semantic interactions, twenty-two raw port connections, sixteen generated-support boundary delegations, and one weakly connected region are required.

DS-REAL-02: The model must preserve the exact finite types, sole state, initialization, ordered total partitions, output pairs, six bounded scenario traces, bidirectional trace coverage, Sireum/HAMR gates, and independent bounded analyzer specified by the System Abstract.

DS-RES-01: **Local confidence realization accepted.** PART-04 can own and initialize the sole `ConfidenceMode` state and constrain both `MeasurementConfidence` and the post-state in CC-05 through CC-07. PART-05 and the analyzer shall consume this owner-local result and shall not reconstruct validity history.

DS-RES-02: **Total policy realization accepted.** PART-05 can encode CC-08 through CC-12 as a disjoint total finite partition over all 108 local valuations, including the defensive `Trusted`-plus-`Unknown` region, while preserving the exact directive/status pairs and without inspecting raw boundary inputs.

DS-RES-03: **Containment and connection realization accepted.** The required System-to-Process-to-Thread form realizes five semantic usages and fourteen semantic interactions through exactly twenty-two raw `PortConnection` declarations. The Process and sixteen boundary delegations remain behavior-free generated support and receive no semantic credit.

DS-DISP-01: The selected design is approved without semantic revision after independent disposition of every Model finding. The two localized-mapping findings are retained as realization constraints, not changes to the allocation. Model generation is authorized for this baseline and may not change its boundary, ownership, state timing, priority, recovery, contract counts, scenario outcomes, or claim boundary.
