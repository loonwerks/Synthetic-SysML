// #Sireum

package scp_candidate.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification {

  def initialise(api: ConditionIndicationQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_assessment_to_compatibility(Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition)
    api.put_assessment_to_arbiter(Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition)
  }

  def timeTriggered(api: ConditionIndicationQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_condition_sample() match {
      case Some(sample) =>
        val assessment: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type =
          if (sample.status == Vehicle_Controller_Mode_Coordinator.InputStatus.Invalid) {
            Vehicle_Controller_Mode_Coordinator.ConditionAssessment.InvalidCondition
          } else if (sample.eventValue == Vehicle_Controller_Mode_Coordinator.ConditionEvent.NoConditionEvent) {
            Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition
          } else if (sample.eventValue == Vehicle_Controller_Mode_Coordinator.ConditionEvent.Maintenance) {
            Vehicle_Controller_Mode_Coordinator.ConditionAssessment.MaintenanceRequested
          } else if (sample.eventValue == Vehicle_Controller_Mode_Coordinator.ConditionEvent.Degraded) {
            Vehicle_Controller_Mode_Coordinator.ConditionAssessment.DegradedReported
          } else {
            Vehicle_Controller_Mode_Coordinator.ConditionAssessment.ReturnRequested
          }
        api.put_assessment_to_compatibility(assessment)
        api.put_assessment_to_arbiter(assessment)
    }
  }

  def finalise(api: ConditionIndicationQualification_Operational_Api): Unit = { }
}
