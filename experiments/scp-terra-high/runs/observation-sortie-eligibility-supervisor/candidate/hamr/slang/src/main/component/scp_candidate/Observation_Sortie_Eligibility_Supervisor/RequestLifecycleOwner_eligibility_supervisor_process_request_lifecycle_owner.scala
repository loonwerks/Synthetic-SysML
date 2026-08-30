// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner {
  var requestMemory: RequestPhase.Type = RequestPhase.Idle

  def initialise(api: RequestLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_candidate_event(Observation_Sortie_Eligibility_Supervisor.OperatorEvent.None)
    api.put_request_phase(Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle)
  }

  def timeTriggered(api: RequestLifecycleOwner_Operational_Api): Unit = {
    Contract(Modifies(api, requestMemory))
    api.get_operator_event() match {
      case Some(event) =>
        api.put_candidate_event(event)
        api.put_request_phase(requestMemory)
    }
  }

  def finalise(api: RequestLifecycleOwner_Operational_Api): Unit = { }
}
