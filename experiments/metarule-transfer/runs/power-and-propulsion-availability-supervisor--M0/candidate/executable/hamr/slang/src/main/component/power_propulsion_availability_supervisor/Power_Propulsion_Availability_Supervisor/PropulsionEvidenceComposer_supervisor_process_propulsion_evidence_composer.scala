// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer {

  def initialise(api: PropulsionEvidenceComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_propulsion_assessment(PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP)
  }

  def timeTriggered(api: PropulsionEvidenceComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: PropulsionAssessment.Type = (api.get_odd_engine_assessment(), api.get_even_engine_assessment(),
      api.get_configuration_assessment()) match {
      case (Some(odd), Some(even), Some(configuration)) =>
        if (odd != EnginePairAssessment.READY_NONE) PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP
        else if (even != EnginePairAssessment.READY_NONE) PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP
        else if (configuration != ConfigurationAssessment.READY_NONE)
          PropulsionAssessment.NOT_READY_CONFIGURATION
        else PropulsionAssessment.READY_NONE
      case _ => PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP
    }
    api.put_propulsion_assessment(assessment)
  }

  def finalise(api: PropulsionEvidenceComposer_Operational_Api): Unit = { }
}
