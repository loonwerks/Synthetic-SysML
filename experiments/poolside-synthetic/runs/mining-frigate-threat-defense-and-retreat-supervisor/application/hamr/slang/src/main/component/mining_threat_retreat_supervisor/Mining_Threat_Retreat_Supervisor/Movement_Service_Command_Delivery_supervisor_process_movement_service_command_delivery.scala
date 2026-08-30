// #Sireum

package mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor

import org.sireum._
import mining_threat_retreat_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery {

  def initialise(api: Movement_Service_Command_Delivery_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.movement_service_out == Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Hold
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_movement_service_out(Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Hold)
  }

  def timeTriggered(api: Movement_Service_Command_Delivery_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESERVE_MOVEMENT_SERVICE_COMMAND
        //   Movement Service Command Delivery shall set movement service out to movement service in
        api.movement_service_out == api.movement_service_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_movement_service_in: Option[Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type] = api.get_movement_service_in()
    api.put_movement_service_out(apiUsage_movement_service_in.get)
    api.logInfo(s"Received on data port movement_service_in: ${apiUsage_movement_service_in}")
  }

  def finalise(api: Movement_Service_Command_Delivery_Operational_Api): Unit = { }
}
