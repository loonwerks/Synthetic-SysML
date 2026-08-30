// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7e33956786c6_1_Valid {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      flightcontrolbatterynotice: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type,
      lifecyclecontext: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
