// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b124f023d7eb_2_Complement {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      flightcontrolin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlReport.Type,
      navigationin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.NavigationReport.Type,
      proposalout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HazardProposal): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner_GumboX.inititialize_IEP_Post(proposalout))) & T)))
  }
}
