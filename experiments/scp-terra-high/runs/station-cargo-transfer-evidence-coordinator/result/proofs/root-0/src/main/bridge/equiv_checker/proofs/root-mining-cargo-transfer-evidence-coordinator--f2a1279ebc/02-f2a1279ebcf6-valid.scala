// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f2a1279ebcf6_2_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      coordination_frame: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame,
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      in_sessionstate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type,
      sessionstate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_GumboX.compute_CEP_Post(in_sessionstate, sessionstate, admission_decision, coordination_frame, prior_session_view))) & T))
  }
}
