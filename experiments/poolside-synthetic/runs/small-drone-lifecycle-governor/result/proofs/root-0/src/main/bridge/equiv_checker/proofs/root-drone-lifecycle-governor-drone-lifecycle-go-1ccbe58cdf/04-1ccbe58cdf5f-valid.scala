// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1ccbe58cdf5f_4_Valid {
  @pure def check(
      attention_status: equiv_shared_0.Drone_Lifecycle_Governor.Attention_Status.Type,
      battery_assessment: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Type,
      decision_disposition: equiv_shared_0.Drone_Lifecycle_Governor.Decision_Disposition): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_GumboX.compute_CEP_Post(battery_assessment, decision_disposition, attention_status))) ___>: (T)) & T))
  }
}
