// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy {

  def initialise(api: FlightAuthorizationPolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_flightAuthorization(Drone_Lifecycle_Governor.FlightAuthorization.DENIED)
  }

  def timeTriggered(api: FlightAuthorizationPolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_19
        //   Only flying state permits flight | N.md#CASE_19
        (api.decisionSnapshot.nextState == DecisionNextState.OFF |
          api.decisionSnapshot.nextState == DecisionNextState.STANDBY |
          api.decisionSnapshot.nextState == DecisionNextState.CHARGING |
          api.decisionSnapshot.nextState == DecisionNextState.READY |
          api.decisionSnapshot.nextState == DecisionNextState.FLYING) ___>: (api.decisionSnapshot.nextState == DecisionNextState.FLYING &
          api.flightAuthorization == FlightAuthorization.PERMITTED |
          api.decisionSnapshot.nextState != DecisionNextState.FLYING &
            api.flightAuthorization == FlightAuthorization.DENIED)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_decisionSnapshot().get
    if (decision.nextState == DecisionNextState.FLYING) {
      api.put_flightAuthorization(FlightAuthorization.PERMITTED)
    } else {
      api.put_flightAuthorization(FlightAuthorization.DENIED)
    }
  }

  def finalise(api: FlightAuthorizationPolicy_Operational_Api): Unit = { }
}
