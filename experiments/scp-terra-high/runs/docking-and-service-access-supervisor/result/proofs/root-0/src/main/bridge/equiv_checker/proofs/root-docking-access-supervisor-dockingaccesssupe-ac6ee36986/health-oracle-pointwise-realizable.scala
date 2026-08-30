// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ac6ee3698677_Oracle_Pointwise_Realizable {
  @pure def check(
      recovery_transition: equiv_shared_0.Docking_Access_Supervisor.RecoveryTransition): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.HEALTHY, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.LATCHED, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING)) |
        (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING, equiv_shared_0.Docking_Access_Supervisor.RecoveryState.RECONCILING)))))
  }
}
