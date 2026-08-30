// #Sireum

package eit_acquisition_coordinator.EIT_Acquisition_Coordinator

import org.sireum._
import eit_acquisition_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ImpedanceDeliveryDerivation_coordinationProcess_impedanceDeliveryDerivation {

  def initialise(api: ImpedanceDeliveryDerivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_impedanceDelivery(EIT_Acquisition_Coordinator.ImpedanceDelivery.Withheld)
  }

  def timeTriggered(api: ImpedanceDeliveryDerivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_monitoringResolution: Option[EIT_Acquisition_Coordinator.MonitoringResolution] = api.get_monitoringResolution()
    api.logInfo(s"Received on data port monitoringResolution: ${apiUsage_monitoringResolution}")
    val apiUsage_acquisitionEvidence: Option[EIT_Acquisition_Coordinator.AcquisitionEvidence.Type] = api.get_acquisitionEvidence()
    api.logInfo(s"Received on data port acquisitionEvidence: ${apiUsage_acquisitionEvidence}")
  }

  def finalise(api: ImpedanceDeliveryDerivation_Operational_Api): Unit = { }
}
