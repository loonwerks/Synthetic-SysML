// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier {

  def initialise(api: CameraEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INIT_CAMERA_EVIDENCE: initialise to a safe default (UNAVAILABLE)
        // without reading input ports; full evidence is computed in timeTriggered
        api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE
      )
    )
    api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: CameraEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_07_CAMERA_UNAVAILABLE
        (api.cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.UNAVAILABLE)
          ->:(api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE) &
        // CASE_08_CAMERA_READY
        (api.cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.READY &
          api.captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.NONE)
          ->:(api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY) &
        // CASE_09_CAMERA_RESULT
        (api.cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.READY &
          api.captureResult != Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.NONE)
          ->:(
            (api.captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.CAPTURED)
              ->:(api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED) &
            (api.captureResult == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.FAILED)
              ->:(api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED)
          )
      )
    )

    val cameraConditionOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type] = api.get_cameraCondition()
    val captureResultOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type] = api.get_captureResult()

    cameraConditionOpt.get match {
      case Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.UNAVAILABLE =>
        api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
      case Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.READY =>
        captureResultOpt.get match {
          case Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.NONE =>
            api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY)
          case Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.CAPTURED =>
            api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED)
          case Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.FAILED =>
            api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED)
        }
    }
  }

  def finalise(api: CameraEvidenceQualifier_Operational_Api): Unit = { }
}
