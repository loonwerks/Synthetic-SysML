// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0f61bcd248f3_2_Complement {
  @pure def check(
      action_outcome: equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionOutcomeValue,
      emergency_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.EmergencyStateValue,
      gate_defense: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      gate_mining: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      gate_mobility: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryGateValue,
      intent: equiv_shared_0.Mining_Threat_Retreat_Supervision.IntentValue,
      next_recovery_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryStateValue,
      threat_validity: equiv_shared_0.Mining_Threat_Retreat_Supervision.ThreatValidityValue,
      recovery_memory: S32): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_Candidate_GumboX.inititialize_IEP_Post(recovery_memory, emergency_state, gate_defense, gate_mining, gate_mobility, next_recovery_state))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_GumboX.inititialize_IEP_Post(recovery_memory, emergency_state, gate_defense, gate_mining, gate_mobility, next_recovery_state))) & T)))
  }
}
