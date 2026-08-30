# Frigate Threat Evidence and Egress Response Supervisor

## Selected system context

### Need, purpose, capabilities, and goals

NEED-01: A fictional mining-frigate pilot and fleet-command recipient need a bounded
supervisory function that turns threat evidence and response-resource observations into
an explicit threat report, logical defense activation, and retreat-oriented navigation
request without governing mining, cargo, offload, resupply, or overall mission phase.

PURPOSE-01: The system shall qualify threat evidence, retain a threat episode until an
explicit clear condition is confirmed, qualify defense and egress applicability, resolve
defense-versus-egress conflicts, retain an egress response session, and publish the
selected response status.

GOAL-01: The system shall never treat invalid threat evidence as clear evidence or use
it to close an already declared threat episode.

GOAL-02: The system shall make the conflict between an eligible fresh egress request and
simultaneously ready defense explicit and deterministic.

GOAL-03: The system shall keep threat-episode state and egress-session state under
separate, unique owners and shall require a fresh eligible egress request to retry after
an egress block.

GOAL-04: The system shall publish one report, defense command, egress command, and
response status for every finite one-evaluation input and pre-state combination while
making no claim that a hostile is defeated or retreat succeeds.

### Operational context and system boundary

CTX-01: The Pilot is external, supplies a response disposition and interprets reports
and response status. The abstract does not authenticate the pilot or claim real command
authority.

CTX-02: The Threat Observation Source is external, supplies one classified evidence band
with an independent validity value, and is responsible only for values in the selected
finite domain; detection performance is not modeled.

CTX-03: The Fleet-Command Recipient is external and receives the threat report and
response status; tactics, acknowledgments beyond the selected pilot disposition, and
fleet coordination remain outside.

CTX-04: The Defense Support Context is external, supplies qualitative defense
availability and capacitor-support sufficiency, and receives a logical
defense-activation command; actuation and defensive outcome remain outside.

CTX-05: The Retreat-Navigation Context is external, supplies route knowledge and
observed egress progress and receives a retreat-oriented logical navigation command; it
owns destination selection, course control, warp, docking, and physical progress.

CTX-06: Mining, cargo, station service, operations management, ship engineering, drones,
asteroid resources, and hostile ships remain external context. Their mission decisions
are not reconstructed; only defense-support and retreat-navigation observations cross
this boundary.

### Exact finite boundary inputs

MON-01: `threatObservation : ThreatObservation` is supplied by `CTX-02` and contains
`evidenceBand = CLEAR|SUSPICIOUS|HOSTILE` and independent `validity = INVALID|VALID`,
for exactly six combinations.

MON-02: `pilotDisposition : PilotDisposition` is supplied by `CTX-01` and has exactly
`NO_RESPONSE|ACKNOWLEDGE_ALERT|CONFIRM_CLEAR`; only `CONFIRM_CLEAR` can complete a
pending clear, and it has no effect without valid clear evidence.

MON-03: `defenseSupport : DefenseSupportObservation` is supplied by `CTX-04` and
contains `defenseAvailability = UNAVAILABLE|AVAILABLE` and `capacitorSupport =
INSUFFICIENT|SUFFICIENT`, for exactly four combinations.

MON-04: `egressRoute : EgressRouteObservation` is supplied by `CTX-05` and has exactly
`UNKNOWN|BLOCKED|AVAILABLE`; it is a qualitative route observation, not proof that
traversal will succeed.

MON-05: `egressProgress : EgressProgress` is supplied by `CTX-05` and has exactly
`NOT_STARTED|EN_ROUTE|SAFE_DESTINATION_OBSERVED|FAILED`; the safe-destination literal is
an external observation, not a system guarantee.

MON-06: `responseAuthorization : ResponseAuthorization` is supplied by `CTX-01` and has
exactly `NO_REQUEST|EGRESS_REQUEST|CANCEL_EGRESS`; `EGRESS_REQUEST` is a fresh request
in the current logical evaluation and is not a latched mission intent.

### Exact finite controlled outputs

CTRL-01: `threatReport : ThreatReport` is delivered to `CTX-01` and `CTX-03` and has
exactly
`NO_REPORT|WATCH_REPORT|HOSTILE_ALERT|EVIDENCE_FAULT|CLEAR_PENDING_REPORT|CLEAR_CONFIRMED_REPORT`.

