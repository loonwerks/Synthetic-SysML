// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fb75865cacdd_2_Complement {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      threatreport: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReportPolicy_threatResponseProcess_threatReportPolicy_GumboX.inititialize_IEP_Post(threatreport))) & T)))
  }
}
