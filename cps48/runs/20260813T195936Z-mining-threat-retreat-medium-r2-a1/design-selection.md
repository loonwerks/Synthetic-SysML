# Approved design selection — Frigate Threat Evidence and Egress Response Supervisor

## Decision scope

DS-SCOPE-01: This decision selects an implementation-independent controlled purpose and responsibility allocation for the medium tier. It does not select algorithms, scheduling, SysML constructs, deployment, physical equipment, navigation mechanics, or executable behavior.

DS-CRIT-01: Selection criteria are compliance with the replicate-2 diversity card, source grounding, boundary coherence, distinct behavioral ownership, explicit state ownership, inspectable priority and recovery, complete finite contracts, interaction burden, and fit to the exact medium bounds. Metric compliance is necessary but does not substitute for purpose.

## Comparison of seed candidate scopes

DS-ALT-01: **Frigate threat response** covers threat observation, reporting, defense activation, and retreat-oriented navigation while keeping mining and station operations external. It is source-grounded, satisfies the diversity card directly, supports two independent state owners and an explicit defense-versus-egress conflict, and does not require reconstructing cargo or service policy. This is the selected primary scope.

DS-ALT-02: **Mining and cargo control** could coherently select targets, qualify extraction, accept ore, and stop or seek external offload while keeping threat response external. It also satisfies the diversity card, but it offers weaker direct coverage of the run brief's threat-retreat focus and would defer all defense and egress outcomes.

DS-ALT-03: **Navigation and turnaround control** could own destination acceptance, travel, docking, cargo transfer, and resupply verification while mining and threat response remain external. It is coherent and diverse, but it requires downstream policy over loosely specified transfer, charge, and resupply semantics that the seed identifies as inconsistent.

DS-ALT-04: **Threat-aware mining control** combines mining continuation or suspension with defense or retreat outcomes. Although the seed lists it, the diversity card prohibits another mining-versus-defense/retreat arbiter, so it is ineligible for replicate 2.

DS-ALT-05: **Mission-level frigate operations** combines mining, hostile response, retreat, and station return. It is the closest match to the replicate-1 organizing purpose and is ineligible because it would reproduce the combined mission/action governor even if its parts or names changed.

DS-SELECT-01: Frigate threat response is selected because it retains the most direct source-grounded threat, report, defense, and navigation vocabulary while drawing a boundary that categorically excludes mining/cargo/service governance. It can meet the medium tier through distinct evidence, episode, qualification, arbitration, command-state, report, and status responsibilities without padding.

## Responsibility-allocation alternatives within the selected scope

DS-ALLOC-A-01: **Evidence-and-session-centered allocation** separates evidence qualification, threat-episode state, report policy, defense qualification, egress qualification, stateless response arbitration, egress-session/command control, and status assessment. Threat evidence fans out only after qualification; the two persistent state variables have different owners; reporting remains independent of exclusive command arbitration.

DS-ALLOC-A-02: This allocation makes invalidity semantics local to one evidence owner, makes confirmed-clear recovery local to the episode owner, exposes defense-versus-egress priority at one arbiter boundary, and leaves progress/cancellation/retry priority with the egress-session owner that has the required pre-state.

DS-ALLOC-B-01: **Central incident-coordinator allocation** would place episode state, response priority, egress state, and both commands in one incident coordinator, with evidence and resource adapters around it. It is structurally simpler and reduces some fact flows.

DS-ALLOC-B-02: The centralized alternative weakens ownership review: one component would own two unrelated state lifecycles, reporting and status would tend toward passive projections, and the coordinator's broad contract would obscure whether threat-clear recovery, fresh egress retry, and command conflict were independently complete. Adapters could also become forbidden identity wrappers.

DS-ALLOC-C-01: **Command-channel-centered allocation** would give defense and egress independent decision/state controllers after common evidence qualification, then add a downstream conflict resolver to suppress contradictory commands.

DS-ALLOC-C-02: This allocation gives command owners strong local cohesion, but priority would occur after both channels had already decided, increasing the risk that the resolver recomputes qualifications or becomes the real hidden decision owner. It also complicates a single deterministic explanation for simultaneous ready defense and fresh eligible egress.

## Selection and count audit

