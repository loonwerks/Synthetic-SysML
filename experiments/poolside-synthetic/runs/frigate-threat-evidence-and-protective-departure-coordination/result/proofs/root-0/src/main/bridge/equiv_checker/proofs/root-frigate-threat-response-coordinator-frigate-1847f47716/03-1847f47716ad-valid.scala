// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1847f47716ad_3_Valid {
  @pure def check(
      qualifiedthreattoalertout: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat,
      threatevidencein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidence,
      threatvaliditytodefenseout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type,
      threatvaliditytoescapeout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
