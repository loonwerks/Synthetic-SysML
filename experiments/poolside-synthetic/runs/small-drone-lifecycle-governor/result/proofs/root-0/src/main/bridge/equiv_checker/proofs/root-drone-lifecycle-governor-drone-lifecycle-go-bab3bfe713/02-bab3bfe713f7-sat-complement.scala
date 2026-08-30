// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bab3bfe713f7_2_Complement {
  @pure def check(
      lifecycle_actuation: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation,
      selected_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, lifecycle_actuation))) & T)))
  }
}
