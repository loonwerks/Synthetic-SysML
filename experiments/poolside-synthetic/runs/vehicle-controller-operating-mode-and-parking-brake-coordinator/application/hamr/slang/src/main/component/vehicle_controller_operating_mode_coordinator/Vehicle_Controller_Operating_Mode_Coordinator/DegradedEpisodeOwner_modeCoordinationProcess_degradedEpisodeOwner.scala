// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner {

  def initialise(api: DegradedEpisodeOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_snapshotToRecovery(Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot.example())
    api.put_snapshotToMode(Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot.example())
    api.put_snapshotToBrake(Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot.example())
  }

  def timeTriggered(api: DegradedEpisodeOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_degradationFacts: Option[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts] = api.get_degradationFacts()
    api.logInfo(s"Received on data port degradationFacts: ${apiUsage_degradationFacts}")
    val apiUsage_recoveryDecision: Option[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type] = api.get_recoveryDecision()
    api.logInfo(s"Received on data port recoveryDecision: ${apiUsage_recoveryDecision}")
    val apiUsage_selectedIndication: Option[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type] = api.get_selectedIndication()
    api.logInfo(s"Received on data port selectedIndication: ${apiUsage_selectedIndication}")
  }

  def finalise(api: DegradedEpisodeOwner_Operational_Api): Unit = { }
}
