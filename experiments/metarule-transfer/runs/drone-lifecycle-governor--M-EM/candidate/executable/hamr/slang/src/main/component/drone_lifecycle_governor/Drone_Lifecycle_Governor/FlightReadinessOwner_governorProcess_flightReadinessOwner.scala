// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightReadinessOwner_governorProcess_flightReadinessOwner {

  def initialise(api: FlightReadinessOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_flightQualification(Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE)
  }

  def timeTriggered(api: FlightReadinessOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04
        //   Invalid navigation or radio makes flight unavailable
        (api.navigationCondition == NavigationCondition.INVALID |
          api.radioCondition == RadioCondition.INVALID) ___>: (api.flightQualification == FlightQualification.UNAVAILABLE),
        // case CASE_05
        //   Non-ready valid navigation or radio is not ready
        (api.navigationCondition != NavigationCondition.INVALID &
          api.radioCondition != RadioCondition.INVALID &
          (api.navigationCondition == NavigationCondition.NOT_READY |
            api.radioCondition == RadioCondition.NOT_READY)) ___>: (api.flightQualification == FlightQualification.NOT_READY),
        // case CASE_06
        //   Both ready sources qualify flight
        (api.navigationCondition == NavigationCondition.READY &
          api.radioCondition == RadioCondition.READY) ___>: (api.flightQualification == FlightQualification.READY)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val navigation = api.get_navigationCondition()
    val radio = api.get_radioCondition()
    (navigation, radio) match {
      case (Some(n), Some(r)) =>
        if (n == NavigationCondition.INVALID | r == RadioCondition.INVALID) {
          api.put_flightQualification(FlightQualification.UNAVAILABLE)
        } else if (n == NavigationCondition.READY & r == RadioCondition.READY) {
          api.put_flightQualification(FlightQualification.READY)
        } else {
          api.put_flightQualification(FlightQualification.NOT_READY)
        }
      case _ =>
        api.put_flightQualification(FlightQualification.NOT_READY)
    }
  }

  def finalise(api: FlightReadinessOwner_Operational_Api): Unit = { }
}
