// #Sireum

package scp_candidate.HVAC_Energy_Interface_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryAuthority_climateSupervisionProcess_recoveryAuthority {

  // BEGIN STATE VARS
  var recoveryState: HVAC_Energy_Interface_Supervisor.RecoveryState.Type = HVAC_Energy_Interface_Supervisor.RecoveryState.Armed
  // END STATE VARS

  def initialise(api: RecoveryAuthority_Initialization_Api): Unit = {
    Contract(
      Modifies(recoveryState, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_RECOVERY_STATE
        recoveryState == RecoveryState.Inhibited,
        // guarantee INIT_RECOVERY_INHIBITED
        api.recoveryDecision == RecoveryDecision.BlockAwaitFresh
        // END INITIALIZES ENSURES
      )
    )
    recoveryState = RecoveryState.Inhibited
    api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)
  }

  def timeTriggered(api: RecoveryAuthority_Operational_Api): Unit = {
    Contract(Modifies(recoveryState, api))
    (api.get_energyCapability(), api.get_freshRequest()) match {
      case (Some(EnergyCapability.Invalid), _) =>
        recoveryState = RecoveryState.Inhibited
        api.put_recoveryDecision(RecoveryDecision.BlockEnergyInvalid)
      case (Some(EnergyCapability.None), _) =>
        recoveryState = RecoveryState.Inhibited
        api.put_recoveryDecision(RecoveryDecision.BlockEnergyUnavailable)
      case (_, Some(FreshRequest.Present)) if recoveryState == RecoveryState.Inhibited =>
        recoveryState = RecoveryState.Armed
        api.put_recoveryDecision(RecoveryDecision.PermitRecovered)
      case _ if recoveryState == RecoveryState.Inhibited =>
        recoveryState = RecoveryState.Inhibited
        api.put_recoveryDecision(RecoveryDecision.BlockAwaitFresh)
      case _ =>
        recoveryState = RecoveryState.Armed
        api.put_recoveryDecision(RecoveryDecision.Permit)
    }
  }

  def finalise(api: RecoveryAuthority_Operational_Api): Unit = { }
}
