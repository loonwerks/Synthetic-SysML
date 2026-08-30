// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CustomerRequestAcquisition_coordinator_process_customer_request_acquisition {

  def initialise(api: CustomerRequestAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_boundary_facts(Factory_Dispatch_Coordinator.RequestBoundaryFacts.example())
  }

  def timeTriggered(api: CustomerRequestAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_fresh_request: Option[Factory_Dispatch_Coordinator.FreshRequest.Type] = api.get_fresh_request()
    api.logInfo(s"Received on data port fresh_request: ${apiUsage_fresh_request}")
  }

  def finalise(api: CustomerRequestAcquisition_Operational_Api): Unit = { }
}
