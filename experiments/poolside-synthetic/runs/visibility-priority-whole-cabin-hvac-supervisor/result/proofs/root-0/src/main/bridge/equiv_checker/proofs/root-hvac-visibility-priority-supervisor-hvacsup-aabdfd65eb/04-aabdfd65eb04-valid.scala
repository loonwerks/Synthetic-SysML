// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_aabdfd65eb04_4_Valid {
  @pure def check(
      airpath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirPathReadiness,
      criticalequipment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type,
      equipmentreadiness: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EquipmentReadiness,
      thermalpath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness,
      visibilitypath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.EquipmentFaultAssessor_supervision_equipmentFaultAssessor_GumboX.inititialize_IEP_Post(airpath, criticalequipment, thermalpath, visibilitypath))) ___>: (T)) & T))
  }
}
