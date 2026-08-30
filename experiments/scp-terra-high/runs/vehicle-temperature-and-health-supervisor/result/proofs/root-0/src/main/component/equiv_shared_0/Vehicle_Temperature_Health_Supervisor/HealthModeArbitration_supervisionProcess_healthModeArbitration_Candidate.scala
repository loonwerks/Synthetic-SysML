// #Sireum

package equiv_shared_0.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import equiv_shared_0._

object HealthModeArbitration_supervisionProcess_healthModeArbitration_Candidate {
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
}
