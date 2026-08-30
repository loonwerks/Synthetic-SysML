// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cb47f3a0e5d8_1_Valid {
  @pure def check(
      battery_observation: equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryObservation,
      qualified_battery: equiv_shared_0.Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
