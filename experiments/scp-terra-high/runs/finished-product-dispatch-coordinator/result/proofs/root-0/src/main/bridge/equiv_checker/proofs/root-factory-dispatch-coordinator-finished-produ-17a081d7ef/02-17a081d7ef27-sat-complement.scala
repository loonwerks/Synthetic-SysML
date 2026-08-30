// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_17a081d7ef27_2_Complement {
  @pure def check(
      arbiter_request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact,
      inventory_request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact,
      priority_admission: equiv_shared_0.Factory_Dispatch_Coordinator.Admission_Assessment.Type,
      request: equiv_shared_0.Factory_Dispatch_Coordinator.Raw_Dispatch_Request): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualifier_dispatch_coordinator_process_request_qualifier_GumboX.compute_CEP_Post(request, arbiter_request_fact, inventory_request_fact, priority_admission))) & T)))
  }
}
