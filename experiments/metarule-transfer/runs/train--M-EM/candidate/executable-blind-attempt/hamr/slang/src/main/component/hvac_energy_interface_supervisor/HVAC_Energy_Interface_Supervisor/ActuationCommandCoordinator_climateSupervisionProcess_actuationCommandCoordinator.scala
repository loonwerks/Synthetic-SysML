// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator {

  def initialise(api: ActuationCommandCoordinator_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_plantCommand(HVAC_Energy_Interface_Supervisor.PlantCommand(
      HVAC_Energy_Interface_Supervisor.ThermalService.Off,
      HVAC_Energy_Interface_Supervisor.AirPath.Off,
      HVAC_Energy_Interface_Supervisor.Blower.Off))
    api.put_actuationDisposition(HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent)
  }

  def timeTriggered(api: ActuationCommandCoordinator_Operational_Api): Unit = {
    Contract(Modifies(api))
    val result = (api.get_serviceSelection(), api.get_resourceGrant(), api.get_fanPreference()) match {
      case (Some(selection), _, _) if selection.service == HVAC_Energy_Interface_Supervisor.Service.Off =>
        (HVAC_Energy_Interface_Supervisor.PlantCommand(
          HVAC_Energy_Interface_Supervisor.ThermalService.Off,
          HVAC_Energy_Interface_Supervisor.AirPath.Off,
          HVAC_Energy_Interface_Supervisor.Blower.Off),
          HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent)
      case (Some(selection), Some(grant), _) if
        !((selection.service == HVAC_Energy_Interface_Supervisor.Service.Heat &&
           (grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal ||
            grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat)) ||
          (selection.service == HVAC_Energy_Interface_Supervisor.Service.Cool &&
           grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal) ||
          (selection.service == HVAC_Energy_Interface_Supervisor.Service.Defrost &&
           (grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal ||
            grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat ||
            grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly))) =>
        (HVAC_Energy_Interface_Supervisor.PlantCommand(
          HVAC_Energy_Interface_Supervisor.ThermalService.Off,
          HVAC_Energy_Interface_Supervisor.AirPath.Off,
          HVAC_Energy_Interface_Supervisor.Blower.Off),
          if (grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied)
            HVAC_Energy_Interface_Supervisor.ActuationDisposition.Denied
          else HVAC_Energy_Interface_Supervisor.ActuationDisposition.Inconsistent)
      case (Some(_), Some(_), Some(HVAC_Energy_Interface_Supervisor.FanPreference.Unknown)) | (_, _, None()) =>
        (HVAC_Energy_Interface_Supervisor.PlantCommand(
          HVAC_Energy_Interface_Supervisor.ThermalService.Off,
          HVAC_Energy_Interface_Supervisor.AirPath.Off,
          HVAC_Energy_Interface_Supervisor.Blower.Off),
          HVAC_Energy_Interface_Supervisor.ActuationDisposition.InputFault)
      case (Some(selection), Some(grant), Some(fan)) =>
        val full = grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal
        val heat = selection.service == HVAC_Energy_Interface_Supervisor.Service.Heat ||
          (selection.service == HVAC_Energy_Interface_Supervisor.Service.Defrost &&
            grant != HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly)
        val airPath = if (selection.service == HVAC_Energy_Interface_Supervisor.Service.Defrost)
          HVAC_Energy_Interface_Supervisor.AirPath.Glazing
        else HVAC_Energy_Interface_Supervisor.AirPath.Cabin
        val thermal =
          if (selection.service == HVAC_Energy_Interface_Supervisor.Service.Defrost &&
              grant == HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly)
            HVAC_Energy_Interface_Supervisor.ThermalService.Off
          else if (heat) HVAC_Energy_Interface_Supervisor.ThermalService.Heat
          else HVAC_Energy_Interface_Supervisor.ThermalService.Cool
        val blower = if (!full || fan == HVAC_Energy_Interface_Supervisor.FanPreference.Low)
          HVAC_Energy_Interface_Supervisor.Blower.Low
        else if (selection.service == HVAC_Energy_Interface_Supervisor.Service.Defrost ||
                 fan == HVAC_Energy_Interface_Supervisor.FanPreference.High)
          HVAC_Energy_Interface_Supervisor.Blower.High
        else HVAC_Energy_Interface_Supervisor.Blower.Low
        (HVAC_Energy_Interface_Supervisor.PlantCommand(thermal, airPath, blower),
          if (full) HVAC_Energy_Interface_Supervisor.ActuationDisposition.Active
          else HVAC_Energy_Interface_Supervisor.ActuationDisposition.LimitedActive)
      case _ =>
        (HVAC_Energy_Interface_Supervisor.PlantCommand(
          HVAC_Energy_Interface_Supervisor.ThermalService.Off,
          HVAC_Energy_Interface_Supervisor.AirPath.Off,
          HVAC_Energy_Interface_Supervisor.Blower.Off),
          HVAC_Energy_Interface_Supervisor.ActuationDisposition.InputFault)
    }
    api.put_plantCommand(result._1)
    api.put_actuationDisposition(result._2)
  }

  def finalise(api: ActuationCommandCoordinator_Operational_Api): Unit = { }
}
