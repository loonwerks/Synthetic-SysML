// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner {

  // BEGIN STATE VARS
  var attentionState: Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type = Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Clear
  // END STATE VARS

  def initialise(api: AttentionLatchStateOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        attentionState
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ATTENTION
        attentionState == AttentionState.Attention &&
          api.resolutionToNotification.newAttention == AttentionState.Attention &&
          api.resolutionToNotification.cause == AttentionCause.Untrusted &&
          api.resolutionToNotification.attentionClearedNow == F &&
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_01 &&
          api.clearedToRequestResult == F
        // END INITIALIZES ENSURES
      )
    )
    attentionState = AttentionState.Attention
    api.put_resolutionToNotification(AttentionResolution(AttentionState.Attention, AttentionCause.Untrusted, F, AttentionCase.ATTN_01))
    api.put_clearedToRequestResult(F)
  }

  def timeTriggered(api: AttentionLatchStateOwner_Operational_Api): Unit = { }

  def finalise(api: AttentionLatchStateOwner_Operational_Api): Unit = { }
}
