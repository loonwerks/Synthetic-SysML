// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_59670858c6ec_2_Valid {
  @pure def check(
      defensequalification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.Type,
      egressqualification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.Type,
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      responseauthorization: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type,
      responsedirective: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseDirective.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_GumboX.compute_CEP_Post(defensequalification, egressqualification, episodesnapshot, responseauthorization, responsedirective))) & T))
  }
}
