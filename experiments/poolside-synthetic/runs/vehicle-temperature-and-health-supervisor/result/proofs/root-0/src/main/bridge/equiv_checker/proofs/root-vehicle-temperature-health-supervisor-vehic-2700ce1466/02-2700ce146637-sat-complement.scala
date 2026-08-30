// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2700ce146637_2_Complement {
  @pure def check(
      assessmentforarbitration: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      assessmentforrecovery: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type,
      rawmaintenance: equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceSample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_GumboX.compute_CEP_Post(rawmaintenance, assessmentforarbitration, assessmentforrecovery))) & T)))
  }
}
