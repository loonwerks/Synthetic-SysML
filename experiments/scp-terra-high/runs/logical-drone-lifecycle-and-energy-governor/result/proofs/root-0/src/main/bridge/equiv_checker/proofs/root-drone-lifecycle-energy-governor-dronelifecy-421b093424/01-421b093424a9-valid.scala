// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_421b093424a9_1_Valid {
  @pure def check(
      factstocharge: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargerReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
