// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor {

  def initialise(api: GlazingConditionAssessor_Initialization_Api): Unit = {
    api.put_visibilityAssessment(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown)
  }

  def timeTriggered(api: GlazingConditionAssessor_Operational_Api): Unit = {
    val glazingCondition = api.get_glazingCondition()
    val glazingValidity = api.get_glazingValidity()

    val assessment: Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type =
      (glazingCondition, glazingValidity) match {
        case (Some(Windshield_Defrost_Request_Supervisor.GlazingCondition.Clear),
              Some(Windshield_Defrost_Request_Supervisor.GlazingValidity.Valid)) =>
          Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear
        case (Some(Windshield_Defrost_Request_Supervisor.GlazingCondition.Obscured),
              Some(Windshield_Defrost_Request_Supervisor.GlazingValidity.Valid)) =>
          Windshield_Defrost_Request_Supervisor.VisibilityAssessment.NeedsDefrost
        case _ =>
          Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown
      }

    api.put_visibilityAssessment(assessment)
  }

  def finalise(api: GlazingConditionAssessor_Operational_Api): Unit = { }
}
