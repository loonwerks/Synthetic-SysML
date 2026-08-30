// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d0df72c27275_4_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type,
      batterycapacity: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_GumboX.inititialize_IEP_Post(batterycapacity, batterycheck, batteryassessment))) ___>: (T)) & T))
  }
}
