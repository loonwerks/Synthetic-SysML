// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_43f95be2a002_2_Complement {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type,
      pilotdisposition: equiv_shared_0.Frigate_Threat_Egress_Supervisor.PilotDisposition.Type,
      in_committedepisode: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEpisodeState.Type,
      committedepisode: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEpisodeState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEpisodeTracker_threatResponseProcess_threatEpisodeTracker_GumboX.compute_CEP_Post(in_committedepisode, committedepisode, evidenceassessment, pilotdisposition, episodesnapshot))) & T)))
  }
}
