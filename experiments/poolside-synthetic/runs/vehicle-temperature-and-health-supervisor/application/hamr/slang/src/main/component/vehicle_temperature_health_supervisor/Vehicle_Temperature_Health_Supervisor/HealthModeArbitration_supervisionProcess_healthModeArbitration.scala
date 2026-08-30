// #Sireum

package vehicle_temperature_health_supervisor.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import vehicle_temperature_health_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HealthModeArbitration_supervisionProcess_healthModeArbitration {

  def initialise(api: HealthModeArbitration_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_healthDecision(Vehicle_Temperature_Health_Supervisor.HealthDecision.example())
  }

  def timeTriggered(api: HealthModeArbitration_Operational_Api): Unit = {
    // example api usage

    val apiUsage_temperatureAssessment: Option[Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type] = api.get_temperatureAssessment()
    api.logInfo(s"Received on data port temperatureAssessment: ${apiUsage_temperatureAssessment}")
    val apiUsage_maintenanceAssessment: Option[Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type] = api.get_maintenanceAssessment()
    api.logInfo(s"Received on data port maintenanceAssessment: ${apiUsage_maintenanceAssessment}")
    val apiUsage_recoveryProposal: Option[Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type] = api.get_recoveryProposal()
    api.logInfo(s"Received on data port recoveryProposal: ${apiUsage_recoveryProposal}")
  }

  def finalise(api: HealthModeArbitration_Operational_Api): Unit = { }
}
