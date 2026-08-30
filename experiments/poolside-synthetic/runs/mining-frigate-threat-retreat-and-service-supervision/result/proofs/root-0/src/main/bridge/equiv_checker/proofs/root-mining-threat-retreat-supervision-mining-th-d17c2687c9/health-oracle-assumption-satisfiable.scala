// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d17c2687c948_Oracle_Assumption_Satisfiable {
  @pure def check(
      in_recovery_memory: S32,
      action_outcome: equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionOutcomeValue,
      intent: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue,
      threat_validity: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatValidityValue): Unit = {
    Contract(Requires(equiv_shared_0.Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_GumboX.compute_CEP_Pre(in_recovery_memory, action_outcome, intent, threat_validity)))
  }
}
