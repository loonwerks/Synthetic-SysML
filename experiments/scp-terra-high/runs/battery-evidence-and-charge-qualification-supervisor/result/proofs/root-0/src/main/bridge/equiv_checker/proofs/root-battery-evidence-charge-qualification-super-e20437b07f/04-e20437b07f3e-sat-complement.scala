// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e20437b07f3e_4_Complement {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      batterycapacity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_GumboX.inititialize_IEP_Post(batterycapacity, batterycheck, batteryassessment))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Candidate_GumboX.inititialize_IEP_Post(batteryassessment))) & T)))
  }
}
