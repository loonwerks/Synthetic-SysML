// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4833143b71f4_4_Valid {
  @pure def check(
      execution_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.ExecutionOutcome.Type,
      outcome_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.OutcomeBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_GumboX.inititialize_IEP_Post(outcome_boundary_facts))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition_Candidate_GumboX.inititialize_IEP_Post(outcome_boundary_facts))) & T))
  }
}
