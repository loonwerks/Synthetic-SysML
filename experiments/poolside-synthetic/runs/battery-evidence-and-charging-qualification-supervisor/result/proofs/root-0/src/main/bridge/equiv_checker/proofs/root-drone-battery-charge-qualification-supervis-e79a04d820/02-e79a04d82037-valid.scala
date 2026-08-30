// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e79a04d82037_2_Valid {
  @pure def check(
      qualificationout: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(reportin, qualificationout))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(reportin, qualificationout))) & T))
  }
}
