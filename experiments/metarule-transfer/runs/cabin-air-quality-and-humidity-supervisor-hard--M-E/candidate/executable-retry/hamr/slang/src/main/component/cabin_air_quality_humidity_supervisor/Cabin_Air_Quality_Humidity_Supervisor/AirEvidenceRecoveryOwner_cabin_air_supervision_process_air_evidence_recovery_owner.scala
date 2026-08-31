// #Sireum

package cabin_air_quality_humidity_supervisor.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import cabin_air_quality_humidity_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner {

  // BEGIN STATE VARS
  var airTrustMemory: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type = Cabin_Air_Quality_Humidity_Supervisor.TrustState.Trusted
  // END STATE VARS

  def initialise(api: AirEvidenceRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, airTrustMemory))
    airTrustMemory = TrustState.Trusted
    val report = AirRecoveryReport(TrustState.Trusted, AirRecoveryEvent.AirStable, AirEvidence.Clean, F)
    api.put_report_to_filter(report)
    api.put_report_to_status(report)
  }

  def timeTriggered(api: AirEvidenceRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, airTrustMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee AIR_REPORT_FANOUT
        api.report_to_filter.trust == airTrustMemory &
          api.report_to_filter.evidence == api.evidence &
          api.report_to_status.trust == api.report_to_filter.trust &
          api.report_to_status.transitionEvent == api.report_to_filter.transitionEvent &
          api.report_to_status.evidence == api.report_to_filter.evidence &
          api.report_to_status.gateOpen == api.report_to_filter.gateOpen,
        // case CASE_05_AIR_FAULT_ENTERED
        (In(airTrustMemory) == TrustState.Trusted &
          api.evidence == AirEvidence.Invalid) ___>: (airTrustMemory == TrustState.Quarantined &
          api.report_to_filter.gateOpen == F &
          api.report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultEntered),
        // case CASE_06_AIR_STABLE
        (In(airTrustMemory) == TrustState.Trusted &
          api.evidence != AirEvidence.Invalid) ___>: (airTrustMemory == TrustState.Trusted &
          api.report_to_filter.gateOpen == T &
          api.report_to_filter.transitionEvent == AirRecoveryEvent.AirStable),
        // case CASE_07_AIR_FAULT_PERSISTS
        (In(airTrustMemory) == TrustState.Quarantined &
          api.evidence == AirEvidence.Invalid) ___>: (airTrustMemory == TrustState.Quarantined &
          api.report_to_filter.gateOpen == F &
          api.report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultPersists),
        // case CASE_08_AIR_RECOVERY_STARTED
        (In(airTrustMemory) == TrustState.Quarantined &
          api.evidence != AirEvidence.Invalid) ___>: (airTrustMemory == TrustState.Confirming &
          api.report_to_filter.gateOpen == F &
          api.report_to_filter.transitionEvent == AirRecoveryEvent.AirRecoveryStarted),
        // case CASE_09_AIR_FAULT_RECURRED
        (In(airTrustMemory) == TrustState.Confirming &
          api.evidence == AirEvidence.Invalid) ___>: (airTrustMemory == TrustState.Quarantined &
          api.report_to_filter.gateOpen == F &
          api.report_to_filter.transitionEvent == AirRecoveryEvent.AirFaultRecurred),
        // case CASE_10_AIR_RECOVERED
        (In(airTrustMemory) == TrustState.Confirming &
          api.evidence != AirEvidence.Invalid) ___>: (airTrustMemory == TrustState.Trusted &
          api.report_to_filter.gateOpen == T &
          api.report_to_filter.transitionEvent == AirRecoveryEvent.AirRecovered)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_evidence() match {
      case Some(evidence) =>
        val prior = airTrustMemory
        val invalid = evidence == AirEvidence.Invalid
        val event: AirRecoveryEvent.Type =
          if (prior == TrustState.Trusted && invalid) AirRecoveryEvent.AirFaultEntered
          else if (prior == TrustState.Trusted) AirRecoveryEvent.AirStable
          else if (prior == TrustState.Quarantined && invalid) AirRecoveryEvent.AirFaultPersists
          else if (prior == TrustState.Quarantined) AirRecoveryEvent.AirRecoveryStarted
          else if (invalid) AirRecoveryEvent.AirFaultRecurred
          else AirRecoveryEvent.AirRecovered
        airTrustMemory =
          if (prior == TrustState.Trusted && invalid) TrustState.Quarantined
          else if (prior == TrustState.Quarantined && !invalid) TrustState.Confirming
          else if (prior == TrustState.Confirming && invalid) TrustState.Quarantined
          else if (prior == TrustState.Confirming) TrustState.Trusted
          else prior
        val report = AirRecoveryReport(airTrustMemory, event, evidence, airTrustMemory == TrustState.Trusted)
        api.put_report_to_filter(report)
        api.put_report_to_status(report)
    }
  }

  def finalise(api: AirEvidenceRecoveryOwner_Operational_Api): Unit = { }
}
