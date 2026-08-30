// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility {

  @strictpure def isUrgentOpen(ds: DemandStateView.Type): B =
    ds == DemandStateView.AUrgentOpen || ds == DemandStateView.BUrgentOpen

  def initialise(api: UrgentReleaseEligibility_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_URGENT_NOT_PROPOSED
        api.proposal == ProposalState.NotProposed
      )
    )
    // example api usage

    api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)
  }

  def timeTriggered(api: UrgentReleaseEligibility_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_19_URGENT_PROPOSED
        (api.recovery_gate == RecoveryGate.OPEN &&
         isUrgentOpen(api.demand_state) &&
         api.material_readiness_facts.materialAvailable &&
         api.material_readiness_facts.productionEvidenceUsable &&
         api.material_readiness_facts.productionAccepting) ___>: (
          api.proposal == ProposalState.PROPOSED),
        // CASE_20_URGENT_NOT_PROPOSED
        (!(api.recovery_gate == RecoveryGate.OPEN &&
           isUrgentOpen(api.demand_state) &&
           api.material_readiness_facts.materialAvailable &&
           api.material_readiness_facts.productionEvidenceUsable &&
           api.material_readiness_facts.productionAccepting)) ___>: (
          api.proposal == ProposalState.NotProposed)
      )
    )
    // example api usage

    val ds: Factory_Material_Continuity_Coordinator.DemandStateView.Type = api.get_demand_state().get
    val mrf: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts = api.get_material_readiness_facts().get
    val rg: Factory_Material_Continuity_Coordinator.RecoveryGate.Type = api.get_recovery_gate().get

    if (rg == Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN &&
        isUrgentOpen(ds) &&
        mrf.materialAvailable &&
        mrf.productionEvidenceUsable &&
        mrf.productionAccepting) {
      api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.PROPOSED)
    } else {
      api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)
    }
  }

  def finalise(api: UrgentReleaseEligibility_Operational_Api): Unit = { }
}
