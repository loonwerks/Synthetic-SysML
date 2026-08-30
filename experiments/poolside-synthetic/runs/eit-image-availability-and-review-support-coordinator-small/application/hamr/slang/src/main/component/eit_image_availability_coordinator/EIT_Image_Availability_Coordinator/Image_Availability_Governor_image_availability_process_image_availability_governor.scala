// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Image_Availability_Governor_image_availability_process_image_availability_governor {

  def initialise(api: Image_Availability_Governor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_generation_resolution(EIT_Image_Availability_Coordinator.Image_Resolution.example())
    api.put_publication_resolution(EIT_Image_Availability_Coordinator.Image_Resolution.example())
  }

  def timeTriggered(api: Image_Availability_Governor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualified_acquisition: Option[EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type] = api.get_qualified_acquisition()
    api.logInfo(s"Received on data port qualified_acquisition: ${apiUsage_qualified_acquisition}")
    val apiUsage_qualified_intent: Option[EIT_Image_Availability_Coordinator.Qualified_Intent.Type] = api.get_qualified_intent()
    api.logInfo(s"Received on data port qualified_intent: ${apiUsage_qualified_intent}")
    val apiUsage_qualified_generation_result: Option[EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type] = api.get_qualified_generation_result()
    api.logInfo(s"Received on data port qualified_generation_result: ${apiUsage_qualified_generation_result}")
  }

  def finalise(api: Image_Availability_Governor_Operational_Api): Unit = { }
}
