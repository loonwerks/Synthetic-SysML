// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor {

  def initialise(api: EvenEngineGroupAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_even_engine_assessment(Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: EvenEngineGroupAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type = api.get_even_engine_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Power_Propulsion_Availability_Supervisor.EvidenceValidity.VALID)
          Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID
        else if (evidence.freshness != Power_Propulsion_Availability_Supervisor.EvidenceFreshness.CURRENT)
          Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_STALE
        else if (evidence.positionOneState != Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.NOMINAL)
          Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_FIRST_POSITION
        else if (evidence.positionTwoState != Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.NOMINAL)
          Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_SECOND_POSITION
        else Power_Propulsion_Availability_Supervisor.EnginePairAssessment.READY_NONE
      case _ => Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID
    }
    api.put_even_engine_assessment(assessment)
  }

  def finalise(api: EvenEngineGroupAssessor_Operational_Api): Unit = { }
}
