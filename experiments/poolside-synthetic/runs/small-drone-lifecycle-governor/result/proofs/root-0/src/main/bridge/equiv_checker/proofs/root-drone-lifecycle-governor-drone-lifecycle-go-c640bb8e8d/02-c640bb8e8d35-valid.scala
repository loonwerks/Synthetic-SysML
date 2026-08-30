// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c640bb8e8d35_2_Valid {
  @pure def check(
      lifecycle_actuation: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation,
      selected_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.inititialize_IEP_Post(lifecycle_actuation))) & T))
  }
}
