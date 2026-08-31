// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner {

  def initialise(api: HumidityEvidenceRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_report_to_humidity(Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport.example())
    api.put_report_to_status(Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport.example())
  }

  def timeTriggered(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_evidence: Option[Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type] = api.get_evidence()
    api.logInfo(s"Received on data port evidence: ${apiUsage_evidence}")
  }

  def finalise(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = { }
}
