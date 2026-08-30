// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

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
    Contract(Modifies(api))
    (api.get_navigationCondition(), api.get_radioCondition()) match {
      case (Some(navigation), Some(radio)) =>
        val qualification: Drone_Lifecycle_Governor.FlightQualification.Type =
          if (navigation == Drone_Lifecycle_Governor.NavigationCondition.INVALID ||
            radio == Drone_Lifecycle_Governor.RadioCondition.INVALID) Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE
          else if (navigation == Drone_Lifecycle_Governor.NavigationCondition.NOT_READY ||
            radio == Drone_Lifecycle_Governor.RadioCondition.NOT_READY) Drone_Lifecycle_Governor.FlightQualification.NOT_READY
          else Drone_Lifecycle_Governor.FlightQualification.READY
        api.put_flightQualification(qualification)
    }
  }

  def finalise(api: FlightReadinessOwner_Operational_Api): Unit = { }
}
