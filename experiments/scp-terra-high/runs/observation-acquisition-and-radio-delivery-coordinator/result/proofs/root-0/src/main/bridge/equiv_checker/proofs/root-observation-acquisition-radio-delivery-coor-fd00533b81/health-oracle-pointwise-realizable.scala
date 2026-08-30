// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_fd00533b811b_Oracle_Pointwise_Realizable {
  @pure def check(
      cameracondition: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type,
      captureresult: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_GumboX.compute_CEP_Post(cameracondition, captureresult, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_GumboX.compute_CEP_Post(cameracondition, captureresult, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_GumboX.compute_CEP_Post(cameracondition, captureresult, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED)) |
        (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_GumboX.compute_CEP_Post(cameracondition, captureresult, equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED)))))
  }
}
