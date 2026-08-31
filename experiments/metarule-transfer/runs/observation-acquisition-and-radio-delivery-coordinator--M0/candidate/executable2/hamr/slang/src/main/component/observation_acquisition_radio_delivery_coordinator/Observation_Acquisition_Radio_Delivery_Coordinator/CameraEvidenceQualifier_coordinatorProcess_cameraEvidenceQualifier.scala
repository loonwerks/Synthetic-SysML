// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier {

  def initialise(api: CameraEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: CameraEvidenceQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cameraCondition: Option[Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type] = api.get_cameraCondition()
    api.logInfo(s"Received on data port cameraCondition: ${apiUsage_cameraCondition}")
    val apiUsage_captureResult: Option[Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type] = api.get_captureResult()
    api.logInfo(s"Received on data port captureResult: ${apiUsage_captureResult}")
  }

  def finalise(api: CameraEvidenceQualifier_Operational_Api): Unit = { }
}
