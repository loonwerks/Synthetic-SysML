// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ConstraintProposalOwner_supervisorProcess_constraintProposalOwner {

  def initialise(api: ConstraintProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_constraintProposal(Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_OBSTACLE)
  }

  def timeTriggered(api: ConstraintProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_14_PROPOSAL_PRIORITY
        //   Awareness holds take precedence over use proposals
        (api.awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT |
          api.awarenessCondition == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT ___>:
          api.constraintProposal == ConstraintProposal.HOLD_OBSTACLE) &
          (api.awarenessCondition == AwarenessCondition.ACTIVE_AWARENESS_LOSS |
            api.awarenessCondition == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE ___>:
            api.constraintProposal == ConstraintProposal.HOLD_AWARENESS) &
          (api.awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
            api.navigationBasis == NavigationBasis.UNUSABLE_BASIS ___>:
            api.constraintProposal == ConstraintProposal.HOLD_NAVIGATION) &
          (api.awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
            (api.navigationBasis == NavigationBasis.RELATIVE_BASIS |
              api.navigationBasis == NavigationBasis.LIMITED_BASIS) ___>:
            api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          (api.awarenessCondition == AwarenessCondition.AWARENESS_CLEAR &
            api.navigationBasis == NavigationBasis.FULL_BASIS ___>:
            api.constraintProposal == ConstraintProposal.ALLOW_FULL)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_navigationBasis() match {
      case Some(basis) =>
        api.get_awarenessCondition() match {
          case Some(condition) =>
            val proposal: Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type =
              if (condition == Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT |
                condition == Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_OBSTACLE_PRESENT) {
                Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_OBSTACLE
              } else if (condition == Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.ACTIVE_AWARENESS_LOSS |
                condition == Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE) {
                Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_AWARENESS
              } else if (basis == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.UNUSABLE_BASIS) {
                Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_NAVIGATION
              } else if (basis == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS) {
                Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.ALLOW_FULL
              } else {
                Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.RESTRICT_NAVIGATION
              }
            api.put_constraintProposal(proposal)
          case _ =>
            api.put_constraintProposal(Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_AWARENESS)
        }
      case _ =>
        api.put_constraintProposal(Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_NAVIGATION)
    }
  }

  def finalise(api: ConstraintProposalOwner_Operational_Api): Unit = { }
}
