// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d68114df3940_3_Valid {
  @pure def check(
      dispatch_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      shipment_release_command: equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Release_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
