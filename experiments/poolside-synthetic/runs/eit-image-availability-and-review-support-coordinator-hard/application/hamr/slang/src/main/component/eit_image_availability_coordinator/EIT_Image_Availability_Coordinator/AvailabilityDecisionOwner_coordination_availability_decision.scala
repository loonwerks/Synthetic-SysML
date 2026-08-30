// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_coordination_availability_decision {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_availabilityFrame(EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame.example())
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_serviceFacts: Option[EIT_Image_Availability_Coordinator.ServiceFacts.Type] = api.get_serviceFacts()
    api.logInfo(s"Received on data port serviceFacts: ${apiUsage_serviceFacts}")
    val apiUsage_recoveryFrame: Option[EIT_Image_Availability_Coordinator.RecoveryFrame] = api.get_recoveryFrame()
    api.logInfo(s"Received on data port recoveryFrame: ${apiUsage_recoveryFrame}")
    val apiUsage_evidenceFrame: Option[EIT_Image_Availability_Coordinator.EvidenceFrame] = api.get_evidenceFrame()
    api.logInfo(s"Received on data port evidenceFrame: ${apiUsage_evidenceFrame}")
    val apiUsage_artifactFrame: Option[EIT_Image_Availability_Coordinator.ArtifactFrame] = api.get_artifactFrame()
    api.logInfo(s"Received on data port artifactFrame: ${apiUsage_artifactFrame}")
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
