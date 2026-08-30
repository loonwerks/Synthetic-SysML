// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_8b2fa9e4aa3f_Oracle_Pointwise_Realizable {
  @pure def check(
      status_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_GumboX.compute_CEP_Post(status_in, equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Failed)) |
        (equiv_shared_0.FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_GumboX.compute_CEP_Post(status_in, equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Off)) |
        (equiv_shared_0.FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_GumboX.compute_CEP_Post(status_in, equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.On)))))
  }
}
