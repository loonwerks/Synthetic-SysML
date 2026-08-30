// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Status_Determiner_dispatch_coordinator_process_status_determiner {

  def initialise(api: Status_Determiner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_dispatch_status(Factory_Dispatch_Coordinator.Dispatch_Status.Idle)
  }

  def timeTriggered(api: Status_Determiner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case STATUS_COMPLETED
        (api.lifecycle_snapshot == Dispatch_Lifecycle.TerminalCompleted) ___>: (api.dispatch_status == Dispatch_Status.Completed),
        // case STATUS_FAILED
        (api.lifecycle_snapshot == Dispatch_Lifecycle.TerminalFailed) ___>: (api.dispatch_status == Dispatch_Status.Failed),
        // case STATUS_RECOVERING
        (api.lifecycle_snapshot == Dispatch_Lifecycle.RecoveryPending) ___>: (api.dispatch_status == Dispatch_Status.Recovering),
        // case STATUS_BUSY
        ((api.lifecycle_snapshot == Dispatch_Lifecycle.ActiveFresh |
          api.lifecycle_snapshot == Dispatch_Lifecycle.ActiveRetry) &
          api.decision_reason == Decision_Reason.Busy) ___>: (api.dispatch_status == Dispatch_Status.Busy),
        // case STATUS_RELEASED
        ((api.lifecycle_snapshot == Dispatch_Lifecycle.ActiveFresh |
          api.lifecycle_snapshot == Dispatch_Lifecycle.ActiveRetry) &
          api.decision_reason != Decision_Reason.Busy) ___>: (api.dispatch_status == Dispatch_Status.Released),
        // case STATUS_TERMINAL_RESET
        (api.lifecycle_snapshot == Dispatch_Lifecycle.Idle &
          api.decision_reason == Decision_Reason.TerminalReset) ___>: (api.dispatch_status == Dispatch_Status.Idle),
        // case STATUS_WAIT_INVENTORY
        (api.lifecycle_snapshot == Dispatch_Lifecycle.Idle &
          api.decision_reason == Decision_Reason.WaitingInventory) ___>: (api.dispatch_status == Dispatch_Status.WaitingInventory),
        // case STATUS_WAIT_DOCK
        (api.lifecycle_snapshot == Dispatch_Lifecycle.Idle &
          api.decision_reason == Decision_Reason.WaitingDock) ___>: (api.dispatch_status == Dispatch_Status.WaitingDock),
        // case STATUS_REJECTED
        (api.lifecycle_snapshot == Dispatch_Lifecycle.Idle &
          api.decision_reason == Decision_Reason.Rejected) ___>: (api.dispatch_status == Dispatch_Status.Rejected),
        // case STATUS_IDLE
        (api.lifecycle_snapshot == Dispatch_Lifecycle.Idle &
          api.decision_reason != Decision_Reason.WaitingInventory &
          api.decision_reason != Decision_Reason.WaitingDock &
          api.decision_reason != Decision_Reason.Rejected &
          api.decision_reason != Decision_Reason.TerminalReset) ___>: (api.dispatch_status == Dispatch_Status.Idle)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_decision_reason: Option[Factory_Dispatch_Coordinator.Decision_Reason.Type] = api.get_decision_reason()
    api.logInfo(s"Received on data port decision_reason: ${apiUsage_decision_reason}")
    val apiUsage_lifecycle_snapshot: Option[Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type] = api.get_lifecycle_snapshot()
    api.logInfo(s"Received on data port lifecycle_snapshot: ${apiUsage_lifecycle_snapshot}")

    val lifecycleSnapshot = api.get_lifecycle_snapshot().get
    val decisionReason = api.get_decision_reason().get

    val status: Factory_Dispatch_Coordinator.Dispatch_Status.Type =
      if (lifecycleSnapshot == Dispatch_Lifecycle.TerminalCompleted) {
        Dispatch_Status.Completed
      } else if (lifecycleSnapshot == Dispatch_Lifecycle.TerminalFailed) {
        Dispatch_Status.Failed
      } else if (lifecycleSnapshot == Dispatch_Lifecycle.RecoveryPending) {
        Dispatch_Status.Recovering
      } else if ((lifecycleSnapshot == Dispatch_Lifecycle.ActiveFresh |
                   lifecycleSnapshot == Dispatch_Lifecycle.ActiveRetry) &
                  decisionReason == Decision_Reason.Busy) {
        Dispatch_Status.Busy
      } else if ((lifecycleSnapshot == Dispatch_Lifecycle.ActiveFresh |
                  lifecycleSnapshot == Dispatch_Lifecycle.ActiveRetry) &
                 decisionReason != Decision_Reason.Busy) {
        Dispatch_Status.Released
      } else if (lifecycleSnapshot == Dispatch_Lifecycle.Idle &
                 decisionReason == Decision_Reason.TerminalReset) {
        Dispatch_Status.Idle
      } else if (lifecycleSnapshot == Dispatch_Lifecycle.Idle &
                 decisionReason == Decision_Reason.WaitingInventory) {
        Dispatch_Status.WaitingInventory
      } else if (lifecycleSnapshot == Dispatch_Lifecycle.Idle &
                 decisionReason == Decision_Reason.WaitingDock) {
        Dispatch_Status.WaitingDock
      } else if (lifecycleSnapshot == Dispatch_Lifecycle.Idle &
                 decisionReason == Decision_Reason.Rejected) {
        Dispatch_Status.Rejected
      } else {
        Dispatch_Status.Idle
      }
    api.put_dispatch_status(status)
  }

  def finalise(api: Status_Determiner_Operational_Api): Unit = { }
}
