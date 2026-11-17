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
    val d: SessionDecision.Type = api.get_sessionDecision() match { case Some(v) => v case _ => SessionDecision.NO_CHANGE }
    val next: ObservationSessionState.Type =
      if (d == SessionDecision.BEGIN_ACQUISITION) ObservationSessionState.ACQUIRING
      else if (d == SessionDecision.CANCEL_TO_IDLE | d == SessionDecision.COMPLETE_TO_IDLE) ObservationSessionState.IDLE
      else if (d == SessionDecision.SUSPEND_EVIDENCE | d == SessionDecision.SUSPEND_ENERGY | d == SessionDecision.SUSPEND_CONTEXT | d == SessionDecision.SUSPEND_CAMERA | d == SessionDecision.SUSPEND_RADIO) ObservationSessionState.SUSPENDED
      else if (d == SessionDecision.QUEUE_CAPTURE | d == SessionDecision.RETRY_QUEUE) ObservationSessionState.QUEUED
      else if (d == SessionDecision.BEGIN_TRANSMISSION) ObservationSessionState.SENDING else pre
    val disposition: SnapshotCoordinationDisposition.Type =
      if (d == SessionDecision.BEGIN_ACQUISITION) SnapshotCoordinationDisposition.STARTED else if (d == SessionDecision.CANCEL_TO_IDLE) SnapshotCoordinationDisposition.CANCELLED
      else if (d == SessionDecision.SUSPEND_EVIDENCE | d == SessionDecision.SUSPEND_ENERGY | d == SessionDecision.SUSPEND_CONTEXT | d == SessionDecision.SUSPEND_CAMERA | d == SessionDecision.SUSPEND_RADIO) SnapshotCoordinationDisposition.RECOVERY_APPLIED
      else if (d == SessionDecision.QUEUE_CAPTURE | d == SessionDecision.BEGIN_TRANSMISSION | d == SessionDecision.RETRY_QUEUE) SnapshotCoordinationDisposition.PROGRESSED else if (d == SessionDecision.COMPLETE_TO_IDLE) SnapshotCoordinationDisposition.COMPLETED
      else if (d == SessionDecision.REJECT_EVIDENCE | d == SessionDecision.REJECT_ENERGY | d == SessionDecision.REJECT_CONTEXT | d == SessionDecision.REJECT_CAMERA | d == SessionDecision.REJECT_RADIO) SnapshotCoordinationDisposition.REJECTED else SnapshotCoordinationDisposition.NO_CHANGE
    val reason: SnapshotCoordinationReason.Type =
      if (d == SessionDecision.CANCEL_TO_IDLE) SnapshotCoordinationReason.CANCELLED else if (d == SessionDecision.SUSPEND_EVIDENCE | d == SessionDecision.REJECT_EVIDENCE) SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE
      else if (d == SessionDecision.SUSPEND_ENERGY | d == SessionDecision.REJECT_ENERGY) SnapshotCoordinationReason.ENERGY_LOW else if (d == SessionDecision.SUSPEND_CONTEXT | d == SessionDecision.REJECT_CONTEXT) SnapshotCoordinationReason.CONTEXT_INELIGIBLE
      else if (d == SessionDecision.SUSPEND_CAMERA | d == SessionDecision.REJECT_CAMERA) SnapshotCoordinationReason.CAMERA_UNUSABLE else if (d == SessionDecision.SUSPEND_RADIO | d == SessionDecision.REJECT_RADIO) SnapshotCoordinationReason.RADIO_UNAVAILABLE else SnapshotCoordinationReason.NONE
    val ps: SnapshotPreSessionState.Type = pre match { case ObservationSessionState.IDLE => SnapshotPreSessionState.IDLE case ObservationSessionState.ACQUIRING => SnapshotPreSessionState.ACQUIRING case ObservationSessionState.QUEUED => SnapshotPreSessionState.QUEUED case ObservationSessionState.SENDING => SnapshotPreSessionState.SENDING case _ => SnapshotPreSessionState.SUSPENDED }
    val ns: SnapshotNextSessionState.Type = next match { case ObservationSessionState.IDLE => SnapshotNextSessionState.IDLE case ObservationSessionState.ACQUIRING => SnapshotNextSessionState.ACQUIRING case ObservationSessionState.QUEUED => SnapshotNextSessionState.QUEUED case ObservationSessionState.SENDING => SnapshotNextSessionState.SENDING case _ => SnapshotNextSessionState.SUSPENDED }
    committedSession = next
    api.put_sessionPhaseOutput(pre)
    api.put_sessionSnapshot(SessionSnapshot(ps, ns, disposition, reason))
    api.put_cameraAcquisitionCommand(if (next == ObservationSessionState.ACQUIRING) CameraAcquisitionCommand.ACQUIRE else CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(if (next == ObservationSessionState.SENDING) RadioDeliveryCommand.SEND_OBSERVATION else RadioDeliveryCommand.HOLD)
  }

  def finalise(api: ObservationSessionController_Operational_Api): Unit = { }
}
