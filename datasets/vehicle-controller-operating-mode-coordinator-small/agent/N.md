# Vehicle Controller Operating-Mode Coordinator

## Selected system context

### Need, purpose, and goals

NEED-01: A vehicle controller context needs one bounded logical coordinator that turns
source-named start, on, off, maintenance, degraded, and return-to-normal indications
into a persistent controller operating-mode disposition without treating those
indications as start-readiness or power evidence.

PURPOSE-01: The Vehicle Controller Operating-Mode Coordinator shall qualify two finite
indication channels, classify cross-channel compatibility, apply one exact priority and
transition partition, retain one controller mode, and publish the applied mode plus a
coordination result. It shall not authorize start, enable power, assess health or
temperature, execute self-test, apply a parking brake, or control vehicle dynamics.

GOAL-01: The system shall select exactly one ordered policy case for every finite
boundary snapshot and pre-evaluation mode and shall publish one mode/result frame
derived from that case.

GOAL-02: The system shall coordinate the nominal `Off -> Starting -> On -> Off`
lifecycle while rejecting lifecycle indications that are inapplicable to the current
mode.

GOAL-03: The system shall make invalid evidence, degraded and maintenance indications,
cross-channel conflicts, and recovery disposition externally distinguishable through its
finite outputs.

GOAL-04: The system shall leave `Maintenance` or `Degraded` only for a fresh, unopposed
return-to-normal event, shall return to `Off`, and shall require a later fresh start
event before entering `Starting`.

### Operational context and exact finite boundary

CTX-01: The Lifecycle Indication Source is outside the system and provides current
start, on, and off events. The seed does not identify this source as a driver, operator,
or authoritative control station, so this abstract assigns it no such identity.

CTX-02: The Condition Indication Source is outside the system and provides current
maintenance, degraded, and return-to-normal events. It is responsible for the truth and
intended applicability of those indications; this coordinator does not diagnose their
physical causes.

CTX-03: The Vehicle Supervisory Consumer is outside the system and receives the logical
controller-mode disposition and coordination result. It alone assigns any downstream
presentation or actuation meaning.

MON-01: `LifecycleSample` is a root input from CTX-01 with fields `event :
LifecycleEvent` and `status : InputStatus`, where `LifecycleEvent` is exactly
`{NoLifecycleEvent, Start, On, Off}` and `InputStatus` is exactly `{Valid, Invalid}`.
When status is `Invalid`, the event payload has no authority.

MON-02: `ConditionSample` is a root input from CTX-02 with fields `event :
ConditionEvent` and `status : InputStatus`, where `ConditionEvent` is exactly
`{NoConditionEvent, Maintenance, Degraded, ReturnToNormal}` and `InputStatus` is exactly
`{Valid, Invalid}`. When status is `Invalid`, the event payload has no authority.

CTRL-01: `ControllerModeDisposition` is a root output to CTX-03 with exactly `{Off,
Starting, On, Maintenance, Degraded}`. It is a logical controller disposition, not
evidence that the vehicle physically achieved the named condition.

CTRL-02: `CoordinationResult` is a root output to CTX-03 with exactly `{Applied, Stable,
Rejected, EvidenceFault}`. `Applied` means an applicable indication won the current
policy case, `Stable` means no event retained the mode, `Rejected` means an event or
conflict was inapplicable, and `EvidenceFault` means invalid or internally inconsistent
evidence selected the fault case.

### Evaluation, state, modes, events, and assumptions

MODE-01: `Off` observably publishes CTRL-01 as `Off`; a fresh `Start` may enter
`Starting`, while an applicable maintenance or degraded indication may select its named
mode.

MODE-02: `Starting` observably publishes CTRL-01 as `Starting`; a fresh `On` may enter
`On`, and a fresh `Off` may enter `Off`.

MODE-03: `On` observably publishes CTRL-01 as `On`; a fresh `Off` may enter `Off`, while
maintenance or degraded indications may interrupt it according to priority.

MODE-04: `Maintenance` observably publishes CTRL-01 as `Maintenance` and rejects
start/on progression; a fresh unopposed `ReturnToNormal` may enter `Off`.

MODE-05: `Degraded` observably publishes CTRL-01 as `Degraded` and rejects start/on
progression; a fresh unopposed `ReturnToNormal` may enter `Off`.

