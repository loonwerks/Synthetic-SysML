// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StatusDerivation_coordinator_process_status_derivation {

  def initialise(api: StatusDerivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_STATUS_MODE
        api.status_record.mode == Mode.HOLDING,
        // guarantee INITIAL_STATUS_CAUSE
        api.status_record.selected_cause == SelectedCause.NO_ELIGIBLE_WORK,
        // guarantee INITIAL_STATUS_ORDER
        api.status_record.order_phase == OrderStatusValue.IDLE,
        // guarantee INITIAL_STATUS_RECOVERY
        api.status_record.recovery_phase == RecoveryStatusValue.HEALTHY
        // END INITIALIZES ENSURES
      )
    )
    api.put_status_record(Factory_Dispatch_Coordinator.DispatchStatusRecord(
      OrderStatusValue.IDLE, RecoveryStatusValue.HEALTHY, Mode.HOLDING,
      SelectedCause.NO_ELIGIBLE_WORK))
  }

  def timeTriggered(api: StatusDerivation_Operational_Api): Unit = {
    Contract(Modifies(api))
    val action: DispatchAction.Type = api.get_selected_action().get
    val order: OrderState.Type = api.get_order_state().get
    val recovery: RecoveryState.Type = api.get_recovery_state().get
    val orderPhase: OrderStatusValue.Type =
      if (order == OrderState.IDLE) { OrderStatusValue.IDLE } else { OrderStatusValue.OPEN }
    val recoveryPhase: RecoveryStatusValue.Type =
      if (recovery == RecoveryState.HEALTHY) { RecoveryStatusValue.HEALTHY }
      else if (recovery == RecoveryState.LATCHED) { RecoveryStatusValue.LATCHED }
      else { RecoveryStatusValue.RECOVERING }
    val status: Factory_Dispatch_Coordinator.DispatchStatusRecord =
      if (recovery != RecoveryState.HEALTHY) {
        Factory_Dispatch_Coordinator.DispatchStatusRecord(orderPhase, recoveryPhase,
          Mode.FAULT, SelectedCause.FAULT_OR_RECOVERY)
      } else if (action == DispatchAction.ISSUE_QUOTE) {
        Factory_Dispatch_Coordinator.DispatchStatusRecord(orderPhase, recoveryPhase,
          Mode.QUOTING, SelectedCause.QUOTE_AVAILABLE)
      } else if (action == DispatchAction.ORDER_MATERIAL) {
        Factory_Dispatch_Coordinator.DispatchStatusRecord(orderPhase, recoveryPhase,
          Mode.PROCURING, SelectedCause.PROCUREMENT_PRIORITY)
      } else if (action == DispatchAction.RELEASE_PRODUCTION) {
        Factory_Dispatch_Coordinator.DispatchStatusRecord(orderPhase, recoveryPhase,
          Mode.PRODUCING, SelectedCause.PRODUCTION_PRIORITY)
      } else if (action == DispatchAction.RELEASE_DISPATCH) {
        Factory_Dispatch_Coordinator.DispatchStatusRecord(orderPhase, recoveryPhase,
          Mode.DISPATCHING, SelectedCause.DISPATCH_PRIORITY)
      } else {
        Factory_Dispatch_Coordinator.DispatchStatusRecord(orderPhase, recoveryPhase,
          Mode.HOLDING, SelectedCause.NO_ELIGIBLE_WORK)
      }
    api.put_status_record(status)
  }

  def finalise(api: StatusDerivation_Operational_Api): Unit = { }
}
