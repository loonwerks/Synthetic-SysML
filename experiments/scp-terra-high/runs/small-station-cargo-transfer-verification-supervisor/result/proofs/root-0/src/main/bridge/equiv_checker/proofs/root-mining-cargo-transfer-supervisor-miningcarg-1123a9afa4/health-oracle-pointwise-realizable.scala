// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_1123a9afa4d3_Oracle_Pointwise_Realizable {
  @pure def check(
      resolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Hold)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferCommandDerivation_supervisionProcess_transferCommandDerivation_GumboX.inititialize_IEP_Post(equiv_shared_0.Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.BeginOffload)))))
  }
}
