// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter {

  def initialise(api: ThreatResponseArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_DIRECTIVE
        api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.MONITOR
      )
    )
    api.put_responseDirective(Frigate_Threat_Egress_Supervisor.ResponseDirective.MONITOR)
  }

  def timeTriggered(api: ThreatResponseArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_16_RESET_CONTAIN_CANCEL
        // If nextEpisode is QUIET → RESET
        (api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET |
          api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE |
          api.responseAuthorization == Frigate_Threat_Egress_Supervisor.ResponseAuthorization.CANCEL_EGRESS) ___>:
          (
            (api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET &
            (api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET &
              api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.CONTAIN &
            (api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET &
              api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
              api.responseAuthorization == Frigate_Threat_Egress_Supervisor.ResponseAuthorization.CANCEL_EGRESS) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS
          ),
        // CASE_17_FRESH_EGRESS_PRIORITY
        // If nextEpisode is not QUIET & assessment is not UNAVAILABLE & responseAuthorization is EGRESS_REQUEST
        (api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET &
          api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseAuthorization == Frigate_Threat_Egress_Supervisor.ResponseAuthorization.EGRESS_REQUEST) ___>:
          (
            (api.egressQualification == Frigate_Threat_Egress_Supervisor.EgressQualification.READY) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS &
            (api.egressQualification != Frigate_Threat_Egress_Supervisor.EgressQualification.READY &
              api.defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.READY) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND &
            (api.egressQualification != Frigate_Threat_Egress_Supervisor.EgressQualification.READY &
              api.defenseQualification != Frigate_Threat_Egress_Supervisor.DefenseQualification.READY) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.HOLD_BLOCKED
          ),
        // CASE_18_DEFEND_OR_MONITOR
        // If nextEpisode is not QUIET & assessment is not UNAVAILABLE & responseAuthorization is NO_REQUEST
        (api.episodeSnapshot.nextEpisode != Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET &
          api.episodeSnapshot.assessment != Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE &
          api.responseAuthorization == Frigate_Threat_Egress_Supervisor.ResponseAuthorization.NO_REQUEST) ___>:
          (
            (api.defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.READY) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND &
            (api.defenseQualification != Frigate_Threat_Egress_Supervisor.DefenseQualification.READY) ___>:
              api.responseDirective == Frigate_Threat_Egress_Supervisor.ResponseDirective.MONITOR
          )
      )
    )
    val responseAuthorization: Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type = api.get_responseAuthorization().get
    val defenseQualification: Frigate_Threat_Egress_Supervisor.DefenseQualification.Type = api.get_defenseQualification().get
    val egressQualification: Frigate_Threat_Egress_Supervisor.EgressQualification.Type = api.get_egressQualification().get
    val episodeSnapshot: Frigate_Threat_Egress_Supervisor.EpisodeSnapshot = api.get_episodeSnapshot().get

    val responseDirective: Frigate_Threat_Egress_Supervisor.ResponseDirective.Type =
      if (episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET |
        episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE |
        responseAuthorization == Frigate_Threat_Egress_Supervisor.ResponseAuthorization.CANCEL_EGRESS) {
        if (episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET) {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET
        } else if (episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE) {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.CONTAIN
        } else {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.CANCEL_EGRESS
        }
      } else if (responseAuthorization == Frigate_Threat_Egress_Supervisor.ResponseAuthorization.EGRESS_REQUEST) {
        if (egressQualification == Frigate_Threat_Egress_Supervisor.EgressQualification.READY) {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.START_EGRESS
        } else if (defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.READY) {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND
        } else {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.HOLD_BLOCKED
        }
      } else {
        if (defenseQualification == Frigate_Threat_Egress_Supervisor.DefenseQualification.READY) {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.DEFEND
        } else {
          Frigate_Threat_Egress_Supervisor.ResponseDirective.MONITOR
        }
      }

    api.put_responseDirective(responseDirective)
  }

  def finalise(api: ThreatResponseArbiter_Operational_Api): Unit = { }
}
