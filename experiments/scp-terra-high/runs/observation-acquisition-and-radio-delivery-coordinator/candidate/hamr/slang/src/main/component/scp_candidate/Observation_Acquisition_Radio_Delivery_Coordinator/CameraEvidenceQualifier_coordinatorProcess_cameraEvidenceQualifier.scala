// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier {

  def initialise(api: CameraEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_cameraEvidence(Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
  }

  def timeTriggered(api: CameraEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    val condition: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type = api.get_cameraCondition().get
    val result: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type = api.get_captureResult().get
    var evidence: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY
    if (condition == Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.UNAVAILABLE) {
      evidence = Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE
    } else if (result == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.CAPTURED) {
      evidence = Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED
    } else if (result == Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.FAILED) {
      evidence = Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED
    }
    api.put_cameraEvidence(evidence)
  }

  def finalise(api: CameraEvidenceQualifier_Operational_Api): Unit = { }
}
