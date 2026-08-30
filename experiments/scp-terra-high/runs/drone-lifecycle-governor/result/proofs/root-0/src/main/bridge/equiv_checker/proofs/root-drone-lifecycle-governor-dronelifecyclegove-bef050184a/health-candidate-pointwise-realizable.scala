// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_bef050184a50_Candidate_Pointwise_Realizable {
  @pure def check(
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorization.DENIED)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.FlightAuthorization.PERMITTED)))))
  }
}
