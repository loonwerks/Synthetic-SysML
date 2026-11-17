// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy {

  def initialise(api: PilotBatteryStatusPolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_pilotBatteryStatus(Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus.example())
  }

  def timeTriggered(api: PilotBatteryStatusPolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_PILOT_ADVISORY
        //   Project session and publish prioritized pilot advisory | N.md
        (T) ___>: (api.pilotBatteryStatus.batteryAssessment == api.batteryAssessment &
          api.pilotBatteryStatus.chargerPathQualification == api.chargerPathQualification &
          (api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE ___>:
            api.pilotBatteryStatus.session == PilotSessionState.IDLE) &
          (api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED ___>:
            api.pilotBatteryStatus.session == PilotSessionState.ENABLED) &
          (api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED ___>:
            api.pilotBatteryStatus.session == PilotSessionState.SUSPENDED) &
          (api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE ___>:
            api.pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE) &
          (api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED ___>:
            api.pilotBatteryStatus.disposition == PilotChargeDisposition.ACCEPTED) &
          (api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED ___>:
            api.pilotBatteryStatus.disposition == PilotChargeDisposition.REJECTED) &
          (api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED ___>:
            api.pilotBatteryStatus.disposition == PilotChargeDisposition.RECOVERY_APPLIED) &
          (api.batteryAssessment == BatteryAssessment.UNAVAILABLE ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE) &
          (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
            api.chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE) &
          (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
            api.chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.CHARGER_UNAVAILABLE) &
          (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
            api.chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.CONTEXT_INELIGIBLE) &
          (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
            (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
              api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
            api.chargerPathQualification == ChargerPathQualification.ACTIVE &
            api.chargeSessionSnapshot.nextSession != SnapshotNextSessionState.ENABLED ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION) &
          (api.batteryAssessment == BatteryAssessment.LOW &
            (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
              api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
            (api.chargerPathQualification != ChargerPathQualification.ACTIVE |
              api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.CHARGE_RECOMMENDED) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
              api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
            (api.chargerPathQualification != ChargerPathQualification.ACTIVE |
              api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.REQUEST_REJECTED) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
              api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
            (api.chargerPathQualification != ChargerPathQualification.ACTIVE |
              api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
            api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.REJECTED ___>:
            api.pilotBatteryStatus.advisory == PilotAdvisory.NONE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val assessment = api.get_batteryAssessment().get
    val path = api.get_chargerPathQualification().get
    val snapshot = api.get_chargeSessionSnapshot().get
    val session: PilotSessionState.Type =
      if (snapshot.nextSession == SnapshotNextSessionState.IDLE) PilotSessionState.IDLE
      else if (snapshot.nextSession == SnapshotNextSessionState.ENABLED) PilotSessionState.ENABLED
      else PilotSessionState.SUSPENDED
    val disposition: PilotChargeDisposition.Type =
      if (snapshot.disposition == SnapshotChargeDisposition.NO_CHANGE) PilotChargeDisposition.NO_CHANGE
      else if (snapshot.disposition == SnapshotChargeDisposition.ACCEPTED) PilotChargeDisposition.ACCEPTED
      else if (snapshot.disposition == SnapshotChargeDisposition.REJECTED) PilotChargeDisposition.REJECTED
      else PilotChargeDisposition.RECOVERY_APPLIED
    val knownRecovery: B =
      snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
        (snapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE |
          snapshot.reason == ChargeReason.CHARGER_UNAVAILABLE |
          snapshot.reason == ChargeReason.CONTEXT_INELIGIBLE)
    val advisory: PilotAdvisory.Type =
      if (assessment == BatteryAssessment.UNAVAILABLE) PilotAdvisory.EVIDENCE_UNAVAILABLE
      else if (snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
        snapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) PilotAdvisory.EVIDENCE_UNAVAILABLE
      else if (snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
        snapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) PilotAdvisory.CHARGER_UNAVAILABLE
      else if (snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
        snapshot.reason == ChargeReason.CONTEXT_INELIGIBLE) PilotAdvisory.CONTEXT_INELIGIBLE
      else if (!knownRecovery & path == ChargerPathQualification.ACTIVE &
        snapshot.nextSession != SnapshotNextSessionState.ENABLED) PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION
      else if (!knownRecovery & assessment == BatteryAssessment.LOW) PilotAdvisory.CHARGE_RECOMMENDED
      else if (!knownRecovery & assessment == BatteryAssessment.ADEQUATE &
        snapshot.disposition == SnapshotChargeDisposition.REJECTED) PilotAdvisory.REQUEST_REJECTED
      else PilotAdvisory.NONE
    api.put_pilotBatteryStatus(PilotBatteryStatus(
      batteryAssessment = assessment,
      chargerPathQualification = path,
      session = session,
      disposition = disposition,
      advisory = advisory))
  }

  def finalise(api: PilotBatteryStatusPolicy_Operational_Api): Unit = { }
}
