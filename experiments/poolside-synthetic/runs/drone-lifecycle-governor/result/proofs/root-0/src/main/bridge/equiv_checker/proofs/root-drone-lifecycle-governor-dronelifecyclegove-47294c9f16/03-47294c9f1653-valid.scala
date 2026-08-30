// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_47294c9f1653_3_Valid {
  @pure def check(
      arbitratedintent: equiv_shared_0.Drone_Lifecycle_Governor.ArbitratedIntent,
      chargerstate: equiv_shared_0.Drone_Lifecycle_Governor.ChargerState.Type,
      pilotrequest: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleRequest.Type,
      recoveryproposal: equiv_shared_0.Drone_Lifecycle_Governor.RecoveryProposal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
