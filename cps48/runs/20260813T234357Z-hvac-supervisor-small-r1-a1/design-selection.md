# Approved design selection — Windshield Defrost Request Supervisor

## Decision frame

SEL-01: The frozen seed is a reusable requirement vocabulary, not a mandatory combined HVAC architecture. The small tier requires one coherent scope with 5..8 semantic usages, 7..14 semantic interactions, 6..12 nontrivial contract cases, 4..6 scenario families, one principal decision owner, and nominal, boundary, invalid/fault, and recovery behavior.

SEL-02: Selection criteria were: a controlled purpose directly inside the seed envelope; a finite, implementation-independent boundary; meaningful invalid and recovery behavior without invented physical thresholds; five cohesive behavioral owners without forwarding padding; complete policy enumeration within twelve cases; and explicit avoidance of unsupported thermodynamic, energy, safety, or production claims.

## Comparison of the seed's candidate system scopes

SCOPE-01: **Cabin-temperature supervisor — not selected.** It is source-relevant, but a useful finite realization would require downstream assumptions for requested-temperature categories, measured-temperature validity, heating-versus-cooling arbitration, neutral boundaries, and likely hysteresis or restart behavior. Those choices are feasible but add more policy invention than the selected small slice.

SCOPE-02: **Defrost supervisor — selected and narrowed to windshield authorization.** It supports a direct controlled outcome, a clear user request, a meaningful fail-off command, and a re-arm recovery policy. The boundary can be finite without inventing a temperature threshold, clearing duration, or physical progress percentage. Window channels and physical clearing remain out of scope.

SCOPE-03: **Cabin air-quality supervisor — not selected.** Filtration and humidity are source-relevant, but the seed supplies neither a pollutant observation nor valid humidity bands. A finite small policy would therefore need multiple invented environmental thresholds and actuator effects before fault or recovery behavior could be judged.

SCOPE-04: **User-facing HVAC command coordinator — not selected.** It could coordinate temperature, fan, and preferences, but its primary controlled purpose would be command arbitration rather than a selected climate outcome. Giving each preference a meaningful owner within the small tier would either broaden the scope or create routing/renaming usages.

SCOPE-05: **Energy- and interface-aware HVAC supervisor — not selected as the primary scope.** The seed names power consumption and electrical interface status but supplies no quantitative bound, budget owner, or engine-heat causal interface. Electrical eligibility is retained only as an external gating context for the selected defrost purpose, not promoted into an unsupported energy optimizer.

SCOPE-06: **Whole-cabin HVAC supervisor — not selected.** Temperature, defrost, air quality, humidity, user access, and vehicle energy would create several independent controlled purposes and arbitration policies. Compressing them into five to eight usages would obscure responsibility and prevent a credible complete twelve-case maximum partition.

SCOPE-DEC-01: SCOPE-02 best satisfies the small-tier criteria because it has one directly observable authorization purpose, supports a nontrivial stateful recovery rule, and permits exhaustive finite contracts while preserving the seed's explicit limitations.

## Responsibility-allocation alternatives within the selected scope

ALT-01: **Centralized supervisory classification.** One stateful supervisor would ingest all six boundary inputs, qualify request and glazing validity, assess electrical permission, decide the command, and report status; remaining usages would be boundary adapters. This direction was rejected because it centralizes every meaningful derivation, makes additional usages forwarding-only, and weakens owner-local contract evidence.

ALT-02: **Qualification-and-policy topology — selected.** A request tracker owns fresh/held/re-arm semantics; a glazing assessor owns valid clear/obscured/unknown semantics; an electrical assessor owns eligibility and block reason; one principal supervisor owns authorization and priority; and a feedback reporter owns the many-to-one driver status. This allocation creates five change-cohesive responsibilities and thirteen necessary typed flows.

ALT-03: **Actuator-side safety interlock.** A supervisor would propose defrost, while a separate output guardian could veto based on resource or validity information. This direction was rejected because it creates two effective command decision owners, duplicates priority inputs, and suggests delivery or actuator feedback that the seed does not establish.

ALT-DEC-01: ALT-02 is selected. It separates assessment from the one principal decision without duplicating authority, locates the only history with the request semantics that require it, and gives every usage an owner-local non-bijective derivation. It also keeps every external input on one explicit route and every controlled output under one explicit owner chain.

