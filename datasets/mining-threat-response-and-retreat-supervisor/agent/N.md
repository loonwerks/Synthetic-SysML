# Mining Threat-Response and Retreat Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: **Pilot abstraction.** A mining-frigate pilot and commander need deterministic
mining, defense, retreat, and recovery supervision when observations may be invalid.

PURPOSE-01: **Pilot abstraction.** The system will resolve one command, current and next
phase, reason, fault indication, operational advisories, and next threat-validity streak
for each classified tick across nominal, conflict, degraded, and recovery paths.

GOAL-01: **Pilot abstraction.** The system shall produce a total, deterministic result
for every combination of the finite current state and tick inputs. Verification: bounded
contract analysis shall find exactly one selected reason case for every enumerated
combination and no uncovered or multiply selected combination.

GOAL-02: **Pilot abstraction.** The system shall prevent invalid observations from
proving threat trust, readiness, arrival, or recovery completion. Verification: contract
inspection and bounded analysis shall show that each invalidity rule in ASM-02 through
ASM-05 constrains every affected output and state update.

GOAL-03: **Pilot abstraction.** The system shall preserve the frozen phase-local
ordering and publish the selected row identifier as the reason, including the explicit
C05 conflict outcome. Verification: bounded analysis shall exercise all 20 reason rows
and the conflict witnesses named by SCN-04.

GOAL-04: **Pilot abstraction.** The system shall publish command, phase, reason,
actuator posture, advisories, fault, and next streak as one coherent tick result.
Verification: structural and contract inspection shall find one publication
responsibility and shall reject independently updated or contradictory controlled
values.

### Operational context and system boundary

CTX-02: **Pilot abstraction.** Fleet Command supplies the commander-level mission and
threat-response intent embodied by the frozen policy and receives the same observable
supervision result; Fleet Command is outside the system and is responsible for approving
changes to policy meaning or priority.

CTX-03: **Pilot abstraction.** Operations/Engineering supplies resource availability and
resupply status and acts on recovery and docking outcomes; it is outside the system and
owns the declared validity of those observations.

CTX-04: **Pilot abstraction.** The operational environment contains mining, combat,
travel, station arrival, docking, offload, and target/resource conditions. It supplies
the classified threat, cargo, capacitor, target, and arrival observations; the system
observes but does not implement or guarantee those external activities.

CTX-05: **Pilot abstraction, informational.** Allocation reviewers compare
responsibility allocations and inspect traces and bounded evidence. They do not
participate in an operational scenario and have no modeled control authority.

MON-01: **Pilot abstraction.** The tick boundary presents owned internal
`phase=Docked|Mining|Defending|Retreating|Recovery`, initially `Docked`, and owned
internal `valid_streak=0|1|2`, initially `0`, together with the current observations.
Phase and streak are state inputs to the current tick, not measurements asserted by an
external actor.

MON-02: **Pilot abstraction.** Every tick observes
`threat=Clear|Caution|Hostile|Severe`, `cargo=Empty|Partial|NearlyFull|Full`,
`capacitor=High|Adequate|Low|Critical`, and `target=Available|Depleted`, each with
independent `Valid|Invalid` validity supplied by CTX-04.

MON-03: **Pilot abstraction.** Every tick observes `mining_availability`,
`defense_availability`, and `retreat_availability` as `Available|Unavailable` under one
`availability_validity=Valid|Invalid`, supplied by CTX-03.

MON-04: **Pilot abstraction.** Every tick observes `pilot_intent=Mine|Hold|Return` from
CTX-01, `arrival=EnRoute|SafeAtStation` from CTX-04, and `resupply=Incomplete|Complete`
from CTX-03, each with independent validity. Arrival validity affects faulting only in
`Retreating`; resupply validity affects faulting only in `Docked|Recovery`.

CTRL-01: **Pilot abstraction.** The system controls the published
`command=StayDocked|Depart|Mine|HoldAtSite|Defend|Retreat|Recover`, current phase, next
phase, and `reason=C01|...|C20` received by CTX-01, CTX-02, and CTX-03. These outputs
supervise external action but do not claim that the action succeeds.

CTRL-02: **Pilot abstraction.** The same result controls `laser=Enabled|Disabled`,
`drones=Stowed|Mining|Defense`, cargo advisory `Normal|NearlyFull|Full|Unknown`,
capacitor advisory `Normal|Low|Critical|Unknown`, retreat advisory
`Ready|Unavailable|Unknown`, `fault=Clear|Asserted`, and `next_valid_streak=0|1|2` for
the external recipients.

### Essential assumptions and finite qualification rules

