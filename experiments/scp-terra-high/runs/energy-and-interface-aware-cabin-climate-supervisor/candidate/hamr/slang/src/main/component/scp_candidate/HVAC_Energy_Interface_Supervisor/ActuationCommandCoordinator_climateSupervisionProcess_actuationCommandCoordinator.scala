// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator {

  def initialise(api: ActuationCommandCoordinator_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_COMMAND_QUIESCENT
        api.plantCommand.thermalService == ThermalService.Off &&
          api.plantCommand.airPath == AirPath.Off &&
          api.plantCommand.blower == Blower.Off &&
          api.actuationDisposition == ActuationDisposition.Quiescent
        // END INITIALIZES ENSURES
      )
    )
    api.put_plantCommand(PlantCommand(ThermalService.Off, AirPath.Off, Blower.Off))
    api.put_actuationDisposition(HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent)
  }

  def timeTriggered(api: ActuationCommandCoordinator_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_serviceSelection(), api.get_resourceGrant(), api.get_fanPreference()) match {
      case (Some(selection), Some(grant), Some(fan)) =>
        val supported: B =
          (selection.service == Service.Heat && (grant == ResourceGrant.FullThermal || grant == ResourceGrant.EconomyHeat)) ||
            (selection.service == Service.Cool && grant == ResourceGrant.FullThermal) ||
            (selection.service == Service.Defrost &&
              (grant == ResourceGrant.FullThermal || grant == ResourceGrant.EconomyHeat || grant == ResourceGrant.VentOnly))
        if (selection.service == Service.Off || grant == ResourceGrant.Off || !supported) {
          api.put_plantCommand(PlantCommand(ThermalService.Off, AirPath.Off, Blower.Off))
          if (selection.service == Service.Off) {
            api.put_actuationDisposition(ActuationDisposition.Quiescent)
          } else if (grant == ResourceGrant.Denied) {
            api.put_actuationDisposition(ActuationDisposition.Denied)
          } else {
            api.put_actuationDisposition(ActuationDisposition.Inconsistent)
          }
        } else if (fan == FanPreference.Unknown) {
          api.put_plantCommand(PlantCommand(ThermalService.Off, AirPath.Off, Blower.Off))
          api.put_actuationDisposition(ActuationDisposition.InputFault)
        } else if (selection.service == Service.Heat || selection.service == Service.Cool) {
          var thermal: ThermalService.Type = ThermalService.Cool
          if (selection.service == Service.Heat) {
            thermal = ThermalService.Heat
          }
          var blower: Blower.Type = Blower.High
          if (grant == ResourceGrant.EconomyHeat || fan == FanPreference.Auto || fan == FanPreference.Low) {
            blower = Blower.Low
          }
          api.put_plantCommand(PlantCommand(thermal, AirPath.Cabin, blower))
          if (grant == ResourceGrant.FullThermal) {
            api.put_actuationDisposition(ActuationDisposition.Active)
          } else {
            api.put_actuationDisposition(ActuationDisposition.LimitedActive)
          }
        } else {
          var thermal: ThermalService.Type = ThermalService.Heat
          if (grant == ResourceGrant.VentOnly) {
            thermal = ThermalService.Off
          }
          var blower: Blower.Type = Blower.Low
          if (grant == ResourceGrant.FullThermal && (fan == FanPreference.Auto || fan == FanPreference.High)) {
            blower = Blower.High
          }
          api.put_plantCommand(PlantCommand(thermal, AirPath.Glazing, blower))
          if (grant == ResourceGrant.FullThermal) {
            api.put_actuationDisposition(ActuationDisposition.Active)
          } else {
            api.put_actuationDisposition(ActuationDisposition.LimitedActive)
          }
        }
    }
  }

  def finalise(api: ActuationCommandCoordinator_Operational_Api): Unit = { }
}
