// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object StatusDerivation_coordinator_process_status_derivation {

  def initialise(api: StatusDerivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_status_record(Factory_Dispatch_Coordinator.DispatchStatusRecord.example())
  }

  def timeTriggered(api: StatusDerivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_selected_action: Option[Factory_Dispatch_Coordinator.DispatchAction.Type] = api.get_selected_action()
    api.logInfo(s"Received on data port selected_action: ${apiUsage_selected_action}")
    val apiUsage_order_state: Option[Factory_Dispatch_Coordinator.OrderState.Type] = api.get_order_state()
    api.logInfo(s"Received on data port order_state: ${apiUsage_order_state}")
    val apiUsage_recovery_state: Option[Factory_Dispatch_Coordinator.RecoveryState.Type] = api.get_recovery_state()
    api.logInfo(s"Received on data port recovery_state: ${apiUsage_recovery_state}")
  }

  def finalise(api: StatusDerivation_Operational_Api): Unit = { }
}
