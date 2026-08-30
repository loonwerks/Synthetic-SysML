// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_16197f5c0387_3_Valid {
  @pure def check(
      confirmation_context: equiv_shared_0.Factory_Dispatch_Coordinator.Confirmation_Context,
      shipping_confirmation: equiv_shared_0.Factory_Dispatch_Coordinator.Shipping_Confirmation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
