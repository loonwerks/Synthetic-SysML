// #Sireum

package eit_acquisition_coordinator.EIT_Acquisition_Coordinator

import org.sireum._
import eit_acquisition_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification {

  def initialise(api: AcquisitionEvidenceQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_acquisitionEvidence(EIT_Acquisition_Coordinator.AcquisitionEvidence.InvalidAcquisitionEvidence)
  }

  def timeTriggered(api: AcquisitionEvidenceQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_calibrationSample: Option[EIT_Acquisition_Coordinator.CalibrationSample] = api.get_calibrationSample()
    api.logInfo(s"Received on data port calibrationSample: ${apiUsage_calibrationSample}")
    val apiUsage_impedanceSample: Option[EIT_Acquisition_Coordinator.ImpedanceSample] = api.get_impedanceSample()
    api.logInfo(s"Received on data port impedanceSample: ${apiUsage_impedanceSample}")
  }

  def finalise(api: AcquisitionEvidenceQualification_Operational_Api): Unit = { }
}
