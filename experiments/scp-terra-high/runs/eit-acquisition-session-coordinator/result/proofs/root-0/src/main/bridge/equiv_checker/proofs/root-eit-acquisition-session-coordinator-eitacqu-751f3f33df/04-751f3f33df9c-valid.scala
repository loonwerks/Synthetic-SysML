// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_751f3f33df9c_4_Valid {
  @pure def check(
      beltassessment: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment,
      beltobservation: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_GumboX.compute_CEP_Post(beltobservation, beltassessment))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltobservation, beltassessment))) & T))
  }
}
