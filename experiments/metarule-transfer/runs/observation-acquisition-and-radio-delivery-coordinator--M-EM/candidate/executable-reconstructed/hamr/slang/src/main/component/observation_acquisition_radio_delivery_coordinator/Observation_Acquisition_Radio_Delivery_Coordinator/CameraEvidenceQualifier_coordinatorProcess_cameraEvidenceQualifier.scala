// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier {

  def initialise(api: CameraEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: CameraEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07_CAMERA_UNAVAILABLE
        (api.cameraCondition == CameraCondition.UNAVAILABLE) ___>: (api.cameraEvidence == CameraEvidence.UNAVAILABLE),
        // case CASE_08_CAMERA_READY
        (api.cameraCondition == CameraCondition.READY &
          api.captureResult == CaptureResult.NONE) ___>: (api.cameraEvidence == CameraEvidence.READY),
        // case CASE_09_CAMERA_RESULT
        (api.cameraCondition == CameraCondition.READY &
          api.captureResult != CaptureResult.NONE) ___>: ((api.captureResult == CaptureResult.CAPTURED ___>:
          api.cameraEvidence == CameraEvidence.CAPTURED) &
          (api.captureResult == CaptureResult.FAILED ___>:
            api.cameraEvidence == CameraEvidence.FAILED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val condition = api.get_cameraCondition().get
    val result = api.get_captureResult().get
    if (condition == CameraCondition.UNAVAILABLE) {
      api.put_cameraEvidence(CameraEvidence.UNAVAILABLE)
    } else if (result == CaptureResult.CAPTURED) {
      api.put_cameraEvidence(CameraEvidence.CAPTURED)
    } else if (result == CaptureResult.FAILED) {
      api.put_cameraEvidence(CameraEvidence.FAILED)
    } else {
      api.put_cameraEvidence(CameraEvidence.READY)
    }
  }

  def finalise(api: CameraEvidenceQualifier_Operational_Api): Unit = { }
}
