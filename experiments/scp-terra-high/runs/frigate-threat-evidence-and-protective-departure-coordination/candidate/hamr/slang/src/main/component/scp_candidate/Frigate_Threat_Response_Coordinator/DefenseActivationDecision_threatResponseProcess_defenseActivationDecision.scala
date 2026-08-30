// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseActivationDecision_threatResponseProcess_defenseActivationDecision {

  def initialise(api: DefenseActivationDecision_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DEFENSE_PROPOSAL
        api.defenseProposalToCoordinationOut == DefenseProposal.STANDBY &
          api.defenseProposalToCompositionOut == DefenseProposal.STANDBY
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseProposalToCoordinationOut(Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)
    api.put_defenseProposalToCompositionOut(Frigate_Threat_Response_Coordinator.DefenseProposal.STANDBY)
  }

  def timeTriggered(api: DefenseActivationDecision_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_alertStateIn(), api.get_defenseReadyIn(), api.get_defenseAuthorityIn()) match {
      case (Some(alert), Some(ready), Some(authority)) =>
        var proposal: DefenseProposal.Type = DefenseProposal.STANDBY
        if ((alert == AlertState.WATCH | alert == AlertState.ALARM) &
          ready & authority == DefenseAuthority.ENABLE) {
          proposal = DefenseProposal.ACTIVATE
        }
        api.put_defenseProposalToCoordinationOut(proposal)
        api.put_defenseProposalToCompositionOut(proposal)
    }
  }

  def finalise(api: DefenseActivationDecision_Operational_Api): Unit = { }
}
