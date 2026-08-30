// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightReadinessOwner_governorProcess_flightReadinessOwner {

  def initialise(api: FlightReadinessOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_flightQualification(Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE)
  }

  def timeTriggered(api: FlightReadinessOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_04
        //   nav or radio INVALID -> flightQualification UNAVAILABLE
        (api.navigationCondition == NavigationCondition.INVALID |
          api.radioCondition == RadioCondition.INVALID) ___>: (api.flightQualification == FlightQualification.UNAVAILABLE),
        // case CASE_05
        //   not INVALID and one NOT_READY -> NOT READY
        (api.navigationCondition != NavigationCondition.INVALID &
          api.radioCondition != RadioCondition.INVALID &
          (api.navigationCondition == NavigationCondition.NOT_READY |
            api.radioCondition == RadioCondition.NOT_READY)) ___>: (api.flightQualification == FlightQualification.NOT_READY),
        // case CASE_06
        //   nav READY and radio READY -> READY
        (api.navigationCondition == NavigationCondition.READY &
          api.radioCondition == RadioCondition.READY) ___>: (api.flightQualification == FlightQualification.READY)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_navigationCondition: Option[Drone_Lifecycle_Governor.NavigationCondition.Type] = api.get_navigationCondition()
    api.logInfo(s"Received on data port navigationCondition: ${apiUsage_navigationCondition}")
    val apiUsage_radioCondition: Option[Drone_Lifecycle_Governor.RadioCondition.Type] = api.get_radioCondition()
    api.logInfo(s"Received on data port radioCondition: ${apiUsage_radioCondition}")
  }

  def finalise(api: FlightReadinessOwner_Operational_Api): Unit = { }
}
