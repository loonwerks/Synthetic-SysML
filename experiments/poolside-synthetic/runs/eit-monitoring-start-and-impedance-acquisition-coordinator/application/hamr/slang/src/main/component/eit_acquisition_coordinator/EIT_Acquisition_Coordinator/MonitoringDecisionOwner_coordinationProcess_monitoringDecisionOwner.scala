// #Sireum

package eit_acquisition_coordinator.EIT_Acquisition_Coordinator

import org.sireum._
import eit_acquisition_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object MonitoringDecisionOwner_coordinationProcess_monitoringDecisionOwner {

  def initialise(api: MonitoringDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_acquisitionCommand(EIT_Acquisition_Coordinator.AcquisitionCommand.HoldAcquisition)
    api.put_monitoringResolution(EIT_Acquisition_Coordinator.MonitoringResolution.example())
  }

  def timeTriggered(api: MonitoringDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualifiedRequest: Option[EIT_Acquisition_Coordinator.QualifiedRequest.Type] = api.get_qualifiedRequest()
    api.logInfo(s"Received on data port qualifiedRequest: ${apiUsage_qualifiedRequest}")
    val apiUsage_acquisitionEvidence: Option[EIT_Acquisition_Coordinator.AcquisitionEvidence.Type] = api.get_acquisitionEvidence()
    api.logInfo(s"Received on data port acquisitionEvidence: ${apiUsage_acquisitionEvidence}")
  }

  def finalise(api: MonitoringDecisionOwner_Operational_Api): Unit = { }
}
