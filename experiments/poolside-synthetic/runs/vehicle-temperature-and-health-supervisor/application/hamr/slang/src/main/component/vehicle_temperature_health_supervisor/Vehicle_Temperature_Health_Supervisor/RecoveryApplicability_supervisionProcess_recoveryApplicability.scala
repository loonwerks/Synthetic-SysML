// #Sireum

package vehicle_temperature_health_supervisor.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import vehicle_temperature_health_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryApplicability_supervisionProcess_recoveryApplicability {

  def initialise(api: RecoveryApplicability_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposalForArbitration(Vehicle_Temperature_Health_Supervisor.RecoveryProposal.InvalidRecoveryEvidence)
    api.put_proposalForOutcomes(Vehicle_Temperature_Health_Supervisor.RecoveryProposal.InvalidRecoveryEvidence)
  }

  def timeTriggered(api: RecoveryApplicability_Operational_Api): Unit = {
    // example api usage

    val apiUsage_rawReturn: Option[Vehicle_Temperature_Health_Supervisor.ReturnSample] = api.get_rawReturn()
    api.logInfo(s"Received on data port rawReturn: ${apiUsage_rawReturn}")
    val apiUsage_temperatureAssessment: Option[Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type] = api.get_temperatureAssessment()
    api.logInfo(s"Received on data port temperatureAssessment: ${apiUsage_temperatureAssessment}")
    val apiUsage_maintenanceAssessment: Option[Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type] = api.get_maintenanceAssessment()
    api.logInfo(s"Received on data port maintenanceAssessment: ${apiUsage_maintenanceAssessment}")
  }

  def finalise(api: RecoveryApplicability_Operational_Api): Unit = { }
}
