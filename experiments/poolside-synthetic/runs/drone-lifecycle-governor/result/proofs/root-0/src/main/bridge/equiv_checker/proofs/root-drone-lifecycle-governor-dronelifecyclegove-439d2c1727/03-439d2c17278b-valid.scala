// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_439d2c17278b_3_Valid {
  @pure def check(
      batterycapacity: equiv_shared_0.Drone_Lifecycle_Governor.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Drone_Lifecycle_Governor.BatteryCheck.Type,
      batteryqualification: equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
