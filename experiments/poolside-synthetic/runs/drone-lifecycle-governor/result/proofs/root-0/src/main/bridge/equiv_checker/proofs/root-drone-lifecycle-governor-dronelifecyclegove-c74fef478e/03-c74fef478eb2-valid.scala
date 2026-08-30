// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c74fef478eb2_3_Valid {
  @pure def check(
      chargecommand: equiv_shared_0.Drone_Lifecycle_Governor.ChargeCommand.Type,
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      powercommand: equiv_shared_0.Drone_Lifecycle_Governor.PowerCommand.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
