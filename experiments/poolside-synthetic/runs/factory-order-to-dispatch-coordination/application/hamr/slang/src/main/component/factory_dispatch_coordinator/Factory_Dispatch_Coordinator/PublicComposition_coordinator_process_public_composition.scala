// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object PublicComposition_coordinator_process_public_composition {

  def initialise(api: PublicComposition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_public_result(Factory_Dispatch_Coordinator.DispatchPublicResult.example())
  }

  def timeTriggered(api: PublicComposition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_facts: Option[Factory_Dispatch_Coordinator.RequestFacts] = api.get_request_facts()
    api.logInfo(s"Received on data port request_facts: ${apiUsage_request_facts}")
    val apiUsage_selected_action: Option[Factory_Dispatch_Coordinator.DispatchAction.Type] = api.get_selected_action()
    api.logInfo(s"Received on data port selected_action: ${apiUsage_selected_action}")
    val apiUsage_status_record: Option[Factory_Dispatch_Coordinator.DispatchStatusRecord] = api.get_status_record()
    api.logInfo(s"Received on data port status_record: ${apiUsage_status_record}")
  }

  def finalise(api: PublicComposition_Operational_Api): Unit = { }
}
