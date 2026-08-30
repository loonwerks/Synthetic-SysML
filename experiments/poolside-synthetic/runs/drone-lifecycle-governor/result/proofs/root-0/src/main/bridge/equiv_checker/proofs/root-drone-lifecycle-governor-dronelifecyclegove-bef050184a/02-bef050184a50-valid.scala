// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bef050184a50_2_Valid {
  @pure def check(
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      flightauthorization: equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorization.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_GumboX.inititialize_IEP_Post(flightauthorization))) & T))
  }
}
