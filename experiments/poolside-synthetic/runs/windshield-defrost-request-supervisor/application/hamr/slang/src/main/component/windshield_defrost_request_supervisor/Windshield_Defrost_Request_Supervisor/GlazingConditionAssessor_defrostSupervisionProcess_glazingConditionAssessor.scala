// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor {

  def initialise(api: GlazingConditionAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.visibilityAssessment == Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear
      )
    )
    api.put_visibilityAssessment(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear)
  }

  def timeTriggered(api: GlazingConditionAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(
        api
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_06_VISIBILITY_CLASSIFICATION
        //   classify glazing visibility assessment
        (GlazingValidity.Invalid == api.glazingValidity |
          GlazingValidity.Valid == api.glazingValidity &
            GlazingCondition.Clear == api.glazingCondition |
          GlazingValidity.Valid == api.glazingValidity &
            GlazingCondition.Obscured == api.glazingCondition) ___>: ((GlazingValidity.Invalid == api.glazingValidity ___>:
          api.visibilityAssessment == VisibilityAssessment.Unknown) &
          (GlazingValidity.Valid == api.glazingValidity &
            GlazingCondition.Clear == api.glazingCondition ___>:
            api.visibilityAssessment == VisibilityAssessment.Clear) &
          (GlazingValidity.Valid == api.glazingValidity &
            GlazingCondition.Obscured == api.glazingCondition ___>:
            api.visibilityAssessment == VisibilityAssessment.NeedsDefrost))
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val glazingValidity = api.get_glazingValidity().get
    val glazingCondition = api.get_glazingCondition().get

    if (glazingValidity == Windshield_Defrost_Request_Supervisor.GlazingValidity.Invalid) {
      api.put_visibilityAssessment(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown)
    } else if (glazingCondition == Windshield_Defrost_Request_Supervisor.GlazingCondition.Clear) {
      api.put_visibilityAssessment(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear)
    } else {
      api.put_visibilityAssessment(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.NeedsDefrost)
    }
  }

  def finalise(api: GlazingConditionAssessor_Operational_Api): Unit = { }
}
