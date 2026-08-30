// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_6d54d9126262_Oracle_Pointwise_Realizable {
  @pure def check(
      climaterequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ClimateRequest.Type,
      thermalrelation: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ThermalRelation.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_GumboX.compute_CEP_Post(climaterequest, thermalrelation, equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.None)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_GumboX.compute_CEP_Post(climaterequest, thermalrelation, equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Hold)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_GumboX.compute_CEP_Post(climaterequest, thermalrelation, equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_GumboX.compute_CEP_Post(climaterequest, thermalrelation, equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier_GumboX.compute_CEP_Post(climaterequest, thermalrelation, equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid)))))
  }
}
