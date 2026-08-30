// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8311d414bcf0_4_Valid {
  @pure def check(
      demand_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandBoundaryFacts,
      demand_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandQualification_material_continuity_process_demand_qualification_GumboX.inititialize_IEP_Post(demand_facts))) ___>: (T)) & T))
  }
}
