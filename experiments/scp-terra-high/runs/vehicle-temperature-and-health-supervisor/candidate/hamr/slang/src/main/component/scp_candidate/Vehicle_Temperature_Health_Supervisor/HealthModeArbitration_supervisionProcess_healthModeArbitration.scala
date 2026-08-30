// #Sireum

package scp_candidate.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HealthModeArbitration_supervisionProcess_healthModeArbitration {

  // BEGIN STATE VARS
  var healthState: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type = Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Operational
  // END STATE VARS

  // BEGIN FUNCTIONS
  @strictpure def proposalConsistent(temperature: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type, maintenance: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type, proposal: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): Base_Types.Boolean = proposal == RecoveryProposal.InvalidRecoveryEvidence ||
    proposal == RecoveryProposal.NotRequested &&
      temperature != TemperatureAssessment.InvalidTemperature &&
      maintenance != MaintenanceAssessment.InvalidMaintenance ||
    proposal == RecoveryProposal.BlockedByMaintenance &&
      temperature != TemperatureAssessment.InvalidTemperature &&
      maintenance == MaintenanceAssessment.MaintenanceDue ||
    proposal == RecoveryProposal.BlockedByTemperature &&
      temperature == TemperatureAssessment.OverTemperature &&
      maintenance == MaintenanceAssessment.MaintenanceClear ||
    proposal == RecoveryProposal.EligibleRecovery &&
      temperature == TemperatureAssessment.NominalTemperature &&
      maintenance == MaintenanceAssessment.MaintenanceClear
  // END FUNCTIONS

  def initialise(api: HealthModeArbitration_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        healthState
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_OWNER_HOLD
        healthState == VehicleHealthMode.Unavailable &&
          api.healthDecision.nextMode == VehicleHealthMode.Unavailable &&
          api.healthDecision.reason == DecisionReason.InvalidEvidence
        // END INITIALIZES ENSURES
      )
    )
    healthState = VehicleHealthMode.Unavailable
    api.put_healthDecision(HealthDecision(VehicleHealthMode.Unavailable, DecisionReason.InvalidEvidence))
  }

  def timeTriggered(api: HealthModeArbitration_Operational_Api): Unit = {
    Contract(
      Modifies(healthState, api),
      Ensures(
        api.healthDecision.nextMode == healthState
      )
    )
    val temperature = api.get_temperatureAssessment().get
    val maintenance = api.get_maintenanceAssessment().get
    val proposal = api.get_recoveryProposal().get
    val oldState = healthState

    val reason: Vehicle_Temperature_Health_Supervisor.DecisionReason.Type =
      if (temperature == TemperatureAssessment.InvalidTemperature ||
        maintenance == MaintenanceAssessment.InvalidMaintenance ||
        proposal == RecoveryProposal.InvalidRecoveryEvidence ||
        !proposalConsistent(temperature, maintenance, proposal)) {
        healthState = VehicleHealthMode.Unavailable
        DecisionReason.InvalidEvidence
      } else if (maintenance == MaintenanceAssessment.MaintenanceDue) {
        healthState = VehicleHealthMode.MaintenanceHold
        DecisionReason.MaintenanceActive
      } else if (temperature == TemperatureAssessment.OverTemperature) {
        healthState = VehicleHealthMode.TemperatureDegraded
        DecisionReason.TemperatureActive
      } else if (proposal == RecoveryProposal.EligibleRecovery) {
        healthState = VehicleHealthMode.Operational
        if (oldState == VehicleHealthMode.Operational) DecisionReason.RecoveryNotRequired
        else DecisionReason.RecoveryAccepted
      } else {
        healthState = oldState
        if (oldState == VehicleHealthMode.Operational) DecisionReason.NormalRetained
        else DecisionReason.FreshRecoveryRequired
      }
    api.put_healthDecision(HealthDecision(healthState, reason))
  }

  def finalise(api: HealthModeArbitration_Operational_Api): Unit = { }
}
