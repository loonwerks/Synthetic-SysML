// #Sireum

package scp_candidate.EIT_Acquisition_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AcquisitionEvidenceQualification_coordinationProcess_acquisitionEvidenceQualification {

  def initialise(api: AcquisitionEvidenceQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_acquisitionEvidence(EIT_Acquisition_Coordinator.AcquisitionEvidence.InvalidAcquisitionEvidence)
  }

  def timeTriggered(api: AcquisitionEvidenceQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_calibrationSample(), api.get_impedanceSample()) match {
      case (Some(calibration), Some(impedance)) =>
        if (calibration.status == EIT_Acquisition_Coordinator.InputStatus.Invalid ||
            impedance.status == EIT_Acquisition_Coordinator.InputStatus.Invalid) {
          api.put_acquisitionEvidence(EIT_Acquisition_Coordinator.AcquisitionEvidence.InvalidAcquisitionEvidence)
        } else if (calibration.calibration == EIT_Acquisition_Coordinator.CalibrationState.NotCurrent) {
          api.put_acquisitionEvidence(EIT_Acquisition_Coordinator.AcquisitionEvidence.CalibrationAbsent)
        } else if (impedance.token == EIT_Acquisition_Coordinator.ImpedanceToken.NoToken) {
          api.put_acquisitionEvidence(EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyNoToken)
        } else if (impedance.token == EIT_Acquisition_Coordinator.ImpedanceToken.TokenOne) {
          api.put_acquisitionEvidence(EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyTokenOne)
        } else {
          api.put_acquisitionEvidence(EIT_Acquisition_Coordinator.AcquisitionEvidence.ReadyTokenTwo)
        }
    }
  }

  def finalise(api: AcquisitionEvidenceQualification_Operational_Api): Unit = { }
}
