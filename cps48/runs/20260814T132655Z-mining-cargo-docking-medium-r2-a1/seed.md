---
seed_id: 20260813T233942Z-mining-cargo-docking-seed-v1
version: 1
status: frozen
scope: reusable
---

## Source basis

Derived solely from the Mining Frigate example in the `external/sysml-v2-models` corpus at pinned commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`:

- `models/example_EveOnlineMiningFrigate/DomainModel/MiningFrigate.sysml`
- `models/example_EveOnlineMiningFrigate/DomainModel/MiningFrigateRequirementsDef.sysml`
- `models/example_EveOnlineMiningFrigate/DomainModel/MiningFrigateVerificationCases.sysml`
- `models/example_EveOnlineMiningFrigate/UseCases/OperationalUseCaseActions.sysml`
- `models/example_EveOnlineMiningFrigate/LogicalArchitecture/ActionsHull.sysml`

## Domain and purpose

The source describes a mining frigate operated by a pilot or pilot pod. It mines asteroid ore into an ore hold, travels between open space and a station, docks and undocks, transfers cargo to station storage, and can receive repair and capacitor or support-system resupply while docked. The recognizable external context includes asteroids and ore, a station and its warehouse or storage, and pilot and station commands or reports. The purpose available for scoping is supervision of one coherent portion of the frigate's cargo or docked-service work, not the design of the whole vessel.

## Available design vocabulary

The following terms are optional source vocabulary from which a Designer may select; none is a mandatory interface, message, component, behavior, or allocation.

- **Lifecycle:** `Docked`, `InGrid`, and `OnWarp`, with `Packaged` and `Parked` also named by the source. Docked context is associated with cargo transfer, repair, and resupply; open-space context is associated with mining.
- **Capabilities:** activate mining, place extracted ore in the ore hold, transfer ore or other cargo, verify cargo transfer, dock, undock, repair, resupply the capacitor or support systems, and verify resupply.
- **Observations and context:** mining-frigate condition, ore-hold nearly-full indication, asteroid depletion, capacitor sufficiency, mining-laser overheat, target-lock interference, ship status, warehouse status, and mining, storage, docking, ship-status, or warehouse reports. Generic ship and station commands and reports are available names.
- **Controlled outcomes:** mining continuation, pause, halt, or pilot notification; cargo retained or transferred; transfer completion reported or verified; docking or undocking status; and repair or resupply readiness or completion. A downstream Designer must choose which of these, if any, are controlled rather than merely observed.

## Candidate system scopes

- **Ore-hold supervision:** one onboard supervisory system concerned with ore entering the hold, nearly-full awareness, cargo retention, and readiness for later offload.
- **Station cargo-transfer verification:** one system concerned with an offload request, ship-side transfer status, and station or warehouse evidence of completion.
- **Docking-service supervision:** one system concerned with supervisory readiness and status for docking or undocking and access to docked services, while excluding the physical docking mechanism.
- **Capacitor and support-system resupply verification:** one docked-service system concerned with resupply requests, observed ship condition, and evidence that resupply completed.

Each scope is an alternative single-system boundary. It may be expanded or reduced by a tier-specific Designer without importing the other scopes.

## Source limitations and claim boundary

The cited files mix requirement definitions, narrative action steps, logical actions, a partial lifecycle model, and verification cases. They do not provide a complete operational state machine or uniform command/report semantics. Cargo transfer appears variously as an unload command with cargo and storage-report outputs, a transfer command with transfer status, and warehouse-status verification. The high-level `DockAndUndock` action delegates only to a docking action, while the operational source names docking and undocking separately. Resupply is represented both as general ship-status verification and as capacitor recharge. A station command is also accepted through a control context otherwise used for ship commands. The verification cases test cargo capacity but do not establish transfer, docking, or resupply supervisory behavior.

Readiness, inhibition, ordering, priority, invalid-report handling, fault interpretation, and recovery policy are therefore unsupported source interpretations and belong to the downstream Designer. No detailed requirement, finite encoding, responsibility allocation, interaction structure, or behavioral policy is carried forward.

Exclude physical docking, the source docking-duration target, ore economics, extraction performance, travel physics, combat, and claims of safety, certification, or production readiness. The source supports domain vocabulary and candidate scope selection only; it does not support claims that any selected supervisor is physically effective, safe, complete, or faithful to game or real-spacecraft operation.
