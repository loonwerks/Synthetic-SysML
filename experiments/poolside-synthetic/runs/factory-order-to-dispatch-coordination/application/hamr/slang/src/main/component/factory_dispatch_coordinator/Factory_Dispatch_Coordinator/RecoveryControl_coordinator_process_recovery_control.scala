// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryControl_coordinator_process_recovery_control {

  def initialise(api: RecoveryControl_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recovery_gate(Factory_Dispatch_Coordinator.RecoveryGate.OPEN)
    api.put_emergency_state(Factory_Dispatch_Coordinator.EmergencyState.INACTIVE)
    api.put_recovery_state(Factory_Dispatch_Coordinator.RecoveryState.HEALTHY)
  }

  def timeTriggered(api: RecoveryControl_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualified_outcome: Option[Factory_Dispatch_Coordinator.QualifiedOutcome.Type] = api.get_qualified_outcome()
    api.logInfo(s"Received on data port qualified_outcome: ${apiUsage_qualified_outcome}")
    val apiUsage_recovery_event: Option[Factory_Dispatch_Coordinator.RecoveryEvent.Type] = api.get_recovery_event()
    api.logInfo(s"Received on data port recovery_event: ${apiUsage_recovery_event}")
  }

  def finalise(api: RecoveryControl_Operational_Api): Unit = { }
}
