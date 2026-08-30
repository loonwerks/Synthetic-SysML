// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6530851bec19_2_Complement {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      flightcontrolin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlReport.Type,
      navigationin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.NavigationReport.Type,
      readinessout: B): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_GumboX.compute_CEP_Post(batteryin, flightcontrolin, navigationin, readinessout))) & T)))
  }
}
