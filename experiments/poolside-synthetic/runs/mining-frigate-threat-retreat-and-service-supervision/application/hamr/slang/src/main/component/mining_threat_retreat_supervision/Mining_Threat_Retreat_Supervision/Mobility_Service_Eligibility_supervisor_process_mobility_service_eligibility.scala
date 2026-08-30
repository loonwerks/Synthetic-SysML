// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility {

  def initialise(api: Mobility_Service_Eligibility_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mobility_proposal(Mining_Threat_Retreat_Supervision.MobilityProposalValue.example())
  }

  def timeTriggered(api: Mobility_Service_Eligibility_Operational_Api): Unit = {
    // example api usage

    val apiUsage_intent: Option[Mining_Threat_Retreat_Supervision.IntentValue] = api.get_intent()
    api.logInfo(s"Received on data port intent: ${apiUsage_intent}")
    val apiUsage_threat_disposition: Option[Mining_Threat_Retreat_Supervision.ThreatDispositionValue] = api.get_threat_disposition()
    api.logInfo(s"Received on data port threat_disposition: ${apiUsage_threat_disposition}")
    val apiUsage_assessment: Option[Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue] = api.get_assessment()
    api.logInfo(s"Received on data port assessment: ${apiUsage_assessment}")
    val apiUsage_recovery_gate: Option[Mining_Threat_Retreat_Supervision.RecoveryGateValue] = api.get_recovery_gate()
    api.logInfo(s"Received on data port recovery_gate: ${apiUsage_recovery_gate}")
  }

  def finalise(api: Mobility_Service_Eligibility_Operational_Api): Unit = { }
}
