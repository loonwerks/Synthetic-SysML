// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5fb5f07c5498_4_Valid {
  @pure def check(
      inventory_band: equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryBand.Type,
      inventory_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_GumboX.inititialize_IEP_Post(inventory_boundary_facts))) ___>: (T)) & T))
  }
}
