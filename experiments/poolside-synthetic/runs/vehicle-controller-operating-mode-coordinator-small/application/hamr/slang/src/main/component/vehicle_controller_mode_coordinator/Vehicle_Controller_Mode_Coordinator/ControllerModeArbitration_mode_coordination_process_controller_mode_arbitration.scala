// #Sireum

package vehicle_controller_mode_coordinator.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import vehicle_controller_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration {

  def initialise(api: ControllerModeArbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mode_decision(Vehicle_Controller_Mode_Coordinator.ModeDecision.example())
  }

  def timeTriggered(api: ControllerModeArbitration_Operational_Api): Unit = {
    // example api usage

    val apiUsage_lifecycle_assessment: Option[Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type] = api.get_lifecycle_assessment()
    api.logInfo(s"Received on data port lifecycle_assessment: ${apiUsage_lifecycle_assessment}")
    val apiUsage_condition_assessment: Option[Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type] = api.get_condition_assessment()
    api.logInfo(s"Received on data port condition_assessment: ${apiUsage_condition_assessment}")
    val apiUsage_coordination_class: Option[Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type] = api.get_coordination_class()
    api.logInfo(s"Received on data port coordination_class: ${apiUsage_coordination_class}")
  }

  def finalise(api: ControllerModeArbitration_Operational_Api): Unit = { }
}
