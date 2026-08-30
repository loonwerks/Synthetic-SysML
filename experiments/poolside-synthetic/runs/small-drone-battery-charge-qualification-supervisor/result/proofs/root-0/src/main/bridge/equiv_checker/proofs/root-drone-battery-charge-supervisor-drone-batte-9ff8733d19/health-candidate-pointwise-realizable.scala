// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_9ff8733d1973_Candidate_Pointwise_Realizable {
  @pure def check(
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T) |
        (T))))
  }
}
