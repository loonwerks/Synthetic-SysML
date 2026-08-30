// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Outcome_Recovery_Classifier_dispatch_coordinator_process_outcome_recovery_classifier {

  // BEGIN STATE VARS
  var stored_transition_plan: Factory_Dispatch_Coordinator.Outcome_Plan.Type = Factory_Dispatch_Coordinator.Outcome_Plan.Preserve
  // END STATE VARS

  def initialise(api: Outcome_Recovery_Classifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_plan(Factory_Dispatch_Coordinator.Outcome_Plan.Preserve)
    api.put_transition_plan(Factory_Dispatch_Coordinator.Outcome_Plan.Preserve)
    api.put_confirmation_context(Factory_Dispatch_Coordinator.Confirmation_Context.example())
  }

  def timeTriggered(api: Outcome_Recovery_Classifier_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        stored_transition_plan
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CLASSIFIER_PUBLICATIONS_AGREE
        //   publish outcomes
        api.recovery_plan == stored_transition_plan &
          api.confirmation_context.classification == Confirmation_Outcome_Class.Preserve &
          api.confirmation_context.confirmation_request_id == Confirmation_Request_Id.None,
        // case RECOVERY_REMAINS_ELIGIBLE
        (api.execution_context.lifecycle == Dispatch_Lifecycle.RecoveryPending) ___>: (stored_transition_plan == Outcome_Plan.RetryEligible),
        // case MATCHING_COMPLETION
        (T) ___>: (stored_transition_plan == Outcome_Plan.Completed),
        // case MATCHING_FRESH_FAILURE
        (T) ___>: (stored_transition_plan == Outcome_Plan.RetryEligible),
        // case MATCHING_RETRY_FAILURE
        (T) ___>: (stored_transition_plan == Outcome_Plan.Abort),
        // case OUTCOME_PRESERVED
        (T) ___>: (stored_transition_plan == Outcome_Plan.Preserve)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_execution_outcome: Option[Factory_Dispatch_Coordinator.Execution_Outcome] = api.get_execution_outcome()
    api.logInfo(s"Received on data port execution_outcome: ${apiUsage_execution_outcome}")
    val apiUsage_execution_context: Option[Factory_Dispatch_Coordinator.Active_Execution_Context] = api.get_execution_context()
    api.logInfo(s"Received on data port execution_context: ${apiUsage_execution_context}")
  }

  def finalise(api: Outcome_Recovery_Classifier_Operational_Api): Unit = { }
}
