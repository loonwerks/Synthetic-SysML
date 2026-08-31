// #Sireum

package hvac_energy_interface_supervisor.HVAC_Energy_Interface_Supervisor

import org.sireum._
import hvac_energy_interface_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryAuthority_climateSupervisionProcess_recoveryAuthority {
  var recoveryArmed: B = F

  def initialise(api: RecoveryAuthority_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryArmed))
    recoveryArmed = F
    api.put_recoveryDecision(HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh)
  }

  def timeTriggered(api: RecoveryAuthority_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryArmed))
    val decision = api.get_energyCapability() match {
      case Some(HVAC_Energy_Interface_Supervisor.EnergyCapability.Invalid) | None() =>
        recoveryArmed = F
        HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyInvalid
      case Some(HVAC_Energy_Interface_Supervisor.EnergyCapability.None) =>
        recoveryArmed = F
        HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockEnergyUnavailable
      case Some(_) if recoveryArmed =>
        HVAC_Energy_Interface_Supervisor.RecoveryDecision.Permit
      case Some(_) =>
        api.get_freshRequest() match {
          case Some(HVAC_Energy_Interface_Supervisor.FreshRequest.Present) =>
            recoveryArmed = T
            HVAC_Energy_Interface_Supervisor.RecoveryDecision.PermitRecovered
          case _ => HVAC_Energy_Interface_Supervisor.RecoveryDecision.BlockAwaitFresh
        }
    }
    api.put_recoveryDecision(decision)
  }

  def finalise(api: RecoveryAuthority_Operational_Api): Unit = { }
}
