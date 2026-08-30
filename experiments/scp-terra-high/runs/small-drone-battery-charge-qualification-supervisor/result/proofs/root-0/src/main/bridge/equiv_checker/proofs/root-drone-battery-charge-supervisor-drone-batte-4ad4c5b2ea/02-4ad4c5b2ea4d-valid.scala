// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ad4c5b2ea4d_2_Valid {
  @pure def check(
      battery_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatterySample,
      evidence_to_attention: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      evidence_to_owner: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      evidence_to_readiness: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_GumboX.inititialize_IEP_Post(evidence_to_attention, evidence_to_owner, evidence_to_readiness))) & T))
  }
}
