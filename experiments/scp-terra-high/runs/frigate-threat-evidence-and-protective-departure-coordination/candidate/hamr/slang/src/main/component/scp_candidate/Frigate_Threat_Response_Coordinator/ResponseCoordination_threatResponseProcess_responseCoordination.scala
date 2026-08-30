// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResponseCoordination_threatResponseProcess_responseCoordination {

  def initialise(api: ResponseCoordination_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_PATTERN
        api.responsePatternOut == ResponsePattern.OBSERVE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_responsePatternOut(Frigate_Threat_Response_Coordinator.ResponsePattern.OBSERVE)
  }

  def timeTriggered(api: ResponseCoordination_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_defenseProposalIn(), api.get_escapeProposalIn()) match {
      case (Some(defense), Some(escape)) =>
        var pattern: ResponsePattern.Type = ResponsePattern.OBSERVE
        if (escape == EscapeProposal.DEPART) {
          pattern = ResponsePattern.DEPARTURE
        } else if (defense == DefenseProposal.ACTIVATE) {
          pattern = ResponsePattern.DEFENSE
        }
        api.put_responsePatternOut(pattern)
    }
  }

  def finalise(api: ResponseCoordination_Operational_Api): Unit = { }
}
