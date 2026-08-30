// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_11272c55b5b7_2_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      batterycapacity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, batteryassessment))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_GumboX.compute_CEP_Post(batterycapacity, batterycheck, batteryassessment))) & T))
  }
}
