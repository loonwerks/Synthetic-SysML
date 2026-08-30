// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryAuthority_climateSupervisionProcess_recoveryAuthority {

  // Inhibited = 0, Armed = 1
  var recoveryState: Z = 0

  def initialise(api: RecoveryAuthority_Initialization_Api): Unit = {
    Contract(
      Modifies(api, recoveryState),
      Ensures(
        recoveryState == 0 &
        api.recoveryDecision == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh
      )
    )
    // INIT_RECOVERY_INHIBITED
    recoveryState = 0
    api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)
  }

  def timeTriggered(api: RecoveryAuthority_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryState),
      Ensures(
        // CASE_01_RECOVERY_INVALID
        (!(api.energyCapability == HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid) |
          (recoveryState == 0 &
            api.recoveryDecision == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid)) &
        // CASE_02_RECOVERY_UNAVAILABLE
        (!(api.energyCapability == HVAC_Energy_Interface_Supervisor.EnergyCapability.None) |
          (recoveryState == 0 &
            api.recoveryDecision == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable)) &
        // CASE_03_USABLE_STALE
        (!(In(recoveryState) == 0 &
          api.energyCapability != HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid &
          api.energyCapability != HVAC_Energy_Interface_Supervisor.EnergyCapability.None &
          api.freshRequest == HVAC_Energy_Interface_Supervisor.FreshRequest.Absent) |
          (recoveryState == 0 &
            api.recoveryDecision == HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)) &
        // CASE_04_FRESH_RECOVERY
        (!(In(recoveryState) == 0 &
          api.energyCapability != HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid &
          api.energyCapability != HVAC_Energy_Interface_Supervisor.EnergyCapability.None &
          api.freshRequest == HVAC_Energy_Interface_Supervisor.FreshRequest.Present) |
          (recoveryState == 1 &
            api.recoveryDecision == HVAC_Energy_Interface_Supervisor.RecoveryDecision.PermitRecovered)) &
        // CASE_05_REMAIN_ARMED
        (!(In(recoveryState) == 1 &
          api.energyCapability != HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid &
          api.energyCapability != HVAC_Energy_Interface_Supervisor.EnergyCapability.None) |
          (recoveryState == 1 &
            api.recoveryDecision == HVAC_Energy_Interface_Supervisor.RecoveryDecision.Permit))
      )
    )

    val apiUsage_energyCapability: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type = api.get_energyCapability().get
    val apiUsage_freshRequest: HVAC_Energy_Interface_Supervisor.FreshRequest.Type = api.get_freshRequest().get

    val entryState: Z = recoveryState

    if (apiUsage_energyCapability == HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid) {
      recoveryState = 0
      api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid)
    } else if (apiUsage_energyCapability == HVAC_Energy_Interface_Supervisor.EnergyCapability.None) {
      recoveryState = 0
      api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable)
    } else if (apiUsage_freshRequest == HVAC_Energy_Interface_Supervisor.FreshRequest.Present) {
      if (entryState == 0) {
        recoveryState = 1
        api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.PermitRecovered)
      } else {
        api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.Permit)
      }
    } else {
      if (entryState == 1) {
        api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.Permit)
      } else {
        recoveryState = 0
        api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)
      }
    }
  }

  def finalise(api: RecoveryAuthority_Operational_Api): Unit = { }
}
