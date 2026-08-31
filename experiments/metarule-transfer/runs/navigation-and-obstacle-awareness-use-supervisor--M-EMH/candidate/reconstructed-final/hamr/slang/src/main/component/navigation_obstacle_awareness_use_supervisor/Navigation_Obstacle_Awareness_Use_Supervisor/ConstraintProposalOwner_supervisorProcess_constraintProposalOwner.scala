// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ConstraintProposalOwner_supervisorProcess_constraintProposalOwner {

  def initialise(api: ConstraintProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_constraintProposal(ConstraintProposal.HOLD_AWARENESS)
  }

  def timeTriggered(api: ConstraintProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_14_PROPOSAL_PRIORITY
        (T) ___>: ((api.awarenessCondition == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT |
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
            api.constraintProposal == ConstraintProposal.ALLOW_FULL))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val basis: NavigationBasis.Type = api.get_navigationBasis() match {
      case Some(value) => value
      case _ => NavigationBasis.UNUSABLE_BASIS
    }
    val awareness: AwarenessCondition.Type = api.get_awarenessCondition() match {
      case Some(value) => value
      case _ => AwarenessCondition.ACTIVE_AWARENESS_LOSS
    }
    val proposal: ConstraintProposal.Type =
      if (awareness == AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT |
          awareness == AwarenessCondition.STATIONARY_OBSTACLE_PRESENT) ConstraintProposal.HOLD_OBSTACLE
      else if (awareness == AwarenessCondition.ACTIVE_AWARENESS_LOSS |
               awareness == AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE) ConstraintProposal.HOLD_AWARENESS
      else if (basis == NavigationBasis.UNUSABLE_BASIS) ConstraintProposal.HOLD_NAVIGATION
      else if (basis == NavigationBasis.RELATIVE_BASIS |
               basis == NavigationBasis.LIMITED_BASIS) ConstraintProposal.RESTRICT_NAVIGATION
      else ConstraintProposal.ALLOW_FULL
    api.put_constraintProposal(proposal)
  }

  def finalise(api: ConstraintProposalOwner_Operational_Api): Unit = { }
}
