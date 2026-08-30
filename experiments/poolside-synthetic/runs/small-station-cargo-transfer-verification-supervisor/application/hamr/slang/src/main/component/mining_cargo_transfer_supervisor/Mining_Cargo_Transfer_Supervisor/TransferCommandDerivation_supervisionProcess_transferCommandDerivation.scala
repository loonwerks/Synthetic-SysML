// #Sireum

package mining_cargo_transfer_supervisor.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import mining_cargo_transfer_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object TransferCommandDerivation_supervisionProcess_transferCommandDerivation {

  def initialise(api: TransferCommandDerivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_command(Mining_Cargo_Transfer_Supervisor.CargoTransferCommand.Hold)
  }

  def timeTriggered(api: TransferCommandDerivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_resolution: Option[Mining_Cargo_Transfer_Supervisor.TransferResolution] = api.get_resolution()
    api.logInfo(s"Received on data port resolution: ${apiUsage_resolution}")
  }

  def finalise(api: TransferCommandDerivation_Operational_Api): Unit = { }
}
