// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_4c1c2cf397a5_Oracle_Pointwise_Realizable {
  @pure def check(
      raw_request: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Request_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request.Invalid_Request)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request.No_Qualified_Request)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_GumboX.compute_CEP_Post(raw_request, equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request.Qualified_Shipment_Request)))))
  }
}
