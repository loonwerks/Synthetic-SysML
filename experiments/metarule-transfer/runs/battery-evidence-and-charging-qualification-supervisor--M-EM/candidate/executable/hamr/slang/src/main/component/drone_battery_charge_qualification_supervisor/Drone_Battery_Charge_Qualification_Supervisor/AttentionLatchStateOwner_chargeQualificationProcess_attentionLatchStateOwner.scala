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

    api.put_resolutionToNotification(Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution.example())
    api.put_clearedToRequestResult(Base_Types.Boolean_example())
  }

  def timeTriggered(api: AttentionLatchStateOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee ATTENTION_PUBLICATION
        api.resolutionToNotification.newAttention == attentionState &
          api.clearedToRequestResult == api.resolutionToNotification.attentionClearedNow,
        // case ATTN_01_UNTRUSTED
        (api.batteryIn.confidence != BatteryConfidence.Trusted) ___>: (attentionState == AttentionState.Attention &
          api.resolutionToNotification.cause == AttentionCause.Untrusted &
          api.resolutionToNotification.attentionClearedNow == F &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_01),
        // case ATTN_02_CRITICAL
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band == QualifiedBand.Critical) ___>: (attentionState == AttentionState.Attention &
          api.resolutionToNotification.cause == AttentionCause.Critical &
          api.resolutionToNotification.attentionClearedNow == F &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_02),
        // case ATTN_03_LOW
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band == QualifiedBand.Low) ___>: (attentionState == AttentionState.Attention &
          api.resolutionToNotification.cause == AttentionCause.Low &
          api.resolutionToNotification.attentionClearedNow == F &
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
          api.resolutionToNotification.attentionClearedNow == F &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_05),
        // case ATTN_06_RETAIN_CLEAR
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.batteryIn.band != QualifiedBand.Critical &
          api.batteryIn.band != QualifiedBand.Low &
          In(attentionState) == AttentionState.Clear) ___>: (attentionState == AttentionState.Clear &
          api.resolutionToNotification.cause == AttentionCause.Clear &
          api.resolutionToNotification.attentionClearedNow == F &
          api.resolutionToNotification.winningCase == AttentionCase.ATTN_06)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_requestIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
    val apiUsage_batteryIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
  }

  def finalise(api: AttentionLatchStateOwner_Operational_Api): Unit = { }
}
