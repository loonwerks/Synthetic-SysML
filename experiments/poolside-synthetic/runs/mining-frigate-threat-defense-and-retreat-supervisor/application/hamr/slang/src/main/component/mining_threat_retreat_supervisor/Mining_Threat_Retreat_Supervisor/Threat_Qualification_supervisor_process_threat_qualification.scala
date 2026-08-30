// #Sireum

package mining_threat_retreat_supervisor.Mining_Threat_Retreat_Supervisor

import org.sireum._
import mining_threat_retreat_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Qualification_supervisor_process_threat_qualification {

  def initialise(api: Threat_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_threat(Mining_Threat_Retreat_Supervisor.Threat_Observation.example())
  }

  def timeTriggered(api: Threat_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESERVE_THREAT
        //   Threat Qualification shall set qualified threat to raw threat
        api.qualified_threat == api.raw_threat
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_raw_threat: Option[Mining_Threat_Retreat_Supervisor.Threat_Observation] = api.get_raw_threat()
    api.put_qualified_threat(apiUsage_raw_threat.get)
    api.logInfo(s"Received on data port raw_threat: ${apiUsage_raw_threat}")
  }

  def finalise(api: Threat_Qualification_Operational_Api): Unit = { }
}
