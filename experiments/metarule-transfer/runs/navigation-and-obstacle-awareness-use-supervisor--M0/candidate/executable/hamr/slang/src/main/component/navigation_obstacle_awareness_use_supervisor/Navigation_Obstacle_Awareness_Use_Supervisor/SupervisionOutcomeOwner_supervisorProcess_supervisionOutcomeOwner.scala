// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner {

  def initialise(api: SupervisionOutcomeOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
    api.put_obstacleAwarenessNotice(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE)
    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.STARTUP_HOLD)
  }

  def timeTriggered(api: SupervisionOutcomeOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_JOINT_OUTCOME
        //   Jointly publish use, awareness, and supervisor status
        (api.postRecoveryPhase != RecoveryPhase.OPEN ___>:
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
            api.obstacleAwarenessNotice == ObstacleAwarenessNotice.NO_CURRENT_INDICATION)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_acceptedAction() match {
      case Some(action) =>
        api.get_postRecoveryPhase() match {
          case Some(phase) =>
            api.get_navigationBasis() match {
              case Some(basis) =>
                val notice: Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.Type =
                  if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.CURRENT_INDICATION
                  } else if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_AWARENESS_HOLD) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE
                  } else {
                    Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.NO_CURRENT_INDICATION
                  }
                api.put_obstacleAwarenessNotice(notice)
                if (phase != Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.OPEN) {
                  api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
                  if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD) {
                    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_OBSTACLE_INDICATION)
                  } else if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_AWARENESS_HOLD) {
                    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_AWARENESS_LOSS)
                  } else if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD) {
                    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_NAV_EVIDENCE)
                  } else if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_EXTERNAL_HOLD) {
                    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.HELD_EXTERNAL)
                  } else if (phase == Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE) {
                    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.RESET_RELEASE_REQUIRED)
                  } else {
                    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.RESET_REQUIRED)
                  }
                } else if (basis == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.FULL_BASIS &
                  (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_FULL |
                    action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.ACCEPT_RESET)) {
                  api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.FULL_NAV_USE)
                  api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.FULL_USE)
                } else if ((basis == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.RELATIVE_BASIS |
                  basis == Navigation_Obstacle_Awareness_Use_Supervisor.NavigationBasis.LIMITED_BASIS) &
                  (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_RESTRICTED |
                    action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.ACCEPT_RESET)) {
                  api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.RESTRICTED_NAV_USE)
                  api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.RESTRICTED_USE)
                } else {
                  api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
                  api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.RESET_REQUIRED)
                }
              case _ =>
                api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
                api.put_obstacleAwarenessNotice(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE)
                api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.STARTUP_HOLD)
            }
          case _ =>
            api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
            api.put_obstacleAwarenessNotice(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE)
            api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.STARTUP_HOLD)
        }
      case _ =>
        api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
        api.put_obstacleAwarenessNotice(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE)
        api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.STARTUP_HOLD)
    }
  }

  def finalise(api: SupervisionOutcomeOwner_Operational_Api): Unit = { }
}
