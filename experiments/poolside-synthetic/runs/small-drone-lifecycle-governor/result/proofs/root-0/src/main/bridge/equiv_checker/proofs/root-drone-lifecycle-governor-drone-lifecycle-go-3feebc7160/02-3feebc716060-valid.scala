// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3feebc716060_2_Valid {
  @pure def check(
      attention_status: equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Type,
      battery_assessment: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Type,
      decision_disposition: equiv_shared_0.Drone_Lifecycle_Governor.Decision_Disposition): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.inititialize_IEP_Post(attention_status))) & T))
  }
}
