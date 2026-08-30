// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Availability_Qualification_supervisor_process_request_availability_qualification {

  def initialise(api: Request_Availability_Qualification_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Request_Availability_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_request(api.get_raw_request().get)
    api.put_qualified_mining_availability(api.get_raw_mining_availability().get)
    api.put_qualified_defense_availability(api.get_raw_defense_availability().get)
    api.put_qualified_retreat_availability(api.get_raw_retreat_availability().get)
  }

  def finalise(api: Request_Availability_Qualification_Operational_Api): Unit = { }
}
