// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_5c6b7dd2992a_Oracle_Pointwise_Realizable {
  @pure def check(
      beltassessment: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment,
      calibrationobservation: equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_GumboX.inititialize_IEP_Post(beltassessment, calibrationobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualification.CALIBRATION_BLOCKED)) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_GumboX.inititialize_IEP_Post(beltassessment, calibrationobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualification.NOT_CALIBRATED)) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_GumboX.inititialize_IEP_Post(beltassessment, calibrationobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualification.CALIBRATED)))))
  }
}
