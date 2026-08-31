// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter {

  def initialise(api: EligibilityArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibilityDecision(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision)
  }

  def timeTriggered(api: EligibilityArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestContext: Option[Forest_Observation_Eligibility_Supervisor.RequestContext.Type] = api.get_requestContext()
    api.logInfo(s"Received on data port requestContext: ${apiUsage_requestContext}")
    val apiUsage_energyVerdictIn: Option[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict] = api.get_energyVerdictIn()
    api.logInfo(s"Received on data port energyVerdictIn: ${apiUsage_energyVerdictIn}")
    val apiUsage_supportVerdictIn: Option[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict] = api.get_supportVerdictIn()
    api.logInfo(s"Received on data port supportVerdictIn: ${apiUsage_supportVerdictIn}")
  }

  def finalise(api: EligibilityArbiter_Operational_Api): Unit = { }
}
