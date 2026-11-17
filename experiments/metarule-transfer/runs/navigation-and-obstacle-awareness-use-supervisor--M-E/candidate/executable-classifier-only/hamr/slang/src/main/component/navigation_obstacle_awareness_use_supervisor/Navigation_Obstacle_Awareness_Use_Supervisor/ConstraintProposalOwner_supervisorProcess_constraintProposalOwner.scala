// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ConstraintProposalOwner_supervisorProcess_constraintProposalOwner {

  def initialise(api: ConstraintProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_constraintProposal(Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_OBSTACLE)
  }

  def timeTriggered(api: ConstraintProposalOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_navigationBasis: Option[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type] = api.get_navigationBasis()
    api.logInfo(s"Received on data port navigationBasis: ${apiUsage_navigationBasis}")
    val apiUsage_awarenessCondition: Option[Navigation_Obstacle_Awareness_Use_Supervisor.AwarenessCondition.Type] = api.get_awarenessCondition()
    api.logInfo(s"Received on data port awarenessCondition: ${apiUsage_awarenessCondition}")
  }

  def finalise(api: ConstraintProposalOwner_Operational_Api): Unit = { }
}
