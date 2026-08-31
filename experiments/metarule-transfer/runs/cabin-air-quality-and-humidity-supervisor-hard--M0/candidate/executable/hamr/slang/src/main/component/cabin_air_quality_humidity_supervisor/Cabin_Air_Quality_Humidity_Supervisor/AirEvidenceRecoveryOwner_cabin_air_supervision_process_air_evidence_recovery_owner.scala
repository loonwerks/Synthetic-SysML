// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner {
  var airTrustMemory: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type =
    Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted

  def publish(
    api: AirEvidenceRecoveryOwner_Operational_Api,
    evidence: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
    event: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type,
    gateOpen: B): Unit = {
    val report = Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport(
      airTrustMemory, event, evidence, gateOpen)
    api.put_report_to_filter(report)
    api.put_report_to_status(report)
  }

  def initialise(api: AirEvidenceRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, airTrustMemory))
    airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
    val report = Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport(
      airTrustMemory, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirStable,
      Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Clean, F)
    api.put_report_to_filter(report)
    api.put_report_to_status(report)
  }

  def timeTriggered(api: AirEvidenceRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(api, airTrustMemory))
    val evidence: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type = api.get_evidence() match {
      case Some(value) => value
      case _ => Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid
    }
    val prior = airTrustMemory
    val invalid = evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid
    if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted && invalid) {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultEntered, F)
    } else if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted) {
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirStable, T)
    } else if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined && invalid) {
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultPersists, F)
    } else if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined) {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Confirming
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirRecoveryStarted, F)
    } else if (invalid) {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultRecurred, F)
    } else {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirRecovered, T)
    }
  }

  def finalise(api: AirEvidenceRecoveryOwner_Operational_Api): Unit = { }
}
