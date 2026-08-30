// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor {

  def initialise(api: EvenEngineGroupAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_even_engine_assessment(Power_Propulsion_Availability_Supervisor.EnginePairAssessment.READY_NONE)
  }

  def timeTriggered(api: EvenEngineGroupAssessor_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_09_EVEN_GROUP_READY
        //   If even engine evidence validity is VALID, freshness is CURRENT, and both positions are NOMINAL
        (api.even_engine_evidence.validity == EvidenceValidity.VALID &
          api.even_engine_evidence.freshness == EvidenceFreshness.CURRENT &
          api.even_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
          api.even_engine_evidence.positionTwoState == EnginePositionTwoCondition.NOMINAL) ___>: (api.even_engine_assessment == EnginePairAssessment.READY_NONE),
        // case CASE_10_EVEN_GROUP_NOT_READY
        //   If even engine evidence validity is INVALID, freshness is STALE, or a position is not NOMINAL
        (api.even_engine_evidence.validity == EvidenceValidity.INVALID |
          api.even_engine_evidence.freshness == EvidenceFreshness.STALE |
          api.even_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL |
          api.even_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL) ___>: (api.even_engine_evidence.validity == EvidenceValidity.INVALID &
          api.even_engine_assessment == EnginePairAssessment.NOT_READY_INVALID |
          api.even_engine_evidence.validity == EvidenceValidity.VALID &
            api.even_engine_evidence.freshness == EvidenceFreshness.STALE &
            api.even_engine_assessment == EnginePairAssessment.NOT_READY_STALE |
          api.even_engine_evidence.validity == EvidenceValidity.VALID &
            api.even_engine_evidence.freshness == EvidenceFreshness.CURRENT &
            api.even_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL &
            api.even_engine_assessment == EnginePairAssessment.NOT_READY_FIRST_POSITION |
          api.even_engine_evidence.validity == EvidenceValidity.VALID &
            api.even_engine_evidence.freshness == EvidenceFreshness.CURRENT &
            api.even_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
            api.even_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL &
            api.even_engine_assessment == EnginePairAssessment.NOT_READY_SECOND_POSITION)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_even_engine_evidence: Option[Power_Propulsion_Availability_Supervisor.EnginePairEvidence] = api.get_even_engine_evidence()
    api.logInfo(s"Received on data port even_engine_evidence: ${apiUsage_even_engine_evidence}")
  }

  def finalise(api: EvenEngineGroupAssessor_Operational_Api): Unit = { }
}
