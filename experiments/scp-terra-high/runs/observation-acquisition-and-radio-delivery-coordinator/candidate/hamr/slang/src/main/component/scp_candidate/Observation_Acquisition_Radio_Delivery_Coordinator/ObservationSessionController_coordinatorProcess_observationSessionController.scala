// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSessionController_coordinatorProcess_observationSessionController {

  var committedSession: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type =
    Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE

  def initialise(api: ObservationSessionController_Initialization_Api): Unit = {
    Contract(Modifies(api, committedSession))
    committedSession = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE
    api.put_sessionPhaseOutput(Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE)
    api.put_sessionSnapshot(Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot.example())
    api.put_cameraAcquisitionCommand(Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD)
    api.put_radioDeliveryCommand(Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD)
  }

  def timeTriggered(api: ObservationSessionController_Operational_Api): Unit = {
    Contract(Modifies(api, committedSession))
    val decision: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type = api.get_sessionDecision().get
    val pre: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = committedSession
    var next: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = pre
    var disposition: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE
    var reason: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE
    if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION) {
      next = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED
    } else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE) {
      next = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED
    } else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE) {
      next = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED
    } else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE) {
      next = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED
    } else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION) {
      next = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED
    } else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO) {
      next = Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED
    } else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO) {
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED
    }
    if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE)
      { reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE }
    else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY)
      { reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW }
    else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT)
      { reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE }
    else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA)
      { reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE }
    else if (decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO ||
      decision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO)
      { reason = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE }
    var preSnapshot: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.IDLE
    var nextSnapshot: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE
    if (pre == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) { preSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.ACQUIRING }
    else if (pre == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) { preSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.QUEUED }
    else if (pre == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) { preSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SENDING }
    else if (pre == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) { preSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SUSPENDED }
    if (next == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) { nextSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING }
    else if (next == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) { nextSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED }
    else if (next == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) { nextSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING }
    else if (next == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) { nextSnapshot = Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED }
    api.put_sessionPhaseOutput(pre)
    api.put_sessionSnapshot(Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot(
      preSession = preSnapshot, nextSession = nextSnapshot, disposition = disposition, reason = reason))
    var cameraCommand: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD
    var radioCommand: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD
    if (next == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) {
      cameraCommand = Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.ACQUIRE
    }
    if (next == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) {
      radioCommand = Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.SEND_OBSERVATION
    }
    api.put_cameraAcquisitionCommand(cameraCommand)
    api.put_radioDeliveryCommand(radioCommand)
    committedSession = next
  }

  def finalise(api: ObservationSessionController_Operational_Api): Unit = { }
}