## Selected decisions and assumptions

DEC-01: The primary controlled purpose is authorization of windshield defrost, not proof of physical clearing. `DefrostEnableCommand = {Off, On}` is received by external actuation equipment.

DEC-02: The exact monitored boundary is request selection plus validity, windshield clear/obscured classification plus validity, and electrical availability plus load allowance. The exact controlled boundary is defrost enable and driver status.

DEC-03: Request invalidity is latched as `RearmRequired`; a valid release is mandatory before a later active selection can be fresh. Windshield-observation and resource blocks are nonlatching and recover automatically while a request remains accepted.

DEC-04: The single policy priority is non-actionable request before unknown glazing, unknown glazing before electrical ineligibility, and electrical eligibility before the clear/obscured decision. All blocked paths command off.

DEC-05: `Clear` is the selected boundary outcome and is not a numeric threshold. Completion is not latched: a later valid obscured observation can resume defrost under a held eligible request.

DEC-06: Five semantic usages, thirteen semantic directed interactions, twelve nontrivial owner-local cases, and five scenario families are exact design totals, not targets to be padded. Initialization, type well-formedness, the behavior-free Process, and boundary delegation declarations do not count as semantic usages, interactions, or nontrivial cases.

ASM-SEL-01: The dashboard/console, observation source, and electrical coordinator can provide the selected finite values coherently per logical observation. This is a pilot environment assumption, not a source claim.

ASM-SEL-02: Electrical permission is externally classified; the model does not estimate power or energy. This avoids completing the source's unspecified maximum-power placeholders.

ASM-SEL-03: Physical command execution and windshield response are outside the boundary. No scenario outcome is evidence of defrost duration, effectiveness, or automotive safety.

## Model review resolution

REVIEW-01: **Containment finding accepted and narrowed to physical realization.** The baseline's direct one-level containment claim is revised to exactly one semantic responsibility layer realized physically as `System → generated-support Process → five semantic Threads`, giving physical depth two. No semantic owner, interaction, contract, behavior, type, state, priority, recovery rule, or claim boundary changes.

REVIEW-02: **Localized connection mapping accepted.** The unchanged 13 semantic interactions map to exactly 21 raw AADL `PortConnection` declarations: eight boundary flows use sixteen generated-support delegations, and five internal inter-Thread flows use one declaration each. The delegations receive no semantic-interaction or ownership credit.

REVIEW-03: **Ownership no-concern finding accepted.** PART-01..PART-05 remain five nonidentity behavioral owners, with PART-04 the sole principal decision owner and PART-01 the sole state owner. No usage is removed, added, or credited for forwarding.

REVIEW-04: **Contract-feasibility no-concern finding accepted as generation evidence, not verification.** Generation may rely on supported local state, initialization, pre-state access, enum functions, multi-output guarantees, and compute cases, but the produced model must still pass the owner-local products, 192 composed root snapshots, five multi-step scenarios, architecture/type gates, trace checks, and Designer validation. The review does not itself prove those obligations.

## Trade result and resolved questions

RESULT-01: The approved baseline remains within the small tier with exactly 5 semantic usages/nodes, 13 semantic interactions/edges, 12 nontrivial owner-local cases, 5 scenario families, 1 semantic responsibility layer, 1 principal decision owner, 1 state owner, 1 root System, 1 behavior-free generated-support Process, 6 physical non-root AADL usages, physical depth 2, 21 raw `PortConnection` declarations, 16 generated-support boundary delegations, and 1 weakly connected region. The partition and owner audit are stated in `system-abstract.md` and shall be realized without new semantic owners or silent central recomputation.

ANSWER-01: The Model review found PART-01's pre-state/next-state relation realizable with local GUMBO state and pre-state access. Generation is authorized subject to explicit CC-01..CC-05 and SCN-05 evidence and prohibition of an untraced timer, mode, latch, or second state owner.

ANSWER-02: The Model review bounded the required enumeration. The retained analyzer shall check owner-local products of 12, 4, 4, 45, and 25 valuations, all 192 composed root snapshots, and SCN-01..SCN-05 while consuming owner-produced values over the semantic interactions. A direct oracle may cross-check but shall not replace local evidence or be described as solver proof.


