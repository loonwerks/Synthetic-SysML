# Mining-frigate threat, retreat, and service supervision

## Selected system context

### Synopsis

NEED-01: A single mining frigate needs decision supervision so routine mining and cargo
handling cannot mask defense, retreat, detected faults, or recovery.

PURPOSE-01: For each evaluation of finite intent, threat, resource, location,
availability, and action-outcome inputs, the system shall publish one coherent public
result containing an action, its selection cause, the observable mission mode, and the
actual next recovery state.

### Goals and stakeholders

GOAL-01: Emergency and recovery inhibition shall dominate productive work so unusable
threat evidence or a failed action cannot be hidden by mining, defense, retreat, or
service requests.

GOAL-02: Feasible retreat shall dominate defense and mining when hostility, full cargo,
or explicit retreat intent requires it, while defense remains the hostile fallback when
retreat is infeasible.

GOAL-03: Mining, docking service, defense, hold, and recovery behavior shall be
predictable from the finite public inputs and previous recovery state.

GOAL-04: The system shall expose one internally consistent action/cause/mode/recovery
result per evaluation so external consumers cannot observe a mixed decision epoch.

### Operational context and boundary

CTX-01: Fleet command or the frigate pilot supplies finite intent, including fresh reset
intent, and consumes the public result.

CTX-02: External threat sensing supplies a threat sample whose `INVALID` value reports
unusable evidence rather than a physical threat assertion.

CTX-03: External resource and location observation supplies cargo band, capacitor band,
and field-or-docked location.

CTX-04: External action-acceptance sources report whether mining, defense, retreat,
destination, and service commands are presently acceptable.

CTX-05: External action execution reports a fresh, action-tagged outcome or no new
outcome; it executes but does not select the supervisory action.

CTX-06: External retreat destinations accept retreat actions when destination and
retreat availability permit them.

CTX-07: External stations, ore transfer, and resupply services accept service actions
when the frigate is docked and service is available.

MON-01: `Intent={HOLD,MINE,DEFEND,RETREAT,RESET}` is supplied by CTX-01; `RESET` is a
fresh, consumed-once event rather than persistent permission.

MON-02: `ThreatSample={INVALID,CLEAR,SUSPECT,HOSTILE}` is supplied by CTX-02; its values
are finite status-bearing evidence and have no physical unit.

MON-03: `CargoBand={EMPTY,PARTIAL,FULL}`, `CapacitorBand={LOW,READY}`, and
`Location={FIELD,DOCKED}` are supplied by CTX-03 as unitless pilot bands.

MON-04: Boolean `miningAvailable`, `defenseAvailable`, `retreatAvailable`,
`destinationAvailable`, and `serviceAvailable` are supplied by CTX-04 and mean command
acceptance, not guaranteed action success.

MON-05:
`ActionOutcome={NONE,SUCCEEDED_HOLD,SUCCEEDED_MINE,SUCCEEDED_DEFEND,SUCCEEDED_RETREAT,SUCCEEDED_SERVICE,FAILED}`
is supplied by CTX-05; each non-`NONE` value is fresh, consumed once, and identifies the
completed action when successful.

CTRL-01: `PublicResult=(Action,SelectedCause,Mode,RecoveryState)` is the sole controlled
boundary value and shall be delivered atomically to CTX-01 and the relevant external
action or service context.

### Risks, state, modes, assumptions, and constraints

RISK-01: Unusable threat evidence or a failed external action could be masked by
productive proposals; FAULT-01 and FAULT-02 mitigate this with latching, gate closure,
emergency hold, and fault publication.

RISK-02: Hostility or full cargo could be masked by defense or mining; BEH-05, BEH-06,
and BEH-09 mitigate this with retreat applicability and priority.

RISK-03: Reset or stale/wrong success could clear recovery without later successful hold
evidence; CASE-07 through CASE-09 mitigate this with a two-stage fresh-event trace.

RISK-04: Separately published fields could describe different decision epochs; BEH-08
mitigates this with one same-evaluation tuple.

MODE-01: Healthy evaluations expose `HOLD`, `MINING`, `DEFENDING`, `RETREATING`, or
`SERVICING` according to selected action; these modes differ in the boundary action.

MODE-02: Every nonhealthy evaluation exposes `FAULT`, `HOLD`, and `FAULT_OR_RECOVERY`,
observably inhibiting productive action regardless of proposals.

