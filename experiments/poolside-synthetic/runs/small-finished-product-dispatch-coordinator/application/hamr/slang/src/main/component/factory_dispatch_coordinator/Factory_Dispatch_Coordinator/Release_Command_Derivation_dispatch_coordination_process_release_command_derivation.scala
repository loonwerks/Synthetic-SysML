// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Release_Command_Derivation_dispatch_coordination_process_release_command_derivation {

  def initialise(api: Release_Command_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_RELEASE_HOLD
        api.shipment_release_command == Shipment_Release_Command.Hold
      )
    )

    api.put_shipment_release_command(Factory_Dispatch_Coordinator.Shipment_Release_Command.Hold)
  }

  def timeTriggered(api: Release_Command_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case RELEASE_COMMAND
        //   release command issued when release resolution disposition is release from idle or from queue
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Idle |
          api.dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Queue) ___>: (api.shipment_release_command == Shipment_Release_Command.Release),
        // case HOLD_COMMAND
        //   hold command issued when release resolution disposition is not release from idle and not release from queue
        (api.dispatch_resolution.disposition != Dispatch_Disposition.Release_From_Idle &
          api.dispatch_resolution.disposition != Dispatch_Disposition.Release_From_Queue) ___>: (api.shipment_release_command == Shipment_Release_Command.Hold)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val dispatch_resolution: Factory_Dispatch_Coordinator.Dispatch_Resolution = api.get_dispatch_resolution().get
    val command: Shipment_Release_Command.Type =
      if (dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Idle |
          dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Queue) {
        Shipment_Release_Command.Release
      } else {
        Shipment_Release_Command.Hold
      }
    api.put_shipment_release_command(command)
  }

  def finalise(api: Release_Command_Derivation_Operational_Api): Unit = { }
}
