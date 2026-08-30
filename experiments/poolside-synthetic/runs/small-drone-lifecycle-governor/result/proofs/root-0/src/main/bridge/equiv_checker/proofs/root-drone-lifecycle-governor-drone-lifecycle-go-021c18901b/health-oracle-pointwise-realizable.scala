// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_021c18901bd4_Oracle_Pointwise_Realizable {
  @pure def check(
      raw_battery: equiv_shared_0.Drone_Lifecycle_Governor.Battery_Sample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery)))))
  }
}