ASM-01: CTX-01 is responsible for presenting `RESET` as a fresh consumed-once event and
issuing a new work intent after recovery clears; persistent or replayed reset is outside
the pilot contract.

ASM-02: CTX-02 is responsible for using `INVALID` only for unusable threat evidence; the
supervisor makes no physical claim from that value.

ASM-03: CTX-04 is responsible for availability meaning command acceptance, while CTX-06
additionally supplies destination availability for retreat; availability does not
promise completion.

ASM-04: CTX-05 is responsible for presenting each non-`NONE` outcome once and tagging
success with the completed action; stale, duplicated, or mistagged outcomes are outside
the pilot contract.

## Supporting contract definitions

### State `Mining_Threat_Retreat_Supervision::Recovery_Control::recovery_memory`

State `recovery_memory` has type `Base_Types::Integer_32`.

## Detailed behavioral requirements

### Requirements for ActionOutcomeValue

#### `OUTCOME_RANGE` — Data invariant

> Every value of ActionOutcomeValue shall meet the condition that outcome code is between 0 [S32] and 6 [S32], inclusive.

### Requirements for ActionValue

#### `ACTION_RANGE` — Data invariant

> Every value of ActionValue shall meet the condition that action code is between 0 [S32] and 4 [S32], inclusive.

### Requirements for CapacitorBandValue

#### `CAPACITOR_RANGE` — Data invariant

> Every value of CapacitorBandValue shall meet the condition that capacitor code is between 0 [S32] and 1 [S32], inclusive.

### Requirements for CargoBandValue

#### `CARGO_RANGE` — Data invariant

> Every value of CargoBandValue shall meet the condition that cargo code is between 0 [S32] and 2 [S32], inclusive.

### Requirements for Defense Eligibility

#### Contract clauses evaluated in the compute phase

##### `CASE_12_DEFENSE_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 DEFENSE PROPOSED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recovery gate gate code is 0 [S32]
>   - assessment defense ready is true
>   - At least one of the following conditions holds:
>     
>       - threat disposition disposition code is 2 [S32]
>       - threat disposition disposition code is 3 [S32]
>       - All of the following conditions hold:
>         
>           - threat disposition disposition code is 1 [S32]
>           - intent intent code is 2 [S32].

> When all applicability conditions are met, Defense Eligibility shall produce a result for which all of the following conditions hold:
>
> defense proposal proposal code is 1 [S32].

##### `CASE_13_DEFENSE_DENIED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 13 DEFENSE DENIED applies under all of the following conditions:
>
> It is not the case that:
>
> All of the following conditions hold:
>
>   - recovery gate gate code is 0 [S32]
>   - assessment defense ready is true
>   - At least one of the following conditions holds:
>     
>       - threat disposition disposition code is 2 [S32]
>       - threat disposition disposition code is 3 [S32]
>       - All of the following conditions hold:
>         
>           - threat disposition disposition code is 1 [S32]
>           - intent intent code is 2 [S32].

> When all applicability conditions are met, Defense Eligibility shall produce a result for which all of the following conditions hold:
>
> defense proposal proposal code is 0 [S32].

### Requirements for EmergencyStateValue

#### `EMERGENCY_RANGE` — Data invariant

> Every value of EmergencyStateValue shall meet the condition that emergency code is between 0 [S32] and 1 [S32], inclusive.

### Requirements for IntentValue

#### `INTENT_RANGE` — Data invariant

> Every value of IntentValue shall meet the condition that intent code is between 0 [S32] and 4 [S32], inclusive.

### Requirements for LocationValue

#### `LOCATION_RANGE` — Data invariant

> Every value of LocationValue shall meet the condition that location code is between 0 [S32] and 1 [S32], inclusive.

### Requirements for Mining Eligibility

#### Contract clauses evaluated in the compute phase

##### `CASE_10_MINING_PROPOSED` — Conditional behavior

> During contract evaluation for the compute phase, if recovery gate gate code is 0 [S32], intent intent code is 1 [S32], threat disposition disposition code is 1 [S32], and assessment mining ready is true, Mining Eligibility shall set mining proposal proposal code to 1 [S32].

##### `CASE_11_MINING_DENIED` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that recovery gate gate code is 0 [S32], intent intent code is 1 [S32], threat disposition disposition code is 1 [S32], and assessment mining ready is true, Mining Eligibility shall set mining proposal proposal code to 0 [S32].

