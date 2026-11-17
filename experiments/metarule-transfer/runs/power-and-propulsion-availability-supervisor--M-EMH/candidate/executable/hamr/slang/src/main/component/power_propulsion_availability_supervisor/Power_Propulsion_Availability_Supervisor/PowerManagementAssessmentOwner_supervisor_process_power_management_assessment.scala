// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerManagementAssessmentOwner_supervisor_process_power_management_assessment {

  def initialise(api: PowerManagementAssessmentOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_power_assessment(Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: PowerManagementAssessmentOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: Power_Propulsion_Availability_Supervisor.PowerAssessment.Type = api.get_power_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Power_Propulsion_Availability_Supervisor.EvidenceValidity.VALID)
          Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_INVALID
        else if (evidence.freshness != Power_Propulsion_Availability_Supervisor.EvidenceFreshness.CURRENT)
          Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_STALE
        else if (evidence.condition != Power_Propulsion_Availability_Supervisor.PowerCondition.NOMINAL)
          Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_CONDITION
        else Power_Propulsion_Availability_Supervisor.PowerAssessment.READY_NONE
      case _ => Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_INVALID
    }
    api.put_power_assessment(assessment)
  }

  def finalise(api: PowerManagementAssessmentOwner_Operational_Api): Unit = { }
}
