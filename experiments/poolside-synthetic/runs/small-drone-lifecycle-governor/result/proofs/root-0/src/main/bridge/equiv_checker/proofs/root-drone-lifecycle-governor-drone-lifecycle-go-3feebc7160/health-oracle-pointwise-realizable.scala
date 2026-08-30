// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_3feebc716060_Oracle_Pointwise_Realizable {
  @pure def check(
      battery_assessment: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Type,
      decision_disposition: equiv_shared_0.Drone_Lifecycle_Governor.Decision_Disposition): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.None)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Low_Battery)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Input_Fault)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Recovery_Awaiting_Neutral)))))
  }
}
