// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy {

  def initialise(api: FlightAuthorizationPolicy_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_flightAuthorization(Drone_Lifecycle_Governor.FlightAuthorization.DENIED)
  }

  def timeTriggered(api: FlightAuthorizationPolicy_Operational_Api): Unit = {
    // example api usage

    val apiUsage_decisionSnapshot: Option[Drone_Lifecycle_Governor.DecisionSnapshot] = api.get_decisionSnapshot()
    api.logInfo(s"Received on data port decisionSnapshot: ${apiUsage_decisionSnapshot}")
  }

  def finalise(api: FlightAuthorizationPolicy_Operational_Api): Unit = { }
}
