// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner {

  def initialise(api: RecoveryTargetOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_storedRecoveryTarget(Vehicle_Mode_Coordinator.RecoveryTarget.Off)
  }

  def timeTriggered(api: RecoveryTargetOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_currentMode: Option[Vehicle_Mode_Coordinator.ControllerMode.Type] = api.get_currentMode()
    api.logInfo(s"Received on data port currentMode: ${apiUsage_currentMode}")
    val apiUsage_appliedResolution: Option[Vehicle_Mode_Coordinator.TransitionResolution] = api.get_appliedResolution()
    api.logInfo(s"Received on data port appliedResolution: ${apiUsage_appliedResolution}")
  }

  def finalise(api: RecoveryTargetOwner_Operational_Api): Unit = { }
}
