// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner {
  var requestMemory: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type =
    Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle

  def initialise(api: RequestLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, requestMemory))
    requestMemory = Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle
    api.put_candidate_event(Observation_Sortie_Eligibility_Supervisor.OperatorEvent.None)
    api.put_request_phase(Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle)
  }

  def timeTriggered(api: RequestLifecycleOwner_Operational_Api): Unit = {
    Contract(Modifies(api, requestMemory))
    val event: Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type = api.get_operator_event().get
    val directive: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type = api.get_accepted_directive().get
    val feedback: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type = api.get_release_feedback().get
    val previous: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = requestMemory
    api.put_candidate_event(event)
    api.put_request_phase(previous)
    if (directive == Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Cancel) {
      requestMemory = Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle
    } else if (directive == Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Submit &&
               previous == Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle) {
      requestMemory = Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending
    } else if (previous == Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending &&
               feedback == Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Released) {
      requestMemory = Observation_Sortie_Eligibility_Supervisor.RequestPhase.Released
    } else if (previous == Observation_Sortie_Eligibility_Supervisor.RequestPhase.Released &&
               directive == Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Hold) {
      requestMemory = Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle
    } else {
      requestMemory = previous
    }
  }

  def finalise(api: RequestLifecycleOwner_Operational_Api): Unit = { }
}
