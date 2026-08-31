// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor {

  def initialise(api: OddEngineGroupAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_odd_engine_assessment(EnginePairAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: OddEngineGroupAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: EnginePairAssessment.Type = api.get_odd_engine_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != EvidenceValidity.VALID) EnginePairAssessment.NOT_READY_INVALID
        else if (evidence.freshness != EvidenceFreshness.CURRENT) EnginePairAssessment.NOT_READY_STALE
        else if (evidence.positionOneState != EnginePositionOneCondition.NOMINAL) EnginePairAssessment.NOT_READY_FIRST_POSITION
        else if (evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL) EnginePairAssessment.NOT_READY_SECOND_POSITION
        else EnginePairAssessment.READY_NONE
      case _ => EnginePairAssessment.NOT_READY_INVALID
    }
    api.put_odd_engine_assessment(assessment)
  }

  def finalise(api: OddEngineGroupAssessor_Operational_Api): Unit = { }
}