CTRL-02: `defenseCommand : DefenseCommand` is delivered to `CTX-04` and has exactly
`STANDBY|ACTIVATE`; it is logical activation selection, not confirmation of deployment
or effectiveness.

CTRL-03: `egressCommand : EgressCommand` is delivered to `CTX-05` and has exactly
`NONE|INITIATE|CONTINUE|HOLD|CANCEL`; it neither identifies a physical course nor
confirms movement.

CTRL-04: `responseStatus : ResponseStatus` is delivered to `CTX-01` and `CTX-03` and has
exactly
`QUIET|WATCHING|THREAT_DECLARED|DEFENDING|EGRESS_ORDERED|EGRESS_MOVING|EGRESS_BLOCKED|ARRIVAL_OBSERVED|EVIDENCE_UNAVAILABLE|CLEAR_PENDING`.

### Risks and logical mitigations

RISK-01: Invalid evidence treated as clear could close a declared threat episode and
suppress reporting; cases 01, 04, 15, and 16 preserve uncertainty and report the
evidence fault without asserting physical safety.

RISK-02: Simultaneous defense and egress eligibility could produce contradictory
commands; cases 17 and 19 select one directive and coordinate both outputs under the
declared priority.

RISK-03: Treating route recovery as an implicit new command could restart
retreat-oriented movement without fresh authorization; `REC-03`, case 17, and case 19
require a new eligible request.

RISK-04: Treating an external safe-destination observation as threat clearance could
erase unresolved evidence; separate episode and egress states plus `REC-02` and `REC-04`
prevent that state collapse.

### Essential assumptions and constraints

ASM-01: `CTX-02` is responsible for supplying domain-valid observation fields. No
accuracy, independence, latency, range, probability, or hostile-classification
performance is assumed; validity is a selected logical status only.

ASM-02: `CTX-01` supplies exactly one disposition and one authorization literal per
logical evaluation. `ACKNOWLEDGE_ALERT`, `CONFIRM_CLEAR`, request, and cancellation
meanings are pilot abstractions and do not establish real authority or human-performance
adequacy.

ASM-03: `CTX-04` supplies both defense-support fields independently. Availability and
capacitor sufficiency are qualitative and unitless; they do not prove that defense can
deploy, operate, or defeat a threat.

ASM-04: `CTX-05` supplies route and progress values independently and owns their
physical interpretation. `SAFE_DESTINATION_OBSERVED` and `FAILED` are logical reports
without timing, location, causality, or success guarantees.

ASM-05: Both state owners evaluate from their committed pre-state and commit only the
computed next state after outputs are derived. No concurrency ordering between the two
owners is claimed beyond the explicit directed fact flow in the same logical evaluation.

## Supporting contract definitions

### State `Frigate_Threat_Egress_Supervisor::ResponseStateController::committedEgress`

State `committedEgress` has type `Frigate_Threat_Egress_Supervisor::EgressSessionState`.

### State `Frigate_Threat_Egress_Supervisor::ThreatEpisodeTracker::committedEpisode`

State `committedEpisode` has type `Frigate_Threat_Egress_Supervisor::ThreatEpisodeState`.

## Detailed behavioral requirements

### Requirements for DefenseReadinessQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_DEFENSE_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, DefenseReadinessQualifier shall produce a result for which if evidenceAssessment is not HOSTILE, then defenseQualification is INAPPLICABLE, if evidenceAssessment is HOSTILE and defenseSupport defenseAvailability is UNAVAILABLE, then defenseQualification is BLOCKED AVAILABILITY, if evidenceAssessment is HOSTILE, defenseSupport defenseAvailability is AVAILABLE, and defenseSupport capacitorSupport is INSUFFICIENT, then defenseQualification is BLOCKED CAPACITOR, and if evidenceAssessment is HOSTILE, defenseSupport defenseAvailability is AVAILABLE, and defenseSupport capacitorSupport is SUFFICIENT, then defenseQualification is READY.

#### Contract clauses evaluated in the compute phase

##### `CASE_07_DEFENSE_INAPPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is not HOSTILE, DefenseReadinessQualifier shall set defenseQualification to INAPPLICABLE.

##### `CASE_08_DEFENSE_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is HOSTILE and defenseSupport defenseAvailability is UNAVAILABLE, DefenseReadinessQualifier shall set defenseQualification to BLOCKED AVAILABILITY.

