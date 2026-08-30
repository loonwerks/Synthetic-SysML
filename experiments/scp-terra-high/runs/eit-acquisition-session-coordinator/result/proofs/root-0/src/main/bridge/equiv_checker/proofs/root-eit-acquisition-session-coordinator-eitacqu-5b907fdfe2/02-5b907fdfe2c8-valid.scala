// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5b907fdfe2c8_2_Valid {
  @pure def check(
      beltassessment: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment,
      calibrationobservation: equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type,
      calibrationqualification: equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltassessment, calibrationobservation, calibrationqualification))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_GumboX.compute_CEP_Post(beltassessment, calibrationobservation, calibrationqualification))) & T))
  }
}
