// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fd00533b811b_2_Valid {
  @pure def check(
      cameracondition: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type,
      cameraevidence: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type,
      captureresult: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_GumboX.compute_CEP_Post(cameracondition, captureresult, cameraevidence))) & T))
  }
}
