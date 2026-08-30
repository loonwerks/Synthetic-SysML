// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_055cf279bb8c_Oracle_Pointwise_Realizable {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      gate_safety_frame: equiv_shared_0.Docking_Access_Supervisor.GateSafetyFrame,
      in_gatestate: equiv_shared_0.Docking_Access_Supervisor.GateState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.compute_CEP_Post(in_gatestate, equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED, admission_decision, gate_safety_frame, equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED)) |
        (equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.compute_CEP_Post(in_gatestate, equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN, admission_decision, gate_safety_frame, equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED)) |
        (equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.compute_CEP_Post(in_gatestate, equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED, admission_decision, gate_safety_frame, equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN)) |
        (equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.compute_CEP_Post(in_gatestate, equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN, admission_decision, gate_safety_frame, equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN)))))
  }
}