ASM-01: **Pilot abstraction.** One tick consumes one coherent classified snapshot; no
stale event or hidden provenance exists. CTX-03 and CTX-04 are responsible for supplying
observations and validity for the same tick. Rationale: deterministic finite checking
would be ambiguous if observations from different ticks could be silently mixed; the
model shall not invent freshness, sequence, or provenance evidence.

ASM-02: **Pilot abstraction.** Invalid threat sets the next streak to `0`; valid threat
sets it to `min(2, valid_streak+1)`. Threat is `Untrusted` until the next streak is `2`,
after which the current valid threat band is used; invalid threat is never `Clear`.
CTX-04 is responsible for fresh threat classification and validity. Rationale: two fresh
valid ticks are the frozen trust rule, not a physical sensor assertion.

ASM-03: **Pilot abstraction.** `mine_ready` requires valid non-`Full` cargo,
`High|Adequate` capacitor, `Available` target, valid availability, and available mining;
`defense_ready` requires valid `High|Adequate` capacitor, valid availability, and
available defense; `resource_reset` requires valid `Empty` cargo and `High|Adequate`
capacitor; `recovery_complete` additionally requires valid `Complete` resupply. CTX-03
and CTX-04 own the underlying observation validity. Rationale: these are logical policy
facts only and make no equipment-sufficiency claim.

ASM-04: **Pilot abstraction.** `Clear|Caution` is `acceptable`;
`Hostile|Severe|Untrusted` is not. A retreat command may be requested when retreat
capability is invalid or unavailable without claiming escape. CTX-02 is responsible for
the frozen policy meaning. Rationale: command selection and external success are
separate claims.

ASM-05: **Pilot abstraction.** Invalid intent blocks departure and recovery completion
and causes retreat from `Mining`; invalid inputs cannot establish readiness; only a
fresh valid `SafeAtStation` observation leaves `Retreating`. CTX-01 owns intent
validity, CTX-04 owns arrival validity, and CTX-03 owns resupply validity. Rationale:
invalid or irrelevant data cannot serve as a transition trigger.

### Modes and observable state

MODE-01: **Pilot abstraction.** `Docked` observes departure readiness and otherwise
publishes `StayDocked`; only CASE-01 can leave it for `Mining`.

MODE-02: **Pilot abstraction.** `Mining` can mine, hold, defend, or retreat; CASE-03
through CASE-11 provide all ordered triggers and destinations.

MODE-03: **Pilot abstraction.** `Defending` can continue defense, return to mining, or
retreat; CASE-12 through CASE-15 provide all ordered triggers and destinations.

MODE-04: **Pilot abstraction.** `Retreating` continues to request retreat until a fresh
valid station-arrival observation; only CASE-16 enters `Recovery`, and CASE-17 remains
`Retreating`.

MODE-05: **Pilot abstraction.** `Recovery` continues recovery, redeploys, or settles
docked; CASE-18 through CASE-20 provide all ordered triggers and destinations.

### Priority conflict and risk scenarios

RISK-01: **Pilot abstraction.** If invalid threat were interpreted as `Clear`,
supervision could continue mining or recovery without re-establishing trust. The
consequence is violation of frozen invalid-data policy, not an asserted physical loss.
Mitigation trace: FAULT-02.

RISK-02: **Pilot abstraction.** If proposal arbitration obscured the C05 conflict,
simultaneous Hostile threat and Return/Full/resource retreat could select a later
mission case and publish the wrong reason. The consequence is loss of deterministic
policy fidelity. Mitigation trace: FAULT-03.

RISK-03: **Pilot abstraction.** If stale or invalid station arrival triggered Recovery,
supervision could stop requesting retreat without a fresh valid station observation. The
consequence is an unsupported phase transition, not a claim about physical location.
Mitigation trace: FAULT-04.

## Supporting contract definitions

### State `Mining_Threat_Retreat_Supervisor::Priority_Phase_Arbitration::owned_phase`

State `owned_phase` has type `Base_Types::Integer_32`.

### State `Mining_Threat_Retreat_Supervisor::Threat_Qualification::owned_valid_streak`

State `owned_valid_streak` has type `Base_Types::Integer_32`.

## Detailed behavioral requirements

### Requirements for Atomic Publication

#### Contract clauses evaluated in the initialization phase

##### `AP_INITIAL_SAFE` — Required behavior

