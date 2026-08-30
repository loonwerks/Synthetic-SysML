// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_7aa25d2ce2c9_Candidate_Pointwise_Realizable {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Off)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly)) |
        (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied)))))
  }
}
