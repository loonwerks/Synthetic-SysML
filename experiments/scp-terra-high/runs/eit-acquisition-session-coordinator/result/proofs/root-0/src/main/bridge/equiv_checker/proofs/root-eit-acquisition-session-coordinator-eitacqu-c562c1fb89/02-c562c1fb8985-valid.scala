// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c562c1fb8985_2_Valid {
  @pure def check(
      arbitrationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ArbitrationDecision,
      doctorrequest: equiv_shared_0.EIT_Acquisition_Session_Coordinator.DoctorRequest.Type,
      eligibilityenvelope: equiv_shared_0.EIT_Acquisition_Session_Coordinator.EligibilityEnvelope,
      technicianrequest: equiv_shared_0.EIT_Acquisition_Session_Coordinator.TechnicianRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_Candidate_GumboX.compute_CEP_Post(doctorrequest, eligibilityenvelope, technicianrequest, arbitrationdecision))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.RequestArbiter_acquisitionCoordinationProcess_requestArbiter_GumboX.compute_CEP_Post(doctorrequest, eligibilityenvelope, technicianrequest, arbitrationdecision))) & T))
  }
}