##### `CASE_09_CAPACITOR_BLOCK` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is HOSTILE, defenseSupport defenseAvailability is AVAILABLE, and defenseSupport capacitorSupport is INSUFFICIENT, DefenseReadinessQualifier shall set defenseQualification to BLOCKED CAPACITOR.

##### `CASE_10_DEFENSE_READY` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is HOSTILE, defenseSupport defenseAvailability is AVAILABLE, and defenseSupport capacitorSupport is SUFFICIENT, DefenseReadinessQualifier shall set defenseQualification to READY.

### Requirements for EgressReadinessQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_EGRESS_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, EgressReadinessQualifier shall produce a result for which if evidenceAssessment is not HOSTILE, then egressQualification is INAPPLICABLE, if evidenceAssessment is HOSTILE and egressRoute is UNKNOWN, then egressQualification is ROUTE UNKNOWN, if evidenceAssessment is HOSTILE and egressRoute is BLOCKED, then egressQualification is ROUTE BLOCKED, and if evidenceAssessment is HOSTILE and egressRoute is AVAILABLE, then egressQualification is READY.

#### Contract clauses evaluated in the compute phase

##### `CASE_11_EGRESS_INAPPLICABLE` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is not HOSTILE, EgressReadinessQualifier shall set egressQualification to INAPPLICABLE.

##### `CASE_12_ROUTE_UNKNOWN` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is HOSTILE and egressRoute is UNKNOWN, EgressReadinessQualifier shall set egressQualification to ROUTE UNKNOWN.

##### `CASE_13_ROUTE_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is HOSTILE and egressRoute is BLOCKED, EgressReadinessQualifier shall set egressQualification to ROUTE BLOCKED.

##### `CASE_14_EGRESS_READY` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is HOSTILE and egressRoute is AVAILABLE, EgressReadinessQualifier shall set egressQualification to READY.

### Requirements for ResponseStateController

#### Contract clauses evaluated in the initialization phase

##### `INIT_EGRESS_SESSION` — Required behavior

