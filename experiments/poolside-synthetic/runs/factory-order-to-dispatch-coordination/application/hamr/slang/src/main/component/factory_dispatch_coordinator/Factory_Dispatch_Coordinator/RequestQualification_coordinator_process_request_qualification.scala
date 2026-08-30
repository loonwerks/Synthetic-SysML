// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualification_coordinator_process_request_qualification {

  def initialise(api: RequestQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_facts(Factory_Dispatch_Coordinator.RequestFacts.example())
  }

  def timeTriggered(api: RequestQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_boundary_facts: Option[Factory_Dispatch_Coordinator.RequestBoundaryFacts] = api.get_request_boundary_facts()
    api.logInfo(s"Received on data port request_boundary_facts: ${apiUsage_request_boundary_facts}")
  }

  def finalise(api: RequestQualification_Operational_Api): Unit = { }
}
