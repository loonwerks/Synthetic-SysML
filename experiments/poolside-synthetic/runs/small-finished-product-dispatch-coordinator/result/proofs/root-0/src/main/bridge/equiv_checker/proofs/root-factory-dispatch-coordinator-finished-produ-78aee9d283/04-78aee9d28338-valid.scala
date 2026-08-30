// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_78aee9d28338_4_Valid {
  @pure def check(
      dispatch_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      dispatch_status: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Type,
      shipping_confirmation: equiv_shared_0.Factory_Dispatch_Coordinator.Shipping_Confirmation.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_GumboX.compute_CEP_Post(dispatch_resolution, dispatch_status, shipping_confirmation))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_Candidate_GumboX.compute_CEP_Post(dispatch_resolution, dispatch_status, shipping_confirmation))) & T))
  }
}
