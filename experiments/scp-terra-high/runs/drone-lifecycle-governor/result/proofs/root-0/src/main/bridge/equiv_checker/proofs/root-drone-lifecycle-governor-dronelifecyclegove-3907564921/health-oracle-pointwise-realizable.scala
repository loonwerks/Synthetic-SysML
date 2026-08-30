// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_3907564921b7_Oracle_Pointwise_Realizable {
  @pure def check(
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_GumboX.compute_CEP_Post(decisionsnapshot, equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorization.DENIED)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_GumboX.compute_CEP_Post(decisionsnapshot, equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorization.PERMITTED)))))
  }
}
