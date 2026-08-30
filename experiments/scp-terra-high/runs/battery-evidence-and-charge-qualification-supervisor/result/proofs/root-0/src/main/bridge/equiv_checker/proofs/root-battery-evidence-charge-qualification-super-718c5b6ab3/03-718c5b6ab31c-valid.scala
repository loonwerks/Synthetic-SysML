// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_718c5b6ab31c_3_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      chargesessionsnapshot: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot,
      chargerpathqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type,
      pilotbatterystatus: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
