// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d35f6c5e8baf_4_Valid {
  @pure def check(
      battery_attention: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryAttention.Type,
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, battery_attention))) ___>: (T)) & T))
  }
}
