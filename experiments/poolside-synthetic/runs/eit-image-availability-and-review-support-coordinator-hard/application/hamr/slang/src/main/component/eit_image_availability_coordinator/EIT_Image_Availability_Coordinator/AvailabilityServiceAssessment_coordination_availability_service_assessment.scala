// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityServiceAssessment_coordination_availability_service_assessment {

  def initialise(api: AvailabilityServiceAssessment_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_serviceFacts(EIT_Image_Availability_Coordinator.ServiceFacts.READY)
  }

  def timeTriggered(api: AvailabilityServiceAssessment_Operational_Api): Unit = {
    // example api usage

    val apiUsage_availabilityService: Option[EIT_Image_Availability_Coordinator.ServiceObservation.Type] = api.get_availabilityService()
    api.logInfo(s"Received on data port availabilityService: ${apiUsage_availabilityService}")
  }

  def finalise(api: AvailabilityServiceAssessment_Operational_Api): Unit = { }
}
