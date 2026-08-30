// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery {
  // BEGIN STATE VARS
  var escapeRecoveryState: Frigate_Threat_Response_Coordinator.ChannelState.Type = Frigate_Threat_Response_Coordinator.ChannelState.AVAILABLE
  // END STATE VARS

  def initialise(api: EscapeChannelRecovery_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api,
        // BEGIN INITIALIZES MODIFIES
        escapeRecoveryState
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ESCAPE_CHANNEL
        escapeRecoveryState == ChannelState.AVAILABLE &
          api.escapeChannelStateOut == ChannelState.AVAILABLE &
          api.escapeGateOut == ChannelGate.OPEN
        // END INITIALIZES ENSURES
      )
    )
    escapeRecoveryState = ChannelState.AVAILABLE

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_escapeGateOut(Frigate_Threat_Response_Coordinator.ChannelGate.OPEN)
    api.put_escapeChannelStateOut(Frigate_Threat_Response_Coordinator.ChannelState.AVAILABLE)
  }

  def timeTriggered(api: EscapeChannelRecovery_Operational_Api): Unit = {
    Contract(Modifies(api, escapeRecoveryState))
    (api.get_escapeAuthorityIn(), api.get_escapeOutcomeIn(), api.get_threatValidityIn()) match {
      case (Some(authority), Some(outcome), Some(validity)) =>
        var gate = ChannelGate.BLOCKED
        if (validity == ThreatValidity.UNUSABLE || outcome == EscapeOutcome.DEPARTURE_FAILED) {
          escapeRecoveryState = ChannelState.ISOLATED
        } else if (escapeRecoveryState == ChannelState.ISOLATED && authority == EscapeAuthority.RESET) {
          escapeRecoveryState = ChannelState.PROBATION
        } else if (escapeRecoveryState == ChannelState.PROBATION && outcome == EscapeOutcome.RECOVERY_CONFIRMED) {
          escapeRecoveryState = ChannelState.AVAILABLE
        }
        if (escapeRecoveryState == ChannelState.AVAILABLE &&
          !(outcome == EscapeOutcome.RECOVERY_CONFIRMED && validity == ThreatValidity.USABLE)) {
          gate = ChannelGate.OPEN
        }
        api.put_escapeChannelStateOut(escapeRecoveryState)
        api.put_escapeGateOut(gate)
    }
  }

  def finalise(api: EscapeChannelRecovery_Operational_Api): Unit = { }
}
