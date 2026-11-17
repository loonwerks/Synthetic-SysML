// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner {
  var humidityTrustMemory: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type =
    Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted

  def publish(
    api: HumidityEvidenceRecoveryOwner_Operational_Api,
    evidence: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type,
    event: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type,
    gateOpen: B): Unit = {
    val report = Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport(
      humidityTrustMemory, event, evidence, gateOpen)
    api.put_report_to_humidity(report)
    api.put_report_to_status(report)
  }

  def initialise(api: HumidityEvidenceRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, humidityTrustMemory))
    humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
    val report = Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport(
      humidityTrustMemory, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityStable,
      Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.None, F)
    api.put_report_to_humidity(report)
    api.put_report_to_status(report)
  }

  def timeTriggered(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(api, humidityTrustMemory))
    val evidence: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type = api.get_evidence() match {
      case Some(value) => value
      case _ => Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid
    }
    val prior = humidityTrustMemory
    val invalid = evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid
    if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted && invalid) {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultEntered, F)
    } else if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted) {
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityStable, T)
    } else if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined && invalid) {
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultPersists, F)
    } else if (prior == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined) {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Confirming
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityRecoveryStarted, F)
    } else if (invalid) {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultRecurred, F)
    } else {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
      publish(api, evidence, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityRecovered, T)
    }
  }

  def finalise(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = { }
}
