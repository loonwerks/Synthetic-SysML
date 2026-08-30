// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision {

  def initialise(api: DepartureInitiationDecision_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ESCAPE_PROPOSAL
        api.escapeProposalToCoordinationOut == EscapeProposal.STAY &
          api.escapeProposalToCompositionOut == EscapeProposal.STAY
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_escapeProposalToCoordinationOut(Frigate_Threat_Response_Coordinator.EscapeProposal.STAY)
    api.put_escapeProposalToCompositionOut(Frigate_Threat_Response_Coordinator.EscapeProposal.STAY)
  }

  def timeTriggered(api: DepartureInitiationDecision_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_alertStateIn(), api.get_escapeReadyIn(), api.get_escapeAuthorityIn()) match {
      case (Some(alert), Some(ready), Some(authority)) =>
        var proposal: EscapeProposal.Type = EscapeProposal.STAY
        if (alert == AlertState.ALARM & ready &
          authority == EscapeAuthority.ENABLE) {
          proposal = EscapeProposal.DEPART
        }
        api.put_escapeProposalToCoordinationOut(proposal)
        api.put_escapeProposalToCompositionOut(proposal)
    }
  }

  def finalise(api: DepartureInitiationDecision_Operational_Api): Unit = { }
}
