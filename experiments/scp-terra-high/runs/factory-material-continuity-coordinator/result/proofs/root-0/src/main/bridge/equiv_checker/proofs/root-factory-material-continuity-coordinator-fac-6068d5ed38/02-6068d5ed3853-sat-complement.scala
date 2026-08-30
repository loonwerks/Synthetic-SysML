// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6068d5ed3853_2_Complement {
  @pure def check(
      inventory_band: equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryBand.Type,
      inventory_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryAcquisition_material_continuity_process_inventory_acquisition_GumboX.compute_CEP_Post(inventory_band, inventory_boundary_facts))) & T)))
  }
}
