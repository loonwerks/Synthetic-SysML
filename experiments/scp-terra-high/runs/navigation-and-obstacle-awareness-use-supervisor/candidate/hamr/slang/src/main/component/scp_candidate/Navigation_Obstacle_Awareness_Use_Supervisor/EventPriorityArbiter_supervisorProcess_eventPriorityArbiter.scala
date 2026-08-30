// #Sireum

package scp_candidate.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EventPriorityArbiter_supervisorProcess_eventPriorityArbiter {

  def initialise(api: EventPriorityArbiter_Initialization_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ACCEPTED_ACTION_publications
        api.recoveryAction == api.outcomeAction,
        // guarantee INITIAL_ACCEPTED_ACTION_obstacle
        api.constraintProposal == ConstraintProposal.HOLD_OBSTACLE ___>:
          api.recoveryAction == AcceptedAction.APPLY_OBSTACLE_HOLD,
        // guarantee INITIAL_ACCEPTED_ACTION_awareness
        api.constraintProposal == ConstraintProposal.HOLD_AWARENESS ___>:
          api.recoveryAction == AcceptedAction.APPLY_AWARENESS_HOLD,
        // guarantee INITIAL_ACCEPTED_ACTION_navigation
        api.constraintProposal == ConstraintProposal.HOLD_NAVIGATION ___>:
          api.recoveryAction == AcceptedAction.APPLY_NAV_HOLD,
        // guarantee INITIAL_ACCEPTED_ACTION_external
        (api.constraintProposal == ConstraintProposal.ALLOW_FULL |
           api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          (api.supervisionEvent == SupervisionEvent.FORCE_HOLD_ONLY |
            api.supervisionEvent == SupervisionEvent.FORCE_HOLD_WITH_RESET) ___>:
          api.recoveryAction == AcceptedAction.APPLY_EXTERNAL_HOLD,
        // guarantee INITIAL_ACCEPTED_ACTION_reset
        (api.constraintProposal == ConstraintProposal.ALLOW_FULL |
           api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          api.supervisionEvent == SupervisionEvent.RESET_ONLY &
          api.preRecoveryPhase == RecoveryPhase.ARMED ___>:
          api.recoveryAction == AcceptedAction.ACCEPT_RESET,
        // guarantee INITIAL_ACCEPTED_ACTION_ignore
        (api.constraintProposal == ConstraintProposal.ALLOW_FULL |
           api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          api.supervisionEvent == SupervisionEvent.RESET_ONLY &
          (api.preRecoveryPhase == RecoveryPhase.WAIT_RELEASE |
            api.preRecoveryPhase == RecoveryPhase.LATCHED) ___>:
          api.recoveryAction == AcceptedAction.IGNORE_RESET,
        // guarantee INITIAL_ACCEPTED_ACTION_full
        api.constraintProposal == ConstraintProposal.ALLOW_FULL &
          (api.supervisionEvent == SupervisionEvent.NONE |
            api.supervisionEvent == SupervisionEvent.RESET_ONLY &
              api.preRecoveryPhase == RecoveryPhase.OPEN) ___>:
          api.recoveryAction == AcceptedAction.APPLY_FULL,
        // guarantee INITIAL_ACCEPTED_ACTION_restricted
        api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION &
          (api.supervisionEvent == SupervisionEvent.NONE |
            api.supervisionEvent == SupervisionEvent.RESET_ONLY &
              api.preRecoveryPhase == RecoveryPhase.OPEN) ___>:
          api.recoveryAction == AcceptedAction.APPLY_RESTRICTED
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
    api.put_outcomeAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
  }

  def finalise(api: EventPriorityArbiter_Operational_Api): Unit = { }

  def timeTriggered(api: EventPriorityArbiter_Operational_Api): Unit = {
    val p: ConstraintProposal.Type = api.get_constraintProposal().get
    val e: SupervisionEvent.Type = api.get_supervisionEvent().get
    val r: RecoveryPhase.Type = api.get_preRecoveryPhase().get
    val action: AcceptedAction.Type =
      if (p == ConstraintProposal.HOLD_OBSTACLE) AcceptedAction.APPLY_OBSTACLE_HOLD
      else if (p == ConstraintProposal.HOLD_AWARENESS) AcceptedAction.APPLY_AWARENESS_HOLD
      else if (p == ConstraintProposal.HOLD_NAVIGATION) AcceptedAction.APPLY_NAV_HOLD
      else if (e == SupervisionEvent.FORCE_HOLD_ONLY | e == SupervisionEvent.FORCE_HOLD_WITH_RESET) AcceptedAction.APPLY_EXTERNAL_HOLD
      else if (e == SupervisionEvent.RESET_ONLY & r == RecoveryPhase.ARMED) AcceptedAction.ACCEPT_RESET
      else if (e == SupervisionEvent.RESET_ONLY & (r == RecoveryPhase.WAIT_RELEASE | r == RecoveryPhase.LATCHED)) AcceptedAction.IGNORE_RESET
      else if (p == ConstraintProposal.ALLOW_FULL) AcceptedAction.APPLY_FULL
      else AcceptedAction.APPLY_RESTRICTED
    api.put_recoveryAction(action)
    api.put_outcomeAction(action)
  }
}
