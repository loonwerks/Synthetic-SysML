// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner {

  var attentionState: AttentionState.Type = AttentionState.Attention

  def initialise(api: AttentionLatchStateOwner_Initialization_Api): Unit = {
    Contract(Modifies(attentionState, api))
    attentionState = AttentionState.Attention
    api.put_resolutionToNotification(
      AttentionResolution(attentionState, AttentionCause.Untrusted, F, AttentionCase.ATTN_01))
    api.put_clearedToRequestResult(F)
  }

  def timeTriggered(api: AttentionLatchStateOwner_Operational_Api): Unit = {
    Contract(Modifies(attentionState, api))
    (api.get_requestIn(), api.get_batteryIn()) match {
      case (Some(request), Some(battery)) =>
        var cause: AttentionCause.Type = AttentionCause.Clear
        var cleared: B = F
        var winningCase: AttentionCase.Type = AttentionCase.ATTN_06
        if (battery.confidence != BatteryConfidence.Trusted) {
          attentionState = AttentionState.Attention
          cause = AttentionCause.Untrusted
          winningCase = AttentionCase.ATTN_01
        } else if (battery.band == QualifiedBand.Critical) {
          attentionState = AttentionState.Attention
          cause = AttentionCause.Critical
          winningCase = AttentionCase.ATTN_02
        } else if (battery.band == QualifiedBand.Low) {
          attentionState = AttentionState.Attention
          cause = AttentionCause.Low
          winningCase = AttentionCase.ATTN_03
        } else if (attentionState == AttentionState.Attention &&
                   request == ServiceRequest.AcknowledgeNotice) {
          attentionState = AttentionState.Clear
          cleared = T
          winningCase = AttentionCase.ATTN_04
        } else if (attentionState == AttentionState.Attention) {
          cause = AttentionCause.RecoveryPending
          winningCase = AttentionCase.ATTN_05
        } else {
          attentionState = AttentionState.Clear
        }
        api.put_resolutionToNotification(
          AttentionResolution(attentionState, cause, cleared, winningCase))
        api.put_clearedToRequestResult(cleared)
      case _ =>
    }
  }

  def finalise(api: AttentionLatchStateOwner_Operational_Api): Unit = { }
}
