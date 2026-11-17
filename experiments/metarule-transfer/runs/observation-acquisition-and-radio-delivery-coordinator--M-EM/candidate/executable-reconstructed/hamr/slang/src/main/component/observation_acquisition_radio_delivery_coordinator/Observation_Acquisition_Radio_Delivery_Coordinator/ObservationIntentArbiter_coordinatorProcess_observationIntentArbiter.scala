// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter {

  def initialise(api: ObservationIntentArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
  }

  def timeTriggered(api: ObservationIntentArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_16_CANCEL_PRIORITY
        (api.observationIntent == ObservationIntent.CANCEL_OBSERVATION) ___>: (api.sessionDecision == SessionDecision.CANCEL_TO_IDLE),
        // case CASE_17_RECOVERY_OR_PROGRESS
        (api.observationIntent != ObservationIntent.CANCEL_OBSERVATION &
          (api.sessionProposal == SessionProposal.RECOVER_EVIDENCE |
            api.sessionProposal == SessionProposal.RECOVER_ENERGY |
            api.sessionProposal == SessionProposal.RECOVER_CONTEXT |
            api.sessionProposal == SessionProposal.RECOVER_CAMERA |
            api.sessionProposal == SessionProposal.RECOVER_RADIO |
            api.sessionProposal == SessionProposal.CAPTURE_COMPLETE |
            api.sessionProposal == SessionProposal.BEGIN_DELIVERY |
            api.sessionProposal == SessionProposal.DELIVERY_COMPLETE |
            api.sessionProposal == SessionProposal.DELIVERY_REJECTED)) ___>: ((api.sessionProposal == SessionProposal.RECOVER_EVIDENCE ___>:
          api.sessionDecision == SessionDecision.SUSPEND_EVIDENCE) &
          (api.sessionProposal == SessionProposal.RECOVER_ENERGY ___>:
            api.sessionDecision == SessionDecision.SUSPEND_ENERGY) &
          (api.sessionProposal == SessionProposal.RECOVER_CONTEXT ___>:
            api.sessionDecision == SessionDecision.SUSPEND_CONTEXT) &
          (api.sessionProposal == SessionProposal.RECOVER_CAMERA ___>:
            api.sessionDecision == SessionDecision.SUSPEND_CAMERA) &
          (api.sessionProposal == SessionProposal.RECOVER_RADIO ___>:
            api.sessionDecision == SessionDecision.SUSPEND_RADIO) &
          (api.sessionProposal == SessionProposal.CAPTURE_COMPLETE ___>:
            api.sessionDecision == SessionDecision.QUEUE_CAPTURE) &
          (api.sessionProposal == SessionProposal.BEGIN_DELIVERY ___>:
            api.sessionDecision == SessionDecision.BEGIN_TRANSMISSION) &
          (api.sessionProposal == SessionProposal.DELIVERY_COMPLETE ___>:
            api.sessionDecision == SessionDecision.COMPLETE_TO_IDLE) &
          (api.sessionProposal == SessionProposal.DELIVERY_REJECTED ___>:
            api.sessionDecision == SessionDecision.RETRY_QUEUE)),
        // case CASE_18_FRESH_START_REJECTION_OR_HOLD
        (api.observationIntent != ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != SessionProposal.RECOVER_RADIO &
          api.sessionProposal != SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != SessionProposal.DELIVERY_REJECTED) ___>: ((api.observationIntent == ObservationIntent.START_OBSERVATION &
          api.sessionProposal == SessionProposal.STARTABLE ___>:
          api.sessionDecision == SessionDecision.BEGIN_ACQUISITION) &
          (api.observationIntent == ObservationIntent.START_OBSERVATION &
            api.sessionProposal == SessionProposal.BLOCK_EVIDENCE ___>:
            api.sessionDecision == SessionDecision.REJECT_EVIDENCE) &
          (api.observationIntent == ObservationIntent.START_OBSERVATION &
            api.sessionProposal == SessionProposal.BLOCK_ENERGY ___>:
            api.sessionDecision == SessionDecision.REJECT_ENERGY) &
          (api.observationIntent == ObservationIntent.START_OBSERVATION &
            api.sessionProposal == SessionProposal.BLOCK_CONTEXT ___>:
            api.sessionDecision == SessionDecision.REJECT_CONTEXT) &
          (api.observationIntent == ObservationIntent.START_OBSERVATION &
            api.sessionProposal == SessionProposal.BLOCK_CAMERA ___>:
            api.sessionDecision == SessionDecision.REJECT_CAMERA) &
          (api.observationIntent == ObservationIntent.START_OBSERVATION &
            api.sessionProposal == SessionProposal.BLOCK_RADIO ___>:
            api.sessionDecision == SessionDecision.REJECT_RADIO) &
          (api.observationIntent == ObservationIntent.NO_REQUEST |
            api.sessionProposal == SessionProposal.HOLD ___>:
            api.sessionDecision == SessionDecision.NO_CHANGE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_observationIntent().get
    val proposal = api.get_sessionProposal().get
    val decision: SessionDecision.Type =
      if (intent == ObservationIntent.CANCEL_OBSERVATION) SessionDecision.CANCEL_TO_IDLE
      else if (proposal == SessionProposal.RECOVER_EVIDENCE) SessionDecision.SUSPEND_EVIDENCE
      else if (proposal == SessionProposal.RECOVER_ENERGY) SessionDecision.SUSPEND_ENERGY
      else if (proposal == SessionProposal.RECOVER_CONTEXT) SessionDecision.SUSPEND_CONTEXT
      else if (proposal == SessionProposal.RECOVER_CAMERA) SessionDecision.SUSPEND_CAMERA
      else if (proposal == SessionProposal.RECOVER_RADIO) SessionDecision.SUSPEND_RADIO
      else if (proposal == SessionProposal.CAPTURE_COMPLETE) SessionDecision.QUEUE_CAPTURE
      else if (proposal == SessionProposal.BEGIN_DELIVERY) SessionDecision.BEGIN_TRANSMISSION
      else if (proposal == SessionProposal.DELIVERY_COMPLETE) SessionDecision.COMPLETE_TO_IDLE
      else if (proposal == SessionProposal.DELIVERY_REJECTED) SessionDecision.RETRY_QUEUE
      else if (intent == ObservationIntent.START_OBSERVATION & proposal == SessionProposal.STARTABLE) SessionDecision.BEGIN_ACQUISITION
      else if (intent == ObservationIntent.START_OBSERVATION & proposal == SessionProposal.BLOCK_EVIDENCE) SessionDecision.REJECT_EVIDENCE
      else if (intent == ObservationIntent.START_OBSERVATION & proposal == SessionProposal.BLOCK_ENERGY) SessionDecision.REJECT_ENERGY
      else if (intent == ObservationIntent.START_OBSERVATION & proposal == SessionProposal.BLOCK_CONTEXT) SessionDecision.REJECT_CONTEXT
      else if (intent == ObservationIntent.START_OBSERVATION & proposal == SessionProposal.BLOCK_CAMERA) SessionDecision.REJECT_CAMERA
      else if (intent == ObservationIntent.START_OBSERVATION & proposal == SessionProposal.BLOCK_RADIO) SessionDecision.REJECT_RADIO
      else SessionDecision.NO_CHANGE
    api.put_sessionDecision(decision)
  }

  def finalise(api: ObservationIntentArbiter_Operational_Api): Unit = { }
}