### Requirements for Mission Mode And Public Result

#### Contract clauses evaluated in the initialization phase

##### `PUBLIC_INITIAL_HEALTHY_HOLD` — Required behavior

> During contract evaluation for the initialization phase, Mission Mode And Public Result shall set public result selected action to 0 [S32], public result selected cause to 5 [S32], public result mode to 0 [S32], and public result recovery state to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `PUBLIC_ATOMIC_COMPOSITION` — Required behavior

> During contract evaluation for the compute phase, Mission Mode And Public Result shall set public result selected action to selected action action code, public result selected cause to selected cause cause code, and public result recovery state to next recovery state state code.

##### `CASE_23_FAULT_MODE` — Conditional behavior

> During contract evaluation for the compute phase, if next recovery state state code is not 0 [S32], Mission Mode And Public Result shall set public result mode to 5 [S32].

##### `CASE_24_HOLD_MODE` — Conditional behavior

> During contract evaluation for the compute phase, if next recovery state state code is 0 [S32] and selected action action code is 0 [S32], Mission Mode And Public Result shall set public result mode to 0 [S32].

##### `CASE_25_MINING_MODE` — Conditional behavior

> During contract evaluation for the compute phase, if next recovery state state code is 0 [S32] and selected action action code is 1 [S32], Mission Mode And Public Result shall set public result mode to 1 [S32].

##### `CASE_26_DEFENDING_MODE` — Conditional behavior

> During contract evaluation for the compute phase, if next recovery state state code is 0 [S32] and selected action action code is 2 [S32], Mission Mode And Public Result shall set public result mode to 2 [S32].

##### `CASE_27_RETREATING_MODE` — Conditional behavior

> During contract evaluation for the compute phase, if next recovery state state code is 0 [S32] and selected action action code is 3 [S32], Mission Mode And Public Result shall set public result mode to 3 [S32].

##### `CASE_28_SERVICING_MODE` — Conditional behavior

> During contract evaluation for the compute phase, if next recovery state state code is 0 [S32] and selected action action code is 4 [S32], Mission Mode And Public Result shall set public result mode to 4 [S32].

### Requirements for MobilityProposalValue

#### `MOBILITY_RANGE` — Data invariant

> Every value of MobilityProposalValue shall meet the condition that proposal code is between 0 [S32] and 2 [S32], inclusive.

### Requirements for Mobility Service Eligibility

#### Contract clauses evaluated in the compute phase

##### `CASE_14_RETREAT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 RETREAT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - recovery gate gate code is 0 [S32]
>   - assessment retreat feasible is true
>   - At least one of the following conditions holds:
>     
>       - threat disposition disposition code is 3 [S32]
>       - assessment cargo full is true
>       - intent intent code is 3 [S32].

> When all applicability conditions are met, Mobility Service Eligibility shall produce a result for which all of the following conditions hold:
>
> mobility proposal proposal code is 1 [S32].

##### `CASE_15_SERVICE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 15 SERVICE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - recovery gate gate code is 0 [S32]
>       - assessment retreat feasible is true
>       - At least one of the following conditions holds:
>         
>           - threat disposition disposition code is 3 [S32]
>           - assessment cargo full is true
>           - intent intent code is 3 [S32]
>   - recovery gate gate code is 0 [S32]
>   - assessment dock service applicable is true.

> When all applicability conditions are met, Mobility Service Eligibility shall produce a result for which all of the following conditions hold:
>
> mobility proposal proposal code is 2 [S32].

##### `CASE_16_MOBILITY_DENIED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 16 MOBILITY DENIED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - recovery gate gate code is 0 [S32]
>       - assessment retreat feasible is true
>       - At least one of the following conditions holds:
>         
>           - threat disposition disposition code is 3 [S32]
>           - assessment cargo full is true
>           - intent intent code is 3 [S32]
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - recovery gate gate code is 0 [S32]
>       - assessment dock service applicable is true.

> When all applicability conditions are met, Mobility Service Eligibility shall produce a result for which all of the following conditions hold:
>
> mobility proposal proposal code is 0 [S32].

### Requirements for Priority Arbitration

#### Contract clauses evaluated in the compute phase

##### `CASE_17_EMERGENCY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state emergency code is 1 [S32], Priority Arbitration shall set selected action action code to 0 [S32] and selected cause cause code to 0 [S32].

