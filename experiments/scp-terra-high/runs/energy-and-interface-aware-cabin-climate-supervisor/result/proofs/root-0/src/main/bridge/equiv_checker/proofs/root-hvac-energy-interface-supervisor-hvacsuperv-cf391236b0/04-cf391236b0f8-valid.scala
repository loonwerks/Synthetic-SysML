// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cf391236b0f8_4_Valid {
  @pure def check(
      climaterequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ClimateRequest.Type,
      comfortdemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Type,
      thermalrelation: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ThermalRelation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_GumboX.inititialize_IEP_Post(comfortdemand))) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Candidate_GumboX.inititialize_IEP_Post(comfortdemand))) & T))
  }
}
