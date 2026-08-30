// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_120db4b2f7cd_Oracle_Pointwise_Realizable {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.compute_CEP_Post(episodesnapshot, equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.NO_REPORT)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.compute_CEP_Post(episodesnapshot, equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.WATCH_REPORT)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.compute_CEP_Post(episodesnapshot, equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.HOSTILE_ALERT)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.compute_CEP_Post(episodesnapshot, equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.EVIDENCE_FAULT)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.compute_CEP_Post(episodesnapshot, equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_PENDING_REPORT)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.compute_CEP_Post(episodesnapshot, equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.CLEAR_CONFIRMED_REPORT)))))
  }
}
