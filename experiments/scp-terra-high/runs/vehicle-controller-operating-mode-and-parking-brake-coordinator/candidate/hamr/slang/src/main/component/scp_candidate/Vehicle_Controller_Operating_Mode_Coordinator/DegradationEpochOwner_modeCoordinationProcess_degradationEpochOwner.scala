// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner {

  def initialise(api: DegradationEpochOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_factsToConflict(Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts.example())
    api.put_factsToPriority(Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts.example())
    api.put_factsToEpisode(Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts.example())
    api.put_factsToRecovery(Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts.example())
  }

  def timeTriggered(api: DegradationEpochOwner_Operational_Api): Unit = { }
  def finalise(api: DegradationEpochOwner_Operational_Api): Unit = { }
}
