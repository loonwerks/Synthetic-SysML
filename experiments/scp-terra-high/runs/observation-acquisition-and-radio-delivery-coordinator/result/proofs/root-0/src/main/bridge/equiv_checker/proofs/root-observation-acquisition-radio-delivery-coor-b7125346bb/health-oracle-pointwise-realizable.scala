// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_b7125346bbc1_Oracle_Pointwise_Realizable {
  @pure def check(
      batterycapacity: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE)))))
  }
}
