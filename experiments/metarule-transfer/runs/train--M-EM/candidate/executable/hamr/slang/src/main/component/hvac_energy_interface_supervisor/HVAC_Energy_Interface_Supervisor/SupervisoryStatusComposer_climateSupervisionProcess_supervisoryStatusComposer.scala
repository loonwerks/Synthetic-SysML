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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee STAT_01_STATUS_PRECEDENCE
        //   Status composes owner facts in the approved fault, recovery, inactivity, limitation, and service order
        (api.actuationDisposition == ActuationDisposition.InputFault |
          api.actuationDisposition == ActuationDisposition.Inconsistent |
          api.serviceSelection.reason == SelectionReason.InvalidDemand |
          api.recoveryDecision == RecoveryDecision.BlockEnergyInvalid ___>:
          api.supervisorStatus == SupervisorStatus.InputFault) &
          (api.actuationDisposition != ActuationDisposition.InputFault &
            api.actuationDisposition != ActuationDisposition.Inconsistent &
            api.serviceSelection.reason != SelectionReason.InvalidDemand &
            api.recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
            (api.recoveryDecision == RecoveryDecision.BlockEnergyUnavailable |
              api.recoveryDecision == RecoveryDecision.BlockAwaitFresh) ___>:
            api.supervisorStatus == SupervisorStatus.Inhibited) &
          (api.actuationDisposition != ActuationDisposition.InputFault &
            api.actuationDisposition != ActuationDisposition.Inconsistent &
            api.serviceSelection.reason != SelectionReason.InvalidDemand &
            api.recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
            api.recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
            api.recoveryDecision != RecoveryDecision.BlockAwaitFresh &
            api.serviceSelection.reason == SelectionReason.UserOff ___>:
            api.supervisorStatus == SupervisorStatus.Inactive) &
          (api.actuationDisposition != ActuationDisposition.InputFault &
            api.actuationDisposition != ActuationDisposition.Inconsistent &
            api.serviceSelection.reason != SelectionReason.InvalidDemand &
            api.recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
            api.recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
            api.recoveryDecision != RecoveryDecision.BlockAwaitFresh &
            api.serviceSelection.reason == SelectionReason.TemperatureHold ___>:
            api.supervisorStatus == SupervisorStatus.Holding) &
          (api.actuationDisposition != ActuationDisposition.InputFault &
            api.actuationDisposition != ActuationDisposition.Inconsistent &
            api.serviceSelection.reason != SelectionReason.InvalidDemand &
            api.recoveryDecision != RecoveryDecision.BlockEnergyInvalid &
            api.recoveryDecision != RecoveryDecision.BlockEnergyUnavailable &
            api.recoveryDecision != RecoveryDecision.BlockAwaitFresh &
            api.serviceSelection.reason != SelectionReason.UserOff &
            api.serviceSelection.reason != SelectionReason.TemperatureHold &
            (api.resourceGrant == ResourceGrant.Denied |
              api.resourceGrant == ResourceGrant.EconomyHeat |
              api.resourceGrant == ResourceGrant.VentOnly) ___>:
            api.supervisorStatus == SupervisorStatus.Limited) &
          (api.actuationDisposition == ActuationDisposition.Active &
            api.resourceGrant == ResourceGrant.FullThermal &
            api.serviceSelection.service == Service.Heat ___>:
            api.supervisorStatus == SupervisorStatus.HeatingRequested) &
          (api.actuationDisposition == ActuationDisposition.Active &
            api.resourceGrant == ResourceGrant.FullThermal &
            api.serviceSelection.service == Service.Cool ___>:
            api.supervisorStatus == SupervisorStatus.CoolingRequested) &
          (api.actuationDisposition == ActuationDisposition.Active &
            api.resourceGrant == ResourceGrant.FullThermal &
            api.serviceSelection.service == Service.Defrost ___>:
            api.supervisorStatus == SupervisorStatus.DefrostRequested)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val recovery: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type =
      api.get_recoveryDecision().get
    val selection: HVAC_Energy_Interface_Supervisor.ServiceSelection =
      api.get_serviceSelection().get
    val grant: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type =
      api.get_resourceGrant().get
    val disposition: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type =
      api.get_actuationDisposition().get
    val status: HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type =
      if (disposition == ActuationDisposition.InputFault ||
        disposition == ActuationDisposition.Inconsistent ||
        selection.reason == SelectionReason.InvalidDemand ||
        recovery == RecoveryDecision.BlockEnergyInvalid) SupervisorStatus.InputFault
      else if (recovery == RecoveryDecision.BlockEnergyUnavailable ||
        recovery == RecoveryDecision.BlockAwaitFresh) SupervisorStatus.Inhibited
      else if (selection.reason == SelectionReason.UserOff) SupervisorStatus.Inactive
      else if (selection.reason == SelectionReason.TemperatureHold) SupervisorStatus.Holding
      else if (grant == ResourceGrant.Denied ||
        grant == ResourceGrant.EconomyHeat ||
        grant == ResourceGrant.VentOnly) SupervisorStatus.Limited
      else if (selection.service == Service.Heat) SupervisorStatus.HeatingRequested
      else if (selection.service == Service.Cool) SupervisorStatus.CoolingRequested
      else if (selection.service == Service.Defrost) SupervisorStatus.DefrostRequested
      else SupervisorStatus.InputFault
    api.put_supervisorStatus(status)
  }

  def finalise(api: SupervisoryStatusComposer_Operational_Api): Unit = { }
}
