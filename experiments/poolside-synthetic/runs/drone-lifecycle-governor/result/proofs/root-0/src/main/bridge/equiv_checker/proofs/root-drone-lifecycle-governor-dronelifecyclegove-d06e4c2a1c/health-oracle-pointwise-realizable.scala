// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d06e4c2a1cee_Oracle_Pointwise_Realizable {
  @pure def check(
      navigationcondition: equiv_shared_0.Drone_Lifecycle_Governor.NavigationCondition.Type,
      radiocondition: equiv_shared_0.Drone_Lifecycle_Governor.RadioCondition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_GumboX.compute_CEP_Post(navigationcondition, radiocondition, equiv_shared_0.Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_GumboX.compute_CEP_Post(navigationcondition, radiocondition, equiv_shared_0.Drone_Lifecycle_Governor.FlightQualification.NOT_READY)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_GumboX.compute_CEP_Post(navigationcondition, radiocondition, equiv_shared_0.Drone_Lifecycle_Governor.FlightQualification.READY)))))
  }
}
