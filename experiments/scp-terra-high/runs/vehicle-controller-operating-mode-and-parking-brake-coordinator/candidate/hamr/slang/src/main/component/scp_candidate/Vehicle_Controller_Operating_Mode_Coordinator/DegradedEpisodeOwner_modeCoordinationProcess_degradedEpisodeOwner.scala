// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner {

  def initialise(api: DegradedEpisodeOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_snapshotToRecovery(Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot.example())
    api.put_snapshotToMode(Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot.example())
    api.put_snapshotToBrake(Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot.example())
  }

  def timeTriggered(api: DegradedEpisodeOwner_Operational_Api): Unit = { }
  def finalise(api: DegradedEpisodeOwner_Operational_Api): Unit = { }
}
