// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_241c9d53427d_3_Valid {
  @pure def check(
      generation_resolution: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Resolution,
      publication_resolution: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Resolution,
      qualified_acquisition: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type,
      qualified_generation_result: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Generation_Result.Type,
      qualified_intent: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Intent.Type,
      in_image_state: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_State.Type,
      image_state: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_State.Type,
      in_recovery_phase: equiv_shared_0.EIT_Image_Availability_Coordinator.Recovery_Phase.Type,
      recovery_phase: equiv_shared_0.EIT_Image_Availability_Coordinator.Recovery_Phase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
