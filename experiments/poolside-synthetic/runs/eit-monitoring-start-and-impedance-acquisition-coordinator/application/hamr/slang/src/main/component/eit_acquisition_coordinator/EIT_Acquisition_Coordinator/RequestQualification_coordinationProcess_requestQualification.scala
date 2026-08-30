// #Sireum

package eit_acquisition_coordinator.EIT_Acquisition_Coordinator

import org.sireum._
import eit_acquisition_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualification_coordinationProcess_requestQualification {

  def initialise(api: RequestQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedRequest(EIT_Acquisition_Coordinator.QualifiedRequest.InvalidRequest)
  }

  def timeTriggered(api: RequestQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestSample: Option[EIT_Acquisition_Coordinator.MonitoringRequestSample] = api.get_requestSample()
    api.logInfo(s"Received on data port requestSample: ${apiUsage_requestSample}")
  }

  def finalise(api: RequestQualification_Operational_Api): Unit = { }
}
