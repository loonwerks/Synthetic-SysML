// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_86c7512491e3_Oracle_Pointwise_Realizable {
  @pure def check(
      outcome_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeBoundaryFacts,
      prior_order_state: equiv_shared_0.Factory_Dispatch_Coordinator.OrderState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_GumboX.compute_CEP_Post(outcome_boundary_facts, prior_order_state, equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.NO_PROGRESS)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_GumboX.compute_CEP_Post(outcome_boundary_facts, prior_order_state, equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.QUOTE_ACCEPTED)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_GumboX.compute_CEP_Post(outcome_boundary_facts, prior_order_state, equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.MATERIAL_CONFIRMED)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_GumboX.compute_CEP_Post(outcome_boundary_facts, prior_order_state, equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.PRODUCTION_COMPLETED)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_GumboX.compute_CEP_Post(outcome_boundary_facts, prior_order_state, equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.DISPATCH_COMPLETED)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeQualification_coordinator_process_outcome_qualification_GumboX.compute_CEP_Post(outcome_boundary_facts, prior_order_state, equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.FAULT)))))
  }
}
