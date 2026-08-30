// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object FaultComposition_coordination_fault_composition {

  def initialise(api: FaultComposition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_faultSummary(EIT_Image_Availability_Coordinator.FaultSummary.example())
  }

  def timeTriggered(api: FaultComposition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_imageFacts: Option[EIT_Image_Availability_Coordinator.ImageFacts.Type] = api.get_imageFacts()
    api.logInfo(s"Received on data port imageFacts: ${apiUsage_imageFacts}")
    val apiUsage_reviewFacts: Option[EIT_Image_Availability_Coordinator.ReviewFacts.Type] = api.get_reviewFacts()
    api.logInfo(s"Received on data port reviewFacts: ${apiUsage_reviewFacts}")
    val apiUsage_contextFacts: Option[EIT_Image_Availability_Coordinator.ContextFacts.Type] = api.get_contextFacts()
    api.logInfo(s"Received on data port contextFacts: ${apiUsage_contextFacts}")
    val apiUsage_serviceFacts: Option[EIT_Image_Availability_Coordinator.ServiceFacts.Type] = api.get_serviceFacts()
    api.logInfo(s"Received on data port serviceFacts: ${apiUsage_serviceFacts}")
  }

  def finalise(api: FaultComposition_Operational_Api): Unit = { }
}
