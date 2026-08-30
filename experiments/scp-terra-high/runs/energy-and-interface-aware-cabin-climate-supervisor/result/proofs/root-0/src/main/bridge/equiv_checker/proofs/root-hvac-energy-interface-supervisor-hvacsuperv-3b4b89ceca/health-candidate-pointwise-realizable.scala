// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_3b4b89cecace_Candidate_Pointwise_Realizable {
  @pure def check(
      energycontext: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Candidate_GumboX.compute_CEP_Post(energycontext, equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Full)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Candidate_GumboX.compute_CEP_Post(energycontext, equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Candidate_GumboX.compute_CEP_Post(energycontext, equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Candidate_GumboX.compute_CEP_Post(energycontext, equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.None)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Candidate_GumboX.compute_CEP_Post(energycontext, equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid)))))
  }
}