> During contract evaluation for the initialization phase, Atomic Publication shall set publication laser to 1 [S32] and publication drones to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `AP_ATOMIC_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, Atomic Publication shall set publication command to atomic result command, publication current phase to atomic result current phase, publication next phase to atomic result next phase, publication reason to atomic result reason, publication fault to atomic result fault, publication next valid streak to atomic result next valid streak, publication cargo advisory to atomic result cargo advisory, publication capacitor advisory to atomic result capacitor advisory, and publication retreat advisory to atomic result retreat advisory.

##### `AP_ACTUATOR_MAPPING` — Required behavior

> During contract evaluation for the compute phase, Atomic Publication shall produce a result for which if atomic result command is 2 [S32], then publication laser is 0 [S32] and publication drones is 1 [S32], if atomic result command is 4 [S32], then publication laser is 1 [S32] and publication drones is 2 [S32], and if it is not the case that atomic result command is 2 [S32] and it is not the case that atomic result command is 4 [S32], then publication laser is 1 [S32] and publication drones is 0 [S32].

### Requirements for Atomic Supervisor Result

#### `ATOMIC_RESULT_RANGE` — Data invariant

> Every value of Atomic Supervisor Result shall meet the condition that command is at least 0 [S32], command is at most 6 [S32], current phase is at least 0 [S32], current phase is at most 4 [S32], next phase is at least 0 [S32], next phase is at most 4 [S32], reason is at least 1 [S32], reason is at most 20 [S32], fault is at least 0 [S32], fault is at most 1 [S32], next valid streak is at least 0 [S32], next valid streak is at most 2 [S32], cargo advisory is at least 0 [S32], cargo advisory is at most 3 [S32], capacitor advisory is at least 0 [S32], capacitor advisory is at most 3 [S32], retreat advisory is at least 0 [S32], and retreat advisory is at most 2 [S32].

### Requirements for Fault Assessment

#### Contract clauses evaluated in the initialization phase

##### `FA_INITIAL_CLEAR` — Required behavior

> During contract evaluation for the initialization phase, Fault Assessment shall set fault fault to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `FA_PHASE_RELEVANT_FAULT` — Required behavior

> During contract evaluation for the compute phase, Fault Assessment shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     fault fault is 1 [S32]
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - threat invalidity threat invalid is true
>       - resource invalidity resource invalid is true
>       - mission invalidity intent invalid is true
>       - All of the following conditions hold:
>         
>           - phase context current phase is 3 [S32]
>           - mission invalidity arrival invalid is true
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - phase context current phase is 0 [S32]
>               - phase context current phase is 4 [S32]
>           - mission invalidity resupply invalid is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     fault fault is 0 [S32]
>     
>     **Second condition:**
>     
>     It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - threat invalidity threat invalid is true
>       - resource invalidity resource invalid is true
>       - mission invalidity intent invalid is true
>       - All of the following conditions hold:
>         
>           - phase context current phase is 3 [S32]
>           - mission invalidity arrival invalid is true
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - phase context current phase is 0 [S32]
>               - phase context current phase is 4 [S32]
>           - mission invalidity resupply invalid is true.

### Requirements for Fault Fact

#### `FAULT_RANGE` — Data invariant

> Every value of Fault Fact shall meet the condition that fault is between 0 [S32] and 1 [S32], inclusive.

### Requirements for Mission Proposal

#### `MISSION_PROPOSAL_RANGE` — Data invariant

> Every value of Mission Proposal shall meet the condition that proposed reason is between 0 [S32] and 20 [S32], inclusive.

### Requirements for Mission Recovery Decision

#### Contract clauses evaluated in the initialization phase

##### `MR_INITIAL_NONE` — Required behavior

> During contract evaluation for the initialization phase, Mission Recovery Decision shall set mission proposal proposed reason to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `MR_PROPOSAL_PARTITIONS` — Required behavior

> During contract evaluation for the compute phase, Mission Recovery Decision shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 0 [S32]
>       - threat fact acceptable is true
>       - resource facts mine ready is true
>       - resource facts resource reset is true
>       - mission facts valid complete resupply is true
>       - mission facts valid mine is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 1 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 0 [S32]
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - threat fact acceptable is true
>           - resource facts mine ready is true
>           - resource facts resource reset is true
>           - mission facts valid complete resupply is true
>           - mission facts valid mine is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 2 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - mission facts invalid or return is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 7 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - mission facts invalid or return is false
>       - resource facts cargo or capacitor retreat is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 8 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - mission facts invalid or return is false
>       - resource facts cargo or capacitor retreat is false
>       - resource facts target or mining block is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 9 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - mission facts invalid or return is false
>       - resource facts cargo or capacitor retreat is false
>       - resource facts target or mining block is false
>       - mission facts valid hold or return is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 10 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - mission facts invalid or return is false
>       - resource facts cargo or capacitor retreat is false
>       - resource facts target or mining block is false
>       - mission facts valid hold or return is false
>     
>     **Then:**
>     
>     mission proposal proposed reason is 11 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 2 [S32]
>       - threat fact acceptable is true
>       - resource facts mine ready is true
>       - mission facts valid mine is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 14 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 2 [S32]
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - threat fact acceptable is true
>           - resource facts mine ready is true
>           - mission facts valid mine is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 0 [S32]
>   - **If:**
>     
>     phase context current phase is 3 [S32]
>     
>     **Then:**
>     
>     mission proposal proposed reason is 0 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 4 [S32]
>       - At least one of the following conditions holds:
>         
>           - threat fact acceptable is false
>           - mission facts intent invalid is true
>           - It is not the case that:
>             
>             All of the following conditions hold:
>             
>               - resource facts resource reset is true
>               - mission facts valid complete resupply is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 18 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 4 [S32]
>       - threat fact acceptable is true
>       - mission facts intent invalid is false
>       - resource facts resource reset is true
>       - mission facts valid complete resupply is true
>       - mission facts valid mine is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 19 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 4 [S32]
>       - threat fact acceptable is true
>       - mission facts intent invalid is false
>       - resource facts resource reset is true
>       - mission facts valid complete resupply is true
>       - mission facts valid mine is false
>       - mission facts valid hold or return is true
>     
>     **Then:**
>     
>     mission proposal proposed reason is 20 [S32].

### Requirements for Personnel Mission Qualification

#### Contract clauses evaluated in the initialization phase

##### `PQ_INITIAL_FACTS` — Required behavior

> During contract evaluation for the initialization phase, Personnel Mission Qualification shall produce a result for which mission facts valid mine is false, mission facts valid complete resupply is false, and arrival fact valid safe at station is false.

#### Contract clauses evaluated in the compute phase

##### `PQ_INTENT_FACTS` — Required behavior

> During contract evaluation for the compute phase, Personnel Mission Qualification shall set mission facts valid mine to true exactly when raw mission intent validity is 0 [S32] and raw mission pilot intent is 0 [S32], mission facts invalid or return to true exactly when raw mission intent validity is 1 [S32] or raw mission pilot intent is 2 [S32], mission facts valid hold or return to true exactly when All of the following conditions hold:
>
>   - raw mission intent validity is 0 [S32]
>   - At least one of the following conditions holds:
>     
>       - raw mission pilot intent is 1 [S32]
>       - raw mission pilot intent is 2 [S32], and mission facts intent invalid to true exactly when raw mission intent validity is 1 [S32].

##### `PQ_PROGRESS_FACTS` — Required behavior

> During contract evaluation for the compute phase, Personnel Mission Qualification shall set arrival fact valid safe at station to true exactly when raw mission arrival validity is 0 [S32] and raw mission arrival is 1 [S32] and mission facts valid complete resupply to true exactly when raw mission resupply validity is 0 [S32] and raw mission resupply is 1 [S32].

##### `PQ_INDEPENDENT_INVALIDITY` — Required behavior

> During contract evaluation for the compute phase, Personnel Mission Qualification shall set mission invalidity intent invalid to true exactly when raw mission intent validity is 1 [S32], mission invalidity arrival invalid to true exactly when raw mission arrival validity is 1 [S32], and mission invalidity resupply invalid to true exactly when raw mission resupply validity is 1 [S32].

### Requirements for Phase Context

#### `PHASE_CONTEXT_RANGE` — Data invariant

> Every value of Phase Context shall meet the condition that current phase is between 0 [S32] and 4 [S32], inclusive.

### Requirements for Phase State Input

#### `PHASE_STATE_RANGE` — Data invariant

> Every value of Phase State Input shall meet the condition that current phase is between 0 [S32] and 4 [S32], inclusive.

### Requirements for Priority Phase Arbitration

#### Contract clauses evaluated in the initialization phase

##### `AS_INITIAL_DOCKED` — Required behavior

> During contract evaluation for the initialization phase, Priority Phase Arbitration shall set owned phase to 0 [S32], phase context current phase to 0 [S32], resolved atomic result command to 0 [S32], resolved atomic result current phase to 0 [S32], resolved atomic result next phase to 0 [S32], resolved atomic result reason to 2 [S32], resolved atomic result fault to 0 [S32], resolved atomic result next valid streak to 0 [S32], resolved atomic result cargo advisory to 3 [S32], resolved atomic result capacitor advisory to 3 [S32], and resolved atomic result retreat advisory to 2 [S32].

#### Contract clauses evaluated in the compute phase

##### `AS_PHASE_OWNERSHIP` — Required behavior

> During contract evaluation for the compute phase, Priority Phase Arbitration shall set phase context current phase to phase state current phase, resolved atomic result current phase to phase state current phase, and owned phase to resolved atomic result next phase.

##### `AS_ATOMIC_STATUS` — Required behavior

> During contract evaluation for the compute phase, Priority Phase Arbitration shall set resolved atomic result fault to fault fault, resolved atomic result next valid streak to threat publication next valid streak, resolved atomic result cargo advisory to resource publication cargo advisory, resolved atomic result capacitor advisory to resource publication capacitor advisory, and resolved atomic result retreat advisory to resource publication retreat advisory.

##### `CASE_01_DOCKED_DEPART` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 0 [S32] and mission candidate proposed reason is 1 [S32], Priority Phase Arbitration shall set resolved atomic result command to 1 [S32], resolved atomic result next phase to 1 [S32], and resolved atomic result reason to 1 [S32].

##### `CASE_02_DOCKED_STAY` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 0 [S32] and mission candidate proposed reason is 2 [S32], Priority Phase Arbitration shall set resolved atomic result command to 0 [S32], resolved atomic result next phase to 0 [S32], and resolved atomic result reason to 2 [S32].

##### `CASE_03_MINING_UNTRUSTED` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32] and response candidate proposed reason is 3 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 3 [S32].

##### `CASE_04_MINING_SEVERE` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32] and response candidate proposed reason is 4 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 4 [S32].

##### `CASE_05_HOSTILE_DEFENSE_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32] and response candidate proposed reason is 5 [S32], Priority Phase Arbitration shall set resolved atomic result command to 4 [S32], resolved atomic result next phase to 2 [S32], and resolved atomic result reason to 5 [S32].

