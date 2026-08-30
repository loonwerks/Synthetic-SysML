// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer {

  def initialise(api: SupervisoryStatusComposer_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_STATUS_INHIBITED
        api.supervisorStatus == SupervisorStatus.Inhibited
        // END INITIALIZES ENSURES
      )
    )
    api.put_supervisorStatus(HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited)
  }

  def timeTriggered(api: SupervisoryStatusComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_recoveryDecision(), api.get_serviceSelection(), api.get_resourceGrant(), api.get_actuationDisposition()) match {
      case (Some(recovery), Some(selection), Some(grant), Some(disposition)) =>
        var status: SupervisorStatus.Type = SupervisorStatus.InputFault
        if (disposition == ActuationDisposition.InputFault ||
            disposition == ActuationDisposition.Inconsistent ||
            selection.reason == SelectionReason.InvalidDemand ||
            recovery == RecoveryDecision.BlockEnergyInvalid) {
          status = SupervisorStatus.InputFault
        } else if (recovery == RecoveryDecision.BlockEnergyUnavailable ||
                   recovery == RecoveryDecision.BlockAwaitFresh) {
          status = SupervisorStatus.Inhibited
        } else if (selection.reason == SelectionReason.UserOff) {
          status = SupervisorStatus.Inactive
        } else if (selection.reason == SelectionReason.TemperatureHold) {
          status = SupervisorStatus.Holding
        } else if (grant == ResourceGrant.Denied ||
                   grant == ResourceGrant.EconomyHeat ||
                   grant == ResourceGrant.VentOnly) {
          status = SupervisorStatus.Limited
        } else if (disposition == ActuationDisposition.Active && selection.service == Service.Heat) {
          status = SupervisorStatus.HeatingRequested
        } else if (disposition == ActuationDisposition.Active && selection.service == Service.Cool) {
          status = SupervisorStatus.CoolingRequested
        } else if (disposition == ActuationDisposition.Active && selection.service == Service.Defrost) {
          status = SupervisorStatus.DefrostRequested
        }
        api.put_supervisorStatus(status)
    }
  }

  def finalise(api: SupervisoryStatusComposer_Operational_Api): Unit = { }
}
