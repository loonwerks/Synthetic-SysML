// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fb75865cacdd_3_Valid {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      threatreport: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
