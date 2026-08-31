// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner {

  // BEGIN STATE VARS
  var committedRecoveryPhase: Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE
  // END STATE VARS

  def initialise(api: RecoveryLatchOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, committedRecoveryPhase))
    committedRecoveryPhase = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE
    api.put_preRecoveryPhase(Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE)
    api.put_postRecoveryPhase(Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE)
  }

  def timeTriggered(api: RecoveryLatchOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, committedRecoveryPhase),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PUBLISH_PRE_EVALUATION_PHASE
        //   Expose the committed phase before this evaluation
        api.preRecoveryPhase == In(committedRecoveryPhase),
        // case CASE_18_CLOSED_RECOVERY_TRANSITIONS
        //   Holds latch recovery and an ignored reset requires release
        (api.acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD |
          api.acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD |
          api.acceptedAction == AcceptedAction.APPLY_NAV_HOLD |
          api.acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD |
          api.acceptedAction == AcceptedAction.IGNORE_RESET |
          (api.acceptedAction == AcceptedAction.APPLY_FULL |
            api.acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
            (In(committedRecoveryPhase) == RecoveryPhase.LATCHED |
              In(committedRecoveryPhase) == RecoveryPhase.WAIT_RELEASE)) ___>: ((api.acceptedAction == AcceptedAction.APPLY_OBSTACLE_HOLD |
          api.acceptedAction == AcceptedAction.APPLY_AWARENESS_HOLD |
          api.acceptedAction == AcceptedAction.APPLY_NAV_HOLD |
          api.acceptedAction == AcceptedAction.APPLY_EXTERNAL_HOLD ___>:
          committedRecoveryPhase == RecoveryPhase.LATCHED) &
          (api.acceptedAction == AcceptedAction.IGNORE_RESET ___>:
            committedRecoveryPhase == RecoveryPhase.WAIT_RELEASE) &
          ((api.acceptedAction == AcceptedAction.APPLY_FULL |
            api.acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
            (In(committedRecoveryPhase) == RecoveryPhase.LATCHED |
              In(committedRecoveryPhase) == RecoveryPhase.WAIT_RELEASE) ___>:
            committedRecoveryPhase == RecoveryPhase.ARMED)),
        // case CASE_19_OPEN_OR_RETAIN_RECOVERY
        //   Only an accepted fresh reset opens recovery
        (api.acceptedAction == AcceptedAction.ACCEPT_RESET |
          (api.acceptedAction == AcceptedAction.APPLY_FULL |
            api.acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
            (In(committedRecoveryPhase) == RecoveryPhase.ARMED |
              In(committedRecoveryPhase) == RecoveryPhase.OPEN)) ___>: ((api.acceptedAction == AcceptedAction.ACCEPT_RESET ___>:
          committedRecoveryPhase == RecoveryPhase.OPEN) &
          ((api.acceptedAction == AcceptedAction.APPLY_FULL |
            api.acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
            In(committedRecoveryPhase) == RecoveryPhase.ARMED ___>:
            committedRecoveryPhase == RecoveryPhase.ARMED) &
          ((api.acceptedAction == AcceptedAction.APPLY_FULL |
            api.acceptedAction == AcceptedAction.APPLY_RESTRICTED) &
            In(committedRecoveryPhase) == RecoveryPhase.OPEN ___>:
            committedRecoveryPhase == RecoveryPhase.OPEN)),
        // case PUBLISH_POST_EVALUATION_PHASE
        //   Expose the committed phase after this evaluation
        api.postRecoveryPhase == committedRecoveryPhase
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val previous = committedRecoveryPhase
    api.put_preRecoveryPhase(previous)
    api.get_acceptedAction() match {
      case Some(action) =>
        if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD |
          action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_AWARENESS_HOLD |
          action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD |
          action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_EXTERNAL_HOLD) {
          committedRecoveryPhase = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.LATCHED
        } else if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.IGNORE_RESET) {
          committedRecoveryPhase = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE
        } else if (action == Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.ACCEPT_RESET) {
          committedRecoveryPhase = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.OPEN
        } else if (previous == Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.LATCHED |
          previous == Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE) {
          committedRecoveryPhase = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.ARMED
        } else {
          committedRecoveryPhase = previous
        }
      case _ =>
        committedRecoveryPhase = Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.LATCHED
    }
    api.put_postRecoveryPhase(committedRecoveryPhase)
  }

  def finalise(api: RecoveryLatchOwner_Operational_Api): Unit = { }
}