ASM-01: CTX-01 is responsible for the validity and pulse discipline of MON-01. This
event abstraction is selected because the seed supplies no request identifier,
held-level rule, or command protocol.

ASM-02: CTX-02 is responsible for the validity and pulse discipline of MON-02 and for
originating `ReturnToNormal` only when its external basis is satisfied. The coordinator
does not independently prove repair, maintenance completion, or physical recovery.

ASM-03: CTX-01 and CTX-02 each provide exactly one complete finite sample per logical
evaluation. Arrival timing, transport, synchronization, and event-source implementation
are outside scope.

ASM-04: CTX-03 consumes both root outputs as one logical frame from the selected
next-mode decision. It provides no acknowledgement or physical-effect feedback to this
system.

ASM-05: A return-to-normal event changes only `Maintenance` or `Degraded` to `Off`; it
never starts the controller, completes `Starting`, or enables power. A later lifecycle
event is required for further progression.

### Required behavior, risks, faults, and objective criteria

RISK-01: If invalid indication evidence or incompatible internal classification were
allowed to retain an apparently nominal mode/result, CTX-03 could treat an untrusted
coordination decision as valid.

RISK-02: If a rejected or losing event were queued, or a return event directly
progressed the lifecycle, the coordinator could change mode later without a new boundary
event.

## Supporting contract definitions

### State `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::controllerMode`

State `controllerMode` has type `Vehicle_Controller_Mode_Coordinator::ControllerModeDisposition`.

### `Vehicle_Controller_Mode_Coordinator::ConditionIndicationQualification::qualify_condition`

- Function category: Strictly pure
- Input `sample` has type `Vehicle_Controller_Mode_Coordinator::ConditionSample`.
- Result type: `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `ConditionAssessment.InvalidCondition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.'event'` is `ConditionEvent.NoConditionEvent`
>
> **Use:**
>
> `ConditionAssessment.NoCondition`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.'event'` is `ConditionEvent.Maintenance`
>
> **Use:**
>
> `ConditionAssessment.MaintenanceRequested`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.'event'` is `ConditionEvent.Degraded`
>
> **Use:**
>
> `ConditionAssessment.DegradedReported`
>
> **Otherwise use:**
>
> `ConditionAssessment.ReturnRequested`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::expected_class`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Result type: `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.

> The function returns the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `life` is `LifecycleAssessment.InvalidLifecycle`
>   - `cond` is `ConditionAssessment.InvalidCondition`
>
> **Use:**
>
> `CoordinationClass.InvalidEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `life` is `LifecycleAssessment.NoLifecycle`
>   - `cond` is `ConditionAssessment.NoCondition`
>
> **Use:**
>
> `CoordinationClass.Quiet`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `life` is not `LifecycleAssessment.NoLifecycle`
>   - `cond` is `ConditionAssessment.NoCondition`
>
> **Use:**
>
> `CoordinationClass.LifecycleOnly`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `life` is `LifecycleAssessment.NoLifecycle`
>   - `cond` is not `ConditionAssessment.NoCondition`
>
> **Use:**
>
> `CoordinationClass.ConditionOnly`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `life` is `LifecycleAssessment.OffRequested`
>
> **Use:**
>
> `CoordinationClass.OffDominantConflict`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - `life` is `LifecycleAssessment.StartRequested`
>       - `life` is `LifecycleAssessment.OnRequested`
>   - At least one of the following conditions holds:
>     
>       - `cond` is `ConditionAssessment.MaintenanceRequested`
>       - `cond` is `ConditionAssessment.DegradedReported`
>
> **Use:**
>
> `CoordinationClass.ConditionDominantConflict`
>
> **Otherwise use:**
>
> `CoordinationClass.RecoveryConflict`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::consistent`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when `kind` is the result of `expected_class` for (`life`, `cond`).

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_01`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when At least one of the following conditions holds:
>
>   - `life` is `LifecycleAssessment.InvalidLifecycle`
>   - `cond` is `ConditionAssessment.InvalidCondition`
>   - It is not the case that:
>     
>     the result of `consistent` for (`life`, `cond`, `kind`) is true.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_02`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - `life` is `LifecycleAssessment.OffRequested`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_03`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - `cond` is `ConditionAssessment.DegradedReported`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_04`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - `cond` is `ConditionAssessment.MaintenanceRequested`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_05`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_04` for (`life`, `cond`, `kind`) is true
>   - `kind` is `CoordinationClass.RecoveryConflict`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_06`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Input `mode` has type `Vehicle_Controller_Mode_Coordinator::ControllerModeDisposition`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_04` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_05` for (`life`, `cond`, `kind`) is true
>   - `life` is `LifecycleAssessment.NoLifecycle`
>   - `cond` is `ConditionAssessment.ReturnRequested`
>   - At least one of the following conditions holds:
>     
>       - `mode` is `ControllerModeDisposition.Maintenance`
>       - `mode` is `ControllerModeDisposition.Degraded`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_07`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Input `mode` has type `Vehicle_Controller_Mode_Coordinator::ControllerModeDisposition`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_04` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_05` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_06` for (`life`, `cond`, `kind`, `mode`) is true
>   - `life` is `LifecycleAssessment.NoLifecycle`
>   - `cond` is `ConditionAssessment.ReturnRequested`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_08`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Input `mode` has type `Vehicle_Controller_Mode_Coordinator::ControllerModeDisposition`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_04` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_05` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_06` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_07` for (`life`, `cond`, `kind`, `mode`) is true
>   - `life` is `LifecycleAssessment.OnRequested`
>   - `cond` is `ConditionAssessment.NoCondition`
>   - At least one of the following conditions holds:
>     
>       - `mode` is `ControllerModeDisposition.Starting`
>       - `mode` is `ControllerModeDisposition.On`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_09`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Input `mode` has type `Vehicle_Controller_Mode_Coordinator::ControllerModeDisposition`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_04` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_05` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_06` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_07` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_08` for (`life`, `cond`, `kind`, `mode`) is true
>   - `life` is `LifecycleAssessment.StartRequested`
>   - `cond` is `ConditionAssessment.NoCondition`
>   - At least one of the following conditions holds:
>     
>       - `mode` is `ControllerModeDisposition.Off`
>       - `mode` is `ControllerModeDisposition.Starting`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_10`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Input `mode` has type `Vehicle_Controller_Mode_Coordinator::ControllerModeDisposition`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_04` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_05` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_06` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_07` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_08` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_09` for (`life`, `cond`, `kind`, `mode`) is true
>   - `life` is `LifecycleAssessment.NoLifecycle`
>   - `cond` is `ConditionAssessment.NoCondition`.