> During contract evaluation for the initialization phase, ResponseStateController shall produce a result for which committedEgress is IDLE, defenseCommand is STANDBY, egressCommand is NONE, responseSnapshot preEgress is IDLE, responseSnapshot nextEgress is IDLE, if responseDirective is RESET, then responseSnapshot directive is RESET, if responseDirective is CONTAIN, then responseSnapshot directive is CONTAIN, if responseDirective is CANCEL EGRESS, then responseSnapshot directive is CANCEL EGRESS, if responseDirective is START EGRESS, then responseSnapshot directive is START EGRESS, if responseDirective is DEFEND, then responseSnapshot directive is DEFEND, if responseDirective is HOLD BLOCKED, then responseSnapshot directive is HOLD BLOCKED, if responseDirective is MONITOR, then responseSnapshot directive is MONITOR, responseSnapshot defenseCommand is STANDBY, and responseSnapshot egressCommand is NONE.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_RESPONSE_SNAPSHOT` — Required behavior

> During contract evaluation for the compute phase, ResponseStateController shall produce a result for which if the value of committedEgress on entry is IDLE, then responseSnapshot preEgress is IDLE, if the value of committedEgress on entry is ORDERED, then responseSnapshot preEgress is ORDERED, if the value of committedEgress on entry is MOVING, then responseSnapshot preEgress is MOVING, if the value of committedEgress on entry is BLOCKED, then responseSnapshot preEgress is BLOCKED, if the value of committedEgress on entry is ARRIVED, then responseSnapshot preEgress is ARRIVED, if committedEgress is IDLE, then responseSnapshot nextEgress is IDLE, if committedEgress is ORDERED, then responseSnapshot nextEgress is ORDERED, if committedEgress is MOVING, then responseSnapshot nextEgress is MOVING, if committedEgress is BLOCKED, then responseSnapshot nextEgress is BLOCKED, if committedEgress is ARRIVED, then responseSnapshot nextEgress is ARRIVED, if responseDirective is RESET, then responseSnapshot directive is RESET, if responseDirective is CONTAIN, then responseSnapshot directive is CONTAIN, if responseDirective is CANCEL EGRESS, then responseSnapshot directive is CANCEL EGRESS, if responseDirective is START EGRESS, then responseSnapshot directive is START EGRESS, if responseDirective is DEFEND, then responseSnapshot directive is DEFEND, if responseDirective is HOLD BLOCKED, then responseSnapshot directive is HOLD BLOCKED, if responseDirective is MONITOR, then responseSnapshot directive is MONITOR, if defenseCommand is STANDBY, then responseSnapshot defenseCommand is STANDBY, if defenseCommand is ACTIVATE, then responseSnapshot defenseCommand is ACTIVATE, if egressCommand is NONE, then responseSnapshot egressCommand is NONE, if egressCommand is INITIATE, then responseSnapshot egressCommand is INITIATE, if egressCommand is CONTINUE, then responseSnapshot egressCommand is CONTINUE, if egressCommand is HOLD, then responseSnapshot egressCommand is HOLD, and if egressCommand is CANCEL, then responseSnapshot egressCommand is CANCEL.

##### `CASE_19_EGRESS_STATE_AND_COMMAND_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, ResponseStateController shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     responseDirective is RESET
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is IDLE
>       - egressCommand is NONE
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - At least one of the following conditions holds:
>         
>           - the value of committedEgress on entry is ORDERED
>           - the value of committedEgress on entry is MOVING
>       - egressProgress is SAFE DESTINATION OBSERVED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is ARRIVED
>       - egressCommand is HOLD
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - It is not the case that:
>         
>         All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - the value of committedEgress on entry is ORDERED
>               - the value of committedEgress on entry is MOVING
>           - egressProgress is SAFE DESTINATION OBSERVED
>       - responseDirective is CANCEL EGRESS
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is IDLE
>       - egressCommand is CANCEL
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - At least one of the following conditions holds:
>         
>           - the value of committedEgress on entry is ORDERED
>           - the value of committedEgress on entry is MOVING
>       - egressProgress is FAILED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is BLOCKED
>       - egressCommand is HOLD
>       - **If:**
>         
>         responseDirective is DEFEND
>         
>         **Then:**
>         
>         defenseCommand is ACTIVATE
>       - **If:**
>         
>         responseDirective is not DEFEND
>         
>         **Then:**
>         
>         defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is ORDERED
>       - egressProgress is NOT STARTED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is ORDERED
>       - egressCommand is INITIATE
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is ORDERED
>       - egressProgress is EN ROUTE
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is MOVING
>       - egressCommand is CONTINUE
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is MOVING
>       - At least one of the following conditions holds:
>         
>           - egressProgress is NOT STARTED
>           - egressProgress is EN ROUTE
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is MOVING
>       - egressCommand is CONTINUE
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is BLOCKED
>       - responseDirective is START EGRESS
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is ORDERED
>       - egressCommand is INITIATE
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is BLOCKED
>       - responseDirective is not START EGRESS
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is BLOCKED
>       - egressCommand is HOLD
>       - **If:**
>         
>         responseDirective is DEFEND
>         
>         **Then:**
>         
>         defenseCommand is ACTIVATE
>       - **If:**
>         
>         responseDirective is not DEFEND
>         
>         **Then:**
>         
>         defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is ARRIVED
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is ARRIVED
>       - egressCommand is HOLD
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is IDLE
>       - responseDirective is START EGRESS
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is ORDERED
>       - egressCommand is INITIATE
>       - defenseCommand is STANDBY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is IDLE
>       - responseDirective is DEFEND
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is IDLE
>       - egressCommand is NONE
>       - defenseCommand is ACTIVATE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - responseDirective is not RESET
>       - responseDirective is not CANCEL EGRESS
>       - the value of committedEgress on entry is IDLE
>       - responseDirective is not START EGRESS
>       - responseDirective is not DEFEND
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - committedEgress is IDLE
>       - egressCommand is NONE
>       - defenseCommand is STANDBY.

### Requirements for ResponseStatusAssessor

#### Contract clauses evaluated in the initialization phase

##### `INIT_RESPONSE_STATUS` — Required behavior

> During contract evaluation for the initialization phase, ResponseStatusAssessor shall set responseStatus to QUIET.

#### Contract clauses evaluated in the compute phase

##### `CASE_20_RESPONSE_STATUS_PRECEDENCE` — Conditional behavior

