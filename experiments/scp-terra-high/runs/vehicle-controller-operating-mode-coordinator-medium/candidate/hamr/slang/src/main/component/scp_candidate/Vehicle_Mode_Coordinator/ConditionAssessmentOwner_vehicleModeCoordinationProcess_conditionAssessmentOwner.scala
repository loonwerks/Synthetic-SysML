// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner {

  def initialise(api: ConditionAssessmentOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_conditionAssessment(ConditionAssessment.CurrentNormal)
  }

  def timeTriggered(api: ConditionAssessmentOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val evidence: Vehicle_Mode_Coordinator.ConditionEvidence = api.get_conditionEvidence().get
    val assessment: Vehicle_Mode_Coordinator.ConditionAssessment.Type =
      if (evidence.reportCurrency == ReportCurrency.Stale ||
          evidence.reportedCondition == ReportedCondition.Invalid) {
        ConditionAssessment.Unusable
      } else if (evidence.reportedCondition == ReportedCondition.Degraded) {
        ConditionAssessment.CurrentDegraded
      } else {
        ConditionAssessment.CurrentNormal
      }
    api.put_conditionAssessment(assessment)
  }

  def finalise(api: ConditionAssessmentOwner_Operational_Api): Unit = { }
}
