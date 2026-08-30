// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ImageEventQualification_coordination_image_event_qualification {

  def initialise(api: ImageEventQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_imageFacts(EIT_Image_Availability_Coordinator.ImageFacts.NO_IMAGE)
  }

  def timeTriggered(api: ImageEventQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val imageSignal: EIT_Image_Availability_Coordinator.ImageSignal.Type =
      api.get_imageSignal().getOrElse(EIT_Image_Availability_Coordinator.ImageSignal.NONE)

    var imageFacts: EIT_Image_Availability_Coordinator.ImageFacts.Type = EIT_Image_Availability_Coordinator.ImageFacts.NO_IMAGE

    if (imageSignal == EIT_Image_Availability_Coordinator.ImageSignal.NONE) {
      imageFacts = EIT_Image_Availability_Coordinator.ImageFacts.NO_IMAGE
    } else if (imageSignal == EIT_Image_Availability_Coordinator.ImageSignal.GENERATED) {
      imageFacts = EIT_Image_Availability_Coordinator.ImageFacts.NEW_IMAGE
    } else if (imageSignal == EIT_Image_Availability_Coordinator.ImageSignal.REVOKED) {
      imageFacts = EIT_Image_Availability_Coordinator.ImageFacts.WITHDRAWAL
    } else if (imageSignal == EIT_Image_Availability_Coordinator.ImageSignal.UPSTREAM_FAILURE) {
      imageFacts = EIT_Image_Availability_Coordinator.ImageFacts.REPORTED_FAILURE
    } else {
      imageFacts = EIT_Image_Availability_Coordinator.ImageFacts.INVALID
    }

    api.put_imageFacts(imageFacts)
  }

  def finalise(api: ImageEventQualification_Operational_Api): Unit = { }
}
