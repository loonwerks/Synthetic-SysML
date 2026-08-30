// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a6f3d664584e_1_Valid {
  @pure def check(
      airpath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirPathReadiness,
      criticalequipment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type,
      equipmentreadiness: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EquipmentReadiness,
      thermalpath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness,
      visibilitypath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
