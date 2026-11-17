// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy {

  def initialise(api: CoordinationOutcomePolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_operatorCoordinationStatus(OperatorCoordinationStatus.example())
    api.put_droneControlObservationNotice(DroneControlObservationNotice.IDLE)
  }

  def timeTriggered(api: CoordinationOutcomePolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_RECIPIENT_SPECIFIC_OUTCOMES
        (T) ___>: (api.operatorCoordinationStatus.batteryAssessment == api.batteryAssessment &
          (api.sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE ___>:
            api.operatorCoordinationStatus.nextSession == StatusSessionState.IDLE) &
          (api.sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING ___>:
            api.operatorCoordinationStatus.nextSession == StatusSessionState.ACQUIRING) &
          (api.sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED ___>:
            api.operatorCoordinationStatus.nextSession == StatusSessionState.QUEUED) &
          (api.sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING ___>:
            api.operatorCoordinationStatus.nextSession == StatusSessionState.SENDING) &
          (api.sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED ___>:
            api.operatorCoordinationStatus.nextSession == StatusSessionState.SUSPENDED) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE ___>:
            api.operatorCoordinationStatus.disposition == StatusCoordinationDisposition.NO_CHANGE) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.STARTED ___>:
            api.operatorCoordinationStatus.disposition == StatusCoordinationDisposition.STARTED) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.CANCELLED ___>:
            api.operatorCoordinationStatus.disposition == StatusCoordinationDisposition.CANCELLED) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED ___>:
            api.operatorCoordinationStatus.disposition == StatusCoordinationDisposition.PROGRESSED) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED ___>:
            api.operatorCoordinationStatus.disposition == StatusCoordinationDisposition.COMPLETED) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED ___>:
            api.operatorCoordinationStatus.disposition == StatusCoordinationDisposition.RECOVERY_APPLIED) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED ___>:
            api.operatorCoordinationStatus.disposition == StatusCoordinationDisposition.REJECTED) &
          (api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE ___>:
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.NONE) &
          (api.sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED ___>:
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.CANCELLED) &
          (api.sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE ___>:
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.EVIDENCE_UNAVAILABLE) &
          (api.sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW ___>:
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.ENERGY_LOW) &
          (api.sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE ___>:
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.CONTEXT_INELIGIBLE) &
          (api.sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE ___>:
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.CAMERA_UNUSABLE) &
          (api.sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE ___>:
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.RADIO_UNAVAILABLE) &
          (api.batteryAssessment == BatteryAssessment.UNAVAILABLE ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
          (api.batteryAssessment == BatteryAssessment.LOW ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.CONTEXT_INELIGIBLE) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.CAMERA_UNUSABLE) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
            api.sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.RADIO_UNAVAILABLE) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.REQUEST_REJECTED) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.DELIVERY_COMPLETED) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE &
            (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              (api.sessionSnapshot.reason == SnapshotCoordinationReason.NONE |
                api.sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED) |
              api.sessionSnapshot.disposition != SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                api.sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED &
                api.sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED) ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.NONE) &
          (api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED ___>:
            api.droneControlObservationNotice == DroneControlObservationNotice.DELIVERY_REPORTED) &
          (api.sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
            (api.sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING |
              api.sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED |
              api.sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING) ___>:
            api.droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_ACTIVE) &
          (api.sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
            api.sessionSnapshot.nextSession != SnapshotNextSessionState.ACQUIRING &
            api.sessionSnapshot.nextSession != SnapshotNextSessionState.QUEUED &
            api.sessionSnapshot.nextSession != SnapshotNextSessionState.SENDING &
            (api.sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED |
              api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED) ___>:
            api.droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_BLOCKED) &
          (api.sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
            api.sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
            api.sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED ___>:
            api.droneControlObservationNotice == DroneControlObservationNotice.IDLE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val battery = api.get_batteryAssessment().get
    val snapshot = api.get_sessionSnapshot().get

    val next: StatusSessionState.Type =
      if (snapshot.nextSession == SnapshotNextSessionState.ACQUIRING) StatusSessionState.ACQUIRING
      else if (snapshot.nextSession == SnapshotNextSessionState.QUEUED) StatusSessionState.QUEUED
      else if (snapshot.nextSession == SnapshotNextSessionState.SENDING) StatusSessionState.SENDING
      else if (snapshot.nextSession == SnapshotNextSessionState.SUSPENDED) StatusSessionState.SUSPENDED
      else StatusSessionState.IDLE
    val disposition: StatusCoordinationDisposition.Type =
      if (snapshot.disposition == SnapshotCoordinationDisposition.STARTED) StatusCoordinationDisposition.STARTED
      else if (snapshot.disposition == SnapshotCoordinationDisposition.CANCELLED) StatusCoordinationDisposition.CANCELLED
      else if (snapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED) StatusCoordinationDisposition.PROGRESSED
      else if (snapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) StatusCoordinationDisposition.COMPLETED
      else if (snapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED) StatusCoordinationDisposition.RECOVERY_APPLIED
      else if (snapshot.disposition == SnapshotCoordinationDisposition.REJECTED) StatusCoordinationDisposition.REJECTED
      else StatusCoordinationDisposition.NO_CHANGE
    val reason: StatusCoordinationReason.Type =
      if (snapshot.reason == SnapshotCoordinationReason.CANCELLED) StatusCoordinationReason.CANCELLED
      else if (snapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) StatusCoordinationReason.EVIDENCE_UNAVAILABLE
      else if (snapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) StatusCoordinationReason.ENERGY_LOW
      else if (snapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) StatusCoordinationReason.CONTEXT_INELIGIBLE
      else if (snapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) StatusCoordinationReason.CAMERA_UNUSABLE
      else if (snapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) StatusCoordinationReason.RADIO_UNAVAILABLE
      else StatusCoordinationReason.NONE
    val advisory: OperatorAdvisory.Type =
      if (battery == BatteryAssessment.UNAVAILABLE) OperatorAdvisory.EVIDENCE_UNAVAILABLE
      else if (battery == BatteryAssessment.LOW) OperatorAdvisory.ENERGY_LOW
      else if (snapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
        snapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) OperatorAdvisory.EVIDENCE_UNAVAILABLE
      else if (snapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
        snapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) OperatorAdvisory.ENERGY_LOW
      else if (snapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
        snapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) OperatorAdvisory.CONTEXT_INELIGIBLE
      else if (snapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
        snapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) OperatorAdvisory.CAMERA_UNUSABLE
      else if (snapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
        snapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) OperatorAdvisory.RADIO_UNAVAILABLE
      else if (snapshot.disposition == SnapshotCoordinationDisposition.REJECTED) OperatorAdvisory.REQUEST_REJECTED
      else if (snapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) OperatorAdvisory.DELIVERY_COMPLETED
      else OperatorAdvisory.NONE
    val notice: DroneControlObservationNotice.Type =
      if (snapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) DroneControlObservationNotice.DELIVERY_REPORTED
      else if (snapshot.nextSession == SnapshotNextSessionState.ACQUIRING |
        snapshot.nextSession == SnapshotNextSessionState.QUEUED |
        snapshot.nextSession == SnapshotNextSessionState.SENDING) DroneControlObservationNotice.OBSERVATION_ACTIVE
      else if (snapshot.nextSession == SnapshotNextSessionState.SUSPENDED |
        snapshot.disposition == SnapshotCoordinationDisposition.REJECTED) DroneControlObservationNotice.OBSERVATION_BLOCKED
      else DroneControlObservationNotice.IDLE
    api.put_operatorCoordinationStatus(OperatorCoordinationStatus(next, battery, disposition, reason, advisory))
    api.put_droneControlObservationNotice(notice)
  }

  def finalise(api: CoordinationOutcomePolicy_Operational_Api): Unit = { }
}
