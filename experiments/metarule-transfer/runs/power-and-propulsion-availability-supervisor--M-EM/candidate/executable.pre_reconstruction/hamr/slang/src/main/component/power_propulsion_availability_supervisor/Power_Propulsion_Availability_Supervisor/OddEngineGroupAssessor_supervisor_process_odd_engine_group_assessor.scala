// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor {

  def initialise(api: OddEngineGroupAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_odd_engine_assessment(Power_Propulsion_Availability_Supervisor.EnginePairAssessment.READY_NONE)
  }

  def timeTriggered(api: OddEngineGroupAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_odd_engine_evidence: Option[Power_Propulsion_Availability_Supervisor.EnginePairEvidence] = api.get_odd_engine_evidence()
    api.logInfo(s"Received on data port odd_engine_evidence: ${apiUsage_odd_engine_evidence}")
  }

  def finalise(api: OddEngineGroupAssessor_Operational_Api): Unit = { }
}
