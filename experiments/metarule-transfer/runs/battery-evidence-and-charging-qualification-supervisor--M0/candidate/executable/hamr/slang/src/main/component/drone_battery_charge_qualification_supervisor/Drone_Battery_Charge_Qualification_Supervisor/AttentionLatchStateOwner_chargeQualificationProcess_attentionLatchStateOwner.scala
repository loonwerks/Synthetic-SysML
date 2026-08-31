// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner {

  // BEGIN STATE VARS
  var attentionState: Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type = Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Clear
  // END STATE VARS

  def initialise(api: AttentionLatchStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

  }

  def timeTriggered(api: AttentionLatchStateOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, attentionState),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee ATTENTION_PUBLICATION
        api.resolutionToNotification.newAttention == attentionState &
          api.clearedToRequestResult == api.resolutionToNotification.attentionClearedNow,
        // case ATTN_01_UNTRUSTED
        (api.batteryIn.confidence != BatteryConfidence.Trusted) ___>: (attentionState == AttentionState.Attention &
          api.resolutionToNotification.cause == AttentionCause.Untrusted &
          !(api.resolutionToNotification.attentionClearedNow) &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_01),
        // case ATTN_02_CRITICAL
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band == QualifiedBand.Critical) ___>: (attentionState == AttentionState.Attention &
          api.resolutionToNotification.cause == AttentionCause.Critical &
          !(api.resolutionToNotification.attentionClearedNow) &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_02),
        // case ATTN_03_LOW
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band == QualifiedBand.Low) ___>: (attentionState == AttentionState.Attention &
          api.resolutionToNotification.cause == AttentionCause.Low &
          !(api.resolutionToNotification.attentionClearedNow) &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_03),
        // case ATTN_04_FRESH_ACKNOWLEDGEMENT
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band != QualifiedBand.Critical &
          api.batteryIn.band != QualifiedBand.Low &
          In(attentionState) == AttentionState.Attention &
          api.requestIn == ServiceRequest.AcknowledgeNotice) ___>: (attentionState == AttentionState.Clear &
          api.resolutionToNotification.cause == AttentionCause.Clear &
          api.resolutionToNotification.attentionClearedNow &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_04),
        // case ATTN_05_RECOVERY_PENDING
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band != QualifiedBand.Critical &
          api.batteryIn.band != QualifiedBand.Low &
          In(attentionState) == AttentionState.Attention &
          api.requestIn != ServiceRequest.AcknowledgeNotice) ___>: (attentionState == AttentionState.Attention &
          api.resolutionToNotification.cause == AttentionCause.RecoveryPending &
          !(api.resolutionToNotification.attentionClearedNow) &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_05),
        // case ATTN_06_RETAIN_CLEAR
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band != QualifiedBand.Critical &
          api.batteryIn.band != QualifiedBand.Low &
          In(attentionState) == AttentionState.Clear) ___>: (attentionState == AttentionState.Clear &
          api.resolutionToNotification.cause == AttentionCause.Clear &
          !(api.resolutionToNotification.attentionClearedNow) &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_06)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val request = api.get_requestIn().get
    val battery = api.get_batteryIn().get
    val prior = attentionState
    val result: AttentionResolution =
      if (battery.confidence != BatteryConfidence.Trusted) AttentionResolution(AttentionState.Attention, AttentionCause.Untrusted, F, AttentionCase.ATTN_01)
      else if (battery.band == QualifiedBand.Critical) AttentionResolution(AttentionState.Attention, AttentionCause.Critical, F, AttentionCase.ATTN_02)
      else if (battery.band == QualifiedBand.Low) AttentionResolution(AttentionState.Attention, AttentionCause.Low, F, AttentionCase.ATTN_03)
      else if (prior == AttentionState.Attention & request == ServiceRequest.AcknowledgeNotice) AttentionResolution(AttentionState.Clear, AttentionCause.Clear, T, AttentionCase.ATTN_04)
      else if (prior == AttentionState.Attention) AttentionResolution(AttentionState.Attention, AttentionCause.RecoveryPending, F, AttentionCase.ATTN_05)
      else AttentionResolution(AttentionState.Clear, AttentionCause.Clear, F, AttentionCase.ATTN_06)
    attentionState = result.newAttention
    api.put_resolutionToNotification(result)
    api.put_clearedToRequestResult(result.attentionClearedNow)
  }

  def finalise(api: AttentionLatchStateOwner_Operational_Api): Unit = { }
}
