---
seed_id: mining-threat-retreat-20260813T195454Z-v1
version: 1
status: frozen
scope: reusable
---

## Source basis

This seed is derived only from the Mining Frigate example at pinned corpus commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`:

- `external/sysml-v2-models/models/example_EveOnlineMiningFrigate/DomainModel/BusinessCaseOpsCon.sysml`
- `external/sysml-v2-models/models/example_EveOnlineMiningFrigate/DomainModel/Concerns.sysml`
- `external/sysml-v2-models/models/example_EveOnlineMiningFrigate/DomainModel/Domain.sysml`
- `external/sysml-v2-models/models/example_EveOnlineMiningFrigate/DomainModel/MiningFrigate.sysml`
- `external/sysml-v2-models/models/example_EveOnlineMiningFrigate/DomainModel/MiningFrigateRequirementsDef.sysml`
- `external/sysml-v2-models/models/example_EveOnlineMiningFrigate/UseCases/OperationalUseCaseActions.sysml`

The assigned brief narrows these files to one fictional mining frigate. No other corpus example is evidence for this seed.

## Domain and purpose

In this fictional space-mining domain, a pilot-operated frigate travels between a station and asteroid resources, mines and carries ore, responds to hostile ships, and returns for offload and resupply. A downstream system may govern consequential choices among mining, defense, retreat-oriented movement, navigation, docking, offload, and resupply under cargo and capacitor-related conditions.

Actors and context include the pilot or pilot pod, mining corporation, fleet commander, operations manager, ship engineer, station, asteroid belt and asteroids, hostile ships, and drones. A fleet, Rorqual support ship, corporate leadership, and market analyst also appear upstream but remain context; no responsibility is assigned here. Source-grounded stakeholder viewpoints include resource availability, ore yield, deployment and delivery efficiency, security, threat response, and scalability.

## Available design vocabulary

All vocabulary below is optional, not a mandatory interface, enumeration, behavior, allocation, or architecture.

- Lifecycle: packaged, parked, docked, in open space near relevant objects, and in warp. These concepts may be used, omitted, renamed, or refined without preserving the source state structure.
- Capabilities: identify a destination; undock, navigate, adjust course, warp, and dock; select targets and mine; detect or classify threats; deploy drones or defenses; transfer and verify cargo; verify resupply. Retreat may reuse navigation, warp, or docking vocabulary but is not an upstream action.
- Observations: destination or scan signatures, threat information, mining or ship status, warp completion, docking status, cargo amount or capacity, transfer status, asteroid depletion, target-lock availability, capacitor energy or received charge, drone status, and reports or acknowledgments.
- Controlled outcomes: mining proceeds, pauses, or stops; ore enters or leaves cargo; a threat is reported or defense activated; retreat-oriented travel starts or completes; docking, offload, or resupply is reported or verified. No priority, policy, protocol, timing, or success criterion is implied.

## Candidate system scopes

These are alternative coherent single-system scopes, not parts of a required combined system:

- Threat-aware mining control: mining continuation or suspension and defensive or retreat-oriented outcomes using threat, cargo, and capacitor observations.
- Frigate threat response: threat observation, reporting, defense activation, and retreat-oriented navigation, with mining and station operations as context.
- Mining and cargo control: target selection, extraction, cargo acceptance, depletion or capacity observations, and stopping or seeking offload, with threat response external.
- Navigation and turnaround control: destination acceptance, travel, docking, cargo transfer, and resupply verification, with threat and mining progress external.
- Mission-level frigate operations: mining, threat response, retreat-oriented movement, and station return within one boundary that excludes the corporation, fleet, station, and support ships.

## Source limitations and claim boundary

- The brief includes retreat, but the SysML has no retreat action, state, trigger, rule, or completion condition. Only navigation, warp, docking, and threat-response vocabulary grounds a later interpretation.
- The lifecycle is incomplete: packaged and parked lack operational transitions, while mining, defense, cargo, and resupply occur within broad location states. It is not a validated lifecycle.
- Cargo capacity, near-full cargo, transfer, station charge, capacitor boosting, and insufficient energy appear separately without consistent observability, update, or resupply semantics. Propulsion is said to consume no fuel or power, while other text mentions fuel, life-support, power, or capacitor resupply.
- Commands, reports, power, and defense flows have loose string typing and direction or item-type inconsistencies. Their names do not establish executable interfaces.
- The ConOps allows onboard refining, but the domain assigns compression to a Rorqual and defines no frigate refining behavior. Frigate refining or compression is unsupported without a downstream assumption.
- Quantitative requirements are uneven and are not carried forward. The sources establish no real spacecraft physics or timing, physical performance, threat defeat, safety, survivability, certification, or production readiness.
- Profitability, markets, cost optimization, and guaranteed business outcomes are excluded. Exact domains, boundaries, responsibility, interactions, policies, priorities, recovery behavior, and verification claims require downstream choices and justification.
