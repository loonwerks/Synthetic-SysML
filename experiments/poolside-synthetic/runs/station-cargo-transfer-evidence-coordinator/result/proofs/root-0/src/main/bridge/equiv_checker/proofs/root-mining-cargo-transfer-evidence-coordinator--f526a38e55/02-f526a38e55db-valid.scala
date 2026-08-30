// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f526a38e55db_2_Valid {
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
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_GumboX.compute_CEP_Post(in_requestledger, requestledger, coordination_guard, dock_facts, prior_session_view, request_facts, admission_decision, request_disposition))) & T))
  }
}