> During contract evaluation for the compute phase, ResponseStatusAssessor shall produce a result for which if episodeSnapshot assessment is UNAVAILABLE, then responseStatus is EVIDENCE UNAVAILABLE, if episodeSnapshot assessment is not UNAVAILABLE and responseSnapshot nextEgress is ARRIVED, then responseStatus is ARRIVAL OBSERVED, if episodeSnapshot assessment is not UNAVAILABLE and responseSnapshot nextEgress is MOVING, then responseStatus is EGRESS MOVING, if episodeSnapshot assessment is not UNAVAILABLE and responseSnapshot nextEgress is ORDERED, then responseStatus is EGRESS ORDERED, if episodeSnapshot assessment is not UNAVAILABLE and responseSnapshot nextEgress is BLOCKED, then responseStatus is EGRESS BLOCKED, if episodeSnapshot assessment is not UNAVAILABLE, responseSnapshot nextEgress is IDLE, and responseSnapshot defenseCommand is ACTIVATE, then responseStatus is DEFENDING, if episodeSnapshot assessment is not UNAVAILABLE, responseSnapshot nextEgress is IDLE, responseSnapshot defenseCommand is not ACTIVATE, and episodeSnapshot nextEpisode is CLEAR PENDING, then responseStatus is CLEAR PENDING, if episodeSnapshot assessment is not UNAVAILABLE, responseSnapshot nextEgress is IDLE, responseSnapshot defenseCommand is not ACTIVATE, and episodeSnapshot nextEpisode is WATCH, then responseStatus is WATCHING, if episodeSnapshot assessment is not UNAVAILABLE, responseSnapshot nextEgress is IDLE, responseSnapshot defenseCommand is not ACTIVATE, and episodeSnapshot nextEpisode is QUIET, then responseStatus is QUIET, and if episodeSnapshot assessment is not UNAVAILABLE, responseSnapshot nextEgress is IDLE, responseSnapshot defenseCommand is not ACTIVATE, and episodeSnapshot nextEpisode is DECLARED, then responseStatus is THREAT DECLARED.

### Requirements for ThreatEpisodeTracker

#### Contract clauses evaluated in the initialization phase

##### `INIT_EPISODE` — Required behavior

> During contract evaluation for the initialization phase, ThreatEpisodeTracker shall produce a result for which committedEpisode is QUIET, episodeSnapshot preEpisode is QUIET, episodeSnapshot nextEpisode is QUIET, if evidenceAssessment is UNAVAILABLE, then episodeSnapshot assessment is UNAVAILABLE, if evidenceAssessment is CLEAR, then episodeSnapshot assessment is CLEAR, if evidenceAssessment is SUSPECT, then episodeSnapshot assessment is SUSPECT, if evidenceAssessment is HOSTILE, then episodeSnapshot assessment is HOSTILE, if pilotDisposition is NO RESPONSE, then episodeSnapshot pilotDisposition is NO RESPONSE, if pilotDisposition is ACKNOWLEDGE ALERT, then episodeSnapshot pilotDisposition is ACKNOWLEDGE ALERT, and if pilotDisposition is CONFIRM CLEAR, then episodeSnapshot pilotDisposition is CONFIRM CLEAR.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_EPISODE_SNAPSHOT` — Required behavior

> During contract evaluation for the compute phase, ThreatEpisodeTracker shall produce a result for which if the value of committedEpisode on entry is QUIET, then episodeSnapshot preEpisode is QUIET, if the value of committedEpisode on entry is WATCH, then episodeSnapshot preEpisode is WATCH, if the value of committedEpisode on entry is DECLARED, then episodeSnapshot preEpisode is DECLARED, if the value of committedEpisode on entry is CLEAR PENDING, then episodeSnapshot preEpisode is CLEAR PENDING, if committedEpisode is QUIET, then episodeSnapshot nextEpisode is QUIET, if committedEpisode is WATCH, then episodeSnapshot nextEpisode is WATCH, if committedEpisode is DECLARED, then episodeSnapshot nextEpisode is DECLARED, if committedEpisode is CLEAR PENDING, then episodeSnapshot nextEpisode is CLEAR PENDING, if evidenceAssessment is UNAVAILABLE, then episodeSnapshot assessment is UNAVAILABLE, if evidenceAssessment is CLEAR, then episodeSnapshot assessment is CLEAR, if evidenceAssessment is SUSPECT, then episodeSnapshot assessment is SUSPECT, if evidenceAssessment is HOSTILE, then episodeSnapshot assessment is HOSTILE, if pilotDisposition is NO RESPONSE, then episodeSnapshot pilotDisposition is NO RESPONSE, if pilotDisposition is ACKNOWLEDGE ALERT, then episodeSnapshot pilotDisposition is ACKNOWLEDGE ALERT, and if pilotDisposition is CONFIRM CLEAR, then episodeSnapshot pilotDisposition is CONFIRM CLEAR.

##### `CASE_04_UNAVAILABLE_CONTAINMENT` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is UNAVAILABLE, ThreatEpisodeTracker shall produce a result for which if the value of committedEpisode on entry is QUIET or the value of committedEpisode on entry is WATCH, then committedEpisode is WATCH and if the value of committedEpisode on entry is DECLARED or the value of committedEpisode on entry is CLEAR PENDING, then committedEpisode is DECLARED.

##### `CASE_05_HOSTILE_OR_SUSPECT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 HOSTILE OR SUSPECT applies under all of the following conditions:
>
> evidenceAssessment is HOSTILE or evidenceAssessment is SUSPECT.

