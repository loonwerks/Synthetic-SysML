// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner {

  def initialise(api: RoutineAirflowProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
      Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.None,
      Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
  }

  def timeTriggered(api: RoutineAirflowProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_accepted() match {
      case Some(accepted) => api.get_path() match {
        case Some(path) => api.get_capability() match {
          case Some(capability) =>
            val result: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport =
              if (accepted.enable == Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Off ||
                  accepted.routineAirflow == Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Off)
                Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.None,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
              else if (path == Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Untrusted)
                Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Unavailable,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AuthorityInvalid)
              else if (path == Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Reserved)
                Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Unavailable,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.AirPathReserved)
              else if (capability.routineBlowerDisposition !=
                       Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Ready)
                Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Unavailable,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.EquipmentUnavailable)
              else if (accepted.routineAirflow == Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Low)
                Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
                  Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Low,
                  Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
              else Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
                Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.High,
                Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None)
            api.put_proposal(result)
          case _ => api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
            Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.None,
            Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
        }
        case _ => api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
          Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.None,
          Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
      }
      case _ => api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport(
        Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.None,
        Cabin_Air_Quality_Humidity_Supervisor.StatusCause.None))
    }
  }

  def finalise(api: RoutineAirflowProposalOwner_Operational_Api): Unit = { }
}
