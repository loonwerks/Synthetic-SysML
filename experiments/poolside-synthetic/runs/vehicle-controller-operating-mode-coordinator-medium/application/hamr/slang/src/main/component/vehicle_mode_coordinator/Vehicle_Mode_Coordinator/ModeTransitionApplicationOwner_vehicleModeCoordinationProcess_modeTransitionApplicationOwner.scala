// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner {

  def initialise(api: ModeTransitionApplicationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_modeForQualification(Vehicle_Mode_Coordinator.ControllerMode.Off)
    api.put_modeForRecovery(Vehicle_Mode_Coordinator.ControllerMode.Off)
    api.put_resolutionForRecovery(Vehicle_Mode_Coordinator.TransitionResolution.example())
    api.put_resolutionForPublication(Vehicle_Mode_Coordinator.TransitionResolution.example())
    api.put_appliedNextMode(Vehicle_Mode_Coordinator.ControllerMode.Off)
  }

  def timeTriggered(api: ModeTransitionApplicationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_storedRecoveryTarget: Option[Vehicle_Mode_Coordinator.RecoveryTarget.Type] = api.get_storedRecoveryTarget()
    api.logInfo(s"Received on data port storedRecoveryTarget: ${apiUsage_storedRecoveryTarget}")
    val apiUsage_qualifiedTransition: Option[Vehicle_Mode_Coordinator.QualifiedTransition.Type] = api.get_qualifiedTransition()
    api.logInfo(s"Received on data port qualifiedTransition: ${apiUsage_qualifiedTransition}")
  }

  def finalise(api: ModeTransitionApplicationOwner_Operational_Api): Unit = { }
}
