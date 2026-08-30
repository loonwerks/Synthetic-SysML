// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ArtifactLifecycle_coordination_artifact_lifecycle {

  def initialise(api: ArtifactLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_artifactFrame(EIT_Image_Availability_Coordinator.ArtifactFrame.example())
  }

  def timeTriggered(api: ArtifactLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_imageFacts: Option[EIT_Image_Availability_Coordinator.ImageFacts.Type] = api.get_imageFacts()
    api.logInfo(s"Received on data port imageFacts: ${apiUsage_imageFacts}")
    val apiUsage_recoveryFrame: Option[EIT_Image_Availability_Coordinator.RecoveryFrame] = api.get_recoveryFrame()
    api.logInfo(s"Received on data port recoveryFrame: ${apiUsage_recoveryFrame}")
    val apiUsage_admissionFrame: Option[EIT_Image_Availability_Coordinator.AdmissionFrame] = api.get_admissionFrame()
    api.logInfo(s"Received on data port admissionFrame: ${apiUsage_admissionFrame}")
    val apiUsage_reviewFacts: Option[EIT_Image_Availability_Coordinator.ReviewFacts.Type] = api.get_reviewFacts()
    api.logInfo(s"Received on data port reviewFacts: ${apiUsage_reviewFacts}")
  }

  def finalise(api: ArtifactLifecycle_Operational_Api): Unit = { }
}
