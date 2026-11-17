// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSessionController_coordinatorProcess_observationSessionController {

  // BEGIN STATE VARS
  var committedSession: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE
  // END STATE VARS

  def snapshotState(state: ObservationSessionState.Type): (SnapshotPreSessionState.Type, SnapshotNextSessionState.Type) = {
    if (state == ObservationSessionState.ACQUIRING) {
      return (SnapshotPreSessionState.ACQUIRING, SnapshotNextSessionState.ACQUIRING)
    } else if (state == ObservationSessionState.QUEUED) {
      return (SnapshotPreSessionState.QUEUED, SnapshotNextSessionState.QUEUED)
    } else if (state == ObservationSessionState.SENDING) {
      return (SnapshotPreSessionState.SENDING, SnapshotNextSessionState.SENDING)
    } else if (state == ObservationSessionState.SUSPENDED) {
      return (SnapshotPreSessionState.SUSPENDED, SnapshotNextSessionState.SUSPENDED)
    } else {
      return (SnapshotPreSessionState.IDLE, SnapshotNextSessionState.IDLE)
    }
  }

  def initialise(api: ObservationSessionController_Initialization_Api): Unit = {
    Contract(Modifies(api, committedSession))
    committedSession = ObservationSessionState.IDLE
    api.put_sessionPhaseOutput(ObservationSessionState.IDLE)
    api.put_sessionSnapshot(SessionSnapshot(
      SnapshotPreSessionState.IDLE, SnapshotNextSessionState.IDLE,
      SnapshotCoordinationDisposition.NO_CHANGE, SnapshotCoordinationReason.NONE))
    api.put_cameraAcquisitionCommand(CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(RadioDeliveryCommand.HOLD)
  }

  def timeTriggered(api: ObservationSessionController_Operational_Api): Unit = {
    Contract(
      Modifies(api, committedSession),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_PRE_SESSION
        api.sessionPhaseOutput == committedSession,
        // guarantee COMPLETE_SNAPSHOT
        (committedSession == ObservationSessionState.IDLE ___>:
          api.sessionSnapshot.preSession == SnapshotPreSessionState.IDLE &
            api.sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) &
          (committedSession == ObservationSessionState.ACQUIRING ___>:
            api.sessionSnapshot.preSession == SnapshotPreSessionState.ACQUIRING &
              api.sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING) &
          (committedSession == ObservationSessionState.QUEUED ___>:
            api.sessionSnapshot.preSession == SnapshotPreSessionState.QUEUED &
              api.sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED) &
          (committedSession == ObservationSessionState.SENDING ___>:
            api.sessionSnapshot.preSession == SnapshotPreSessionState.SENDING &
              api.sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING) &
          (committedSession == ObservationSessionState.SUSPENDED ___>:
            api.sessionSnapshot.preSession == SnapshotPreSessionState.SUSPENDED &
              api.sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED),
        // guarantee CAMERA_COMMAND_FROM_NEXT_STATE
        (committedSession == ObservationSessionState.ACQUIRING ___>:
          api.cameraAcquisitionCommand == CameraAcquisitionCommand.ACQUIRE) &
          (committedSession != ObservationSessionState.ACQUIRING ___>:
            api.cameraAcquisitionCommand == CameraAcquisitionCommand.HOLD),
        // guarantee RADIO_COMMAND_FROM_NEXT_STATE
        (committedSession == ObservationSessionState.SENDING ___>:
          api.radioDeliveryCommand == RadioDeliveryCommand.SEND_OBSERVATION) &
          (committedSession != ObservationSessionState.SENDING ___>:
            api.radioDeliveryCommand == RadioDeliveryCommand.HOLD),
        // guarantee RECOVERY_REASON_PRESERVATION
        api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED ___>:
          api.sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE,
        // case CASE_19_TOTAL_STATE_COMMAND_RESULT
        (T) ___>: ((api.sessionDecision == SessionDecision.NO_CHANGE ___>:
          api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE &
            api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == SessionDecision.BEGIN_ACQUISITION ___>:
            committedSession == ObservationSessionState.ACQUIRING &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.STARTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == SessionDecision.CANCEL_TO_IDLE ___>:
            committedSession == ObservationSessionState.IDLE &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.CANCELLED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED) &
          (api.sessionDecision == SessionDecision.SUSPEND_EVIDENCE ___>:
            committedSession == ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
          (api.sessionDecision == SessionDecision.SUSPEND_ENERGY ___>:
            committedSession == ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) &
          (api.sessionDecision == SessionDecision.SUSPEND_CONTEXT ___>:
            committedSession == ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
          (api.sessionDecision == SessionDecision.SUSPEND_CAMERA ___>:
            committedSession == ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) &
          (api.sessionDecision == SessionDecision.SUSPEND_RADIO ___>:
            committedSession == ObservationSessionState.SUSPENDED &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) &
          (api.sessionDecision == SessionDecision.QUEUE_CAPTURE ___>:
            committedSession == ObservationSessionState.QUEUED &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == SessionDecision.BEGIN_TRANSMISSION ___>:
            committedSession == ObservationSessionState.SENDING &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == SessionDecision.COMPLETE_TO_IDLE ___>:
            committedSession == ObservationSessionState.IDLE &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == SessionDecision.RETRY_QUEUE ___>:
            committedSession == ObservationSessionState.QUEUED &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE) &
          (api.sessionDecision == SessionDecision.REJECT_EVIDENCE ___>:
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
          (api.sessionDecision == SessionDecision.REJECT_ENERGY ___>:
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) &
          (api.sessionDecision == SessionDecision.REJECT_CONTEXT ___>:
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
          (api.sessionDecision == SessionDecision.REJECT_CAMERA ___>:
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) &
          (api.sessionDecision == SessionDecision.REJECT_RADIO ___>:
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_sessionDecision().get
    var next = committedSession
    var disposition = SnapshotCoordinationDisposition.NO_CHANGE
    var reason = SnapshotCoordinationReason.NONE
    if (decision == SessionDecision.BEGIN_ACQUISITION) {
      next = ObservationSessionState.ACQUIRING
      disposition = SnapshotCoordinationDisposition.STARTED
    } else if (decision == SessionDecision.CANCEL_TO_IDLE) {
      next = ObservationSessionState.IDLE
      disposition = SnapshotCoordinationDisposition.CANCELLED
      reason = SnapshotCoordinationReason.CANCELLED
    } else if (decision == SessionDecision.SUSPEND_EVIDENCE) {
      next = ObservationSessionState.SUSPENDED
      disposition = SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE
    } else if (decision == SessionDecision.SUSPEND_ENERGY) {
      next = ObservationSessionState.SUSPENDED
      disposition = SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = SnapshotCoordinationReason.ENERGY_LOW
    } else if (decision == SessionDecision.SUSPEND_CONTEXT) {
      next = ObservationSessionState.SUSPENDED
      disposition = SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = SnapshotCoordinationReason.CONTEXT_INELIGIBLE
    } else if (decision == SessionDecision.SUSPEND_CAMERA) {
      next = ObservationSessionState.SUSPENDED
      disposition = SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = SnapshotCoordinationReason.CAMERA_UNUSABLE
    } else if (decision == SessionDecision.SUSPEND_RADIO) {
      next = ObservationSessionState.SUSPENDED
      disposition = SnapshotCoordinationDisposition.RECOVERY_APPLIED
      reason = SnapshotCoordinationReason.RADIO_UNAVAILABLE
    } else if (decision == SessionDecision.QUEUE_CAPTURE | decision == SessionDecision.RETRY_QUEUE) {
      next = ObservationSessionState.QUEUED
      disposition = SnapshotCoordinationDisposition.PROGRESSED
    } else if (decision == SessionDecision.BEGIN_TRANSMISSION) {
      next = ObservationSessionState.SENDING
      disposition = SnapshotCoordinationDisposition.PROGRESSED
    } else if (decision == SessionDecision.COMPLETE_TO_IDLE) {
      next = ObservationSessionState.IDLE
      disposition = SnapshotCoordinationDisposition.COMPLETED
    } else if (decision == SessionDecision.REJECT_EVIDENCE) {
      disposition = SnapshotCoordinationDisposition.REJECTED
      reason = SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE
    } else if (decision == SessionDecision.REJECT_ENERGY) {
      disposition = SnapshotCoordinationDisposition.REJECTED
      reason = SnapshotCoordinationReason.ENERGY_LOW
    } else if (decision == SessionDecision.REJECT_CONTEXT) {
      disposition = SnapshotCoordinationDisposition.REJECTED
      reason = SnapshotCoordinationReason.CONTEXT_INELIGIBLE
    } else if (decision == SessionDecision.REJECT_CAMERA) {
      disposition = SnapshotCoordinationDisposition.REJECTED
      reason = SnapshotCoordinationReason.CAMERA_UNUSABLE
    } else if (decision == SessionDecision.REJECT_RADIO) {
      disposition = SnapshotCoordinationDisposition.REJECTED
      reason = SnapshotCoordinationReason.RADIO_UNAVAILABLE
    }
    committedSession = next
    api.put_sessionPhaseOutput(next)
    if (next == ObservationSessionState.ACQUIRING) {
      api.put_sessionSnapshot(SessionSnapshot(
        SnapshotPreSessionState.ACQUIRING, SnapshotNextSessionState.ACQUIRING, disposition, reason))
    } else if (next == ObservationSessionState.QUEUED) {
      api.put_sessionSnapshot(SessionSnapshot(
        SnapshotPreSessionState.QUEUED, SnapshotNextSessionState.QUEUED, disposition, reason))
    } else if (next == ObservationSessionState.SENDING) {
      api.put_sessionSnapshot(SessionSnapshot(
        SnapshotPreSessionState.SENDING, SnapshotNextSessionState.SENDING, disposition, reason))
    } else if (next == ObservationSessionState.SUSPENDED) {
      api.put_sessionSnapshot(SessionSnapshot(
        SnapshotPreSessionState.SUSPENDED, SnapshotNextSessionState.SUSPENDED, disposition, reason))
    } else {
      api.put_sessionSnapshot(SessionSnapshot(
        SnapshotPreSessionState.IDLE, SnapshotNextSessionState.IDLE, disposition, reason))
    }
    if (next == ObservationSessionState.ACQUIRING) {
      api.put_cameraAcquisitionCommand(CameraAcquisitionCommand.ACQUIRE)
    } else {
      api.put_cameraAcquisitionCommand(CameraAcquisitionCommand.HOLD)
    }
    if (next == ObservationSessionState.SENDING) {
      api.put_radioDeliveryCommand(RadioDeliveryCommand.SEND_OBSERVATION)
    } else {
      api.put_radioDeliveryCommand(RadioDeliveryCommand.HOLD)
    }
  }

  def finalise(api: ObservationSessionController_Operational_Api): Unit = { }
}
