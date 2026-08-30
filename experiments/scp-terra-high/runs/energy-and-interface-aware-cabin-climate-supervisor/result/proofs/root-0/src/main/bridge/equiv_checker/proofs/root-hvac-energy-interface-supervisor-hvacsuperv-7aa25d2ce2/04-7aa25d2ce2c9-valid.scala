// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7aa25d2ce2c9_4_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      resourcegrant: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_GumboX.inititialize_IEP_Post(resourcegrant))) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Candidate_GumboX.inititialize_IEP_Post(resourcegrant))) & T))
  }
}
