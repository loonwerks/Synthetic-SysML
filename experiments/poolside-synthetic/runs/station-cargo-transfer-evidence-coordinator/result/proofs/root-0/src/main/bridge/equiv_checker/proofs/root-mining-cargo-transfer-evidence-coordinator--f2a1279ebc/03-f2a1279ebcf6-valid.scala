// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f2a1279ebcf6_3_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision,
      coordination_frame: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame,
      prior_session_view: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionView,
      in_sessionstate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type,
      sessionstate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
