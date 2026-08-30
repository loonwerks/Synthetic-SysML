// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3907564921b7_1_Valid {
  @pure def check(
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      flightauthorization: equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorization.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
