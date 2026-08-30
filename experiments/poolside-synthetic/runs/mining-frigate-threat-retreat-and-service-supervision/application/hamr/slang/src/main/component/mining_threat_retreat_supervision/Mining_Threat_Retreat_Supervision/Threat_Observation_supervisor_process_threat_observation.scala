// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Observation_supervisor_process_threat_observation {

  def initialise(api: Threat_Observation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_threat_sample(Mining_Threat_Retreat_Supervision.ThreatSampleValue.example())
  }

  def timeTriggered(api: Threat_Observation_Operational_Api): Unit = {
    // example api usage


  }

  def finalise(api: Threat_Observation_Operational_Api): Unit = { }
}