> When all applicability conditions are met, ThreatEpisodeTracker shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     evidenceAssessment is HOSTILE
>     
>     **Then:**
>     
>     committedEpisode is DECLARED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - evidenceAssessment is SUSPECT
>       - At least one of the following conditions holds:
>         
>           - the value of committedEpisode on entry is QUIET
>           - the value of committedEpisode on entry is WATCH
>     
>     **Then:**
>     
>     committedEpisode is WATCH
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - evidenceAssessment is SUSPECT
>       - At least one of the following conditions holds:
>         
>           - the value of committedEpisode on entry is DECLARED
>           - the value of committedEpisode on entry is CLEAR PENDING
>     
>     **Then:**
>     
>     committedEpisode is DECLARED.

##### `CASE_06_CLEAR_CONFIRMATION` — Conditional behavior

> During contract evaluation for the compute phase, if evidenceAssessment is CLEAR, ThreatEpisodeTracker shall produce a result for which if the value of committedEpisode on entry is QUIET or the value of committedEpisode on entry is WATCH, then committedEpisode is QUIET, if the value of committedEpisode on entry is DECLARED, then committedEpisode is CLEAR PENDING, if the value of committedEpisode on entry is CLEAR PENDING and pilotDisposition is CONFIRM CLEAR, then committedEpisode is QUIET, and if the value of committedEpisode on entry is CLEAR PENDING and pilotDisposition is not CONFIRM CLEAR, then committedEpisode is CLEAR PENDING.

### Requirements for ThreatEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INIT_EVIDENCE_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, ThreatEvidenceQualifier shall produce a result for which if threatObservation validity is INVALID, then evidenceAssessment is UNAVAILABLE, if threatObservation validity is VALID and threatObservation evidenceBand is CLEAR, then evidenceAssessment is CLEAR, if threatObservation validity is VALID and threatObservation evidenceBand is SUSPICIOUS, then evidenceAssessment is SUSPECT, and if threatObservation validity is VALID and threatObservation evidenceBand is HOSTILE, then evidenceAssessment is HOSTILE.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_INVALID_EVIDENCE` — Conditional behavior

> During contract evaluation for the compute phase, if threatObservation validity is INVALID, ThreatEvidenceQualifier shall set evidenceAssessment to UNAVAILABLE.

##### `CASE_02_VALID_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if threatObservation validity is VALID and threatObservation evidenceBand is CLEAR, ThreatEvidenceQualifier shall set evidenceAssessment to CLEAR.

##### `CASE_03_VALID_THREAT_BANDS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 VALID THREAT BANDS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threatObservation validity is VALID
>   - At least one of the following conditions holds:
>     
>       - threatObservation evidenceBand is SUSPICIOUS
>       - threatObservation evidenceBand is HOSTILE.

> When all applicability conditions are met, ThreatEvidenceQualifier shall produce a result for which all of the following conditions hold:
>
> if threatObservation evidenceBand is SUSPICIOUS, then evidenceAssessment is SUSPECT and if threatObservation evidenceBand is HOSTILE, then evidenceAssessment is HOSTILE.

### Requirements for ThreatReportPolicy

#### Contract clauses evaluated in the initialization phase

##### `INIT_REPORT` — Required behavior

