// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2371b71fbcb7_2_Complement {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      flightcontrolbatterynotice: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type,
      lifecyclecontext: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Candidate_GumboX.inititialize_IEP_Post(batteryassessment, lifecyclecontext, flightcontrolbatterynotice))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_GumboX.inititialize_IEP_Post(batteryassessment, lifecyclecontext, flightcontrolbatterynotice))) & T)))
  }
}