##### `CASE_06_HOSTILE_RETREAT` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32] and response candidate proposed reason is 6 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 6 [S32].

##### `CASE_07_MISSION_RETREAT` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32], response candidate proposed reason is 0 [S32], and mission candidate proposed reason is 7 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 7 [S32].

##### `CASE_08_RESOURCE_RETREAT` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32], response candidate proposed reason is 0 [S32], and mission candidate proposed reason is 8 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 8 [S32].

##### `CASE_09_RESOURCE_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32], response candidate proposed reason is 0 [S32], and mission candidate proposed reason is 9 [S32], Priority Phase Arbitration shall set resolved atomic result command to 3 [S32], resolved atomic result next phase to 1 [S32], and resolved atomic result reason to 9 [S32].

##### `CASE_10_PILOT_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32], response candidate proposed reason is 0 [S32], and mission candidate proposed reason is 10 [S32], Priority Phase Arbitration shall set resolved atomic result command to 3 [S32], resolved atomic result next phase to 1 [S32], and resolved atomic result reason to 10 [S32].

##### `CASE_11_MINE` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 1 [S32], response candidate proposed reason is 0 [S32], and mission candidate proposed reason is 11 [S32], Priority Phase Arbitration shall set resolved atomic result command to 2 [S32], resolved atomic result next phase to 1 [S32], and resolved atomic result reason to 11 [S32].

