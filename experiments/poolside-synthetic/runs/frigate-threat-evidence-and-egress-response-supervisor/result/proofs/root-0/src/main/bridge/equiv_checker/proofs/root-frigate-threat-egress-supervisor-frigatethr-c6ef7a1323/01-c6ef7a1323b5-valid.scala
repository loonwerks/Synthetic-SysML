// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c6ef7a1323b5_1_Valid {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type,
      pilotdisposition: equiv_shared_0.Frigate_Threat_Egress_Supervisor.PilotDisposition.Type,
      committedepisode: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEpisodeState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
