// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_268f619c45f3_Oracle_Pointwise_Realizable {
  @pure def check(
      fresh_request: equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.NONE, request_present = F))) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.NONE, request_present = T))) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.INVALID, request_present = F))) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.INVALID, request_present = T))) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.VALID_STANDARD, request_present = F))) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.VALID_STANDARD, request_present = T))) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.VALID_EXPEDITE, request_present = F))) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.CustomerRequestAcquisition_coordinator_process_customer_request_acquisition_GumboX.compute_CEP_Post(fresh_request, equiv_shared_0.Factory_Dispatch_Coordinator.RequestBoundaryFacts(fresh_request = equiv_shared_0.Factory_Dispatch_Coordinator.FreshRequest.VALID_EXPEDITE, request_present = T))))))
  }
}
