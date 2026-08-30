// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter {

  def initialise(api: ObservationIntentArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
  }

  def timeTriggered(api: ObservationIntentArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val intent: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type = api.get_observationIntent().get
    val proposal: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type = api.get_sessionProposal().get
    var decision: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
    if (intent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE
    } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED) {
      decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE
    } else if (intent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
      if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE) {
        decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION
      } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE) {
        decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE
      } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY) {
        decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY
      } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT) {
        decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT
      } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA) {
        decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA
      } else if (proposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO) {
        decision = Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO
      }
    }
    api.put_sessionDecision(decision)
  }

  def finalise(api: ObservationIntentArbiter_Operational_Api): Unit = { }
}
