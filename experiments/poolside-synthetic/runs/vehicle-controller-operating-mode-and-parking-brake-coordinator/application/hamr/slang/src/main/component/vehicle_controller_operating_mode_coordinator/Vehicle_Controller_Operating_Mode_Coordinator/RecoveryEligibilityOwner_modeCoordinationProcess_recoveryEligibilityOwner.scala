// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner {

  def initialise(api: RecoveryEligibilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_decisionToEpisode(Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.NotApplicable)
    api.put_decisionToDemand(Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.NotApplicable)
    api.put_decisionToMode(Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.NotApplicable)
  }

  def timeTriggered(api: RecoveryEligibilityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_conflictClass: Option[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type] = api.get_conflictClass()
    api.logInfo(s"Received on data port conflictClass: ${apiUsage_conflictClass}")
    val apiUsage_selectedIndication: Option[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type] = api.get_selectedIndication()
    api.logInfo(s"Received on data port selectedIndication: ${apiUsage_selectedIndication}")
    val apiUsage_degradationFacts: Option[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts] = api.get_degradationFacts()
    api.logInfo(s"Received on data port degradationFacts: ${apiUsage_degradationFacts}")
    val apiUsage_returnFacts: Option[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts] = api.get_returnFacts()
    api.logInfo(s"Received on data port returnFacts: ${apiUsage_returnFacts}")
    val apiUsage_episodeSnapshot: Option[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot] = api.get_episodeSnapshot()
    api.logInfo(s"Received on data port episodeSnapshot: ${apiUsage_episodeSnapshot}")
  }

  def finalise(api: RecoveryEligibilityOwner_Operational_Api): Unit = { }
}
