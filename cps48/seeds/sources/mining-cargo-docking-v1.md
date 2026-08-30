# Mining-frigate cargo and docking source brief

Generate one minimal, complexity-neutral reusable seed from pinned corpus
commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, using
`DomainModel/MiningFrigate.sysml`, `DomainModel/MiningFrigateRequirementsDef.sysml`,
`DomainModel/MiningFrigateVerificationCases.sysml`,
`UseCases/OperationalUseCaseActions.sysml`, and
`LogicalArchitecture/ActionsHull.sysml` under the Mining Frigate example.

Preserve the mining-frigate, pilot, station, ore hold, cargo transfer, cargo
verification, mining, docking/undocking, repair, and capacitor-resupply
vocabulary. Offer alternative coherent cargo, transfer, docking, or resupply
supervisory scopes without selecting one.

Record that the source mixes requirements, narrative action steps, logical
actions, and verification cases without a complete operational state machine or
uniform command/report semantics. Exact readiness, inhibition, ordering,
priority, invalid-report, fault, and recovery policy belongs to the downstream
Designer. Exclude physical docking, the one-minute docking requirement, ore
economics, extraction performance, travel physics, combat, and safety claims.
