// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_13f91c46a2e6_4_Valid {
  @pure def check(
      chargecommand: equiv_shared_0.Drone_Lifecycle_Governor.ChargeCommand.Type,
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      powercommand: equiv_shared_0.Drone_Lifecycle_Governor.PowerCommand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_GumboX.inititialize_IEP_Post(chargecommand, powercommand))) ___>: (T)) & T))
  }
}
