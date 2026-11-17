// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EventPriorityArbiter_supervisorProcess_eventPriorityArbiter {

  def initialise(api: EventPriorityArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
    api.put_outcomeAction(Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.APPLY_OBSTACLE_HOLD)
  }

  def timeTriggered(api: EventPriorityArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_supervisionEvent: Option[Navigation_Obstacle_Awareness_Use_Supervisor.SupervisionEvent.Type] = api.get_supervisionEvent()
    api.logInfo(s"Received on data port supervisionEvent: ${apiUsage_supervisionEvent}")
    val apiUsage_constraintProposal: Option[Navigation_Obstacle_Awareness_Use_Supervisor.ConstraintProposal.Type] = api.get_constraintProposal()
    api.logInfo(s"Received on data port constraintProposal: ${apiUsage_constraintProposal}")
    val apiUsage_preRecoveryPhase: Option[Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.Type] = api.get_preRecoveryPhase()
    api.logInfo(s"Received on data port preRecoveryPhase: ${apiUsage_preRecoveryPhase}")
  }

  def finalise(api: EventPriorityArbiter_Operational_Api): Unit = { }
}
