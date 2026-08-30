// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_778cc5bdbefe_2_Complement {
  @pure def check(
      event_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.EventBoundaryFacts,
      material_event: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialEvent.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.EventAcquisition_material_continuity_process_event_acquisition_GumboX.compute_CEP_Post(material_event, event_boundary_facts))) & T)))
  }
}
