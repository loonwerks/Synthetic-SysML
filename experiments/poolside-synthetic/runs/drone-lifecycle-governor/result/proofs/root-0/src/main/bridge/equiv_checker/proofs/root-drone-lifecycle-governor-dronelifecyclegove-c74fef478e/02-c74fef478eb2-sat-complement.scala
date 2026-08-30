// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c74fef478eb2_2_Complement {
  @pure def check(
      chargecommand: equiv_shared_0.Drone_Lifecycle_Governor.ChargeCommand.Type,
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      powercommand: equiv_shared_0.Drone_Lifecycle_Governor.PowerCommand.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_GumboX.compute_CEP_Post(decisionsnapshot, chargecommand, powercommand))) & T)))
  }
}
