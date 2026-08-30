# Frigate threat evidence and protective-departure coordination

## Selected system context

### Synopsis

NEED-01: A pilot-operated mining frigate needs a bounded threat-response function that
turns finite contact evidence into a persistent alert, reports that alert, and
coordinates defense activation with retreat-oriented departure without taking ownership
of mining, cargo, offload, resupply, docking, or general mission selection.

PURPOSE-01: For each coherent evaluation, the system shall publish one response frame
containing a threat report, independent defense and departure directives, an observable
response stage, and the actual states of the two protective channels.

### Goals and stakeholders

GOAL-01: Unusable threat evidence shall be reported as unknown and shall isolate both
protective channels before either can issue a new directive in the same evaluation.

GOAL-02: A retained alarm shall continue to support protective response through
transient clear or caution evidence until an explicit fresh clear acknowledgment
de-escalates it in two observable steps.

GOAL-03: Confirmed hostility shall favor departure whenever departure is ready, while
permitting defense concurrently rather than forcing defense and departure into a single
mutually exclusive mission action.

GOAL-04: A failure in one protective channel shall inhibit that channel, remain visible,
and leave the other channel independently usable when its own conditions permit.

GOAL-05: Recovery of each protective channel shall require its own reset, later recovery
confirmation, and a still-later fresh enable request; recovery evidence for one channel
shall not clear the other.

GOAL-06: Every consumer shall receive a same-evaluation response frame so threat report,
directives, response stage, and channel states cannot describe mixed evaluations.

### Operational context and exact system boundary

CTX-01: External threat sensing supplies contact class and evidence status; it observes
the environment but does not own alert memory or response policy.

CTX-02: The pilot or fleet authority supplies fresh defense and departure authority
events plus a fresh alert-clear acknowledgment, and consumes the public response frame.

CTX-03: The external defense executor supplies defense availability, a finite
capacitor-adequacy assertion, and fresh defense outcome evidence; it consumes the same
response frame and alone performs any defense activation.

CTX-04: The external navigation executor supplies navigation availability, route status,
and fresh departure outcome evidence; it consumes the same response frame and alone
performs retreat-oriented movement.

CTX-05: The excluded mining controller supplies only whether mining equipment is
externally confirmed safe for departure; it receives no mining command and exposes no
cargo or service policy.

CTX-06: Asteroids, hostile ships, stations, the mining corporation, fleet, Rorqual,
drones, market actors, and support services remain environmental context; none is
assigned an internal responsibility by this abstract.

MON-01: `ThreatEvidence=(ContactClass,EvidenceStatus)` comes from CTX-01, where
`ContactClass={NO_CONTACT,UNCERTAIN,HOSTILE_SIGNATURE}` and
`EvidenceStatus={VALID,INVALID}` are finite, unitless pilot categories.

MON-02: `DefenseAuthority={NONE,ENABLE,RESET}`, `EscapeAuthority={NONE,ENABLE,RESET}`,
and Boolean `clearAcknowledgment` come from CTX-02; every non-`NONE` authority and true
acknowledgment is a fresh consumed-once event.

MON-03: Boolean `defenseAvailable`, Boolean `capacitorAdequate`, and
`DefenseOutcome={NONE,COMMAND_SUCCEEDED,COMMAND_FAILED,RECOVERY_CONFIRMED}` come from
CTX-03; non-`NONE` outcomes are fresh and consumed once.

MON-04: Boolean `navigationAvailable`, `RouteStatus={UNAVAILABLE,READY}`, and
`EscapeOutcome={NONE,DEPARTURE_SUCCEEDED,DEPARTURE_FAILED,RECOVERY_CONFIRMED}` come from
CTX-04; non-`NONE` outcomes are fresh and consumed once.

MON-05: `MiningInterlock={CLEAR,BLOCKED}` comes from CTX-05 and states only whether
externally owned mining equipment permits departure; it conveys no mining intent, cargo
state, or action priority.

CTRL-01:
`ResponseFrame=(ThreatReport,DefenseDirective,EscapeDirective,ResponsePattern,ResponseStage,DefenseChannelState,EscapeChannelState)`
is the sole controlled boundary value and shall be delivered atomically to CTX-02,
CTX-03, and CTX-04.

### Risks, state, stages, assumptions, and constraints

