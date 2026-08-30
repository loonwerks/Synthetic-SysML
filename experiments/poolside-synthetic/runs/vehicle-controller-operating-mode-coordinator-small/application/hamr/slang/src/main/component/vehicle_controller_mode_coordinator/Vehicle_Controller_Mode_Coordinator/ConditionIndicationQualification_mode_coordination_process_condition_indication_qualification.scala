// #Sireum

package vehicle_controller_mode_coordinator.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import vehicle_controller_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification {

  def initialise(api: ConditionIndicationQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_assessment_to_compatibility(Vehicle_Controller_Mode_Coordinator.ConditionAssessment.InvalidCondition)
    api.put_assessment_to_arbiter(Vehicle_Controller_Mode_Coordinator.ConditionAssessment.InvalidCondition)
  }

  def timeTriggered(api: ConditionIndicationQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_condition_sample: Option[Vehicle_Controller_Mode_Coordinator.ConditionSample] = api.get_condition_sample()
    api.logInfo(s"Received on data port condition_sample: ${apiUsage_condition_sample}")
  }

  def finalise(api: ConditionIndicationQualification_Operational_Api): Unit = { }
}
