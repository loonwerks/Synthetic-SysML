// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy {

  def initialise(api: CoordinationOutcomePolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus.example())
    api.put_droneControlObservationNotice(Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE)
  }

  def timeTriggered(api: CoordinationOutcomePolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
      /*
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_RECIPIENT_SPECIFIC_OUTCOMES
        (T) ___>: (api.operatorCoordinationStatus.batteryAssessment == api.batteryAssessment &
          (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE ___>:
            api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE) &
          (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING ___>:
            api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.ACQUIRING) &
          (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED ___>:
            api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.QUEUED) &
          (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING ___>:
            api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SENDING) &
          (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED ___>:
            api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SUSPENDED) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE ___>:
            api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED ___>:
            api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.STARTED) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED ___>:
            api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.CANCELLED) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED ___>:
            api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.PROGRESSED) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED ___>:
            api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.COMPLETED) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED ___>:
            api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.RECOVERY_APPLIED) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED ___>:
            api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.REJECTED) &
          (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE ___>:
            api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE) &
          (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED ___>:
            api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CANCELLED) &
          (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE ___>:
            api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.EVIDENCE_UNAVAILABLE) &
          (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW ___>:
            api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.ENERGY_LOW) &
          (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE ___>:
            api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CONTEXT_INELIGIBLE) &
          (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE ___>:
            api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CAMERA_UNUSABLE) &
          (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE ___>:
            api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.RADIO_UNAVAILABLE) &
          (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE ___>:
            api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
          (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW ___>:
            api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW) &
          (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED ___>:
            api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.REQUEST_REJECTED) &
          (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED ___>:
            api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.DELIVERY_COMPLETED) &
          (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED ___>:
            api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.DELIVERY_REPORTED) &
          (api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
            (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING |
              api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED |
              api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING) ___>:
            api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_ACTIVE) &
          (api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
            (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED |
              api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) ___>:
            api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_BLOCKED) &
          (api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
            api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE &
            api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED ___>:
            api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE))
        // END COMPUTE ENSURES timeTriggered
      */
    )
    val batteryAssessment = api.get_batteryAssessment().get
    val sessionSnapshot = api.get_sessionSnapshot().get
    val nextSession: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type = if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING) Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.ACQUIRING
      else if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.QUEUED
      else if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING) Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SENDING
      else if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SUSPENDED
      else Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE
    val disposition: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type = if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.STARTED
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.CANCELLED
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.PROGRESSED
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.COMPLETED
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.RECOVERY_APPLIED
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.REJECTED
      else Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE
    val reason: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type = if (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CANCELLED
      else if (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.EVIDENCE_UNAVAILABLE
      else if (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.ENERGY_LOW
      else if (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CONTEXT_INELIGIBLE
      else if (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CAMERA_UNUSABLE
      else if (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE) Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.RADIO_UNAVAILABLE
      else Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE
    val advisory: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type = if (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE
      else if (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CONTEXT_INELIGIBLE
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CAMERA_UNUSABLE
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED & sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.RADIO_UNAVAILABLE
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.REQUEST_REJECTED
      else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.DELIVERY_COMPLETED
      else Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.NONE
    val notice: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type = if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.DELIVERY_REPORTED
      else if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING | sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED | sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING) Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_ACTIVE
      else if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED | sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_BLOCKED
      else Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE
    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus(nextSession, batteryAssessment, disposition, reason, advisory))
    api.put_droneControlObservationNotice(notice)
  }

  def finalise(api: CoordinationOutcomePolicy_Operational_Api): Unit = { }
}
