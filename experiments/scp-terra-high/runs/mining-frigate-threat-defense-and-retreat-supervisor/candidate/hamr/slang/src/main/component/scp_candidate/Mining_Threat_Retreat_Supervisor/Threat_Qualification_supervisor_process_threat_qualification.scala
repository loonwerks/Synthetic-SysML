// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Qualification_supervisor_process_threat_qualification {

  def initialise(api: Threat_Qualification_Initialization_Api): Unit = {
  }

  def timeTriggered(api: Threat_Qualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_threat(api.get_raw_threat().get)
  }

  def finalise(api: Threat_Qualification_Operational_Api): Unit = { }
}
