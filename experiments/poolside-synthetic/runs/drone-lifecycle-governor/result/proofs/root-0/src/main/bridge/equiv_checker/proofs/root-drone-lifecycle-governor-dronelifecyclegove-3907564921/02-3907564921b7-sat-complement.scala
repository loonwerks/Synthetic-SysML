// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3907564921b7_2_Complement {
  @pure def check(
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      flightauthorization: equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorization.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_GumboX.compute_CEP_Post(decisionsnapshot, flightauthorization))) & T)))
  }
}
