// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3b4b89cecace_4_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      energycontext: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyContext): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_GumboX.compute_CEP_Post(energycontext, energycapability))) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Candidate_GumboX.compute_CEP_Post(energycontext, energycapability))) & T))
  }
}
