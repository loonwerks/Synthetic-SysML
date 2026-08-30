// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_115a91c6dc0d_4_Valid {
  @pure def check(
      demand_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandBoundaryFacts,
      demand_signal: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_GumboX.inititialize_IEP_Post(demand_boundary_facts))) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandAcquisition_material_continuity_process_demand_acquisition_Candidate_GumboX.inititialize_IEP_Post(demand_boundary_facts))) & T))
  }
}
