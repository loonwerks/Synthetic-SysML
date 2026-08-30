// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object AlertMemory_threatResponseProcess_alertMemory {

  var retainedAlert: AlertState.Type = AlertState.QUIET

  def initialise(api: AlertMemory_Initialization_Api): Unit = {
    Contract(
      Modifies(api.defenseAlertOut, api.escapeAlertOut, api.compositionAlertOut, api.threatReportOut),
      Ensures(
        api.defenseAlertOut == AlertState.QUIET,
        api.escapeAlertOut == AlertState.QUIET,
        api.compositionAlertOut == AlertState.QUIET,
        api.threatReportOut == ThreatReport.UNKNOWN
      )
    )

    retainedAlert = AlertState.QUIET

    api.put_defenseAlertOut(AlertState.QUIET)
    api.put_escapeAlertOut(AlertState.QUIET)
    api.put_compositionAlertOut(AlertState.QUIET)
    api.put_threatReportOut(ThreatReport.UNKNOWN)
  }

  def timeTriggered(api: AlertMemory_Operational_Api): Unit = {
    Contract(
      Modifies(api.defenseAlertOut, api.escapeAlertOut, api.compositionAlertOut, api.threatReportOut),
      Ensures(
        api.defenseAlertOut == retainedAlert,
        api.escapeAlertOut == retainedAlert,
        api.compositionAlertOut == retainedAlert,
        // ALERT_REPORT_MAPPING
        (api.qualifiedThreatIn.validity == ThreatValidity.UNUSABLE) -->
          (api.threatReportOut == ThreatReport.UNKNOWN),
        (api.qualifiedThreatIn.validity == ThreatValidity.USABLE &
          retainedAlert == AlertState.QUIET) -->
          (api.threatReportOut == ThreatReport.CLEAR),
        (api.qualifiedThreatIn.validity == ThreatValidity.USABLE &
          retainedAlert == AlertState.WATCH) -->
          (api.threatReportOut == ThreatReport.CAUTION),
        (api.qualifiedThreatIn.validity == ThreatValidity.USABLE &
          retainedAlert == AlertState.ALARM) -->
          (api.threatReportOut == ThreatReport.HOSTILE)
      )
    )

    val qualifiedThreat = api.get_qualifiedThreatIn()
    val clearAck = api.get_clearAcknowledgmentIn()

    val entry = retainedAlert

    val (newAlert, report) =
      if (api.qualifiedThreatIn.validity == ThreatValidity.UNUSABLE) {
        // CASE_05_UNUSABLE - preserve retainedAlert
        (entry, ThreatReport.UNKNOWN)
      } else {
        api.qualifiedThreatIn.band match {
          case ThreatBand.HOSTILE =>
            // CASE_06_HOSTILE - set to ALARM
            (AlertState.ALARM, ThreatReport.HOSTILE)
          case _ =>
            // band is CLEAR or CAUTION
            if (entry == AlertState.ALARM) {
              // CASE_07 or CASE_08
              if (api.qualifiedThreatIn.band == ThreatBand.CLEAR && clearAck.nonEmpty && clearAck.get) {
                // CASE_07_ALARM_ACK_CLEAR - set to WATCH
                (AlertState.WATCH, ThreatReport.CAUTION)
              } else {
                // CASE_08_RETAIN_ALARM - stay ALARM
                (AlertState.ALARM, ThreatReport.HOSTILE)
              }
            } else {
              // entry is not ALARM
              // CASE_09 or CASE_10
              if (api.qualifiedThreatIn.band == ThreatBand.CAUTION) {
                // CASE_09_WATCH - set to WATCH
                (AlertState.WATCH, ThreatReport.CAUTION)
              } else {
                // band is CLEAR, entry is not ALARM
                // CASE_10_QUIET or CASE_09 (if retained is WATCH and not ack-clear)
                if (entry == AlertState.WATCH && !(clearAck.nonEmpty && clearAck.get)) {
                  // WATCH retained without fresh clear ack
                  (AlertState.WATCH, ThreatReport.CAUTION)
                } else {
                  // CASE_10_QUIET - QUIET if entry is QUIET or clearAck is true
                  (AlertState.QUIET, ThreatReport.CLEAR)
                }
              }
            }
          }
        }
      }

    retainedAlert = newAlert

    api.put_defenseAlertOut(newAlert)
    api.put_escapeAlertOut(newAlert)
    api.put_compositionAlertOut(newAlert)
    api.put_threatReportOut(report)
  }

  def finalise(api: AlertMemory_Operational_Api): Unit = { }
}
