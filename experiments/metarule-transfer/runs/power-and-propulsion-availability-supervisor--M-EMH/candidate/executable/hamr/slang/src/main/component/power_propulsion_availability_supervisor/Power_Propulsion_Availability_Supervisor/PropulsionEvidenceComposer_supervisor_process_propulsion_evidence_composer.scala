// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer {

  def initialise(api: PropulsionEvidenceComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_propulsion_assessment(
      Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP)
  }

  def timeTriggered(api: PropulsionEvidenceComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val odd: Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type = api.get_odd_engine_assessment() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID
    }
    val even: Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type = api.get_even_engine_assessment() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID
    }
    val configuration: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type = api.get_configuration_assessment() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.NOT_READY_INVALID
    }
    val assessment: Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type =
      if (odd != Power_Propulsion_Availability_Supervisor.EnginePairAssessment.READY_NONE)
        Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_ODD_ENGINE_GROUP
      else if (even != Power_Propulsion_Availability_Supervisor.EnginePairAssessment.READY_NONE)
        Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_EVEN_ENGINE_GROUP
      else if (configuration != Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.READY_NONE)
        Power_Propulsion_Availability_Supervisor.PropulsionAssessment.NOT_READY_CONFIGURATION
      else Power_Propulsion_Availability_Supervisor.PropulsionAssessment.READY_NONE
    api.put_propulsion_assessment(assessment)
  }

  def finalise(api: PropulsionEvidenceComposer_Operational_Api): Unit = { }
}
