// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier {

  def initialise(api: CameraEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
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
        (api.cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.UNAVAILABLE) ___>: (api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE),
        // case CASE_08_CAMERA_READY
        (api.cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.READY &
          api.captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.NONE) ___>: (api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY),
        // case CASE_09_CAMERA_RESULT
        (api.cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.READY &
          api.captureResult != Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.NONE) ___>: ((api.captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.CAPTURED ___>:
          api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED) &
          (api.captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.FAILED ___>:
            api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val cameraCondition = api.get_cameraCondition().get
    val captureResult = api.get_captureResult().get
    if (cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.UNAVAILABLE) {
      api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
    } else if (captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.CAPTURED) {
      api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED)
    } else if (captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.FAILED) {
      api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED)
    } else {
      api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY)
    }
  }

  def finalise(api: CameraEvidenceQualifier_Operational_Api): Unit = { }
}
