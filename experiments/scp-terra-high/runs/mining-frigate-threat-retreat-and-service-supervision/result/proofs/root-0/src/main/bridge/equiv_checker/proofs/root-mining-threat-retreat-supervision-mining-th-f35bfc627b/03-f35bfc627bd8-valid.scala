// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f35bfc627bd8_3_Valid {
  @pure def check(
      assessment: equiv_shared_0.Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue,
      intent: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue,
      mining_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.ProposalValue,
      recovery_gate: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      threat_disposition: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_GumboX.compute_CEP_Pre(assessment, intent, recovery_gate, threat_disposition))))
  }
}
