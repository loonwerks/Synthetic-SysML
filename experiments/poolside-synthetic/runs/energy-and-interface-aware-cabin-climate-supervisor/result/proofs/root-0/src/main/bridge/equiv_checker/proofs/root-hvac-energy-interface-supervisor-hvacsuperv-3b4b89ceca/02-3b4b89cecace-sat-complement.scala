// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3b4b89cecace_2_Complement {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      energycontext: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyContext): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapabilityQualifier_climateSupervisionProcess_energyCapabilityQualifier_GumboX.compute_CEP_Post(energycontext, energycapability))) & T)))
  }
}
