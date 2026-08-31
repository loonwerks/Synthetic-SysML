// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner {

  // BEGIN STATE VARS
  var requestMemory: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle
  // END STATE VARS

  def initialise(api: RequestLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, requestMemory))
    requestMemory = RequestPhase.Idle
    api.put_candidate_event(OperatorEvent.None)
    api.put_request_phase(RequestPhase.Idle)
  }

  def timeTriggered(api: RequestLifecycleOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CANDIDATE_EVENT_PUBLISHED
        api.candidate_event == api.operator_event,
        // case REQUEST_CANCEL
        (api.accepted_directive == PriorityDirective.Cancel) ___>: (requestMemory == RequestPhase.Idle),
        // case REQUEST_FRESH_SUBMIT
        (api.accepted_directive == PriorityDirective.Submit &
          In(requestMemory) == RequestPhase.Idle) ___>: (requestMemory == RequestPhase.Pending),
        // case REQUEST_RELEASE_FEEDBACK
        (api.accepted_directive != PriorityDirective.Cancel &
          In(requestMemory) == RequestPhase.Pending &
          api.release_feedback == ReleaseFeedback.Released) ___>: (requestMemory == RequestPhase.Released),
        // case REQUEST_REARM
        (In(requestMemory) == RequestPhase.Released &
          api.accepted_directive == PriorityDirective.Hold) ___>: (requestMemory == RequestPhase.Idle)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val event = api.get_operator_event().get
    val directive = api.get_accepted_directive().get
    val feedback = api.get_release_feedback().get
    api.put_candidate_event(event)
    api.put_request_phase(requestMemory)
    if (directive == PriorityDirective.Cancel) {
      requestMemory = RequestPhase.Idle
    } else if (directive == PriorityDirective.Submit & requestMemory == RequestPhase.Idle) {
      requestMemory = RequestPhase.Pending
    } else if (directive != PriorityDirective.Cancel & requestMemory == RequestPhase.Pending &
             feedback == ReleaseFeedback.Released) {
      requestMemory = RequestPhase.Released
    } else if (requestMemory == RequestPhase.Released & directive == PriorityDirective.Hold) {
      requestMemory = RequestPhase.Idle
    }
  }

  def finalise(api: RequestLifecycleOwner_Operational_Api): Unit = { }
}
