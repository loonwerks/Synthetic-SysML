// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6de78f692253_1_Valid {
  @pure def check(
      factstolifecycle: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HomeFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.HomeReportValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
