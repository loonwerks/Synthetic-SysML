// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object OrderLifecycle_coordinator_process_order_lifecycle {

  def initialise(api: OrderLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_prior_order_state(Factory_Dispatch_Coordinator.OrderState.IDLE)
    api.put_order_state(Factory_Dispatch_Coordinator.OrderState.IDLE)
  }

  def timeTriggered(api: OrderLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualified_outcome: Option[Factory_Dispatch_Coordinator.QualifiedOutcome.Type] = api.get_qualified_outcome()
    api.logInfo(s"Received on data port qualified_outcome: ${apiUsage_qualified_outcome}")
    val apiUsage_recovery_gate: Option[Factory_Dispatch_Coordinator.RecoveryGate.Type] = api.get_recovery_gate()
    api.logInfo(s"Received on data port recovery_gate: ${apiUsage_recovery_gate}")
  }

  def finalise(api: OrderLifecycle_Operational_Api): Unit = { }
}
