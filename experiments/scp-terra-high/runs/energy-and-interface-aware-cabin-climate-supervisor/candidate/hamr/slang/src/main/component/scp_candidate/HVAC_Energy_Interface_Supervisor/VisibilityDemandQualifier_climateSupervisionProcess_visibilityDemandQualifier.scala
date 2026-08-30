// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier {

  def initialise(api: VisibilityDemandQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_VISIBILITY_SAFE
        api.visibilityDemand == VisibilityDemand.Invalid
        // END INITIALIZES ENSURES
      )
    )
    api.put_visibilityDemand(HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid)
  }

  def timeTriggered(api: VisibilityDemandQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_defrostRequest(), api.get_glazingCondition()) match {
      case (_, Some(GlazingCondition.Unknown)) =>
        api.put_visibilityDemand(VisibilityDemand.Invalid)
      case (Some(DefrostRequest.On), Some(_)) =>
        api.put_visibilityDemand(VisibilityDemand.Required)
      case (_, Some(GlazingCondition.Obscured)) =>
        api.put_visibilityDemand(VisibilityDemand.Required)
      case (Some(DefrostRequest.Off), Some(GlazingCondition.Clear)) =>
        api.put_visibilityDemand(VisibilityDemand.None)
    }
  }

  def finalise(api: VisibilityDemandQualifier_Operational_Api): Unit = { }
}
