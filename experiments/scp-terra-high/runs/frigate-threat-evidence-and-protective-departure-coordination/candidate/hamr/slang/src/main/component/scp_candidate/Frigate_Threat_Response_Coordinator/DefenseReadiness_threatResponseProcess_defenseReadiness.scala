// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseReadiness_threatResponseProcess_defenseReadiness {

  def initialise(api: DefenseReadiness_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DEFENSE_READINESS
        api.defenseReadyOut == F
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseReadyOut(F)
  }

  def timeTriggered(api: DefenseReadiness_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_readinessContextIn(), api.get_defenseGateIn()) match {
      case (Some(context), Some(gate)) =>
        api.put_defenseReadyOut(context.defenseAvailable & context.capacitorAdequate & gate == ChannelGate.OPEN)
    }
  }

  def finalise(api: DefenseReadiness_Operational_Api): Unit = { }
}