RISK-01: Unusable evidence could otherwise activate defense or departure on an
unsupported threat claim; FAULT-01, FAULT-02, FAULT-03, and CASE-26 mitigate this by
preserving alert memory, isolating both channels, withholding directives, and reporting
unknown evidence.

RISK-02: A transient clear sample could otherwise erase a retained alarm and suppress
protection; CASE-07 through CASE-10 mitigate this with explicit two-step acknowledged
de-escalation.

RISK-03: A failure in one protective channel could otherwise disable all threat
response; FAULT-04 mitigates this with separate state owners, gates, readiness,
proposals, and partial-degradation behavior.

RISK-04: Reset, stale success, or same-evaluation recovery confirmation could otherwise
immediately reissue a command; CASE-12 through CASE-18 and the blocked confirmation
evaluation require a later fresh enable.

RISK-05: Separately emitted report and command fields could otherwise describe different
policy evaluations; BEH-06 mitigates this with one complete response frame fanned out
unchanged.

MODE-01: Before the first coherent evaluation the response frame may expose
`INITIALIZING`; after evaluation, `MONITORING`, `RESPONDING`, `DEGRADED`, and
`EVIDENCE_FAULT` differ observably in report, channel health, or command permission as
defined by CASE-26 through CASE-29.

ASM-01: CTX-01 is responsible for marking unusable evidence `INVALID`; contact
categories are pilot abstractions and are not calibrated physical measurements.

ASM-02: CTX-02 is responsible for presenting each `ENABLE`, `RESET`, and true clear
acknowledgment once; a later action after recovery requires a new `ENABLE`, and replayed
authority is outside the contract.

ASM-03: CTX-03 is responsible for capacitor adequacy and defense availability as
command-acceptance assertions and for fresh, correctly tagged defense outcomes; none
guarantees physical success.

ASM-04: CTX-04 is responsible for route and navigation availability as
command-acceptance assertions and for fresh, correctly tagged departure outcomes;
`READY` does not prove route safety.

ASM-05: CTX-05 is responsible for asserting `CLEAR` only after the excluded mining
controller has made equipment safe for departure; this system neither commands nor
verifies mining shutdown.

## Supporting contract definitions

### State `Frigate_Threat_Response_Coordinator::AlertMemory::retainedAlert`

State `retainedAlert` has type `Frigate_Threat_Response_Coordinator::AlertState`.

### State `Frigate_Threat_Response_Coordinator::DefenseChannelRecovery::defenseRecoveryState`

State `defenseRecoveryState` has type `Frigate_Threat_Response_Coordinator::ChannelState`.

### State `Frigate_Threat_Response_Coordinator::EscapeChannelRecovery::escapeRecoveryState`

State `escapeRecoveryState` has type `Frigate_Threat_Response_Coordinator::ChannelState`.

## Detailed behavioral requirements

### Requirements for AlertMemory

#### Contract clauses evaluated in the initialization phase

May modify: retainedAlert

##### `INITIAL_ALERT` — Required behavior

> During contract evaluation for the initialization phase, AlertMemory shall set retainedAlert to QUIET, defenseAlertOut to QUIET, escapeAlertOut to QUIET, compositionAlertOut to QUIET, and threatReportOut to UNKNOWN.

#### Contract clauses evaluated in the compute phase

May modify: retainedAlert

##### `ACTUAL_ALERT_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, AlertMemory shall set defenseAlertOut to retainedAlert, escapeAlertOut to retainedAlert, and compositionAlertOut to retainedAlert.

##### `ALERT_REPORT_MAPPING` — Required behavior

> During contract evaluation for the compute phase, AlertMemory shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - qualifiedThreatIn validity is UNUSABLE
>       - threatReportOut is UNKNOWN
>   - All of the following conditions hold:
>     
>       - qualifiedThreatIn validity is USABLE
>       - retainedAlert is QUIET
>       - threatReportOut is CLEAR
>   - All of the following conditions hold:
>     
>       - qualifiedThreatIn validity is USABLE
>       - retainedAlert is WATCH
>       - threatReportOut is CAUTION
>   - All of the following conditions hold:
>     
>       - qualifiedThreatIn validity is USABLE
>       - retainedAlert is ALARM
>       - threatReportOut is HOSTILE.

##### `CASE_05_UNUSABLE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreatIn validity is UNUSABLE, AlertMemory shall preserve the value of retainedAlert on entry.

