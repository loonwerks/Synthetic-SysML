// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner {

  def initialise(api: ServiceEventOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_serviceFacts(Vehicle_Mode_Coordinator.ServiceFacts.example())
  }

  def timeTriggered(api: ServiceEventOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_serviceLevels: Option[Vehicle_Mode_Coordinator.ServiceLevels] = api.get_serviceLevels()
    api.logInfo(s"Received on data port serviceLevels: ${apiUsage_serviceLevels}")
  }

  def finalise(api: ServiceEventOwner_Operational_Api): Unit = { }
}
