// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner {
  var humidityTrustMemory: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type =
    Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted

  def publish(api: HumidityEvidenceRecoveryOwner_Api,
              event: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type,
              evidence: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type,
              gateOpen: B): Unit = {
    val report = Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport(
      humidityTrustMemory, event, evidence, gateOpen)
    api.put_report_to_humidity(report)
    api.put_report_to_status(report)
  }

  def initialise(api: HumidityEvidenceRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, humidityTrustMemory))
    humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
    publish(api, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityStable,
      Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.None, T)
  }

  def timeTriggered(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(api, humidityTrustMemory))
    val evidence: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type = api.get_evidence() match {
      case Some(value) => value
      case _ => Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid
    }
    val previous = humidityTrustMemory
    if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted &&
        evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid) {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultEntered, evidence, F)
    } else if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted) {
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityStable, evidence, T)
    } else if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined &&
               evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid) {
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultPersists, evidence, F)
    } else if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined) {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Confirming
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityRecoveryStarted, evidence, F)
    } else if (evidence == Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid) {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityFaultRecurred, evidence, F)
    } else {
      humidityTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.HumidityRecovered, evidence, T)
    }
  }

  def finalise(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = { }
}
