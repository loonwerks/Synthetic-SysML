// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSessionController_coordinatorProcess_observationSessionController {

  // BEGIN STATE VARS
  var committedSession: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE
  // END STATE VARS

  def initialise(api: ObservationSessionController_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionPhaseOutput(Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE)
    api.put_sessionSnapshot(Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot.example())
    api.put_cameraAcquisitionCommand(Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD)
  }

  def timeTriggered(api: ObservationSessionController_Operational_Api): Unit = {
    Contract(
      Modifies(api, committedSession),
      Ensures(T)
      /*
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_PRE_SESSION
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE ___>:
          api.sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING ___>:
            api.sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED ___>:
            api.sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING ___>:
            api.sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED ___>:
            api.sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED),
        // guarantee COMPLETE_SNAPSHOT
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE ___>:
          api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING ___>:
            api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED ___>:
            api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING ___>:
            api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED ___>:
            api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED),
        // guarantee CAMERA_COMMAND_FROM_NEXT_STATE
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING ___>:
          api.cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.ACQUIRE) &
          (committedSession != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING ___>:
            api.cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD),
        // guarantee RADIO_COMMAND_FROM_NEXT_STATE
        (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING ___>:
          api.radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.SEND_OBSERVATION) &
          (committedSession != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING ___>:
            api.radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD),
        // guarantee RECOVERY_REASON_PRESERVATION
        api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED ___>:
          api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE |
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE,
        // case CASE_19_TOTAL_STATE_COMMAND_RESULT
        (T) ___>: ((api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION ___>:
          committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED &
            api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE |
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE ___>:
            committedSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE &
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
              api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE))
        // END COMPUTE ENSURES timeTriggered
      */
    )
    val sessionDecision = api.get_sessionDecision().get
    val preSession = committedSession
    var nextSession = preSession
    var disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE
    var reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE
    if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE | sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE) {
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE) {
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY) {
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT) {
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA) {
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE
    } else if (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO) {
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE
    }
    committedSession = nextSession
    val snapshotPre: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type = if (preSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.ACQUIRING
      else if (preSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.QUEUED
      else if (preSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SENDING
      else if (preSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SUSPENDED
      else Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.IDLE
    val snapshotNext: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type = if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING
      else if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED
      else if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING
      else if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED
      else Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE
    api.put_sessionPhaseOutput(nextSession)
    api.put_sessionSnapshot(Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot(snapshotPre, snapshotNext, disposition, reason))
    api.put_cameraAcquisitionCommand(if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.ACQUIRE else Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(if (nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.SEND_OBSERVATION else Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD)
  }

  def finalise(api: ObservationSessionController_Operational_Api): Unit = { }
}
