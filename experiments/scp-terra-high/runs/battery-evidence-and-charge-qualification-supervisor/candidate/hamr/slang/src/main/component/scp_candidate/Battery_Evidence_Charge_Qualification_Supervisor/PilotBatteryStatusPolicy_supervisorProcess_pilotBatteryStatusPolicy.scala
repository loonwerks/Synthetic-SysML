// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy {

  def initialise(api: PilotBatteryStatusPolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_status
        api.pilotBatteryStatus.batteryAssessment == BatteryAssessment.UNAVAILABLE &&
          api.pilotBatteryStatus.chargerPathQualification == ChargerPathQualification.UNAVAILABLE &&
          api.pilotBatteryStatus.session == PilotSessionState.IDLE &&
          api.pilotBatteryStatus.disposition == PilotChargeDisposition.NO_CHANGE &&
          api.pilotBatteryStatus.advisory == PilotAdvisory.EVIDENCE_UNAVAILABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotBatteryStatus(Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus(
      Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE,
      Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE,
      Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.IDLE,
      Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.NO_CHANGE,
      Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.EVIDENCE_UNAVAILABLE))
  }

  def timeTriggered(api: PilotBatteryStatusPolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryAssessment(), api.get_chargerPathQualification(), api.get_chargeSessionSnapshot()) match {
      case (Some(assessment), Some(path), Some(snapshot)) =>
        val session: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type =
          if (snapshot.nextSession == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.IDLE)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.IDLE
          else if (snapshot.nextSession == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.ENABLED)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.ENABLED
          else Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.SUSPENDED
        val disposition: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type =
          if (snapshot.disposition == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.NO_CHANGE)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.NO_CHANGE
          else if (snapshot.disposition == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.ACCEPTED)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.ACCEPTED
          else if (snapshot.disposition == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.REJECTED
          else Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.RECOVERY_APPLIED
        val advisory: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type =
          if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.EVIDENCE_UNAVAILABLE
          else if (snapshot.disposition == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED &&
            snapshot.reason == Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.EVIDENCE_UNAVAILABLE)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.EVIDENCE_UNAVAILABLE
          else if (snapshot.disposition == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED &&
            snapshot.reason == Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CHARGER_UNAVAILABLE)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.CHARGER_UNAVAILABLE
          else if (snapshot.disposition == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED &&
            snapshot.reason == Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CONTEXT_INELIGIBLE)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.CONTEXT_INELIGIBLE
          else if (path == Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.ACTIVE &&
            snapshot.nextSession != Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.ENABLED)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.ACTIVITY_WITHOUT_PERMISSION
          else if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.CHARGE_RECOMMENDED
          else if (snapshot.disposition == Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.REQUEST_REJECTED
          else Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.NONE
        api.put_pilotBatteryStatus(Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus(
          assessment, path, session, disposition, advisory))
    }
  }

  def finalise(api: PilotBatteryStatusPolicy_Operational_Api): Unit = { }
}
