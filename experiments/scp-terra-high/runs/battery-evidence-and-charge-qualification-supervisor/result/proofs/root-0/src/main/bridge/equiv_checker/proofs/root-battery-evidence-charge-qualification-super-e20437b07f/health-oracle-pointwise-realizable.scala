// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_e20437b07f3e_Oracle_Pointwise_Realizable {
  @pure def check(
      batterycapacity: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type,
      batterycheck: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_GumboX.inititialize_IEP_Post(batterycapacity, batterycheck, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_GumboX.inititialize_IEP_Post(batterycapacity, batterycheck, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_GumboX.inititialize_IEP_Post(batterycapacity, batterycheck, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.ADEQUATE)))))
  }
}
