// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Release_Command_Derivation_dispatch_coordination_process_release_command_derivation {

  def initialise(api: Release_Command_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RELEASE_HOLD
        api.shipment_release_command == Shipment_Release_Command.Hold
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_shipment_release_command(Factory_Dispatch_Coordinator.Shipment_Release_Command.Hold)
  }

  def timeTriggered(api: Release_Command_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        Release_Command_Derivation_dispatch_coordination_process_release_command_derivation_GumboX.compute_CEP_Post(
          api.dispatch_resolution, api.shipment_release_command)
      )
    )
    val resolution: Dispatch_Resolution = api.get_dispatch_resolution().get
    val command: Shipment_Release_Command.Type = resolution.disposition match {
      case Dispatch_Disposition.Release_From_Idle => Shipment_Release_Command.Release
      case Dispatch_Disposition.Release_From_Queue => Shipment_Release_Command.Release
      case _ => Shipment_Release_Command.Hold
    }
    api.put_shipment_release_command(command)
  }

  def finalise(api: Release_Command_Derivation_Operational_Api): Unit = { }
}
