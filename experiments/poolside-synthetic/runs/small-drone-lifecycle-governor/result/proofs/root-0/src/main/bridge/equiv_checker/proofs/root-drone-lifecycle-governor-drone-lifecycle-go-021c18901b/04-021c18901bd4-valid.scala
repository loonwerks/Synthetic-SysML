// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_021c18901bd4_4_Valid {
  @pure def check(
      battery_assessment: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Type,
      raw_battery: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Sample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_GumboX.inititialize_IEP_Post(battery_assessment))) ___>: (T)) & T))
  }
}
