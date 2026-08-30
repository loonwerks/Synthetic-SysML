// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8a2f04f2a5b7_4_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      coordination_frame: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame,
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      sessionstate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_GumboX.inititialize_IEP_Post(sessionstate, prior_session_view))) ___>: (T)) & T))
  }
}
