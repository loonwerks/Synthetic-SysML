// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestApplicabilityOwner_governorProcess_requestApplicabilityOwner {

  def initialise(api: RequestApplicabilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_semanticsToAirborne(Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest.example())
    api.put_semanticsToLifecycle(Drone_Lifecycle_Energy_Governor.LifecycleClassifiedRequest.example())
  }

  def timeTriggered(api: RequestApplicabilityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIn: Option[Drone_Lifecycle_Energy_Governor.LifecycleRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
  }

  def finalise(api: RequestApplicabilityOwner_Operational_Api): Unit = { }
}
