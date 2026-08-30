// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_37f61d18437e_4_Valid {
  @pure def check(
      defensequalification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.Type,
      egressqualification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.Type,
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      responseauthorization: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type,
      responsedirective: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseDirective.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_GumboX.inititialize_IEP_Post(responsedirective))) ___>: (T)) & T))
  }
}
