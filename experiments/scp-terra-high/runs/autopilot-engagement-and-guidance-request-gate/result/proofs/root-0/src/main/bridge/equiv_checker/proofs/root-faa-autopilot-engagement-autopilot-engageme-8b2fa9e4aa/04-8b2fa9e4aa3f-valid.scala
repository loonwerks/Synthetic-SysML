// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8b2fa9e4aa3f_4_Valid {
  @pure def check(
      status_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Type,
      status_out: equiv_shared_0.FAA_Autopilot_Engagement.AP_Status.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_GumboX.compute_CEP_Post(status_in, status_out))) ___>: (equiv_shared_0.FAA_Autopilot_Engagement.Status_Reporting_Thread_control_process_status_reporting_Candidate_GumboX.compute_CEP_Post(status_in, status_out))) & T))
  }
}
