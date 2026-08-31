// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor {

  def initialise(api: SharedPathAuthorityAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_disposition_to_routine(PathDisposition.Untrusted)
    api.put_disposition_to_composer(PathDisposition.Untrusted)
  }

  def timeTriggered(api: SharedPathAuthorityAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PATH_DISPOSITION_CLASSIFICATION
        api.disposition_to_routine == api.disposition_to_composer &
          (api.authority.validity == Validity.Invalid &
            api.disposition_to_routine == PathDisposition.Untrusted |
            api.authority.validity == Validity.Valid &
              api.authority.grant == PathGrant.Reserved &
              api.disposition_to_routine == PathDisposition.Reserved |
            api.authority.validity == Validity.Valid &
              api.authority.grant == PathGrant.Granted &
              api.disposition_to_routine == PathDisposition.Usable)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_authority() match {
      case Some(authority) =>
        val disposition: PathDisposition.Type =
          if (authority.validity == Validity.Invalid) PathDisposition.Untrusted
          else if (authority.grant == PathGrant.Reserved) PathDisposition.Reserved
          else PathDisposition.Usable
        api.put_disposition_to_routine(disposition)
        api.put_disposition_to_composer(disposition)
    }
  }

  def finalise(api: SharedPathAuthorityAssessor_Operational_Api): Unit = { }
}
