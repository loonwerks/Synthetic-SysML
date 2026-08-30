// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bab1831d1260_2_Valid {
  @pure def check(
      demand_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandBoundaryFacts,
      demand_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_GumboX.compute_CEP_Post(demand_boundary_facts, demand_facts))) & T))
  }
}
