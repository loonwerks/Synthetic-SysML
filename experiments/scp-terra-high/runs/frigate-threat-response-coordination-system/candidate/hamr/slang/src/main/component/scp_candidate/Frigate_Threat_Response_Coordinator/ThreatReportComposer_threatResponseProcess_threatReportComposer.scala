// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatReportComposer_threatResponseProcess_threatReportComposer {

  def initialise(api: ThreatReportComposer_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_threatReport(Frigate_Threat_Response_Coordinator.ThreatReport(
      Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN,
      Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT,
      Frigate_Threat_Response_Coordinator.ReportPriority.COMMUNICATION_FAULT))
  }

  def timeTriggered(api: ThreatReportComposer_Operational_Api): Unit = {
    Contract(Modifies(api))
    val record: Frigate_Threat_Response_Coordinator.ResponseRecord = api.get_responseRecord().get
    val acknowledgment: Frigate_Threat_Response_Coordinator.ReportAcknowledgment = api.get_reportAcknowledgment().get
    val priority: Frigate_Threat_Response_Coordinator.ReportPriority.Type =
      if (acknowledgment.acknowledgmentStatus == Frigate_Threat_Response_Coordinator.AcknowledgmentStatus.INVALID) {
        Frigate_Threat_Response_Coordinator.ReportPriority.COMMUNICATION_FAULT
      } else if (acknowledgment.acknowledgment == Frigate_Threat_Response_Coordinator.AcknowledgmentValue.ACKNOWLEDGED) {
        Frigate_Threat_Response_Coordinator.ReportPriority.CLOSED
      } else if (record.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.INPUT_FAULT ||
                 record.disposition == Frigate_Threat_Response_Coordinator.ResponseDisposition.RETREAT_BLOCKED) {
        Frigate_Threat_Response_Coordinator.ReportPriority.URGENT
      } else {
        Frigate_Threat_Response_Coordinator.ReportPriority.ROUTINE
    }
    api.put_threatReport(Frigate_Threat_Response_Coordinator.ThreatReport(
      record.qualifiedThreat, record.disposition, priority))
  }

  def finalise(api: ThreatReportComposer_Operational_Api): Unit = { }
}
