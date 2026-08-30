// #Sireum

package vehicle_controller_mode_coordinator.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import vehicle_controller_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation {

  def initialise(api: CoordinationFrameDerivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mode_disposition(Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off)
    api.put_coordination_result(Vehicle_Controller_Mode_Coordinator.CoordinationResult.Applied)
  }

  def timeTriggered(api: CoordinationFrameDerivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_mode_decision: Option[Vehicle_Controller_Mode_Coordinator.ModeDecision] = api.get_mode_decision()
    api.logInfo(s"Received on data port mode_decision: ${apiUsage_mode_decision}")
  }

  def finalise(api: CoordinationFrameDerivation_Operational_Api): Unit = { }
}
