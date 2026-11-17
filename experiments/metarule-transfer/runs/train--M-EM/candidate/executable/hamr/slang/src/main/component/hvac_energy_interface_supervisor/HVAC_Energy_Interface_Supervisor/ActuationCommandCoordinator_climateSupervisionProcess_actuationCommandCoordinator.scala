// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator {

  def initialise(api: ActuationCommandCoordinator_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_plantCommand(HVAC_Energy_Interface_Supervisor.PlantCommand(
      ThermalService.Off, AirPath.Off, Blower.Off))
    api.put_actuationDisposition(HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent)
  }

  def timeTriggered(api: ActuationCommandCoordinator_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_17_QUIESCENT_DENIED_INCONSISTENT
        //   Off, denied, and incompatible combinations are quiescent with distinct dispositions
        (api.serviceSelection.service == Service.Off |
          api.resourceGrant == ResourceGrant.Off |
          api.resourceGrant == ResourceGrant.Denied |
          api.serviceSelection.service == Service.Heat &
            api.resourceGrant != ResourceGrant.FullThermal &
            api.resourceGrant != ResourceGrant.EconomyHeat |
          api.serviceSelection.service == Service.Cool &
            api.resourceGrant != ResourceGrant.FullThermal |
          api.serviceSelection.service == Service.Defrost &
            api.resourceGrant != ResourceGrant.FullThermal &
            api.resourceGrant != ResourceGrant.EconomyHeat &
            api.resourceGrant != ResourceGrant.VentOnly) ___>: (api.plantCommand.thermalService == ThermalService.Off &
          api.plantCommand.airPath == AirPath.Off &
          api.plantCommand.blower == Blower.Off &
          (api.serviceSelection.service == Service.Off ___>:
            api.actuationDisposition == ActuationDisposition.Quiescent) &
          (api.serviceSelection.service != Service.Off &
            api.resourceGrant == ResourceGrant.Denied ___>:
            api.actuationDisposition == ActuationDisposition.Denied) &
          (api.serviceSelection.service != Service.Off &
            api.resourceGrant != ResourceGrant.Denied ___>:
            api.actuationDisposition == ActuationDisposition.Inconsistent)),
        // case CASE_18_ACTIVE_FAN_FAULT
        //   Unknown fan preference suppresses every otherwise compatible active command
        (api.serviceSelection.service != Service.Off &
          (api.serviceSelection.service == Service.Heat &
            (api.resourceGrant == ResourceGrant.FullThermal |
              api.resourceGrant == ResourceGrant.EconomyHeat) |
            api.serviceSelection.service == Service.Cool &
              api.resourceGrant == ResourceGrant.FullThermal |
            api.serviceSelection.service == Service.Defrost &
              (api.resourceGrant == ResourceGrant.FullThermal |
                api.resourceGrant == ResourceGrant.EconomyHeat |
                api.resourceGrant == ResourceGrant.VentOnly)) &
          api.fanPreference == FanPreference.Unknown) ___>: (api.plantCommand.thermalService == ThermalService.Off &
          api.plantCommand.airPath == AirPath.Off &
          api.plantCommand.blower == Blower.Off &
          api.actuationDisposition == ActuationDisposition.InputFault),
        // case CASE_19_ACTIVE_CABIN_COMMAND
        //   Known fan preference produces the unique permitted heat or cool cabin tuple
        ((api.serviceSelection.service == Service.Heat |
          api.serviceSelection.service == Service.Cool) &
          (api.serviceSelection.service == Service.Heat &
            (api.resourceGrant == ResourceGrant.FullThermal |
              api.resourceGrant == ResourceGrant.EconomyHeat) |
            api.serviceSelection.service == Service.Cool &
              api.resourceGrant == ResourceGrant.FullThermal) &
          api.fanPreference != FanPreference.Unknown) ___>: (api.plantCommand.airPath == AirPath.Cabin &
          (api.serviceSelection.service == Service.Heat ___>:
            api.plantCommand.thermalService == ThermalService.Heat) &
          (api.serviceSelection.service == Service.Cool ___>:
            api.plantCommand.thermalService == ThermalService.Cool) &
          (api.resourceGrant == ResourceGrant.EconomyHeat ___>:
            api.plantCommand.blower == Blower.Low) &
          (api.resourceGrant == ResourceGrant.FullThermal &
            (api.fanPreference == FanPreference.Auto |
              api.fanPreference == FanPreference.Low) ___>:
            api.plantCommand.blower == Blower.Low) &
          (api.resourceGrant == ResourceGrant.FullThermal &
            api.fanPreference == FanPreference.High ___>:
            api.plantCommand.blower == Blower.High) &
          (api.resourceGrant == ResourceGrant.FullThermal ___>:
            api.actuationDisposition == ActuationDisposition.Active) &
          (api.resourceGrant == ResourceGrant.EconomyHeat ___>:
            api.actuationDisposition == ActuationDisposition.LimitedActive)),
        // case CASE_20_ACTIVE_DEFROST_COMMAND
        //   Known fan preference produces the unique permitted glazing tuple
        (api.serviceSelection.service == Service.Defrost &
          (api.resourceGrant == ResourceGrant.FullThermal |
            api.resourceGrant == ResourceGrant.EconomyHeat |
            api.resourceGrant == ResourceGrant.VentOnly) &
          api.fanPreference != FanPreference.Unknown) ___>: (api.plantCommand.airPath == AirPath.Glazing &
          (api.resourceGrant == ResourceGrant.FullThermal |
            api.resourceGrant == ResourceGrant.EconomyHeat ___>:
            api.plantCommand.thermalService == ThermalService.Heat) &
          (api.resourceGrant == ResourceGrant.VentOnly ___>:
            api.plantCommand.thermalService == ThermalService.Off) &
          (api.resourceGrant == ResourceGrant.FullThermal &
            (api.fanPreference == FanPreference.Auto |
              api.fanPreference == FanPreference.High) ___>:
            api.plantCommand.blower == Blower.High) &
          (api.resourceGrant != ResourceGrant.FullThermal |
            api.fanPreference == FanPreference.Low ___>:
            api.plantCommand.blower == Blower.Low) &
          (api.resourceGrant == ResourceGrant.FullThermal ___>:
            api.actuationDisposition == ActuationDisposition.Active) &
          (api.resourceGrant == ResourceGrant.EconomyHeat |
            api.resourceGrant == ResourceGrant.VentOnly ___>:
            api.actuationDisposition == ActuationDisposition.LimitedActive))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val selection: HVAC_Energy_Interface_Supervisor.ServiceSelection =
      api.get_serviceSelection().get
    val grant: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type =
      api.get_resourceGrant().get
    val fan: HVAC_Energy_Interface_Supervisor.FanPreference.Type =
      api.get_fanPreference().get

    var command: HVAC_Energy_Interface_Supervisor.PlantCommand =
      HVAC_Energy_Interface_Supervisor.PlantCommand(
        ThermalService.Off, AirPath.Off, Blower.Off)
    var disposition: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type =
      ActuationDisposition.Inconsistent

    val compatible: B =
      (selection.service == Service.Heat &&
        (grant == ResourceGrant.FullThermal ||
          grant == ResourceGrant.EconomyHeat)) ||
      (selection.service == Service.Cool &&
        grant == ResourceGrant.FullThermal) ||
      (selection.service == Service.Defrost &&
        (grant == ResourceGrant.FullThermal ||
          grant == ResourceGrant.EconomyHeat ||
          grant == ResourceGrant.VentOnly))

    if (selection.service == Service.Off) {
      disposition = ActuationDisposition.Quiescent
    } else if (!compatible) {
      if (grant == ResourceGrant.Denied) {
        disposition = ActuationDisposition.Denied
      } else {
        disposition = ActuationDisposition.Inconsistent
      }
    } else if (fan == FanPreference.Unknown) {
      disposition = ActuationDisposition.InputFault
    } else if (selection.service == Service.Heat ||
      selection.service == Service.Cool) {
      val thermal: HVAC_Energy_Interface_Supervisor.ThermalService.Type =
        if (selection.service == Service.Heat) ThermalService.Heat
        else ThermalService.Cool
      val blower: HVAC_Energy_Interface_Supervisor.Blower.Type =
        if (grant == ResourceGrant.EconomyHeat ||
          fan == FanPreference.Auto || fan == FanPreference.Low) Blower.Low
        else Blower.High
      command = HVAC_Energy_Interface_Supervisor.PlantCommand(
        thermal, AirPath.Cabin, blower)
      if (grant == ResourceGrant.FullThermal) {
        disposition = ActuationDisposition.Active
      } else {
        disposition = ActuationDisposition.LimitedActive
      }
    } else {
      val thermal: HVAC_Energy_Interface_Supervisor.ThermalService.Type =
        if (grant == ResourceGrant.VentOnly) ThermalService.Off
        else ThermalService.Heat
      val blower: HVAC_Energy_Interface_Supervisor.Blower.Type =
        if (grant == ResourceGrant.FullThermal &&
          (fan == FanPreference.Auto || fan == FanPreference.High)) Blower.High
        else Blower.Low
      command = HVAC_Energy_Interface_Supervisor.PlantCommand(
        thermal, AirPath.Glazing, blower)
      if (grant == ResourceGrant.FullThermal) {
        disposition = ActuationDisposition.Active
      } else {
        disposition = ActuationDisposition.LimitedActive
      }
    }
    api.put_plantCommand(command)
    api.put_actuationDisposition(disposition)
  }

  def finalise(api: ActuationCommandCoordinator_Operational_Api): Unit = { }
}
