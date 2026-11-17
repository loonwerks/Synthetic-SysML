// #Sireum

package navigation_obstacle_awareness_use_supervisor.Navigation_Obstacle_Awareness_Use_Supervisor

import org.sireum._
import navigation_obstacle_awareness_use_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryLatchOwner_supervisorProcess_recoveryLatchOwner {

  def initialise(api: RecoveryLatchOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_preRecoveryPhase(Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE)
    api.put_postRecoveryPhase(Navigation_Obstacle_Awareness_Use_Supervisor.RecoveryPhase.WAIT_RELEASE)
  }

  def timeTriggered(api: RecoveryLatchOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_acceptedAction: Option[Navigation_Obstacle_Awareness_Use_Supervisor.AcceptedAction.Type] = api.get_acceptedAction()
    api.logInfo(s"Received on data port acceptedAction: ${apiUsage_acceptedAction}")
  }

  def finalise(api: RecoveryLatchOwner_Operational_Api): Unit = { }
}
