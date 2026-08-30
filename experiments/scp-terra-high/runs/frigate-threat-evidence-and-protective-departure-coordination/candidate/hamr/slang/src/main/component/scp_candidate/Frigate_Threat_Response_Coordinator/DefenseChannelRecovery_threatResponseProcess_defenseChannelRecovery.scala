// #Sireum

package scp_candidate.Frigate_Threat_Response_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery {
  // BEGIN STATE VARS
  var defenseRecoveryState: Frigate_Threat_Response_Coordinator.ChannelState.Type = Frigate_Threat_Response_Coordinator.ChannelState.AVAILABLE
  // END STATE VARS

  def initialise(api: DefenseChannelRecovery_Initialization_Api): Unit = {
    Contract(
      Modifies(
        api,
        // BEGIN INITIALIZES MODIFIES
        defenseRecoveryState
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DEFENSE_CHANNEL
        defenseRecoveryState == ChannelState.AVAILABLE &
          api.defenseChannelStateOut == ChannelState.AVAILABLE &
          api.defenseGateOut == ChannelGate.OPEN
        // END INITIALIZES ENSURES
      )
    )
    defenseRecoveryState = ChannelState.AVAILABLE

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseGateOut(Frigate_Threat_Response_Coordinator.ChannelGate.OPEN)
    api.put_defenseChannelStateOut(Frigate_Threat_Response_Coordinator.ChannelState.AVAILABLE)
  }

  def timeTriggered(api: DefenseChannelRecovery_Operational_Api): Unit = {
    Contract(Modifies(api, defenseRecoveryState))
    (api.get_defenseAuthorityIn(), api.get_defenseOutcomeIn(), api.get_threatValidityIn()) match {
      case (Some(authority), Some(outcome), Some(validity)) =>
        var gate = ChannelGate.BLOCKED
        if (validity == ThreatValidity.UNUSABLE || outcome == DefenseOutcome.COMMAND_FAILED) {
          retainedUpdate(ChannelState.ISOLATED)
        } else if (defenseRecoveryState == ChannelState.ISOLATED && authority == DefenseAuthority.RESET) {
          retainedUpdate(ChannelState.PROBATION)
        } else if (defenseRecoveryState == ChannelState.PROBATION && outcome == DefenseOutcome.RECOVERY_CONFIRMED) {
          retainedUpdate(ChannelState.AVAILABLE)
        }
        if (defenseRecoveryState == ChannelState.AVAILABLE &&
          !(outcome == DefenseOutcome.RECOVERY_CONFIRMED && validity == ThreatValidity.USABLE)) {
          gate = ChannelGate.OPEN
        }
        api.put_defenseChannelStateOut(defenseRecoveryState)
        api.put_defenseGateOut(gate)
    }
  }

  def retainedUpdate(value: Frigate_Threat_Response_Coordinator.ChannelState.Type): Unit = {
    defenseRecoveryState = value
  }

  def finalise(api: DefenseChannelRecovery_Operational_Api): Unit = { }
}
