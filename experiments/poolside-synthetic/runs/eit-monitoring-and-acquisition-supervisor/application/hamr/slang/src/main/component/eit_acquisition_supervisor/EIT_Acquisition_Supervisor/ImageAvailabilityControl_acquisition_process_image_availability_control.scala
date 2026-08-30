// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ImageAvailabilityControl_acquisition_process_image_availability_control {

  var imageMemory: EIT_Acquisition_Supervisor.ImageState.Type = EIT_Acquisition_Supervisor.ImageState.EMPTY

  def initialise(api: ImageAvailabilityControl_Initialization_Api): Unit = {
    Contract(
      Modifies(imageMemory, api)
    )
    imageMemory = EIT_Acquisition_Supervisor.ImageState.EMPTY
    api.put_image_frame(
      EIT_Acquisition_Supervisor.ImageFrame(
        imageState = EIT_Acquisition_Supervisor.ImageState.EMPTY,
        generateProposal = F))
  }

  def timeTriggered(api: ImageAvailabilityControl_Operational_Api): Unit = {
    Contract(
      Modifies(imageMemory, api)
    )
    val recovery_frame: EIT_Acquisition_Supervisor.RecoveryFrame =
      api.get_recovery_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.RecoveryFrame) => v
        case _ => EIT_Acquisition_Supervisor.RecoveryFrame.example()
      }

    val request_facts: EIT_Acquisition_Supervisor.RequestFactsRecord =
      api.get_request_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.RequestFactsRecord) => v
        case _ => EIT_Acquisition_Supervisor.RequestFactsRecord.example()
      }

    val batch_facts: EIT_Acquisition_Supervisor.BatchFacts.Type =
      api.get_batch_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.BatchFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH
      }

    val image_result_facts: EIT_Acquisition_Supervisor.ImageResultFacts.Type =
      api.get_image_result_facts() match {
        case Some(v: EIT_Acquisition_Supervisor.ImageResultFacts.Type) => v
        case _ => EIT_Acquisition_Supervisor.ImageResultFacts.NO_RESULT
      }

    val recoveryGate: EIT_Acquisition_Supervisor.RecoveryGate.Type = recovery_frame.recoveryGate

    val (newImageMemory, generateProposal): (EIT_Acquisition_Supervisor.ImageState.Type, B) =
      if (recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
        (EIT_Acquisition_Supervisor.ImageState.RECOVERY, F)
      } else if (imageMemory == EIT_Acquisition_Supervisor.ImageState.RECOVERY) {
        (EIT_Acquisition_Supervisor.ImageState.EMPTY, F)
      } else if (image_result_facts == EIT_Acquisition_Supervisor.ImageResultFacts.AVAILABLE) {
        (EIT_Acquisition_Supervisor.ImageState.AVAILABLE, F)
      } else if (request_facts.requestClass == EIT_Acquisition_Supervisor.RequestClass.IMAGE_ACK) {
        (EIT_Acquisition_Supervisor.ImageState.EMPTY, F)
      } else if (batch_facts == EIT_Acquisition_Supervisor.BatchFacts.USABLE) {
        (EIT_Acquisition_Supervisor.ImageState.AWAITING_IMAGE, T)
      } else {
        (imageMemory, imageMemory == EIT_Acquisition_Supervisor.ImageState.AWAITING_IMAGE)
      }

    imageMemory = newImageMemory

    api.put_image_frame(
      EIT_Acquisition_Supervisor.ImageFrame(
        imageState = newImageMemory,
        generateProposal = generateProposal))
  }

  def finalise(api: ImageAvailabilityControl_Operational_Api): Unit = { }
}
