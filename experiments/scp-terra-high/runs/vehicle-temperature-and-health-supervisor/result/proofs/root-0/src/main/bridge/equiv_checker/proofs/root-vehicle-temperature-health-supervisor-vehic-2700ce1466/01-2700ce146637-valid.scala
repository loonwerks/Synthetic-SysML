// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2700ce146637_1_Valid {
  @pure def check(
      assessmentforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      assessmentforrecovery: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      rawmaintenance: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
