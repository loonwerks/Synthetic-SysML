// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter {

  def initialise(api: ObservationIntentArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_ARBITRATION: initialise to a safe default without reading inputs
        api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
      )
    )
    api.put_sessionDecision(Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
  }

  def timeTriggered(api: ObservationIntentArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_16_CANCEL_PRIORITY
        (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE) &
        // CASE_17_RECOVERY_OR_PROGRESS
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE) &
        // CASE_18_FRESH_START_REJECTION_OR_HOLD
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED &
          api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED &
          api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED &
          api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED &
          api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED &
          api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED &
          api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION &
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO)
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO) &
        (api.observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE &
          api.sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED &
          (api.observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.NO_REQUEST |
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD))
          ->:(api.sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE)
      )
    )

    val observationIntentOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type] = api.get_observationIntent()
    val sessionProposalOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type] = api.get_sessionProposal()

    val observationIntent: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type = observationIntentOpt.get
    val sessionProposal: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type = sessionProposalOpt.get

    val decision: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type =
      if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION) {
        Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE
      } else {
        sessionProposal match {
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE =>
            if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION
            } else {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
            }
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE =>
            if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE
            } else {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
            }
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY =>
            if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY
            } else {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
            }
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT =>
            if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT
            } else {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
            }
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA =>
            if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA
            } else {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
            }
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO =>
            if (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION) {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO
            } else {
              Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
            }
          case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD =>
            Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE
        }
      }

    api.put_sessionDecision(decision)
  }

  def finalise(api: ObservationIntentArbiter_Operational_Api): Unit = { }
}
