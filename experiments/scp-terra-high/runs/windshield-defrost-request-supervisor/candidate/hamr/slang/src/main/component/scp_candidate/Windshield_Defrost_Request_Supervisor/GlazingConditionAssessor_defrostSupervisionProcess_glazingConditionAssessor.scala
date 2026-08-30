// #Sireum

package scp_candidate.Windshield_Defrost_Request_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor {

  def initialise(api: GlazingConditionAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_visibilityAssessment(VisibilityAssessment.Clear)
  }

  def timeTriggered(api: GlazingConditionAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val validity = api.get_glazingValidity().get
    val condition = api.get_glazingCondition().get
    if (validity == GlazingValidity.Invalid) {
      api.put_visibilityAssessment(VisibilityAssessment.Unknown)
    } else if (condition == GlazingCondition.Clear) {
      api.put_visibilityAssessment(VisibilityAssessment.Clear)
    } else {
      api.put_visibilityAssessment(VisibilityAssessment.NeedsDefrost)
    }
  }

  def finalise(api: GlazingConditionAssessor_Operational_Api): Unit = { }
}
