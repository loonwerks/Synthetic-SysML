// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AlertMemory_threatResponseProcess_alertMemory {
  // BEGIN STATE VARS
  var retainedAlert: Frigate_Threat_Response_Coordinator.AlertState.Type = Frigate_Threat_Response_Coordinator.AlertState.QUIET
  // END STATE VARS

  def initialise(api: AlertMemory_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api,
        // BEGIN INITIALIZES MODIFIES
        retainedAlert
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ALERT
        retainedAlert == AlertState.QUIET &
          api.defenseAlertOut == AlertState.QUIET &
          api.escapeAlertOut == AlertState.QUIET &
          api.compositionAlertOut == AlertState.QUIET &
          api.threatReportOut == ThreatReport.UNKNOWN
        // END INITIALIZES ENSURES
      )
    )
    retainedAlert = AlertState.QUIET

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseAlertOut(Frigate_Threat_Response_Coordinator.AlertState.QUIET)
    api.put_escapeAlertOut(Frigate_Threat_Response_Coordinator.AlertState.QUIET)
    api.put_compositionAlertOut(Frigate_Threat_Response_Coordinator.AlertState.QUIET)
    api.put_threatReportOut(Frigate_Threat_Response_Coordinator.ThreatReport.UNKNOWN)
  }

  def timeTriggered(api: AlertMemory_Operational_Api): Unit = {
    Contract(Modifies(api, retainedAlert))
    (api.get_qualifiedThreatIn(), api.get_clearAcknowledgmentIn()) match {
      case (Some(threat), Some(ack)) =>
        if (threat.validity == ThreatValidity.USABLE) {
          if (threat.band == ThreatBand.HOSTILE) {
            retainedAlert = AlertState.ALARM
          } else if (retainedAlert == AlertState.ALARM && threat.band == ThreatBand.CLEAR && ack) {
            retainedAlert = AlertState.WATCH
          }
          else if (retainedAlert != AlertState.ALARM && threat.band == ThreatBand.CLEAR &&
            (retainedAlert == AlertState.QUIET || ack)) {
            retainedAlert = AlertState.QUIET
          } else if (retainedAlert != AlertState.ALARM) {
            retainedAlert = AlertState.WATCH
          }
        }
        api.put_defenseAlertOut(retainedAlert)
        api.put_escapeAlertOut(retainedAlert)
        api.put_compositionAlertOut(retainedAlert)
        var report: ThreatReport.Type = ThreatReport.HOSTILE
        if (threat.validity == ThreatValidity.UNUSABLE) {
          report = ThreatReport.UNKNOWN
        } else if (retainedAlert == AlertState.QUIET) {
          report = ThreatReport.CLEAR
        } else if (retainedAlert == AlertState.WATCH) {
          report = ThreatReport.CAUTION
        }
        api.put_threatReportOut(report)
    }
  }

  def finalise(api: AlertMemory_Operational_Api): Unit = { }
}
