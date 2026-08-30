// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Mining_Command_Delivery_supervisor_process_mining_command_delivery {

  def initialise(api: Mining_Command_Delivery_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Mining_Command_Delivery_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_mining_out(api.get_mining_in().get)
  }

  def finalise(api: Mining_Command_Delivery_Operational_Api): Unit = { }
}
