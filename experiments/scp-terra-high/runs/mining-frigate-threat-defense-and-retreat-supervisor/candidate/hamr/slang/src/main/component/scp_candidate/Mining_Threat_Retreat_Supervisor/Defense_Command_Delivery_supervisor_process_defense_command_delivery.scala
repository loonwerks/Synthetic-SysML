// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Defense_Command_Delivery_supervisor_process_defense_command_delivery {

  def initialise(api: Defense_Command_Delivery_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Defense_Command_Delivery_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_defense_out(api.get_defense_in().get)
  }

  def finalise(api: Defense_Command_Delivery_Operational_Api): Unit = { }
}
