// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner {

  def initialise(api: RoutineAirflowProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport.example())
  }

  def timeTriggered(api: RoutineAirflowProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: RoutineAirflowProposalOwner_Operational_Api): Unit = { }
}
