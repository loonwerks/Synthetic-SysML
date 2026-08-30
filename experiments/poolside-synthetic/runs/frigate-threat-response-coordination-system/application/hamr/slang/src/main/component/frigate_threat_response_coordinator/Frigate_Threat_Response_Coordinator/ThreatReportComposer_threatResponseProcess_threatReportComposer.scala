// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatReportComposer_threatResponseProcess_threatReportComposer {

  def initialise(api: ThreatReportComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_threatReport(Frigate_Threat_Response_Coordinator.ThreatReport.example())
  }

  def timeTriggered(api: ThreatReportComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val apiUsage_responseRecord: Option[Frigate_Threat_Response_Coordinator.ResponseRecord] = api.get_responseRecord()
    val apiUsage_reportAcknowledgment: Option[Frigate_Threat_Response_Coordinator.ReportAcknowledgment] = api.get_reportAcknowledgment()

    val rr: Frigate_Threat_Response_Coordinator.ResponseRecord = apiUsage_responseRecord.get
    val ack: Frigate_Threat_Response_Coordinator.ReportAcknowledgment = apiUsage_reportAcknowledgment.get

    // CASE_09_COMMUNICATION_FAULT
    // CASE_10_ACKNOWLEDGED
    // CASE_11_UNACKNOWLEDGED_URGENT
    // CASE_12_UNACKNOWLEDGED_ROUTINE
    var qt: Frigate_Threat_Response_Coordinator.QualifiedThreat.Type = rr.qualifiedThreat
    var disp: Frigate_Threat_Response_Coordinator.ResponseDisposition.Type = rr.disposition
    var priority: Frigate_Threat_Response_Coordinator.ReportPriority.Type = Frigate_Threat_Response_Coordinator.ReportPriority.COMMUNICATION_FAULT

    if (ack.acknowledgmentStatus == Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.INVALID) {
      priority = Frigate_Threat_Response_Coordinator.ReportPriority.COMMUNICATION_FAULT
    } else if (ack.acknowledgmentStatus == Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.VALID &
      ack.acknowledgment == Frigate_Threat_Response_Coordinator.AcknowledgmentValue.ACKNOWLEDGED) {
      priority = Frigate_Threat_Response_Coordinator.ReportPriority.CLOSED
    } else if (ack.acknowledgmentStatus == Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.VALID &
      ack.acknowledgment == Frigate_Threat_Response_Coordinator.AcknowledgmentValue.NOT_ACKNOWLEDGED &
      (rr.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT |
        rr.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_BLOCKED)) {
      priority = Frigate_Threat_Response_Coordinator.ReportPriority.URGENT
    } else if (ack.acknowledgmentStatus == Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.VALID &
      ack.acknowledgment == Frigate_Threat_Response_Coordinator.AcknowledgmentValue.NOT_ACKNOWLEDGED &
      (rr.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.OBSERVED |
        rr.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.DEFENSE_ACTIVE |
        rr.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_ACTIVE |
        rr.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_COMPLETE)) {
      priority = Frigate_Threat_Response_Coordinator.ReportPriority.ROUTINE
    }

    api.put_threatReport(Frigate_Threat_Response_Coordinator.ThreatReport(
      qualifiedThreat = qt,
      disposition = disp,
      priority = priority))
  }

  def finalise(api: ThreatReportComposer_Operational_Api): Unit = { }
}
