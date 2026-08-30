// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatReportPolicy_threatResponseProcess_threatReportPolicy {

  def initialise(api: ThreatReportPolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_REPORT
        api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT
      )
    )
    api.put_threatReport(Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT)
  }

  def timeTriggered(api: ThreatReportPolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_15_REPORT_PRECEDENCE
        // If assessment is UNAVAILABLE → EVIDENCE_FAULT
        (api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE) ___>:
          api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.EVIDENCE_FAULT,
        // If assessment is HOSTILE & pilotDisposition is not ACKNOWLEDGE_ALERT → HOSTILE_ALERT
        (api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE &
          api.episodeSnapshot.pilotDisposition != Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT) ___>:
          api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.HOSTILE_ALERT,
        // If assessment is HOSTILE & pilotDisposition is ACKNOWLEDGE_ALERT → NO_REPORT
        (api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE &
          api.episodeSnapshot.pilotDisposition == Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT) ___>:
          api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT,
        // If assessment is not UNAVAILABLE & not HOSTILE & preEpisode is CLEAR_PENDING & nextEpisode is QUIET → CLEAR_CONFIRMED_REPORT
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE &
          api.episodeSnapshot.preEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING &
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) ___>:
          api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_CONFIRMED_REPORT,
        // If assessment is not UNAVAILABLE & not HOSTILE & (preEpisode not CLEAR_PENDING or nextEpisode not QUIET) & nextEpisode is CLEAR_PENDING → CLEAR_PENDING_REPORT
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE &
          (api.episodeSnapshot.preEpisode != Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING |
            api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) &
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING) ___>:
          api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_PENDING_REPORT,
        // If assessment is SUSPECT & (preEpisode not CLEAR_PENDING or nextEpisode not QUIET) & nextEpisode not CLEAR_PENDING → WATCH_REPORT
        (api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.SUSPECT &
          (api.episodeSnapshot.preEpisode != Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING |
            api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) &
          api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING) ___>:
          api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.WATCH_REPORT,
        // If assessment is CLEAR & (preEpisode not CLEAR_PENDING or nextEpisode not QUIET) & nextEpisode not CLEAR_PENDING → NO_REPORT
        (api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.CLEAR &
          (api.episodeSnapshot.preEpisode != Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING |
            api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) &
          api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING) ___>:
          api.threatReport == Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT
      )
    )
    val episodeSnapshot: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = api.get_episodeSnapshot().get

    val threatReport: Frigate_Threat_Egress_Supervisor.ThreatReport.Type =
      if (episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE) {
        Frigate_Threat_Egress_Supervisor.ThreatReport.EVIDENCE_FAULT
      } else if (episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE &
        episodeSnapshot.pilotDisposition != Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT) {
        Frigate_Threat_Egress_Supervisor.ThreatReport.HOSTILE_ALERT
      } else if (episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE &
        episodeSnapshot.pilotDisposition == Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT) {
        Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT
      } else if (episodeSnapshot.preEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING &
        episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) {
        Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_CONFIRMED_REPORT
      } else if (episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING) {
        Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_PENDING_REPORT
      } else if (episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.SUSPECT) {
        Frigate_Threat_Egress_Supervisor.ThreatReport.WATCH_REPORT
      } else {
        Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT
      }

    api.put_threatReport(threatReport)
  }

  def finalise(api: ThreatReportPolicy_Operational_Api): Unit = { }
}
