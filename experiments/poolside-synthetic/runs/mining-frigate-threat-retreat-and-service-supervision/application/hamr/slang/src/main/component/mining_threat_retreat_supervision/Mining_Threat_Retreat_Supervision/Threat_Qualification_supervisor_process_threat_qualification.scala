// #Sireum

package mining_threat_retreat_supervision.Mining_Threat_Retreat_Supervision

import org.sireum._
import mining_threat_retreat_supervision._

// This file will not be overwritten if HAMR codegen is rerun
object Threat_Qualification_supervisor_process_threat_qualification {

  def initialise(api: Threat_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_threat_validity(Mining_Threat_Retreat_Supervision.ThreatValidityValue.example())
    api.put_disposition_mining(Mining_Threat_Retreat_Supervision.ThreatDispositionValue.example())
    api.put_disposition_defense(Mining_Threat_Retreat_Supervision.ThreatDispositionValue.example())
    api.put_disposition_mobility(Mining_Threat_Retreat_Supervision.ThreatDispositionValue.example())
  }

  def timeTriggered(api: Threat_Qualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_threat_sample: Option[Mining_Threat_Retreat_Supervision.ThreatSampleValue] = api.get_threat_sample()
    api.logInfo(s"Received on data port threat_sample: ${apiUsage_threat_sample}")
  }

  def finalise(api: Threat_Qualification_Operational_Api): Unit = { }
}
