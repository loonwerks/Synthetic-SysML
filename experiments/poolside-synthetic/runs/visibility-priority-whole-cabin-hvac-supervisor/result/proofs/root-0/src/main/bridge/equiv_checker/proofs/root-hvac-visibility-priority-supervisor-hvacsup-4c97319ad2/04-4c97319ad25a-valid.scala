// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4c97319ad25a_4_Valid {
  @pure def check(
      cabinobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CabinThermalObservation,
      qualifiedtarget: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedTarget,
      thermalassessment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.inititialize_IEP_Post(thermalassessment))) ___>: (T)) & T))
  }
}
