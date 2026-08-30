// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result {

  def initialise(api: Mission_Mode_And_Public_Result_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_public_result(Mining_Threat_Retreat_Supervision.PublicResultValue.example())
  }

  def timeTriggered(api: Mission_Mode_And_Public_Result_Operational_Api): Unit = {
    // example api usage

    val apiUsage_selected_action: Option[Mining_Threat_Retreat_Supervision.ActionValue] = api.get_selected_action()
    api.logInfo(s"Received on data port selected_action: ${apiUsage_selected_action}")
    val apiUsage_selected_cause: Option[Mining_Threat_Retreat_Supervision.SelectedCauseValue] = api.get_selected_cause()
    api.logInfo(s"Received on data port selected_cause: ${apiUsage_selected_cause}")
    val apiUsage_next_recovery_state: Option[Mining_Threat_Retreat_Supervision.RecoveryStateValue] = api.get_next_recovery_state()
    api.logInfo(s"Received on data port next_recovery_state: ${apiUsage_next_recovery_state}")
  }

  def finalise(api: Mission_Mode_And_Public_Result_Operational_Api): Unit = { }
}
