// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier {

  def initialise(api: CameraEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: CameraEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07_CAMERA_UNAVAILABLE
        //   Unavailable camera masks capture result | N.md#CASE_07
        (api.cameraCondition == CameraCondition.UNAVAILABLE) ___>: (api.cameraEvidence == CameraEvidence.UNAVAILABLE),
        // case CASE_08_CAMERA_READY
        //   Ready camera without a result is ready | N.md#CASE_08
        (api.cameraCondition == CameraCondition.READY &
          api.captureResult == CaptureResult.NONE) ___>: (api.cameraEvidence == CameraEvidence.READY),
        // case CASE_09_CAMERA_RESULT
        //   Ready camera preserves a current capture result | N.md#CASE_09
        (api.cameraCondition == CameraCondition.READY &
          api.captureResult != CaptureResult.NONE) ___>: ((api.captureResult == CaptureResult.CAPTURED ___>:
          api.cameraEvidence == CameraEvidence.CAPTURED) &
          (api.captureResult == CaptureResult.FAILED ___>:
            api.cameraEvidence == CameraEvidence.FAILED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_cameraCondition(), api.get_captureResult()) match {
      case (Some(CameraCondition.UNAVAILABLE), _) => api.put_cameraEvidence(CameraEvidence.UNAVAILABLE)
      case (Some(CameraCondition.READY), Some(CaptureResult.CAPTURED)) => api.put_cameraEvidence(CameraEvidence.CAPTURED)
      case (Some(CameraCondition.READY), Some(CaptureResult.FAILED)) => api.put_cameraEvidence(CameraEvidence.FAILED)
      case (Some(CameraCondition.READY), _) => api.put_cameraEvidence(CameraEvidence.READY)
      case _ => api.put_cameraEvidence(CameraEvidence.UNAVAILABLE)
    }
  }

  def finalise(api: CameraEvidenceQualifier_Operational_Api): Unit = { }
}
