// #Sireum

package scp_candidate.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation {

  // BEGIN FUNCTIONS
  @strictpure def acceptedProducerPair(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Base_Types.Boolean = decision.nextMode == VehicleHealthMode.Unavailable &&
    decision.reason == DecisionReason.InvalidEvidence ||
    decision.nextMode == VehicleHealthMode.MaintenanceHold &&
      decision.reason == DecisionReason.MaintenanceActive &&
      (proposal == RecoveryProposal.NotRequested ||
        proposal == RecoveryProposal.BlockedByMaintenance) ||
    decision.nextMode == VehicleHealthMode.TemperatureDegraded &&
      decision.reason == DecisionReason.TemperatureActive &&
      (proposal == RecoveryProposal.NotRequested ||
        proposal == RecoveryProposal.BlockedByTemperature) ||
    decision.nextMode == VehicleHealthMode.Operational &&
      decision.reason == DecisionReason.NormalRetained &&
      proposal == RecoveryProposal.NotRequested ||
    decision.nextMode == VehicleHealthMode.Operational &&
      decision.reason == DecisionReason.RecoveryNotRequired &&
      proposal == RecoveryProposal.EligibleRecovery ||
    decision.nextMode == VehicleHealthMode.Operational &&
      decision.reason == DecisionReason.RecoveryAccepted &&
      proposal == RecoveryProposal.EligibleRecovery ||
    decision.nextMode != VehicleHealthMode.Operational &&
      decision.reason == DecisionReason.FreshRecoveryRequired &&
      proposal == RecoveryProposal.NotRequested

  @strictpure def selectedMode(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type = if (acceptedProducerPair(decision, proposal)) decision.nextMode else VehicleHealthMode.Unavailable

  @strictpure def selectedPower(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type = if (acceptedProducerPair(decision, proposal) &&
        decision.nextMode == VehicleHealthMode.Operational) ElectricalPowerDisposition.Enable else ElectricalPowerDisposition.Withhold

  @strictpure def selectedGuidance(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type = if (!(acceptedProducerPair(decision, proposal))) RecoveryGuidance.RepairInputEvidence else if (decision.reason == DecisionReason.InvalidEvidence) RecoveryGuidance.RepairInputEvidence else if (decision.reason == DecisionReason.MaintenanceActive ||
          decision.reason == DecisionReason.TemperatureActive) RecoveryGuidance.ClearActiveCondition else if (decision.reason == DecisionReason.FreshRecoveryRequired) RecoveryGuidance.SubmitFreshReturnRequest else RecoveryGuidance.None
  // END FUNCTIONS

  def initialise(api: BoundaryOutcomeDerivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_BOUNDARY_HOLD
        api.vehicleHealthMode == VehicleHealthMode.Unavailable &&
          api.powerDisposition == ElectricalPowerDisposition.Withhold &&
          api.recoveryGuidance == RecoveryGuidance.SubmitFreshReturnRequest
        // END INITIALIZES ENSURES
      )
    )
    api.put_vehicleHealthMode(VehicleHealthMode.Unavailable)
    api.put_powerDisposition(ElectricalPowerDisposition.Withhold)
    api.put_recoveryGuidance(RecoveryGuidance.SubmitFreshReturnRequest)
  }

  def timeTriggered(api: BoundaryOutcomeDerivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.vehicleHealthMode == selectedMode(api.healthDecision, api.recoveryProposal) &&
          api.powerDisposition == selectedPower(api.healthDecision, api.recoveryProposal) &&
          api.recoveryGuidance == selectedGuidance(api.healthDecision, api.recoveryProposal)
      )
    )
    val decision = api.get_healthDecision().get
    val proposal = api.get_recoveryProposal().get
    api.put_vehicleHealthMode(selectedMode(decision, proposal))
    api.put_powerDisposition(selectedPower(decision, proposal))
    api.put_recoveryGuidance(selectedGuidance(decision, proposal))
  }

  def finalise(api: BoundaryOutcomeDerivation_Operational_Api): Unit = { }
}