##### `CASE_12_DEFENDING_RETREAT` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 2 [S32] and response candidate proposed reason is 12 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 12 [S32].

##### `CASE_13_DEFENDING_PERSISTS` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 2 [S32] and response candidate proposed reason is 13 [S32], Priority Phase Arbitration shall set resolved atomic result command to 4 [S32], resolved atomic result next phase to 2 [S32], and resolved atomic result reason to 13 [S32].

##### `CASE_14_RESUME_MINING` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 2 [S32], response candidate proposed reason is 15 [S32], and mission candidate proposed reason is 14 [S32], Priority Phase Arbitration shall set resolved atomic result command to 2 [S32], resolved atomic result next phase to 1 [S32], and resolved atomic result reason to 14 [S32].

##### `CASE_15_DEFENDING_FALLBACK` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 2 [S32], response candidate proposed reason is 15 [S32], and it is not the case that mission candidate proposed reason is 14 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 15 [S32].

##### `CASE_16_SAFE_ARRIVAL` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 3 [S32] and response candidate proposed reason is 16 [S32], Priority Phase Arbitration shall set resolved atomic result command to 6 [S32], resolved atomic result next phase to 4 [S32], and resolved atomic result reason to 16 [S32].

##### `CASE_17_RETREAT_PERSISTS` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 3 [S32] and response candidate proposed reason is 17 [S32], Priority Phase Arbitration shall set resolved atomic result command to 5 [S32], resolved atomic result next phase to 3 [S32], and resolved atomic result reason to 17 [S32].

##### `CASE_18_RECOVERY_CONTINUES` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 4 [S32] and mission candidate proposed reason is 18 [S32], Priority Phase Arbitration shall set resolved atomic result command to 6 [S32], resolved atomic result next phase to 4 [S32], and resolved atomic result reason to 18 [S32].

##### `CASE_19_REDEPLOY` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 4 [S32] and mission candidate proposed reason is 19 [S32], Priority Phase Arbitration shall set resolved atomic result command to 1 [S32], resolved atomic result next phase to 1 [S32], and resolved atomic result reason to 19 [S32].

