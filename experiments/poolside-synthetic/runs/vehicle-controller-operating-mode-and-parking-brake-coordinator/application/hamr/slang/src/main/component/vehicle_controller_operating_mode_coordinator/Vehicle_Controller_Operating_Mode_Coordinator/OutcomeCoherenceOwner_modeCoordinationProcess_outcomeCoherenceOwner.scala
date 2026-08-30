// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner {

  def initialise(api: OutcomeCoherenceOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_coordinationFrame(Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame.example())
  }

  def timeTriggered(api: OutcomeCoherenceOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_modeDecision: Option[Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision] = api.get_modeDecision()
    api.logInfo(s"Received on data port modeDecision: ${apiUsage_modeDecision}")
    val apiUsage_brakeDemand: Option[Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type] = api.get_brakeDemand()
    api.logInfo(s"Received on data port brakeDemand: ${apiUsage_brakeDemand}")
  }

  def finalise(api: OutcomeCoherenceOwner_Operational_Api): Unit = { }
}
