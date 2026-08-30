// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ded261d89459_2_Valid {
  @pure def check(
      outcome_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeBoundaryFacts,
      prior_order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_Candidate_GumboX.inititialize_IEP_Post(qualified_outcome))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_GumboX.inititialize_IEP_Post(qualified_outcome))) & T))
  }
}
