// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Doctor_Publication_image_availability_process_doctor_publication {

  def initialise(api: Doctor_Publication_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_image_delivery(EIT_Image_Availability_Coordinator.Image_Delivery.Withheld)
    api.put_availability_status(EIT_Image_Availability_Coordinator.Availability_Status.NoImageAvailable)
  }

  def timeTriggered(api: Doctor_Publication_Operational_Api): Unit = {
    // example api usage

    val apiUsage_image_resolution: Option[EIT_Image_Availability_Coordinator.Image_Resolution] = api.get_image_resolution()
    api.logInfo(s"Received on data port image_resolution: ${apiUsage_image_resolution}")
  }

  def finalise(api: Doctor_Publication_Operational_Api): Unit = { }
}
