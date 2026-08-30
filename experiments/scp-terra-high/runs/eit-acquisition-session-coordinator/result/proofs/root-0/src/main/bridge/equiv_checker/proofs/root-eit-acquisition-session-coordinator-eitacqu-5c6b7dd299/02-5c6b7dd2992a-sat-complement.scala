// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c6b7dd2992a_2_Complement {
  @pure def check(
      beltassessment: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment,
      calibrationobservation: equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationObservation.Type,
      calibrationqualification: equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualification.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.CalibrationQualificationOwner_acquisitionCoordinationProcess_calibrationQualificationOwner_GumboX.inititialize_IEP_Post(beltassessment, calibrationobservation, calibrationqualification))) & T)))
  }
}
