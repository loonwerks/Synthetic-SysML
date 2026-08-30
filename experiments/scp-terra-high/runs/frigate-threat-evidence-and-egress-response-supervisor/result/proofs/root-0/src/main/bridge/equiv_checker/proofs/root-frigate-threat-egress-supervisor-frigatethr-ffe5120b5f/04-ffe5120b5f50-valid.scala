// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ffe5120b5f50_4_Valid {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      responsesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseSnapshot,
      responsestatus: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(responsestatus))) ___>: (T)) & T))
  }
}