> During contract evaluation for the initialization phase, ThreatReportPolicy shall set threatReport to NO REPORT.

#### Contract clauses evaluated in the compute phase

##### `CASE_15_REPORT_PRECEDENCE` — Conditional behavior

> During contract evaluation for the compute phase, ThreatReportPolicy shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     episodeSnapshot assessment is UNAVAILABLE
>     
>     **Then:**
>     
>     threatReport is EVIDENCE FAULT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - episodeSnapshot assessment is HOSTILE
>       - episodeSnapshot pilotDisposition is not ACKNOWLEDGE ALERT
>     
>     **Then:**
>     
>     threatReport is HOSTILE ALERT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - episodeSnapshot assessment is HOSTILE
>       - episodeSnapshot pilotDisposition is ACKNOWLEDGE ALERT
>     
>     **Then:**
>     
>     threatReport is NO REPORT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - episodeSnapshot assessment is not UNAVAILABLE
>       - episodeSnapshot assessment is not HOSTILE
>       - episodeSnapshot preEpisode is CLEAR PENDING
>       - episodeSnapshot nextEpisode is QUIET
>     
>     **Then:**
>     
>     threatReport is CLEAR CONFIRMED REPORT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - episodeSnapshot assessment is not UNAVAILABLE
>       - episodeSnapshot assessment is not HOSTILE
>       - At least one of the following conditions holds:
>         
>           - episodeSnapshot preEpisode is not CLEAR PENDING
>           - episodeSnapshot nextEpisode is not QUIET
>       - episodeSnapshot nextEpisode is CLEAR PENDING
>     
>     **Then:**
>     
>     threatReport is CLEAR PENDING REPORT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - episodeSnapshot assessment is SUSPECT
>       - At least one of the following conditions holds:
>         
>           - episodeSnapshot preEpisode is not CLEAR PENDING
>           - episodeSnapshot nextEpisode is not QUIET
>       - episodeSnapshot nextEpisode is not CLEAR PENDING
>     
>     **Then:**
>     
>     threatReport is WATCH REPORT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - episodeSnapshot assessment is CLEAR
>       - At least one of the following conditions holds:
>         
>           - episodeSnapshot preEpisode is not CLEAR PENDING
>           - episodeSnapshot nextEpisode is not QUIET
>       - episodeSnapshot nextEpisode is not CLEAR PENDING
>     
>     **Then:**
>     
>     threatReport is NO REPORT.

### Requirements for ThreatResponseArbiter

#### Contract clauses evaluated in the initialization phase

##### `INIT_DIRECTIVE` — Required behavior

> During contract evaluation for the initialization phase, ThreatResponseArbiter shall set responseDirective to MONITOR.

#### Contract clauses evaluated in the compute phase

##### `CASE_16_RESET_CONTAIN_CANCEL` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot nextEpisode is QUIET, episodeSnapshot assessment is UNAVAILABLE, or responseAuthorization is CANCEL EGRESS, ThreatResponseArbiter shall produce a result for which if episodeSnapshot nextEpisode is QUIET, then responseDirective is RESET, if episodeSnapshot nextEpisode is not QUIET and episodeSnapshot assessment is UNAVAILABLE, then responseDirective is CONTAIN, and if episodeSnapshot nextEpisode is not QUIET, episodeSnapshot assessment is not UNAVAILABLE, and responseAuthorization is CANCEL EGRESS, then responseDirective is CANCEL EGRESS.

##### `CASE_17_FRESH_EGRESS_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot nextEpisode is not QUIET, episodeSnapshot assessment is not UNAVAILABLE, and responseAuthorization is EGRESS REQUEST, ThreatResponseArbiter shall produce a result for which if egressQualification is READY, then responseDirective is START EGRESS, if egressQualification is not READY and defenseQualification is READY, then responseDirective is DEFEND, and if egressQualification is not READY and defenseQualification is not READY, then responseDirective is HOLD BLOCKED.

##### `CASE_18_DEFEND_OR_MONITOR` — Conditional behavior

> During contract evaluation for the compute phase, if episodeSnapshot nextEpisode is not QUIET, episodeSnapshot assessment is not UNAVAILABLE, and responseAuthorization is NO REQUEST, ThreatResponseArbiter shall produce a result for which if defenseQualification is READY, then responseDirective is DEFEND and if defenseQualification is not READY, then responseDirective is MONITOR.
