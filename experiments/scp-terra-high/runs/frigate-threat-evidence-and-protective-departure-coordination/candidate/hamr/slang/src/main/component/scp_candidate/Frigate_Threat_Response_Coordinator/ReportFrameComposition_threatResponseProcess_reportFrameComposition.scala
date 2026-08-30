// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReportFrameComposition_threatResponseProcess_reportFrameComposition {

  def initialise(api: ReportFrameComposition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RESPONSE_FRAME
        api.responseFrameOut.threatReport == ThreatReport.UNKNOWN &
          api.responseFrameOut.defenseDirective == DefenseDirective.STANDBY &
          api.responseFrameOut.escapeDirective == EscapeDirective.STAY &
          api.responseFrameOut.responsePattern == ResponsePattern.OBSERVE &
          api.responseFrameOut.responseStage == ResponseStage.INITIALIZING &
          api.responseFrameOut.defenseCondition == DefenseChannelCondition.AVAILABLE &
          api.responseFrameOut.escapeCondition == EscapeChannelCondition.AVAILABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_responseFrameOut(ResponseFrame(ThreatReport.UNKNOWN, DefenseDirective.STANDBY,
      EscapeDirective.STAY, ResponsePattern.OBSERVE, ResponseStage.INITIALIZING,
      DefenseChannelCondition.AVAILABLE, EscapeChannelCondition.AVAILABLE))
  }

  def timeTriggered(api: ReportFrameComposition_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_responsePatternIn(), api.get_defenseProposalIn(), api.get_escapeProposalIn(),
      api.get_alertStateIn(), api.get_threatReportIn(), api.get_defenseChannelStateIn(),
      api.get_escapeChannelStateIn()) match {
      case (Some(pattern), Some(defense), Some(escape), Some(alert), Some(report), Some(defenseState), Some(escapeState)) =>
        var defenseCondition: DefenseChannelCondition.Type = DefenseChannelCondition.PROBATION
        if (defenseState == ChannelState.AVAILABLE) {
          defenseCondition = DefenseChannelCondition.AVAILABLE
        } else if (defenseState == ChannelState.ISOLATED) {
          defenseCondition = DefenseChannelCondition.ISOLATED
        }
        var escapeCondition: EscapeChannelCondition.Type = EscapeChannelCondition.PROBATION
        if (escapeState == ChannelState.AVAILABLE) {
          escapeCondition = EscapeChannelCondition.AVAILABLE
        } else if (escapeState == ChannelState.ISOLATED) {
          escapeCondition = EscapeChannelCondition.ISOLATED
        }
        var stage: ResponseStage.Type = ResponseStage.RESPONDING
        if (report == ThreatReport.UNKNOWN) {
          stage = ResponseStage.EVIDENCE_FAULT
        } else if (defenseState != ChannelState.AVAILABLE || escapeState != ChannelState.AVAILABLE) {
          stage = ResponseStage.DEGRADED
        } else if (report == ThreatReport.CLEAR && alert == AlertState.QUIET) {
          stage = ResponseStage.MONITORING
        }
        var defenseDirective: DefenseDirective.Type = DefenseDirective.STANDBY
        if (defense == DefenseProposal.ACTIVATE) {
          defenseDirective = DefenseDirective.ACTIVATE
        }
        var escapeDirective: EscapeDirective.Type = EscapeDirective.STAY
        if (escape == EscapeProposal.DEPART) {
          escapeDirective = EscapeDirective.DEPART
        }
        api.put_responseFrameOut(ResponseFrame(report, defenseDirective, escapeDirective,
          pattern, stage, defenseCondition, escapeCondition))
    }
  }

  def finalise(api: ReportFrameComposition_Operational_Api): Unit = { }
}
