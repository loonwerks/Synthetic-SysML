// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a576bef795c1_2_Complement {
  @pure def check(
      proposalout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type,
      semanticsin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner_GumboX.compute_CEP_Post(semanticsin, proposalout))) & T)))
  }
}
