// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f526a38e55db_3_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      coordination_guard: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard,
      dock_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts,
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      request_disposition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type,
      request_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts,
      in_requestledger: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type,
      requestledger: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
