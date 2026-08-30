// #Sireum

package scp_candidate.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationGate_eligibilitySupervisionProcess_authorizationGate {

  // BEGIN STATE VARS
  var gatePhase: Forest_Observation_Eligibility_Supervisor.GatePhase.Type = Forest_Observation_Eligibility_Supervisor.GatePhase.Closed
  // END STATE VARS

  def initialise(api: AuthorizationGate_Initialization_Api): Unit = {
    Contract(
      Modifies(api, gatePhase),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_GATE
        gatePhase == GatePhase.Closed &
          api.observationAuthorization == ObservationAuthorization.Withhold &
          api.gateOutcome == GateOutcome.None
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    gatePhase = GatePhase.Closed
    api.put_gateOutcome(GateOutcome.None)
    api.put_observationAuthorization(ObservationAuthorization.Withhold)
  }

  def timeTriggered(api: AuthorizationGate_Operational_Api): Unit = {
    Contract(Modifies(api, gatePhase))
    val progress: Option[ObservationProgress.Type] = api.get_observationProgress()
    val decision: Option[EligibilityDecision.Type] = api.get_eligibilityDecision()
    var outcome: GateOutcome.Type = GateOutcome.None
    var authorization: ObservationAuthorization.Type = ObservationAuthorization.Withhold

    (progress, decision) match {
      case (Some(ObservationProgress.Idle), _) if gatePhase == GatePhase.FailureHold =>
        gatePhase = GatePhase.Closed
        outcome = GateOutcome.Recovered
      case (_, _) if gatePhase == GatePhase.FailureHold =>
        gatePhase = GatePhase.FailureHold
      case (Some(ObservationProgress.Failed), _) =>
        gatePhase = GatePhase.FailureHold
        outcome = GateOutcome.Failed
      case (Some(ObservationProgress.Active), _) if gatePhase == GatePhase.Closed =>
        gatePhase = GatePhase.FailureHold
        outcome = GateOutcome.Failed
      case (Some(ObservationProgress.Idle), _) if gatePhase == GatePhase.Active =>
        gatePhase = GatePhase.FailureHold
        outcome = GateOutcome.Failed
      case (_, Some(EligibilityDecision.Withdraw)) =>
        gatePhase = GatePhase.Closed
        outcome = GateOutcome.Cancelled
      case (Some(ObservationProgress.Completed), _) if gatePhase == GatePhase.Authorized | gatePhase == GatePhase.Active =>
        gatePhase = GatePhase.Closed
        outcome = GateOutcome.Completed
      case (_, Some(EligibilityDecision.DenyPower)) =>
        gatePhase = GatePhase.Closed
        outcome = GateOutcome.DeniedPower
      case (_, Some(EligibilityDecision.DenySupport)) =>
        gatePhase = GatePhase.Closed
        outcome = GateOutcome.DeniedSupport
      case (Some(ObservationProgress.Idle), Some(EligibilityDecision.Permit)) if gatePhase == GatePhase.Closed =>
        gatePhase = GatePhase.Authorized
        authorization = ObservationAuthorization.Permit
        outcome = GateOutcome.Authorized
      case (Some(ObservationProgress.Active), _) if gatePhase == GatePhase.Authorized | gatePhase == GatePhase.Active =>
        gatePhase = GatePhase.Active
        authorization = ObservationAuthorization.Permit
        outcome = GateOutcome.Active
      case (Some(ObservationProgress.Idle), Some(EligibilityDecision.NoDecision)) if gatePhase == GatePhase.Authorized =>
        authorization = ObservationAuthorization.Permit
        outcome = GateOutcome.Authorized
      case (Some(ObservationProgress.Idle), Some(EligibilityDecision.Permit)) if gatePhase == GatePhase.Authorized =>
        authorization = ObservationAuthorization.Permit
        outcome = GateOutcome.Authorized
      case _ =>
    }
    api.put_gateOutcome(outcome)
    api.put_observationAuthorization(authorization)
  }

  def finalise(api: AuthorizationGate_Operational_Api): Unit = { }
}
