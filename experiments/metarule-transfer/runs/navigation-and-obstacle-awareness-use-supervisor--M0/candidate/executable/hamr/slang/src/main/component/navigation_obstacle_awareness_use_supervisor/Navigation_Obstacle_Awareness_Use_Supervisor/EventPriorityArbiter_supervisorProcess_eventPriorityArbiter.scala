// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EventPriorityArbiter_supervisorProcess_eventPriorityArbiter {

  def initialise(api: EventPriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_recoveryAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
    api.put_outcomeAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
  }

  def timeTriggered(api: EventPriorityArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PRESERVE_ACTION_PUBLICATIONS
        //   Publish the selected accepted action
        api.outcomeAction == api.recoveryAction,
        // case CASE_15_EVIDENCE_HOLD_PRIORITY
        //   Evidence holds override event and reset processing
        (api.constraintProposal == ConstraintProposal.HOLD_OBSTACLE ___>:
          api.recoveryAction == AcceptedAction.APPLY_OBSTACLE_HOLD) &
          (api.constraintProposal == ConstraintProposal.HOLD_AWARENESS ___>:
            api.recoveryAction == AcceptedAction.APPLY_AWARENESS_HOLD) &
          (api.constraintProposal == ConstraintProposal.HOLD_NAVIGATION ___>:
            api.recoveryAction == AcceptedAction.APPLY_NAV_HOLD),
        // case CASE_16_EVENT_AND_RESET_PRIORITY
        //   Force-hold precedes reset and reset needs an armed phase
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
        //   No event preserves the evidence-based use proposal
        ((api.constraintProposal == ConstraintProposal.ALLOW_FULL |
          api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION) &
          api.supervisionEvent == SupervisionEvent.NONE) ___>: ((api.constraintProposal == ConstraintProposal.ALLOW_FULL ___>:
          api.recoveryAction == AcceptedAction.APPLY_FULL) &
          (api.constraintProposal == ConstraintProposal.RESTRICT_NAVIGATION ___>:
            api.recoveryAction == AcceptedAction.APPLY_RESTRICTED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_supervisionEvent() match {
      case Some(event) =>
        api.get_constraintProposal() match {
          case Some(proposal) =>
            api.get_preRecoveryPhase() match {
              case Some(phase) =>
                val action: Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type =
                  if (proposal == Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_OBSTACLE) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD
                  } else if (proposal == Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_AWARENESS) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_AWARENESS_HOLD
                  } else if (proposal == Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.HOLD_NAVIGATION) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD
                  } else if (event == Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.FORCE_HOLD_ONLY |
                    event == Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.FORCE_HOLD_WITH_RESET) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_EXTERNAL_HOLD
                  } else if (event == Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.RESET_ONLY &
                    phase == Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.ARMED) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.ACCEPT_RESET
                  } else if (event == Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.RESET_ONLY &
                    (phase == Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE |
                      phase == Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.LATCHED)) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.IGNORE_RESET
                  } else if (proposal == Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.ALLOW_FULL) {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_FULL
                  } else {
                    Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_RESTRICTED
                  }
                api.put_recoveryAction(action)
                api.put_outcomeAction(action)
              case _ =>
                api.put_recoveryAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD)
                api.put_outcomeAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD)
            }
          case _ =>
            api.put_recoveryAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD)
            api.put_outcomeAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD)
        }
      case _ =>
        api.put_recoveryAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD)
        api.put_outcomeAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_NAV_HOLD)
    }
  }

  def finalise(api: EventPriorityArbiter_Operational_Api): Unit = { }
}
