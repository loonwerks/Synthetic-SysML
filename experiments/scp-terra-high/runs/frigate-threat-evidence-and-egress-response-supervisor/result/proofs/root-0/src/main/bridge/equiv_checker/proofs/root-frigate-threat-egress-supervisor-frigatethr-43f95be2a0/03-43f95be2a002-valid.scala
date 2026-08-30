// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_43f95be2a002_3_Valid {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type,
      pilotdisposition: equiv_shared_0.Frigate_Threat_Egress_Supervisor.PilotDisposition.Type,
      in_committedepisode: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEpisodeState.Type,
      committedepisode: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEpisodeState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
