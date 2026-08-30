// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8f79cecd1632_2_Complement {
  @pure def check(
      assessment: equiv_shared_0.Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue,
      intent: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue,
      mobility_proposal: equiv_shared_0.Mining_Threat_Retreat_Supervision.MobilityProposalValue,
      recovery_gate: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      threat_disposition: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue): Unit = {
    Contract(Requires(!((((equiv_shared_0.Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_GumboX.compute_CEP_Pre(assessment, intent, recovery_gate, threat_disposition)) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_Candidate_GumboX.compute_CEP_Post(assessment, intent, recovery_gate, threat_disposition, mobility_proposal))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_GumboX.compute_CEP_Post(assessment, intent, recovery_gate, threat_disposition, mobility_proposal))) & T)))
  }
}
