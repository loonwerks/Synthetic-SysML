// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3e27ca1b4a1d_2_Valid {
  @pure def check(
      dispatch_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      dispatch_status: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Type,
      shipping_confirmation: equiv_shared_0.Factory_Dispatch_Coordinator.Shipping_Confirmation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_Candidate_GumboX.inititialize_IEP_Post(dispatch_status, shipping_confirmation))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_GumboX.inititialize_IEP_Post(dispatch_status, shipping_confirmation))) & T))
  }
}
