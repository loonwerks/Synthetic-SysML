// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_37f61d18437e_2_Complement {
  @pure def check(
      defensequalification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.Type,
      egressqualification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.Type,
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      responseauthorization: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseAuthorization.Type,
      responsedirective: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseDirective.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter_GumboX.inititialize_IEP_Post(responsedirective))) & T)))
  }
}
