// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ResourceAllocationDecision_climateSupervisionProcess_resourceAllocationDecision {

  def initialise(api: ResourceAllocationDecision_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.resourceGrant == HVAC_Energy_Interface_Supervisor.ResourceGrant.Off
      )
    )
    // INIT_GRANT_OFF
    api.put_resourceGrant(HVAC_Energy_Interface_Supervisor.ResourceGrant.Off)
  }

  def timeTriggered(api: ResourceAllocationDecision_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_serviceSelection: Option[HVAC_Energy_Interface_Supervisor.ServiceSelection] = api.get_serviceSelection()
    val apiUsage_energyCapability: Option[HVAC_Energy_Interface_Supervisor.EnergyCapability.Type] = api.get_energyCapability()

    val ss: HVAC_Energy_Interface_Supervisor.ServiceSelection = apiUsage_serviceSelection.get
    val ec: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type = apiUsage_energyCapability.get

    val grant: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type =
      // CASE_13_QUIESCENT_ALLOCATION
      if (ss.service == HVAC_Energy_Interface_Supervisor.Service.Off) {
        HVAC_Energy_Interface_Supervisor.ResourceGrant.Off
      } else {
        // determine resource grant based on service and energy capability
        if (ss.service == HVAC_Energy_Interface_Supervisor.Service.Defrost) {
          // CASE_14_DEFROST_ALLOCATION
          if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.Full) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal
          } else if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat
          } else if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly
          } else {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.Off
          }
        } else if (ss.service == HVAC_Energy_Interface_Supervisor.Service.Heat) {
          // CASE_15_HEATING_ALLOCATION
          if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.Full) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal
          } else if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat
          } else if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied
          } else {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.Off
          }
        } else {
          // ss.service == Cool
          // CASE_16_COOLING_ALLOCATION
          if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.Full) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal
          } else if (ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedHeat |
                     ec == HVAC_Energy_Interface_Supervisor.EnergyCapability.ReducedElectric) {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied
          } else {
            HVAC_Energy_Interface_Supervisor.ResourceGrant.Off
          }
        }
      }

    api.put_resourceGrant(grant)
  }

  def finalise(api: ResourceAllocationDecision_Operational_Api): Unit = { }
}
