// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8535d56dc009_2_Valid {
  @pure def check(
      batteryqualification: equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.Type,
      decisionsnapshot: equiv_shared_0.Drone_Lifecycle_Governor.DecisionSnapshot,
      pilotstatus: equiv_shared_0.Drone_Lifecycle_Governor.PilotStatus): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_GumboX.inititialize_IEP_Post(pilotstatus))) & T))
  }
}
