// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy {

  def initialise(api: CoordinationOutcomePolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
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
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_20_RECIPIENT_SPECIFIC_OUTCOMES
        //   Publish copied status fields | N.md#CASE_20
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
            api.operatorCoordinationStatus.nextSession == StatusSessionState.SUSPENDED)),
        // case CASE_20_DISPOSITION_REASON
        //   Publish copied disposition and reason fields | N.md#CASE_20
        (T) ___>: ((api.sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE ___>:
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
            api.operatorCoordinationStatus.reason == StatusCoordinationReason.RADIO_UNAVAILABLE)),
        // case CASE_20_ADVISORY_AND_NOTICE
        //   Apply advisory precedence and recipient notice | N.md#CASE_20
        (T) ___>: ((api.batteryAssessment == BatteryAssessment.UNAVAILABLE ___>:
          api.operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
          (api.batteryAssessment == BatteryAssessment.LOW ___>:
            api.operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW) &
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
    (api.get_batteryAssessment(), api.get_sessionSnapshot()) match {
      case (Some(b), Some(s)) =>
        val n: StatusSessionState.Type = s.nextSession match { case SnapshotNextSessionState.IDLE => StatusSessionState.IDLE case SnapshotNextSessionState.ACQUIRING => StatusSessionState.ACQUIRING case SnapshotNextSessionState.QUEUED => StatusSessionState.QUEUED case SnapshotNextSessionState.SENDING => StatusSessionState.SENDING case _ => StatusSessionState.SUSPENDED }
        val d: StatusCoordinationDisposition.Type = s.disposition match { case SnapshotCoordinationDisposition.NO_CHANGE => StatusCoordinationDisposition.NO_CHANGE case SnapshotCoordinationDisposition.STARTED => StatusCoordinationDisposition.STARTED case SnapshotCoordinationDisposition.CANCELLED => StatusCoordinationDisposition.CANCELLED case SnapshotCoordinationDisposition.PROGRESSED => StatusCoordinationDisposition.PROGRESSED case SnapshotCoordinationDisposition.COMPLETED => StatusCoordinationDisposition.COMPLETED case SnapshotCoordinationDisposition.RECOVERY_APPLIED => StatusCoordinationDisposition.RECOVERY_APPLIED case _ => StatusCoordinationDisposition.REJECTED }
        val r: StatusCoordinationReason.Type = s.reason match { case SnapshotCoordinationReason.NONE => StatusCoordinationReason.NONE case SnapshotCoordinationReason.CANCELLED => StatusCoordinationReason.CANCELLED case SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE => StatusCoordinationReason.EVIDENCE_UNAVAILABLE case SnapshotCoordinationReason.ENERGY_LOW => StatusCoordinationReason.ENERGY_LOW case SnapshotCoordinationReason.CONTEXT_INELIGIBLE => StatusCoordinationReason.CONTEXT_INELIGIBLE case SnapshotCoordinationReason.CAMERA_UNUSABLE => StatusCoordinationReason.CAMERA_UNUSABLE case _ => StatusCoordinationReason.RADIO_UNAVAILABLE }
        val a: OperatorAdvisory.Type = if (b == BatteryAssessment.UNAVAILABLE) OperatorAdvisory.EVIDENCE_UNAVAILABLE else if (b == BatteryAssessment.LOW) OperatorAdvisory.ENERGY_LOW else if (s.disposition == SnapshotCoordinationDisposition.REJECTED) OperatorAdvisory.REQUEST_REJECTED else if (s.disposition == SnapshotCoordinationDisposition.COMPLETED) OperatorAdvisory.DELIVERY_COMPLETED else OperatorAdvisory.NONE
        val notice: DroneControlObservationNotice.Type = if (s.disposition == SnapshotCoordinationDisposition.COMPLETED) DroneControlObservationNotice.DELIVERY_REPORTED else if (s.nextSession == SnapshotNextSessionState.ACQUIRING | s.nextSession == SnapshotNextSessionState.QUEUED | s.nextSession == SnapshotNextSessionState.SENDING) DroneControlObservationNotice.OBSERVATION_ACTIVE else if (s.nextSession == SnapshotNextSessionState.SUSPENDED | s.disposition == SnapshotCoordinationDisposition.REJECTED) DroneControlObservationNotice.OBSERVATION_BLOCKED else DroneControlObservationNotice.IDLE
        api.put_operatorCoordinationStatus(OperatorCoordinationStatus(n, b, d, r, a))
        api.put_droneControlObservationNotice(notice)
      case _ =>
        api.put_operatorCoordinationStatus(OperatorCoordinationStatus.example())
        api.put_droneControlObservationNotice(DroneControlObservationNotice.IDLE)
    }
  }

  def finalise(api: CoordinationOutcomePolicy_Operational_Api): Unit = { }
}
