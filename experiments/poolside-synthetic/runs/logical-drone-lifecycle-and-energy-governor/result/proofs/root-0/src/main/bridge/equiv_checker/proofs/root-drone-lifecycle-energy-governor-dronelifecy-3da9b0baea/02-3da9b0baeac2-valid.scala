// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3da9b0baeac2_2_Valid {
  @pure def check(
      chargerfaultin: B,
      confidencein: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type,
      faultsout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FaultVector,
      flightcontrolin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlReport.Type,
      homefaultin: B,
      navigationin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.NavigationReport.Type,
      touchdownfaultin: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.FaultAggregationOwner_governorProcess_faultAggregationOwner_GumboX.compute_CEP_Post(chargerfaultin, confidencein, flightcontrolin, homefaultin, navigationin, touchdownfaultin, faultsout))) & T))
  }
}
