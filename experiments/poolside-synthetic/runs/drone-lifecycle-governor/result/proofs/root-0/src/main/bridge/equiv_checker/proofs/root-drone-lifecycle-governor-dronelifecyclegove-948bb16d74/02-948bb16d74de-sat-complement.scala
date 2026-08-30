// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_948bb16d74de_2_Complement {
  @pure def check(
      batteryqualification: equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.Type,
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      pilotstatus: equiv_shared_0.Drone_Lifecycle_Governor.PilotStatus): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_GumboX.compute_CEP_Post(batteryqualification, decisionsnapshot, pilotstatus))) & T)))
  }
}