##### `CASE_18_RETREAT_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state emergency code is 0 [S32] and mobility proposal proposal code is 1 [S32], Priority Arbitration shall set selected action action code to 3 [S32] and selected cause cause code to 1 [S32].

##### `CASE_19_DEFENSE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state emergency code is 0 [S32], mobility proposal proposal code is not 1 [S32], and defense proposal proposal code is 1 [S32], Priority Arbitration shall set selected action action code to 2 [S32] and selected cause cause code to 2 [S32].

##### `CASE_20_SERVICE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state emergency code is 0 [S32], mobility proposal proposal code is 2 [S32], and defense proposal proposal code is not 1 [S32], Priority Arbitration shall set selected action action code to 4 [S32] and selected cause cause code to 3 [S32].

##### `CASE_21_MINING_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state emergency code is 0 [S32], mobility proposal proposal code is 0 [S32], defense proposal proposal code is not 1 [S32], and mining proposal proposal code is 1 [S32], Priority Arbitration shall set selected action action code to 1 [S32] and selected cause cause code to 4 [S32].

##### `CASE_22_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if emergency state emergency code is 0 [S32], mobility proposal proposal code is 0 [S32], defense proposal proposal code is not 1 [S32], and mining proposal proposal code is not 1 [S32], Priority Arbitration shall set selected action action code to 0 [S32] and selected cause cause code to 5 [S32].

### Requirements for ProposalValue

#### `PROPOSAL_RANGE` — Data invariant

> Every value of ProposalValue shall meet the condition that proposal code is between 0 [S32] and 1 [S32], inclusive.

### Requirements for PublicResultValue

#### `PUBLIC_RESULT_RANGES` — Data invariant

> Every value of PublicResultValue shall meet the condition that selected action is at least 0 [S32], selected action is at most 4 [S32], selected cause is at least 0 [S32], selected cause is at most 5 [S32], mode is at least 0 [S32], mode is at most 5 [S32], recovery state is at least 0 [S32], and recovery state is at most 2 [S32].

### Requirements for Readiness Assessment

#### Contract clauses evaluated in the compute phase

##### `READINESS_LOCAL_FACTS` — Required behavior

> During contract evaluation for the compute phase, Readiness Assessment shall set assessment mining mining ready to true exactly when location location code is 0 [S32], cargo band cargo code is not 2 [S32], capacitor band capacitor code is 1 [S32], and mining available available is true, assessment mining defense ready to true exactly when location location code is 0 [S32], capacitor band capacitor code is 1 [S32], and defense available available is true, assessment mining retreat feasible to true exactly when location location code is 0 [S32], retreat available available is true, and destination available available is true, assessment mining cargo full to true exactly when cargo band cargo code is 2 [S32], and assessment mining dock service applicable to true exactly when All of the following conditions hold:
>
>   - location location code is 1 [S32]
>   - service available available is true
>   - At least one of the following conditions holds:
>     
>       - cargo band cargo code is not 0 [S32]
>       - capacitor band capacitor code is 0 [S32].

##### `READINESS_FANOUT` — Required behavior

> During contract evaluation for the compute phase, Readiness Assessment shall set assessment defense to assessment mining and assessment mobility to assessment mining.

### Requirements for RecoveryGateValue

#### `GATE_RANGE` — Data invariant

> Every value of RecoveryGateValue shall meet the condition that gate code is between 0 [S32] and 1 [S32], inclusive.

### Requirements for RecoveryStateValue

#### `RECOVERY_RANGE` — Data invariant

> Every value of RecoveryStateValue shall meet the condition that state code is between 0 [S32] and 2 [S32], inclusive.

### Requirements for Recovery Control

#### Contract clauses evaluated in the initialization phase

##### `RECOVERY_INITIAL_HEALTHY` — Required behavior

> During contract evaluation for the initialization phase, Recovery Control shall set recovery memory to 0 [S32], next recovery state state code to 0 [S32], gate mining gate code to 0 [S32], gate defense to gate mining, gate mobility to gate mining, and emergency state emergency code to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `RECOVERY_COMMITS_NEXT` — Required behavior

> During contract evaluation for the compute phase, Recovery Control shall set recovery memory to next recovery state state code.

##### `RECOVERY_DERIVES_INHIBITION` — Required behavior

