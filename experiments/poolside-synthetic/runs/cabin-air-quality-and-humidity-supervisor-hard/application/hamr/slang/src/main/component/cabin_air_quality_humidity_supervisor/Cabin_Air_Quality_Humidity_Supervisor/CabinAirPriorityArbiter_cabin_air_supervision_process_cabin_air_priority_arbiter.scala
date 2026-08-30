// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter {

  def initialise(api: CabinAirPriorityArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selection_to_composer(Cabin_Air_Quality_Humidity_Supervisor.SelectionReport.example())
    api.put_selection_to_status(Cabin_Air_Quality_Humidity_Supervisor.SelectionReport.example())
  }

  def timeTriggered(api: CabinAirPriorityArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_accepted: Option[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference] = api.get_accepted()
    api.logInfo(s"Received on data port accepted: ${apiUsage_accepted}")
    val apiUsage_filter_proposal: Option[Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport] = api.get_filter_proposal()
    api.logInfo(s"Received on data port filter_proposal: ${apiUsage_filter_proposal}")
    val apiUsage_humidity_proposal: Option[Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport] = api.get_humidity_proposal()
    api.logInfo(s"Received on data port humidity_proposal: ${apiUsage_humidity_proposal}")
    val apiUsage_routine_proposal: Option[Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport] = api.get_routine_proposal()
    api.logInfo(s"Received on data port routine_proposal: ${apiUsage_routine_proposal}")
  }

  def finalise(api: CabinAirPriorityArbiter_Operational_Api): Unit = { }
}
