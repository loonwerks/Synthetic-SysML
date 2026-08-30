// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6feb2e8c85c7_4_Valid {
  @pure def check(
      fault_action_summary: equiv_shared_0.Power_Propulsion_Availability_Supervisor.FaultActionSummary,
      recovery_frame: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryFrame,
      recovery_gate: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryGate.Type,
      recoverymemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_GumboX.inititialize_IEP_Post(recoverymemory, recovery_frame, recovery_gate))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_Candidate_GumboX.inititialize_IEP_Post(recoverymemory, recovery_frame, recovery_gate))) & T))
  }
}
