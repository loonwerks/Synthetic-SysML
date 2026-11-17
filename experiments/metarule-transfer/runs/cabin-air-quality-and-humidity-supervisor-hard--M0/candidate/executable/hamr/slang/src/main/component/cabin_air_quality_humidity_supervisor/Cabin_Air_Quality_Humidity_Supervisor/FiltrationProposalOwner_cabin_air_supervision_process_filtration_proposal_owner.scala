// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
      Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.None,
      Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_air_report() match {
      case Some(air) => api.get_accepted() match {
        case Some(accepted) => api.get_capabilities() match {
          case Some(capabilities) =>
            val demand = accepted.filterPolicy == Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Continuous ||
              air.evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.FilterDemand
            val result: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport =
              if (accepted.enable == Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off ||
                  !air.gateOpen || air.evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid ||
                  !demand)
                Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.None,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
              else if (capabilities.filterBlowerDisposition !=
                       Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Ready)
                Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Unavailable,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable)
              else if (capabilities.filterDisposition !=
                       Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Ready)
                Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Unavailable,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable)
              else if (air.evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.FilterDemand &&
                       accepted.filterPolicy == Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Automatic)
                Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Environmental,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
              else Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
                Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Continuous,
                Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
            api.put_proposal(result)
          case _ => api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
            Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.None,
            Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
        }
        case _ => api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
          Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.None,
          Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
      }
      case _ => api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport(
        Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.None,
        Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
    }
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
