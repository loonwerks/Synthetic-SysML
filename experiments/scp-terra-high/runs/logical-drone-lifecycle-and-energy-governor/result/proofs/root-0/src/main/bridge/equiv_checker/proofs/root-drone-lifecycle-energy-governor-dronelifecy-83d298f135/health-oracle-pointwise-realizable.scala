// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_83d298f13515_Oracle_Pointwise_Realizable {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      chargerin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = F, retentionEligible = F, exitRequired = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = F, retentionEligible = F, exitRequired = T))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = F, retentionEligible = T, exitRequired = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = F, retentionEligible = T, exitRequired = T))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = T, retentionEligible = F, exitRequired = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = T, retentionEligible = F, exitRequired = T))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = T, retentionEligible = T, exitRequired = F))) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner_GumboX.compute_CEP_Post(batteryin, chargerin, equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargeEligibility(entryEligible = T, retentionEligible = T, exitRequired = T))))))
  }
}
