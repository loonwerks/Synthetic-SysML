// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_718c5b6ab31c_2_Complement {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      chargesessionsnapshot: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot,
      chargerpathqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type,
      pilotbatterystatus: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_Candidate_GumboX.compute_CEP_Post(batteryassessment, chargesessionsnapshot, chargerpathqualification, pilotbatterystatus))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_GumboX.compute_CEP_Post(batteryassessment, chargesessionsnapshot, chargerpathqualification, pilotbatterystatus))) & T)))
  }
}
