// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1123a9afa4d3_1_Valid {
  @pure def check(
      command: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type,
      resolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
