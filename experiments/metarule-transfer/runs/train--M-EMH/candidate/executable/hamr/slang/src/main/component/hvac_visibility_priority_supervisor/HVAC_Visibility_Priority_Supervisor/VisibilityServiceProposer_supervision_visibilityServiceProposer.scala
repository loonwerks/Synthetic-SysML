// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object VisibilityServiceProposer_supervision_visibilityServiceProposer {

  def initialise(api: VisibilityServiceProposer_Initialization_Api): Unit = {
    api.put_visibilityProposal(HVAC_Visibility_Priority_Supervisor.VisibilityProposal(
      HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Unavailable,
      HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Unavailable))
  }

  def timeTriggered(api: VisibilityServiceProposer_Operational_Api): Unit = {
    (api.get_visibilityNeed(), api.get_visibilityPath()) match {
      case (Some(need), Some(path)) =>
        val applicable = need != HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Unavailable &&
          path.visibilityBlowerReady == HVAC_Visibility_Priority_Supervisor.VisibilityBlowerAvailability.Available &&
          path.clearingReady == HVAC_Visibility_Priority_Supervisor.ClearingAvailability.Available
        val urgency = need match {
          case HVAC_Visibility_Priority_Supervisor.VisibilityNeed.None =>
            HVAC_Visibility_Priority_Supervisor.ProposalUrgency.None
          case HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Preventive =>
            HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Preventive
          case HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Urgent =>
            HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Urgent
          case _ => HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Unavailable
        }
        api.put_visibilityProposal(HVAC_Visibility_Priority_Supervisor.VisibilityProposal(
          if (applicable) HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Available
          else HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Unavailable,
          urgency))
      case _ =>
        api.put_visibilityProposal(HVAC_Visibility_Priority_Supervisor.VisibilityProposal(
          HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Unavailable,
          HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Unavailable))
    }
  }

  def finalise(api: VisibilityServiceProposer_Operational_Api): Unit = { }
}
