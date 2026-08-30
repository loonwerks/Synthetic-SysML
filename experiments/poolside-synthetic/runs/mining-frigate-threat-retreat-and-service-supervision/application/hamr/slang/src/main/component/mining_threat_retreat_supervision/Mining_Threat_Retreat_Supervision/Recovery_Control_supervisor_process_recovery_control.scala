// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Recovery_Control_supervisor_process_recovery_control {

  def initialise(api: Recovery_Control_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_gate_mining(Mining_Threat_Retreat_Supervision.RecoveryGateValue.example())
    api.put_gate_defense(Mining_Threat_Retreat_Supervision.RecoveryGateValue.example())
    api.put_gate_mobility(Mining_Threat_Retreat_Supervision.RecoveryGateValue.example())
    api.put_emergency_state(Mining_Threat_Retreat_Supervision.EmergencyStateValue.example())
    api.put_next_recovery_state(Mining_Threat_Retreat_Supervision.RecoveryStateValue.example())
  }

  def timeTriggered(api: Recovery_Control_Operational_Api): Unit = {
    // example api usage

    val apiUsage_intent: Option[Mining_Threat_Retreat_Supervision.IntentValue] = api.get_intent()
    api.logInfo(s"Received on data port intent: ${apiUsage_intent}")
    val apiUsage_action_outcome: Option[Mining_Threat_Retreat_Supervision.ActionOutcomeValue] = api.get_action_outcome()
    api.logInfo(s"Received on data port action_outcome: ${apiUsage_action_outcome}")
    val apiUsage_threat_validity: Option[Mining_Threat_Retreat_Supervision.ThreatValidityValue] = api.get_threat_validity()
    api.logInfo(s"Received on data port threat_validity: ${apiUsage_threat_validity}")
  }

  def finalise(api: Recovery_Control_Operational_Api): Unit = { }
}
