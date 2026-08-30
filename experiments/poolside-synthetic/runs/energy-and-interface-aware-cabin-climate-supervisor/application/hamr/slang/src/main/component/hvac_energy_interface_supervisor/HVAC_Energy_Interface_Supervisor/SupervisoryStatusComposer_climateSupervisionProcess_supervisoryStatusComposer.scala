// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer {

  def initialise(api: SupervisoryStatusComposer_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.supervisorStatus == HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited
      )
    )
    // INIT_STATUS_INHIBITED
    api.put_supervisorStatus(HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited)
  }

  def timeTriggered(api: SupervisoryStatusComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_recoveryDecision: Option[HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type] = api.get_recoveryDecision()
    val apiUsage_serviceSelection: Option[HVAC_Energy_Interface_Supervisor.ServiceSelection] = api.get_serviceSelection()
    val apiUsage_resourceGrant: Option[HVAC_Energy_Interface_Supervisor.ResourceGrant.Type] = api.get_resourceGrant()
    val apiUsage_actuationDisposition: Option[HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type] = api.get_actuationDisposition()

    val rd: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type = apiUsage_recoveryDecision.get
    val ss: HVAC_Energy_Interface_Supervisor.ServiceSelection = apiUsage_serviceSelection.get
    val rg: HVAC_Energy_Interface_Supervisor.ResourceGrant.Type = apiUsage_resourceGrant.get
    val ad: HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type = apiUsage_actuationDisposition.get
    val svc: HVAC_Energy_Interface_Supervisor.Service.Type = ss.service

    // STAT_01_STATUS_PRECEDENCE
    val isInputFaultCondition: B =
      ad == HVAC_Energy_Interface_Supervisor.ActuationDisposition.InputFault |
      ad == HVAC_Energy_Interface_Supervisor.ActuationDisposition.Inconsistent |
      ss.reason == HVAC_Energy_Interface_Supervisor.SelectionReason.InvalidDemand |
      rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid

    val status: HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type =
      if (isInputFaultCondition) {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.InputFault
      } else if (rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable |
                 rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh) {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inhibited
      } else if (ss.reason == HVAC_Energy_Interface_Supervisor.SelectionReason.UserOff) {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Inactive
      } else if (ss.reason == HVAC_Energy_Interface_Supervisor.SelectionReason.TemperatureHold) {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Holding
      } else if (rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.Denied |
                 rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.EconomyHeat |
                 rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.VentOnly) {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.Limited
      } else if (ad == HVAC_Energy_Interface_Supervisor.ActuationDisposition.Active &
                 rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal &
                 svc == HVAC_Energy_Interface_Supervisor.Service.Heat) {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.HeatingRequested
      } else if (ad == HVAC_Energy_Interface_Supervisor.ActuationDisposition.Active &
                 rg == HVAC_Energy_Interface_Supervisor.ResourceGrant.FullThermal &
                 svc == HVAC_Energy_Interface_Supervisor.Service.Cool) {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.CoolingRequested
      } else {
        HVAC_Energy_Interface_Supervisor.SupervisorStatus.DefrostRequested
      }

    api.put_supervisorStatus(status)
  }

  def finalise(api: SupervisoryStatusComposer_Operational_Api): Unit = { }
}
