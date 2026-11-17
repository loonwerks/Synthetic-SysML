// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EventPriorityArbiter_supervisorProcess_eventPriorityArbiter {

  def initialise(api: EventPriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
    api.put_outcomeAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
  }

  def timeTriggered(api: EventPriorityArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESERVE_ACTION_PUBLICATIONS
        api.outcomeAction == api.recoveryAction,
        // case CASE_15_EVIDENCE_HOLD_PRIORITY
        (api.constraintProposal == ConstraintProposal.HOLD_OBSTACLE |
          api.constraintProposal == ConstraintProposal.HOLD_AWARENESS |
          api.constraintProposal == ConstraintProposal.HOLD_NAVIGATION) ___>: ((api.constraintProposal == ConstraintProposal.HOLD_OBSTACLE ___>:
          api.recoveryAction == AcceptedAction.APPLY_OBSTACLE_HOLD) &
          (api.constraintProposal == ConstraintProposal.HOLD_AWARENESS ___>:
            api.recoveryAction == AcceptedAction.APPLY_AWARENESS_HOLD) &
          (api.constraintProposal == ConstraintProposal.HOLD_NAVIGATION ___>:
            api.recoveryAction == AcceptedAction.APPLY_NAV_HOLD)),
        // case CASE_16_EVENT_AND_RESET_PRIORITY
        ((api.constraintProposal == ConstraintProposal.ALLOW_FULL |
          api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          api.supervisionEvent != SupervisionEvent.NONE) ___>: ((api.supervisionEvent == SupervisionEvent.FORCE_HOLD_ONLY |
          api.supervisionEvent == SupervisionEvent.FORCE_HOLD_WITH_RESET ___>:
          api.recoveryAction == AcceptedAction.APPLY_EXTERNAL_HOLD) &
          (api.supervisionEvent == SupervisionEvent.RESET_ONLY &
            api.preRecoveryPhase == RecoveryPhase.ARMED ___>:
            api.recoveryAction == AcceptedAction.ACCEPT_RESET) &
          (api.supervisionEvent == SupervisionEvent.RESET_ONLY &
            (api.preRecoveryPhase == RecoveryPhase.WAIT_RELEASE |
              api.preRecoveryPhase == RecoveryPhase.LATCHED) ___>:
            api.recoveryAction == AcceptedAction.IGNORE_RESET) &
          (api.supervisionEvent == SupervisionEvent.RESET_ONLY &
            api.preRecoveryPhase == RecoveryPhase.OPEN &
            api.constraintProposal == ConstraintProposal.ALLOW_FULL ___>:
            api.recoveryAction == AcceptedAction.APPLY_FULL) &
          (api.supervisionEvent == SupervisionEvent.RESET_ONLY &
            api.preRecoveryPhase == RecoveryPhase.OPEN &
            api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION ___>:
            api.recoveryAction == AcceptedAction.APPLY_RESTRICTED)),
        // case CASE_17_SAFE_USE
        ((api.constraintProposal == ConstraintProposal.ALLOW_FULL |
          api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          api.supervisionEvent == SupervisionEvent.NONE) ___>: ((api.constraintProposal == ConstraintProposal.ALLOW_FULL ___>:
          api.recoveryAction == AcceptedAction.APPLY_FULL) &
          (api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION ___>:
            api.recoveryAction == AcceptedAction.APPLY_RESTRICTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val p = api.get_constraintProposal()
    val e = api.get_supervisionEvent()
    val q = api.get_preRecoveryPhase()
    val r: AcceptedAction.Type =
      if (p == Some(ConstraintProposal.HOLD_OBSTACLE)) AcceptedAction.APPLY_OBSTACLE_HOLD
      else if (p == Some(ConstraintProposal.HOLD_AWARENESS)) AcceptedAction.APPLY_AWARENESS_HOLD
      else if (p == Some(ConstraintProposal.HOLD_NAVIGATION)) AcceptedAction.APPLY_NAV_HOLD
      else if (e == Some(SupervisionEvent.FORCE_HOLD_ONLY) | e == Some(SupervisionEvent.FORCE_HOLD_WITH_RESET)) AcceptedAction.APPLY_EXTERNAL_HOLD
      else if (e == Some(SupervisionEvent.RESET_ONLY) & q == Some(RecoveryPhase.ARMED)) AcceptedAction.ACCEPT_RESET
      else if (e == Some(SupervisionEvent.RESET_ONLY) & (q == Some(RecoveryPhase.WAIT_RELEASE) | q == Some(RecoveryPhase.LATCHED))) AcceptedAction.IGNORE_RESET
      else if (p == Some(ConstraintProposal.ALLOW_FULL)) AcceptedAction.APPLY_FULL
      else if (p == Some(ConstraintProposal.RESTRICT_NAVIGATION)) AcceptedAction.APPLY_RESTRICTED
      else AcceptedAction.APPLY_EXTERNAL_HOLD
    api.put_recoveryAction(r)
    api.put_outcomeAction(r)
  }

  def finalise(api: EventPriorityArbiter_Operational_Api): Unit = { }
}
