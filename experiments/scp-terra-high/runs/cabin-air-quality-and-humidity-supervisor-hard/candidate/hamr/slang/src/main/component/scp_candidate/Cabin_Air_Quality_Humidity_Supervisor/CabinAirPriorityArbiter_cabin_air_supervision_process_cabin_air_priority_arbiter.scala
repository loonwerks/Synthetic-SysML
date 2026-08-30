// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter {

  def initialise(api: CabinAirPriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selection_to_composer(Cabin_Air_Quality_Humidity_Supervisor.SelectionReport.example())
    api.put_selection_to_status(Cabin_Air_Quality_Humidity_Supervisor.SelectionReport.example())
  }

  def timeTriggered(api: CabinAirPriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: CabinAirPriorityArbiter_Operational_Api): Unit = { }
}
