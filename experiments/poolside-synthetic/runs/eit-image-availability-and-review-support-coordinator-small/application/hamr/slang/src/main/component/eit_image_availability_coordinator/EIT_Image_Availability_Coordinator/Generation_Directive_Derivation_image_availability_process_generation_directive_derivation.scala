// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Generation_Directive_Derivation_image_availability_process_generation_directive_derivation {

  def initialise(api: Generation_Directive_Derivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_generation_directive(EIT_Image_Availability_Coordinator.Generation_Directive.HoldGeneration)
  }

  def timeTriggered(api: Generation_Directive_Derivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_image_resolution: Option[EIT_Image_Availability_Coordinator.Image_Resolution] = api.get_image_resolution()
    api.logInfo(s"Received on data port image_resolution: ${apiUsage_image_resolution}")
    val apiUsage_qualified_acquisition: Option[EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type] = api.get_qualified_acquisition()
    api.logInfo(s"Received on data port qualified_acquisition: ${apiUsage_qualified_acquisition}")
  }

  def finalise(api: Generation_Directive_Derivation_Operational_Api): Unit = { }
}
