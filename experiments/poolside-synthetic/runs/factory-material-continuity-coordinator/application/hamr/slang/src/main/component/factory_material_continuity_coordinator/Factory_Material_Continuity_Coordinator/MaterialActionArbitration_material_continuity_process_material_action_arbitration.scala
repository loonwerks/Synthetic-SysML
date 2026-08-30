// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object MaterialActionArbitration_material_continuity_process_material_action_arbitration {

  def initialise(api: MaterialActionArbitration_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_HOLD_DECISION
        api.decision.actionValue == MaterialAction.HOLD,
        api.decision.cause == DecisionCause.NoEligibleWork
      )
    )
    // example api usage

    api.put_decision(
      Factory_Material_Continuity_Coordinator.Decision(
        actionValue = Factory_Material_Continuity_Coordinator.MaterialAction.HOLD,
        cause = Factory_Material_Continuity_Coordinator.DecisionCause.NoEligibleWork))
  }

  def timeTriggered(api: MaterialActionArbitration_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_25_EMERGENCY_HOLD
        (api.emergency_state == EmergencyState.ACTIVE) ___>: (
          api.decision.actionValue == MaterialAction.HOLD &
          api.decision.cause == DecisionCause.FaultOrRecovery),
        // CASE_26_URGENT_PRIORITY
        (api.emergency_state == EmergencyState.INACTIVE & api.urgent_proposal == ProposalState.PROPOSED) ___>: (
          api.decision.actionValue == MaterialAction.ReleaseUrgentMaterial &
          api.decision.cause == DecisionCause.UrgentDemand),
        // CASE_27_REPLENISHMENT_PRIORITY
        (api.emergency_state == EmergencyState.INACTIVE & api.urgent_proposal == ProposalState.NotProposed &
         api.replenishment_proposal == ProposalState.PROPOSED) ___>: (
          api.decision.actionValue == MaterialAction.IssueMaterialOrder &
          api.decision.cause == DecisionCause.ReserveReplenishment),
        // CASE_28_ROUTINE_PRIORITY
        (api.emergency_state == EmergencyState.INACTIVE & api.urgent_proposal == ProposalState.NotProposed &
         api.replenishment_proposal == ProposalState.NotProposed & api.routine_proposal == ProposalState.PROPOSED) ___>: (
          api.decision.actionValue == MaterialAction.ReleaseRoutineMaterial &
          api.decision.cause == DecisionCause.RoutineDemand),
        // CASE_29_NO_ELIGIBLE_WORK
        (api.emergency_state == EmergencyState.INACTIVE & api.urgent_proposal == ProposalState.NotProposed &
         api.replenishment_proposal == ProposalState.NotProposed & api.routine_proposal == ProposalState.NotProposed) ___>: (
          api.decision.actionValue == MaterialAction.HOLD &
          api.decision.cause == DecisionCause.NoEligibleWork)
      )
    )
    // example api usage

    val emergencyState = api.get_emergency_state().get
    val urgentProposal = api.get_urgent_proposal().get
    val routineProposal = api.get_routine_proposal().get
    val replenishmentProposal = api.get_replenishment_proposal().get

    var action: MaterialAction.Type = MaterialAction.HOLD
    var cause: DecisionCause.Type = DecisionCause.NoEligibleWork

    if (emergencyState == EmergencyState.ACTIVE) {
      // CASE_25_EMERGENCY_HOLD
      action = MaterialAction.HOLD
      cause = DecisionCause.FaultOrRecovery
    } else if (urgentProposal == ProposalState.PROPOSED) {
      // CASE_26_URGENT_PRIORITY
      action = MaterialAction.ReleaseUrgentMaterial
      cause = DecisionCause.UrgentDemand
    } else if (replenishmentProposal == ProposalState.PROPOSED) {
      // CASE_27_REPLENISHMENT_PRIORITY
      action = MaterialAction.IssueMaterialOrder
      cause = DecisionCause.ReserveReplenishment
    } else if (routineProposal == ProposalState.PROPOSED) {
      // CASE_28_ROUTINE_PRIORITY
      action = MaterialAction.ReleaseRoutineMaterial
      cause = DecisionCause.RoutineDemand
    } else {
      // CASE_29_NO_ELIGIBLE_WORK
      action = MaterialAction.HOLD
      cause = DecisionCause.NoEligibleWork
    }

    api.put_decision(
      Factory_Material_Continuity_Coordinator.Decision(
        actionValue = action,
        cause = cause))
  }

  def finalise(api: MaterialActionArbitration_Operational_Api): Unit = { }
}