##### `CASE_20_SETTLE_DOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if phase state current phase is 4 [S32] and mission candidate proposed reason is 20 [S32], Priority Phase Arbitration shall set resolved atomic result command to 0 [S32], resolved atomic result next phase to 0 [S32], and resolved atomic result reason to 20 [S32].

### Requirements for Published Supervisor Result

#### `PUBLISHED_RESULT_RANGE` — Data invariant

> Every value of Published Supervisor Result shall meet the condition that command is at least 0 [S32], command is at most 6 [S32], current phase is at least 0 [S32], current phase is at most 4 [S32], next phase is at least 0 [S32], next phase is at most 4 [S32], reason is at least 1 [S32], reason is at most 20 [S32], fault is at least 0 [S32], fault is at most 1 [S32], next valid streak is at least 0 [S32], next valid streak is at most 2 [S32], cargo advisory is at least 0 [S32], cargo advisory is at most 3 [S32], capacitor advisory is at least 0 [S32], capacitor advisory is at most 3 [S32], retreat advisory is at least 0 [S32], retreat advisory is at most 2 [S32], laser is at least 0 [S32], laser is at most 1 [S32], drones is at least 0 [S32], and drones is at most 2 [S32].

### Requirements for Qualified Threat

#### `QUALIFIED_THREAT_RANGE` — Data invariant

> Every value of Qualified Threat shall meet the condition that qualified threat is between 0 [S32] and 4 [S32], inclusive.

### Requirements for Raw Mission Observation

#### `RAW_MISSION_RANGE` — Data invariant

> Every value of Raw Mission Observation shall meet the condition that pilot intent is at least 0 [S32], pilot intent is at most 2 [S32], intent validity is at least 0 [S32], intent validity is at most 1 [S32], arrival is at least 0 [S32], arrival is at most 1 [S32], arrival validity is at least 0 [S32], arrival validity is at most 1 [S32], resupply is at least 0 [S32], resupply is at most 1 [S32], resupply validity is at least 0 [S32], and resupply validity is at most 1 [S32].

### Requirements for Raw Resource Observation

#### `RAW_RESOURCE_RANGE` — Data invariant

> Every value of Raw Resource Observation shall meet the condition that cargo is at least 0 [S32], cargo is at most 3 [S32], cargo validity is at least 0 [S32], cargo validity is at most 1 [S32], capacitor is at least 0 [S32], capacitor is at most 3 [S32], capacitor validity is at least 0 [S32], capacitor validity is at most 1 [S32], target is at least 0 [S32], target is at most 1 [S32], target validity is at least 0 [S32], target validity is at most 1 [S32], mining availability is at least 0 [S32], mining availability is at most 1 [S32], defense availability is at least 0 [S32], defense availability is at most 1 [S32], retreat availability is at least 0 [S32], retreat availability is at most 1 [S32], availability validity is at least 0 [S32], and availability validity is at most 1 [S32].

### Requirements for Raw Threat Observation

#### `RAW_THREAT_RANGE` — Data invariant

> Every value of Raw Threat Observation shall meet the condition that threat is at least 0 [S32], threat is at most 3 [S32], threat validity is at least 0 [S32], and threat validity is at most 1 [S32].

### Requirements for Resource Publication Facts

#### `RESOURCE_PUBLICATION_RANGE` — Data invariant

> Every value of Resource Publication Facts shall meet the condition that cargo advisory is at least 0 [S32], cargo advisory is at most 3 [S32], capacitor advisory is at least 0 [S32], capacitor advisory is at most 3 [S32], retreat advisory is at least 0 [S32], and retreat advisory is at most 2 [S32].

### Requirements for Resource Qualification

#### Contract clauses evaluated in the initialization phase

##### `RQ_INITIAL_ADVISORIES` — Required behavior

> During contract evaluation for the initialization phase, Resource Qualification shall set resource publication cargo advisory to 3 [S32], resource publication capacitor advisory to 3 [S32], and resource publication retreat advisory to 2 [S32].

#### Contract clauses evaluated in the compute phase

##### `RQ_MINING_AND_RESET` — Required behavior

> During contract evaluation for the compute phase, Resource Qualification shall set mining recovery facts mine ready to true exactly when All of the following conditions hold:
>
>   - raw resources cargo validity is 0 [S32]
>   - raw resources cargo is not 3 [S32]
>   - raw resources capacitor validity is 0 [S32]
>   - At least one of the following conditions holds:
>     
>       - raw resources capacitor is 0 [S32]
>       - raw resources capacitor is 1 [S32]
>   - raw resources target validity is 0 [S32]
>   - raw resources target is 0 [S32]
>   - raw resources availability validity is 0 [S32]
>   - raw resources mining availability is 0 [S32] and mining recovery facts resource reset to true exactly when All of the following conditions hold:
>
>   - raw resources cargo validity is 0 [S32]
>   - raw resources cargo is 0 [S32]
>   - raw resources capacitor validity is 0 [S32]
>   - At least one of the following conditions holds:
>     
>       - raw resources capacitor is 0 [S32]
>       - raw resources capacitor is 1 [S32].

