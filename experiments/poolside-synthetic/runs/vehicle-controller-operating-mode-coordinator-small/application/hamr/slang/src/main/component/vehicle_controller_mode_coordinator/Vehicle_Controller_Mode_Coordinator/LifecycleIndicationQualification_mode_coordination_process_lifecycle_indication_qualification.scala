// #Sireum

package vehicle_controller_mode_coordinator.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import vehicle_controller_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleIndicationQualification_mode_coordination_process_lifecycle_indication_qualification {

  def initialise(api: LifecycleIndicationQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_assessment_to_compatibility(Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.InvalidLifecycle)
    api.put_assessment_to_arbiter(Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.InvalidLifecycle)
  }

  def timeTriggered(api: LifecycleIndicationQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_lifecycle_sample: Option[Vehicle_Controller_Mode_Coordinator.LifecycleSample] = api.get_lifecycle_sample()
    api.logInfo(s"Received on data port lifecycle_sample: ${apiUsage_lifecycle_sample}")
  }

  def finalise(api: LifecycleIndicationQualification_Operational_Api): Unit = { }
}
