// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4e9e73214413_1_Valid {
  @pure def check(
      evidenceout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence,
      reportin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryReportValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
