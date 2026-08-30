// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter {

  def initialise(api: ServicePriorityArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.serviceSelection.service == HVAC_Energy_Interface_Supervisor.Service.Off &
        api.serviceSelection.reason == HVAC_Energy_Interface_Supervisor.SelectionReason.BlockAwaitFresh
      )
    )
    // INIT_SELECTION_OFF
    api.put_serviceSelection(
      HVAC_Energy_Interface_Supervisor.ServiceSelection(
        service = HVAC_Energy_Interface_Supervisor.Service.Off,
        reason = HVAC_Energy_Interface_Supervisor.SelectionReason.BlockAwaitFresh))
  }

  def timeTriggered(api: ServicePriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_comfortDemand: Option[HVAC_Energy_Interface_Supervisor.ComfortDemand.Type] = api.get_comfortDemand()
    val apiUsage_visibilityDemand: Option[HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type] = api.get_visibilityDemand()
    val apiUsage_recoveryDecision: Option[HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type] = api.get_recoveryDecision()

    val cd: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type = apiUsage_comfortDemand.get
    val vd: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type = apiUsage_visibilityDemand.get
    val rd: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type = apiUsage_recoveryDecision.get

    // CASE_06_AUTHORITY_BLOCK
    // if recoveryDecision is BlockEnergyInvalid/BlockEnergyUnavailable/BlockAwaitFresh
    // -> service=Off, reason=corresponding
    val service: HVAC_Energy_Interface_Supervisor.Service.Type =
      if (rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid) {
        HVAC_Energy_Interface_Supervisor.Service.Off
      } else if (rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable) {
        HVAC_Energy_Interface_Supervisor.Service.Off
      } else if (rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh) {
        HVAC_Energy_Interface_Supervisor.Service.Off
      } else {
        // recoveryDecision is Permit or PermitRecovered
        // CASE_07: (comfortDemand is Invalid | visibilityDemand is Invalid) -> service=Off, reason=InvalidDemand
        // CASE_08: visibilityDemand is Required -> service=Defrost, reason=SelectedDefrost
        // CASE_09: visibilityDemand is None & comfortDemand is Heat -> service=Heat, reason=SelectedHeat
        // CASE_10: visibilityDemand is None & comfortDemand is Cool -> service=Cool, reason=SelectedCool
        // CASE_11: visibilityDemand is None & comfortDemand is Hold -> service=Off, reason=TemperatureHold
        // CASE_12: visibilityDemand is None & comfortDemand is None -> service=Off, reason=UserOff
        if (cd == HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid |
            vd == HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid) {
          HVAC_Energy_Interface_Supervisor.Service.Off
        } else if (vd == HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required) {
          HVAC_Energy_Interface_Supervisor.Service.Defrost
        } else if (cd == HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat) {
          HVAC_Energy_Interface_Supervisor.Service.Heat
        } else if (cd == HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool) {
          HVAC_Energy_Interface_Supervisor.Service.Cool
        } else {
          HVAC_Energy_Interface_Supervisor.Service.Off
        }
      }

    val reason: HVAC_Energy_Interface_Supervisor.SelectionReason.Type =
      if (rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid) {
        HVAC_Energy_Interface_Supervisor.SelectionReason.BlockEnergyInvalid
      } else if (rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable) {
        HVAC_Energy_Interface_Supervisor.SelectionReason.BlockEnergyUnavailable
      } else if (rd == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh) {
        HVAC_Energy_Interface_Supervisor.SelectionReason.BlockAwaitFresh
      } else {
        // recoveryDecision is Permit or PermitRecovered
        if (cd == HVAC_Energy_Interface_Supervisor.ComfortDemand.Invalid |
            vd == HVAC_Energy_Interface_Supervisor.VisibilityDemand.Invalid) {
          HVAC_Energy_Interface_Supervisor.SelectionReason.InvalidDemand
        } else if (vd == HVAC_Energy_Interface_Supervisor.VisibilityDemand.Required) {
          HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedDefrost
        } else if (cd == HVAC_Energy_Interface_Supervisor.ComfortDemand.Heat) {
          HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedHeat
        } else if (cd == HVAC_Energy_Interface_Supervisor.ComfortDemand.Cool) {
          HVAC_Energy_Interface_Supervisor.SelectionReason.SelectedCool
        } else if (cd == HVAC_Energy_Interface_Supervisor.ComfortDemand.Hold) {
          HVAC_Energy_Interface_Supervisor.SelectionReason.TemperatureHold
        } else {
          HVAC_Energy_Interface_Supervisor.SelectionReason.UserOff
        }
      }

    api.put_serviceSelection(
      HVAC_Energy_Interface_Supervisor.ServiceSelection(
        service = service,
        reason = reason))
  }

  def finalise(api: ServicePriorityArbiter_Operational_Api): Unit = { }
}
