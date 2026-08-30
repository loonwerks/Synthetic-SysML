// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7f8b80076399_2_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      resourcegrant: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_GumboX.compute_CEP_Post(energycapability, serviceselection, resourcegrant))) & T))
  }
}
