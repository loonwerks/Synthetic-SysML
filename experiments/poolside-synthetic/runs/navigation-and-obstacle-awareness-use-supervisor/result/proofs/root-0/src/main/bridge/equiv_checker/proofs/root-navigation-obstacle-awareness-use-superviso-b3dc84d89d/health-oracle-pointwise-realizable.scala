// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_b3dc84d89dd5_Oracle_Pointwise_Realizable {
  @pure def check(
      awarenesscondition: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type,
      navigationbasis: equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_GumboX.inititialize_IEP_Post(awarenesscondition, navigationbasis, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_OBSTACLE)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_GumboX.inititialize_IEP_Post(awarenesscondition, navigationbasis, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_AWARENESS)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_GumboX.inititialize_IEP_Post(awarenesscondition, navigationbasis, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_NAVIGATION)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_GumboX.inititialize_IEP_Post(awarenesscondition, navigationbasis, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.RESTRICT_NAVIGATION)) |
        (equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposalOwner_supervisorProcess_constraintProposalOwner_GumboX.inititialize_IEP_Post(awarenesscondition, navigationbasis, equiv_shared_0.Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.ALLOW_FULL)))))
  }
}
