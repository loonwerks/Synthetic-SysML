// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter {

  def initialise(api: ServicePriorityArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_SELECTION_OFF
        api.serviceSelection.service == Service.Off &&
          api.serviceSelection.reason == SelectionReason.BlockAwaitFresh
        // END INITIALIZES ENSURES
      )
    )
    api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.BlockAwaitFresh))
  }

  def timeTriggered(api: ServicePriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_comfortDemand(), api.get_visibilityDemand(), api.get_recoveryDecision()) match {
      case (_, _, Some(RecoveryDecision.BlockEnergyInvalid)) =>
        api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.BlockEnergyInvalid))
      case (_, _, Some(RecoveryDecision.BlockEnergyUnavailable)) =>
        api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.BlockEnergyUnavailable))
      case (_, _, Some(RecoveryDecision.BlockAwaitFresh)) =>
        api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.BlockAwaitFresh))
      case (Some(ComfortDemand.Invalid), _, _) =>
        api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.InvalidDemand))
      case (_, Some(VisibilityDemand.Invalid), _) =>
        api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.InvalidDemand))
      case (_, Some(VisibilityDemand.Required), _) =>
        api.put_serviceSelection(ServiceSelection(Service.Defrost, SelectionReason.SelectedDefrost))
      case (Some(ComfortDemand.Heat), Some(VisibilityDemand.None), _) =>
        api.put_serviceSelection(ServiceSelection(Service.Heat, SelectionReason.SelectedHeat))
      case (Some(ComfortDemand.Cool), Some(VisibilityDemand.None), _) =>
        api.put_serviceSelection(ServiceSelection(Service.Cool, SelectionReason.SelectedCool))
      case (Some(ComfortDemand.Hold), Some(VisibilityDemand.None), _) =>
        api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.TemperatureHold))
      case (Some(ComfortDemand.None), Some(VisibilityDemand.None), _) =>
        api.put_serviceSelection(ServiceSelection(Service.Off, SelectionReason.UserOff))
    }
  }

  def finalise(api: ServicePriorityArbiter_Operational_Api): Unit = { }
}
