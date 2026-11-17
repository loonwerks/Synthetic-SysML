// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter {

  def initialise(api: ServicePriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_serviceSelection(HVAC_Energy_Interface_Supervisor.ServiceSelection(
      Service.Off, SelectionReason.BlockAwaitFresh))
  }

  def timeTriggered(api: ServicePriorityArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_06_AUTHORITY_BLOCK
        //   Recovery authority blocks every qualified demand and preserves the block reason
        (api.recoveryDecision == RecoveryDecision.BlockEnergyInvalid |
          api.recoveryDecision == RecoveryDecision.BlockEnergyUnavailable |
          api.recoveryDecision == RecoveryDecision.BlockAwaitFresh) ___>: (api.serviceSelection.service == Service.Off &
          (api.recoveryDecision == RecoveryDecision.BlockEnergyInvalid ___>:
            api.serviceSelection.reason == SelectionReason.BlockEnergyInvalid) &
          (api.recoveryDecision == RecoveryDecision.BlockEnergyUnavailable ___>:
            api.serviceSelection.reason == SelectionReason.BlockEnergyUnavailable) &
          (api.recoveryDecision == RecoveryDecision.BlockAwaitFresh ___>:
            api.serviceSelection.reason == SelectionReason.BlockAwaitFresh)),
        // case CASE_07_QUALIFIED_INPUT_FAULT
        //   Invalid qualified comfort or visibility blocks service when authority permits
        ((api.recoveryDecision == RecoveryDecision.Permit |
          api.recoveryDecision == RecoveryDecision.PermitRecovered) &
          (api.comfortDemand == ComfortDemand.Invalid |
            api.visibilityDemand == VisibilityDemand.Invalid)) ___>: (api.serviceSelection.service == Service.Off &
          api.serviceSelection.reason == SelectionReason.InvalidDemand),
        // case CASE_08_DEFROST_PRIORITY
        //   Required visibility service outranks simultaneous valid heating or cooling demand
        ((api.recoveryDecision == RecoveryDecision.Permit |
          api.recoveryDecision == RecoveryDecision.PermitRecovered) &
          api.comfortDemand != ComfortDemand.Invalid &
          api.visibilityDemand == VisibilityDemand.Required) ___>: (api.serviceSelection.service == Service.Defrost &
          api.serviceSelection.reason == SelectionReason.SelectedDefrost),
        // case CASE_09_COMFORT_HEATING
        //   Valid heating demand is selected when visibility demand is absent
        ((api.recoveryDecision == RecoveryDecision.Permit |
          api.recoveryDecision == RecoveryDecision.PermitRecovered) &
          api.visibilityDemand == VisibilityDemand.None &
          api.comfortDemand == ComfortDemand.Heat) ___>: (api.serviceSelection.service == Service.Heat &
          api.serviceSelection.reason == SelectionReason.SelectedHeat),
        // case CASE_10_COMFORT_COOLING
        //   Valid cooling demand is selected when visibility demand is absent
        ((api.recoveryDecision == RecoveryDecision.Permit |
          api.recoveryDecision == RecoveryDecision.PermitRecovered) &
          api.visibilityDemand == VisibilityDemand.None &
          api.comfortDemand == ComfortDemand.Cool) ___>: (api.serviceSelection.service == Service.Cool &
          api.serviceSelection.reason == SelectionReason.SelectedCool),
        // case CASE_11_TEMPERATURE_HOLD
        //   Within-range comfort yields an off selection with hold reason
        ((api.recoveryDecision == RecoveryDecision.Permit |
          api.recoveryDecision == RecoveryDecision.PermitRecovered) &
          api.visibilityDemand == VisibilityDemand.None &
          api.comfortDemand == ComfortDemand.Hold) ___>: (api.serviceSelection.service == Service.Off &
          api.serviceSelection.reason == SelectionReason.TemperatureHold),
        // case CASE_12_USER_OFF
        //   No comfort or visibility demand yields an off selection with user-off reason
        ((api.recoveryDecision == RecoveryDecision.Permit |
          api.recoveryDecision == RecoveryDecision.PermitRecovered) &
          api.visibilityDemand == VisibilityDemand.None &
          api.comfortDemand == ComfortDemand.None) ___>: (api.serviceSelection.service == Service.Off &
          api.serviceSelection.reason == SelectionReason.UserOff)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val comfort: HVAC_Energy_Interface_Supervisor.ComfortDemand.Type =
      api.get_comfortDemand().get
    val visibility: HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type =
      api.get_visibilityDemand().get
    val recovery: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type =
      api.get_recoveryDecision().get
    val selection: HVAC_Energy_Interface_Supervisor.ServiceSelection =
      if (recovery == RecoveryDecision.BlockEnergyInvalid)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Off, SelectionReason.BlockEnergyInvalid)
      else if (recovery == RecoveryDecision.BlockEnergyUnavailable)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Off, SelectionReason.BlockEnergyUnavailable)
      else if (recovery == RecoveryDecision.BlockAwaitFresh)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Off, SelectionReason.BlockAwaitFresh)
      else if (comfort == ComfortDemand.Invalid ||
        visibility == VisibilityDemand.Invalid)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Off, SelectionReason.InvalidDemand)
      else if (visibility == VisibilityDemand.Required)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Defrost, SelectionReason.SelectedDefrost)
      else if (comfort == ComfortDemand.Heat)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Heat, SelectionReason.SelectedHeat)
      else if (comfort == ComfortDemand.Cool)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Cool, SelectionReason.SelectedCool)
      else if (comfort == ComfortDemand.Hold)
        HVAC_Energy_Interface_Supervisor.ServiceSelection(
          Service.Off, SelectionReason.TemperatureHold)
      else HVAC_Energy_Interface_Supervisor.ServiceSelection(
        Service.Off, SelectionReason.UserOff)
    api.put_serviceSelection(selection)
  }

  def finalise(api: ServicePriorityArbiter_Operational_Api): Unit = { }
}
