// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CapabilityAcquisition_coordinator_process_capability_acquisition {

  def initialise(api: CapabilityAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supplier_available(Base_Types.Boolean_example())
    api.put_production_available(Base_Types.Boolean_example())
    api.put_dispatch_available(Base_Types.Boolean_example())
  }

  def timeTriggered(api: CapabilityAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_capability_snapshot: Option[Factory_Dispatch_Coordinator.CapabilitySnapshot] = api.get_capability_snapshot()
    api.logInfo(s"Received on data port capability_snapshot: ${apiUsage_capability_snapshot}")
  }

  def finalise(api: CapabilityAcquisition_Operational_Api): Unit = { }
}
