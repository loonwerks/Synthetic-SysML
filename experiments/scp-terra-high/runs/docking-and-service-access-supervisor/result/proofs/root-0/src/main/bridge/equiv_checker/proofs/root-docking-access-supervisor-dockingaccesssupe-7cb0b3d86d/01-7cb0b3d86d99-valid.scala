// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7cb0b3d86d99_1_Valid {
  @pure def check(
      access_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      admission_guard: equiv_shared_0.Docking_Access_Supervisor.AdmissionGuard,
      berth_transition_evidence: equiv_shared_0.Docking_Access_Supervisor.BerthTransitionEvidence,
      control_event: equiv_shared_0.Docking_Access_Supervisor.ControlEvent.Type,
      docking_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      gate_safety_frame: equiv_shared_0.Docking_Access_Supervisor.GateSafetyFrame,
      lifecycle_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      prior_berth_state: equiv_shared_0.Docking_Access_Supervisor.BerthState.Type,
      prior_gate_state: equiv_shared_0.Docking_Access_Supervisor.GateState.Type,
      prior_lifecycle_view: equiv_shared_0.Docking_Access_Supervisor.PriorLifecycleView,
      prior_recovery_state: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type,
      priority_directive: equiv_shared_0.Docking_Access_Supervisor.PriorityDirective,
      recovery_transition: equiv_shared_0.Docking_Access_Supervisor.RecoveryTransition,
      service_facts: equiv_shared_0.Docking_Access_Supervisor.ServiceFacts,
      station_facts: equiv_shared_0.Docking_Access_Supervisor.StationFacts,
      undocking_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      vessel_facts: equiv_shared_0.Docking_Access_Supervisor.VesselFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
