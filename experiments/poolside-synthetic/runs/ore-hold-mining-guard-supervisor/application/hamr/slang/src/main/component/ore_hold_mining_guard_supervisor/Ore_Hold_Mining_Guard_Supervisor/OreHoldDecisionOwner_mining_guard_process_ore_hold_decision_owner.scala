// #Sireum

package ore_hold_mining_guard_supervisor.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import ore_hold_mining_guard_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner {

  def initialise(api: OreHoldDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_resolution_to_command(Ore_Hold_Mining_Guard_Supervisor.GuardResolution.example())
    api.put_resolution_to_reporting(Ore_Hold_Mining_Guard_Supervisor.GuardResolution.example())
  }

  def timeTriggered(api: OreHoldDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_assessment: Option[Ore_Hold_Mining_Guard_Supervisor.RequestAssessment] = api.get_request_assessment()
    api.logInfo(s"Received on data port request_assessment: ${apiUsage_request_assessment}")
    val apiUsage_hold_assessment: Option[Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type] = api.get_hold_assessment()
    api.logInfo(s"Received on data port hold_assessment: ${apiUsage_hold_assessment}")
    val apiUsage_support_assessment: Option[Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type] = api.get_support_assessment()
    api.logInfo(s"Received on data port support_assessment: ${apiUsage_support_assessment}")
  }

  def finalise(api: OreHoldDecisionOwner_Operational_Api): Unit = { }
}
