// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor {

  def initialise(api: ResponseStatusAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_RESPONSE_STATUS
        api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET
      )
    )
    api.put_responseStatus(Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET)
  }

  def timeTriggered(api: ResponseStatusAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_20_RESPONSE_STATUS_PRECEDENCE
        // If assessment is UNAVAILABLE → EVIDENCE_UNAVAILABLE
        (api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.EVIDENCE_UNAVAILABLE,
        // If assessment is not UNAVAILABLE & nextEgress is ARRIVED → ARRIVAL_OBSERVED
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ARRIVED) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.ARRIVAL_OBSERVED,
        // If assessment is not UNAVAILABLE & nextEgress is MOVING → EGRESS_MOVING
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.MOVING) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_MOVING,
        // If assessment is not UNAVAILABLE & nextEgress is ORDERED → EGRESS_ORDERED
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ORDERED) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_ORDERED,
        // If assessment is not UNAVAILABLE & nextEgress is BLOCKED → EGRESS_BLOCKED
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.BLOCKED) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_BLOCKED,
        // If assessment is not UNAVAILABLE & nextEgress is IDLE & defenseCommand is ACTIVATE → DEFENDING
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
          api.responseSnapshot.defenseCommand == Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.DEFENDING,
        // If assessment is not UNAVAILABLE & nextEgress is IDLE & defenseCommand is not ACTIVATE & nextEpisode is CLEAR_PENDING → CLEAR_PENDING
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
          api.responseSnapshot.defenseCommand != Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE &
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.CLEAR_PENDING,
        // If assessment is not UNAVAILABLE & nextEgress is IDLE & defenseCommand is not ACTIVATE & nextEpisode is WATCH → WATCHING
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
          api.responseSnapshot.defenseCommand != Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE &
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.WATCH) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.WATCHING,
        // If assessment is not UNAVAILABLE & nextEgress is IDLE & defenseCommand is not ACTIVATE & nextEpisode is QUIET → QUIET
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
          api.responseSnapshot.defenseCommand != Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE &
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET,
        // If assessment is not UNAVAILABLE & nextEgress is IDLE & defenseCommand is not ACTIVATE & nextEpisode is DECLARED → THREAT_DECLARED
        (api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
          api.responseSnapshot.defenseCommand != Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE &
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.DECLARED) ___>:
          api.responseStatus == Frigate_Threat_Egress_Supervisor.ResponseStatus.THREAT_DECLARED
      )
    )
    val episodeSnapshot: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = api.get_episodeSnapshot().get
    val responseSnapshot: Frigate_Threat_Egress_Supervisor.ResponseSnapshot = api.get_responseSnapshot().get

    val responseStatus: Frigate_Threat_Egress_Supervisor.ResponseStatus.Type =
      if (episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.EVIDENCE_UNAVAILABLE
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ARRIVED) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.ARRIVAL_OBSERVED
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.MOVING) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_MOVING
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.ORDERED) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_ORDERED
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.BLOCKED) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_BLOCKED
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
        responseSnapshot.defenseCommand == Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.DEFENDING
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
        responseSnapshot.defenseCommand != Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE &
        episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.CLEAR_PENDING
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
        responseSnapshot.defenseCommand != Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE &
        episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.WATCH) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.WATCHING
      } else if (responseSnapshot.nextEgress == Frigate_Threat_Egress_Supervisor.SnapshotNextEgressState.IDLE &
        responseSnapshot.defenseCommand != Frigate_Threat_Egress_Supervisor.SnapshotDefenseCommand.ACTIVATE &
        episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.DECLARED) {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.THREAT_DECLARED
      } else {
        Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET
      }

    api.put_responseStatus(responseStatus)
  }

  def finalise(api: ResponseStatusAssessor_Operational_Api): Unit = { }
}
