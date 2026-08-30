// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4e1f7b88f49b_2_Valid {
  @pure def check(
      ap_on_in: equiv_shared_0.FAA_Autopilot_Engagement.AP_On_Indication.Type,
      ap_on_out: equiv_shared_0.FAA_Autopilot_Engagement.AP_On_Indication.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_Candidate_GumboX.compute_CEP_Post(ap_on_in, ap_on_out))) ___>: (equiv_shared_0.FAA_Autopilot_Engagement.CSA_Enable_Delivery_Thread_control_process_csa_enable_delivery_GumboX.compute_CEP_Post(ap_on_in, ap_on_out))) & T))
  }
}
