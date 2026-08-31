// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner {

  def initialise(api: SupervisionOutcomeOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
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
      Modifies(api),
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
    val action = api.get_acceptedAction()
    val phase = api.get_postRecoveryPhase()
    val basis = api.get_navigationBasis()
    val notice: ObstacleAwarenessNotice.Type =
      if (action == Some(AcceptedAction.APPLY_OBSTACLE_HOLD)) ObstacleAwarenessNotice.CURRENT_INDICATION
      else if (action == Some(AcceptedAction.APPLY_AWARENESS_HOLD)) ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE
      else ObstacleAwarenessNotice.NO_CURRENT_INDICATION
    val directive: NavigationUseDirective.Type =
      if (phase == Some(RecoveryPhase.OPEN) & basis == Some(NavigationBasis.FULL_BASIS) &
        (action == Some(AcceptedAction.APPLY_FULL) | action == Some(AcceptedAction.ACCEPT_RESET))) {
        NavigationUseDirective.FULL_NAV_USE
      } else if (phase == Some(RecoveryPhase.OPEN) &
        (basis == Some(NavigationBasis.RELATIVE_BASIS) | basis == Some(NavigationBasis.LIMITED_BASIS)) &
        (action == Some(AcceptedAction.APPLY_RESTRICTED) | action == Some(AcceptedAction.ACCEPT_RESET))) {
        NavigationUseDirective.RESTRICTED_NAV_USE
      } else {
        NavigationUseDirective.MOTION_INHIBITED
      }
    val status: SupervisionStatus.Type =
      if (action == Some(AcceptedAction.APPLY_OBSTACLE_HOLD)) {
        SupervisionStatus.HELD_OBSTACLE_INDICATION
      } else if (action == Some(AcceptedAction.APPLY_AWARENESS_HOLD)) {
        SupervisionStatus.HELD_AWARENESS_LOSS
      } else if (action == Some(AcceptedAction.APPLY_NAV_HOLD)) {
        SupervisionStatus.HELD_NAV_EVIDENCE
      } else if (action == Some(AcceptedAction.APPLY_EXTERNAL_HOLD)) {
        SupervisionStatus.HELD_EXTERNAL
      } else if (phase == Some(RecoveryPhase.WAIT_RELEASE) &
        (action == Some(AcceptedAction.IGNORE_RESET) | action == Some(AcceptedAction.APPLY_FULL) | action == Some(AcceptedAction.APPLY_RESTRICTED))) {
        SupervisionStatus.RESET_RELEASE_REQUIRED
      } else if (phase == Some(RecoveryPhase.ARMED) &
        (action == Some(AcceptedAction.APPLY_FULL) | action == Some(AcceptedAction.APPLY_RESTRICTED))) {
        SupervisionStatus.RESET_REQUIRED
      } else if (directive == NavigationUseDirective.FULL_NAV_USE) {
        SupervisionStatus.FULL_USE
      } else if (directive == NavigationUseDirective.RESTRICTED_NAV_USE) {
        SupervisionStatus.RESTRICTED_USE
      } else {
        SupervisionStatus.STARTUP_HOLD
      }
    api.put_navigationUseDirective(directive)
    api.put_obstacleAwarenessNotice(notice)
    api.put_supervisionStatus(status)
  }

  def finalise(api: SupervisionOutcomeOwner_Operational_Api): Unit = { }
}
