// #Sireum

package mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor

import org.sireum._
import mining_threat_retreat_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Defense_Command_Delivery_supervisor_process_defense_command_delivery {

  def initialise(api: Defense_Command_Delivery_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.defense_out == Mining_Threat_Retreat_Supervisor.Defense_Command.Stand_Down
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defense_out(Mining_Threat_Retreat_Supervisor.Defense_Command.Stand_Down)
  }

  def timeTriggered(api: Defense_Command_Delivery_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESERVE_DEFENSE_COMMAND
        //   Defense Command Delivery shall set defense out to defense in
        api.defense_out == api.defense_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_defense_in: Option[Mining_Threat_Retreat_Supervisor.Defense_Command.Type] = api.get_defense_in()
    api.put_defense_out(apiUsage_defense_in.get)
    api.logInfo(s"Received on data port defense_in: ${apiUsage_defense_in}")
  }

  def finalise(api: Defense_Command_Delivery_Operational_Api): Unit = { }
}
