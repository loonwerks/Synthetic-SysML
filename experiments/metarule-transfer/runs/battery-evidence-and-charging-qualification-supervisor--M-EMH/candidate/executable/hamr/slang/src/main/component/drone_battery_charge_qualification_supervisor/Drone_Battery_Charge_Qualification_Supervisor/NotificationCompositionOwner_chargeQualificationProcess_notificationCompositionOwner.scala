// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner {

  def initialise(api: NotificationCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_pilotNoticeOut(PilotNotice.EvidenceUntrusted)
    api.put_flightControlNoticeOut(FlightControlNotice.EvidenceUntrusted)
  }

  def timeTriggered(api: NotificationCompositionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_attentionIn(), api.get_faultsIn(), api.get_sessionIn()) match {
      case (Some(attention), Some(faults), Some(session)) =>
        val pilotNotice: PilotNotice.Type =
          if (faults.vector.batteryFault) PilotNotice.EvidenceUntrusted
          else if (attention.cause == AttentionCause.Critical) PilotNotice.Critical
          else if (attention.cause == AttentionCause.Low) PilotNotice.Low
          else if (faults.aggregateFault ||
                   session.newSession.sessionValue == ChargeSession.Suspended) PilotNotice.ChargeAttention
          else if (attention.newAttention == AttentionState.Attention) PilotNotice.RecoveryPending
          else PilotNotice.Clear
        val flightNotice: FlightControlNotice.Type =
          if (faults.vector.batteryFault) FlightControlNotice.EvidenceUntrusted
          else if (attention.cause == AttentionCause.Critical) FlightControlNotice.Critical
          else if (attention.cause == AttentionCause.Low) FlightControlNotice.Low
          else if (attention.newAttention == AttentionState.Attention) FlightControlNotice.RecoveryPending
          else FlightControlNotice.Clear
        api.put_pilotNoticeOut(pilotNotice)
        api.put_flightControlNoticeOut(flightNotice)
      case _ =>
    }
  }

  def finalise(api: NotificationCompositionOwner_Operational_Api): Unit = { }
}
