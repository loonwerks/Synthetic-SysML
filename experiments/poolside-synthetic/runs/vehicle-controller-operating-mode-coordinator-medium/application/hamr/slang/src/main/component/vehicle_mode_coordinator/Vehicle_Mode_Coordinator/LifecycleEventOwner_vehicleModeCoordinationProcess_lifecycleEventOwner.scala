// #Sireum

package vehicle_mode_coordinator.Vehicle_Mode_Coordinator

import org.sireum._
import vehicle_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner {

  def initialise(api: LifecycleEventOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_lifecycleFacts(Vehicle_Mode_Coordinator.LifecycleFacts.example())
  }

  def timeTriggered(api: LifecycleEventOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_lifecycleLevels: Option[Vehicle_Mode_Coordinator.LifecycleLevels] = api.get_lifecycleLevels()
    api.logInfo(s"Received on data port lifecycleLevels: ${apiUsage_lifecycleLevels}")
  }

  def finalise(api: LifecycleEventOwner_Operational_Api): Unit = { }
}
