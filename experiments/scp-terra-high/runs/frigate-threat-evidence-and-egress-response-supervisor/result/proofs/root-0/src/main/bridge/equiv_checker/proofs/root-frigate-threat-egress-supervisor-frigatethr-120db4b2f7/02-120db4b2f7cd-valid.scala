// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_120db4b2f7cd_2_Valid {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      threatreport: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.compute_CEP_Post(episodesnapshot, threatreport))) & T))
  }
}
