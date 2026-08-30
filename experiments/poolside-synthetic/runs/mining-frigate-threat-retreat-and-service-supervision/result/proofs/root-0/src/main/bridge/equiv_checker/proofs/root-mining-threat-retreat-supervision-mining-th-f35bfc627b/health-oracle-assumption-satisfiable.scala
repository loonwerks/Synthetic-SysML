// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_f35bfc627bd8_Oracle_Assumption_Satisfiable {
  @pure def check(
      assessment: equiv_shared_0.Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue,
      intent: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue,
      recovery_gate: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      threat_disposition: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatDispositionValue): Unit = {
    Contract(Requires(equiv_shared_0.Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_GumboX.compute_CEP_Pre(assessment, intent, recovery_gate, threat_disposition)))
  }
}