##### `CASE_06_HOSTILE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreatIn validity is USABLE and qualifiedThreatIn band is HOSTILE, AlertMemory shall set retainedAlert to ALARM.

##### `CASE_07_ALARM_ACK_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreatIn validity is USABLE, qualifiedThreatIn band is CLEAR, the value of retainedAlert on entry is ALARM, and clearAcknowledgmentIn is true, AlertMemory shall set retainedAlert to WATCH.

##### `CASE_08_RETAIN_ALARM` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreatIn validity is USABLE, qualifiedThreatIn band is not HOSTILE, the value of retainedAlert on entry is ALARM, and it is not the case that qualifiedThreatIn band is CLEAR and clearAcknowledgmentIn is true, AlertMemory shall set retainedAlert to ALARM.

##### `CASE_09_WATCH` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 WATCH applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedThreatIn validity is USABLE
>   - qualifiedThreatIn band is not HOSTILE
>   - the value of retainedAlert on entry is not ALARM
>   - At least one of the following conditions holds:
>     
>       - qualifiedThreatIn band is CAUTION
>       - All of the following conditions hold:
>         
>           - the value of retainedAlert on entry is WATCH
>           - It is not the case that:
>             
>             All of the following conditions hold:
>             
>               - qualifiedThreatIn band is CLEAR
>               - clearAcknowledgmentIn is true.

> When all applicability conditions are met, AlertMemory shall produce a result for which all of the following conditions hold:
>
> retainedAlert is WATCH.

##### `CASE_10_QUIET` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 QUIET applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedThreatIn validity is USABLE
>   - qualifiedThreatIn band is CLEAR
>   - the value of retainedAlert on entry is not ALARM
>   - At least one of the following conditions holds:
>     
>       - the value of retainedAlert on entry is QUIET
>       - clearAcknowledgmentIn is true.

> When all applicability conditions are met, AlertMemory shall produce a result for which all of the following conditions hold:
>
> retainedAlert is QUIET.

### Requirements for DefenseActivationDecision

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DEFENSE_PROPOSAL` — Required behavior

> During contract evaluation for the initialization phase, DefenseActivationDecision shall set defenseProposalToCoordinationOut to STANDBY and defenseProposalToCompositionOut to STANDBY.

#### Contract clauses evaluated in the compute phase

##### `DEFENSE_PROPOSAL_FANOUT` — Required behavior

> During contract evaluation for the compute phase, DefenseActivationDecision shall set defenseProposalToCoordinationOut to defenseProposalToCompositionOut.

##### `CASE_19_ACTIVATE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 ACTIVATE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - alertStateIn is WATCH
>       - alertStateIn is ALARM
>   - defenseReadyIn is true
>   - defenseAuthorityIn is ENABLE.

> When all applicability conditions are met, DefenseActivationDecision shall produce a result for which all of the following conditions hold:
>
> defenseProposalToCoordinationOut is ACTIVATE.

##### `CASE_20_STANDBY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 STANDBY applies under all of the following conditions:
>
> It is not the case that:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - alertStateIn is WATCH
>       - alertStateIn is ALARM
>   - defenseReadyIn is true
>   - defenseAuthorityIn is ENABLE.

> When all applicability conditions are met, DefenseActivationDecision shall produce a result for which all of the following conditions hold:
>
> defenseProposalToCoordinationOut is STANDBY.

### Requirements for DefenseChannelRecovery

#### Contract clauses evaluated in the initialization phase

May modify: defenseRecoveryState

##### `INITIAL_DEFENSE_CHANNEL` — Required behavior

> During contract evaluation for the initialization phase, DefenseChannelRecovery shall set defenseRecoveryState to AVAILABLE, defenseChannelStateOut to AVAILABLE, and defenseGateOut to OPEN.

#### Contract clauses evaluated in the compute phase

May modify: defenseRecoveryState

##### `DEFENSE_STATE_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, DefenseChannelRecovery shall set defenseChannelStateOut to defenseRecoveryState.

##### `CASE_11_DEFENSE_ISOLATE` — Conditional behavior

> During contract evaluation for the compute phase, if threatValidityIn is UNUSABLE or defenseOutcomeIn is COMMAND FAILED, DefenseChannelRecovery shall set defenseRecoveryState to ISOLATED and defenseGateOut to BLOCKED.

