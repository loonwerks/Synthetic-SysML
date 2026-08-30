// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f190132f4c08_2_Valid {
  @pure def check(
      fault_action_summary: equiv_shared_0.Power_Propulsion_Availability_Supervisor.FaultActionSummary,
      recovery_frame: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryFrame,
      recovery_gate: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryGate.Type,
      in_recoverymemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type,
      recoverymemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_Candidate_GumboX.compute_CEP_Post(in_recoverymemory, recoverymemory, fault_action_summary, recovery_frame, recovery_gate))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_GumboX.compute_CEP_Post(in_recoverymemory, recoverymemory, fault_action_summary, recovery_frame, recovery_gate))) & T))
  }
}
