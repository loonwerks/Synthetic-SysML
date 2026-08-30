// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0a43714b3ce6_2_Valid {
  @pure def check(
      fault_summary: equiv_shared_0.EIT_Acquisition_Supervisor.FaultSummary,
      recovery_event: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryEvent.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      recoverymemory: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_GumboX.inititialize_IEP_Post(recoverymemory, recovery_frame))) & T))
  }
}
