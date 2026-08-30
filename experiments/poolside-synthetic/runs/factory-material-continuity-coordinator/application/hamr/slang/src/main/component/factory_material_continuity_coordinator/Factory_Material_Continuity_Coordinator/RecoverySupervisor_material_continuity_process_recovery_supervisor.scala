// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RecoverySupervisor_material_continuity_process_recovery_supervisor {

  var recoveryPhaseMemory: Factory_Material_Continuity_Coordinator.RecoveryState.Type =
    Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY

  @strictpure def gateOf(r: RecoveryState.Type): RecoveryGate.Type =
    if (r == RecoveryState.HEALTHY) RecoveryGate.OPEN
    else RecoveryGate.CLOSED

  @strictpure def emergencyStateOf(r: RecoveryState.Type): EmergencyState.Type =
    if (r == RecoveryState.HEALTHY) EmergencyState.INACTIVE
    else EmergencyState.ACTIVE

  def initialise(api: RecoverySupervisor_Initialization_Api): Unit = {
    Contract(
      Modifies(api, recoveryPhaseMemory),
      Ensures(
        // INITIAL_RECOVERY_HEALTHY
        recoveryPhaseMemory == RecoveryState.HEALTHY,
        api.gate_to_demand == RecoveryGate.OPEN,
        api.gate_to_supply == RecoveryGate.OPEN,
        api.gate_to_urgent == RecoveryGate.OPEN,
        api.gate_to_routine == RecoveryGate.OPEN,
        api.gate_to_replenishment == RecoveryGate.OPEN,
        api.emergency_state == EmergencyState.INACTIVE,
        api.recovery_state == RecoveryState.HEALTHY
      )
    )
    // example api usage

    recoveryPhaseMemory = Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY
    api.put_gate_to_demand(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_supply(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_urgent(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_routine(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_gate_to_replenishment(Factory_Material_Continuity_Coordinator.RecoveryGate.OPEN)
    api.put_emergency_state(Factory_Material_Continuity_Coordinator.EmergencyState.INACTIVE)
    api.put_recovery_state(Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY)
  }

  def timeTriggered(api: RecoverySupervisor_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryPhaseMemory),
      Ensures(
        // RECOVERY_DERIVED_OUTPUTS
        api.recovery_state == recoveryPhaseMemory,
        api.gate_to_demand == gateOf(recoveryPhaseMemory),
        api.gate_to_supply == gateOf(recoveryPhaseMemory),
        api.gate_to_urgent == gateOf(recoveryPhaseMemory),
        api.gate_to_routine == gateOf(recoveryPhaseMemory),
        api.gate_to_replenishment == gateOf(recoveryPhaseMemory),
        api.emergency_state == emergencyStateOf(recoveryPhaseMemory),

        // CASE_07_FAULT_DOMINATES
        (api.fault_trigger == FaultTrigger.ACTIVE) ___>: (
          recoveryPhaseMemory == RecoveryState.LATCHED),

        // CASE_08_HEALTHY_STUTTER
        (api.fault_trigger == FaultTrigger.INACTIVE && In(recoveryPhaseMemory) == RecoveryState.HEALTHY) ___>: (
          recoveryPhaseMemory == RecoveryState.HEALTHY),

        // CASE_09_RESET_TO_RECOVERING
        (api.fault_trigger == FaultTrigger.INACTIVE && In(recoveryPhaseMemory) == RecoveryState.LATCHED &&
         api.recovery_event == RecoveryEvent.RESET) ___>: (
          recoveryPhaseMemory == RecoveryState.RECOVERING),

        // CASE_10_LATCHED_RETENTION
        (api.fault_trigger == FaultTrigger.INACTIVE && In(recoveryPhaseMemory) == RecoveryState.LATCHED &&
         api.recovery_event != RecoveryEvent.RESET) ___>: (
          recoveryPhaseMemory == RecoveryState.LATCHED),

        // CASE_11_VERIFICATION_RELEASE
        (api.fault_trigger == FaultTrigger.INACTIVE && In(recoveryPhaseMemory) == RecoveryState.RECOVERING &&
         api.recovery_event == RecoveryEvent.VerifyOk) ___>: (
          recoveryPhaseMemory == RecoveryState.HEALTHY),

        // CASE_12_RECOVERING_RETENTION
        (api.fault_trigger == FaultTrigger.INACTIVE && In(recoveryPhaseMemory) == RecoveryState.RECOVERING &&
         api.recovery_event != RecoveryEvent.VerifyOk) ___>: (
          recoveryPhaseMemory == RecoveryState.RECOVERING)
      )
    )
    // example api usage

    val ft: Factory_Material_Continuity_Coordinator.FaultTrigger.Type = api.get_fault_trigger().get
    val re: Factory_Material_Continuity_Coordinator.RecoveryEvent.Type = api.get_recovery_event().get

    val entry: Factory_Material_Continuity_Coordinator.RecoveryState.Type = recoveryPhaseMemory

    var newState: Factory_Material_Continuity_Coordinator.RecoveryState.Type = entry

    if (ft == Factory_Material_Continuity_Coordinator.FaultTrigger.ACTIVE) {
      // CASE_07_FAULT_DOMINATES
      newState = Factory_Material_Continuity_Coordinator.RecoveryState.LATCHED
    } else if (entry == Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY) {
      // CASE_08_HEALTHY_STUTTER
      newState = Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY
    } else if (entry == Factory_Material_Continuity_Coordinator.RecoveryState.LATCHED &&
               re == Factory_Material_Continuity_Coordinator.RecoveryEvent.RESET) {
      // CASE_09_RESET_TO_RECOVERING
      newState = Factory_Material_Continuity_Coordinator.RecoveryState.RECOVERING
    } else if (entry == Factory_Material_Continuity_Coordinator.RecoveryState.LATCHED &&
               re != Factory_Material_Continuity_Coordinator.RecoveryEvent.RESET) {
      // CASE_10_LATCHED_RETENTION
      newState = Factory_Material_Continuity_Coordinator.RecoveryState.LATCHED
    } else if (entry == Factory_Material_Continuity_Coordinator.RecoveryState.RECOVERING &&
               re == Factory_Material_Continuity_Coordinator.RecoveryEvent.VerifyOk) {
      // CASE_11_VERIFICATION_RELEASE
      newState = Factory_Material_Continuity_Coordinator.RecoveryState.HEALTHY
    } else {
      // CASE_12_RECOVERING_RETENTION
      newState = Factory_Material_Continuity_Coordinator.RecoveryState.RECOVERING
    }

    recoveryPhaseMemory = newState
    val gate = gateOf(newState)
    val est = emergencyStateOf(newState)

    api.put_gate_to_demand(gate)
    api.put_gate_to_supply(gate)
    api.put_gate_to_urgent(gate)
    api.put_gate_to_routine(gate)
    api.put_gate_to_replenishment(gate)
    api.put_emergency_state(est)
    api.put_recovery_state(newState)
  }

  def finalise(api: RecoverySupervisor_Operational_Api): Unit = { }
}
