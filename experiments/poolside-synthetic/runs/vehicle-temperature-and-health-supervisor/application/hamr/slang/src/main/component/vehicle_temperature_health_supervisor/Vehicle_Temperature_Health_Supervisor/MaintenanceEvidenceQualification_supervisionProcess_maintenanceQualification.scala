// #Sireum

package vehicle_temperature_health_supervisor.Vehicle_Temperature_Health_Supervisor

import org.sireum._
import vehicle_temperature_health_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification {

  def initialise(api: MaintenanceEvidenceQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_assessmentForRecovery(Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.InvalidMaintenance)
    api.put_assessmentForArbitration(Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.InvalidMaintenance)
  }

  def timeTriggered(api: MaintenanceEvidenceQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_rawMaintenance: Option[Vehicle_Temperature_Health_Supervisor.MaintenanceSample] = api.get_rawMaintenance()
    api.logInfo(s"Received on data port rawMaintenance: ${apiUsage_rawMaintenance}")
  }

  def finalise(api: MaintenanceEvidenceQualification_Operational_Api): Unit = { }
}
