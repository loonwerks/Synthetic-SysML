// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker {
  var episode: Z = 0

  def initialise(api: ThreatEpisodeTracker_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_episodeSnapshot(Frigate_Threat_Egress_Supervisor.EpisodeSnapshot.example())
  }

  def timeTriggered(api: ThreatEpisodeTracker_Operational_Api): Unit = {
    val assessment = api.get_evidenceAssessment().getOrElse(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE)
    val disposition = api.get_pilotDisposition().getOrElse(Frigate_Threat_Egress_Supervisor.PilotDisposition.NO_RESPONSE)
    val pre = episode
    if (assessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) episode = 2
    else if (assessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT && episode < 2) episode = 1
    else if (assessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE) { if (episode < 2) episode = 1 else episode = 2 }
    else if (assessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR) { if (episode == 2) episode = 3 else if (episode == 3 && disposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR) episode = 0 else if (episode < 2) episode = 0 }
    api.put_episodeSnapshot(Frigate_Threat_Egress_Supervisor.EpisodeSnapshot(
      if (pre == 0) Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET else if (pre == 1) Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH else if (pre == 2) Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED else Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING,
      if (episode == 0) Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET else if (episode == 1) Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.WATCH else if (episode == 2) Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.DECLARED else Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING,
      if (assessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE) Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE else if (assessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR) Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.CLEAR else if (assessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT) Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.SUSPECT else Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE,
      if (disposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.ACKNOWLEDGE_ALERT) Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT else if (disposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR) Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.CONFIRM_CLEAR else Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.NO_RESPONSE))
  }

  def finalise(api: ThreatEpisodeTracker_Operational_Api): Unit = { }
}