##### `RQ_DEFENSE` — Required behavior

> During contract evaluation for the compute phase, Resource Qualification shall set defense facts defense ready to true exactly when All of the following conditions hold:
>
>   - raw resources capacitor validity is 0 [S32]
>   - At least one of the following conditions holds:
>     
>       - raw resources capacitor is 0 [S32]
>       - raw resources capacitor is 1 [S32]
>   - raw resources availability validity is 0 [S32]
>   - raw resources defense availability is 0 [S32].

##### `RQ_C08_APPLICABILITY` — Required behavior

> During contract evaluation for the compute phase, Resource Qualification shall set mining recovery facts cargo or capacitor retreat to true exactly when raw resources cargo validity is 1 [S32], raw resources cargo is 3 [S32], raw resources capacitor validity is 1 [S32], raw resources capacitor is 2 [S32], or raw resources capacitor is 3 [S32].

##### `RQ_C09_APPLICABILITY` — Required behavior

> During contract evaluation for the compute phase, Resource Qualification shall set mining recovery facts target or mining block to true exactly when raw resources target validity is 1 [S32], raw resources target is 1 [S32], raw resources availability validity is 1 [S32], or raw resources mining availability is 1 [S32].

##### `RQ_ADVISORIES` — Required behavior

> During contract evaluation for the compute phase, Resource Qualification shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     raw resources cargo validity is 1 [S32]
>     
>     **Then:**
>     
>     resource publication cargo advisory is 3 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources cargo validity is 0 [S32]
>       - raw resources cargo is 3 [S32]
>     
>     **Then:**
>     
>     resource publication cargo advisory is 2 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources cargo validity is 0 [S32]
>       - raw resources cargo is 2 [S32]
>     
>     **Then:**
>     
>     resource publication cargo advisory is 1 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources cargo validity is 0 [S32]
>       - At least one of the following conditions holds:
>         
>           - raw resources cargo is 0 [S32]
>           - raw resources cargo is 1 [S32]
>     
>     **Then:**
>     
>     resource publication cargo advisory is 0 [S32]
>   - **If:**
>     
>     raw resources capacitor validity is 1 [S32]
>     
>     **Then:**
>     
>     resource publication capacitor advisory is 3 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources capacitor validity is 0 [S32]
>       - raw resources capacitor is 3 [S32]
>     
>     **Then:**
>     
>     resource publication capacitor advisory is 2 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources capacitor validity is 0 [S32]
>       - raw resources capacitor is 2 [S32]
>     
>     **Then:**
>     
>     resource publication capacitor advisory is 1 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources capacitor validity is 0 [S32]
>       - At least one of the following conditions holds:
>         
>           - raw resources capacitor is 0 [S32]
>           - raw resources capacitor is 1 [S32]
>     
>     **Then:**
>     
>     resource publication capacitor advisory is 0 [S32]
>   - **If:**
>     
>     raw resources availability validity is 1 [S32]
>     
>     **Then:**
>     
>     resource publication retreat advisory is 2 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources availability validity is 0 [S32]
>       - raw resources retreat availability is 1 [S32]
>     
>     **Then:**
>     
>     resource publication retreat advisory is 1 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - raw resources availability validity is 0 [S32]
>       - raw resources retreat availability is 0 [S32]
>     
>     **Then:**
>     
>     resource publication retreat advisory is 0 [S32].

##### `RQ_INVALIDITY` — Required behavior

> During contract evaluation for the compute phase, Resource Qualification shall set resource invalidity resource invalid to true exactly when raw resources cargo validity is 1 [S32], raw resources capacitor validity is 1 [S32], raw resources target validity is 1 [S32], or raw resources availability validity is 1 [S32].

### Requirements for Response Proposal

#### `RESPONSE_PROPOSAL_RANGE` — Data invariant

> Every value of Response Proposal shall meet the condition that proposed reason is between 0 [S32] and 17 [S32], inclusive.

### Requirements for Threat Publication Facts

#### `THREAT_PUBLICATION_RANGE` — Data invariant

> Every value of Threat Publication Facts shall meet the condition that qualified threat is at least 0 [S32], qualified threat is at most 4 [S32], next valid streak is at least 0 [S32], and next valid streak is at most 2 [S32].

### Requirements for Threat Qualification

#### Contract clauses evaluated in the initialization phase

##### `TQ_INITIAL_STREAK` — Required behavior

