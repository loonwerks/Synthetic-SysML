// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_439d2c17278b_2_Valid {
  @pure def check(
      batterycapacity: equiv_shared_0.Drone_Lifecycle_Governor.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Drone_Lifecycle_Governor.BatteryCheck.Type,
      batteryqualification: equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, batteryqualification))) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_GumboX.compute_CEP_Post(batterycapacity, batterycheck, batteryqualification))) & T))
  }
}
