// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(
      Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.None,
      Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_humidity_report(), api.get_accepted(), api.get_capabilities()) match {
      case (Some(report), Some(accepted), Some(capabilities)) =>
        val result: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport =
          if (accepted.enable == Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off ||
              accepted.humidityPolicy == Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Disabled ||
              !report.gateOpen || report.evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid ||
              report.evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.None)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.None, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
          else if (capabilities.humidityBlowerDisposition != Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Unavailable, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable)
          else if (report.evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Dry &&
                   capabilities.humidifierDisposition != Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Unavailable, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable)
          else if (report.evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Damp &&
                   capabilities.dehumidifierDisposition != Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Ready)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Unavailable, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.SelectedPathUnavailable)
          else if (report.evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Dry)
            Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Increase, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
          else Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Reduce, Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
        api.put_proposal(result)
      case _ => api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport(
        Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.None,
        Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
    }
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
