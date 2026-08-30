// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_636435964957_2_Complement {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      flightcontrolin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlReport.Type,
      navigationin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.NavigationReport.Type,
      proposalout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HazardProposal): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_GumboX.compute_CEP_Post(batteryin, flightcontrolin, navigationin, proposalout))) & T)))
  }
}
