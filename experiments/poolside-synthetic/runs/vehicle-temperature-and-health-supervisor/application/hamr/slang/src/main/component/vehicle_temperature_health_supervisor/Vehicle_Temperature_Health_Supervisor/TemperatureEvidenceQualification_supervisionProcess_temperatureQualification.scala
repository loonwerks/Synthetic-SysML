// #Sireum

package vehicle_temperature_health_supervisor.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import vehicle_temperature_health_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TemperatureEvidenceQualification_supervisionProcess_temperatureQualification {

  def initialise(api: TemperatureEvidenceQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_assessmentForRecovery(Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.InvalidTemperature)
    api.put_assessmentForArbitration(Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.InvalidTemperature)
  }

  def timeTriggered(api: TemperatureEvidenceQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_rawTemperature: Option[Vehicle_Temperature_Health_Supervisor.TemperatureSample] = api.get_rawTemperature()
    api.logInfo(s"Received on data port rawTemperature: ${apiUsage_rawTemperature}")
  }

  def finalise(api: TemperatureEvidenceQualification_Operational_Api): Unit = { }
}
