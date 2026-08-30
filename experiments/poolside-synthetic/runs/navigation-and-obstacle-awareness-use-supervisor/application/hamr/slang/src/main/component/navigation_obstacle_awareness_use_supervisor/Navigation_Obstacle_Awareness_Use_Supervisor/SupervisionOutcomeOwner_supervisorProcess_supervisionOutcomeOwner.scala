// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner {

  def initialise(api: SupervisionOutcomeOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
    api.put_obstacleAwarenessNotice(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.NO_CURRENT_INDICATION)
    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.STARTUP_HOLD)
  }

  def timeTriggered(api: SupervisionOutcomeOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_acceptedAction: Option[Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type] = api.get_acceptedAction()
    api.logInfo(s"Received on data port acceptedAction: ${apiUsage_acceptedAction}")
    val apiUsage_postRecoveryPhase: Option[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type] = api.get_postRecoveryPhase()
    api.logInfo(s"Received on data port postRecoveryPhase: ${apiUsage_postRecoveryPhase}")
    val apiUsage_navigationBasis: Option[Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.Type] = api.get_navigationBasis()
    api.logInfo(s"Received on data port navigationBasis: ${apiUsage_navigationBasis}")
  }

  def finalise(api: SupervisionOutcomeOwner_Operational_Api): Unit = { }
}
