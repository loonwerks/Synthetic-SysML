// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner {

  def initialise(api: CalibrationQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api),
      Ensures(T /*
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_CALIBRATION_QUALIFICATION
        (!(api.beltAssessment.qualified) ___>:
           api.calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED) &&
          (api.beltAssessment.qualified &&
            api.calibrationObservation != CalibrationObservation.CALIBRATION_PASSED ___>:
            api.calibrationQualification == CalibrationQualification.NOT_CALIBRATED) &&
          (api.beltAssessment.qualified &&
            api.calibrationObservation == CalibrationObservation.CALIBRATION_PASSED ___>:
            api.calibrationQualification == CalibrationQualification.CALIBRATED)
        // END INITIALIZES ENSURES
      */)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_calibrationQualification(EIT_Acquisition_Session_Coordinator.CalibrationQualification.CALIBRATION_BLOCKED)
  }

  def timeTriggered(api: CalibrationQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_beltAssessment() match {
      case Some(belt) =>
        api.get_calibrationObservation() match {
          case Some(CalibrationObservation.CALIBRATION_PASSED) if belt.qualified =>
            api.put_calibrationQualification(CalibrationQualification.CALIBRATED)
          case _ if belt.qualified =>
            api.put_calibrationQualification(CalibrationQualification.NOT_CALIBRATED)
          case _ => api.put_calibrationQualification(CalibrationQualification.CALIBRATION_BLOCKED)
        }
    }
  }

  def finalise(api: CalibrationQualificationOwner_Operational_Api): Unit = { }
}
