// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6d54d9126262_2_Valid {
  @pure def check(
      climaterequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ClimateRequest.Type,
      comfortdemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Type,
      thermalrelation: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ThermalRelation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Candidate_GumboX.compute_CEP_Post(climaterequest, thermalrelation, comfortdemand))) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_GumboX.compute_CEP_Post(climaterequest, thermalrelation, comfortdemand))) & T))
  }
}
