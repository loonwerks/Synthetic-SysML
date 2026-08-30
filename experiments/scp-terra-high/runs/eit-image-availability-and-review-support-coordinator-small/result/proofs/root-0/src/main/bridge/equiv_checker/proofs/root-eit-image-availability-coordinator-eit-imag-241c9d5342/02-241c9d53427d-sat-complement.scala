// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_241c9d53427d_2_Complement {
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
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Availability_Governor_image_availability_process_image_availability_governor_GumboX.compute_CEP_Post(in_image_state, in_recovery_phase, image_state, recovery_phase, qualified_acquisition, qualified_generation_result, qualified_intent, generation_resolution, publication_resolution))) & T)))
  }
}
