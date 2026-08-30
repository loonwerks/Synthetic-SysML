// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c640bb8e8d35_3_Valid {
  @pure def check(
      lifecycle_actuation: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation,
      selected_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
