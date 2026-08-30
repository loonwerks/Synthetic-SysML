// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver {

  def initialise(api: Dispatch_Priority_Resolver_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selected_intent(Factory_Dispatch_Coordinator.Selected_Intent.None)
  }

  def timeTriggered(api: Dispatch_Priority_Resolver_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case RECOVERY_OUTRANKS_FRESH
        (api.recovery_plan == Outcome_Plan.RetryEligible) ___>: (api.selected_intent == Selected_Intent.RecoveryIntent),
        // case FRESH_SELECTED
        (api.recovery_plan != Outcome_Plan.RetryEligible &
          api.admission == Admission_Assessment.AdmissibleFresh) ___>: (api.selected_intent == Selected_Intent.FreshIntent),
        // case NO_INTENT_SELECTED
        (api.recovery_plan != Outcome_Plan.RetryEligible &
          api.admission != Admission_Assessment.AdmissibleFresh) ___>: (api.selected_intent == Selected_Intent.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_admission: Option[Factory_Dispatch_Coordinator.Admission_Assessment.Type] = api.get_admission()
    api.logInfo(s"Received on data port admission: ${apiUsage_admission}")
    val apiUsage_recovery_plan: Option[Factory_Dispatch_Coordinator.Outcome_Plan.Type] = api.get_recovery_plan()
    api.logInfo(s"Received on data port recovery_plan: ${apiUsage_recovery_plan}")

    val recoveryPlan = api.get_recovery_plan().get
    val admission = api.get_admission().get

    if (recoveryPlan == Outcome_Plan.RetryEligible) {
      api.put_selected_intent(Selected_Intent.RecoveryIntent)
    } else if (admission == Admission_Assessment.AdmissibleFresh) {
      api.put_selected_intent(Selected_Intent.FreshIntent)
    } else {
      api.put_selected_intent(Selected_Intent.None)
    }
  }

  def finalise(api: Dispatch_Priority_Resolver_Operational_Api): Unit = { }
}