> During contract evaluation for the compute phase, Recovery Control shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     gate mining gate code is 0 [S32]
>     
>     **Second condition:**
>     
>     next recovery state state code is 0 [S32]
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     gate mining gate code is 1 [S32]
>     
>     **Second condition:**
>     
>     next recovery state state code is not 0 [S32]
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     emergency state emergency code is 0 [S32]
>     
>     **Second condition:**
>     
>     next recovery state state code is 0 [S32]
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     emergency state emergency code is 1 [S32]
>     
>     **Second condition:**
>     
>     next recovery state state code is not 0 [S32].

##### `RECOVERY_GATE_FANOUT` — Required behavior

> During contract evaluation for the compute phase, Recovery Control shall set gate defense to gate mining and gate mobility to gate mining.

##### `CASE_05_TRIGGER` — Conditional behavior

> During contract evaluation for the compute phase, if threat validity validity code is 0 [S32] or action outcome outcome code is 6 [S32], Recovery Control shall set next recovery state state code to 1 [S32].

##### `CASE_06_HEALTHY` — Conditional behavior

> During contract evaluation for the compute phase, if threat validity validity code is 1 [S32], action outcome outcome code is not 6 [S32], and recovery memory is 0 [S32], Recovery Control shall set next recovery state state code to 0 [S32].

##### `CASE_07_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if threat validity validity code is 1 [S32], action outcome outcome code is not 6 [S32], recovery memory is 1 [S32], and intent intent code is 4 [S32], Recovery Control shall set next recovery state state code to 2 [S32].

##### `CASE_08_HOLD_SUCCESS` — Conditional behavior

> During contract evaluation for the compute phase, if threat validity validity code is 1 [S32], action outcome outcome code is not 6 [S32], recovery memory is 2 [S32], intent intent code is 0 [S32], and action outcome outcome code is 1 [S32], Recovery Control shall set next recovery state state code to 0 [S32].

##### `CASE_09_PRESERVE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 PRESERVE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat validity validity code is 1 [S32]
>   - action outcome outcome code is not 6 [S32]
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - recovery memory is 1 [S32]
>           - intent intent code is not 4 [S32]
>       - All of the following conditions hold:
>         
>           - recovery memory is 2 [S32]
>           - It is not the case that:
>             
>             All of the following conditions hold:
>             
>               - intent intent code is 0 [S32]
>               - action outcome outcome code is 1 [S32].

> When all applicability conditions are met, Recovery Control shall produce a result for which all of the following conditions hold:
>
> next recovery state state code is recovery memory.

### Requirements for SelectedCauseValue

#### `CAUSE_RANGE` — Data invariant

> Every value of SelectedCauseValue shall meet the condition that cause code is between 0 [S32] and 5 [S32], inclusive.

### Requirements for ThreatDispositionValue

#### `DISPOSITION_RANGE` — Data invariant

> Every value of ThreatDispositionValue shall meet the condition that disposition code is between 0 [S32] and 3 [S32], inclusive.

### Requirements for ThreatSampleValue

#### `THREAT_SAMPLE_RANGE` — Data invariant

> Every value of ThreatSampleValue shall meet the condition that sample code is between 0 [S32] and 3 [S32], inclusive.

### Requirements for ThreatValidityValue

#### `VALIDITY_RANGE` — Data invariant

> Every value of ThreatValidityValue shall meet the condition that validity code is between 0 [S32] and 1 [S32], inclusive.

### Requirements for Threat Qualification

#### Contract clauses evaluated in the compute phase

##### `QUALIFICATION_FANOUT` — Required behavior

> During contract evaluation for the compute phase, Threat Qualification shall set disposition defense to disposition mining and disposition mobility to disposition mining.

##### `CASE_01_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if threat sample sample code is 0 [S32], Threat Qualification shall set disposition mining disposition code to 0 [S32] and threat validity validity code to 0 [S32].

##### `CASE_02_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if threat sample sample code is 1 [S32], Threat Qualification shall set disposition mining disposition code to 1 [S32] and threat validity validity code to 1 [S32].

##### `CASE_03_SUSPECT` — Conditional behavior

> During contract evaluation for the compute phase, if threat sample sample code is 2 [S32], Threat Qualification shall set disposition mining disposition code to 2 [S32] and threat validity validity code to 1 [S32].

##### `CASE_04_HOSTILE` — Conditional behavior

> During contract evaluation for the compute phase, if threat sample sample code is 3 [S32], Threat Qualification shall set disposition mining disposition code to 3 [S32] and threat validity validity code to 1 [S32].
