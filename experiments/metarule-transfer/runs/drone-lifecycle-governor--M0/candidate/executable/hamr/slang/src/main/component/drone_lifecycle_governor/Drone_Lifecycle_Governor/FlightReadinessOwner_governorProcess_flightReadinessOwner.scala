// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightReadinessOwner_governorProcess_flightReadinessOwner {

  def initialise(api: FlightReadinessOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_flightQualification(Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE)
  }

  def timeTriggered(api: FlightReadinessOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04
        //   Invalid navigation or radio is unavailable | N.md#CASE_04
        (api.navigationCondition == NavigationCondition.INVALID |
          api.radioCondition == RadioCondition.INVALID) ___>: (api.flightQualification == FlightQualification.UNAVAILABLE),
        // case CASE_05
        //   Non-invalid incomplete readiness is not ready | N.md#CASE_05
        (api.navigationCondition != NavigationCondition.INVALID &
          api.radioCondition != RadioCondition.INVALID &
          (api.navigationCondition == NavigationCondition.NOT_READY |
            api.radioCondition == RadioCondition.NOT_READY)) ___>: (api.flightQualification == FlightQualification.NOT_READY),
        // case CASE_06
        //   Both ready observations qualify flight | N.md#CASE_06
        (api.navigationCondition == NavigationCondition.READY &
          api.radioCondition == RadioCondition.READY) ___>: (api.flightQualification == FlightQualification.READY)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val navigation = api.get_navigationCondition().get
    val radio = api.get_radioCondition().get
    val qualification: FlightQualification.Type =
      if (navigation == NavigationCondition.INVALID | radio == RadioCondition.INVALID) {
        FlightQualification.UNAVAILABLE
      } else if (navigation == NavigationCondition.NOT_READY | radio == RadioCondition.NOT_READY) {
        FlightQualification.NOT_READY
      } else {
        FlightQualification.READY
      }
    api.put_flightQualification(qualification)
  }

  def finalise(api: FlightReadinessOwner_Operational_Api): Unit = { }
}
