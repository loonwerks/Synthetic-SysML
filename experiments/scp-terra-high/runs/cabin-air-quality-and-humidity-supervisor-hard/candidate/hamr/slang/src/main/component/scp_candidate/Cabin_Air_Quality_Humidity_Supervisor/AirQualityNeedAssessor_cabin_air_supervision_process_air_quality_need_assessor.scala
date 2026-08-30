// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor {

  def initialise(api: AirQualityNeedAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_evidence(Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid)
  }

  def timeTriggered(api: AirQualityNeedAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: AirQualityNeedAssessor_Operational_Api): Unit = { }
}
