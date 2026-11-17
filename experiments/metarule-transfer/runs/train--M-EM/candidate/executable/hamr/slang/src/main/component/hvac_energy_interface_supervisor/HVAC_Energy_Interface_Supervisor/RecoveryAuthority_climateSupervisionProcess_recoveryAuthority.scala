// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryAuthority_climateSupervisionProcess_recoveryAuthority {

  // BEGIN STATE VARS
  var recoveryState: HVAC_Energy_Interface_Supervisor.RecoveryState.Type = HVAC_Energy_Interface_Supervisor.RecoveryState.Armed
  // END STATE VARS

  def initialise(api: RecoveryAuthority_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryState))
    recoveryState = RecoveryState.Inhibited
    api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)
  }

  def timeTriggered(api: RecoveryAuthority_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryState),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01_RECOVERY_INVALID
        //   Invalid energy always inhibits and cannot be overridden by freshness
        (api.energyCapability == EnergyCapability.Invalid) ___>: (recoveryState == RecoveryState.Inhibited &
          api.recoveryDecision == RecoveryDecision.BlockEnergyInvalid),
        // case CASE_02_RECOVERY_UNAVAILABLE
        //   Unavailable energy always inhibits and cannot be overridden by freshness
        (api.energyCapability == EnergyCapability.None) ___>: (recoveryState == RecoveryState.Inhibited &
          api.recoveryDecision == RecoveryDecision.BlockEnergyUnavailable),
        // case CASE_03_USABLE_STALE
        //   Usable energy without a fresh request cannot rearm an inhibited authority
        (In(recoveryState) == RecoveryState.Inhibited &
          api.energyCapability != EnergyCapability.Invalid &
          api.energyCapability != EnergyCapability.None &
          api.freshRequest == FreshRequest.Absent) ___>: (recoveryState == RecoveryState.Inhibited &
          api.recoveryDecision == RecoveryDecision.BlockAwaitFresh),
        // case CASE_04_FRESH_RECOVERY
        //   Usable energy and a fresh request rearm an inhibited authority for this evaluation
        (In(recoveryState) == RecoveryState.Inhibited &
          api.energyCapability != EnergyCapability.Invalid &
          api.energyCapability != EnergyCapability.None &
          api.freshRequest == FreshRequest.Present) ___>: (recoveryState == RecoveryState.Armed &
          api.recoveryDecision == RecoveryDecision.PermitRecovered),
        // case CASE_05_REMAIN_ARMED
        //   An armed authority remains armed while energy stays usable
        (In(recoveryState) == RecoveryState.Armed &
          api.energyCapability != EnergyCapability.Invalid &
          api.energyCapability != EnergyCapability.None) ___>: (recoveryState == RecoveryState.Armed &
          api.recoveryDecision == RecoveryDecision.Permit)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val capability: HVAC_Energy_Interface_Supervisor.EnergyCapability.Type =
      api.get_energyCapability().get
    val fresh: HVAC_Energy_Interface_Supervisor.FreshRequest.Type =
      api.get_freshRequest().get
    val decision: HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type =
      if (capability == EnergyCapability.Invalid) {
        recoveryState = RecoveryState.Inhibited
        RecoveryDecision.BlockEnergyInvalid
      } else if (capability == EnergyCapability.None) {
        recoveryState = RecoveryState.Inhibited
        RecoveryDecision.BlockEnergyUnavailable
      } else if (recoveryState == RecoveryState.Inhibited &&
        fresh == FreshRequest.Present) {
        recoveryState = RecoveryState.Armed
        RecoveryDecision.PermitRecovered
      } else if (recoveryState == RecoveryState.Inhibited) {
        recoveryState = RecoveryState.Inhibited
        RecoveryDecision.BlockAwaitFresh
      } else {
        recoveryState = RecoveryState.Armed
        RecoveryDecision.Permit
      }
    api.put_recoveryDecision(decision)
  }

  def finalise(api: RecoveryAuthority_Operational_Api): Unit = { }
}
