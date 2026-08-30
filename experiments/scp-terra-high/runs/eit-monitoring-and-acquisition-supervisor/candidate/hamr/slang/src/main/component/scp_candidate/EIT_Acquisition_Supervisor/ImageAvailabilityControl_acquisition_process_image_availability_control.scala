// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ImageAvailabilityControl_acquisition_process_image_availability_control {
  var imageMemory: EIT_Acquisition_Supervisor.ImageState.Type = EIT_Acquisition_Supervisor.ImageState.EMPTY

  def initialise(api: ImageAvailabilityControl_Initialization_Api): Unit = {
    Contract(Modifies(api, imageMemory))
    imageMemory = EIT_Acquisition_Supervisor.ImageState.EMPTY
    api.put_image_frame(EIT_Acquisition_Supervisor.ImageFrame(imageMemory, F))
  }

  def timeTriggered(api: ImageAvailabilityControl_Operational_Api): Unit = {
    Contract(Modifies(api, imageMemory))
    val request: EIT_Acquisition_Supervisor.RequestFactsRecord = api.get_request_facts().get
    val batch: EIT_Acquisition_Supervisor.BatchFacts.Type = api.get_batch_facts().get
    val result: EIT_Acquisition_Supervisor.ImageResultFacts.Type = api.get_image_result_facts().get
    val recovery: EIT_Acquisition_Supervisor.RecoveryFrame = api.get_recovery_frame().get
    if (recovery.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
      imageMemory = EIT_Acquisition_Supervisor.ImageState.RECOVERY
    } else if (imageMemory == EIT_Acquisition_Supervisor.ImageState.RECOVERY) {
      imageMemory = EIT_Acquisition_Supervisor.ImageState.EMPTY
    } else if (result == EIT_Acquisition_Supervisor.ImageResultFacts.AVAILABLE) {
      imageMemory = EIT_Acquisition_Supervisor.ImageState.AVAILABLE
    } else if (request.requestClass == EIT_Acquisition_Supervisor.RequestClass.IMAGE_ACK) {
      imageMemory = EIT_Acquisition_Supervisor.ImageState.EMPTY
    } else if (batch == EIT_Acquisition_Supervisor.BatchFacts.USABLE) {
      imageMemory = EIT_Acquisition_Supervisor.ImageState.AWAITING_IMAGE
    }
    api.put_image_frame(EIT_Acquisition_Supervisor.ImageFrame(imageMemory, imageMemory == EIT_Acquisition_Supervisor.ImageState.AWAITING_IMAGE))
  }

  def finalise(api: ImageAvailabilityControl_Operational_Api): Unit = { }
}
