// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner {

  def initialise(api: TransitionQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedTransition(Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedStay)
  }

  def timeTriggered(api: TransitionQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_arbitrationResult: Option[Vehicle_Mode_Coordinator.ArbitrationResult] = api.get_arbitrationResult()
    api.logInfo(s"Received on data port arbitrationResult: ${apiUsage_arbitrationResult}")
    val apiUsage_currentMode: Option[Vehicle_Mode_Coordinator.ControllerMode.Type] = api.get_currentMode()
    api.logInfo(s"Received on data port currentMode: ${apiUsage_currentMode}")
  }

  def finalise(api: TransitionQualificationOwner_Operational_Api): Unit = { }
}
