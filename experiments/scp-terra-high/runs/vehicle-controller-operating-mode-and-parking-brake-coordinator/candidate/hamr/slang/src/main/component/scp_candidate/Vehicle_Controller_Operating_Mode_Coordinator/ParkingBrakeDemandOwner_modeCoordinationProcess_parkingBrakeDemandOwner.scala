// #Sireum

package scp_candidate.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner {

  def initialise(api: ParkingBrakeDemandOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_brakeDemand(Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.RequireApply)
  }

  def timeTriggered(api: ParkingBrakeDemandOwner_Operational_Api): Unit = { }
  def finalise(api: ParkingBrakeDemandOwner_Operational_Api): Unit = { }
}
