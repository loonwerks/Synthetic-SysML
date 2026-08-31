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
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_JOINT_OUTCOME
        (T) ___>: ((api.postRecoveryPhase != RecoveryPhase.OPEN ___>:
          api.navigationUseDirective == NavigationUseDirective.MOTION_INHIBITED) &
          (api.postRecoveryPhase == RecoveryPhase.OPEN &
            api.navigationBasis == NavigationBasis.FULL_BASIS &
            (api.acceptedAction == AcceptedAction.APPLY_FULL |
              api.acceptedAction == AcceptedAction.ACCEPT_RESET) ___>:
            api.navigationUseDirective == NavigationUseDirective.FULL_NAV_USE &
              api.supervisionStatus == SupervisionStatus.FULL_USE) &
          (api.postRecoveryPhase == RecoveryPhase.OPEN &
            (api.navigationBasis == NavigationBasis.RELATIVE_BASIS |
              api.navigationBasis == NavigationBasis.LIMITED_BASIS) &
            (api.acceptedAction == AcceptedAction.APPLY_RESTRICTED |
              api.acceptedAction == AcceptedAction.ACCEPT_RESET) ___>:
            api.navigationUseDirective == NavigationUseDirective.RESTRICTED_NAV_USE &
              api.supervisionStatus == SupervisionStatus.RESTRICTED_USE) &
          (api.postRecoveryPhase != RecoveryPhase.OPEN &
            api.acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD ___>:
            api.supervisionStatus == SupervisionStatus.HELD_OBSTACLE_INDICATION) &
          (api.postRecoveryPhase != RecoveryPhase.OPEN &
            api.acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD ___>:
            api.supervisionStatus == SupervisionStatus.HELD_AWARENESS_LOSS) &
          (api.postRecoveryPhase != RecoveryPhase.OPEN &
            api.acceptedAction == AcceptedAction.APPLY_NAV_HOLD ___>:
            api.supervisionStatus == SupervisionStatus.HELD_NAV_EVIDENCE) &
          (api.postRecoveryPhase != RecoveryPhase.OPEN &
            api.acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD ___>:
            api.supervisionStatus == SupervisionStatus.HELD_EXTERNAL) &
          (api.postRecoveryPhase == RecoveryPhase.WAIT_RELEASE &
            (api.acceptedAction == AcceptedAction.IGNORE_RESET |
              api.acceptedAction == AcceptedAction.APPLY_FULL |
              api.acceptedAction == AcceptedAction.APPLY_RESTRICTED) ___>:
            api.supervisionStatus == SupervisionStatus.RESET_RELEASE_REQUIRED) &
          (api.postRecoveryPhase == RecoveryPhase.ARMED &
            (api.acceptedAction == AcceptedAction.APPLY_FULL |
              api.acceptedAction == AcceptedAction.APPLY_RESTRICTED) ___>:
            api.supervisionStatus == SupervisionStatus.RESET_REQUIRED) &
          (api.acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD ___>:
            api.obstacleAwarenessNotice == ObstacleAwarenessNotice.CURRENT_INDICATION) &
          (api.acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD ___>:
            api.obstacleAwarenessNotice == ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE) &
          (api.acceptedAction != AcceptedAction.APPLY_OBSTACLE_HOLD &
            api.acceptedAction != AcceptedAction.APPLY_AWARENESS_HOLD ___>:
            api.obstacleAwarenessNotice == ObstacleAwarenessNotice.NO_CURRENT_INDICATION))
        // END COMPUTE ENSURES timeTriggered
      )
    )
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
