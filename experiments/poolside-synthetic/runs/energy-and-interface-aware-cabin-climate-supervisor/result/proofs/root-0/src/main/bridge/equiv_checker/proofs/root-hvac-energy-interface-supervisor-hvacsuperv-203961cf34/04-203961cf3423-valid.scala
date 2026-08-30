// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_203961cf3423_4_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      freshrequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.FreshRequest.Type,
      recoverydecision: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type,
      in_recoverystate: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Type,
      recoverystate: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryAuthority_climateSupervisionProcess_recoveryAuthority_GumboX.compute_CEP_Post(in_recoverystate, recoverystate, energycapability, freshrequest, recoverydecision))) ___>: (T)) & T))
  }
}
