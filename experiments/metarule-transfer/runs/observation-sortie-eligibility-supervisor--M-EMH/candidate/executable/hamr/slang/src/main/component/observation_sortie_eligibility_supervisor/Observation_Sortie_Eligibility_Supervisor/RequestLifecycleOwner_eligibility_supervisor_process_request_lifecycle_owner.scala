// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner {

  def initialise(api: RequestLifecycleOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_candidate_event(Observation_Sortie_Eligibility_Supervisor.OperatorEvent.None)
    api.put_request_phase(Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle)
  }

  def timeTriggered(api: RequestLifecycleOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_operator_event: Option[Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type] = api.get_operator_event()
    api.logInfo(s"Received on data port operator_event: ${apiUsage_operator_event}")
    val apiUsage_accepted_directive: Option[Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type] = api.get_accepted_directive()
    api.logInfo(s"Received on data port accepted_directive: ${apiUsage_accepted_directive}")
    val apiUsage_release_feedback: Option[Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type] = api.get_release_feedback()
    api.logInfo(s"Received on data port release_feedback: ${apiUsage_release_feedback}")
  }

  def finalise(api: RequestLifecycleOwner_Operational_Api): Unit = { }
}
