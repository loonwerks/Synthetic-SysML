// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_751f3f33df9c_Candidate_Pointwise_Realizable {
  @pure def check(
      beltobservation: equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltObservation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory = equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_UNAVAILABLE, qualified = F))) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory = equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_UNAVAILABLE, qualified = T))) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory = equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_ABSENT, qualified = F))) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory = equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_ABSENT, qualified = T))) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory = equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_PRESENT, qualified = F))) |
        (equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualificationOwner_acquisitionCoordinationProcess_beltQualificationOwner_Candidate_GumboX.compute_CEP_Post(beltobservation, equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltAssessment(beltCategory = equiv_shared_0.EIT_Acquisition_Session_Coordinator.BeltQualification.BELT_PRESENT, qualified = T))))))
  }
}
