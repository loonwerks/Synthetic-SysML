// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8e18d1f9d20c_2_Complement {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      chargesessionsnapshot: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot,
      chargerpathqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type,
      pilotbatterystatus: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_Candidate_GumboX.inititialize_IEP_Post(pilotbatterystatus))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_GumboX.inititialize_IEP_Post(batteryassessment, chargesessionsnapshot, chargerpathqualification, pilotbatterystatus))) & T)))
  }
}
