// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DepartureReadiness_threatResponseProcess_departureReadiness {

  def initialise(api: DepartureReadiness_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ESCAPE_READINESS
        api.escapeReadyOut == F
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_escapeReadyOut(F)
  }

  def timeTriggered(api: DepartureReadiness_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_navigationAvailableIn(), api.get_routeStatusIn(), api.get_miningInterlockIn(), api.get_escapeGateIn()) match {
      case (Some(navigation), Some(route), Some(interlock), Some(gate)) =>
        api.put_escapeReadyOut(navigation & route == RouteStatus.READY &
          interlock == MiningInterlock.CLEAR & gate == ChannelGate.OPEN)
    }
  }

  def finalise(api: DepartureReadiness_Operational_Api): Unit = { }
}
