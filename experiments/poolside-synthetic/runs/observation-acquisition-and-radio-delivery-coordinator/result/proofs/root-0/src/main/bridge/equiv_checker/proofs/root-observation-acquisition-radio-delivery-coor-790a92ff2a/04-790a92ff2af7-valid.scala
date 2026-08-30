// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_790a92ff2af7_4_Valid {
  @pure def check(
      cameracondition: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type,
      cameraevidence: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type,
      captureresult: equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_GumboX.inititialize_IEP_Post(cameracondition, captureresult, cameraevidence))) ___>: (T)) & T))
  }
}
