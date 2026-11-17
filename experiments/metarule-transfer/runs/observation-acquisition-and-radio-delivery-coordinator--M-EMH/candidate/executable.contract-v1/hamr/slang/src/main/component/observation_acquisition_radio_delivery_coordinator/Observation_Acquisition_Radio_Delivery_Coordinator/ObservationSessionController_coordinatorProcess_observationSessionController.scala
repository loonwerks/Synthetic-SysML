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
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_PRE_SESSION
        api.sessionPhaseOutput == committedSession,
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
        // guarantee COMPLETE_SNAPSHOT
        (committedSession == ObservationSessionState.IDLE ___>:
          api.sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) &
          (committedSession == ObservationSessionState.ACQUIRING ___>:
            api.sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING) &
          (committedSession == ObservationSessionState.QUEUED ___>:
            api.sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED) &
          (committedSession == ObservationSessionState.SENDING ___>:
            api.sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING) &
          (committedSession == ObservationSessionState.SUSPENDED ___>:
            api.sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED),
        // guarantee RECOVERY_REASON_PRESERVATION
        api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED ___>:
          api.sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE |
            api.sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE,
        // case CASE_19_TOTAL_STATE_COMMAND_RESULT
        //   Decision commits one total session result
        (T) ___>: ((api.sessionDecision == SessionDecision.NO_CHANGE ___>:
          committedSession == In(committedSession) &
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
            committedSession == In(committedSession) &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
          (api.sessionDecision == SessionDecision.REJECT_ENERGY ___>:
            committedSession == In(committedSession) &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) &
          (api.sessionDecision == SessionDecision.REJECT_CONTEXT ___>:
            committedSession == In(committedSession) &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
          (api.sessionDecision == SessionDecision.REJECT_CAMERA ___>:
            committedSession == In(committedSession) &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) &
          (api.sessionDecision == SessionDecision.REJECT_RADIO ___>:
            committedSession == In(committedSession) &
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
              api.sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_sessionDecision: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type] = api.get_sessionDecision()
    api.logInfo(s"Received on data port sessionDecision: ${apiUsage_sessionDecision}")
  }

  def finalise(api: ObservationSessionController_Operational_Api): Unit = { }
}
