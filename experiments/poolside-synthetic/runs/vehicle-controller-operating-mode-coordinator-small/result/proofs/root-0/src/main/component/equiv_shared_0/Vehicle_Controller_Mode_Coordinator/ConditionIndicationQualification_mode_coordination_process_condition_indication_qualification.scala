// #Sireum

package equiv_shared_0.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import equiv_shared_0._

object ConditionIndicationQualification_mode_coordination_process_condition_indication_qualification {
  // BEGIN FUNCTIONS
  @strictpure def qualify_condition(sample: Vehicle_Controller_Mode_Coordinator.ConditionSample): Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type = if (sample.status == InputStatus.Invalid) ConditionAssessment.InvalidCondition else if (sample.eventValue == ConditionEvent.NoConditionEvent) ConditionAssessment.NoCondition else if (sample.eventValue == ConditionEvent.Maintenance) ConditionAssessment.MaintenanceRequested else if (sample.eventValue == ConditionEvent.Degraded) ConditionAssessment.DegradedReported else ConditionAssessment.ReturnRequested
  // END FUNCTIONS
}
