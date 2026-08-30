// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1d09487425d1_2_Valid {
  @pure def check(
      fresh_request: equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.Type,
      request_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.inititialize_IEP_Post(request_boundary_facts))) & T))
  }
}
