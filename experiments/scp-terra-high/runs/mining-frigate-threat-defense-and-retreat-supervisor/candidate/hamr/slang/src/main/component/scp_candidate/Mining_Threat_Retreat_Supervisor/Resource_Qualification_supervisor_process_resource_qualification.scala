// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Resource_Qualification_supervisor_process_resource_qualification {

  def initialise(api: Resource_Qualification_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Resource_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_cargo(api.get_raw_cargo().get)
    api.put_qualified_capacitor(api.get_raw_capacitor().get)
  }

  def finalise(api: Resource_Qualification_Operational_Api): Unit = { }
}
