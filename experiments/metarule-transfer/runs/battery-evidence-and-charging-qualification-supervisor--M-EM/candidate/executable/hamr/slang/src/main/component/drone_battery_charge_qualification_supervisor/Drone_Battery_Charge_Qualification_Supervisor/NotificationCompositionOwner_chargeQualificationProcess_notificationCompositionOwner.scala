// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner {

  def initialise(api: NotificationCompositionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotNoticeOut(Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.EvidenceUntrusted)
    api.put_flightControlNoticeOut(Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.EvidenceUntrusted)
  }

  def timeTriggered(api: NotificationCompositionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case PILOT_EVIDENCE_UNTRUSTED
        (api.faultsIn.vector.batteryFault) ___>: (api.pilotNoticeOut == PilotNotice.EvidenceUntrusted),
        // case PILOT_CRITICAL
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause == AttentionCause.Critical) ___>: (api.pilotNoticeOut == PilotNotice.Critical),
        // case PILOT_LOW
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause == AttentionCause.Low) ___>: (api.pilotNoticeOut == PilotNotice.Low),
        // case PILOT_CHARGE_ATTENTION
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause != AttentionCause.Critical &
          api.attentionIn.cause != AttentionCause.Low &
          (api.faultsIn.aggregateFault |
            api.sessionIn.newSession.sessionValue == ChargeSession.Suspended)) ___>: (api.pilotNoticeOut == PilotNotice.ChargeAttention),
        // case PILOT_RECOVERY_PENDING
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause != AttentionCause.Critical &
          api.attentionIn.cause != AttentionCause.Low &
          api.faultsIn.aggregateFault == F &
          api.sessionIn.newSession.sessionValue != ChargeSession.Suspended &
          api.attentionIn.newAttention == AttentionState.Attention) ___>: (api.pilotNoticeOut == PilotNotice.RecoveryPending),
        // case PILOT_CLEAR
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause != AttentionCause.Critical &
          api.attentionIn.cause != AttentionCause.Low &
          api.faultsIn.aggregateFault == F &
          api.sessionIn.newSession.sessionValue != ChargeSession.Suspended &
          api.attentionIn.newAttention == AttentionState.Clear) ___>: (api.pilotNoticeOut == PilotNotice.Clear),
        // case FLIGHT_EVIDENCE_UNTRUSTED
        (api.faultsIn.vector.batteryFault) ___>: (api.flightControlNoticeOut == FlightControlNotice.EvidenceUntrusted),
        // case FLIGHT_CRITICAL
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause == AttentionCause.Critical) ___>: (api.flightControlNoticeOut == FlightControlNotice.Critical),
        // case FLIGHT_LOW
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause == AttentionCause.Low) ___>: (api.flightControlNoticeOut == FlightControlNotice.Low),
        // case FLIGHT_RECOVERY_PENDING
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause != AttentionCause.Critical &
          api.attentionIn.cause != AttentionCause.Low &
          api.attentionIn.newAttention == AttentionState.Attention) ___>: (api.flightControlNoticeOut == FlightControlNotice.RecoveryPending),
        // case FLIGHT_CLEAR
        (api.faultsIn.vector.batteryFault == F &
          api.attentionIn.cause != AttentionCause.Critical &
          api.attentionIn.cause != AttentionCause.Low &
          api.attentionIn.newAttention == AttentionState.Clear) ___>: (api.flightControlNoticeOut == FlightControlNotice.Clear)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_attentionIn: Option[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution] = api.get_attentionIn()
    api.logInfo(s"Received on data port attentionIn: ${apiUsage_attentionIn}")
    val apiUsage_faultsIn: Option[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts] = api.get_faultsIn()
    api.logInfo(s"Received on data port faultsIn: ${apiUsage_faultsIn}")
    val apiUsage_sessionIn: Option[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution] = api.get_sessionIn()
    api.logInfo(s"Received on data port sessionIn: ${apiUsage_sessionIn}")
  }

  def finalise(api: NotificationCompositionOwner_Operational_Api): Unit = { }
}
