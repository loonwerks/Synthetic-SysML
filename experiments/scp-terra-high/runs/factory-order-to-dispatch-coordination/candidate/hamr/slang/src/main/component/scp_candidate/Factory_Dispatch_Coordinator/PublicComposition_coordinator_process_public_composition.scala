// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PublicComposition_coordinator_process_public_composition {

  def initialise(api: PublicComposition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_PUBLIC_ACTION
        api.public_result.published_action == PublishedAction.HOLD,
        // guarantee INITIAL_PUBLIC_CAUSE
        api.public_result.selected_cause == SelectedCause.NO_ELIGIBLE_WORK,
        // guarantee INITIAL_PUBLIC_MODE
        api.public_result.mode == Mode.HOLDING,
        // guarantee INITIAL_PUBLIC_ORDER
        api.public_result.published_order == PublishedOrderState.IDLE,
        // guarantee INITIAL_PUBLIC_RECOVERY
        api.public_result.published_recovery == PublishedRecoveryState.HEALTHY,
        // guarantee INITIAL_PUBLIC_DISPOSITION
        api.public_result.request_disposition == RequestDisposition.NO_REQUEST
        // END INITIALIZES ENSURES
      )
    )
    api.put_public_result(Factory_Dispatch_Coordinator.DispatchPublicResult(
      SelectedCause.NO_ELIGIBLE_WORK, Mode.HOLDING, PublishedOrderState.IDLE,
      PublishedRecoveryState.HEALTHY, RequestDisposition.NO_REQUEST, PublishedAction.HOLD))
  }

  def timeTriggered(api: PublicComposition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val facts: Factory_Dispatch_Coordinator.RequestFacts = api.get_request_facts().get
    val action: DispatchAction.Type = api.get_selected_action().get
    val status: Factory_Dispatch_Coordinator.DispatchStatusRecord = api.get_status_record().get
    val publicAction: PublishedAction.Type = action match {
      case DispatchAction.HOLD => PublishedAction.HOLD
      case DispatchAction.ISSUE_QUOTE => PublishedAction.ISSUE_QUOTE
      case DispatchAction.ORDER_MATERIAL => PublishedAction.ORDER_MATERIAL
      case DispatchAction.RELEASE_PRODUCTION => PublishedAction.RELEASE_PRODUCTION
      case DispatchAction.RELEASE_DISPATCH => PublishedAction.RELEASE_DISPATCH
    }
    val publicOrder: PublishedOrderState.Type =
      if (status.order_phase == OrderStatusValue.IDLE) { PublishedOrderState.IDLE }
      else { PublishedOrderState.OPEN }
    val publicRecovery: PublishedRecoveryState.Type =
      if (status.recovery_phase == RecoveryStatusValue.HEALTHY) { PublishedRecoveryState.HEALTHY }
      else if (status.recovery_phase == RecoveryStatusValue.LATCHED) { PublishedRecoveryState.LATCHED }
      else { PublishedRecoveryState.RECOVERING }
    val disposition: RequestDisposition.Type =
      if (facts.fresh_request == FreshRequest.NONE) { RequestDisposition.NO_REQUEST }
      else if (facts.fresh_request == FreshRequest.INVALID) { RequestDisposition.REJECTED }
      else if (facts.request_valid && action == DispatchAction.ISSUE_QUOTE) { RequestDisposition.QUOTED }
      else { RequestDisposition.DEFERRED }
    api.put_public_result(Factory_Dispatch_Coordinator.DispatchPublicResult(
      status.selected_cause, status.mode, publicOrder, publicRecovery, disposition, publicAction))
  }

  def finalise(api: PublicComposition_Operational_Api): Unit = { }
}
