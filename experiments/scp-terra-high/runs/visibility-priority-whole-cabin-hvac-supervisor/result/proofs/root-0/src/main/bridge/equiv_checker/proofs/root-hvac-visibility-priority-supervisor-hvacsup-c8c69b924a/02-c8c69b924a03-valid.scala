// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c8c69b924a03_2_Valid {
  @pure def check(
      thermalassessment: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalAssessment,
      thermalpath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalPathReadiness,
      thermalproposal: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalProposal,
      wasteheateligibility: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.WasteHeatEligibility.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.ThermalServiceProposer_supervision_thermalServiceProposer_GumboX.compute_CEP_Post(thermalassessment, thermalpath, wasteheateligibility, thermalproposal))) & T))
  }
}
