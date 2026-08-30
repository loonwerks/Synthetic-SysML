// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4c9c79700a2e_3_Valid {
  @pure def check(
      criticalelectrical: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type,
      criticalequipment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type,
      recoveryacknowledgment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type,
      recoveryreport: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryReport,
      visibilityfault: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type,
      recovery: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
