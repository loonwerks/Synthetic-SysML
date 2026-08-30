// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6c3f7b8c42ff_2_Complement {
  @pure def check(
      contactevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.ContactEvidence,
      identificationevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.IdentificationEvidence,
      qualifiedthreat: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_GumboX.compute_CEP_Post(contactevidence, identificationevidence, qualifiedthreat))) & T)))
  }
}
