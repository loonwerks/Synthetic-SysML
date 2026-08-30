// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b631eed777da_2_Complement {
  @pure def check(
      request_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts,
      transfer_request: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_GumboX.inititialize_IEP_Post(request_facts))) & T)))
  }
}
