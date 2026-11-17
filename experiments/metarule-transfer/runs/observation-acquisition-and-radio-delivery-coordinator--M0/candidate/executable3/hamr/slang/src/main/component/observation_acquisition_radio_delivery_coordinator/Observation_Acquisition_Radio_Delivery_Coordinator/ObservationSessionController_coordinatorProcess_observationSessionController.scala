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
    Contract(Modifies(api))
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
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_19_TOTAL_STATE_COMMAND_RESULT
        //   One decision selects the committed session and snapshot | N.md#CASE_19
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
    val pre: ObservationSessionState.Type = committedSession
    val decision: SessionDecision.Type = api.get_sessionDecision() match {
      case Some(value) => value
      case _ => SessionDecision.NO_CHANGE
    }
    val next: ObservationSessionState.Type =
      if (decision == SessionDecision.BEGIN_ACQUISITION) ObservationSessionState.ACQUIRING
      else if (decision == SessionDecision.CANCEL_TO_IDLE | decision == SessionDecision.COMPLETE_TO_IDLE) ObservationSessionState.IDLE
      else if (decision == SessionDecision.SUSPEND_EVIDENCE | decision == SessionDecision.SUSPEND_ENERGY |
               decision == SessionDecision.SUSPEND_CONTEXT | decision == SessionDecision.SUSPEND_CAMERA |
               decision == SessionDecision.SUSPEND_RADIO) ObservationSessionState.SUSPENDED
      else if (decision == SessionDecision.QUEUE_CAPTURE | decision == SessionDecision.RETRY_QUEUE) ObservationSessionState.QUEUED
      else if (decision == SessionDecision.BEGIN_TRANSMISSION) ObservationSessionState.SENDING
      else pre
    val disposition: SnapshotCoordinationDisposition.Type =
      if (decision == SessionDecision.BEGIN_ACQUISITION) SnapshotCoordinationDisposition.STARTED
      else if (decision == SessionDecision.CANCEL_TO_IDLE) SnapshotCoordinationDisposition.CANCELLED
      else if (decision == SessionDecision.SUSPEND_EVIDENCE | decision == SessionDecision.SUSPEND_ENERGY |
               decision == SessionDecision.SUSPEND_CONTEXT | decision == SessionDecision.SUSPEND_CAMERA |
               decision == SessionDecision.SUSPEND_RADIO) SnapshotCoordinationDisposition.RECOVERY_APPLIED
      else if (decision == SessionDecision.QUEUE_CAPTURE | decision == SessionDecision.BEGIN_TRANSMISSION |
               decision == SessionDecision.RETRY_QUEUE) SnapshotCoordinationDisposition.PROGRESSED
      else if (decision == SessionDecision.COMPLETE_TO_IDLE) SnapshotCoordinationDisposition.COMPLETED
      else if (decision == SessionDecision.REJECT_EVIDENCE | decision == SessionDecision.REJECT_ENERGY |
               decision == SessionDecision.REJECT_CONTEXT | decision == SessionDecision.REJECT_CAMERA |
               decision == SessionDecision.REJECT_RADIO) SnapshotCoordinationDisposition.REJECTED
      else SnapshotCoordinationDisposition.NO_CHANGE
    val reason: SnapshotCoordinationReason.Type =
      if (decision == SessionDecision.CANCEL_TO_IDLE) SnapshotCoordinationReason.CANCELLED
      else if (decision == SessionDecision.SUSPEND_EVIDENCE | decision == SessionDecision.REJECT_EVIDENCE) SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE
      else if (decision == SessionDecision.SUSPEND_ENERGY | decision == SessionDecision.REJECT_ENERGY) SnapshotCoordinationReason.ENERGY_LOW
      else if (decision == SessionDecision.SUSPEND_CONTEXT | decision == SessionDecision.REJECT_CONTEXT) SnapshotCoordinationReason.CONTEXT_INELIGIBLE
      else if (decision == SessionDecision.SUSPEND_CAMERA | decision == SessionDecision.REJECT_CAMERA) SnapshotCoordinationReason.CAMERA_UNUSABLE
      else if (decision == SessionDecision.SUSPEND_RADIO | decision == SessionDecision.REJECT_RADIO) SnapshotCoordinationReason.RADIO_UNAVAILABLE
      else SnapshotCoordinationReason.NONE
    val preSnapshot: SnapshotPreSessionState.Type = pre match {
      case ObservationSessionState.IDLE => SnapshotPreSessionState.IDLE
      case ObservationSessionState.ACQUIRING => SnapshotPreSessionState.ACQUIRING
      case ObservationSessionState.QUEUED => SnapshotPreSessionState.QUEUED
      case ObservationSessionState.SENDING => SnapshotPreSessionState.SENDING
      case ObservationSessionState.SUSPENDED => SnapshotPreSessionState.SUSPENDED
    }
    val nextSnapshot: SnapshotNextSessionState.Type = next match {
      case ObservationSessionState.IDLE => SnapshotNextSessionState.IDLE
      case ObservationSessionState.ACQUIRING => SnapshotNextSessionState.ACQUIRING
      case ObservationSessionState.QUEUED => SnapshotNextSessionState.QUEUED
      case ObservationSessionState.SENDING => SnapshotNextSessionState.SENDING
      case ObservationSessionState.SUSPENDED => SnapshotNextSessionState.SUSPENDED
    }
    committedSession = next
    api.put_sessionPhaseOutput(pre)
    api.put_sessionSnapshot(SessionSnapshot(preSnapshot, nextSnapshot, disposition, reason))
    api.put_cameraAcquisitionCommand(if (next == ObservationSessionState.ACQUIRING) CameraAcquisitionCommand.ACQUIRE else CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(if (next == ObservationSessionState.SENDING) RadioDeliveryCommand.SEND_OBSERVATION else RadioDeliveryCommand.HOLD)
  }

  def finalise(api: ObservationSessionController_Operational_Api): Unit = { }
}
