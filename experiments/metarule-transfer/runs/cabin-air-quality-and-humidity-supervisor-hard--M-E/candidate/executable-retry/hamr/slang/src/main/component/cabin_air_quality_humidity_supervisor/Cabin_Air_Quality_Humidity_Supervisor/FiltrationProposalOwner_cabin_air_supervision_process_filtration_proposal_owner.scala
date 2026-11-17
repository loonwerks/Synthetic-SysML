// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposal(FilterProposalReport(FilterProposal.None, StatusCause.None))
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee FILTER_PROPOSAL_TOTAL_RELATION
        api.accepted.enable == EnableChoice.Off &
          api.proposal.proposal == FilterProposal.None &
          api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            (api.air_report.gateOpen == F |
              api.air_report.evidence == AirEvidence.Invalid) &
            api.proposal.proposal == FilterProposal.None &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.air_report.gateOpen == T &
            api.air_report.evidence == AirEvidence.Clean &
            api.accepted.filterPolicy == FilterPolicy.Automatic &
            api.proposal.proposal == FilterProposal.None &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.air_report.gateOpen == T &
            api.air_report.evidence != AirEvidence.Invalid &
            (api.accepted.filterPolicy == FilterPolicy.Continuous |
              api.air_report.evidence == AirEvidence.FilterDemand) &
            api.capabilities.filterBlowerDisposition != FilterBranchBlowerDisposition.Ready &
            api.proposal.proposal == FilterProposal.Unavailable &
            api.proposal.cause == StatusCause.EquipmentUnavailable |
          api.accepted.enable == EnableChoice.On &
            api.air_report.gateOpen == T &
            api.air_report.evidence != AirEvidence.Invalid &
            (api.accepted.filterPolicy == FilterPolicy.Continuous |
              api.air_report.evidence == AirEvidence.FilterDemand) &
            api.capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready &
            api.capabilities.filterDisposition != FilterBranchPathDisposition.Ready &
            api.proposal.proposal == FilterProposal.Unavailable &
            api.proposal.cause == StatusCause.SelectedPathUnavailable |
          api.accepted.enable == EnableChoice.On &
            api.air_report.gateOpen == T &
            api.air_report.evidence == AirEvidence.FilterDemand &
            api.accepted.filterPolicy == FilterPolicy.Automatic &
            api.capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready &
            api.capabilities.filterDisposition == FilterBranchPathDisposition.Ready &
            api.proposal.proposal == FilterProposal.Environmental &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.air_report.gateOpen == T &
            api.air_report.evidence != AirEvidence.Invalid &
            api.accepted.filterPolicy == FilterPolicy.Continuous &
            api.capabilities.filterBlowerDisposition == FilterBranchBlowerDisposition.Ready &
            api.capabilities.filterDisposition == FilterBranchPathDisposition.Ready &
            api.proposal.proposal == FilterProposal.Continuous &
            api.proposal.cause == StatusCause.None
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_air_report() match {
      case Some(air) => api.get_accepted() match {
        case Some(accepted) => api.get_capabilities() match {
          case Some(capabilities) =>
            val demand = accepted.enable == EnableChoice.On && air.gateOpen &&
              air.evidence != AirEvidence.Invalid &&
              (accepted.filterPolicy == FilterPolicy.Continuous || air.evidence == AirEvidence.FilterDemand)
            val result: FilterProposalReport =
              if (!demand) FilterProposalReport(FilterProposal.None, StatusCause.None)
              else if (capabilities.filterBlowerDisposition != FilterBranchBlowerDisposition.Ready)
                FilterProposalReport(FilterProposal.Unavailable, StatusCause.EquipmentUnavailable)
              else if (capabilities.filterDisposition != FilterBranchPathDisposition.Ready)
                FilterProposalReport(FilterProposal.Unavailable, StatusCause.SelectedPathUnavailable)
              else if (accepted.filterPolicy == FilterPolicy.Continuous)
                FilterProposalReport(FilterProposal.Continuous, StatusCause.None)
              else FilterProposalReport(FilterProposal.Environmental, StatusCause.None)
            api.put_proposal(result)
        }
      }
    }
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
