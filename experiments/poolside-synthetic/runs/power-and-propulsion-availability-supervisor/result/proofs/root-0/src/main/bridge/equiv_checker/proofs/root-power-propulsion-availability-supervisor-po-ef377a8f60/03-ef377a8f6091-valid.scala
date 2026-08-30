// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ef377a8f6091_3_Valid {
  @pure def check(
      battery_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type,
      qualified_battery: equiv_shared_0.Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
