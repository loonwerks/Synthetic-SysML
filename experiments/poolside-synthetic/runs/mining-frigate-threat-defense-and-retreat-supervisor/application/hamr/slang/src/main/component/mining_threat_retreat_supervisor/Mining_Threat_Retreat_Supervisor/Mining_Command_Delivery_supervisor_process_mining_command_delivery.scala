// #Sireum

package mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor

import org.sireum._
import mining_threat_retreat_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Mining_Command_Delivery_supervisor_process_mining_command_delivery {

  def initialise(api: Mining_Command_Delivery_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.mining_out == Mining_Threat_Retreat_Supervisor.Mining_Command.Stop
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mining_out(Mining_Threat_Retreat_Supervisor.Mining_Command.Stop)
  }

  def timeTriggered(api: Mining_Command_Delivery_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESERVE_MINING_COMMAND
        //   Mining Command Delivery shall set mining out to mining in
        api.mining_out == api.mining_in
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_mining_in: Option[Mining_Threat_Retreat_Supervisor.Mining_Command.Type] = api.get_mining_in()
    api.put_mining_out(apiUsage_mining_in.get)
    api.logInfo(s"Received on data port mining_in: ${apiUsage_mining_in}")
  }

  def finalise(api: Mining_Command_Delivery_Operational_Api): Unit = { }
}
