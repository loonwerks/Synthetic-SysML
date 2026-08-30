// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3adbfa707ca2_2_Valid {
  @pure def check(
      request_disposition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type,
      transfer_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision,
      transfer_result: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_GumboX.compute_CEP_Post(request_disposition, transfer_decision, transfer_result))) & T))
  }
}
