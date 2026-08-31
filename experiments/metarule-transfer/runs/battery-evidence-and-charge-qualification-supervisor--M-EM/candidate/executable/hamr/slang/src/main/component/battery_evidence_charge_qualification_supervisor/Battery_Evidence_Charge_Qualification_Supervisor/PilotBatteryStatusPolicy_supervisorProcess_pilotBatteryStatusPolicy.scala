// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy {

  def initialise(api: PilotBatteryStatusPolicy_Initialization_Api): Unit = {
    api.put_pilotBatteryStatus(Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus.example())
  }

  def timeTriggered(api: PilotBatteryStatusPolicy_Operational_Api): Unit = {
    (api.get_batteryAssessment(), api.get_chargerPathQualification(), api.get_chargeSessionSnapshot()) match {
      case (Some(assessment), Some(path), Some(snapshot)) =>
        val session: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type = snapshot.nextSession match {
          case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.ENABLED =>
            Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.ENABLED
          case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.SUSPENDED =>
            Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.SUSPENDED
          case _ => Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.IDLE
        }
        val disposition: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type = snapshot.disposition match {
          case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.ACCEPTED =>
            Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.ACCEPTED
          case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED =>
            Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.REJECTED
          case Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED =>
            Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.RECOVERY_APPLIED
          case _ => Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.NO_CHANGE
        }
        val recovery = snapshot.disposition ==
          Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED
        val advisory: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type =
          if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE ||
              (recovery && snapshot.reason == Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.EVIDENCE_UNAVAILABLE))
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.EVIDENCE_UNAVAILABLE
          else if (recovery && snapshot.reason == Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CHARGER_UNAVAILABLE)
            Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.CHARGER_UNAVAILABLE
          else if (recovery && snapshot.reason == Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CONTEXT_INELIGIBLE)
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
      case _ => api.put_pilotBatteryStatus(Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus.example())
    }
  }

  def finalise(api: PilotBatteryStatusPolicy_Operational_Api): Unit = { }
}
