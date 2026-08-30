// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1091d659b8f5_2_Valid {
  @pure def check(
      acquisition_sample: equiv_shared_0.EIT_Image_Availability_Coordinator.Acquisition_Sample,
      qualified_acquisition: equiv_shared_0.EIT_Image_Availability_Coordinator.Qualified_Acquisition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.EIT_Image_Availability_Coordinator.Upstream_Acquisition_Qualification_image_availability_process_upstream_acquisition_qualification_GumboX.compute_CEP_Post(acquisition_sample, qualified_acquisition))) & T))
  }
}
