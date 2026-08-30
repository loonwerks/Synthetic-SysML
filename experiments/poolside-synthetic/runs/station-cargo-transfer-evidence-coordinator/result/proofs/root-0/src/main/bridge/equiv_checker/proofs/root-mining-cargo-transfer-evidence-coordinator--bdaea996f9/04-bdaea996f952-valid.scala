// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bdaea996f952_4_Valid {
  @pure def check(
      request_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts,
      transfer_request: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_GumboX.compute_CEP_Post(transfer_request, request_facts))) ___>: (T)) & T))
  }
}
