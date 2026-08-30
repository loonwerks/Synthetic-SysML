// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4152f48f831c_4_Valid {
  @pure def check(
      criticalelectrical: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type,
      criticalequipment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type,
      recoveryacknowledgment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type,
      recoveryreport: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryReport,
      visibilityfault: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type,
      in_recovery: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryState.Type,
      recovery: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner_GumboX.compute_CEP_Post(in_recovery, recovery, criticalelectrical, criticalequipment, recoveryacknowledgment, visibilityfault, recoveryreport))) ___>: (T)) & T))
  }
}
