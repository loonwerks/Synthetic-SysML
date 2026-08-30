// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_4c1c2cf397a5_Candidate_Pointwise_Realizable {
  @pure def check(
      request_arrival: equiv_shared_0.Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.No_Arrival_Fact)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Invalid_Arrival)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleA_One)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleA_Two)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleB_One)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R1_AngleB_Two)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleA_One)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleA_Two)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleB_One)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.compute_CEP_Post(request_arrival, equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Valid_R2_AngleB_Two)))))
  }
}
