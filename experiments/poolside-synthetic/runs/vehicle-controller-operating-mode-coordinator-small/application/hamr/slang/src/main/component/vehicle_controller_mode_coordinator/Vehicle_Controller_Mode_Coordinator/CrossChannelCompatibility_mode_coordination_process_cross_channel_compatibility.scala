// #Sireum

package vehicle_controller_mode_coordinator.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import vehicle_controller_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility {

  def initialise(api: CrossChannelCompatibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_coordination_class(Vehicle_Controller_Mode_Coordinator.CoordinationClass.InvalidEvidence)
  }

  def timeTriggered(api: CrossChannelCompatibility_Operational_Api): Unit = {
    // example api usage

    val apiUsage_lifecycle_assessment: Option[Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type] = api.get_lifecycle_assessment()
    api.logInfo(s"Received on data port lifecycle_assessment: ${apiUsage_lifecycle_assessment}")
    val apiUsage_condition_assessment: Option[Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type] = api.get_condition_assessment()
    api.logInfo(s"Received on data port condition_assessment: ${apiUsage_condition_assessment}")
  }

  def finalise(api: CrossChannelCompatibility_Operational_Api): Unit = { }
}
