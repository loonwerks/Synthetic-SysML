// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner {

  def initialise(api: ConditionAssessmentOwner_Initialization_Api): Unit = {
    // initialise establishes safe state for the single output port
    api.put_conditionAssessment(Vehicle_Mode_Coordinator.ConditionAssessment.CurrentNormal)
  }

  def timeTriggered(api: ConditionAssessmentOwner_Operational_Api): Unit = {
    val conditionEvidence: Vehicle_Mode_Coordinator.ConditionEvidence = api.get_conditionEvidence().get

    val assessment: Vehicle_Mode_Coordinator.ConditionAssessment.Type =
      if (conditionEvidence.reportCurrency == Vehicle_Mode_Coordinator.ReportCurrency.Stale) {
        Vehicle_Mode_Coordinator.ConditionAssessment.Unusable
      } else if (conditionEvidence.reportedCondition == Vehicle_Mode_Coordinator.ReportedCondition.Invalid) {
        Vehicle_Mode_Coordinator.ConditionAssessment.Unusable
      } else if (conditionEvidence.reportedCondition == Vehicle_Mode_Coordinator.ReportedCondition.Degraded) {
        Vehicle_Mode_Coordinator.ConditionAssessment.CurrentDegraded
      } else {
        Vehicle_Mode_Coordinator.ConditionAssessment.CurrentNormal
      }

    api.put_conditionAssessment(assessment)
  }

  def finalise(api: ConditionAssessmentOwner_Operational_Api): Unit = { }
}
