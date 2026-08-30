// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification {

  def initialise(api: Upstream_Acquisition_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_acquisition(EIT_Image_Availability_Coordinator.Qualified_Acquisition.InvalidAcquisition)
  }

  def timeTriggered(api: Upstream_Acquisition_Qualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_acquisition_sample: Option[EIT_Image_Availability_Coordinator.Acquisition_Sample] = api.get_acquisition_sample()
    api.logInfo(s"Received on data port acquisition_sample: ${apiUsage_acquisition_sample}")
  }

  def finalise(api: Upstream_Acquisition_Qualification_Operational_Api): Unit = { }
}
