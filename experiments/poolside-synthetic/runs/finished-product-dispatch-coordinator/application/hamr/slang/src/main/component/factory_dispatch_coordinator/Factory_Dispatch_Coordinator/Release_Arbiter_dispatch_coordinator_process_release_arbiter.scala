// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Release_Arbiter_dispatch_coordinator_process_release_arbiter {

  def initialise(api: Release_Arbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_dispatch_decision(Factory_Dispatch_Coordinator.Dispatch_Decision.example())
    api.put_decision_reason(Factory_Dispatch_Coordinator.Decision_Reason.Idle)
  }

  def timeTriggered(api: Release_Arbiter_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case RESET_COMPLETED
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.TerminalCompleted) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle &
          api.dispatch_decision.request_id == Request_Id.None &
          api.dispatch_decision.product_id == Product_Id.None &
          api.dispatch_decision.amount == Dispatch_Amount.A0 &
          api.decision_reason == Decision_Reason.TerminalReset),
        // case RESET_FAILED
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.TerminalFailed) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle &
          api.dispatch_decision.request_id == Request_Id.None &
          api.dispatch_decision.product_id == Product_Id.None &
          api.dispatch_decision.amount == Dispatch_Amount.A0 &
          api.decision_reason == Decision_Reason.TerminalReset),
        // case PROTECTED_ACTIVE_BUSY
        ((api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveFresh |
          api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveRetry) &
          api.request_fact.assessment != Admission_Assessment.NoRequest) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.Busy &
          api.decision_reason == Decision_Reason.Busy),
        // case ACTIVE_NO_REQUEST_PRESERVED
        ((api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveFresh |
          api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.ActiveRetry) &
          api.request_fact.assessment == Admission_Assessment.NoRequest) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.None &
          api.dispatch_decision.request_id == Request_Id.None &
          api.dispatch_decision.product_id == Product_Id.None &
          api.dispatch_decision.amount == Dispatch_Amount.A0 &
          api.decision_reason == Decision_Reason.Released),
        // case REJECT_MALFORMED
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
          api.request_fact.assessment == Admission_Assessment.Malformed) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.Reject &
          api.dispatch_decision.request_id == Request_Id.None &
          api.dispatch_decision.product_id == Product_Id.None &
          api.dispatch_decision.amount == Dispatch_Amount.A0 &
          api.decision_reason == Decision_Reason.Rejected),
        // case REJECT_REPEATED
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
          api.request_fact.assessment == Admission_Assessment.Repeated) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.Reject &
          api.dispatch_decision.request_id == Request_Id.None &
          api.dispatch_decision.product_id == Product_Id.None &
          api.dispatch_decision.amount == Dispatch_Amount.A0 &
          api.decision_reason == Decision_Reason.Rejected),
        // case WAIT_FOR_INVENTORY
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
          api.selected_intent == Selected_Intent.FreshIntent &
          api.candidate_readiness.fresh_assessment != Fresh_Inventory_Assessment.Sufficient |
          api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
            api.selected_intent == Selected_Intent.RecoveryIntent &
            api.candidate_readiness.recovery_assessment != Recovery_Inventory_Assessment.Sufficient) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.WaitInventory &
          api.decision_reason == Decision_Reason.WaitingInventory),
        // case WAIT_FOR_DOCK
        ((api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
          api.selected_intent == Selected_Intent.FreshIntent &
          api.candidate_readiness.fresh_assessment == Fresh_Inventory_Assessment.Sufficient |
          api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
            api.selected_intent == Selected_Intent.RecoveryIntent &
            api.candidate_readiness.recovery_assessment == Recovery_Inventory_Assessment.Sufficient) &
          api.dock_assessment != Dock_Assessment.Ready) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.WaitDock &
          api.decision_reason == Decision_Reason.WaitingDock),
        // case RELEASE_FRESH
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
          api.selected_intent == Selected_Intent.FreshIntent &
          api.candidate_readiness.fresh_assessment == Fresh_Inventory_Assessment.Sufficient &
          api.dock_assessment == Dock_Assessment.Ready) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseFresh &
          api.dispatch_decision.request_id == api.request_fact.request_id &
          api.dispatch_decision.product_id == api.request_fact.product_id &
          api.dispatch_decision.amount == api.request_fact.amount &
          api.decision_reason == Decision_Reason.Released),
        // case RELEASE_RETRY
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.RecoveryPending &
          api.selected_intent == Selected_Intent.RecoveryIntent &
          api.candidate_readiness.recovery_assessment == Recovery_Inventory_Assessment.Sufficient &
          api.dock_assessment == Dock_Assessment.Ready) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseRetry &
          api.decision_reason == Decision_Reason.Released),
        // case ARBITER_IDLE
        (api.candidate_readiness.lifecycle_capacity == Candidate_Lifecycle.Idle &
          api.selected_intent == Selected_Intent.None &
          api.request_fact.assessment != Admission_Assessment.Malformed &
          api.request_fact.assessment != Admission_Assessment.Repeated) ___>: (api.dispatch_decision.kind == Dispatch_Decision_Kind.None &
          api.dispatch_decision.request_id == Request_Id.None &
          api.dispatch_decision.product_id == Product_Id.None &
          api.dispatch_decision.amount == Dispatch_Amount.A0 &
          api.decision_reason == Decision_Reason.Idle)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_request_fact: Option[Factory_Dispatch_Coordinator.Qualified_Request_Fact] = api.get_request_fact()
    api.logInfo(s"Received on data port request_fact: ${apiUsage_request_fact}")
    val apiUsage_candidate_readiness: Option[Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness] = api.get_candidate_readiness()
    api.logInfo(s"Received on data port candidate_readiness: ${apiUsage_candidate_readiness}")
    val apiUsage_dock_assessment: Option[Factory_Dispatch_Coordinator.Dock_Assessment.Type] = api.get_dock_assessment()
    api.logInfo(s"Received on data port dock_assessment: ${apiUsage_dock_assessment}")
    val apiUsage_selected_intent: Option[Factory_Dispatch_Coordinator.Selected_Intent.Type] = api.get_selected_intent()
    api.logInfo(s"Received on data port selected_intent: ${apiUsage_selected_intent}")
  }

  def finalise(api: Release_Arbiter_Operational_Api): Unit = { }
}
