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
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07_CAMERA_UNAVAILABLE
        //   Unavailable camera takes precedence
        (api.cameraCondition == CameraCondition.UNAVAILABLE) ___>: (api.cameraEvidence == CameraEvidence.UNAVAILABLE),
        // case CASE_08_CAMERA_READY
        //   Ready camera without a result is ready
        (api.cameraCondition == CameraCondition.READY &
          api.captureResult == CaptureResult.NONE) ___>: (api.cameraEvidence == CameraEvidence.READY),
        // case CASE_09_CAMERA_RESULT
        //   Ready camera reports its current result
        (api.cameraCondition == CameraCondition.READY &
          api.captureResult != CaptureResult.NONE) ___>: ((api.captureResult == CaptureResult.CAPTURED ___>:
          api.cameraEvidence == CameraEvidence.CAPTURED) &
          (api.captureResult == CaptureResult.FAILED ___>:
            api.cameraEvidence == CameraEvidence.FAILED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val condition = api.get_cameraCondition()
    val result = api.get_captureResult()
    if (condition == Some(CameraCondition.UNAVAILABLE)) {
      api.put_cameraEvidence(CameraEvidence.UNAVAILABLE)
    } else if (result == Some(CaptureResult.CAPTURED)) {
      api.put_cameraEvidence(CameraEvidence.CAPTURED)
    } else if (result == Some(CaptureResult.FAILED)) {
      api.put_cameraEvidence(CameraEvidence.FAILED)
    } else {
      api.put_cameraEvidence(CameraEvidence.READY)
    }
  }

  def finalise(api: CameraEvidenceQualifier_Operational_Api): Unit = { }
}
