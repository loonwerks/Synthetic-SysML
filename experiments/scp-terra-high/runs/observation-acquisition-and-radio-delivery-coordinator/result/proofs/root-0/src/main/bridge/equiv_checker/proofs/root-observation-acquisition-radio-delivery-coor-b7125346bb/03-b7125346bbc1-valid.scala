// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b7125346bbc1_3_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      batterycapacity: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
