// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

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
    // example api usage

    val apiUsage_accepted: Option[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference] = api.get_accepted()
    api.logInfo(s"Received on data port accepted: ${apiUsage_accepted}")
    val apiUsage_path: Option[Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type] = api.get_path()
    api.logInfo(s"Received on data port path: ${apiUsage_path}")
    val apiUsage_capability: Option[Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact] = api.get_capability()
    api.logInfo(s"Received on data port capability: ${apiUsage_capability}")
  }

  def finalise(api: RoutineAirflowProposalOwner_Operational_Api): Unit = { }
}
