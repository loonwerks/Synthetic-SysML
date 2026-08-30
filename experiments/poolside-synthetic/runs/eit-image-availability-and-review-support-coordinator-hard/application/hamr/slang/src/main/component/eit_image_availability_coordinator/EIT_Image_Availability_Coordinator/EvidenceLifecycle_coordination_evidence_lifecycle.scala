// #Sireum

package eit_image_availability_coordinator.EIT_Image_Availability_Coordinator

import org.sireum._
import eit_image_availability_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object EvidenceLifecycle_coordination_evidence_lifecycle {

  def initialise(api: EvidenceLifecycle_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_evidenceFrame(EIT_Image_Availability_Coordinator.EvidenceFrame.example())
  }

  def timeTriggered(api: EvidenceLifecycle_Operational_Api): Unit = {
    // example api usage

    val apiUsage_imageFacts: Option[EIT_Image_Availability_Coordinator.ImageFacts.Type] = api.get_imageFacts()
    api.logInfo(s"Received on data port imageFacts: ${apiUsage_imageFacts}")
    val apiUsage_contextFacts: Option[EIT_Image_Availability_Coordinator.ContextFacts.Type] = api.get_contextFacts()
    api.logInfo(s"Received on data port contextFacts: ${apiUsage_contextFacts}")
    val apiUsage_recoveryFrame: Option[EIT_Image_Availability_Coordinator.RecoveryFrame] = api.get_recoveryFrame()
    api.logInfo(s"Received on data port recoveryFrame: ${apiUsage_recoveryFrame}")
  }

  def finalise(api: EvidenceLifecycle_Operational_Api): Unit = { }
}
