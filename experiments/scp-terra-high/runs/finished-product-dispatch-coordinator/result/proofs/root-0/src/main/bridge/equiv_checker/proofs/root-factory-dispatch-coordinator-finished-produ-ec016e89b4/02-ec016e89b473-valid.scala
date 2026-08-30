// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ec016e89b473_2_Valid {
  @pure def check(
      arbiter_request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact,
      inventory_request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact,
      priority_admission: equiv_shared_0.Factory_Dispatch_Coordinator.Admission_Assessment.Type,
      request: equiv_shared_0.Factory_Dispatch_Coordinator.Raw_Dispatch_Request): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_GumboX.inititialize_IEP_Post(arbiter_request_fact, inventory_request_fact, priority_admission))) & T))
  }
}
