// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d68114df3940_Candidate_Pointwise_Realizable {
  @pure def check(
      dispatch_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_Candidate_GumboX.compute_CEP_Post(dispatch_resolution, equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Release_Command.Hold)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_Candidate_GumboX.compute_CEP_Post(dispatch_resolution, equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Release_Command.Release)))))
  }
}
