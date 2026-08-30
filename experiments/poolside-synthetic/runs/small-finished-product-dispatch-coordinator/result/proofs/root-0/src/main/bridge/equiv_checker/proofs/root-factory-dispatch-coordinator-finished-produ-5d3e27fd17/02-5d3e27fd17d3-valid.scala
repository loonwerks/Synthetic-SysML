// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5d3e27fd17d3_2_Valid {
  @pure def check(
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Outcome.Type,
      raw_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Outcome_Sample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_Candidate_GumboX.compute_CEP_Post(raw_outcome, qualified_outcome))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Qualification_dispatch_coordination_process_outcome_qualification_GumboX.compute_CEP_Post(raw_outcome, qualified_outcome))) & T))
  }
}
