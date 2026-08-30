// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_439d2c17278b_Candidate_Pointwise_Realizable {
  @pure def check(
      batterycapacity: equiv_shared_0.Drone_Lifecycle_Governor.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Drone_Lifecycle_Governor.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.INSUFFICIENT)) |
        (equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.SUFFICIENT)))))
  }
}