### `Vehicle_Controller_Mode_Coordinator::ControllerModeArbitration::guard_case_11`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Input `kind` has type `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.
- Input `mode` has type `Vehicle_Controller_Mode_Coordinator::ControllerModeDisposition`.
- Result type: `Base_Types::Boolean`.

> The function returns true exactly when All of the following conditions hold:
>
>   - It is not the case that:
>     
>     the result of `guard_case_01` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_02` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_03` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_04` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_05` for (`life`, `cond`, `kind`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_06` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_07` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_08` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_09` for (`life`, `cond`, `kind`, `mode`) is true
>   - It is not the case that:
>     
>     the result of `guard_case_10` for (`life`, `cond`, `kind`, `mode`) is true.

### `Vehicle_Controller_Mode_Coordinator::CoordinationFrameDerivation::result_for`

- Function category: Strictly pure
- Input `reason` has type `Vehicle_Controller_Mode_Coordinator::DecisionReason`.
- Result type: `Vehicle_Controller_Mode_Coordinator::CoordinationResult`.

> The function returns the value selected as follows:
>
> **If:**
>
> `reason` is `DecisionReason.InvalidEvidence`
>
> **Use:**
>
> `CoordinationResult.EvidenceFault`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `reason` is `DecisionReason.NoRequest`
>
> **Use:**
>
> `CoordinationResult.Stable`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `reason` is `DecisionReason.ConflictingRequestsRejected`
>   - `reason` is `DecisionReason.ReturnNotApplicable`
>   - `reason` is `DecisionReason.TransitionRejected`
>
> **Use:**
>
> `CoordinationResult.Rejected`
>
> **Otherwise use:**
>
> `CoordinationResult.Applied`.

### `Vehicle_Controller_Mode_Coordinator::CrossChannelCompatibility::classify`

- Function category: Strictly pure
- Input `life` has type `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.
- Input `cond` has type `Vehicle_Controller_Mode_Coordinator::ConditionAssessment`.
- Result type: `Vehicle_Controller_Mode_Coordinator::CoordinationClass`.

> The function returns the value selected as follows:
>
> **If:**
>
> At least one of the following conditions holds:
>
>   - `life` is `LifecycleAssessment.InvalidLifecycle`
>   - `cond` is `ConditionAssessment.InvalidCondition`
>
> **Use:**
>
> `CoordinationClass.InvalidEvidence`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `life` is `LifecycleAssessment.NoLifecycle`
>   - `cond` is `ConditionAssessment.NoCondition`
>
> **Use:**
>
> `CoordinationClass.Quiet`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `life` is not `LifecycleAssessment.NoLifecycle`
>   - `cond` is `ConditionAssessment.NoCondition`
>
> **Use:**
>
> `CoordinationClass.LifecycleOnly`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - `life` is `LifecycleAssessment.NoLifecycle`
>   - `cond` is not `ConditionAssessment.NoCondition`
>
> **Use:**
>
> `CoordinationClass.ConditionOnly`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `life` is `LifecycleAssessment.OffRequested`
>
> **Use:**
>
> `CoordinationClass.OffDominantConflict`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - `life` is `LifecycleAssessment.StartRequested`
>       - `life` is `LifecycleAssessment.OnRequested`
>   - At least one of the following conditions holds:
>     
>       - `cond` is `ConditionAssessment.MaintenanceRequested`
>       - `cond` is `ConditionAssessment.DegradedReported`
>
> **Use:**
>
> `CoordinationClass.ConditionDominantConflict`
>
> **Otherwise use:**
>
> `CoordinationClass.RecoveryConflict`.

### `Vehicle_Controller_Mode_Coordinator::LifecycleIndicationQualification::qualify_lifecycle`

- Function category: Strictly pure
- Input `sample` has type `Vehicle_Controller_Mode_Coordinator::LifecycleSample`.
- Result type: `Vehicle_Controller_Mode_Coordinator::LifecycleAssessment`.

> The function returns the value selected as follows:
>
> **If:**
>
> `sample.status` is `InputStatus.Invalid`
>
> **Use:**
>
> `LifecycleAssessment.InvalidLifecycle`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.'event'` is `LifecycleEvent.NoLifecycleEvent`
>
> **Use:**
>
> `LifecycleAssessment.NoLifecycle`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.'event'` is `LifecycleEvent.Start`
>
> **Use:**
>
> `LifecycleAssessment.StartRequested`
>
> **Otherwise use:**
>
> the value selected as follows:
>
> **If:**
>
> `sample.'event'` is `LifecycleEvent.On`
>
> **Use:**
>
> `LifecycleAssessment.OnRequested`
>
> **Otherwise use:**
>
> `LifecycleAssessment.OffRequested`.

## Detailed behavioral requirements

### Requirements for ConditionIndicationQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CONDITION_ASSESSMENTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ConditionIndicationQualification shall set assessment to compatibility to NoCondition and assessment to arbiter to NoCondition.

#### Contract clauses evaluated in the compute phase

##### `QUAL_COND_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, ConditionIndicationQualification shall set assessment to compatibility to the result of ConditionIndicationQualification mode coordination process condition indication qualification qualify condition for (condition sample) and assessment to arbiter to the result of ConditionIndicationQualification mode coordination process condition indication qualification qualify condition for (condition sample).

### Requirements for ControllerModeArbitration

#### Contract clauses evaluated in the initialization phase

May modify: controllerMode

##### `INITIAL_MODE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ControllerModeArbitration shall set controllerMode to Off.

##### `INITIAL_DECISION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, ControllerModeArbitration shall set mode decision nextMode to Off and mode decision reason to NoRequest.

#### Contract clauses evaluated in the compute phase

May modify: controllerMode

##### `APPLIED_DECISION_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, ControllerModeArbitration shall set mode decision nextMode to controllerMode.

##### `CASE_01_INVALID_OR_INCONSISTENT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 01 INVALID OR INCONSISTENT applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 01 for (lifecycle assessment, condition assessment, coordination class) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is Degraded, mode decision nextMode is Degraded, and mode decision reason is InvalidEvidence.

##### `CASE_02_OFF_DOMINANT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 OFF DOMINANT applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 02 for (lifecycle assessment, condition assessment, coordination class) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is Off, mode decision nextMode is Off, and mode decision reason is OffAccepted.

##### `CASE_03_DEGRADED_DOMINANT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 DEGRADED DOMINANT applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 03 for (lifecycle assessment, condition assessment, coordination class) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is Degraded, mode decision nextMode is Degraded, and mode decision reason is DegradedAccepted.

##### `CASE_04_MAINTENANCE_DOMINANT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 04 MAINTENANCE DOMINANT applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 04 for (lifecycle assessment, condition assessment, coordination class) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is Maintenance, mode decision nextMode is Maintenance, and mode decision reason is MaintenanceAccepted.

##### `CASE_05_RECOVERY_CONFLICT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 RECOVERY CONFLICT applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 05 for (lifecycle assessment, condition assessment, coordination class) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is the value of controllerMode on entry, mode decision nextMode is the value of controllerMode on entry, and mode decision reason is ConflictingRequestsRejected.

##### `CASE_06_RETURN_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 RETURN ACCEPTED applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 06 for (lifecycle assessment, condition assessment, coordination class, the value of controllerMode on entry) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is Off, mode decision nextMode is Off, and mode decision reason is ReturnAccepted.

##### `CASE_07_RETURN_NOT_APPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 RETURN NOT APPLICABLE applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 07 for (lifecycle assessment, condition assessment, coordination class, the value of controllerMode on entry) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is the value of controllerMode on entry, mode decision nextMode is the value of controllerMode on entry, and mode decision reason is ReturnNotApplicable.

##### `CASE_08_ON_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 ON ACCEPTED applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 08 for (lifecycle assessment, condition assessment, coordination class, the value of controllerMode on entry) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is On, mode decision nextMode is On, and mode decision reason is OnAccepted.

##### `CASE_09_START_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 START ACCEPTED applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 09 for (lifecycle assessment, condition assessment, coordination class, the value of controllerMode on entry) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is Starting, mode decision nextMode is Starting, and mode decision reason is StartAccepted.

##### `CASE_10_NO_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 NO REQUEST applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 10 for (lifecycle assessment, condition assessment, coordination class, the value of controllerMode on entry) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is the value of controllerMode on entry, mode decision nextMode is the value of controllerMode on entry, and mode decision reason is NoRequest.

##### `CASE_11_TRANSITION_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 TRANSITION REJECTED applies under all of the following conditions:
>
> the result of ControllerModeArbitration mode coordination process controller mode arbitration guard case 11 for (lifecycle assessment, condition assessment, coordination class, the value of controllerMode on entry) is true.

> When all applicability conditions are met, ControllerModeArbitration shall produce a result for which all of the following conditions hold:
>
> controllerMode is the value of controllerMode on entry, mode decision nextMode is the value of controllerMode on entry, and mode decision reason is TransitionRejected.

### Requirements for CoordinationFrameDerivation

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FRAME_SAFE` — Required behavior

> During contract evaluation for the initialization phase, CoordinationFrameDerivation shall set mode disposition to Off and coordination result to Stable.

#### Contract clauses evaluated in the compute phase

##### `FRAME_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, CoordinationFrameDerivation shall set mode disposition to mode decision nextMode and coordination result to the result of CoordinationFrameDerivation mode coordination process coordination frame derivation result for for (mode decision reason).

### Requirements for CrossChannelCompatibility

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_COMPATIBILITY_SAFE` — Required behavior

> During contract evaluation for the initialization phase, CrossChannelCompatibility shall set coordination class to Quiet.

#### Contract clauses evaluated in the compute phase

##### `COMPATIBILITY_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, CrossChannelCompatibility shall set coordination class to the result of CrossChannelCompatibility mode coordination process cross channel compatibility classify for (lifecycle assessment, condition assessment).

### Requirements for LifecycleIndicationQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_LIFECYCLE_ASSESSMENTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, LifecycleIndicationQualification shall set assessment to compatibility to NoLifecycle and assessment to arbiter to NoLifecycle.

#### Contract clauses evaluated in the compute phase

##### `QUAL_LIFE_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, LifecycleIndicationQualification shall set assessment to compatibility to the result of LifecycleIndicationQualification mode coordination process lifecycle indication qualification qualify lifecycle for (lifecycle sample) and assessment to arbiter to the result of LifecycleIndicationQualification mode coordination process lifecycle indication qualification qualify lifecycle for (lifecycle sample).
