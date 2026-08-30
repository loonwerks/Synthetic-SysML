// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d35f6c5e8baf_Oracle_Pointwise_Realizable {
  @pure def check(
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryAttention.None)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryAttention.LowBattery)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryAttention.InputFault)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryAttention.RecoveryPending)))))
  }
}
