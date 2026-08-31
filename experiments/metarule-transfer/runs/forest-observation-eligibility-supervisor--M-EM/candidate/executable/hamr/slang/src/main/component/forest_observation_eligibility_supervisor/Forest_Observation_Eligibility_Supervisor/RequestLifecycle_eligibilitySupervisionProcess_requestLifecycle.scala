// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle {

  def initialise(api: RequestLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_energyTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_supportTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_requestContext(Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext)
    api.put_eligibilityStatus(Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle)
  }

  def timeTriggered(api: RequestLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestInput: Option[Forest_Observation_Eligibility_Supervisor.RequestInput] = api.get_requestInput()
    api.logInfo(s"Received on data port requestInput: ${apiUsage_requestInput}")
    val apiUsage_gateOutcome: Option[Forest_Observation_Eligibility_Supervisor.GateOutcome.Type] = api.get_gateOutcome()
    api.logInfo(s"Received on data port gateOutcome: ${apiUsage_gateOutcome}")
  }

  def finalise(api: RequestLifecycle_Operational_Api): Unit = { }
}
