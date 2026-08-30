// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor {

  def initialise(api: HumidityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_evidence(Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid)
  }

  def timeTriggered(api: HumidityNeedAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: HumidityNeedAssessor_Operational_Api): Unit = { }
}
