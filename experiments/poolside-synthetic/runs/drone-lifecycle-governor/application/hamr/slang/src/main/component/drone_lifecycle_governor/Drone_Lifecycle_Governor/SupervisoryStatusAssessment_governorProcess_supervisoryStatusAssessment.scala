// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment {

  def initialise(api: SupervisoryStatusAssessment_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotStatus(Drone_Lifecycle_Governor.PilotStatus.example())
  }

  def timeTriggered(api: SupervisoryStatusAssessment_Operational_Api): Unit = {
    // example api usage

    val apiUsage_decisionSnapshot: Option[Drone_Lifecycle_Governor.DecisionSnapshot] = api.get_decisionSnapshot()
    api.logInfo(s"Received on data port decisionSnapshot: ${apiUsage_decisionSnapshot}")
    val apiUsage_batteryQualification: Option[Drone_Lifecycle_Governor.BatteryQualification.Type] = api.get_batteryQualification()
    api.logInfo(s"Received on data port batteryQualification: ${apiUsage_batteryQualification}")
  }

  def finalise(api: SupervisoryStatusAssessment_Operational_Api): Unit = { }
}
