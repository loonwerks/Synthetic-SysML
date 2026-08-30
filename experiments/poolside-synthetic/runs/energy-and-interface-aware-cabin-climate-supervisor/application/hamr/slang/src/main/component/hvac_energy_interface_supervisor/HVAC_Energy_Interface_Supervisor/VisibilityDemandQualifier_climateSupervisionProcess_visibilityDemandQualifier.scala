// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object VisibilityDemandQualifier_climateSupervisionProcess_visibilityDemandQualifier {

  def initialise(api: VisibilityDemandQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // INIT_VISIBILITY_SAFE
    api.put_visibilityDemand(HVAC_Energy_Interface_Supervisor.VisibilityDemand.None)
  }

  def timeTriggered(api: VisibilityDemandQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_defrostRequest: Option[HVAC_Energy_Interface_Supervisor.DefrostRequest.Type] = api.get_defrostRequest()
    val apiUsage_glazingCondition: Option[HVAC_Energy_Interface_Supervisor.GlazingCondition.Type] = api.get_glazingCondition()

    // QUAL_02_VISIBILITY_DEMAND
    // if glazingCondition is Unknown, then visibilityDemand is Invalid
    // if glazingCondition is not Unknown and (defrostRequest is On or glazingCondition is Obscured), then visibilityDemand is Required
    // if defrostRequest is Off and glazingCondition is Clear, then visibilityDemand is None
    val vd: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type =
      apiUsage_glazingCondition.get match {
        case HVAC_Energy_Interface_Supervisor.GlazingCondition.Unknown =>
          HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid
        case HVAC_Energy_Interface_Supervisor.GlazingCondition.Obscured =>
          HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required
        case HVAC_Energy_Interface_Supervisor.GlazingCondition.Clear =>
          apiUsage_defrostRequest.get match {
            case HVAC_Energy_Interface_Supervisor.DefrostRequest.On =>
              HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required
            case HVAC_Energy_Interface_Supervisor.DefrostRequest.Off =>
              HVAC_Energy_Interface_Supervisor.VisibilityDemand.None
          }
      }
    api.put_visibilityDemand(vd)
  }

  def finalise(api: VisibilityDemandQualifier_Operational_Api): Unit = { }
}
