// #Sireum

package equiv_shared_0.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import equiv_shared_0._

object BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation {
  // BEGIN FUNCTIONS
  @strictpure def acceptedProducerPair(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Base_Types.Boolean = decision.nextMode == VehicleHealthMode.Unavailable &
    decision.reason == DecisionReason.InvalidEvidence |
    decision.nextMode == VehicleHealthMode.MaintenanceHold &
      decision.reason == DecisionReason.MaintenanceActive &
      (proposal == RecoveryProposal.NotRequested |
        proposal == RecoveryProposal.BlockedByMaintenance) |
    decision.nextMode == VehicleHealthMode.TemperatureDegraded &
      decision.reason == DecisionReason.TemperatureActive &
      (proposal == RecoveryProposal.NotRequested |
        proposal == RecoveryProposal.BlockedByTemperature) |
    decision.nextMode == VehicleHealthMode.Operational &
      decision.reason == DecisionReason.NormalRetained &
      proposal == RecoveryProposal.NotRequested |
    decision.nextMode == VehicleHealthMode.Operational &
      decision.reason == DecisionReason.RecoveryNotRequired &
      proposal == RecoveryProposal.EligibleRecovery |
    decision.nextMode == VehicleHealthMode.Operational &
      decision.reason == DecisionReason.RecoveryAccepted &
      proposal == RecoveryProposal.EligibleRecovery |
    decision.nextMode != VehicleHealthMode.Operational &
      decision.reason == DecisionReason.FreshRecoveryRequired &
      proposal == RecoveryProposal.NotRequested

  @strictpure def selectedMode(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type = if (acceptedProducerPair(decision, proposal)) decision.nextMode else VehicleHealthMode.Unavailable

  @strictpure def selectedPower(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type = if (acceptedProducerPair(decision, proposal) &
        decision.nextMode == VehicleHealthMode.Operational) ElectricalPowerDisposition.Enable else ElectricalPowerDisposition.Withhold

  @strictpure def selectedGuidance(decision: Vehicle_Temperature_Health_Supervisor.HealthDecision, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type = if (!(acceptedProducerPair(decision, proposal))) RecoveryGuidance.RepairInputEvidence else if (decision.reason == DecisionReason.InvalidEvidence) RecoveryGuidance.RepairInputEvidence else if (decision.reason == DecisionReason.MaintenanceActive |
          decision.reason == DecisionReason.TemperatureActive) RecoveryGuidance.ClearActiveCondition else if (decision.reason == DecisionReason.FreshRecoveryRequired) RecoveryGuidance.SubmitFreshReturnRequest else RecoveryGuidance.None
  // END FUNCTIONS
}
