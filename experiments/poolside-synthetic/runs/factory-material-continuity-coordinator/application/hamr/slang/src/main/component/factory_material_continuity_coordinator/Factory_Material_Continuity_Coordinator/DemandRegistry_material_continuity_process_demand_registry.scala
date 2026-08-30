// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DemandRegistry_material_continuity_process_demand_registry {

  var demandPhaseMemory: Factory_Material_Continuity_Coordinator.DemandState.Type =
    Factory_Material_Continuity_Coordinator.DemandState.IDLE

  @strictpure def stateViewOf(s: DemandState.Type): DemandStateView.Type = s match {
    case DemandState.IDLE => DemandStateView.IDLE
    case DemandState.ARoutineOpen => DemandStateView.ARoutineOpen
    case DemandState.AUrgentOpen => DemandStateView.AUrgentOpen
    case DemandState.BRoutineOpen => DemandStateView.BRoutineOpen
    case DemandState.BUrgentOpen => DemandStateView.BUrgentOpen
  }

  @strictpure def stateCodeOf(s: DemandState.Type): DemandStateCode.Type = s match {
    case DemandState.IDLE => DemandStateCode.IDLE
    case DemandState.ARoutineOpen => DemandStateCode.ARoutineOpen
    case DemandState.AUrgentOpen => DemandStateCode.AUrgentOpen
    case DemandState.BRoutineOpen => DemandStateCode.BRoutineOpen
    case DemandState.BUrgentOpen => DemandStateCode.BUrgentOpen
  }

  @strictpure def openStateOf(dv: DemandCode.Type): DemandState.Type = dv match {
    case DemandCode.ARoutine => DemandState.ARoutineOpen
    case DemandCode.AUrgent => DemandState.AUrgentOpen
    case DemandCode.BRoutine => DemandState.BRoutineOpen
    case DemandCode.BUrgent => DemandState.BUrgentOpen
    case DemandCode.NONE => DemandState.IDLE
    case DemandCode.INVALID => DemandState.IDLE
  }

  @strictpure def isValid(dv: DemandCode.Type): B =
    dv == DemandCode.ARoutine || dv == DemandCode.AUrgent || dv == DemandCode.BRoutine || dv == DemandCode.BUrgent

  @strictpure def isMatchingDuplicate(dv: DemandCode.Type, entry: DemandState.Type): B =
    (dv == DemandCode.ARoutine && entry == DemandState.ARoutineOpen) ||
    (dv == DemandCode.AUrgent && entry == DemandState.AUrgentOpen) ||
    (dv == DemandCode.BRoutine && entry == DemandState.BRoutineOpen) ||
    (dv == DemandCode.BUrgent && entry == DemandState.BUrgentOpen)

  @strictpure def dispositionOf(dv: DemandCode.Type, du: DemandUpdate.Type): DemandDisposition.Type = {
    if (dv == DemandCode.NONE) DemandDisposition.NoRequest
    else if (dv == DemandCode.INVALID) DemandDisposition.REJECTED
    else if (du == DemandUpdate.ACCEPTED) DemandDisposition.ACCEPTED
    else if (du == DemandUpdate.DUPLICATE) DemandDisposition.RetainedDuplicate
    else DemandDisposition.DEFERRED
  }

  @strictpure def updateOf16(dv: DemandCode.Type, entry: DemandState.Type): DemandUpdate.Type = {
    if (dv == DemandCode.NONE || dv == DemandCode.INVALID) DemandUpdate.NoChange
    else if (isMatchingDuplicate(dv, entry)) DemandUpdate.DUPLICATE
    else DemandUpdate.BUSY
  }

  def initialise(api: DemandRegistry_Initialization_Api): Unit = {
    Contract(
      Modifies(api, demandPhaseMemory),
      Ensures(
        // INITIAL_DEMAND_STATE
        demandPhaseMemory == DemandState.IDLE,
        api.prior_demand_state == DemandState.IDLE,
        api.current_state_to_urgent == DemandStateView.IDLE,
        api.current_state_to_routine == DemandStateView.IDLE,
        api.demand_transition.demandPhase == DemandStateCode.IDLE,
        api.demand_transition.demandUpdate == DemandUpdate.NoChange,
        api.demand_transition.demandDisposition == DemandDisposition.NoRequest
      )
    )
    // example api usage

    demandPhaseMemory = Factory_Material_Continuity_Coordinator.DemandState.IDLE
    api.put_prior_demand_state(Factory_Material_Continuity_Coordinator.DemandState.IDLE)
    api.put_current_state_to_urgent(Factory_Material_Continuity_Coordinator.DemandStateView.IDLE)
    api.put_current_state_to_routine(Factory_Material_Continuity_Coordinator.DemandStateView.IDLE)
    api.put_demand_transition(
      Factory_Material_Continuity_Coordinator.DemandTransition(
        demandPhase = Factory_Material_Continuity_Coordinator.DemandStateCode.IDLE,
        demandUpdate = Factory_Material_Continuity_Coordinator.DemandUpdate.NoChange,
        demandDisposition = Factory_Material_Continuity_Coordinator.DemandDisposition.NoRequest))
  }

  def timeTriggered(api: DemandRegistry_Operational_Api): Unit = {
    Contract(
      Modifies(api, demandPhaseMemory),
      Ensures(
        // DEMAND_PRIOR_AND_CURRENT_VIEWS
        api.prior_demand_state == In(demandPhaseMemory),
        api.current_state_to_urgent == api.current_state_to_routine,
        api.current_state_to_urgent == stateViewOf(demandPhaseMemory),
        api.demand_transition.demandPhase == stateCodeOf(demandPhaseMemory),

        // CURRENT_DEMAND_DISPOSITION
        api.demand_transition.demandDisposition ==
          dispositionOf(api.demand_facts.demandValue, api.demand_transition.demandUpdate),

        // CASE_13_CLOSED_GATE_FREEZE
        (api.recovery_gate == RecoveryGate.CLOSED) ___>: (
          demandPhaseMemory == In(demandPhaseMemory) &&
          api.demand_transition.demandUpdate == DemandUpdate.NoChange),

        // CASE_14_HANDOFF_CLEAR
        (api.recovery_gate == RecoveryGate.OPEN && api.qualified_event == QualifiedEvent.HandoffConfirmed) ___>: (
          demandPhaseMemory == DemandState.IDLE &&
          api.demand_transition.demandUpdate == DemandUpdate.CLEARED),

        // CASE_15_ACCEPT_IDLE_DEMAND
        (api.recovery_gate == RecoveryGate.OPEN && api.qualified_event != QualifiedEvent.HandoffConfirmed &&
         In(demandPhaseMemory) == DemandState.IDLE && isValid(api.demand_facts.demandValue)) ___>: (
          api.demand_transition.demandUpdate == DemandUpdate.ACCEPTED &&
          demandPhaseMemory == openStateOf(api.demand_facts.demandValue)),

        // CASE_16_RETAIN_OR_CLASSIFY_BUSY
        (api.recovery_gate == RecoveryGate.OPEN && api.qualified_event != QualifiedEvent.HandoffConfirmed &&
         !(In(demandPhaseMemory) == DemandState.IDLE && isValid(api.demand_facts.demandValue))) ___>: (
          demandPhaseMemory == In(demandPhaseMemory) &&
          api.demand_transition.demandUpdate == updateOf16(api.demand_facts.demandValue, In(demandPhaseMemory)))
      )
    )
    // example api usage

    val df: Factory_Material_Continuity_Coordinator.DemandFacts = api.get_demand_facts().get
    val qe: Factory_Material_Continuity_Coordinator.QualifiedEvent.Type = api.get_qualified_event().get
    val rg: Factory_Material_Continuity_Coordinator.RecoveryGate.Type = api.get_recovery_gate().get

    val entry: Factory_Material_Continuity_Coordinator.DemandState.Type = demandPhaseMemory

    var newState: Factory_Material_Continuity_Coordinator.DemandState.Type = entry
    var update: Factory_Material_Continuity_Coordinator.DemandUpdate.Type = Factory_Material_Continuity_Coordinator.DemandUpdate.NoChange

    if (rg == Factory_Material_Continuity_Coordinator.RecoveryGate.CLOSED) {
      // CASE_13_CLOSED_GATE_FREEZE
      newState = entry
      update = Factory_Material_Continuity_Coordinator.DemandUpdate.NoChange
    } else if (qe == Factory_Material_Continuity_Coordinator.QualifiedEvent.HandoffConfirmed) {
      // CASE_14_HANDOFF_CLEAR
      newState = Factory_Material_Continuity_Coordinator.DemandState.IDLE
      update = Factory_Material_Continuity_Coordinator.DemandUpdate.CLEARED
    } else if (entry == Factory_Material_Continuity_Coordinator.DemandState.IDLE && isValid(df.demandValue)) {
      // CASE_15_ACCEPT_IDLE_DEMAND
      newState = openStateOf(df.demandValue)
      update = Factory_Material_Continuity_Coordinator.DemandUpdate.ACCEPTED
    } else {
      // CASE_16_RETAIN_OR_CLASSIFY_BUSY
      newState = entry
      update = updateOf16(df.demandValue, entry)
    }

    val disposition = dispositionOf(df.demandValue, update)

    demandPhaseMemory = newState
    api.put_prior_demand_state(entry)
    api.put_current_state_to_urgent(stateViewOf(newState))
    api.put_current_state_to_routine(stateViewOf(newState))
    api.put_demand_transition(
      Factory_Material_Continuity_Coordinator.DemandTransition(
        demandPhase = stateCodeOf(newState),
        demandUpdate = update,
        demandDisposition = disposition))
  }

  def finalise(api: DemandRegistry_Operational_Api): Unit = { }
}
