// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor {

  def initialise(api: FourEngineConfigurationAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_configuration_assessment(Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: FourEngineConfigurationAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type = api.get_configuration_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Power_Propulsion_Availability_Supervisor.EvidenceValidity.VALID)
          Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_INVALID
        else if (evidence.freshness != Power_Propulsion_Availability_Supervisor.EvidenceFreshness.CURRENT)
          Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_STALE
        else if (evidence.engineCount != Power_Propulsion_Availability_Supervisor.EngineCount.FOUR)
          Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_ENGINE_COUNT
        else if (evidence.alternatingKinds != Power_Propulsion_Availability_Supervisor.AlternatingKinds.MATCHES_SOURCE)
          Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_ALTERNATION
        else Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.READY_NONE
      case _ => Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_INVALID
    }
    api.put_configuration_assessment(assessment)
  }

  def finalise(api: FourEngineConfigurationAssessor_Operational_Api): Unit = { }
}
