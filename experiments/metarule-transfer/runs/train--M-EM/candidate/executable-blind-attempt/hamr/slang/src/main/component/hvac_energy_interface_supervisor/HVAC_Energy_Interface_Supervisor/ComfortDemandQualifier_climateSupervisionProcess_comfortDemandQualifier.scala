// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ComfortDemandQualifier_climateSupervisionProcess_comfortDemandQualifier {

  def initialise(api: ComfortDemandQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_comfortDemand(HVAC_Energy_Interface_Supervisor.ComfortDemand.None)
  }

  def timeTriggered(api: ComfortDemandQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val demand = (api.get_climateRequest(), api.get_thermalRelation()) match {
      case (Some(HVAC_Energy_Interface_Supervisor.ClimateRequest.Off), _) =>
        HVAC_Energy_Interface_Supervisor.ComfortDemand.None
      case (Some(HVAC_Energy_Interface_Supervisor.ClimateRequest.Regulate),
            Some(HVAC_Energy_Interface_Supervisor.ThermalRelation.Below)) =>
        HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat
      case (Some(HVAC_Energy_Interface_Supervisor.ClimateRequest.Regulate),
            Some(HVAC_Energy_Interface_Supervisor.ThermalRelation.Within)) =>
        HVAC_Energy_Interface_Supervisor.ComfortDemand.Hold
      case (Some(HVAC_Energy_Interface_Supervisor.ClimateRequest.Regulate),
            Some(HVAC_Energy_Interface_Supervisor.ThermalRelation.Above)) =>
        HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool
      case _ => HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid
    }
    api.put_comfortDemand(demand)
  }

  def finalise(api: ComfortDemandQualifier_Operational_Api): Unit = { }
}
