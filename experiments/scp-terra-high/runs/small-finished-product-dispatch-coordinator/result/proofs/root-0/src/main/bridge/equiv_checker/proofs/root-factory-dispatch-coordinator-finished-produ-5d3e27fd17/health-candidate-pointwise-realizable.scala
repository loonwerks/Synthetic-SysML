// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_5d3e27fd17d3_Candidate_Pointwise_Realizable {
  @pure def check(
      raw_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Candidate_GumboX.compute_CEP_Post(raw_outcome, equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Outcome.Invalid_Outcome)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Candidate_GumboX.compute_CEP_Post(raw_outcome, equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Outcome.No_Qualified_Report)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Candidate_GumboX.compute_CEP_Post(raw_outcome, equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Outcome.Qualified_Shipment_Accepted)))))
  }
}
