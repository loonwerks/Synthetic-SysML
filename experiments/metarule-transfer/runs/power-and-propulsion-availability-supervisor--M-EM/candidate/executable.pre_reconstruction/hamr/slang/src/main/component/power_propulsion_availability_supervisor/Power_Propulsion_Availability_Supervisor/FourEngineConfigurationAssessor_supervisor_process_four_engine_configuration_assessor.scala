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
    // example api usage

    val apiUsage_configuration_evidence: Option[Power_Propulsion_Availability_Supervisor.ConfigurationEvidence] = api.get_configuration_evidence()
    api.logInfo(s"Received on data port configuration_evidence: ${apiUsage_configuration_evidence}")
  }

  def finalise(api: FourEngineConfigurationAssessor_Operational_Api): Unit = { }
}
