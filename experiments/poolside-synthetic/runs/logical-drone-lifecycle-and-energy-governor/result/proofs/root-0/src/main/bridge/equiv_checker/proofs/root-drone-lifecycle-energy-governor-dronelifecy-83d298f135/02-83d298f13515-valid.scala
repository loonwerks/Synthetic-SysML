// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_83d298f13515_2_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      chargerin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerFacts,
      eligibilityout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, eligibilityout))) & T))
  }
}
