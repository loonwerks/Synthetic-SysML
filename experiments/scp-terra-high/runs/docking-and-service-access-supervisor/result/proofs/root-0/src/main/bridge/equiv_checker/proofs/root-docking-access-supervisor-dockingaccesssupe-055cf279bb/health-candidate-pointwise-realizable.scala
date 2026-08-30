// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_055cf279bb8c_Candidate_Pointwise_Realizable {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      gate_safety_frame: equiv_shared_0.Docking_Access_Supervisor.GateSafetyFrame,
      in_gatestate: equiv_shared_0.Docking_Access_Supervisor.GateState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T) |
        (T) |
        (T))))
  }
}
