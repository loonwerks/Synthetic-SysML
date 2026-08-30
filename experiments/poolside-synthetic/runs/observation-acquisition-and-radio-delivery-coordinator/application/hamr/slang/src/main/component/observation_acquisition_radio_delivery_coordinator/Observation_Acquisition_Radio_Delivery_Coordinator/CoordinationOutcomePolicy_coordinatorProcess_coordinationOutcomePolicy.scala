// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy {

  def initialise(api: CoordinationOutcomePolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_COORDINATION_OUTCOMES: establish safe defaults without reading inputs
        api.operatorCoordinationStatus.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE &
        api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE &
        api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE &
        api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE &
        api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE &
        api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE
      )
    )

    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus(
      nextSession = Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE,
      batteryAssessment = Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE,
      disposition = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE,
      reason = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE,
      advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE))
    api.put_droneControlObservationNotice(Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE)
  }

  def timeTriggered(api: CoordinationOutcomePolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_20_RECIPIENT_SPECIFIC_OUTCOMES
        // operatorCoordinationStatus.batteryAssessment is batteryAssessment
        api.operatorCoordinationStatus.batteryAssessment == api.batteryAssessment &
        // sessionSnapshot.nextSession -> operatorCoordinationStatus.nextSession
        (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE)
          ->:(api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE) &
        (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING)
          ->:(api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.ACQUIRING) &
        (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED)
          ->:(api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.QUEUED) &
        (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING)
          ->:(api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SENDING) &
        (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED)
          ->:(api.operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SUSPENDED) &
        // sessionSnapshot.disposition -> operatorCoordinationStatus.disposition
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE)
          ->:(api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE) &
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED)
          ->:(api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.STARTED) &
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED)
          ->:(api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.CANCELLED) &
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED)
          ->:(api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.PROGRESSED) &
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED)
          ->:(api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.COMPLETED) &
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED)
          ->:(api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.RECOVERY_APPLIED) &
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED)
          ->:(api.operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.REJECTED) &
        // sessionSnapshot.reason -> operatorCoordinationStatus.reason
        (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE)
          ->:(api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE) &
        (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED)
          ->:(api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CANCELLED) &
        (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE)
          ->:(api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.EVIDENCE_UNAVAILABLE) &
        (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW)
          ->:(api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.ENERGY_LOW) &
        (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE)
          ->:(api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CONTEXT_INELIGIBLE) &
        (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE)
          ->:(api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CAMERA_UNUSABLE) &
        (api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE)
          ->:(api.operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.RADIO_UNAVAILABLE) &
        // advisory: UNAVAILABLE -> EVIDENCE_UNAVAILABLE
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
        // advisory: LOW -> ENERGY_LOW
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW) &
        // advisory: ADEQUATE & disposition RECOVERY_APPLIED & reason EVIDENCE_UNAVAILABLE -> EVIDENCE_UNAVAILABLE
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
          api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
        // advisory: ADEQUATE & disposition RECOVERY_APPLIED & reason ENERGY_LOW -> ENERGY_LOW
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
          api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW) &
        // advisory: ADEQUATE & disposition RECOVERY_APPLIED & reason CONTEXT_INELIGIBLE -> CONTEXT_INELIGIBLE
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
          api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CONTEXT_INELIGIBLE) &
        // advisory: ADEQUATE & disposition RECOVERY_APPLIED & reason CAMERA_UNUSABLE -> CAMERA_UNUSABLE
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
          api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CAMERA_UNUSABLE) &
        // advisory: ADEQUATE & disposition RECOVERY_APPLIED & reason RADIO_UNAVAILABLE -> RADIO_UNAVAILABLE
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED &
          api.sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.RADIO_UNAVAILABLE) &
        // advisory: ADEQUATE & disposition REJECTED -> REQUEST_REJECTED
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.REQUEST_REJECTED) &
        // advisory: ADEQUATE & disposition COMPLETED -> DELIVERY_COMPLETED
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.DELIVERY_COMPLETED) &
        // advisory: ADEQUATE & (recovery not applicable or not recovery) -> NONE
        (api.batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE &
          (api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED |
            (api.sessionSnapshot.reason != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE &
              api.sessionSnapshot.reason != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW &
              api.sessionSnapshot.reason != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE &
              api.sessionSnapshot.reason != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE &
              api.sessionSnapshot.reason != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE)) &
          api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED &
          api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED)
          ->:(api.operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.NONE) &
        // droneControlObservationNotice: COMPLETED -> DELIVERY_REPORTED
        (api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED)
          ->:(api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.DELIVERY_REPORTED) &
        // droneControlObservationNotice: not COMPLETED & nextSession in ACQUIRING/QUEUED/SENDING -> OBSERVATION_ACTIVE
        (api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
          (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING |
            api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED |
            api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING))
          ->:(api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_ACTIVE) &
        // droneControlObservationNotice: not COMPLETED & nextSession not ACQUIRING/QUEUED/SENDING & (nextSession SUSPENDED or disposition REJECTED) -> OBSERVATION_BLOCKED
        (api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
          api.sessionSnapshot.nextSession != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING &
          api.sessionSnapshot.nextSession != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED &
          api.sessionSnapshot.nextSession != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING &
          (api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED |
            api.sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED))
          ->:(api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_BLOCKED) &
        // droneControlObservationNotice: not COMPLETED & nextSession IDLE & disposition not REJECTED -> IDLE
        (api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED &
          api.sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE &
          api.sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED)
          ->:(api.droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE)
      )
    )

    val batteryAssessmentOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type] = api.get_batteryAssessment()
    val sessionSnapshotOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot] = api.get_sessionSnapshot()

    val batteryAssessment: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type = batteryAssessmentOpt.get
    val sessionSnapshot: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = sessionSnapshotOpt.get

    val nextSession: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type = sessionSnapshot.nextSession match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.ACQUIRING
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.QUEUED
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SENDING
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SUSPENDED
    }

    val disposition: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type = sessionSnapshot.disposition match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.STARTED
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.CANCELLED
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.PROGRESSED
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.COMPLETED
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.RECOVERY_APPLIED
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.REJECTED
    }

    val reason: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type = sessionSnapshot.reason match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CANCELLED
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.EVIDENCE_UNAVAILABLE
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.ENERGY_LOW
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CONTEXT_INELIGIBLE
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CAMERA_UNUSABLE
      case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE =>
        Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.RADIO_UNAVAILABLE
    }

    val advisory: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type =
      batteryAssessment match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE =>
          Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW =>
          Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE =>
          if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED) {
            sessionSnapshot.reason match {
              case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE =>
                Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE
              case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW =>
                Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW
              case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE =>
                Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CONTEXT_INELIGIBLE
              case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE =>
                Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CAMERA_UNUSABLE
              case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE =>
                Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.RADIO_UNAVAILABLE
              case _ =>
                Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.NONE
            }
          } else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) {
            Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.REQUEST_REJECTED
          } else if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) {
            Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.DELIVERY_COMPLETED
          } else {
            Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.NONE
          }
      }

    val droneNotice: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type =
      if (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) {
        Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.DELIVERY_REPORTED
      } else if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING |
        sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED |
        sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING) {
        Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_ACTIVE
      } else if (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED |
        sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) {
        Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_BLOCKED
      } else {
        Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE
      }

    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus(
      nextSession = nextSession,
      batteryAssessment = batteryAssessment,
      disposition = disposition,
      reason = reason,
      advisory = advisory))
    api.put_droneControlObservationNotice(droneNotice)
  }

  def finalise(api: CoordinationOutcomePolicy_Operational_Api): Unit = { }
}
