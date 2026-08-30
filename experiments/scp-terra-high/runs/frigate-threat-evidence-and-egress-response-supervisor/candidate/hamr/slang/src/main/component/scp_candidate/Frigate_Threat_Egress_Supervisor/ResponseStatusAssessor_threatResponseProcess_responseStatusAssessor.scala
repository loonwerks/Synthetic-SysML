// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor {

  def initialise(api: ResponseStatusAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_responseStatus(Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET)
  }

  def timeTriggered(api: ResponseStatusAssessor_Operational_Api): Unit = {
    api.put_responseStatus(Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET)
  }

  def finalise(api: ResponseStatusAssessor_Operational_Api): Unit = { }
}
