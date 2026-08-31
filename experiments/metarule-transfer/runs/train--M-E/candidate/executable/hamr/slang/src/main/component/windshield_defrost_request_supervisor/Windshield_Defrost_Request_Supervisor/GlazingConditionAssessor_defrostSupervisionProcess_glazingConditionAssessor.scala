// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor {

  def initialise(api: GlazingConditionAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_visibilityAssessment(Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown)
  }

  def timeTriggered(api: GlazingConditionAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_06_VISIBILITY_CLASSIFICATION
        //   Validity and condition jointly derive the total three-way visibility fact
        (api.glazingValidity == GlazingValidity.Invalid ___>:
          api.visibilityAssessment == VisibilityAssessment.Unknown) &
          (api.glazingValidity == GlazingValidity.Valid &
            api.glazingCondition == GlazingCondition.Clear ___>:
            api.visibilityAssessment == VisibilityAssessment.Clear) &
          (api.glazingValidity == GlazingValidity.Valid &
            api.glazingCondition == GlazingCondition.Obscured ___>:
            api.visibilityAssessment == VisibilityAssessment.NeedsDefrost)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val glazingCondition = api.get_glazingCondition().get
    val glazingValidity = api.get_glazingValidity().get

    if (glazingValidity == GlazingValidity.Invalid) {
      api.put_visibilityAssessment(VisibilityAssessment.Unknown)
    } else if (glazingCondition == GlazingCondition.Clear) {
      api.put_visibilityAssessment(VisibilityAssessment.Clear)
    } else {
      api.put_visibilityAssessment(VisibilityAssessment.NeedsDefrost)
    }
  }

  def finalise(api: GlazingConditionAssessor_Operational_Api): Unit = { }
}
