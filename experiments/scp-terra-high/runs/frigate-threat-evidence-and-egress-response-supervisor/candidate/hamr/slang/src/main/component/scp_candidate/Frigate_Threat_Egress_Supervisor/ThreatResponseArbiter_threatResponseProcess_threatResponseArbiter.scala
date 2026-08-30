// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatResponseArbiter_threatResponseProcess_threatResponseArbiter {

  def initialise(api: ThreatResponseArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_responseDirective(Frigate_Threat_Egress_Supervisor.ResponseDirective.RESET)
  }

  def timeTriggered(api: ThreatResponseArbiter_Operational_Api): Unit = {
    api.put_responseDirective(Frigate_Threat_Egress_Supervisor.ResponseDirective.MONITOR)
  }

  def finalise(api: ThreatResponseArbiter_Operational_Api): Unit = { }
}
