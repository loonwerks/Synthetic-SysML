// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_acfe481439b7_3_Valid {
  @pure def check(
      qualificationout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
