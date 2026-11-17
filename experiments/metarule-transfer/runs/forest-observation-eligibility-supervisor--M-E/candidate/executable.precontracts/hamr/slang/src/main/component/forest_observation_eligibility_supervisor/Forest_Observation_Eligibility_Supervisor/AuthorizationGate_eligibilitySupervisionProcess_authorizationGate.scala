// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AuthorizationGate_eligibilitySupervisionProcess_authorizationGate {

  def initialise(api: AuthorizationGate_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_gateOutcome(Forest_Observation_Eligibility_Supervisor.GateOutcome.None)
    api.put_observationAuthorization(Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold)
  }

  def timeTriggered(api: AuthorizationGate_Operational_Api): Unit = {
    // example api usage

    val apiUsage_observationProgress: Option[Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type] = api.get_observationProgress()
    api.logInfo(s"Received on data port observationProgress: ${apiUsage_observationProgress}")
    val apiUsage_eligibilityDecision: Option[Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type] = api.get_eligibilityDecision()
    api.logInfo(s"Received on data port eligibilityDecision: ${apiUsage_eligibilityDecision}")
  }

  def finalise(api: AuthorizationGate_Operational_Api): Unit = { }
}
