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
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07_ODD_GROUP_READY
        //   If odd engine evidence validity is VALID, freshness is CURRENT, and both positions are NOMINAL
        (api.odd_engine_evidence.validity == EvidenceValidity.VALID &
          api.odd_engine_evidence.freshness == EvidenceFreshness.CURRENT &
          api.odd_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
          api.odd_engine_evidence.positionTwoState == EnginePositionTwoCondition.NOMINAL) ___>: (api.odd_engine_assessment == EnginePairAssessment.READY_NONE),
        // case CASE_08_ODD_GROUP_NOT_READY
        //   If odd engine evidence validity is INVALID, freshness is STALE, or a position is not NOMINAL
        (api.odd_engine_evidence.validity == EvidenceValidity.INVALID |
          api.odd_engine_evidence.freshness == EvidenceFreshness.STALE |
          api.odd_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL |
          api.odd_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL) ___>: (api.odd_engine_evidence.validity == EvidenceValidity.INVALID &
          api.odd_engine_assessment == EnginePairAssessment.NOT_READY_INVALID |
          api.odd_engine_evidence.validity == EvidenceValidity.VALID &
            api.odd_engine_evidence.freshness == EvidenceFreshness.STALE &
            api.odd_engine_assessment == EnginePairAssessment.NOT_READY_STALE |
          api.odd_engine_evidence.validity == EvidenceValidity.VALID &
            api.odd_engine_evidence.freshness == EvidenceFreshness.CURRENT &
            api.odd_engine_evidence.positionOneState != EnginePositionOneCondition.NOMINAL &
            api.odd_engine_assessment == EnginePairAssessment.NOT_READY_FIRST_POSITION |
          api.odd_engine_evidence.validity == EvidenceValidity.VALID &
            api.odd_engine_evidence.freshness == EvidenceFreshness.CURRENT &
            api.odd_engine_evidence.positionOneState == EnginePositionOneCondition.NOMINAL &
            api.odd_engine_evidence.positionTwoState != EnginePositionTwoCondition.NOMINAL &
            api.odd_engine_assessment == EnginePairAssessment.NOT_READY_SECOND_POSITION)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_odd_engine_evidence: Option[Power_Propulsion_Availability_Supervisor.EnginePairEvidence] = api.get_odd_engine_evidence()
    api.logInfo(s"Received on data port odd_engine_evidence: ${apiUsage_odd_engine_evidence}")
  }

  def finalise(api: OddEngineGroupAssessor_Operational_Api): Unit = { }
}