> During contract evaluation for the initialization phase, Threat Qualification shall set owned valid streak to 0 [S32] and threat publication next valid streak to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `TQ_STREAK_AND_TRUST` — Required behavior

> During contract evaluation for the compute phase, Threat Qualification shall produce a result for which if raw threat threat validity is 1 [S32], then threat publication next valid streak is 0 [S32] and qualified threat qualified threat is 0 [S32], if raw threat threat validity is 0 [S32] and streak state current valid streak is 0 [S32], then threat publication next valid streak is 1 [S32] and qualified threat qualified threat is 0 [S32], if raw threat threat validity is 0 [S32] and streak state current valid streak is 1 [S32], then threat publication next valid streak is 2 [S32] and qualified threat qualified threat is the sum of raw threat threat and 1 [S32], and if raw threat threat validity is 0 [S32] and streak state current valid streak is 2 [S32], then threat publication next valid streak is 2 [S32] and qualified threat qualified threat is the sum of raw threat threat and 1 [S32].

##### `TQ_QUALIFIED_FACTS` — Required behavior

> During contract evaluation for the compute phase, Threat Qualification shall set qualified threat untrusted to true exactly when qualified threat qualified threat is 0 [S32], qualified threat acceptable to true exactly when qualified threat qualified threat is 1 [S32] or qualified threat qualified threat is 2 [S32], qualified threat hostile to true exactly when qualified threat qualified threat is 3 [S32], and qualified threat severe to true exactly when qualified threat qualified threat is 4 [S32].

##### `TQ_PUBLICATION_AND_STATE` — Required behavior

> During contract evaluation for the compute phase, Threat Qualification shall set threat publication qualified threat to qualified threat qualified threat and owned valid streak to threat publication next valid streak.

##### `TQ_INVALIDITY` — Required behavior

> During contract evaluation for the compute phase, Threat Qualification shall set threat invalidity threat invalid to true exactly when raw threat threat validity is 1 [S32].

### Requirements for Threat Retreat Decision

#### Contract clauses evaluated in the initialization phase

##### `TR_INITIAL_NONE` — Required behavior

> During contract evaluation for the initialization phase, Threat Retreat Decision shall set response proposal proposed reason to 0 [S32].

#### Contract clauses evaluated in the compute phase

##### `TR_PROPOSAL_PARTITIONS` — Required behavior

> During contract evaluation for the compute phase, Threat Retreat Decision shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     phase context current phase is 0 [S32]
>     
>     **Then:**
>     
>     response proposal proposed reason is 0 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - threat fact untrusted is true
>     
>     **Then:**
>     
>     response proposal proposed reason is 3 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - threat fact untrusted is false
>       - threat fact severe is true
>     
>     **Then:**
>     
>     response proposal proposed reason is 4 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - threat fact untrusted is false
>       - threat fact severe is false
>       - threat fact hostile is true
>       - defense facts defense ready is true
>     
>     **Then:**
>     
>     response proposal proposed reason is 5 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - threat fact untrusted is false
>       - threat fact severe is false
>       - threat fact hostile is true
>       - defense facts defense ready is false
>     
>     **Then:**
>     
>     response proposal proposed reason is 6 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 1 [S32]
>       - threat fact untrusted is false
>       - threat fact severe is false
>       - threat fact hostile is false
>     
>     **Then:**
>     
>     response proposal proposed reason is 0 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 2 [S32]
>       - At least one of the following conditions holds:
>         
>           - threat fact untrusted is true
>           - threat fact severe is true
>           - defense facts defense ready is false
>     
>     **Then:**
>     
>     response proposal proposed reason is 12 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 2 [S32]
>       - threat fact untrusted is false
>       - threat fact severe is false
>       - defense facts defense ready is true
>       - threat fact hostile is true
>     
>     **Then:**
>     
>     response proposal proposed reason is 13 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 2 [S32]
>       - threat fact untrusted is false
>       - threat fact severe is false
>       - defense facts defense ready is true
>       - threat fact hostile is false
>     
>     **Then:**
>     
>     response proposal proposed reason is 15 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 3 [S32]
>       - arrival fact valid safe at station is true
>     
>     **Then:**
>     
>     response proposal proposed reason is 16 [S32]
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - phase context current phase is 3 [S32]
>       - arrival fact valid safe at station is false
>     
>     **Then:**
>     
>     response proposal proposed reason is 17 [S32]
>   - **If:**
>     
>     phase context current phase is 4 [S32]
>     
>     **Then:**
>     
>     response proposal proposed reason is 0 [S32].

### Requirements for Threat State Input

#### `THREAT_STATE_RANGE` — Data invariant

> Every value of Threat State Input shall meet the condition that current valid streak is between 0 [S32] and 2 [S32], inclusive.
