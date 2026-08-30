// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6221b9dcb548_2_Complement {
  @pure def check(
      request_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts,
      request_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.RequestQualification_coordinator_process_request_qualification_GumboX.compute_CEP_Post(request_boundary_facts, request_facts))) & T)))
  }
}
