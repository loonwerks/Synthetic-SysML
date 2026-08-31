// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner {
  var requestMemory: RequestPhase.Type = RequestPhase.Idle

  def initialise(api: RequestLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, requestMemory))
    requestMemory = RequestPhase.Idle
    api.put_candidate_event(OperatorEvent.None)
    api.put_request_phase(RequestPhase.Idle)
  }

  def timeTriggered(api: RequestLifecycleOwner_Operational_Api): Unit = {
    Contract(Modifies(api, requestMemory))
    val event: OperatorEvent.Type = api.get_operator_event() match {
      case Some(value) => value
      case _ => OperatorEvent.None
    }
    val directive: PriorityDirective.Type = api.get_accepted_directive() match {
      case Some(value) => value
      case _ => PriorityDirective.Inhibit
    }
    val feedback: ReleaseFeedback.Type = api.get_release_feedback() match {
      case Some(value) => value
      case _ => ReleaseFeedback.NotReleased
    }
    val previous: RequestPhase.Type = requestMemory
    api.put_candidate_event(event)
    api.put_request_phase(previous)
    requestMemory =
      if (directive == PriorityDirective.Cancel) RequestPhase.Idle
      else if (directive == PriorityDirective.Submit && previous == RequestPhase.Idle) RequestPhase.Pending
      else if (previous == RequestPhase.Pending && feedback == ReleaseFeedback.Released) RequestPhase.Released
      else if (previous == RequestPhase.Released && directive == PriorityDirective.Hold) RequestPhase.Idle
      else previous
  }

  def finalise(api: RequestLifecycleOwner_Operational_Api): Unit = { }
}
