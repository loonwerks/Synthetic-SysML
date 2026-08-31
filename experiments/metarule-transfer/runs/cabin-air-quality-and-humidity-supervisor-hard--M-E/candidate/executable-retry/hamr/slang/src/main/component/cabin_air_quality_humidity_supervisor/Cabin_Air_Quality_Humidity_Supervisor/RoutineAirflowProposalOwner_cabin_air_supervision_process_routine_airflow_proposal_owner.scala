// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner {

  def initialise(api: RoutineAirflowProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposal(RoutineProposalReport(RoutineProposal.None, StatusCause.None))
  }

  def timeTriggered(api: RoutineAirflowProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee ROUTINE_PROPOSAL_TOTAL_RELATION
        api.accepted.enable == EnableChoice.Off &
          api.proposal.proposal == RoutineProposal.None &
          api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.accepted.routineAirflow == RoutineAirflow.Off &
            api.proposal.proposal == RoutineProposal.None &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.accepted.routineAirflow != RoutineAirflow.Off &
            api.path == PathDisposition.Untrusted &
            api.proposal.proposal == RoutineProposal.Unavailable &
            api.proposal.cause == StatusCause.AuthorityInvalid |
          api.accepted.enable == EnableChoice.On &
            api.accepted.routineAirflow != RoutineAirflow.Off &
            api.path == PathDisposition.Reserved &
            api.proposal.proposal == RoutineProposal.Unavailable &
            api.proposal.cause == StatusCause.AirPathReserved |
          api.accepted.enable == EnableChoice.On &
            api.accepted.routineAirflow != RoutineAirflow.Off &
            api.path == PathDisposition.Usable &
            api.capability.routineBlowerDisposition != RoutineBranchBlowerDisposition.Ready &
            api.proposal.proposal == RoutineProposal.Unavailable &
            api.proposal.cause == StatusCause.EquipmentUnavailable |
          api.accepted.enable == EnableChoice.On &
            api.accepted.routineAirflow == RoutineAirflow.Low &
            api.path == PathDisposition.Usable &
            api.capability.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready &
            api.proposal.proposal == RoutineProposal.Low &
            api.proposal.cause == StatusCause.None |
          api.accepted.enable == EnableChoice.On &
            api.accepted.routineAirflow == RoutineAirflow.High &
            api.path == PathDisposition.Usable &
            api.capability.routineBlowerDisposition == RoutineBranchBlowerDisposition.Ready &
            api.proposal.proposal == RoutineProposal.High &
            api.proposal.cause == StatusCause.None
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_accepted() match {
      case Some(accepted) => api.get_path() match {
        case Some(path) => api.get_capability() match {
          case Some(capability) =>
            val result: RoutineProposalReport =
              if (accepted.enable == EnableChoice.Off || accepted.routineAirflow == RoutineAirflow.Off)
                RoutineProposalReport(RoutineProposal.None, StatusCause.None)
              else if (path == PathDisposition.Untrusted)
                RoutineProposalReport(RoutineProposal.Unavailable, StatusCause.AuthorityInvalid)
              else if (path == PathDisposition.Reserved)
                RoutineProposalReport(RoutineProposal.Unavailable, StatusCause.AirPathReserved)
              else if (capability.routineBlowerDisposition != RoutineBranchBlowerDisposition.Ready)
                RoutineProposalReport(RoutineProposal.Unavailable, StatusCause.EquipmentUnavailable)
              else if (accepted.routineAirflow == RoutineAirflow.Low)
                RoutineProposalReport(RoutineProposal.Low, StatusCause.None)
              else RoutineProposalReport(RoutineProposal.High, StatusCause.None)
            api.put_proposal(result)
        }
      }
    }
  }

  def finalise(api: RoutineAirflowProposalOwner_Operational_Api): Unit = { }
}
