// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator {

  def initialise(api: ActuationCommandCoordinator_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.plantCommand.thermalService == HVAC_Energy_Interface_Supervisor.ThermalService.Off &
        api.plantCommand.airPath == HVAC_Energy_Interface_Supervisor.AirPath.Off &
        api.plantCommand.blower == HVAC_Energy_Interface_Supervisor.Blower.Off &
        api.actuationDisposition == HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent
      )
    )
    // INIT_COMMAND_QUIESCENT
    api.put_plantCommand(
      HVAC_Energy_Interface_Supervisor.PlantCommand(
        thermalService = HVAC_Energy_Interface_Supervisor.ThermalService.Off,
        airPath = HVAC_Energy_Interface_Supervisor.AirPath.Off,
        blower = HVAC_Energy_Interface_Supervisor.Blower.Off))
    api.put_actuationDisposition(HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent)
  }

  def timeTriggered(api: ActuationCommandCoordinator_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_serviceSelection: Option[HVAC_Energy_Interface_Supervisor.ServiceSelection] = api.get_serviceSelection()
    val apiUsage_resourceGrant: Option[HVAC_Energy_Interface_Supervisor.ResourceGrant.Type] = api.get_resourceGrant()
    val apiUsage_fanPreference: Option[HVAC_Energy_Interface_Supervisor.FanPreference.Type] = api.get_fanPreference()

    val ss: HVAC_Energy_Interface_Supervisor.ServiceSelection = apiUsage_serviceSelection.get
    val rg: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type = apiUsage_resourceGrant.get
    val fp: HVAC_Energy_Interface_Supervisor.FanPreference.Type = apiUsage_fanPreference.get
    val svc: HVAC_Energy_Interface_Supervisor.Service.Type = ss.service

    var ts: HVAC_Energy_Interface_Supervisor.ThermalService.Type = HVAC_Energy_Interface_Supervisor.ThermalService.Off
    var ap: HVAC_Energy_Interface_Supervisor.AirPath.Type = HVAC_Energy_Interface_Supervisor.AirPath.Off
    var bl: HVAC_Energy_Interface_Supervisor.Blower.Type = HVAC_Energy_Interface_Supervisor.Blower.Off
    var ad: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type = HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent

    // CASE_17_QUIESCENT_DENIED_INCONSISTENT
    val case17: B =
      svc == HVAC_Energy_Interface_Supervisor.Service.Off |
      rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.Off |
      rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied |
      (svc == HVAC_Energy_Interface_Supervisor.Service.Heat &
       rg != HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal &
       rg != HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat) |
      (svc == HVAC_Energy_Interface_Supervisor.Service.Cool &
       rg != HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal) |
      (svc == HVAC_Energy_Interface_Supervisor.Service.Defrost &
       rg != HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal &
       rg != HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat &
       rg != HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly)

    if (case17) {
      // CASE_17: thermalService=Off, airPath=Off, blower=Off
      // disposition: Off -> Quiescent, Denied -> Denied, else Inconsistent
      if (svc == HVAC_Energy_Interface_Supervisor.Service.Off) {
        ad = HVAC_Energy_Interface_Supervisor.ActuationDisposition.Quiescent
      } else if (rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied) {
        ad = HVAC_Energy_Interface_Supervisor.ActuationDisposition.Denied
      } else {
        ad = HVAC_Energy_Interface_Supervisor.ActuationDisposition.Inconsistent
      }
    } else if (fp == HVAC_Energy_Interface_Supervisor.FanPreference.Unknown) {
      // CASE_18_ACTIVE_FAN_FAULT
      // thermalService=Off, airPath=Off, blower=Off, actuationDisposition=InputFault
    } else {
      // CASE_19 or CASE_20
      if (svc == HVAC_Energy_Interface_Supervisor.Service.Defrost) {
        // CASE_20_ACTIVE_DEFROST_COMMAND
        ap = HVAC_Energy_Interface_Supervisor.AirPath.Glazing
        if (rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal |
            rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat) {
          ts = HVAC_Energy_Interface_Supervisor.ThermalService.Heat
        }
        if (rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal &
            (fp == HVAC_Energy_Interface_Supervisor.FanPreference.Auto |
             fp == HVAC_Energy_Interface_Supervisor.FanPreference.High)) {
          bl = HVAC_Energy_Interface_Supervisor.Blower.High
        } else {
          bl = HVAC_Energy_Interface_Supervisor.Blower.Low
        }
        if (rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal) {
          ad = HVAC_Energy_Interface_Supervisor.ActuationDisposition.Active
        } else {
          ad = HVAC_Energy_Interface_Supervisor.ActuationDisposition.LimitedActive
        }
      } else {
        // CASE_19_ACTIVE_CABIN_COMMAND (svc is Heat or Cool)
        ap = HVAC_Energy_Interface_Supervisor.AirPath.Cabin
        if (svc == HVAC_Energy_Interface_Supervisor.Service.Heat) {
          if (rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat) {
            bl = HVAC_Energy_Interface_Supervisor.Blower.Low
          } else {
            if (fp == HVAC_Energy_Interface_Supervisor.FanPreference.Auto |
                fp == HVAC_Energy_Interface_Supervisor.FanPreference.Low) {
              bl = HVAC_Energy_Interface_Supervisor.Blower.Low
            } else {
              bl = HVAC_Energy_Interface_Supervisor.Blower.High
            }
          }
        } else {
          // svc is Cool
          if (fp == HVAC_Energy_Interface_Supervisor.FanPreference.Auto |
              fp == HVAC_Energy_Interface_Supervisor.FanPreference.Low) {
            bl = HVAC_Energy_Interface_Supervisor.Blower.Low
          } else {
            bl = HVAC_Energy_Interface_Supervisor.Blower.High
          }
        }
        if (rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal) {
          ad = HVAC_Energy_Interface_Supervisor.ActuationDisposition.Active
        } else {
          ad = HVAC_Energy_Interface_Supervisor.ActuationDisposition.LimitedActive
        }
      }
    }

    api.put_plantCommand(
      HVAC_Energy_Interface_Supervisor.PlantCommand(
        thermalService = ts,
        airPath = ap,
        blower = bl))
    api.put_actuationDisposition(ad)
  }

  def finalise(api: ActuationCommandCoordinator_Operational_Api): Unit = { }
}
