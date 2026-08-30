// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy {

  def initialise(api: CoordinationOutcomePolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus.example())
    api.put_droneControlObservationNotice(Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE)
  }

  def timeTriggered(api: CoordinationOutcomePolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type = api.get_batteryAssessment().get
    val snapshot: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = api.get_sessionSnapshot().get
    var next: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE
    var disposition: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE
    var reason: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE
    if (snapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING) { next = Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.ACQUIRING }
    else if (snapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED) { next = Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.QUEUED }
    else if (snapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING) { next = Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SENDING }
    else if (snapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED) { next = Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SUSPENDED }
    if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED) { disposition = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.STARTED }
    else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED) { disposition = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.CANCELLED }
    else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED) { disposition = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.PROGRESSED }
    else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) { disposition = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.COMPLETED }
    else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED) { disposition = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.RECOVERY_APPLIED }
    else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) { disposition = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.REJECTED }
    if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED) { reason = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CANCELLED }
    else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) { reason = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.EVIDENCE_UNAVAILABLE }
    else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW) { reason = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.ENERGY_LOW }
    else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE) { reason = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CONTEXT_INELIGIBLE }
    else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE) { reason = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CAMERA_UNUSABLE }
    else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE) { reason = Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.RADIO_UNAVAILABLE }
    var advisory: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.NONE
    if (assessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE }
    else if (assessment == Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW }
    else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED) {
      if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE }
      else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW }
      else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CONTEXT_INELIGIBLE }
      else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CAMERA_UNUSABLE }
      else if (snapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.RADIO_UNAVAILABLE }
    } else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.REQUEST_REJECTED }
    else if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) { advisory = Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.DELIVERY_COMPLETED }
    var notice: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE
    if (snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED) { notice = Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.DELIVERY_REPORTED }
    else if (next == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.ACQUIRING ||
      next == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.QUEUED ||
      next == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SENDING) { notice = Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_ACTIVE }
    else if (next == Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SUSPENDED ||
      snapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED) { notice = Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_BLOCKED }
    api.put_operatorCoordinationStatus(Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus(
      nextSession = next, batteryAssessment = assessment, disposition = disposition, reason = reason, advisory = advisory))
    api.put_droneControlObservationNotice(notice)
  }

  def finalise(api: CoordinationOutcomePolicy_Operational_Api): Unit = { }
}
