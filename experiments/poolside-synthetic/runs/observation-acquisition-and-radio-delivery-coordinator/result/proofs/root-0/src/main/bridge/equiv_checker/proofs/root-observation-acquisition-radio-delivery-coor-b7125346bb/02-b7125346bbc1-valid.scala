// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b7125346bbc1_2_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      batterycapacity: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(batterycapacity, batterycheck, batteryassessment))) & T))
  }
}
