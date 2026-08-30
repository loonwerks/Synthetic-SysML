// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_88e3dd5c54e1_2_Complement {
  @pure def check(
      battery_attention: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryAttention.Type,
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_GumboX.inititialize_IEP_Post(battery_attention))) & T)))
  }
}
