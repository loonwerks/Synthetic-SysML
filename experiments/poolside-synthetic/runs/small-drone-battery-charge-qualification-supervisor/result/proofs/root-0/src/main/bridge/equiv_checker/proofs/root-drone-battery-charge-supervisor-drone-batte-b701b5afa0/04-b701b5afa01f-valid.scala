// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b701b5afa01f_4_Valid {
  @pure def check(
      battery_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatterySample,
      evidence_to_attention: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      evidence_to_owner: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      evidence_to_readiness: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_GumboX.compute_CEP_Post(battery_sample, evidence_to_attention, evidence_to_owner, evidence_to_readiness))) ___>: (T)) & T))
  }
}
