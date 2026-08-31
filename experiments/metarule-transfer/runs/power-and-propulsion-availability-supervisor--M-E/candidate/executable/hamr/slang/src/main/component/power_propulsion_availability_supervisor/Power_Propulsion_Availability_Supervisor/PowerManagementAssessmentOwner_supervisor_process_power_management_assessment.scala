// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerManagementAssessmentOwner_supervisor_process_power_management_assessment {

  def initialise(api: PowerManagementAssessmentOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_power_assessment(PowerAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: PowerManagementAssessmentOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: PowerAssessment.Type = api.get_power_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != EvidenceValidity.VALID) PowerAssessment.NOT_READY_INVALID
        else if (evidence.freshness != EvidenceFreshness.CURRENT) PowerAssessment.NOT_READY_STALE
        else if (evidence.condition == PowerCondition.NOMINAL) PowerAssessment.READY_NONE
        else PowerAssessment.NOT_READY_CONDITION
      case _ => PowerAssessment.NOT_READY_INVALID
    }
    api.put_power_assessment(assessment)
  }

  def finalise(api: PowerManagementAssessmentOwner_Operational_Api): Unit = { }
}
