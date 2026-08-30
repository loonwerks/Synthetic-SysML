// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3f5b3735913f_2_Complement {
  @pure def check(
      event_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.EventBoundaryFacts,
      fault_trigger: equiv_shared_0.Factory_Material_Continuity_Coordinator.FaultTrigger.Type,
      prior_demand_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandState.Type,
      prior_supply_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      qualified_event_to_demand: equiv_shared_0.Factory_Material_Continuity_Coordinator.QualifiedEvent.Type,
      qualified_event_to_supply: equiv_shared_0.Factory_Material_Continuity_Coordinator.QualifiedEvent.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.EventCoherence_material_continuity_process_event_coherence_GumboX.inititialize_IEP_Post(fault_trigger, qualified_event_to_demand, qualified_event_to_supply))) & T)))
  }
}
