// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_88fa98ab577b_4_Valid {
  @pure def check(
      request_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_GumboX.inititialize_IEP_Post(request_facts))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_Candidate_GumboX.inititialize_IEP_Post(request_facts))) & T))
  }
}
