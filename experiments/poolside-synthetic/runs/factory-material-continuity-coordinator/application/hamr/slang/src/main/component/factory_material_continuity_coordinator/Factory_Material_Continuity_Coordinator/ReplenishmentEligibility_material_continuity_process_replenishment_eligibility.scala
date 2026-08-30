// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ReplenishmentEligibility_material_continuity_process_replenishment_eligibility {

  def initialise(api: ReplenishmentEligibility_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_REPLENISHMENT_NOT_PROPOSED
        api.proposal == ProposalState.NotProposed
      )
    )
    // example api usage

    api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)
  }

  def timeTriggered(api: ReplenishmentEligibility_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_23_REPLENISHMENT_PROPOSED
        (api.recovery_gate == RecoveryGate.OPEN &&
         api.material_readiness_facts.replenishmentNeeded &&
         api.supply_state == SupplyState.CLEAR &&
         api.supplier_availability == Availability.AVAILABLE) ___>: (
          api.proposal == ProposalState.PROPOSED),
        // CASE_24_REPLENISHMENT_NOT_PROPOSED
        (!(api.recovery_gate == RecoveryGate.OPEN &&
           api.material_readiness_facts.replenishmentNeeded &&
           api.supply_state == SupplyState.CLEAR &&
           api.supplier_availability == Availability.AVAILABLE)) ___>: (
          api.proposal == ProposalState.NotProposed)
      )
    )
    // example api usage

    val mrf: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = api.get_material_readiness_facts().get
    val ss: Factory_Material_Continuity_Coordinator.SupplyState.Type = api.get_supply_state().get
    val sa: Factory_Material_Continuity_Coordinator.Availability.Type = api.get_supplier_availability().get
    val rg: Factory_Material_Continuity_Coordinator.RecoveryGate.Type = api.get_recovery_gate().get

    if (rg == Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN &&
        mrf.replenishmentNeeded &&
        ss == Factory_Material_Continuity_Coordinator.SupplyState.CLEAR &&
        sa == Factory_Material_Continuity_Coordinator.Availability.AVAILABLE) {
      api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.PROPOSED)
    } else {
      api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)
    }
  }

  def finalise(api: ReplenishmentEligibility_Operational_Api): Unit = { }
}
