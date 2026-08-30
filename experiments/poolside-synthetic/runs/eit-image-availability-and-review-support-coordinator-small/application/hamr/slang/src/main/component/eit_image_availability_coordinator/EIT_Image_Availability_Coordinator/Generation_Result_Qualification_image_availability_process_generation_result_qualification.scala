// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Generation_Result_Qualification_image_availability_process_generation_result_qualification {

  def initialise(api: Generation_Result_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_generation_result(EIT_Image_Availability_Coordinator.Qualified_Generation_Result.InvalidGenerationResult)
  }

  def timeTriggered(api: Generation_Result_Qualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_generation_result_sample: Option[EIT_Image_Availability_Coordinator.Generation_Result_Sample] = api.get_generation_result_sample()
    api.logInfo(s"Received on data port generation_result_sample: ${apiUsage_generation_result_sample}")
  }

  def finalise(api: Generation_Result_Qualification_Operational_Api): Unit = { }
}
