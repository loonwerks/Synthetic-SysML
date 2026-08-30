// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_11272c55b5b7_Candidate_Pointwise_Realizable {
  @pure def check(
      batterycapacity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Candidate_GumboX.compute_CEP_Post(batterycapacity, batterycheck, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.ADEQUATE)))))
  }
}
