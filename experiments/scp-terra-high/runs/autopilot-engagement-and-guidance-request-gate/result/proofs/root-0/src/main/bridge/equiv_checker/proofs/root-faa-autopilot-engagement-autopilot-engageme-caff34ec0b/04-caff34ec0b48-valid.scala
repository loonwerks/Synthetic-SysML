// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_caff34ec0b48_4_Valid {
  @pure def check(
      request_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Type,
      request_out: equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_GumboX.compute_CEP_Post(request_in, request_out))) ___>: (equiv_shared_0.FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_Candidate_GumboX.compute_CEP_Post(request_in, request_out))) & T))
  }
}
