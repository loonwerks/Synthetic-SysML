// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport.example())
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_humidity_report: Option[Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport] = api.get_humidity_report()
    api.logInfo(s"Received on data port humidity_report: ${apiUsage_humidity_report}")
    val apiUsage_accepted: Option[Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference] = api.get_accepted()
    api.logInfo(s"Received on data port accepted: ${apiUsage_accepted}")
    val apiUsage_capabilities: Option[Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts] = api.get_capabilities()
    api.logInfo(s"Received on data port capabilities: ${apiUsage_capabilities}")
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
