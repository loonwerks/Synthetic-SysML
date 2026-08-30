// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_55d156d0bf42_2_Valid {
  @pure def check(
      generation_directive: equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Directive.Type,
      image_resolution: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Resolution,
      qualified_acquisition: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_GumboX.compute_CEP_Post(image_resolution, qualified_acquisition, generation_directive))) & T))
  }
}
