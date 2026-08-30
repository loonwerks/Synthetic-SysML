// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2cbc4eaa9336_2_Complement {
  @pure def check(
      generation_directive: equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Directive.Type,
      image_resolution: equiv_shared_0.EIT_Image_Availability_Coordinator.Image_Resolution,
      qualified_acquisition: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.Generation_Directive_Derivation_image_availability_process_generation_directive_derivation_GumboX.inititialize_IEP_Post(generation_directive))) & T)))
  }
}
