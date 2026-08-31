// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter {

  def initialise(api: ObservationIntentArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
  }

  def timeTriggered(api: ObservationIntentArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_16_CANCEL_PRIORITY
        //   Cancellation has highest precedence | N.md#CASE_16
        (api.observationIntent == ObservationIntent.CANCEL_OBSERVATION) ___>: (api.sessionDecision == SessionDecision.CANCEL_TO_IDLE),
        // case CASE_17_RECOVERY_OR_PROGRESS
        //   Recovery and progress precede a fresh start | N.md#CASE_17
        (api.observationIntent != ObservationIntent.CANCEL_OBSERVATION) ___>: ((api.sessionProposal == SessionProposal.RECOVER_EVIDENCE ___>:
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
        //   Fresh start is accepted, rejected, or held after precedence | N.md#CASE_18
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
    (api.get_observationIntent(), api.get_sessionProposal()) match {
      case (Some(ObservationIntent.CANCEL_OBSERVATION), _) => api.put_sessionDecision(SessionDecision.CANCEL_TO_IDLE)
      case (_, Some(SessionProposal.RECOVER_EVIDENCE)) => api.put_sessionDecision(SessionDecision.SUSPEND_EVIDENCE)
      case (_, Some(SessionProposal.RECOVER_ENERGY)) => api.put_sessionDecision(SessionDecision.SUSPEND_ENERGY)
      case (_, Some(SessionProposal.RECOVER_CONTEXT)) => api.put_sessionDecision(SessionDecision.SUSPEND_CONTEXT)
      case (_, Some(SessionProposal.RECOVER_CAMERA)) => api.put_sessionDecision(SessionDecision.SUSPEND_CAMERA)
      case (_, Some(SessionProposal.RECOVER_RADIO)) => api.put_sessionDecision(SessionDecision.SUSPEND_RADIO)
      case (_, Some(SessionProposal.CAPTURE_COMPLETE)) => api.put_sessionDecision(SessionDecision.QUEUE_CAPTURE)
      case (_, Some(SessionProposal.BEGIN_DELIVERY)) => api.put_sessionDecision(SessionDecision.BEGIN_TRANSMISSION)
      case (_, Some(SessionProposal.DELIVERY_COMPLETE)) => api.put_sessionDecision(SessionDecision.COMPLETE_TO_IDLE)
      case (_, Some(SessionProposal.DELIVERY_REJECTED)) => api.put_sessionDecision(SessionDecision.RETRY_QUEUE)
      case (Some(ObservationIntent.START_OBSERVATION), Some(SessionProposal.STARTABLE)) => api.put_sessionDecision(SessionDecision.BEGIN_ACQUISITION)
      case (Some(ObservationIntent.START_OBSERVATION), Some(SessionProposal.BLOCK_EVIDENCE)) => api.put_sessionDecision(SessionDecision.REJECT_EVIDENCE)
      case (Some(ObservationIntent.START_OBSERVATION), Some(SessionProposal.BLOCK_ENERGY)) => api.put_sessionDecision(SessionDecision.REJECT_ENERGY)
      case (Some(ObservationIntent.START_OBSERVATION), Some(SessionProposal.BLOCK_CONTEXT)) => api.put_sessionDecision(SessionDecision.REJECT_CONTEXT)
      case (Some(ObservationIntent.START_OBSERVATION), Some(SessionProposal.BLOCK_CAMERA)) => api.put_sessionDecision(SessionDecision.REJECT_CAMERA)
      case (Some(ObservationIntent.START_OBSERVATION), Some(SessionProposal.BLOCK_RADIO)) => api.put_sessionDecision(SessionDecision.REJECT_RADIO)
      case _ => api.put_sessionDecision(SessionDecision.NO_CHANGE)
    }
  }

  def finalise(api: ObservationIntentArbiter_Operational_Api): Unit = { }
}
