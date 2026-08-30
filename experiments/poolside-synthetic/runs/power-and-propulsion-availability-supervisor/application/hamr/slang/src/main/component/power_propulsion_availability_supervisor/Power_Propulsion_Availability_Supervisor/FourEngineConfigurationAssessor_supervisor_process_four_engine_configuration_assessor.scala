// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor {

  def initialise(api: FourEngineConfigurationAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_configuration_assessment(Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.READY_NONE)
  }

  def timeTriggered(api: FourEngineConfigurationAssessor_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_11_CONFIGURATION_READY
        //   If configuration evidence validity is VALID, freshness is CURRENT, engineCount is FOUR, and alternatingKinds is MATCHES_SOURCE
        (api.configuration_evidence.validity == EvidenceValidity.VALID &
          api.configuration_evidence.freshness == EvidenceFreshness.CURRENT &
          api.configuration_evidence.engineCount == EngineCount.FOUR &
          api.configuration_evidence.alternatingKinds == AlternatingKinds.MATCHES_SOURCE) ___>: (api.configuration_assessment == ConfigurationAssessment.READY_NONE),
        // case CASE_12_CONFIGURATION_NOT_READY
        //   If configuration evidence validity is INVALID, freshness is STALE, engineCount is not FOUR, or alternatingKinds is not MATCHES_SOURCE
        (api.configuration_evidence.validity == EvidenceValidity.INVALID |
          api.configuration_evidence.freshness == EvidenceFreshness.STALE |
          api.configuration_evidence.engineCount != EngineCount.FOUR |
          api.configuration_evidence.alternatingKinds != AlternatingKinds.MATCHES_SOURCE) ___>: (api.configuration_evidence.validity == EvidenceValidity.INVALID &
          api.configuration_assessment == ConfigurationAssessment.NOT_READY_INVALID |
          api.configuration_evidence.validity == EvidenceValidity.VALID &
            api.configuration_evidence.freshness == EvidenceFreshness.STALE &
            api.configuration_assessment == ConfigurationAssessment.NOT_READY_STALE |
          api.configuration_evidence.validity == EvidenceValidity.VALID &
            api.configuration_evidence.freshness == EvidenceFreshness.CURRENT &
            api.configuration_evidence.engineCount != EngineCount.FOUR &
            api.configuration_assessment == ConfigurationAssessment.NOT_READY_ENGINE_COUNT |
          api.configuration_evidence.validity == EvidenceValidity.VALID &
            api.configuration_evidence.freshness == EvidenceFreshness.CURRENT &
            api.configuration_evidence.engineCount == EngineCount.FOUR &
            api.configuration_evidence.alternatingKinds != AlternatingKinds.MATCHES_SOURCE &
            api.configuration_assessment == ConfigurationAssessment.NOT_READY_ALTERNATION)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_configuration_evidence: Option[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence] = api.get_configuration_evidence()
    api.logInfo(s"Received on data port configuration_evidence: ${apiUsage_configuration_evidence}")
  }

  def finalise(api: FourEngineConfigurationAssessor_Operational_Api): Unit = { }
}
