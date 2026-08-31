// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerManagementAssessmentOwner_supervisor_process_power_management_assessment {

  def initialise(api: PowerManagementAssessmentOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_power_assessment(Power_Propulsion_Availability_Supervisor.PowerAssessment.READY_NONE)
  }

  def timeTriggered(api: PowerManagementAssessmentOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_power_evidence: Option[Power_Propulsion_Availability_Supervisor.PowerEvidence] = api.get_power_evidence()
    api.logInfo(s"Received on data port power_evidence: ${apiUsage_power_evidence}")
  }

  def finalise(api: PowerManagementAssessmentOwner_Operational_Api): Unit = { }
}
