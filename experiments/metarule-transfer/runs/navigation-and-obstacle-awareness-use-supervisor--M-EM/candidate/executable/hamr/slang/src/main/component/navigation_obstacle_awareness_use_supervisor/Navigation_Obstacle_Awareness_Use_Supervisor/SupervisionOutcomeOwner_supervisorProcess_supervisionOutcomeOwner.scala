// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner {

  def initialise(api: SupervisionOutcomeOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_navigationUseDirective(NavigationUseDirective.MOTION_INHIBITED)
    api.put_obstacleAwarenessNotice(ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE)
    api.put_supervisionStatus(SupervisionStatus.STARTUP_HOLD)
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
    val action = api.get_acceptedAction().get
    val phase = api.get_postRecoveryPhase().get
    val basis = api.get_navigationBasis().get
    if (action == AcceptedAction.APPLY_OBSTACLE_HOLD) {
      api.put_obstacleAwarenessNotice(ObstacleAwarenessNotice.CURRENT_INDICATION)
    } else if (action == AcceptedAction.APPLY_AWARENESS_HOLD) {
      api.put_obstacleAwarenessNotice(ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE)
    } else {
      api.put_obstacleAwarenessNotice(ObstacleAwarenessNotice.NO_CURRENT_INDICATION)
    }
    if (phase != RecoveryPhase.OPEN) {
      api.put_navigationUseDirective(NavigationUseDirective.MOTION_INHIBITED)
      if (action == AcceptedAction.APPLY_OBSTACLE_HOLD) {
        api.put_supervisionStatus(SupervisionStatus.HELD_OBSTACLE_INDICATION)
      } else if (action == AcceptedAction.APPLY_AWARENESS_HOLD) {
        api.put_supervisionStatus(SupervisionStatus.HELD_AWARENESS_LOSS)
      } else if (action == AcceptedAction.APPLY_NAV_HOLD) {
        api.put_supervisionStatus(SupervisionStatus.HELD_NAV_EVIDENCE)
      } else if (action == AcceptedAction.APPLY_EXTERNAL_HOLD) {
        api.put_supervisionStatus(SupervisionStatus.HELD_EXTERNAL)
      } else if (phase == RecoveryPhase.WAIT_RELEASE) {
        api.put_supervisionStatus(SupervisionStatus.RESET_RELEASE_REQUIRED)
      } else if (phase == RecoveryPhase.ARMED) {
        api.put_supervisionStatus(SupervisionStatus.RESET_REQUIRED)
      } else {
        api.put_supervisionStatus(SupervisionStatus.STARTUP_HOLD)
      }
    } else if (basis == NavigationBasis.FULL_BASIS) {
      api.put_navigationUseDirective(NavigationUseDirective.FULL_NAV_USE)
      api.put_supervisionStatus(SupervisionStatus.FULL_USE)
    } else {
      api.put_navigationUseDirective(NavigationUseDirective.RESTRICTED_NAV_USE)
      api.put_supervisionStatus(SupervisionStatus.RESTRICTED_USE)
    }
  }

  def finalise(api: SupervisionOutcomeOwner_Operational_Api): Unit = { }
}
