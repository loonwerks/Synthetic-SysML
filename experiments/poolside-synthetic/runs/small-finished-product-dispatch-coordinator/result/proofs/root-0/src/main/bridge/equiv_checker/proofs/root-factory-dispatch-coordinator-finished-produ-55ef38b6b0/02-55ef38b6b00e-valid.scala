// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_55ef38b6b00e_2_Valid {
  @pure def check(
      dispatch_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      shipment_release_command: equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Release_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_Candidate_GumboX.inititialize_IEP_Post(shipment_release_command))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_GumboX.inititialize_IEP_Post(shipment_release_command))) & T))
  }
}
