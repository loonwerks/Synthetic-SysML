// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Priority_Arbitration_supervisor_process_priority_arbitration {

  def initialise(api: Priority_Arbitration_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selected_action(Mining_Threat_Retreat_Supervision.ActionValue.example())
    api.put_selected_cause(Mining_Threat_Retreat_Supervision.SelectedCauseValue.example())
  }

  def timeTriggered(api: Priority_Arbitration_Operational_Api): Unit = {
    // example api usage

    val apiUsage_emergency_state: Option[Mining_Threat_Retreat_Supervision.EmergencyStateValue] = api.get_emergency_state()
    api.logInfo(s"Received on data port emergency_state: ${apiUsage_emergency_state}")
    val apiUsage_mining_proposal: Option[Mining_Threat_Retreat_Supervision.ProposalValue] = api.get_mining_proposal()
    api.logInfo(s"Received on data port mining_proposal: ${apiUsage_mining_proposal}")
    val apiUsage_defense_proposal: Option[Mining_Threat_Retreat_Supervision.ProposalValue] = api.get_defense_proposal()
    api.logInfo(s"Received on data port defense_proposal: ${apiUsage_defense_proposal}")
    val apiUsage_mobility_proposal: Option[Mining_Threat_Retreat_Supervision.MobilityProposalValue] = api.get_mobility_proposal()
    api.logInfo(s"Received on data port mobility_proposal: ${apiUsage_mobility_proposal}")
  }

  def finalise(api: Priority_Arbitration_Operational_Api): Unit = { }
}
