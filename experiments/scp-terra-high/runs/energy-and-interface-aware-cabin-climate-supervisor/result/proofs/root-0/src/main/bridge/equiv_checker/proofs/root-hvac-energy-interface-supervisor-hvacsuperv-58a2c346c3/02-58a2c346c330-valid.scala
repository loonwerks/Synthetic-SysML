// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_58a2c346c330_2_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      energycontext: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyContext): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_Candidate_GumboX.inititialize_IEP_Post(energycapability))) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_GumboX.inititialize_IEP_Post(energycapability))) & T))
  }
}
