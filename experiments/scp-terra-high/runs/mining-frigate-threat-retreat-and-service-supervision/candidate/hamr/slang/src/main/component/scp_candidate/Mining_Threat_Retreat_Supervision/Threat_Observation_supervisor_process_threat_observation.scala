// #Sireum

package scp_candidate.Mining_Threat_Retreat_Supervision

import org.sireum._
import org.sireum.S32._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Observation_supervisor_process_threat_observation {

  def initialise(api: Threat_Observation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_threat_sample(Mining_Threat_Retreat_Supervision.ThreatSampleValue(s32"0"))
  }

  def timeTriggered(api: Threat_Observation_Operational_Api): Unit = { }

  def finalise(api: Threat_Observation_Operational_Api): Unit = { }
}
