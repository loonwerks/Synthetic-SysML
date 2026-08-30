// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1fcfeb18cd04_Candidate_Pointwise_Realizable {
  @pure def check(
      appliedresolution: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      currentmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      in_recoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Off, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Off)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Starting, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Off)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.On, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Off)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Off, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Starting)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Starting, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Starting)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.On, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Starting)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Off, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.On)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Starting, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.On)) |
        (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Candidate_GumboX.compute_CEP_Post(in_recoverytarget, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.On, appliedresolution, currentmode, equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.On)))))
  }
}
