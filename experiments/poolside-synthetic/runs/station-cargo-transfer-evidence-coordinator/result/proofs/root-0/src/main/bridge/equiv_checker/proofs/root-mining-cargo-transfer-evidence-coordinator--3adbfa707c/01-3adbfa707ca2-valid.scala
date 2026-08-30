// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3adbfa707ca2_1_Valid {
  @pure def check(
      request_disposition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type,
      transfer_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision,
      transfer_result: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
