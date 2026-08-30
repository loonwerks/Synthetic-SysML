// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_bf53b5edc81c_Oracle_Pointwise_Realizable {
  @pure def check(
      material_readiness_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      supplier_availability: equiv_shared_0.Factory_Material_Continuity_Coordinator.Availability.Type,
      supply_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)) |
        (equiv_shared_0.Factory_Material_Continuity_Coordinator.ReplenishmentEligibility_material_continuity_process_replenishment_eligibility_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.PROPOSED)))))
  }
}
