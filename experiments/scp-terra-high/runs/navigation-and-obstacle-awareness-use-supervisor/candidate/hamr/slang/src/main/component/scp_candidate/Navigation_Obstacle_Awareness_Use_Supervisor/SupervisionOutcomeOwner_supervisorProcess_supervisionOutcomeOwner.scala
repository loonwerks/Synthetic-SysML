// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisionOutcomeOwner_supervisorProcess_supervisionOutcomeOwner {

  def initialise(api: SupervisionOutcomeOwner_Initialization_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_SAFE_OUTPUTS_directive
        api.navigationUseDirective == NavigationUseDirective.MOTION_INHIBITED,
        // guarantee INITIAL_SAFE_OUTPUTS_notice
        api.obstacleAwarenessNotice == ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE,
        // guarantee INITIAL_SAFE_OUTPUTS_status
        api.supervisionStatus == SupervisionStatus.STARTUP_HOLD
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_navigationUseDirective(Navigation_Obstacle_Awareness_Use_Supervisor.NavigationUseDirective.MOTION_INHIBITED)
    api.put_obstacleAwarenessNotice(Navigation_Obstacle_Awareness_Use_Supervisor.ObstacleAwarenessNotice.NO_CURRENT_INDICATION)
    api.put_supervisionStatus(Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionStatus.STARTUP_HOLD)
  }

  def finalise(api: SupervisionOutcomeOwner_Operational_Api): Unit = { }

  def timeTriggered(api: SupervisionOutcomeOwner_Operational_Api): Unit = {
    val a: AcceptedAction.Type = api.get_acceptedAction().get
    val p: RecoveryPhase.Type = api.get_postRecoveryPhase().get
    val b: NavigationBasis.Type = api.get_navigationBasis().get
    val notice: ObstacleAwarenessNotice.Type =
      if (a == AcceptedAction.APPLY_OBSTACLE_HOLD) ObstacleAwarenessNotice.CURRENT_INDICATION
      else if (a == AcceptedAction.APPLY_AWARENESS_HOLD) ObstacleAwarenessNotice.AWARENESS_UNAVAILABLE
      else ObstacleAwarenessNotice.NO_CURRENT_INDICATION
    val directive: NavigationUseDirective.Type =
      if (p == RecoveryPhase.OPEN & b == NavigationBasis.FULL_BASIS & (a == AcceptedAction.APPLY_FULL | a == AcceptedAction.ACCEPT_RESET)) NavigationUseDirective.FULL_NAV_USE
      else if (p == RecoveryPhase.OPEN & (b == NavigationBasis.RELATIVE_BASIS | b == NavigationBasis.LIMITED_BASIS) & (a == AcceptedAction.APPLY_RESTRICTED | a == AcceptedAction.ACCEPT_RESET)) NavigationUseDirective.RESTRICTED_NAV_USE
      else NavigationUseDirective.MOTION_INHIBITED
    val status: SupervisionStatus.Type =
      if (directive == NavigationUseDirective.FULL_NAV_USE) SupervisionStatus.FULL_USE
      else if (directive == NavigationUseDirective.RESTRICTED_NAV_USE) SupervisionStatus.RESTRICTED_USE
      else if (a == AcceptedAction.APPLY_OBSTACLE_HOLD) SupervisionStatus.HELD_OBSTACLE_INDICATION
      else if (a == AcceptedAction.APPLY_AWARENESS_HOLD) SupervisionStatus.HELD_AWARENESS_LOSS
      else if (a == AcceptedAction.APPLY_EXTERNAL_HOLD) SupervisionStatus.HELD_EXTERNAL
      else if (p == RecoveryPhase.WAIT_RELEASE) SupervisionStatus.RESET_RELEASE_REQUIRED
      else if (p == RecoveryPhase.ARMED) SupervisionStatus.RESET_REQUIRED
      else SupervisionStatus.HELD_NAV_EVIDENCE
    api.put_navigationUseDirective(directive)
    api.put_obstacleAwarenessNotice(notice)
    api.put_supervisionStatus(status)
  }
}
