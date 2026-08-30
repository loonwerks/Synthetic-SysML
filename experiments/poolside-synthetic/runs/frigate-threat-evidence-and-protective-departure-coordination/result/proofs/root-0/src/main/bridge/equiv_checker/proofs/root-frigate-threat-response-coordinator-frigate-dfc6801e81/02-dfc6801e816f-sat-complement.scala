// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dfc6801e816f_2_Complement {
  @pure def check(
      qualifiedthreattoalertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat,
      threatevidencein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidence,
      threatvaliditytodefenseout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type,
      threatvaliditytoescapeout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_GumboX.compute_CEP_Post(threatevidencein, qualifiedthreattoalertout, threatvaliditytodefenseout, threatvaliditytoescapeout))) & T)))
  }
}
