// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter {

  def initialise(api: ServicePriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_serviceSelection(HVAC_Energy_Interface_Supervisor.ServiceSelection(
      HVAC_Energy_Interface_Supervisor.Service.Off,
      HVAC_Energy_Interface_Supervisor.SelectionReason.BlockAwaitFresh))
  }

  def timeTriggered(api: ServicePriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val selection = (api.get_recoveryDecision(), api.get_comfortDemand(), api.get_visibilityDemand()) match {
      case (Some(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid), _, _) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Off,
          HVAC_Energy_Interface_Supervisor.SelectionReason.BlockEnergyInvalid)
      case (Some(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable), _, _) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Off,
          HVAC_Energy_Interface_Supervisor.SelectionReason.BlockEnergyUnavailable)
      case (Some(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh), _, _) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Off,
          HVAC_Energy_Interface_Supervisor.SelectionReason.BlockAwaitFresh)
      case (Some(_), Some(HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid), _) |
           (Some(_), _, Some(HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid)) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Off,
          HVAC_Energy_Interface_Supervisor.SelectionReason.InvalidDemand)
      case (Some(_), _, Some(HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required)) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Defrost,
          HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedDefrost)
      case (Some(_), Some(HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat),
            Some(HVAC_Energy_Interface_Supervisor.VisibilityDemand.None)) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Heat,
          HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedHeat)
      case (Some(_), Some(HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool),
            Some(HVAC_Energy_Interface_Supervisor.VisibilityDemand.None)) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Cool,
          HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedCool)
      case (Some(_), Some(HVAC_Energy_Interface_Supervisor.ComfortDemand.Hold),
            Some(HVAC_Energy_Interface_Supervisor.VisibilityDemand.None)) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Off,
          HVAC_Energy_Interface_Supervisor.SelectionReason.TemperatureHold)
      case (Some(_), Some(HVAC_Energy_Interface_Supervisor.ComfortDemand.None),
            Some(HVAC_Energy_Interface_Supervisor.VisibilityDemand.None)) =>
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          HVAC_Energy_Interface_Supervisor.Service.Off,
          HVAC_Energy_Interface_Supervisor.SelectionReason.UserOff)
      case _ => HVAC_Energy_Interface_Supervisor.ServiceSelection(
        HVAC_Energy_Interface_Supervisor.Service.Off,
        HVAC_Energy_Interface_Supervisor.SelectionReason.InvalidDemand)
    }
    api.put_serviceSelection(selection)
  }

  def finalise(api: ServicePriorityArbiter_Operational_Api): Unit = { }
}