##### `CASE_12_DEFENSE_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if threatValidityIn is USABLE, defenseOutcomeIn is not COMMAND FAILED, the value of defenseRecoveryState on entry is ISOLATED, and defenseAuthorityIn is RESET, DefenseChannelRecovery shall set defenseRecoveryState to PROBATION and defenseGateOut to BLOCKED.

##### `CASE_13_DEFENSE_CONFIRM` — Conditional behavior

> During contract evaluation for the compute phase, if threatValidityIn is USABLE, defenseOutcomeIn is not COMMAND FAILED, the value of defenseRecoveryState on entry is PROBATION, and defenseOutcomeIn is RECOVERY CONFIRMED, DefenseChannelRecovery shall set defenseRecoveryState to AVAILABLE and defenseGateOut to BLOCKED.

##### `CASE_14_DEFENSE_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 DEFENSE RETAIN applies under all of the following conditions:
>
> threatValidityIn is USABLE, defenseOutcomeIn is not COMMAND FAILED, it is not the case that the value of defenseRecoveryState on entry is ISOLATED and defenseAuthorityIn is RESET, and it is not the case that the value of defenseRecoveryState on entry is PROBATION and defenseOutcomeIn is RECOVERY CONFIRMED.

> When all applicability conditions are met, DefenseChannelRecovery shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - defenseRecoveryState is the value of defenseRecoveryState on entry
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - defenseRecoveryState is AVAILABLE
>           - defenseGateOut is OPEN
>       - All of the following conditions hold:
>         
>           - defenseRecoveryState is not AVAILABLE
>           - defenseGateOut is BLOCKED.

### Requirements for DefenseReadiness

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DEFENSE_READINESS` — Required behavior

> During contract evaluation for the initialization phase, DefenseReadiness shall produce a result for which defenseReadyOut is false.

#### Contract clauses evaluated in the compute phase

##### `DEFENSE_READINESS_EQUATION` — Required behavior

> During contract evaluation for the compute phase, DefenseReadiness shall set defenseReadyOut to true exactly when readinessContextIn defenseAvailable is true, readinessContextIn capacitorAdequate is true, and defenseGateIn is OPEN.

### Requirements for DepartureInitiationDecision

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ESCAPE_PROPOSAL` — Required behavior

> During contract evaluation for the initialization phase, DepartureInitiationDecision shall set escapeProposalToCoordinationOut to STAY and escapeProposalToCompositionOut to STAY.

#### Contract clauses evaluated in the compute phase

##### `ESCAPE_PROPOSAL_FANOUT` — Required behavior

> During contract evaluation for the compute phase, DepartureInitiationDecision shall set escapeProposalToCoordinationOut to escapeProposalToCompositionOut.

##### `CASE_21_DEPART` — Conditional behavior

> During contract evaluation for the compute phase, if alertStateIn is ALARM, escapeReadyIn is true, and escapeAuthorityIn is ENABLE, DepartureInitiationDecision shall set escapeProposalToCoordinationOut to DEPART.

##### `CASE_22_STAY` — Conditional behavior

> During contract evaluation for the compute phase, if it is not the case that alertStateIn is ALARM, escapeReadyIn is true, and escapeAuthorityIn is ENABLE, DepartureInitiationDecision shall set escapeProposalToCoordinationOut to STAY.

### Requirements for DepartureReadiness

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ESCAPE_READINESS` — Required behavior

> During contract evaluation for the initialization phase, DepartureReadiness shall produce a result for which escapeReadyOut is false.

#### Contract clauses evaluated in the compute phase

##### `ESCAPE_READINESS_EQUATION` — Required behavior

> During contract evaluation for the compute phase, DepartureReadiness shall set escapeReadyOut to true exactly when navigationAvailableIn is true, routeStatusIn is READY, miningInterlockIn is CLEAR, and escapeGateIn is OPEN.

### Requirements for EscapeChannelRecovery

#### Contract clauses evaluated in the initialization phase

May modify: escapeRecoveryState

##### `INITIAL_ESCAPE_CHANNEL` — Required behavior

> During contract evaluation for the initialization phase, EscapeChannelRecovery shall set escapeRecoveryState to AVAILABLE, escapeChannelStateOut to AVAILABLE, and escapeGateOut to OPEN.

#### Contract clauses evaluated in the compute phase

May modify: escapeRecoveryState

##### `ESCAPE_STATE_PUBLICATION` — Required behavior

> During contract evaluation for the compute phase, EscapeChannelRecovery shall set escapeChannelStateOut to escapeRecoveryState.

##### `CASE_15_ESCAPE_ISOLATE` — Conditional behavior

> During contract evaluation for the compute phase, if threatValidityIn is UNUSABLE or escapeOutcomeIn is DEPARTURE FAILED, EscapeChannelRecovery shall set escapeRecoveryState to ISOLATED and escapeGateOut to BLOCKED.

##### `CASE_16_ESCAPE_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if threatValidityIn is USABLE, escapeOutcomeIn is not DEPARTURE FAILED, the value of escapeRecoveryState on entry is ISOLATED, and escapeAuthorityIn is RESET, EscapeChannelRecovery shall set escapeRecoveryState to PROBATION and escapeGateOut to BLOCKED.

