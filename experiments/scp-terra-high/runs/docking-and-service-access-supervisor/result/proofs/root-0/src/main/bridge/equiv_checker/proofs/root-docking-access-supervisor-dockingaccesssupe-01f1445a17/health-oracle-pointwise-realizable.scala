// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_01f1445a17ad_Oracle_Pointwise_Realizable {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      gate_safety_frame: equiv_shared_0.Docking_Access_Supervisor.GateSafetyFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED, equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED)) |
        (equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN, equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED)) |
        (equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.GateState.CLOSED, equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN)) |
        (equiv_shared_0.Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN, equiv_shared_0.Docking_Access_Supervisor.GateState.OPEN)))))
  }
}
