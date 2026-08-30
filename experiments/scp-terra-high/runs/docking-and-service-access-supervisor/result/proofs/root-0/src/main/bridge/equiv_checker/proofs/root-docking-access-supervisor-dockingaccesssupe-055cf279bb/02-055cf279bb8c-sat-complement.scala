// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_055cf279bb8c_2_Complement {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      gate_safety_frame: equiv_shared_0.Docking_Access_Supervisor.GateSafetyFrame,
      prior_gate_state: equiv_shared_0.Docking_Access_Supervisor.GateState.Type,
      in_gatestate: equiv_shared_0.Docking_Access_Supervisor.GateState.Type,
      gatestate: equiv_shared_0.Docking_Access_Supervisor.GateState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.compute_CEP_Post(in_gatestate, gatestate, admission_decision, gate_safety_frame, prior_gate_state))) & T)))
  }
}
