// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_03c7e9cedc87_Oracle_Pointwise_Realizable {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      flightcontrolin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlReport.Type,
      navigationin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.NavigationReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_GumboX.inititialize_IEP_Post(F)) |
        (equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_GumboX.inititialize_IEP_Post(T)))))
  }
}
