// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_caff34ec0b48_Candidate_Pointwise_Realizable {
  @pure def check(
      request_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_Candidate_GumboX.compute_CEP_Post(request_in, equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Requested)) |
        (equiv_shared_0.FAA_Autopilot_Engagement.Guidance_Request_Delivery_Thread_control_process_guidance_request_delivery_Candidate_GumboX.compute_CEP_Post(request_in, equiv_shared_0.FAA_Autopilot_Engagement.AP_Guidance_Request.Not_Requested)))))
  }
}
