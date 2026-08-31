// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ConstraintProposalOwner_supervisorProcess_constraintProposalOwner {

  def initialise(api: ConstraintProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_constraintProposal(Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_OBSTACLE)
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
    val b = api.get_navigationBasis()
    val a = api.get_awarenessCondition()
    if (a == Some(AwarenessCondition.ACTIVE_OBSTACLE_CONFLICT) | a == Some(AwarenessCondition.STATIONARY_OBSTACLE_PRESENT)) { api.put_constraintProposal(ConstraintProposal.HOLD_OBSTACLE) }
    else if (a == Some(AwarenessCondition.ACTIVE_AWARENESS_LOSS) | a == Some(AwarenessCondition.STATIONARY_AWARENESS_UNAVAILABLE)) { api.put_constraintProposal(ConstraintProposal.HOLD_AWARENESS) }
    else if (a == Some(AwarenessCondition.AWARENESS_CLEAR) & b == Some(NavigationBasis.UNUSABLE_BASIS)) { api.put_constraintProposal(ConstraintProposal.HOLD_NAVIGATION) }
    else if (a == Some(AwarenessCondition.AWARENESS_CLEAR) & (b == Some(NavigationBasis.RELATIVE_BASIS) | b == Some(NavigationBasis.LIMITED_BASIS))) { api.put_constraintProposal(ConstraintProposal.RESTRICT_NAVIGATION) }
    else if (a == Some(AwarenessCondition.AWARENESS_CLEAR) & b == Some(NavigationBasis.FULL_BASIS)) { api.put_constraintProposal(ConstraintProposal.ALLOW_FULL) }
    else { api.put_constraintProposal(ConstraintProposal.HOLD_NAVIGATION) }
  }

  def finalise(api: ConstraintProposalOwner_Operational_Api): Unit = { }
}
