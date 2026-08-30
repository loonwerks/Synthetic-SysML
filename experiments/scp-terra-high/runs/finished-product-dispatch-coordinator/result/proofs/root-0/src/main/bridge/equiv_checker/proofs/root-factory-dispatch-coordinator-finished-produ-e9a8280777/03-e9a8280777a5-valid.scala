// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e9a8280777a5_3_Valid {
  @pure def check(
      candidate_readiness: equiv_shared_0.Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness,
      decision_reason: equiv_shared_0.Factory_Dispatch_Coordinator.Decision_Reason.Type,
      dispatch_decision: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Decision,
      dock_assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Type,
      request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact,
      selected_intent: equiv_shared_0.Factory_Dispatch_Coordinator.Selected_Intent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
