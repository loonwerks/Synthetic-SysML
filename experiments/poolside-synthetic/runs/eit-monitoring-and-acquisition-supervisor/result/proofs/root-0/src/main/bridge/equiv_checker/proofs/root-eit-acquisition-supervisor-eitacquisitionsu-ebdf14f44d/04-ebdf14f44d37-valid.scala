// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ebdf14f44d37_4_Valid {
  @pure def check(
      batch_facts: equiv_shared_0.EIT_Acquisition_Supervisor.BatchFacts.Type,
      image_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFrame,
      image_result_facts: equiv_shared_0.EIT_Acquisition_Supervisor.ImageResultFacts.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord,
      in_imagememory: equiv_shared_0.EIT_Acquisition_Supervisor.ImageState.Type,
      imagememory: equiv_shared_0.EIT_Acquisition_Supervisor.ImageState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_GumboX.compute_CEP_Post(in_imagememory, imagememory, batch_facts, image_result_facts, recovery_frame, request_facts, image_frame))) ___>: (T)) & T))
  }
}
