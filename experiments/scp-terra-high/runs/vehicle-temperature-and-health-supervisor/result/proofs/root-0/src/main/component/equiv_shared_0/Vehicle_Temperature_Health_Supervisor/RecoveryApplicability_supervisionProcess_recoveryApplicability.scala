// #Sireum

package equiv_shared_0.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import equiv_shared_0._

object RecoveryApplicability_supervisionProcess_recoveryApplicability {
  // BEGIN FUNCTIONS
  @strictpure def classifyRecovery(sample: Vehicle_Temperature_Health_Supervisor.ReturnSample, temperature: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type, maintenance: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type): Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type = if (sample.status == InputStatus.Invalid |
        temperature == TemperatureAssessment.InvalidTemperature |
        maintenance == MaintenanceAssessment.InvalidMaintenance) RecoveryProposal.InvalidRecoveryEvidence else if (sample.indication == ReturnIndication.NoRequest) RecoveryProposal.NotRequested else if (maintenance == MaintenanceAssessment.MaintenanceDue) RecoveryProposal.BlockedByMaintenance else if (temperature == TemperatureAssessment.OverTemperature) RecoveryProposal.BlockedByTemperature else RecoveryProposal.EligibleRecovery
  // END FUNCTIONS
}
