// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TransferCommandDerivation_supervisionProcess_transferCommandDerivation {

  // BEGIN FUNCTIONS
  @strictpure def commandFor(value: Mining_Cargo_Transfer_Supervisor.TransferResolution): Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Type = if (value.disposition == TransferDisposition.BeginAccepted) CargoTransferCommand.BeginOffload else CargoTransferCommand.Hold
  // END FUNCTIONS

  def initialise(api: TransferCommandDerivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_COMMAND_SAFE
        api.command == CargoTransferCommand.Hold
        // END INITIALIZES ENSURES
      )
    )
    api.put_command(CargoTransferCommand.Hold)
  }

  def timeTriggered(api: TransferCommandDerivation_Operational_Api): Unit = {
    Contract(Modifies(api))
    val resolution = api.get_resolution().get
    api.put_command(commandFor(resolution))
  }

  def finalise(api: TransferCommandDerivation_Operational_Api): Unit = { }
}
