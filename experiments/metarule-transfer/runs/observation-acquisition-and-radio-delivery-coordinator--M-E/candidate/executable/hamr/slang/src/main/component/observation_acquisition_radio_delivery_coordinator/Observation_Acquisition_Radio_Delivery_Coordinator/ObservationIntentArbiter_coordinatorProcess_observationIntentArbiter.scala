// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter {

  def initialise(api: ObservationIntentArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
  }

  def timeTriggered(api: ObservationIntentArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
      /*
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_16_CANCEL_PRIORITY
        (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION) ___>: (api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE),
        // case CASE_17_RECOVERY_OR_PROGRESS
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED)) ___>: ((api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE ___>:
          api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE) &
          (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE)),
        // case CASE_18_FRESH_START_REJECTION_OR_HOLD
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED) ___>: ((api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE ___>:
          api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION) &
          (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE) &
          (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY) &
          (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT) &
          (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA) &
          (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO) &
          (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.NO_REQUEST |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD ___>:
            api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE))
        // END COMPUTE ENSURES timeTriggered
      */
    )
    val observationIntent = api.get_observationIntent().get
    val sessionProposal = api.get_sessionProposal().get
    if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE)
    } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED) {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE)
    } else if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
      if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE) {
        api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION)
      } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE) {
        api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE)
      } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY) {
        api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY)
      } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT) {
        api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT)
      } else if (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA) {
        api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA)
      } else {
        api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO)
      }
    } else {
      api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
    }
  }

  def finalise(api: ObservationIntentArbiter_Operational_Api): Unit = { }
}
