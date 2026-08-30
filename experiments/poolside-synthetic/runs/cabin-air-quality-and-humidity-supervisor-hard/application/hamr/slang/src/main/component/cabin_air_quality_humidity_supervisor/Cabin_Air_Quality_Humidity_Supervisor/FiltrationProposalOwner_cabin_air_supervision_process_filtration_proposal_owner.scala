// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport.example())
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_air_report: Option[Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport] = api.get_air_report()
    api.logInfo(s"Received on data port air_report: ${apiUsage_air_report}")
    val apiUsage_accepted: Option[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference] = api.get_accepted()
    api.logInfo(s"Received on data port accepted: ${apiUsage_accepted}")
    val apiUsage_capabilities: Option[Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts] = api.get_capabilities()
    api.logInfo(s"Received on data port capabilities: ${apiUsage_capabilities}")
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
