// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier {

  def initialise(api: VisibilityDemandQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_visibilityDemand(HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid)
  }

  def timeTriggered(api: VisibilityDemandQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val demand = (api.get_defrostRequest(), api.get_glazingCondition()) match {
      case (_, Some(HVAC_Energy_Interface_Supervisor.GlazingCondition.Unknown)) =>
        HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid
      case (Some(HVAC_Energy_Interface_Supervisor.DefrostRequest.On),
            Some(_)) =>
        HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required
      case (_, Some(HVAC_Energy_Interface_Supervisor.GlazingCondition.Obscured)) =>
        HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required
      case (Some(HVAC_Energy_Interface_Supervisor.DefrostRequest.Off),
            Some(HVAC_Energy_Interface_Supervisor.GlazingCondition.Clear)) =>
        HVAC_Energy_Interface_Supervisor.VisibilityDemand.None
      case _ => HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid
    }
    api.put_visibilityDemand(demand)
  }

  def finalise(api: VisibilityDemandQualifier_Operational_Api): Unit = { }
}
