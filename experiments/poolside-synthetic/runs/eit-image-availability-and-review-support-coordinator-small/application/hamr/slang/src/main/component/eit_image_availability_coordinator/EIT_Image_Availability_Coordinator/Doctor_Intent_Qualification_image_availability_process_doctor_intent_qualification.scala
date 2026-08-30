// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Doctor_Intent_Qualification_image_availability_process_doctor_intent_qualification {

  def initialise(api: Doctor_Intent_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_intent(EIT_Image_Availability_Coordinator.Qualified_Intent.InvalidIntent)
  }

  def timeTriggered(api: Doctor_Intent_Qualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_review_intent_sample: Option[EIT_Image_Availability_Coordinator.Review_Intent_Sample] = api.get_review_intent_sample()
    api.logInfo(s"Received on data port review_intent_sample: ${apiUsage_review_intent_sample}")
  }

  def finalise(api: Doctor_Intent_Qualification_Operational_Api): Unit = { }
}
