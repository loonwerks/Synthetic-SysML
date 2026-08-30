// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier {

  def initialise(api: Outcome_Recovery_Classifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_recovery_plan(Factory_Dispatch_Coordinator.Outcome_Plan.Preserve)
    api.put_transition_plan(Factory_Dispatch_Coordinator.Outcome_Plan.Preserve)
    api.put_confirmation_context(Factory_Dispatch_Coordinator.Confirmation_Context.example())
  }

  def timeTriggered(api: Outcome_Recovery_Classifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_recovery_plan(Factory_Dispatch_Coordinator.Outcome_Plan.Preserve)
    api.put_transition_plan(Factory_Dispatch_Coordinator.Outcome_Plan.Preserve)
    api.put_confirmation_context(Factory_Dispatch_Coordinator.Confirmation_Context.example())
  }

  def finalise(api: Outcome_Recovery_Classifier_Operational_Api): Unit = { }
}
