// #Sireum

package ore_hold_mining_guard_supervisor.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import ore_hold_mining_guard_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner {

  def initialise(api: RequestFreshnessPriorityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_assessment(Ore_Hold_Mining_Guard_Supervisor.RequestAssessment.example())
  }

  def timeTriggered(api: RequestFreshnessPriorityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_pilot_request: Option[Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample] = api.get_pilot_request()
    api.logInfo(s"Received on data port pilot_request: ${apiUsage_pilot_request}")
  }

  def finalise(api: RequestFreshnessPriorityOwner_Operational_Api): Unit = { }
}
