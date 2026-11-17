// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy {

  def initialise(api: CoordinationOutcomePolicy_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus.example())
    api.put_droneControlObservationNotice(Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE)
  }

  def timeTriggered(api: CoordinationOutcomePolicy_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_RECIPIENT_SPECIFIC_OUTCOMES
        //   Copy the selected outcome and apply advisory precedence
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
    // example api usage

    val apiUsage_batteryAssessment: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type] = api.get_batteryAssessment()
    api.logInfo(s"Received on data port batteryAssessment: ${apiUsage_batteryAssessment}")
    val apiUsage_sessionSnapshot: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot] = api.get_sessionSnapshot()
    api.logInfo(s"Received on data port sessionSnapshot: ${apiUsage_sessionSnapshot}")
  }

  def finalise(api: CoordinationOutcomePolicy_Operational_Api): Unit = { }
}
