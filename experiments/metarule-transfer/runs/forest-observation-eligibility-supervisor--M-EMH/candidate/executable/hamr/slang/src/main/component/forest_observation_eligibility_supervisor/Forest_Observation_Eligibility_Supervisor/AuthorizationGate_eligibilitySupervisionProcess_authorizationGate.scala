// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationGate_eligibilitySupervisionProcess_authorizationGate {

  val closed: Z = 0
  val authorized: Z = 1
  val active: Z = 2
  val failureHold: Z = 3
  var gatePhase: Z = closed

  def initialise(api: AuthorizationGate_Initialization_Api): Unit = {
    Contract(
      Modifies(gatePhase, api)
    )
    gatePhase = closed
    api.put_gateOutcome(Forest_Observation_Eligibility_Supervisor.GateOutcome.None)
    api.put_observationAuthorization(Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold)
  }

  def timeTriggered(api: AuthorizationGate_Operational_Api): Unit = {
    Contract(
      Modifies(gatePhase, api)
    )
    val progress: Z = progressCode(api)
    val decision: Z = decisionCode(api)

    var nextPhase: Z = closed
    var authorization = Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold
    var outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.None

    if (gatePhase == failureHold) {
      if (progress == 0) {
        outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.Recovered
      } else {
        nextPhase = failureHold
      }
    } else if (progress == 3 ||
               (gatePhase == closed &&
                progress == 1) ||
               (gatePhase == active &&
                progress == 0)) {
      nextPhase = failureHold
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.Failed
    } else if (decision == 4) {
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.Cancelled
    } else if ((gatePhase == authorized || gatePhase == active) &&
               progress == 2) {
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.Completed
    } else if (decision == 2) {
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedPower
    } else if (decision == 3) {
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedSupport
    } else if (gatePhase == closed &&
               progress == 0 && decision == 1) {
      nextPhase = authorized
      authorization = Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Permit
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.Authorized
    } else if ((gatePhase == authorized || gatePhase == active) &&
               progress == 1 && decision != 2 && decision != 3) {
      nextPhase = active
      authorization = Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Permit
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.Active
    } else if (gatePhase == authorized &&
               progress == 0 && (decision == 0 || decision == 1)) {
      nextPhase = authorized
      authorization = Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Permit
      outcome = Forest_Observation_Eligibility_Supervisor.GateOutcome.Authorized
    }

    gatePhase = nextPhase
    api.put_observationAuthorization(authorization)
    api.put_gateOutcome(outcome)
  }

  def finalise(api: AuthorizationGate_Operational_Api): Unit = { }

  @helper def progressCode(api: AuthorizationGate_Operational_Api): Z = {
    api.get_observationProgress().getOrElse(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Idle) match {
      case Forest_Observation_Eligibility_Supervisor.ObservationProgress.Idle => return 0
      case Forest_Observation_Eligibility_Supervisor.ObservationProgress.Active => return 1
      case Forest_Observation_Eligibility_Supervisor.ObservationProgress.Completed => return 2
      case _ => return 3
    }
  }

  @helper def decisionCode(api: AuthorizationGate_Operational_Api): Z = {
    api.get_eligibilityDecision().getOrElse(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision) match {
      case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision => return 0
      case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Permit => return 1
      case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenyPower => return 2
      case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenySupport => return 3
      case _ => return 4
    }
  }
}
