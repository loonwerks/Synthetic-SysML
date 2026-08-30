// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSessionController_coordinatorProcess_observationSessionController {

  // State: committedSession — the committed pre-evaluation session state
  var committedSession: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type =
    Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE

  def initialise(api: ObservationSessionController_Initialization_Api): Unit = {
    Contract(
      Modifies(api, committedSession),
      Ensures(
        // INIT_SESSION_COMMANDS_AND_SNAPSHOT
        committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE &
        api.sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE &
        api.sessionSnapshot.preSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.IDLE &
        api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE &
        api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE &
        api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE &
        api.cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD &
        api.radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD
      )
    )

    committedSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE

    api.put_sessionPhaseOutput(Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE)
    api.put_sessionSnapshot(Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot(
      preSession = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.IDLE,
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE,
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE,
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE))
    api.put_cameraAcquisitionCommand(Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD)
  }

  def timeTriggered(api: ObservationSessionController_Operational_Api): Unit = {
    Contract(
      Modifies(api, committedSession),
      Ensures(
        // PUBLISH_PRE_SESSION
        api.sessionPhaseOutput == In(committedSession) &
        // COMPLETE_SNAPSHOT
        (In(committedSession) == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE)
          ->:(api.sessionSnapshot.preSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.IDLE) &
        (In(committedSession) == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING)
          ->:(api.sessionSnapshot.preSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.ACQUIRING) &
        (In(committedSession) == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED)
          ->:(api.sessionSnapshot.preSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.QUEUED) &
        (In(committedSession) == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING)
          ->:(api.sessionSnapshot.preSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SENDING) &
        (In(committedSession) == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED)
          ->:(api.sessionSnapshot.preSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SUSPENDED) &
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE)
          ->:(api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE) &
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING)
          ->:(api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING) &
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED)
          ->:(api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED) &
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING)
          ->:(api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING) &
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED)
          ->:(api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED) &
        // CAMERA_COMMAND_FROM_NEXT_STATE
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING)
          ->:(api.cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.ACQUIRE) &
        (committedSession != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING)
          ->:(api.cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD) &
        // RADIO_COMMAND_FROM_NEXT_STATE
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING)
          ->:(api.radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.SEND_OBSERVATION) &
        (committedSession != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING)
          ->:(api.radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD) &
        // RECOVERY_REASON_PRESERVATION
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED)
          ->:(api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE) &
        // CASE_19_TOTAL_STATE_COMMAND_RESULT
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
          ->:(committedSession == In(committedSession) &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE)
          ->:(committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE)
          ->:(committedSession == In(committedSession) &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY)
          ->:(committedSession == In(committedSession) &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT)
          ->:(committedSession == In(committedSession) &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA)
          ->:(committedSession == In(committedSession) &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE) &
        (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO)
          ->:(committedSession == In(committedSession) &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE)
      )
    )

    val sessionDecisionOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type] = api.get_sessionDecision()
    val sessionDecision: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type = sessionDecisionOpt.get

    // Capture the committed pre-evaluation session state before it is committed
    // to its next value; PUBLISH_PRE_SESSION and COMPLETE_SNAPSHOT both publish
    // the entry value of committedSession.
    val preCommittedSession: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = committedSession

    val preSession: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type =
      preCommittedSession match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE =>
          Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.IDLE
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING =>
          Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.ACQUIRING
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED =>
          Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.QUEUED
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING =>
          Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SENDING
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED =>
          Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SUSPENDED
      }

    val (nextSession, disposition, reason): (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type) = sessionDecision match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE =>
        (committedSession, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE =>
        (Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE =>
        (committedSession, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY =>
        (committedSession, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT =>
        (committedSession, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA =>
        (committedSession, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO =>
        (committedSession, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED, Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE)
    }

    committedSession = nextSession

    api.put_sessionPhaseOutput(preCommittedSession)

    val nextSessionEnum: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type = nextSession match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE
      case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING =>
        Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING
      case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED
      case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING =>
        Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING
      case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED
    }

    api.put_sessionSnapshot(Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot(
      preSession = preSession,
      nextSession = nextSessionEnum,
      disposition = disposition,
      reason = reason))
    api.put_cameraAcquisitionCommand(
      if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING)
        Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.ACQUIRE
      else
        Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(
      if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING)
        Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.SEND_OBSERVATION
      else
        Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD)
  }

  def finalise(api: ObservationSessionController_Operational_Api): Unit = { }
}
