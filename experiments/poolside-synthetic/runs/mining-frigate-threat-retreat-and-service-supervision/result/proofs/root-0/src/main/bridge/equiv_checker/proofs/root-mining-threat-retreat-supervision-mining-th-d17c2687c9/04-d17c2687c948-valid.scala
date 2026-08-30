// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d17c2687c948_4_Valid {
  @pure def check(
      action_outcome: equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionOutcomeValue,
      emergency_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.EmergencyStateValue,
      gate_defense: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      gate_mining: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      gate_mobility: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      intent: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue,
      next_recovery_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryStateValue,
      threat_validity: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatValidityValue,
      in_recovery_memory: S32,
      recovery_memory: S32): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_GumboX.compute_CEP_Post(in_recovery_memory, recovery_memory, action_outcome, intent, threat_validity, emergency_state, gate_defense, gate_mining, gate_mobility, next_recovery_state))) ___>: (T)) & T))
  }
}
