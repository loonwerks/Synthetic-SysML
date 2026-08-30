// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b3dc84d89dd5_2_Valid {
  @pure def check(
      awarenesscondition: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type,
      constraintproposal: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type,
      navigationbasis: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_GumboX.inititialize_IEP_Post(awarenesscondition, navigationbasis, constraintproposal))) & T))
  }
}