##### `CASE_17_ESCAPE_CONFIRM` — Conditional behavior

> During contract evaluation for the compute phase, if threatValidityIn is USABLE, escapeOutcomeIn is not DEPARTURE FAILED, the value of escapeRecoveryState on entry is PROBATION, and escapeOutcomeIn is RECOVERY CONFIRMED, EscapeChannelRecovery shall set escapeRecoveryState to AVAILABLE and escapeGateOut to BLOCKED.

##### `CASE_18_ESCAPE_RETAIN` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 ESCAPE RETAIN applies under all of the following conditions:
>
> threatValidityIn is USABLE, escapeOutcomeIn is not DEPARTURE FAILED, it is not the case that the value of escapeRecoveryState on entry is ISOLATED and escapeAuthorityIn is RESET, and it is not the case that the value of escapeRecoveryState on entry is PROBATION and escapeOutcomeIn is RECOVERY CONFIRMED.

> When all applicability conditions are met, EscapeChannelRecovery shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - escapeRecoveryState is the value of escapeRecoveryState on entry
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - escapeRecoveryState is AVAILABLE
>           - escapeGateOut is OPEN
>       - All of the following conditions hold:
>         
>           - escapeRecoveryState is not AVAILABLE
>           - escapeGateOut is BLOCKED.

### Requirements for ReportFrameComposition

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RESPONSE_FRAME` — Required behavior

> During contract evaluation for the initialization phase, ReportFrameComposition shall set responseFrameOut threatReport to UNKNOWN, responseFrameOut defenseDirective to STANDBY, responseFrameOut escapeDirective to STAY, responseFrameOut responsePattern to OBSERVE, responseFrameOut responseStage to INITIALIZING, responseFrameOut defenseCondition to AVAILABLE, and responseFrameOut escapeCondition to AVAILABLE.

#### Contract clauses evaluated in the compute phase

##### `OWNER_RESULT_PRESERVATION` — Required behavior

> During contract evaluation for the compute phase, ReportFrameComposition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - responseFrameOut threatReport is threatReportIn
>   - responseFrameOut responsePattern is responsePatternIn
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - defenseChannelStateIn is AVAILABLE
>           - responseFrameOut defenseCondition is AVAILABLE
>       - All of the following conditions hold:
>         
>           - defenseChannelStateIn is ISOLATED
>           - responseFrameOut defenseCondition is ISOLATED
>       - All of the following conditions hold:
>         
>           - defenseChannelStateIn is PROBATION
>           - responseFrameOut defenseCondition is PROBATION
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - escapeChannelStateIn is AVAILABLE
>           - responseFrameOut escapeCondition is AVAILABLE
>       - All of the following conditions hold:
>         
>           - escapeChannelStateIn is ISOLATED
>           - responseFrameOut escapeCondition is ISOLATED
>       - All of the following conditions hold:
>         
>           - escapeChannelStateIn is PROBATION
>           - responseFrameOut escapeCondition is PROBATION.

##### `DIRECTIVE_MAPPINGS` — Required behavior

> During contract evaluation for the compute phase, ReportFrameComposition shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - defenseProposalIn is ACTIVATE
>           - responseFrameOut defenseDirective is ACTIVATE
>       - All of the following conditions hold:
>         
>           - defenseProposalIn is STANDBY
>           - responseFrameOut defenseDirective is STANDBY
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - escapeProposalIn is DEPART
>           - responseFrameOut escapeDirective is DEPART
>       - All of the following conditions hold:
>         
>           - escapeProposalIn is STAY
>           - responseFrameOut escapeDirective is STAY.

##### `CASE_26_EVIDENCE_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if threatReportIn is UNKNOWN, ReportFrameComposition shall set responseFrameOut responseStage to EVIDENCE FAULT.

