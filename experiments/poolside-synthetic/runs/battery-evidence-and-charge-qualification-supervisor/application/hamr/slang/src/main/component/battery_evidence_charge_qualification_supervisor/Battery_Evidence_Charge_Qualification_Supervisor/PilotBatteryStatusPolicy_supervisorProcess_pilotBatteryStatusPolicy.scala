// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy {

  def initialise(api: PilotBatteryStatusPolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_pilotBatteryStatus(PilotBatteryStatus(
      batteryAssessment = BatteryAssessment.UNAVAILABLE,
      chargerPathQualification = ChargerPathQualification.UNAVAILABLE,
      session = PilotSessionState.IDLE,
      disposition = PilotChargeDisposition.NO_CHANGE,
      advisory = PilotAdvisory.NONE))
    // END WORK
  }

  def timeTriggered(api: PilotBatteryStatusPolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_PILOT_ADVISORY
        (T) ___>: (api.pilotBatteryStatus.batteryAssessment == api.batteryAssessment &
          api.pilotBatteryStatus.chargerPathQualification == api.chargerPathQualification &
          api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE ___>:
          api.pilotBatteryStatus.session == PilotSessionState.IDLE &
            api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED ___>:
            api.pilotBatteryStatus.session == PilotSessionState.ENABLED &
              api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED ___>:
              api.pilotBatteryStatus.session == PilotSessionState.SUSPENDED &
                api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE ___>:
                api.pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE &
                  api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED ___>:
                  api.pilotBatteryStatus.disposition == PilotChargeDisposition.ACCEPTED &
                    api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED ___>:
                    api.pilotBatteryStatus.disposition == PilotChargeDisposition.REJECTED &
                      api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED ___>:
                      api.pilotBatteryStatus.disposition == PilotChargeDisposition.RECOVERY_APPLIED &
                        api.batteryAssessment == BatteryAssessment.UNAVAILABLE ___>:
                        api.pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE &
                          (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
                            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                            api.chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) ___>:
                          api.pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE &
                            (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
                              api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                              api.chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) ___>:
                            api.pilotBatteryStatus.advisory == PilotAdvisory.CHARGER_UNAVAILABLE &
                              (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
                                api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                                api.chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE) ___>:
                              api.pilotBatteryStatus.advisory == PilotAdvisory.CONTEXT_INELIGIBLE &
                                (api.batteryAssessment != BatteryAssessment.UNAVAILABLE &
                                  (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                                    api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                                      api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                                      api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
                                  api.chargerPathQualification == ChargerPathQualification.ACTIVE &
                                  api.chargeSessionSnapshot.nextSession != SnapshotNextSessionState.ENABLED) ___>:
                                api.pilotBatteryStatus.advisory == PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION &
                                  (api.batteryAssessment == BatteryAssessment.LOW &
                                    (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                                      api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                                        api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                                        api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
                                    (api.chargerPathQualification != ChargerPathQualification.ACTIVE |
                                      api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED)) ___>:
                                  api.pilotBatteryStatus.advisory == PilotAdvisory.CHARGE_RECOMMENDED &
                                    (api.batteryAssessment == BatteryAssessment.ADEQUATE &
                                      (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                                        api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                                          api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                                          api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
                                      (api.chargerPathQualification != ChargerPathQualification.ACTIVE |
                                        api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
                                      api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED) ___>:
                                    api.pilotBatteryStatus.advisory == PilotAdvisory.REQUEST_REJECTED &
                                      (api.batteryAssessment == BatteryAssessment.ADEQUATE &
                                        (api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED |
                                          api.chargeSessionSnapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
                                            api.chargeSessionSnapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
                                            api.chargeSessionSnapshot.reason != ChargeReason.CONTEXT_INELIGIBLE) &
                                        (api.chargerPathQualification != ChargerPathQualification.ACTIVE |
                                          api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED) &
                                        api.chargeSessionSnapshot.disposition != SnapshotChargeDisposition.REJECTED) ___>:
                                      api.pilotBatteryStatus.advisory == PilotAdvisory.NONE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // BEGIN WORK
    val batteryAssessment = api.get_batteryAssessment().get
    val chargerPathQualification = api.get_chargerPathQualification().get
    val snapshot = api.get_chargeSessionSnapshot().get
    var session: PilotSessionState.Type = PilotSessionState.IDLE
    var disposition: PilotChargeDisposition.Type = PilotChargeDisposition.NO_CHANGE
    var advisory: PilotAdvisory.Type = PilotAdvisory.NONE
    // Set session based on nextSession
    if (snapshot.nextSession == SnapshotNextSessionState.ENABLED) {
      session = PilotSessionState.ENABLED
    } else if (snapshot.nextSession == SnapshotNextSessionState.SUSPENDED) {
      session = PilotSessionState.SUSPENDED
    } else {
      session = PilotSessionState.IDLE
    }
    // Set disposition based on snapshot disposition
    if (snapshot.disposition == SnapshotChargeDisposition.ACCEPTED) {
      disposition = PilotChargeDisposition.ACCEPTED
    } else if (snapshot.disposition == SnapshotChargeDisposition.REJECTED) {
      disposition = PilotChargeDisposition.REJECTED
    } else if (snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED) {
      disposition = PilotChargeDisposition.RECOVERY_APPLIED
    } else {
      disposition = PilotChargeDisposition.NO_CHANGE
    }
    // Set advisory - must match exact priority order from contract
    if (batteryAssessment == BatteryAssessment.UNAVAILABLE) {
      advisory = PilotAdvisory.EVIDENCE_UNAVAILABLE
    } else if (snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
               snapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) {
      advisory = PilotAdvisory.EVIDENCE_UNAVAILABLE
    } else if (snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
               snapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) {
      advisory = PilotAdvisory.CHARGER_UNAVAILABLE
    } else if (snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
               snapshot.reason == ChargeReason.CONTEXT_INELIGIBLE) {
      advisory = PilotAdvisory.CONTEXT_INELIGIBLE
    } else {
      val notRecoveryApplied = snapshot.disposition != SnapshotChargeDisposition.RECOVERY_APPLIED
      val recoveryAppliedWithOtherReason = snapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
        (snapshot.reason != ChargeReason.EVIDENCE_UNAVAILABLE &
         snapshot.reason != ChargeReason.CHARGER_UNAVAILABLE &
         snapshot.reason != ChargeReason.CONTEXT_INELIGIBLE)
      val recoveryCondition = notRecoveryApplied | recoveryAppliedWithOtherReason
      if (recoveryCondition &
          chargerPathQualification == ChargerPathQualification.ACTIVE &
          snapshot.nextSession != SnapshotNextSessionState.ENABLED) {
        advisory = PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION
      } else if (batteryAssessment == BatteryAssessment.LOW) {
        val lowRecoveryCondition = notRecoveryApplied | recoveryAppliedWithOtherReason
        val lowChargerCondition = chargerPathQualification != ChargerPathQualification.ACTIVE |
          snapshot.nextSession == SnapshotNextSessionState.ENABLED
        if (lowRecoveryCondition & lowChargerCondition) {
          advisory = PilotAdvisory.CHARGE_RECOMMENDED
        }
      } else if (batteryAssessment == BatteryAssessment.ADEQUATE) {
        val adequateRecoveryCondition = notRecoveryApplied | recoveryAppliedWithOtherReason
        val adequateChargerCondition = chargerPathQualification != ChargerPathQualification.ACTIVE |
          snapshot.nextSession == SnapshotNextSessionState.ENABLED
        if (adequateRecoveryCondition & adequateChargerCondition &
            snapshot.disposition == SnapshotChargeDisposition.REJECTED) {
          advisory = PilotAdvisory.REQUEST_REJECTED
        } else if (adequateRecoveryCondition & adequateChargerCondition &
                   snapshot.disposition != SnapshotChargeDisposition.REJECTED) {
          advisory = PilotAdvisory.NONE
        }
      }
    }
    api.put_pilotBatteryStatus(PilotBatteryStatus(
      batteryAssessment = batteryAssessment,
      chargerPathQualification = chargerPathQualification,
      session = session,
      disposition = disposition,
      advisory = advisory))
    // END WORK
  }

  def finalise(api: PilotBatteryStatusPolicy_Operational_Api): Unit = { }
}
