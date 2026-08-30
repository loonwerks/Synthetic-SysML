// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1123a9afa4d3_2_Valid {
  @pure def check(
      command: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type,
      resolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_Candidate_GumboX.inititialize_IEP_Post(command))) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_GumboX.inititialize_IEP_Post(command))) & T))
  }
}
