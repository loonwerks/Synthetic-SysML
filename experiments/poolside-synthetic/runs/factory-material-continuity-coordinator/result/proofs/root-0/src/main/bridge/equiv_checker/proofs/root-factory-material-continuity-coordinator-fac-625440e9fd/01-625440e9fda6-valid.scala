// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_625440e9fda6_1_Valid {
  @pure def check(
      event_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.EventBoundaryFacts,
      fault_trigger: equiv_shared_0.Factory_Material_Continuity_Coordinator.FaultTrigger.Type,
      prior_demand_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandState.Type,
      prior_supply_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      qualified_event_to_demand: equiv_shared_0.Factory_Material_Continuity_Coordinator.QualifiedEvent.Type,
      qualified_event_to_supply: equiv_shared_0.Factory_Material_Continuity_Coordinator.QualifiedEvent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
