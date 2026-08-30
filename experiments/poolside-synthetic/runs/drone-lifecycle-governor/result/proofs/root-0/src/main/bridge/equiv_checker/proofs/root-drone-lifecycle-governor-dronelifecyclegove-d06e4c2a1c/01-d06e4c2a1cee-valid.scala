// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d06e4c2a1cee_1_Valid {
  @pure def check(
      flightqualification: equiv_shared_0.Drone_Lifecycle_Governor.FlightQualification.Type,
      navigationcondition: equiv_shared_0.Drone_Lifecycle_Governor.NavigationCondition.Type,
      radiocondition: equiv_shared_0.Drone_Lifecycle_Governor.RadioCondition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
