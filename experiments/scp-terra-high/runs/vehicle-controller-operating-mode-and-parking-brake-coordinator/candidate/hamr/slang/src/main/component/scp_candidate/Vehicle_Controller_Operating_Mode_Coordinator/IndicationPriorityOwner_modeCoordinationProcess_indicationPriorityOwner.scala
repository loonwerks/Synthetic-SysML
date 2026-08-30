// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner {

  def initialise(api: IndicationPriorityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selectionToDemand(Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.InvalidSelected)
    api.put_selectionToSession(Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.InvalidSelected)
    api.put_selectionToRecovery(Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.InvalidSelected)
    api.put_selectionToEpisode(Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.InvalidSelected)
    api.put_selectionToBrake(Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.InvalidSelected)
  }

  def timeTriggered(api: IndicationPriorityOwner_Operational_Api): Unit = { }
  def finalise(api: IndicationPriorityOwner_Operational_Api): Unit = { }
}
