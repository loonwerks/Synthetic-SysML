// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7f7c49aeda25_2_Valid {
  @pure def check(
      candidate_readiness: equiv_shared_0.Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness,
      decision_reason: equiv_shared_0.Factory_Dispatch_Coordinator.Decision_Reason.Type,
      dispatch_decision: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Decision,
      dock_assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Type,
      request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact,
      selected_intent: equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Release_Arbiter_dispatch_coordinator_process_release_arbiter_GumboX.compute_CEP_Post(candidate_readiness, dock_assessment, request_fact, selected_intent, decision_reason, dispatch_decision))) & T))
  }
}
