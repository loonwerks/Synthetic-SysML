// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_636435964957_3_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      flightcontrolin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlReport.Type,
      navigationin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.NavigationReport.Type,
      proposalout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HazardProposal): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
