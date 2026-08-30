// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_6c3f7b8c42ff_Oracle_Pointwise_Realizable {
  @pure def check(
      contactevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.ContactEvidence,
      identificationevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.IdentificationEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_GumboX.compute_CEP_Post(contactevidence, identificationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.CLEAR)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_GumboX.compute_CEP_Post(contactevidence, identificationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.SUSPECT)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_GumboX.compute_CEP_Post(contactevidence, identificationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.HOSTILE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.ThreatEvidenceInterpreter_threatResponseProcess_threatEvidenceInterpreter_GumboX.compute_CEP_Post(contactevidence, identificationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.UNKNOWN)))))
  }
}
