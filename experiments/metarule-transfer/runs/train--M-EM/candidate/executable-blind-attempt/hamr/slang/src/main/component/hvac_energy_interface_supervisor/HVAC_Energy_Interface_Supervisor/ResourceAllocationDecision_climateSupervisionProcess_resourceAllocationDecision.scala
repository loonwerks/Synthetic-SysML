// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision {

  def initialise(api: ResourceAllocationDecision_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_resourceGrant(HVAC_Energy_Interface_Supervisor.ResourceGrant.Off)
  }

  def timeTriggered(api: ResourceAllocationDecision_Operational_Api): Unit = {
    Contract(Modifies(api))
    val grant = (api.get_serviceSelection(), api.get_energyCapability()) match {
      case (Some(selection), _) if selection.service == HVAC_Energy_Interface_Supervisor.Service.Off =>
        HVAC_Energy_Interface_Supervisor.ResourceGrant.Off
      case (Some(selection), Some(HVAC_Energy_Interface_Supervisor.EnergyCapability.Full)) =>
        HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal
      case (Some(selection), Some(HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat)) =>
        if (selection.service == HVAC_Energy_Interface_Supervisor.Service.Cool)
          HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied
        else HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat
      case (Some(selection), Some(HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric)) =>
        if (selection.service == HVAC_Energy_Interface_Supervisor.Service.Defrost)
          HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly
        else HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied
      case _ => HVAC_Energy_Interface_Supervisor.ResourceGrant.Off
    }
    api.put_resourceGrant(grant)
  }

  def finalise(api: ResourceAllocationDecision_Operational_Api): Unit = { }
}
