// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1ccbe58cdf5f_Oracle_Pointwise_Realizable {
  @pure def check(
      battery_assessment: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Type,
      decision_disposition: equiv_shared_0.Drone_Lifecycle_Governor.Decision_Disposition): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.compute_CEP_Post(battery_assessment, decision_disposition, equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.None)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.compute_CEP_Post(battery_assessment, decision_disposition, equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Low_Battery)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.compute_CEP_Post(battery_assessment, decision_disposition, equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Input_Fault)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.compute_CEP_Post(battery_assessment, decision_disposition, equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Recovery_Awaiting_Neutral)))))
  }
}
