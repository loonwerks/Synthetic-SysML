// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ResultComposition_material_continuity_process_result_composition {

  @strictpure def supplyCodeOf(s: SupplyState.Type): SupplyStateCode.Type = s match {
    case SupplyState.CLEAR => SupplyStateCode.CLEAR
    case SupplyState.ORDERED => SupplyStateCode.ORDERED
  }

  @strictpure def recoveryCodeOf(r: RecoveryState.Type): RecoveryStateCode.Type = r match {
    case RecoveryState.HEALTHY => RecoveryStateCode.HEALTHY
    case RecoveryState.LATCHED => RecoveryStateCode.LATCHED
    case RecoveryState.RECOVERING => RecoveryStateCode.RECOVERING
  }

  @strictpure def modeOf(r: RecoveryState.Type, a: MaterialAction.Type): CoordinationMode.Type = {
    if (r != RecoveryState.HEALTHY) CoordinationMode.FAULT
    else if (a == MaterialAction.IssueMaterialOrder) CoordinationMode.ORDERING
    else if (a == MaterialAction.ReleaseUrgentMaterial || a == MaterialAction.ReleaseRoutineMaterial) CoordinationMode.RELEASING
    else CoordinationMode.HOLDING
  }

  def initialise(api: ResultComposition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_PUBLIC_RESULT_SAFE
        api.material_coordination_result.actionValue == MaterialAction.HOLD,
        api.material_coordination_result.cause == DecisionCause.NoEligibleWork,
        api.material_coordination_result.mode == CoordinationMode.HOLDING,
        api.material_coordination_result.demandPhase == DemandStateCode.IDLE,
        api.material_coordination_result.supplyPhase == SupplyStateCode.CLEAR,
        api.material_coordination_result.recoveryPhase == RecoveryStateCode.HEALTHY,
        api.material_coordination_result.demandDisposition == DemandDisposition.NoRequest
      )
    )
    // example api usage

    api.put_material_coordination_result(
      Factory_Material_Continuity_Coordinator.MaterialCoordinationResult(
        actionValue = Factory_Material_Continuity_Coordinator.MaterialAction.HOLD,
        cause = Factory_Material_Continuity_Coordinator.DecisionCause.NoEligibleWork,
        mode = Factory_Material_Continuity_Coordinator.CoordinationMode.HOLDING,
        demandPhase = Factory_Material_Continuity_Coordinator.DemandStateCode.IDLE,
        supplyPhase = Factory_Material_Continuity_Coordinator.SupplyStateCode.CLEAR,
        recoveryPhase = Factory_Material_Continuity_Coordinator.RecoveryStateCode.HEALTHY,
        demandDisposition = Factory_Material_Continuity_Coordinator.DemandDisposition.NoRequest))
  }

  def timeTriggered(api: ResultComposition_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // ATOMIC_RECEIVED_RESULT_COMPOSITION
        api.material_coordination_result.actionValue == api.decision.actionValue,
        api.material_coordination_result.cause == api.decision.cause,
        api.material_coordination_result.demandPhase == api.demand_transition.demandPhase,
        api.material_coordination_result.supplyPhase == supplyCodeOf(api.supply_state),
        api.material_coordination_result.recoveryPhase == recoveryCodeOf(api.recovery_state),
        api.material_coordination_result.demandDisposition == api.demand_transition.demandDisposition,
        api.material_coordination_result.mode == modeOf(api.recovery_state, api.decision.actionValue)
      )
    )
    // example api usage

    val decision = api.get_decision().get
    val dt = api.get_demand_transition().get
    val ss = api.get_supply_state().get
    val rs = api.get_recovery_state().get

    api.put_material_coordination_result(
      Factory_Material_Continuity_Coordinator.MaterialCoordinationResult(
        actionValue = decision.actionValue,
        cause = decision.cause,
        mode = modeOf(rs, decision.actionValue),
        demandPhase = dt.demandPhase,
        supplyPhase = supplyCodeOf(ss),
        recoveryPhase = recoveryCodeOf(rs),
        demandDisposition = dt.demandDisposition))
  }

  def finalise(api: ResultComposition_Operational_Api): Unit = { }
}
