// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ae7743aed775_Oracle_Pointwise_Realizable {
  @pure def check(
      recovery_transition: equiv_shared_0.Docking_Access_Supervisor.RecoveryTransition,
      in_recoverystate: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING, recovery_transition, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING)))))
  }
}
