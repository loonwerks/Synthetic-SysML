// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatReportPolicy_threatResponseProcess_threatReportPolicy {

  def initialise(api: ThreatReportPolicy_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_threatReport(Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT)
  }

  def timeTriggered(api: ThreatReportPolicy_Operational_Api): Unit = {
    api.put_threatReport(api.get_episodeSnapshot() match {
      case Some(s) if s.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE => Frigate_Threat_Egress_Supervisor.ThreatReport.EVIDENCE_FAULT
      case Some(s) if s.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE && s.pilotDisposition != Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT => Frigate_Threat_Egress_Supervisor.ThreatReport.HOSTILE_ALERT
      case Some(s) if s.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING => Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_PENDING_REPORT
      case Some(s) if s.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.WATCH => Frigate_Threat_Egress_Supervisor.ThreatReport.WATCH_REPORT
      case _ => Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT
    })
  }

  def finalise(api: ThreatReportPolicy_Operational_Api): Unit = { }
}