##### `CASE_27_DEGRADED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 27 DEGRADED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threatReportIn is not UNKNOWN
>   - At least one of the following conditions holds:
>     
>       - defenseChannelStateIn is not AVAILABLE
>       - escapeChannelStateIn is not AVAILABLE.

> When all applicability conditions are met, ReportFrameComposition shall produce a result for which all of the following conditions hold:
>
> responseFrameOut responseStage is DEGRADED.

##### `CASE_28_MONITORING` — Conditional behavior

> During contract evaluation for the compute phase, if threatReportIn is CLEAR, defenseChannelStateIn is AVAILABLE, escapeChannelStateIn is AVAILABLE, and alertStateIn is QUIET, ReportFrameComposition shall set responseFrameOut responseStage to MONITORING.

##### `CASE_29_RESPONDING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 29 RESPONDING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - defenseChannelStateIn is AVAILABLE
>   - escapeChannelStateIn is AVAILABLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - threatReportIn is CAUTION
>           - alertStateIn is WATCH
>       - All of the following conditions hold:
>         
>           - threatReportIn is HOSTILE
>           - alertStateIn is ALARM.

> When all applicability conditions are met, ReportFrameComposition shall produce a result for which all of the following conditions hold:
>
> responseFrameOut responseStage is RESPONDING.

### Requirements for ResponseCoordination

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PATTERN` — Required behavior

> During contract evaluation for the initialization phase, ResponseCoordination shall set responsePatternOut to OBSERVE.

#### Contract clauses evaluated in the compute phase

##### `CASE_23_DEPARTURE` — Conditional behavior

> During contract evaluation for the compute phase, if escapeProposalIn is DEPART, ResponseCoordination shall set responsePatternOut to DEPARTURE.

##### `CASE_24_DEFENSE` — Conditional behavior

> During contract evaluation for the compute phase, if escapeProposalIn is STAY and defenseProposalIn is ACTIVATE, ResponseCoordination shall set responsePatternOut to DEFENSE.

##### `CASE_25_OBSERVE` — Conditional behavior

> During contract evaluation for the compute phase, if escapeProposalIn is STAY and defenseProposalIn is STANDBY, ResponseCoordination shall set responsePatternOut to OBSERVE.

### Requirements for ThreatQualification

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, ThreatQualification shall set qualifiedThreatToAlertOut band to CAUTION, qualifiedThreatToAlertOut validity to UNUSABLE, threatValidityToDefenseOut to UNUSABLE, and threatValidityToEscapeOut to UNUSABLE.

#### Contract clauses evaluated in the compute phase

##### `VALIDITY_FANOUT` — Required behavior

> During contract evaluation for the compute phase, ThreatQualification shall set threatValidityToDefenseOut to qualifiedThreatToAlertOut validity and threatValidityToEscapeOut to qualifiedThreatToAlertOut validity.

##### `CASE_01_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if threatEvidenceIn evidenceStatus is INVALID, ThreatQualification shall set qualifiedThreatToAlertOut band to CAUTION and qualifiedThreatToAlertOut validity to UNUSABLE.

##### `CASE_02_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if threatEvidenceIn evidenceStatus is VALID and threatEvidenceIn contactClass is NO CONTACT, ThreatQualification shall set qualifiedThreatToAlertOut band to CLEAR and qualifiedThreatToAlertOut validity to USABLE.

##### `CASE_03_CAUTION` — Conditional behavior

> During contract evaluation for the compute phase, if threatEvidenceIn evidenceStatus is VALID and threatEvidenceIn contactClass is UNCERTAIN, ThreatQualification shall set qualifiedThreatToAlertOut band to CAUTION and qualifiedThreatToAlertOut validity to USABLE.

##### `CASE_04_HOSTILE` — Conditional behavior

> During contract evaluation for the compute phase, if threatEvidenceIn evidenceStatus is VALID and threatEvidenceIn contactClass is HOSTILE SIGNATURE, ThreatQualification shall set qualifiedThreatToAlertOut band to HOSTILE and qualifiedThreatToAlertOut validity to USABLE.
