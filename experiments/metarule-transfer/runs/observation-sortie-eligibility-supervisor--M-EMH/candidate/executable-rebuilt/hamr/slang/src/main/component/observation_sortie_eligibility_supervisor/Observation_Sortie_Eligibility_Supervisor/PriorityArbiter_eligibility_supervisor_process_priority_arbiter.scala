// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_eligibility_supervisor_process_priority_arbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(PriorityDirective.Inhibit)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PRIORITY_ACTIVE_FAULT
        (api.fault_summary.faultState == FaultState.Active) ___>: (api.accepted_directive == PriorityDirective.Inhibit),
        // case PRIORITY_CANCEL
        (api.fault_summary.faultState == FaultState.Clear &
          api.candidate_event == OperatorEvent.Cancel) ___>: (api.accepted_directive == PriorityDirective.Cancel),
        // case PRIORITY_RECOVER
        (api.fault_summary.faultState == FaultState.Clear &
          api.candidate_event == OperatorEvent.AcknowledgeRecovery) ___>: (api.accepted_directive == PriorityDirective.Recover),
        // case PRIORITY_SUBMIT
        (api.fault_summary.faultState == FaultState.Clear &
          api.candidate_event == OperatorEvent.Submit) ___>: (api.accepted_directive == PriorityDirective.Submit),
        // case PRIORITY_HOLD
        (api.fault_summary.faultState == FaultState.Clear &
          api.candidate_event == OperatorEvent.None) ___>: (api.accepted_directive == PriorityDirective.Hold)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val candidate = api.get_candidate_event().get
    val fault = api.get_fault_summary().get
    val directive: PriorityDirective.Type =
      if (fault.faultState == FaultState.Active) PriorityDirective.Inhibit
      else if (candidate == OperatorEvent.Cancel) PriorityDirective.Cancel
      else if (candidate == OperatorEvent.AcknowledgeRecovery) PriorityDirective.Recover
      else if (candidate == OperatorEvent.Submit) PriorityDirective.Submit
      else PriorityDirective.Hold
    api.put_accepted_directive(directive)
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
