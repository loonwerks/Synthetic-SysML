// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e9f6137682e5_3_Valid {
  @pure def check(
      customer_notice: equiv_shared_0.Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type,
      dispatch_disposition: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Disposition.Type,
      registry_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Registry_Outcome.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
