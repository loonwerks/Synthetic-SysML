// #Sireum

package frigate_threat_egress_supervisor.Frigate_Threat_Egress_Supervisor

import org.sireum._
import frigate_threat_egress_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker {

  // BEGIN STATE VARS
  var committedEpisode: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type =
    Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET
  // END STATE VARS

  def initialise(api: ThreatEpisodeTracker_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api,
        committedEpisode
      ),
      Ensures(
        // INIT_EPISODE
        committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET,
        api.episodeSnapshot.preEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET,
        api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET
      )
    )
    committedEpisode = Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET

    api.put_episodeSnapshot(
      Frigate_Threat_Egress_Supervisor.EpisodeSnapshot(
        preEpisode = Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET,
        nextEpisode = Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET,
        assessment = Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE,
        pilotDisposition = Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.NO_RESPONSE
      )
    )
  }

  def timeTriggered(api: ThreatEpisodeTracker_Operational_Api): Unit = {
    Contract(
      Modifies(
        api,
        committedEpisode
      ),
      Ensures(
        // PRESERVE_EPISODE_SNAPSHOT
        // preEpisode mirrors entry committedEpisode
        (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET) ___>:
          api.episodeSnapshot.preEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET,
        (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH) ___>:
          api.episodeSnapshot.preEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH,
        (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED) ___>:
          api.episodeSnapshot.preEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED,
        (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING) ___>:
          api.episodeSnapshot.preEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING,
        // nextEpisode mirrors new committedEpisode
        (committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET) ___>:
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET,
        (committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH) ___>:
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.WATCH,
        (committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED) ___>:
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.DECLARED,
        (committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING) ___>:
          api.episodeSnapshot.nextEpisode == Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING,
        // assessment mirrors evidenceAssessment
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE) ___>:
          api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE,
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR) ___>:
          api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.CLEAR,
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT) ___>:
          api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.SUSPECT,
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) ___>:
          api.episodeSnapshot.assessment == Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE,
        // pilotDisposition mirrors pilotDisposition
        (api.pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.NO_RESPONSE) ___>:
          api.episodeSnapshot.pilotDisposition == Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.NO_RESPONSE,
        (api.pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.ACKNOWLEDGE_ALERT) ___>:
          api.episodeSnapshot.pilotDisposition == Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT,
        (api.pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR) ___>:
          api.episodeSnapshot.pilotDisposition == Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.CONFIRM_CLEAR,
        // CASE_04_UNAVAILABLE_CONTAINMENT
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE) ___>:
          (
            (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET |
              In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH &
            (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED |
              In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED
          ),
        // CASE_05_HOSTILE_OR_SUSPECT
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE |
          api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT) ___>:
          (
            (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED &
            (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT &
              (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET |
                In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH)) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH &
            (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT &
              (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED |
                In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING)) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED
          ),
        // CASE_06_CLEAR_CONFIRMATION
        (api.evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR) ___>:
          (
            (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET |
              In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET &
            (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING &
            (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING &
              api.pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET &
            (In(committedEpisode) == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING &
              api.pilotDisposition != Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR) ___>:
              committedEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING
          )
      )
    )
    val evidenceAssessment: Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type = api.get_evidenceAssessment().get
    val pilotDisposition: Frigate_Threat_Egress_Supervisor.PilotDisposition.Type = api.get_pilotDisposition().get

    val entryEpisode: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type = committedEpisode

    val newEpisode: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type =
      if (evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE) {
        if (entryEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET |
          entryEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH) {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH
        } else {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED
        }
      } else if (evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE) {
        Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED
      } else if (evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT) {
        if (entryEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET |
          entryEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH) {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH
        } else {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED
        }
      } else {
        // evidenceAssessment is CLEAR
        if (pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR &
          entryEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING) {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET
        } else if (entryEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED) {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING
        } else if (pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.CONFIRM_CLEAR) {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET
        } else {
          Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.CLEAR_PENDING
        }
      }

    committedEpisode = newEpisode

    val snapshotAssessment: Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.Type =
      if (evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE) {
        Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.UNAVAILABLE
      } else if (evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR) {
        Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.CLEAR
      } else if (evidenceAssessment == Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT) {
        Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.SUSPECT
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotEvidenceAssessment.HOSTILE
      }

    val snapshotPilotDisposition: Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.Type =
      if (pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.NO_RESPONSE) {
        Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.NO_RESPONSE
      } else if (pilotDisposition == Frigate_Threat_Egress_Supervisor.PilotDisposition.ACKNOWLEDGE_ALERT) {
        Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.ACKNOWLEDGE_ALERT
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotPilotDisposition.CONFIRM_CLEAR
      }

    val snapshotNextEpisode: Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.Type =
      if (newEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.QUIET) {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.QUIET
      } else if (newEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.WATCH) {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.WATCH
      } else if (newEpisode == Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.DECLARED) {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.DECLARED
      } else {
        Frigate_Threat_Egress_Supervisor.SnapshotNextEpisodeState.CLEAR_PENDING
      }

    val snapshotPreEpisode: Frigate_Threat_Egress_Supervisor.SnapshotPreEpisodeState.Type = entryEpisode

    api.put_episodeSnapshot(
      Frigate_Threat_Egress_Supervisor.EpisodeSnapshot(
        preEpisode = snapshotPreEpisode,
        nextEpisode = snapshotNextEpisode,
        assessment = snapshotAssessment,
        pilotDisposition = snapshotPilotDisposition
      )
    )
  }

  def finalise(api: ThreatEpisodeTracker_Operational_Api): Unit = { }
}
