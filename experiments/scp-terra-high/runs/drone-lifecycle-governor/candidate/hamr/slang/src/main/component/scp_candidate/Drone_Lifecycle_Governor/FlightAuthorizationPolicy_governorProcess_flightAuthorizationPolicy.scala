// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy {

  def initialise(api: FlightAuthorizationPolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initialAuthorization
        api.flightAuthorization == FlightAuthorization.DENIED
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_flightAuthorization(Drone_Lifecycle_Governor.FlightAuthorization.DENIED)
  }

  def timeTriggered(api: FlightAuthorizationPolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_decisionSnapshot() match {
      case Some(snapshot) =>
        api.put_flightAuthorization(
          if (snapshot.nextState == Drone_Lifecycle_Governor.DecisionNextState.FLYING)
            Drone_Lifecycle_Governor.FlightAuthorization.PERMITTED
          else Drone_Lifecycle_Governor.FlightAuthorization.DENIED)
    }
  }

  def finalise(api: FlightAuthorizationPolicy_Operational_Api): Unit = { }
}
