// #Sireum

package equiv_shared_0.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import equiv_shared_0._

object TransferCommandDerivation_supervisionProcess_transferCommandDerivation {
  // BEGIN FUNCTIONS
  @strictpure def commandFor(value: Mining_Cargo_Transfer_Supervisor.TransferResolution): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type = if (value.disposition == TransferDisposition.BeginAccepted) CargoTransferCommand.BeginOffload else CargoTransferCommand.Hold
  // END FUNCTIONS
}
