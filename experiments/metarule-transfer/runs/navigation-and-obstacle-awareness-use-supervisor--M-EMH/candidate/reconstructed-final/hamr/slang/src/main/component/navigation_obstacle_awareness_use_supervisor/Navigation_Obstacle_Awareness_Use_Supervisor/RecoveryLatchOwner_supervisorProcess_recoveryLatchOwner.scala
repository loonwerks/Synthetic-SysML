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
    Contract(Modifies(committedRecoveryPhase, api))
    committedRecoveryPhase = RecoveryPhase.WAIT_RELEASE
    api.put_preRecoveryPhase(RecoveryPhase.WAIT_RELEASE)
    api.put_postRecoveryPhase(RecoveryPhase.WAIT_RELEASE)
  }

  def timeTriggered(api: RecoveryLatchOwner_Operational_Api): Unit = {
    Contract(
      Modifies(committedRecoveryPhase, api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_PRE_EVALUATION_PHASE
        api.preRecoveryPhase == In(committedRecoveryPhase),
        // guarantee PUBLISH_POST_EVALUATION_PHASE
        api.postRecoveryPhase == committedRecoveryPhase,
        // case CASE_18_CLOSED_RECOVERY_TRANSITIONS
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
            committedRecoveryPhase == RecoveryPhase.OPEN))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val action: AcceptedAction.Type = api.get_acceptedAction() match {
      case Some(value) => value
      case _ => AcceptedAction.APPLY_EXTERNAL_HOLD
    }
    val pre: RecoveryPhase.Type = committedRecoveryPhase
    api.put_preRecoveryPhase(pre)
    val post: RecoveryPhase.Type =
      if (action == AcceptedAction.APPLY_OBSTACLE_HOLD |
          action == AcceptedAction.APPLY_AWARENESS_HOLD |
          action == AcceptedAction.APPLY_NAV_HOLD |
          action == AcceptedAction.APPLY_EXTERNAL_HOLD) RecoveryPhase.LATCHED
      else if (action == AcceptedAction.IGNORE_RESET) RecoveryPhase.WAIT_RELEASE
      else if (action == AcceptedAction.ACCEPT_RESET) RecoveryPhase.OPEN
      else if (pre == RecoveryPhase.LATCHED | pre == RecoveryPhase.WAIT_RELEASE) RecoveryPhase.ARMED
      else pre
    committedRecoveryPhase = post
    api.put_postRecoveryPhase(post)
  }

  def finalise(api: RecoveryLatchOwner_Operational_Api): Unit = { }
}
