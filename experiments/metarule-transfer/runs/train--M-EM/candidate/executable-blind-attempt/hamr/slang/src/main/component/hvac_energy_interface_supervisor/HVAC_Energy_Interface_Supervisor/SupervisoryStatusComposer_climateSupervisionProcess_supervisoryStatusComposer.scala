// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer {

  def initialise(api: SupervisoryStatusComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_supervisorStatus(HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited)
  }

  def timeTriggered(api: SupervisoryStatusComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val status = (api.get_recoveryDecision(), api.get_serviceSelection(),
      api.get_resourceGrant(), api.get_actuationDisposition()) match {
      case (Some(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid), _, _, _) =>
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.InputFault
      case (_, Some(selection), _, Some(disposition)) if
        selection.reason == HVAC_Energy_Interface_Supervisor.SelectionReason.InvalidDemand ||
        disposition == HVAC_Energy_Interface_Supervisor.ActuationDisposition.InputFault ||
        disposition == HVAC_Energy_Interface_Supervisor.ActuationDisposition.Inconsistent =>
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.InputFault
      case (Some(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable), _, _, _) |
           (Some(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh), _, _, _) =>
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited
      case (_, Some(selection), Some(grant), Some(disposition)) if
        selection.reason == HVAC_Energy_Interface_Supervisor.SelectionReason.UserOff =>
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inactive
      case (_, Some(selection), Some(grant), Some(disposition)) if
        selection.reason == HVAC_Energy_Interface_Supervisor.SelectionReason.TemperatureHold =>
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Holding
      case (_, Some(_), Some(HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied), _) |
           (_, Some(_), Some(HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat), _) |
           (_, Some(_), Some(HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly), _) =>
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Limited
      case (_, Some(selection), Some(HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal),
            Some(HVAC_Energy_Interface_Supervisor.ActuationDisposition.Active)) =>
        selection.service match {
          case HVAC_Energy_Interface_Supervisor.Service.Heat =>
            HVAC_Energy_Interface_Supervisor.SupervisorStatus.HeatingRequested
          case HVAC_Energy_Interface_Supervisor.Service.Cool =>
            HVAC_Energy_Interface_Supervisor.SupervisorStatus.CoolingRequested
          case HVAC_Energy_Interface_Supervisor.Service.Defrost =>
            HVAC_Energy_Interface_Supervisor.SupervisorStatus.DefrostRequested
          case _ => HVAC_Energy_Interface_Supervisor.SupervisorStatus.InputFault
        }
      case _ => HVAC_Energy_Interface_Supervisor.SupervisorStatus.InputFault
    }
    api.put_supervisorStatus(status)
  }

  def finalise(api: SupervisoryStatusComposer_Operational_Api): Unit = { }
}
