// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_de63fbfad19e_4_Valid {
  @pure def check(
      confirmation_context: equiv_shared_0.Factory_Dispatch_Coordinator.Confirmation_Context,
      shipping_confirmation: equiv_shared_0.Factory_Dispatch_Coordinator.Shipping_Confirmation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner_GumboX.compute_CEP_Post(confirmation_context, shipping_confirmation))) ___>: (T)) & T))
  }
}
