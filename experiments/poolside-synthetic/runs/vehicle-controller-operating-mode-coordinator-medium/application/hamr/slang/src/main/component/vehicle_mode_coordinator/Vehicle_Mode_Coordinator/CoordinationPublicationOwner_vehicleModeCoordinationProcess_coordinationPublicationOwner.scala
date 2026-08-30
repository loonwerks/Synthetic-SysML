// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner {

  def initialise(api: CoordinationPublicationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_coordinationOutcome(Vehicle_Mode_Coordinator.CoordinationOutcome.example())
  }

  def timeTriggered(api: CoordinationPublicationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_arbitrationResult: Option[Vehicle_Mode_Coordinator.ArbitrationResult] = api.get_arbitrationResult()
    api.logInfo(s"Received on data port arbitrationResult: ${apiUsage_arbitrationResult}")
    val apiUsage_appliedResolution: Option[Vehicle_Mode_Coordinator.TransitionResolution] = api.get_appliedResolution()
    api.logInfo(s"Received on data port appliedResolution: ${apiUsage_appliedResolution}")
  }

  def finalise(api: CoordinationPublicationOwner_Operational_Api): Unit = { }
}