DS-DECISION-01: The evidence-and-session-centered allocation is selected. It gives all eight semantic usages a distinct local derivation, keeps state ownership unique, makes the required conflict visible before command derivation, and keeps reporting outside exclusive action priority.

DS-USAGE-01: The exact eight semantic usages are Evidence Qualifier, Episode Tracker, Report Policy, Defense Qualifier, Egress Qualifier, Response Arbiter, Response State Controller, and Status Assessor. No support Process, route, payload, projection, or analyzer receives semantic credit.

DS-INTERACTION-01: The complete interaction recount is 20: six boundary-input deliveries, ten owner-to-owner fact flows, and four boundary-output deliveries. The ten root/Process delegations are generated support and are not semantic interactions; the source-level total is therefore 30 connection declarations. The tracker snapshot carries its assessment field to avoid a redundant direct assessment-to-report edge.

DS-CASE-01: The exact 20 nontrivial cases allocate 3 to evidence qualification, 3 to episode tracking, 4 to defense qualification, 4 to egress qualification, 1 to reporting, 3 to arbitration, 1 to response-state/command control, and 1 to status assessment. Initialization and helper invariants do not inflate the count.

DS-SCENARIO-01: The exact eight scenario families cover watch, defense, egress-over-defense conflict, continuation/arrival, blocked/fresh retry, invalid-evidence containment, confirmed-clear recovery, and cancellation-versus-arrival priority. Each has a distinct behavioral trace.

DS-OWNER-01: The ownership audit finds four cooperating qualification/decision owners before state control: Evidence Qualifier, Defense Qualifier, Egress Qualifier, and Response Arbiter. Episode Tracker and Response State Controller are the only state owners; Report Policy and Status Assessor derive distinct classifications.

## Diversity comparison with the closest baseline

DS-DIV-01: The closest baseline is the accepted replicate-1 Small, Medium, and Hard combined mining-threat-retreat supervisors described by the diversity card.

DS-DIV-02: **Boundary differs:** the selected system has no mining intent, cargo, target, docking, resupply, general availability, mission-phase input, mining command, service command, selected operation, or mission-phase output.

DS-DIV-03: **State ownership differs:** one episode owner and one egress-session owner replace the baseline's mission-phase and broad operational recovery organization; observed arrival and confirmed threat clear remain intentionally independent.

DS-DIV-04: **Interaction topology differs:** qualified threat evidence fans to a report branch and two response-resource qualifiers; a narrow arbiter selects only threat response, and a separate stateful egress controller handles progress. There are no mining, cargo, or service proposal branches converging on it.

DS-DIV-05: **Priority and recovery differ:** fresh eligible egress outranks defense, safe-destination observation does not clear threat, invalid evidence preserves a declaration, clear confirmation closes the episode, and route recovery requires a fresh egress request. The policy never determines when to mine, hold mining, return cargo, or service the frigate.

DS-DIV-06: This is not an extension or renaming because its complete purpose and state topology remain meaningful after all mining/cargo/service concepts are removed. Adding the replicate-1 five-way alternatives would change the boundary, decision domain, state semantics, and controlled purpose rather than elaborate this design.

## Approved-generation criteria

DS-PASS-01: Model review confirmed that generation can realize exactly one root, one uncredited support Process, eight semantic usages, 20 semantic interactions, ten support routes, two unique state owners, 20 owner-local cases, eight scenario families, and the finite six-input/four-output boundary without adding a semantic owner or changing a case.

DS-PASS-02: The Model must preserve complete first-match partitions for all structurally valid inputs, including invalid evidence, fresh hostile evidence from recovery, confirmed clear, active egress, failed egress, blocked no-request hold, fresh retry, safe-destination observation, and cancellation.

DS-PASS-03: During generation the Model shall expose any concrete profile or contract limitation as a retained-run realizability question; it may not silently centralize state, merge interactions, weaken recovery, introduce mission-phase policy, or count forwarding as ownership.

DS-PASS-04: Generation is authorized against the approved System Abstract without semantic revision. Final acceptance remains contingent on typechecking, source-bound exhaustive analysis of 51,840 root valuations, owner-local totality, eight scenario witnesses, complete bidirectional traceability, exact structural metrics, visualization review, and Designer validation. No deferred physical or executable claim is implied by this approval.

