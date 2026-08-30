// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1380831503ea_2_Valid {
  @pure def check(
      cabinobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.CabinThermalObservation,
      qualifiedtarget: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedTarget,
      thermalassessment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalNeedAssessor_supervision_thermalNeedAssessor_GumboX.compute_CEP_Post(cabinobservation, qualifiedtarget, thermalassessment))) & T))
  }
}
