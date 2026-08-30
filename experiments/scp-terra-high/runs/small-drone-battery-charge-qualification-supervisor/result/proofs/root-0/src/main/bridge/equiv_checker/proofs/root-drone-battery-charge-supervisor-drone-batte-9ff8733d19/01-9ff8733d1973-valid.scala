// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9ff8733d1973_1_Valid {
  @pure def check(
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision,
      readiness_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
