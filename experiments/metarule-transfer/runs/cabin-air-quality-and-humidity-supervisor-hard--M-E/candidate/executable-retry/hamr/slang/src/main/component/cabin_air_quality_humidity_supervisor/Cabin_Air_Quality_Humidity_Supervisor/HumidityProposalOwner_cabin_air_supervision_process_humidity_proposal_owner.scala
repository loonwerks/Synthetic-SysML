// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposal(HumidityProposalReport(HumidityProposal.None, StatusCause.None))
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee HUMIDITY_PROPOSAL_TOTAL_RELATION
        (api.accepted.enable == EnableChoice.Off |
          api.accepted.humidityPolicy == HumidityPolicy.Disabled) &
          api.proposal.proposal == HumidityProposal.None &
          api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.accepted.humidityPolicy == HumidityPolicy.Automatic &
            (api.humidity_report.gateOpen == F |
              api.humidity_report.evidence == HumidityEvidence.Invalid) &
            api.proposal.proposal == HumidityProposal.None &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.accepted.humidityPolicy == HumidityPolicy.Automatic &
            api.humidity_report.gateOpen == T &
            api.humidity_report.evidence == HumidityEvidence.None &
            api.proposal.proposal == HumidityProposal.None &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.accepted.humidityPolicy == HumidityPolicy.Automatic &
            api.humidity_report.gateOpen == T &
            (api.humidity_report.evidence == HumidityEvidence.Dry |
              api.humidity_report.evidence == HumidityEvidence.Damp) &
            api.capabilities.humidityBlowerDisposition != HumidityBranchBlowerDisposition.Ready &
            api.proposal.proposal == HumidityProposal.Unavailable &
            api.proposal.cause == StatusCause.EquipmentUnavailable |
          api.accepted.enable == EnableChoice.On &
            api.accepted.humidityPolicy == HumidityPolicy.Automatic &
            api.humidity_report.gateOpen == T &
            api.humidity_report.evidence == HumidityEvidence.Dry &
            api.capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            api.capabilities.humidifierDisposition != HumidityBranchHumidifierDisposition.Ready &
            api.proposal.proposal == HumidityProposal.Unavailable &
            api.proposal.cause == StatusCause.SelectedPathUnavailable |
          api.accepted.enable == EnableChoice.On &
            api.accepted.humidityPolicy == HumidityPolicy.Automatic &
            api.humidity_report.gateOpen == T &
            api.humidity_report.evidence == HumidityEvidence.Damp &
            api.capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            api.capabilities.dehumidifierDisposition != HumidityBranchDehumidifierDisposition.Ready &
            api.proposal.proposal == HumidityProposal.Unavailable &
            api.proposal.cause == StatusCause.SelectedPathUnavailable |
          api.accepted.enable == EnableChoice.On &
            api.accepted.humidityPolicy == HumidityPolicy.Automatic &
            api.humidity_report.gateOpen == T &
            api.humidity_report.evidence == HumidityEvidence.Dry &
            api.capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            api.capabilities.humidifierDisposition == HumidityBranchHumidifierDisposition.Ready &
            api.proposal.proposal == HumidityProposal.Increase &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.accepted.humidityPolicy == HumidityPolicy.Automatic &
            api.humidity_report.gateOpen == T &
            api.humidity_report.evidence == HumidityEvidence.Damp &
            api.capabilities.humidityBlowerDisposition == HumidityBranchBlowerDisposition.Ready &
            api.capabilities.dehumidifierDisposition == HumidityBranchDehumidifierDisposition.Ready &
            api.proposal.proposal == HumidityProposal.Reduce &
            api.proposal.cause == StatusCause.None
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_humidity_report() match {
      case Some(humidity) => api.get_accepted() match {
        case Some(accepted) => api.get_capabilities() match {
          case Some(capabilities) =>
            val enabled = accepted.enable == EnableChoice.On &&
              accepted.humidityPolicy == HumidityPolicy.Automatic && humidity.gateOpen
            val result: HumidityProposalReport =
              if (!enabled || humidity.evidence == HumidityEvidence.Invalid ||
                  humidity.evidence == HumidityEvidence.None)
                HumidityProposalReport(HumidityProposal.None, StatusCause.None)
              else if (capabilities.humidityBlowerDisposition != HumidityBranchBlowerDisposition.Ready)
                HumidityProposalReport(HumidityProposal.Unavailable, StatusCause.EquipmentUnavailable)
              else if (humidity.evidence == HumidityEvidence.Dry &&
                  capabilities.humidifierDisposition != HumidityBranchHumidifierDisposition.Ready)
                HumidityProposalReport(HumidityProposal.Unavailable, StatusCause.SelectedPathUnavailable)
              else if (humidity.evidence == HumidityEvidence.Damp &&
                  capabilities.dehumidifierDisposition != HumidityBranchDehumidifierDisposition.Ready)
                HumidityProposalReport(HumidityProposal.Unavailable, StatusCause.SelectedPathUnavailable)
              else if (humidity.evidence == HumidityEvidence.Dry)
                HumidityProposalReport(HumidityProposal.Increase, StatusCause.None)
              else HumidityProposalReport(HumidityProposal.Reduce, StatusCause.None)
            api.put_proposal(result)
        }
      }
    }
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
