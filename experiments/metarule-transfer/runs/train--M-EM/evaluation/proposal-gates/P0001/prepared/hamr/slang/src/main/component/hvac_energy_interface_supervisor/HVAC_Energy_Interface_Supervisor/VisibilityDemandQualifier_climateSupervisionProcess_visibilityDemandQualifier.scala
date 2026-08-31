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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee QUAL_02_VISIBILITY_DEMAND
        //   Glazing validity precedes combined user and glazing demand
        (api.glazingCondition == GlazingCondition.Unknown ___>:
          api.visibilityDemand == VisibilityDemand.Invalid) &
          (api.glazingCondition != GlazingCondition.Unknown &
            (api.defrostRequest == DefrostRequest.On |
              api.glazingCondition == GlazingCondition.Obscured) ___>:
            api.visibilityDemand == VisibilityDemand.Required) &
          (api.defrostRequest == DefrostRequest.Off &
            api.glazingCondition == GlazingCondition.Clear ___>:
            api.visibilityDemand == VisibilityDemand.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request: HVAC_Energy_Interface_Supervisor.DefrostRequest.Type =
      api.get_defrostRequest().get
    val condition: HVAC_Energy_Interface_Supervisor.GlazingCondition.Type =
      api.get_glazingCondition().get
    val demand: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type =
      if (condition == GlazingCondition.Unknown) VisibilityDemand.Invalid
      else if (request == DefrostRequest.On ||
        condition == GlazingCondition.Obscured) VisibilityDemand.Required
      else VisibilityDemand.None
    api.put_visibilityDemand(demand)
  }

  def finalise(api: VisibilityDemandQualifier_Operational_Api): Unit = { }
}
