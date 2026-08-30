// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0d2b32ed107c_2_Valid {
  @pure def check(
      proposalout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type,
      semanticsin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_GumboX.inititialize_IEP_Post(proposalout))) & T))
  }
}
