// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor {

  def initialise(api: FourEngineConfigurationAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_configuration_assessment(ConfigurationAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: FourEngineConfigurationAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: ConfigurationAssessment.Type = api.get_configuration_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != EvidenceValidity.VALID) ConfigurationAssessment.NOT_READY_INVALID
        else if (evidence.freshness != EvidenceFreshness.CURRENT) ConfigurationAssessment.NOT_READY_STALE
        else if (evidence.engineCount != EngineCount.FOUR) ConfigurationAssessment.NOT_READY_ENGINE_COUNT
        else if (evidence.alternatingKinds != AlternatingKinds.MATCHES_SOURCE) ConfigurationAssessment.NOT_READY_ALTERNATION
        else ConfigurationAssessment.READY_NONE
      case _ => ConfigurationAssessment.NOT_READY_INVALID
    }
    api.put_configuration_assessment(assessment)
  }

  def finalise(api: FourEngineConfigurationAssessor_Operational_Api): Unit = { }
}
