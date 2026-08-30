// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationGate_eligibilitySupervisionProcess_authorizationGate {

  // BEGIN STATE VARS
  var gatePhase: Forest_Observation_Eligibility_Supervisor.GatePhase.Type = Forest_Observation_Eligibility_Supervisor.GatePhase.Closed
  // END STATE VARS

  def initialise(api: AuthorizationGate_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_gateOutcome(Forest_Observation_Eligibility_Supervisor.GateOutcome.None)
    api.put_observationAuthorization(Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold)
  }

  def timeTriggered(api: AuthorizationGate_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        gatePhase
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee FAILURE_HOLD_WITHHOLDS
        //   if gatePhase is FailureHold then observationAuthorization is Withhold
        In(gatePhase) == GatePhase.FailureHold ___>:
          api.observationAuthorization == ObservationAuthorization.Withhold,
        // case GATE_RECOVERED
        //   if on entry gatePhase is FailureHold and observationProgress is Idle
        (In(gatePhase) == GatePhase.FailureHold &
          api.observationProgress == ObservationProgress.Idle) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Recovered),
        // case GATE_RECOVERY_RETAINED
        //   if on entry gatePhase is FailureHold and observationProgress is not Idle
        (In(gatePhase) == GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Idle) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.None),
        // case GATE_REPORTED_FAILURE
        //   if on entry gatePhase is not FailureHold and observationProgress is Failed
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress == ObservationProgress.Failed) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Failed),
        // case GATE_ACTIVE_WHILE_CLOSED
        //   if on entry gatePhase is Closed and observationProgress is Active
        (In(gatePhase) == GatePhase.Closed &
          api.observationProgress == ObservationProgress.Active) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Failed),
        // case GATE_ACTIVE_TO_IDLE_REGRESSION
        //   if on entry gatePhase is Active and observationProgress is Idle
        (In(gatePhase) == GatePhase.Active &
          api.observationProgress == ObservationProgress.Idle) ___>: (gatePhase == GatePhase.FailureHold &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Failed),
        // case GATE_WITHDRAWAL
        //   if eligibilityDecision is Withdraw and the gate is not in a failure or progress-sensitive state
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Failed &
          !(In(gatePhase) == GatePhase.Closed &
            api.observationProgress == ObservationProgress.Active) &
          !(In(gatePhase) == GatePhase.Active &
            api.observationProgress == ObservationProgress.Idle) &
          api.eligibilityDecision == EligibilityDecision.Withdraw) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Cancelled),
        // case GATE_COMPLETION
        //   if gate is Authorized or Active, observationProgress is Completed, and eligibilityDecision is not Withdraw
        ((In(gatePhase) == GatePhase.Authorized |
          In(gatePhase) == GatePhase.Active) &
          api.observationProgress == ObservationProgress.Completed &
          api.eligibilityDecision != EligibilityDecision.Withdraw) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.Completed),
        // case GATE_DENIED_POWER
        //   if eligibilityDecision is DenyPower and the gate is not in a failure or progress-sensitive state
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Failed &
          !(In(gatePhase) == GatePhase.Closed &
            api.observationProgress == ObservationProgress.Active) &
          !(In(gatePhase) == GatePhase.Active &
            api.observationProgress == ObservationProgress.Idle) &
          !((In(gatePhase) == GatePhase.Authorized |
            In(gatePhase) == GatePhase.Active) &
            api.observationProgress == ObservationProgress.Completed) &
          api.eligibilityDecision == EligibilityDecision.DenyPower) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.DeniedPower),
        // case GATE_DENIED_SUPPORT
        //   if eligibilityDecision is DenySupport and the gate is not in a failure or progress-sensitive state
        (In(gatePhase) != GatePhase.FailureHold &
          api.observationProgress != ObservationProgress.Failed &
          !(In(gatePhase) == GatePhase.Closed &
            api.observationProgress == ObservationProgress.Active) &
          !(In(gatePhase) == GatePhase.Active &
            api.observationProgress == ObservationProgress.Idle) &
          !((In(gatePhase) == GatePhase.Authorized |
            In(gatePhase) == GatePhase.Active) &
            api.observationProgress == ObservationProgress.Completed) &
          api.eligibilityDecision == EligibilityDecision.DenySupport) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.DeniedSupport),
        // case GATE_PERMIT_FROM_CLOSED
        //   if on entry gatePhase is Closed, observationProgress is Idle, and eligibilityDecision is Permit
        (In(gatePhase) == GatePhase.Closed &
          api.observationProgress == ObservationProgress.Idle &
          api.eligibilityDecision == EligibilityDecision.Permit) ___>: (gatePhase == GatePhase.Authorized &
          api.observationAuthorization == ObservationAuthorization.Permit &
          api.gateOutcome == GateOutcome.Authorized),
        // case GATE_PROGRESS_ACTIVE
        //   if gate is Authorized or Active, observationProgress is Active, and eligibilityDecision is not Withdraw, DenyPower, or DenySupport
        ((In(gatePhase) == GatePhase.Authorized |
          In(gatePhase) == GatePhase.Active) &
          api.observationProgress == ObservationProgress.Active &
          api.eligibilityDecision != EligibilityDecision.Withdraw &
          api.eligibilityDecision != EligibilityDecision.DenyPower &
          api.eligibilityDecision != EligibilityDecision.DenySupport) ___>: (gatePhase == GatePhase.Active &
          api.observationAuthorization == ObservationAuthorization.Permit &
          api.gateOutcome == GateOutcome.Active),
        // case GATE_AUTHORIZED_IDLE
        //   if on entry gatePhase is Authorized, observationProgress is Idle, and eligibilityDecision is NoDecision or Permit
        (In(gatePhase) == GatePhase.Authorized &
          api.observationProgress == ObservationProgress.Idle &
          (api.eligibilityDecision == EligibilityDecision.NoDecision |
            api.eligibilityDecision == EligibilityDecision.Permit)) ___>: (gatePhase == GatePhase.Authorized &
          api.observationAuthorization == ObservationAuthorization.Permit &
          api.gateOutcome == GateOutcome.Authorized),
        // case GATE_CLOSED_QUIESCENT
        //   if gatePhase is Closed and no progress/event forces a transition
        (In(gatePhase) == GatePhase.Closed &
          api.observationProgress != ObservationProgress.Failed &
          api.observationProgress != ObservationProgress.Active &
          api.eligibilityDecision != EligibilityDecision.Withdraw &
          api.eligibilityDecision != EligibilityDecision.DenyPower &
          api.eligibilityDecision != EligibilityDecision.DenySupport &
          !(api.observationProgress == ObservationProgress.Idle &
            api.eligibilityDecision == EligibilityDecision.Permit)) ___>: (gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_observationProgress: Option[Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type] = api.get_observationProgress()
    api.logInfo(s"Received on data port observationProgress: ${apiUsage_observationProgress}")
    val apiUsage_eligibilityDecision: Option[Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type] = api.get_eligibilityDecision()
    api.logInfo(s"Received on data port eligibilityDecision: ${apiUsage_eligibilityDecision}")
  }

  def finalise(api: AuthorizationGate_Operational_Api): Unit = { }
}
