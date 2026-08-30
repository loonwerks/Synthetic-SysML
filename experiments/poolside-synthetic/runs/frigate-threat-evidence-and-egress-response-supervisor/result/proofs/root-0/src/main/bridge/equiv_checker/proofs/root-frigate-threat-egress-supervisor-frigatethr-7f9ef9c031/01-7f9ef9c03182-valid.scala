// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7f9ef9c03182_1_Valid {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      responsesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseSnapshot,
      responsestatus: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
