// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_737d2fe7c5f7_2_Complement {
  @pure def check(
      request_disposition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type,
      transfer_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision,
      transfer_result: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_GumboX.inititialize_IEP_Post(transfer_result))) & T)))
  }
}
