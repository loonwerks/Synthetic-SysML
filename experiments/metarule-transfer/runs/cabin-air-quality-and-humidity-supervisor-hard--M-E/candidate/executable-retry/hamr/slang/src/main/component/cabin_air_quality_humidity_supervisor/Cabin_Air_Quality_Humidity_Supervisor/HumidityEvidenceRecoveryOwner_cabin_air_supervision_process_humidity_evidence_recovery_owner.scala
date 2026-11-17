// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner {

  // BEGIN STATE VARS
  var humidityTrustMemory: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
  // END STATE VARS

  def initialise(api: HumidityEvidenceRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, humidityTrustMemory))
    humidityTrustMemory = TrustState.Trusted
    val report = HumidityRecoveryReport(TrustState.Trusted, HumidityRecoveryEvent.HumidityStable, HumidityEvidence.None, F)
    api.put_report_to_humidity(report)
    api.put_report_to_status(report)
  }

  def timeTriggered(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, humidityTrustMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee HUMIDITY_REPORT_FANOUT
        api.report_to_humidity.trust == humidityTrustMemory &
          api.report_to_humidity.evidence == api.evidence &
          api.report_to_status.trust == api.report_to_humidity.trust &
          api.report_to_status.transitionEvent == api.report_to_humidity.transitionEvent &
          api.report_to_status.evidence == api.report_to_humidity.evidence &
          api.report_to_status.gateOpen == api.report_to_humidity.gateOpen,
        // case CASE_11_HUMIDITY_FAULT_ENTERED
        (In(humidityTrustMemory) == TrustState.Trusted &
          api.evidence == HumidityEvidence.Invalid) ___>: (humidityTrustMemory == TrustState.Quarantined &
          api.report_to_humidity.gateOpen == F &
          api.report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultEntered),
        // case CASE_12_HUMIDITY_STABLE
        (In(humidityTrustMemory) == TrustState.Trusted &
          api.evidence != HumidityEvidence.Invalid) ___>: (humidityTrustMemory == TrustState.Trusted &
          api.report_to_humidity.gateOpen == T &
          api.report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityStable),
        // case CASE_13_HUMIDITY_FAULT_PERSISTS
        (In(humidityTrustMemory) == TrustState.Quarantined &
          api.evidence == HumidityEvidence.Invalid) ___>: (humidityTrustMemory == TrustState.Quarantined &
          api.report_to_humidity.gateOpen == F &
          api.report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultPersists),
        // case CASE_14_HUMIDITY_RECOVERY_STARTED
        (In(humidityTrustMemory) == TrustState.Quarantined &
          api.evidence != HumidityEvidence.Invalid) ___>: (humidityTrustMemory == TrustState.Confirming &
          api.report_to_humidity.gateOpen == F &
          api.report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityRecoveryStarted),
        // case CASE_15_HUMIDITY_FAULT_RECURRED
        (In(humidityTrustMemory) == TrustState.Confirming &
          api.evidence == HumidityEvidence.Invalid) ___>: (humidityTrustMemory == TrustState.Quarantined &
          api.report_to_humidity.gateOpen == F &
          api.report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityFaultRecurred),
        // case CASE_16_HUMIDITY_RECOVERED
        (In(humidityTrustMemory) == TrustState.Confirming &
          api.evidence != HumidityEvidence.Invalid) ___>: (humidityTrustMemory == TrustState.Trusted &
          api.report_to_humidity.gateOpen == T &
          api.report_to_humidity.transitionEvent == HumidityRecoveryEvent.HumidityRecovered)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_evidence() match {
      case Some(evidence) =>
        val prior = humidityTrustMemory
        val invalid = evidence == HumidityEvidence.Invalid
        val event: HumidityRecoveryEvent.Type =
          if (prior == TrustState.Trusted && invalid) HumidityRecoveryEvent.HumidityFaultEntered
          else if (prior == TrustState.Trusted) HumidityRecoveryEvent.HumidityStable
          else if (prior == TrustState.Quarantined && invalid) HumidityRecoveryEvent.HumidityFaultPersists
          else if (prior == TrustState.Quarantined) HumidityRecoveryEvent.HumidityRecoveryStarted
          else if (invalid) HumidityRecoveryEvent.HumidityFaultRecurred
          else HumidityRecoveryEvent.HumidityRecovered
        humidityTrustMemory =
          if (prior == TrustState.Trusted && invalid) TrustState.Quarantined
          else if (prior == TrustState.Quarantined && !invalid) TrustState.Confirming
          else if (prior == TrustState.Confirming && invalid) TrustState.Quarantined
          else if (prior == TrustState.Confirming) TrustState.Trusted
          else prior
        val report = HumidityRecoveryReport(humidityTrustMemory, event, evidence, humidityTrustMemory == TrustState.Trusted)
        api.put_report_to_humidity(report)
        api.put_report_to_status(report)
    }
  }

  def finalise(api: HumidityEvidenceRecoveryOwner_Operational_Api): Unit = { }
}
