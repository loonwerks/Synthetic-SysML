// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9ff8733d1973_2_Complement {
  @pure def check(
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision,
      readiness_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_GumboX.inititialize_IEP_Post(readiness_evidence))) & T)))
  }
}
