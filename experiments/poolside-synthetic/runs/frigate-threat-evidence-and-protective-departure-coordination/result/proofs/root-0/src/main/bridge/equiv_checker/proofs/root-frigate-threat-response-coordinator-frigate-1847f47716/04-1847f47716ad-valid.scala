// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1847f47716ad_4_Valid {
  @pure def check(
      qualifiedthreattoalertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat,
      threatevidencein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidence,
      threatvaliditytodefenseout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type,
      threatvaliditytoescapeout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_GumboX.inititialize_IEP_Post(qualifiedthreattoalertout, threatvaliditytodefenseout, threatvaliditytoescapeout))) ___>: (T)) & T))
  }
}
