// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_61871e0aa8e4_3_Valid {
  @pure def check(
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision,
      readiness_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
