// #Sireum

package scp_candidate.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryApplicability_supervisionProcess_recoveryApplicability {

  // BEGIN FUNCTIONS
  @strictpure def classifyRecovery(sample: Vehicle_Temperature_Health_Supervisor.ReturnSample, temperature: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type, maintenance: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type): Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type = if (sample.status == InputStatus.Invalid ||
        temperature == TemperatureAssessment.InvalidTemperature ||
        maintenance == MaintenanceAssessment.InvalidMaintenance) RecoveryProposal.InvalidRecoveryEvidence else if (sample.indication == ReturnIndication.NoRequest) RecoveryProposal.NotRequested else if (maintenance == MaintenanceAssessment.MaintenanceDue) RecoveryProposal.BlockedByMaintenance else if (temperature == TemperatureAssessment.OverTemperature) RecoveryProposal.BlockedByTemperature else RecoveryProposal.EligibleRecovery
  // END FUNCTIONS

  def initialise(api: RecoveryApplicability_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RECOVERY_UNTRUSTED
        api.proposalForArbitration == RecoveryProposal.InvalidRecoveryEvidence &&
          api.proposalForOutcomes == RecoveryProposal.InvalidRecoveryEvidence
        // END INITIALIZES ENSURES
      )
    )
    api.put_proposalForArbitration(RecoveryProposal.InvalidRecoveryEvidence)
    api.put_proposalForOutcomes(RecoveryProposal.InvalidRecoveryEvidence)
  }

  def timeTriggered(api: RecoveryApplicability_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.proposalForArbitration == classifyRecovery(api.rawReturn, api.temperatureAssessment, api.maintenanceAssessment) &&
          api.proposalForOutcomes == classifyRecovery(api.rawReturn, api.temperatureAssessment, api.maintenanceAssessment)
      )
    )
    val rawReturn = api.get_rawReturn().get
    val temperature = api.get_temperatureAssessment().get
    val maintenance = api.get_maintenanceAssessment().get
    val proposal = classifyRecovery(rawReturn, temperature, maintenance)
    api.put_proposalForArbitration(proposal)
    api.put_proposalForOutcomes(proposal)
  }

  def finalise(api: RecoveryApplicability_Operational_Api): Unit = { }
}
