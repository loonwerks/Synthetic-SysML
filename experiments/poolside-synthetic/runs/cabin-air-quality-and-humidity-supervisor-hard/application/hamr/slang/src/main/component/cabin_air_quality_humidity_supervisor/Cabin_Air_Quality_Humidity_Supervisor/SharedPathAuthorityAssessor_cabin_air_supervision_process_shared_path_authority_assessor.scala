// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor {

  def initialise(api: SharedPathAuthorityAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_disposition_to_routine(Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Usable)
    api.put_disposition_to_composer(Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Usable)
  }

  def timeTriggered(api: SharedPathAuthorityAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_authority: Option[Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority] = api.get_authority()
    api.logInfo(s"Received on data port authority: ${apiUsage_authority}")
  }

  def finalise(api: SharedPathAuthorityAssessor_Operational_Api): Unit = { }
}
