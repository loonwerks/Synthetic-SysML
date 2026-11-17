// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor {

  def initialise(api: SharedPathAuthorityAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_disposition_to_routine(Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Usable)
    api.put_disposition_to_composer(Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Usable)
  }

  def timeTriggered(api: SharedPathAuthorityAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val disposition: PathDisposition.Type = api.get_authority() match {
      case Some(authority) if authority.validity == Validity.Valid &&
          authority.grant == PathGrant.Granted => PathDisposition.Usable
      case Some(authority) if authority.validity == Validity.Valid => PathDisposition.Reserved
      case _ => PathDisposition.Untrusted
    }
    api.put_disposition_to_routine(disposition)
    api.put_disposition_to_composer(disposition)
  }

  def finalise(api: SharedPathAuthorityAssessor_Operational_Api): Unit = { }
}
