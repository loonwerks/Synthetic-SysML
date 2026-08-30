// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SupplyLifecycle_material_continuity_process_supply_lifecycle {

  var supplyPhaseMemory: Factory_Material_Continuity_Coordinator.SupplyState.Type =
    Factory_Material_Continuity_Coordinator.SupplyState.CLEAR

  def initialise(api: SupplyLifecycle_Initialization_Api): Unit = {
    Contract(
      Modifies(api, supplyPhaseMemory),
      Ensures(
        // INITIAL_SUPPLY_STATE
        supplyPhaseMemory == SupplyState.CLEAR,
        api.prior_supply_state == SupplyState.CLEAR,
        api.current_state_to_replenishment == SupplyState.CLEAR,
        api.current_state_to_composition == SupplyState.CLEAR
      )
    )
    // example api usage

    supplyPhaseMemory = Factory_Material_Continuity_Coordinator.SupplyState.CLEAR
    api.put_prior_supply_state(Factory_Material_Continuity_Coordinator.SupplyState.CLEAR)
    api.put_current_state_to_replenishment(Factory_Material_Continuity_Coordinator.SupplyState.CLEAR)
    api.put_current_state_to_composition(Factory_Material_Continuity_Coordinator.SupplyState.CLEAR)
  }

  def timeTriggered(api: SupplyLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(api, supplyPhaseMemory),
      Ensures(
        // SUPPLY_PRIOR_AND_CURRENT_VIEWS
        api.prior_supply_state == In(supplyPhaseMemory),
        api.current_state_to_replenishment == supplyPhaseMemory,
        api.current_state_to_composition == supplyPhaseMemory,

        // CASE_17_SUPPLY_PROGRESS
        (api.recovery_gate == RecoveryGate.OPEN &&
         (api.qualified_event == QualifiedEvent.OrderRegistered || api.qualified_event == QualifiedEvent.ReceiptConfirmed)) ___>: (
          (api.qualified_event == QualifiedEvent.OrderRegistered && supplyPhaseMemory == SupplyState.ORDERED) ||
          (api.qualified_event == QualifiedEvent.ReceiptConfirmed && supplyPhaseMemory == SupplyState.CLEAR)),

        // CASE_18_SUPPLY_STUTTER
        (api.recovery_gate == RecoveryGate.CLOSED ||
         (api.qualified_event != QualifiedEvent.OrderRegistered && api.qualified_event != QualifiedEvent.ReceiptConfirmed)) ___>: (
          supplyPhaseMemory == In(supplyPhaseMemory))
      )
    )
    // example api usage

    val qe: Factory_Material_Continuity_Coordinator.QualifiedEvent.Type = api.get_qualified_event().get
    val rg: Factory_Material_Continuity_Coordinator.RecoveryGate.Type = api.get_recovery_gate().get

    val entry: Factory_Material_Continuity_Coordinator.SupplyState.Type = supplyPhaseMemory

    var newState: Factory_Material_Continuity_Coordinator.SupplyState.Type = entry

    if (rg == Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN &&
        (qe == Factory_Material_Continuity_Coordinator.QualifiedEvent.OrderRegistered ||
         qe == Factory_Material_Continuity_Coordinator.QualifiedEvent.ReceiptConfirmed)) {
      // CASE_17_SUPPLY_PROGRESS
      if (qe == Factory_Material_Continuity_Coordinator.QualifiedEvent.OrderRegistered) {
        newState = Factory_Material_Continuity_Coordinator.SupplyState.ORDERED
      } else {
        newState = Factory_Material_Continuity_Coordinator.SupplyState.CLEAR
      }
    } else {
      // CASE_18_SUPPLY_STUTTER
      newState = entry
    }

    supplyPhaseMemory = newState
    api.put_prior_supply_state(entry)
    api.put_current_state_to_replenishment(newState)
    api.put_current_state_to_composition(newState)
  }

  def finalise(api: SupplyLifecycle_Operational_Api): Unit = { }
}
