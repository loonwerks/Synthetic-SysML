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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_13_QUIESCENT_ALLOCATION
        //   An off service receives no resource grant
        (api.serviceSelection.service == Service.Off) ___>: (api.resourceGrant == ResourceGrant.Off),
        // case CASE_14_DEFROST_ALLOCATION
        //   Defrost is full, heat-assisted, vent-only, or fail-closed by capability
        (api.serviceSelection.service == Service.Defrost) ___>: ((api.energyCapability == EnergyCapability.Full ___>:
          api.resourceGrant == ResourceGrant.FullThermal) &
          (api.energyCapability == EnergyCapability.ReducedHeat ___>:
            api.resourceGrant == ResourceGrant.EconomyHeat) &
          (api.energyCapability == EnergyCapability.ReducedElectric ___>:
            api.resourceGrant == ResourceGrant.VentOnly) &
          (api.energyCapability == EnergyCapability.None |
            api.energyCapability == EnergyCapability.Invalid ___>:
            api.resourceGrant == ResourceGrant.Off)),
        // case CASE_15_HEATING_ALLOCATION
        //   Heating is full, economy, denied, or fail-closed by capability
        (api.serviceSelection.service == Service.Heat) ___>: ((api.energyCapability == EnergyCapability.Full ___>:
          api.resourceGrant == ResourceGrant.FullThermal) &
          (api.energyCapability == EnergyCapability.ReducedHeat ___>:
            api.resourceGrant == ResourceGrant.EconomyHeat) &
          (api.energyCapability == EnergyCapability.ReducedElectric ___>:
            api.resourceGrant == ResourceGrant.Denied) &
          (api.energyCapability == EnergyCapability.None |
            api.energyCapability == EnergyCapability.Invalid ___>:
            api.resourceGrant == ResourceGrant.Off)),
        // case CASE_16_COOLING_ALLOCATION
        //   Cooling is full, denied under reduction, or fail-closed by capability
        (api.serviceSelection.service == Service.Cool) ___>: ((api.energyCapability == EnergyCapability.Full ___>:
          api.resourceGrant == ResourceGrant.FullThermal) &
          (api.energyCapability == EnergyCapability.ReducedHeat |
            api.energyCapability == EnergyCapability.ReducedElectric ___>:
            api.resourceGrant == ResourceGrant.Denied) &
          (api.energyCapability == EnergyCapability.None |
            api.energyCapability == EnergyCapability.Invalid ___>:
            api.resourceGrant == ResourceGrant.Off))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val selection: HVAC_Energy_Interface_Supervisor.ServiceSelection =
      api.get_serviceSelection().get
    val capability: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type =
      api.get_energyCapability().get
    val grant: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type =
      if (selection.service == Service.Off) ResourceGrant.Off
      else if (capability == EnergyCapability.Full) ResourceGrant.FullThermal
      else if (selection.service == Service.Defrost &&
        capability == EnergyCapability.ReducedHeat) ResourceGrant.EconomyHeat
      else if (selection.service == Service.Defrost &&
        capability == EnergyCapability.ReducedElectric) ResourceGrant.VentOnly
      else if (selection.service == Service.Heat &&
        capability == EnergyCapability.ReducedHeat) ResourceGrant.EconomyHeat
      else if (selection.service == Service.Heat &&
        capability == EnergyCapability.ReducedElectric) ResourceGrant.Denied
      else if (selection.service == Service.Cool &&
        (capability == EnergyCapability.ReducedHeat ||
          capability == EnergyCapability.ReducedElectric)) ResourceGrant.Denied
      else ResourceGrant.Off
    api.put_resourceGrant(grant)
  }

  def finalise(api: ResourceAllocationDecision_Operational_Api): Unit = { }
}
