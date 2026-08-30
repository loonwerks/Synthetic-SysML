// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_72caab481a19_2_Complement {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      chargerin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerFacts,
      eligibilityout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.inititialize_IEP_Post(eligibilityout))) & T)))
  }
}
