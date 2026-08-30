// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_77af43e6997d_3_Valid {
  @pure def check(
      energycapability: equiv_shared_0.HVAC_Energy_Interface_Supervisor.EnergyCapability.Type,
      freshrequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.FreshRequest.Type,
      recoverydecision: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type,
      recoverystate: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
