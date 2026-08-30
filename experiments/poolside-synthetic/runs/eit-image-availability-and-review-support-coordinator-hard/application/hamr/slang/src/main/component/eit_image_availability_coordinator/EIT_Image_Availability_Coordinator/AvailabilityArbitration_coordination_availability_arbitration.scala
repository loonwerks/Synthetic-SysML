// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityArbitration_coordination_availability_arbitration {

  def initialise(api: AvailabilityArbitration_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_decisionFrame(EIT_Image_Availability_Coordinator.DecisionFrame.example())
  }

  def timeTriggered(api: AvailabilityArbitration_Operational_Api): Unit = {
    // example api usage

    val apiUsage_recoveryFrame: Option[EIT_Image_Availability_Coordinator.RecoveryFrame] = api.get_recoveryFrame()
    api.logInfo(s"Received on data port recoveryFrame: ${apiUsage_recoveryFrame}")
    val apiUsage_admissionFrame: Option[EIT_Image_Availability_Coordinator.AdmissionFrame] = api.get_admissionFrame()
    api.logInfo(s"Received on data port admissionFrame: ${apiUsage_admissionFrame}")
    val apiUsage_artifactFrame: Option[EIT_Image_Availability_Coordinator.ArtifactFrame] = api.get_artifactFrame()
    api.logInfo(s"Received on data port artifactFrame: ${apiUsage_artifactFrame}")
    val apiUsage_presentationFrame: Option[EIT_Image_Availability_Coordinator.PresentationFrame] = api.get_presentationFrame()
    api.logInfo(s"Received on data port presentationFrame: ${apiUsage_presentationFrame}")
    val apiUsage_evidenceFrame: Option[EIT_Image_Availability_Coordinator.EvidenceFrame] = api.get_evidenceFrame()
    api.logInfo(s"Received on data port evidenceFrame: ${apiUsage_evidenceFrame}")
    val apiUsage_availabilityFrame: Option[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame] = api.get_availabilityFrame()
    api.logInfo(s"Received on data port availabilityFrame: ${apiUsage_availabilityFrame}")
    val apiUsage_reviewFrame: Option[EIT_Image_Availability_Coordinator.ReviewFrame] = api.get_reviewFrame()
    api.logInfo(s"Received on data port reviewFrame: ${apiUsage_reviewFrame}")
  }

  def finalise(api: AvailabilityArbitration_Operational_Api): Unit = { }
}
