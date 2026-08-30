// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision {

  def initialise(api: ResourceAllocationDecision_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_GRANT_OFF
        api.resourceGrant == ResourceGrant.Off
        // END INITIALIZES ENSURES
      )
    )
    api.put_resourceGrant(HVAC_Energy_Interface_Supervisor.ResourceGrant.Off)
  }

  def timeTriggered(api: ResourceAllocationDecision_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_serviceSelection(), api.get_energyCapability()) match {
      case (Some(selection), Some(capability)) =>
        var grant: ResourceGrant.Type = ResourceGrant.Off
        if (selection.service == Service.Defrost) {
          if (capability == EnergyCapability.Full) {
            grant = ResourceGrant.FullThermal
          } else if (capability == EnergyCapability.ReducedHeat) {
            grant = ResourceGrant.EconomyHeat
          } else if (capability == EnergyCapability.ReducedElectric) {
            grant = ResourceGrant.VentOnly
          }
        } else if (selection.service == Service.Heat) {
          if (capability == EnergyCapability.Full) {
            grant = ResourceGrant.FullThermal
          } else if (capability == EnergyCapability.ReducedHeat) {
            grant = ResourceGrant.EconomyHeat
          } else if (capability == EnergyCapability.ReducedElectric) {
            grant = ResourceGrant.Denied
          }
        } else if (selection.service == Service.Cool) {
          if (capability == EnergyCapability.Full) {
            grant = ResourceGrant.FullThermal
          } else if (capability == EnergyCapability.ReducedHeat || capability == EnergyCapability.ReducedElectric) {
            grant = ResourceGrant.Denied
          }
        }
        api.put_resourceGrant(grant)
    }
  }

  def finalise(api: ResourceAllocationDecision_Operational_Api): Unit = { }
}
