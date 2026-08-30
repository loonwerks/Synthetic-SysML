// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_03c7e9cedc87_2_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      flightcontrolin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlReport.Type,
      navigationin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.NavigationReport.Type,
      readinessout: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_GumboX.inititialize_IEP_Post(readinessout))) & T))
  }
}
