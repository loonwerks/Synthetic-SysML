// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f0d40ecfee69_4_Valid {
  @pure def check(
      fault_summary: equiv_shared_0.EIT_Acquisition_Supervisor.FaultSummary,
      recovery_event: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryEvent.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      in_recoverymemory: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryState.Type,
      recoverymemory: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_GumboX.compute_CEP_Post(in_recoverymemory, recoverymemory, fault_summary, recovery_event, recovery_frame))) ___>: (T)) & T))
  }
}
