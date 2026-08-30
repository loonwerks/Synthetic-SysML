// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery {

  def initialise(api: Movement_Service_Command_Delivery_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Movement_Service_Command_Delivery_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_movement_service_out(api.get_movement_service_in().get)
  }

  def finalise(api: Movement_Service_Command_Delivery_Operational_Api): Unit = { }
}
