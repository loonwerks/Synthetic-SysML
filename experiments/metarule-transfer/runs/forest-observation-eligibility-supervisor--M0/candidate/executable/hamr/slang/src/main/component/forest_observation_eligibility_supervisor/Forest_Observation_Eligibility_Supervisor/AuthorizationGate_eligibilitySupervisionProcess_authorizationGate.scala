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
      Modifies(api, gatePhase)
    )
    gatePhase = closed
    api.put_gateOutcome(Forest_Observation_Eligibility_Supervisor.GateOutcome.None)
    api.put_observationAuthorization(Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold)
  }

  def timeTriggered(api: AuthorizationGate_Operational_Api): Unit = {
    Contract(
      Modifies(api, gatePhase)
    )
    val progress = api.get_observationProgress()
    val decision = api.get_eligibilityDecision()
    val result: (Z, Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type,
      Forest_Observation_Eligibility_Supervisor.GateOutcome.Type) =
      if (gatePhase == failureHold) {
        if (progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Idle)) {
          (closed,
            Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
            Forest_Observation_Eligibility_Supervisor.GateOutcome.Recovered)
        } else {
          (failureHold,
            Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
            Forest_Observation_Eligibility_Supervisor.GateOutcome.None)
        }
      } else if (progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Failed) ||
        (gatePhase == closed && progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Active)) ||
        (gatePhase == active && progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Idle))) {
        (failureHold,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.Failed)
      } else if (decision == Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Withdraw)) {
        (closed,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.Cancelled)
      } else if ((gatePhase == authorized || gatePhase == active) &&
        progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Completed)) {
        (closed,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.Completed)
      } else if (decision == Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenyPower)) {
        (closed,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedPower)
      } else if (decision == Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenySupport)) {
        (closed,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedSupport)
      } else if (gatePhase == closed &&
        progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Idle) &&
        decision == Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Permit)) {
        (authorized,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Permit,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.Authorized)
      } else if ((gatePhase == authorized || gatePhase == active) &&
        progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Active) &&
        decision != Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Withdraw) &&
        decision != Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenyPower) &&
        decision != Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenySupport)) {
        (active,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Permit,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.Active)
      } else if (gatePhase == authorized &&
        progress == Some(Forest_Observation_Eligibility_Supervisor.ObservationProgress.Idle) &&
        (decision == Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision) ||
          decision == Some(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Permit))) {
        (authorized,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Permit,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.Authorized)
      } else {
        (closed,
          Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold,
          Forest_Observation_Eligibility_Supervisor.GateOutcome.None)
      }
    gatePhase = result._1
    api.put_observationAuthorization(result._2)
    api.put_gateOutcome(result._3)
  }

  def finalise(api: AuthorizationGate_Operational_Api): Unit = { }
}
