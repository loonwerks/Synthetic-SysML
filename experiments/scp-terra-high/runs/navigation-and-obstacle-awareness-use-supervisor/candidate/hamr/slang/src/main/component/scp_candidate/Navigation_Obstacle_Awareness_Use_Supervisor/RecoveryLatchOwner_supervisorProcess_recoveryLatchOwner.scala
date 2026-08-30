// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner {

  // BEGIN STATE VARS
  var committedRecoveryPhase: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE
  // END STATE VARS

  def initialise(api: RecoveryLatchOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        committedRecoveryPhase
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RECOVERY_CLOSED_state
        committedRecoveryPhase == RecoveryPhase.WAIT_RELEASE,
        // guarantee INITIAL_RECOVERY_CLOSED_pre
        api.preRecoveryPhase == RecoveryPhase.WAIT_RELEASE,
        // guarantee INITIAL_RECOVERY_CLOSED_post
        api.postRecoveryPhase == RecoveryPhase.WAIT_RELEASE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_preRecoveryPhase(Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE)
    api.put_postRecoveryPhase(Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE)
  }

  def finalise(api: RecoveryLatchOwner_Operational_Api): Unit = { }

  def timeTriggered(api: RecoveryLatchOwner_Operational_Api): Unit = {
    val prior = committedRecoveryPhase
    api.put_preRecoveryPhase(prior)
    val a: AcceptedAction.Type = api.get_acceptedAction().get
    if (a == AcceptedAction.APPLY_OBSTACLE_HOLD | a == AcceptedAction.APPLY_AWARENESS_HOLD |
      a == AcceptedAction.APPLY_NAV_HOLD | a == AcceptedAction.APPLY_EXTERNAL_HOLD) {
      committedRecoveryPhase = RecoveryPhase.LATCHED
    } else if (a == AcceptedAction.IGNORE_RESET) {
      committedRecoveryPhase = RecoveryPhase.WAIT_RELEASE
    } else if (a == AcceptedAction.ACCEPT_RESET) {
      committedRecoveryPhase = RecoveryPhase.OPEN
    } else if (prior == RecoveryPhase.LATCHED | prior == RecoveryPhase.WAIT_RELEASE) {
      committedRecoveryPhase = RecoveryPhase.ARMED
    }
    api.put_postRecoveryPhase(committedRecoveryPhase)
  }
}
