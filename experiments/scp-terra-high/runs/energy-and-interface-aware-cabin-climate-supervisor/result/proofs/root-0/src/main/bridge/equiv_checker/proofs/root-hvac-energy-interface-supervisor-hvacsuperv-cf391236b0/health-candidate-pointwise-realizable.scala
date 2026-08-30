// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_cf391236b0f8_Candidate_Pointwise_Realizable {
  @pure def check(
      climaterequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ClimateRequest.Type,
      thermalrelation: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ThermalRelation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.None)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Hold)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid)))))
  }
}
