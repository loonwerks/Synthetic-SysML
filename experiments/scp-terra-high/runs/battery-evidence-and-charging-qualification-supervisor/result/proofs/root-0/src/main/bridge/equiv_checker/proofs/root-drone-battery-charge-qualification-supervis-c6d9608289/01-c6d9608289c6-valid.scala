// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c6d9608289c6_1_Valid {
  @pure def check(
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
