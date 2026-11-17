// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner {
  var airTrustMemory: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type =
    Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted

  def publish(api: AirEvidenceRecoveryOwner_Api,
              event: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type,
              evidence: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
              gateOpen: B): Unit = {
    val report = Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport(
      airTrustMemory, event, evidence, gateOpen)
    api.put_report_to_filter(report)
    api.put_report_to_status(report)
  }

  def initialise(api: AirEvidenceRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, airTrustMemory))
    airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
    publish(api, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirStable,
      Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Clean, T)
  }

  def timeTriggered(api: AirEvidenceRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(api, airTrustMemory))
    val evidence: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type = api.get_evidence() match {
      case Some(value) => value
      case _ => Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid
    }
    val previous = airTrustMemory
    if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted &&
        evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid) {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultEntered, evidence, F)
    } else if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted) {
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirStable, evidence, T)
    } else if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined &&
               evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid) {
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultPersists, evidence, F)
    } else if (previous == Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined) {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Confirming
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirRecoveryStarted, evidence, F)
    } else if (evidence == Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid) {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Quarantined
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirFaultRecurred, evidence, F)
    } else {
      airTrustMemory = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
      publish(api, Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.AirRecovered, evidence, T)
    }
  }

  def finalise(api: AirEvidenceRecoveryOwner_Operational_Api): Unit = { }
}
