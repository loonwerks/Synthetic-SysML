// #Sireum

package scp_candidate.EIT_Image_Availability_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification {

  def initialise(api: Doctor_Intent_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_qualified_intent(EIT_Image_Availability_Coordinator.Qualified_Intent.InvalidIntent)
  }

  def timeTriggered(api: Doctor_Intent_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val Some(value) = api.get_review_intent_sample()
    val qualified: EIT_Image_Availability_Coordinator.Qualified_Intent.Type =
      if (value.status == EIT_Image_Availability_Coordinator.Input_Status.Invalid) {
        EIT_Image_Availability_Coordinator.Qualified_Intent.InvalidIntent
      } else if (value.intent == EIT_Image_Availability_Coordinator.Review_Intent.NoIntent) {
        EIT_Image_Availability_Coordinator.Qualified_Intent.NeutralIntent
      } else if (value.intent == EIT_Image_Availability_Coordinator.Review_Intent.RequestImage) {
        EIT_Image_Availability_Coordinator.Qualified_Intent.FreshImageRequest
      } else {
        EIT_Image_Availability_Coordinator.Qualified_Intent.ReleaseIntent
      }
    api.put_qualified_intent(qualified)
  }

  def finalise(api: Doctor_Intent_Qualification_Operational_Api): Unit = { }
}
