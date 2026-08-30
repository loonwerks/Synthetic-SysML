// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b753ca4a79b7_2_Complement {
  @pure def check(
      event_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.EventBoundaryFacts,
      material_event: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialEvent.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_GumboX.inititialize_IEP_Post(event_boundary_facts))) & T)))
  }
}
