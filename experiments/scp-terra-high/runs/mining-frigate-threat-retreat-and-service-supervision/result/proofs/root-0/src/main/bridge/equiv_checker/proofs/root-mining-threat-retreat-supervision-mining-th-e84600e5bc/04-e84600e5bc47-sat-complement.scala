// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e84600e5bc47_4_Complement {
  @pure def check(
      assessment: equiv_shared_0.Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue,
      defense_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.ProposalValue,
      intent: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue,
      recovery_gate: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      threat_disposition: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_GumboX.compute_CEP_Post(assessment, intent, recovery_gate, threat_disposition, defense_proposal))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_Candidate_GumboX.compute_CEP_Post(assessment, intent, recovery_gate, threat_disposition, defense_proposal))) & T)))
  }
}
