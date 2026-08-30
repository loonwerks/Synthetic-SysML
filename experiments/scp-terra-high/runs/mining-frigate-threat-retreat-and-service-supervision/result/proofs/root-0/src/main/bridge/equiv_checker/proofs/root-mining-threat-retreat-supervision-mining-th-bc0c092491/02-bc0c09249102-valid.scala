// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bc0c09249102_2_Valid {
  @pure def check(
      disposition_defense: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue,
      disposition_mining: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue,
      disposition_mobility: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue,
      threat_sample: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatSampleValue,
      threat_validity: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatValidityValue): Unit = {
    Contract(Requires(T),
      Ensures((((equiv_shared_0.Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_GumboX.compute_CEP_Pre(threat_sample)) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_Candidate_GumboX.compute_CEP_Post(threat_sample, disposition_defense, disposition_mining, disposition_mobility, threat_validity))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_GumboX.compute_CEP_Post(threat_sample, disposition_defense, disposition_mining, disposition_mobility, threat_validity))) & T))
  }
}
