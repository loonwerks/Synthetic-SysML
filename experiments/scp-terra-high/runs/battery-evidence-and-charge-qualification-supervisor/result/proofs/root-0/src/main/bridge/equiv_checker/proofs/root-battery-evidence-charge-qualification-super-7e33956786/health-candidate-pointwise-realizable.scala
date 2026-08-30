// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_7e33956786c6_Candidate_Pointwise_Realizable {
  @pure def check(
      batteryassessment: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type,
      lifecyclecontext: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Candidate_GumboX.compute_CEP_Post(batteryassessment, lifecyclecontext, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.CLEAR)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Candidate_GumboX.compute_CEP_Post(batteryassessment, lifecyclecontext, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_BATTERY)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Candidate_GumboX.compute_CEP_Post(batteryassessment, lifecyclecontext, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT)) |
        (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Candidate_GumboX.compute_CEP_Post(batteryassessment, lifecyclecontext, equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE)))))
  }
}
